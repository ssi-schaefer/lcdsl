package com.wamas.ide.launching.ui.build;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;
import org.eclipse.osgi.service.resolver.State;
import org.eclipse.osgi.service.resolver.StateDelta;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.ModelEntry;
import org.eclipse.pde.internal.core.IPluginModelListener;
import org.eclipse.pde.internal.core.IStateDeltaListener;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.PluginModelDelta;
import org.eclipse.pde.internal.core.PluginModelManager;
import org.eclipse.xtext.builder.impl.IQueuedBuildDataContribution;
import org.eclipse.xtext.builder.impl.IToBeBuiltComputerContribution;
import org.eclipse.xtext.builder.impl.ProjectOpenedOrClosedListener;
import org.eclipse.xtext.builder.impl.QueuedBuildData;
import org.eclipse.xtext.builder.impl.ToBeBuilt;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.resource.IResourceSetInitializer;
import org.eclipse.xtext.ui.resource.IStorage2UriMapperContribution;
import org.eclipse.xtext.ui.shared.contribution.IEagerContribution;
import org.eclipse.xtext.ui.shared.internal.Activator;
import org.eclipse.xtext.ui.shared.internal.EagerContributionInitializer;
import org.eclipse.xtext.ui.shared.internal.ListenerRegistrar;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.SortedMapDifference;
import com.google.common.util.concurrent.Futures;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Proper support for launch configurations from the target platform with the need to
 * make an explicit dependency on the contributing plug-in from the target
 * platform.
 */
@SuppressWarnings("restriction")
@Singleton
public class LcDslTargetPlatformSupport
        implements IStorage2UriMapperContribution, IResourceSetInitializer, IToBeBuiltComputerContribution,
        IQueuedBuildDataContribution, IPluginModelListener, IStateDeltaListener, IEagerContribution, IResourceChangeListener {

    private static final Logger logger = Logger.getLogger(LcDslTargetPlatformSupport.class);

    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
    /**
     * Asynchronously supplied, lexicographically sorted to be able to query for all URIs from a given bundle
     * by prefix.
     * The idea is to keep the contained URIs available in the Xtext index at all times.
     */
    private final CompletableFuture<SortedMap<URI, URI>> uriMap = new CompletableFuture<>();
    private Set<URI> uris = Collections.emptySet();

    /**
     * Scheduled URIs for the next build to come.
     */
    private Set<URI> pendingUpdated = new HashSet<>();
    private Set<URI> pendingUpdatedCheckpoint;

    private static TreeMap<URI, URI> createSortedUriMap() {
        return new TreeMap<>(Comparator.comparing(Object::toString));
    }

    @Inject
    private QueuedBuildData queuedBuildData;

    @Inject
    private IWorkspace workspace;

    /*
     * Since the ProjectOpenedOrCLosedListener is not really accessible and also very much tailored
     * towards workspaces that do have the autobuild enabled, we open it up to use via reflection.
     */
    private final ReflectExtensions reflector = new ReflectExtensions();

    private final Supplier<ProjectOpenedOrClosedListener> projectOpenedOrClosedListener = Suppliers.memoize(() -> {
        try {
            // Reflection madness
            Activator activator = Activator.getDefault();
            ReflectExtensions reflector = new ReflectExtensions();
            EagerContributionInitializer initializer = reflector.get(activator, "initializer");
            ImmutableList<? extends IEagerContribution> contributions = reflector.get(initializer, "contributions");
            for (IEagerContribution contribution : contributions) {
                if (contribution instanceof ListenerRegistrar) {
                    return reflector.get(contribution, "listener");
                }
            }
        } catch (ReflectiveOperationException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    });

    private final Supplier<BiConsumer<String, ToBeBuilt>> anyBuildScheduler = Suppliers.memoize(() -> {
        ProjectOpenedOrClosedListener listener = projectOpenedOrClosedListener.get();
        if (listener != null) {
            return (projectName, toBeBuilt) -> {
                try {
                    reflector.invoke(listener, "scheduleJob", "target:" + projectName, toBeBuilt);
                } catch (ReflectiveOperationException e) {
                    logger.error(e.getMessage(), e);
                }
            };
        }
        return (any, ignore) -> {
        };
    });

    private final Supplier<Consumer<IProject>> removeProjectScheduler = Suppliers.memoize(() -> {
        ProjectOpenedOrClosedListener listener = projectOpenedOrClosedListener.get();
        if (listener != null) {
            return (project) -> {
                try {
                    reflector.invoke(listener, "scheduleRemoveProjectJob", project);
                } catch (ReflectiveOperationException e) {
                    logger.error(e.getMessage(), e);
                }
            };
        }
        return (any) -> {
        };
    });

    private final Supplier<Consumer<IResourceChangeEvent>> scheduleBuildIfNecessary = Suppliers.memoize(() -> {
        ProjectOpenedOrClosedListener listener = projectOpenedOrClosedListener.get();
        if (listener != null) {
            return (event) -> {
                try {
                    @SuppressWarnings("unchecked")
                    Set<IProject> projects = (Set<IProject>) reflector.invoke(listener, "findNewProjectsToBuild", event);
                    reflector.invoke(listener, "scheduleBuildIfNecessary", projects);
                } catch (ReflectiveOperationException e) {
                    logger.error(e.getMessage(), e);
                }
            };
        }
        return (any) -> {
        };
    });

    @Override
    public void initializeCache() {
        PluginModelManager modelManager = PDECore.getDefault().getModelManager();
        CompletableFuture.supplyAsync(() -> {

            return Arrays.stream(modelManager.getExternalModels()).parallel().flatMap(LcDslTargetPlatformSupport::added)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, this::error,
                            LcDslTargetPlatformSupport::createSortedUriMap));

        }).whenComplete((map, throwable) -> {
            if (throwable == null) {
                // TODO consider storing the known URIs per bundle memento
                lock.writeLock().lock();
                try {
                    uris = new HashSet<>(map.keySet());
                    // Refine and only schedule URIs that differ
                    pendingUpdated.addAll(map.keySet());
                } finally {
                    lock.writeLock().unlock();
                }
                uriMap.complete(map);
            } else {
                this.uriMap.completeExceptionally(throwable);
            }
            modelManager.addPluginModelListener(this);
            modelManager.addStateDeltaListener(this);
        });
    }

    Set<URI> uris() {
        lock.readLock().lock();
        try {
            return uris;
        } finally {
            lock.readLock().unlock();
        }
    }

    private URI error(URI a, URI b) {
        throw new IllegalStateException("Unexpected duplicates");
    }

    private static Stream<? extends Entry<URI, URI>> added(IPluginModelBase modelEntry) {
        return added(modelEntry, false);
    }

    private static Stream<? extends Entry<URI, URI>> added(IPluginModelBase modelEntry, boolean force) {
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        String installLocation = modelEntry.getInstallLocation();
        if (installLocation != null) {
            String version = modelEntry.getBundleDescription().getVersion().toString();
            String bundleName = modelEntry.getBundleDescription().getSymbolicName();
            if (force || !root.getProject(bundleName).isAccessible()) {
                Path installFile = Path.of(installLocation);
                BasicFileAttributes installFileAttribute;
                try {
                    installFileAttribute = Files.readAttributes(installFile, BasicFileAttributes.class);
                } catch (IOException e) {
                    return Stream.empty();
                }
                List<Map.Entry<URI, URI>> mappings = new ArrayList<>();
                if (installFileAttribute.isDirectory()) {
                    try (Stream<Path> pathes = Files.walk(installFile)) {
                        pathes.forEach(path -> {
                            String fileName = String.valueOf(path.getFileName());
                            if (fileName.endsWith(".lc")) {
                                Path relative = installFile.relativize(path);
                                URI resolved = URI.createFileURI(path.toFile().getAbsolutePath());
                                URI target = URI.createURI("target:/" + bundleName + "/" + version, true);
                                for (Path segment : relative) {
                                    target = target.appendSegment(URI.encodeSegment(segment.toString(), true));
                                }
                                mappings.add(Map.entry(target, resolved));
                            }
                        });
                    } catch (IOException e) {
                        logger.error(e.getMessage(), e);
                    }
                } else {
                    try (ZipFile zip = new ZipFile(installFile.toFile())) {
                        URI archive = URI.createFileURI(installFile.toFile().getAbsolutePath());
                        Enumeration<? extends ZipEntry> enumeration = zip.entries();
                        while (enumeration.hasMoreElements()) {
                            ZipEntry entry = enumeration.nextElement();
                            String name = entry.getName();
                            if (name.endsWith(".lc")) {
                                URI resolved = URI.createURI("archive:" + archive + "!/" + name, true);
                                URI target = URI.createURI("target:/" + bundleName + "/" + version + "/" + name, true);
                                mappings.add(Map.entry(target, resolved));
                            }
                        }
                    } catch (IOException | UnsupportedOperationException e) {
                        logger.error(e.getMessage(), e);
                    }
                }
                return mappings.stream();
            }
        }
        return Stream.empty();
    }

    @Override
    public void initialize(ResourceSet resourceSet, IProject project) {
        ExtensibleURIConverterImpl uriConverter = (ExtensibleURIConverterImpl) resourceSet.getURIConverter();
        class Handler extends URIHandlerImpl {

            @Override
            public boolean canHandle(URI uri) {
                return getResolved(uri) != null;
            }

            @Override
            public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
                URI resolved = getResolved(uri);
                return uriConverter.createInputStream(resolved, options);
            }

            @Override
            public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException {
                return uriConverter.createOutputStream(getResolved(uri), options);
            }

            @Override
            public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
                return uriConverter.getAttributes(getResolved(uri), options);
            }

            @Override
            public Map<String, ?> contentDescription(URI uri, Map<?, ?> options) throws IOException {
                return uriConverter.contentDescription(getResolved(uri), options);
            }

            @Override
            public void delete(URI uri, Map<?, ?> options) throws IOException {
                uriConverter.delete(getResolved(uri), options);
            }

            @Override
            public void setAttributes(URI uri, Map<String, ?> attributes, Map<?, ?> options) throws IOException {
                uriConverter.setAttributes(getResolved(uri), attributes, options);
            }

            @Override
            public boolean exists(URI uri, Map<?, ?> options) {
                return getResolved(uri) != null;
            }

            private URI getResolved(URI uri) {
                SortedMap<URI, URI> map = Futures.getUnchecked(uriMap);
                lock.readLock().lock();
                try {
                    return map.get(uri);
                } finally {
                    lock.readLock().unlock();
                }
            }
        }
        uriConverter.getURIHandlers().add(0, new Handler());
    }

    @Override
    public void initialize() {
        workspace.addResourceChangeListener(this);
    }

    @Override
    public void discard() {
        workspace.removeResourceChangeListener(this);
    }

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        // Usually the removed projects / closed projects will be handled by the ProjectOpenedOrClosedListener
        // Unfortunately that one will not do anything if the AutoBuild is disabled.
        // This leads to missed events. Do the same as that listener does for closed projects iff the AutoBuild is disabled

        if (workspace != null && !workspace.isAutoBuilding()) {
            if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
                try {
                    scheduleBuildIfNecessary.get().accept(event);
                } catch (Exception e) {
                    logger.error(e.getMessage(), e);
                }
            } else if ((event.getType() == IResourceChangeEvent.PRE_CLOSE
                    || event.getType() == IResourceChangeEvent.PRE_DELETE)) {
                if (event.getResource() instanceof IProject && (XtextProjectHelper.hasNature((IProject) event.getResource())
                        || event.getResource().isAccessible() && event.getResource().isHidden())) {
                    removeProjectScheduler.get().accept((IProject) event.getResource());
                }
            }
        }
    }

    @Override
    public boolean isRejected(IFolder folder) {
        // nothing to do, we are only interested in TP bundles
        return false;
    }

    @Override
    public Iterable<Pair<IStorage, IProject>> getStorages(URI uri) {
        // generally speaking, the entire target platform is available to all projects,
        // so we announce them under a placeholder project
        // Since these storages are not associated with any real project, they'll be scheduled
        // for removal on each full build. We have to compensate for that in #updateProject
        SortedMap<URI, URI> map = Futures.getUnchecked(uriMap);
        lock.readLock().lock();
        try {
            URI resolved = map.get(uri);
            if (resolved != null) {
                UriBasedStorage storage = new UriBasedStorage(uri, resolved);
                IProject placeholder = ResourcesPlugin.getWorkspace().getRoot().getProject("__PLACEHOLDER__");
                return List.of(Tuples.create(storage, placeholder));
            }
            return Collections.emptyList();
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public URI getUri(IStorage storage) {
        if (storage instanceof UriBasedStorage) {
            return ((UriBasedStorage) storage).platform;
        }
        return null;
    }

    @Override
    public void modelsChanged(PluginModelDelta delta) {
        if (!uriMap.isDone()) {
            return;
        }
        SortedMap<URI, URI> map = Futures.getUnchecked(uriMap);
        lock.writeLock().lock();
        try {
            Set<String> defer = new HashSet<>();
            for (ModelEntry removed : delta.getRemovedEntries()) {
                removed(removed, map);
                defer.add(removed.getId());
            }
            boolean didAdd = false;
            for (ModelEntry changed : delta.getChangedEntries()) {
                if (changed.hasExternalModels()) {
                    IPluginModelBase model = changed.getModel();
                    if (Arrays.asList(changed.getWorkspaceModels()).contains(model)) {
                        removed(changed, map);
                    } else {
                        didAdd = true;
                        addNow(model, map);
                    }
                }
            }
            for (ModelEntry added : delta.getAddedEntries()) {
                if (added.hasExternalModels()) {
                    addNow(added.getModel(), map);
                    didAdd = true;
                } else {
                    defer.add(added.getId());
                    didAdd = true;
                }
            }
            if (didAdd) {
                touchAnyProject(defer);
            }
            uris = new HashSet<>(map.keySet());
        } finally {
            lock.writeLock().unlock();
        }
    }

    private void addNow(IPluginModelBase model, SortedMap<URI, URI> map) {
        added(model, true).forEach(entry -> {
            map.put(entry.getKey(), entry.getValue());
            pendingUpdated.add(entry.getKey());
        });
    }

    private void removed(ModelEntry entry, SortedMap<URI, URI> map) {
        Map<URI, URI> uris = all(entry, map);
        if (!uris.isEmpty()) {
            ToBeBuilt toBeBuilt = new ToBeBuilt();
            toBeBuilt.getToBeDeleted().addAll(uris.keySet());
            pendingUpdated.removeAll(uris.keySet());
            anyBuildScheduler.get().accept(entry.getId(), toBeBuilt);
            uris.clear();
        }
    }

    private Map<URI, URI> all(ModelEntry entry, SortedMap<URI, URI> map) {
        IPluginModelBase model = entry.getModel();
        String id = entry.getId();
        URI low;
        if (model != null) {
            String version = model.getBundleDescription().getVersion().toString();
            low = URI.createURI("target:/" + id + "/" + version + "/", true);
        } else {
            low = URI.createURI("target:/" + id + "/", true);
        }

        URI high = low.trimSegments(1).appendSegment(String.valueOf(Character.MAX_VALUE));
        return map.subMap(low, high);
    }

    @Override
    public void removeProject(ToBeBuilt toBeBuilt, IProject project, IProgressMonitor monitor) {
        if (!uriMap.isDone()) {
            return;
        }
        // Looks like a clean build was triggered - assume that we want to rebuild the
        // configurations from the TP. Make sure that we still keep the URIs from the TP known
        // to the Xtext index.
        SortedMap<URI, URI> map = Futures.getUnchecked(uriMap);
        lock.writeLock().lock();
        try {
            pendingUpdated.addAll(map.keySet());
            toBeBuilt.getToBeDeleted().removeAll(map.keySet());
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public void updateProject(ToBeBuilt toBeBuilt, IProject project, IProgressMonitor monitor) throws CoreException {
        if (!uriMap.isDone()) {
            return;
        }
        // A full build was triggered for a project
        SortedMap<URI, URI> map = Futures.getUnchecked(uriMap);
        lock.writeLock().lock();
        try {
            // Make sure that we don't remove target:/ URIs automagically from the Xtext index
            // but only if they are no longer managed from here
            toBeBuilt.getToBeDeleted().removeAll(Sets.filter(map.keySet(), uri -> !project.getName().equals(uri.segment(1))));
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public boolean removeStorage(ToBeBuilt toBeBuilt, IStorage storage, IProgressMonitor monitor) {
        // nothing to do
        return false;
    }

    @Override
    public boolean updateStorage(ToBeBuilt toBeBuilt, IStorage storage, IProgressMonitor monitor) {
        // nothing to do
        return false;
    }

    @Override
    public boolean isPossiblyHandled(IStorage storage) {
        // nothing to do
        return false;
    }

    @Override
    public void stateResolved(StateDelta delta) {
        // nothing to do
    }

    @Override
    public void stateChanged(State newState) {
        if (!uriMap.isDone()) {
            return;
        }
        TreeMap<URI, URI> newContent = Arrays
                .stream(PDECore.getDefault().getModelManager().getExternalModelManager().getAllModels()).parallel()
                .flatMap(LcDslTargetPlatformSupport::added).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        this::error, LcDslTargetPlatformSupport::createSortedUriMap));
        SortedMap<URI, URI> map = Futures.getUnchecked(uriMap);
        lock.writeLock().lock();
        try {
            SortedMapDifference<URI, URI> difference = Maps.difference(map, newContent);
            if (!difference.entriesOnlyOnLeft().isEmpty()) {
                Map<String, ToBeBuilt> partitioned = new HashMap<>();
                difference.entriesOnlyOnLeft().keySet().forEach(uri -> {
                    pendingUpdated.remove(uri);
                    partitioned.computeIfAbsent(uri.segment(0), any -> new ToBeBuilt()).getToBeDeleted().add(uri);
                });
                partitioned.forEach(anyBuildScheduler.get());
            }

            pendingUpdated.addAll(difference.entriesDiffering().keySet());
            pendingUpdated.addAll(difference.entriesOnlyOnRight().keySet());
            map.clear();
            map.putAll(newContent);
            uris = new HashSet<>(map.keySet());
            if (!difference.areEqual()) {
                touchAnyProject(Set.of());
            }
        } finally {
            lock.writeLock().unlock();
        }
    }

    private void touchAnyProject(Set<String> butNot) {
        Job touchJob = Job.createSystem("Touch project after target platform change", new ICoreRunnable() {

            @Override
            public void run(IProgressMonitor monitor) throws CoreException {
                IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
                IProject candidate = null;
                for (IProject p : root.getProjects()) {
                    if (XtextProjectHelper.hasBuilder(p)) {
                        if (butNot.contains(p.getName())) {
                            if (candidate == null) {
                                candidate = p;
                            }
                        } else {
                            p.touch(monitor);
                            return;
                        }
                    }
                }
                if (candidate != null) {
                    candidate.touch(monitor);
                    return;
                }
            }
        });
        touchJob.setRule(ResourcesPlugin.getWorkspace().getRoot());
        touchJob.schedule(0);
    }

    @Override
    public void reset() {
        // nothing to do
    }

    @Override
    public void reset(IProject project) {
        // nothing to do
    }

    @Override
    public boolean queueChange(Delta delta) {
        // nothing to do
        return false;
    }

    @Override
    public boolean needsRebuild(IProject project, Collection<Delta> deltas) {
        // nothing to do
        return false;
    }

    @Override
    public void createCheckpoint() {
        lock.writeLock().lock();
        try {
            this.pendingUpdatedCheckpoint = new HashSet<>(pendingUpdated);
            queuedBuildData.queueURIs(pendingUpdated);
            this.pendingUpdated.clear();
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public void discardCheckpoint() {
        lock.writeLock().lock();
        try {
            this.pendingUpdatedCheckpoint = null;
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public void rollback() {
        lock.writeLock().lock();
        try {
            this.pendingUpdated = pendingUpdatedCheckpoint;
            this.pendingUpdatedCheckpoint = null;
        } finally {
            lock.writeLock().unlock();
        }
    }

}
