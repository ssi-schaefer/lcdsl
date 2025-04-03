/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.ui.resource.Storage2UriMapperJavaImpl;
import org.eclipse.xtext.ui.shared.contribution.ISharedStateContributionRegistry;
import org.eclipse.xtext.util.Pair;

import com.google.common.collect.FluentIterable;
import com.google.inject.Inject;

public class LcDslEditorOpener extends LanguageSpecificURIEditorOpener {

    private static final Logger logger = Logger.getLogger(LcDslEditorOpener.class);

    @Inject
    private IStorage2UriMapper mapper;

    @Inject
    private ISharedStateContributionRegistry jdtStorageAccess;

    @Inject(optional = true)
    private IWorkbench workbench;

    @Override
    public IEditorPart open(final URI uri, final EReference crossReference, final int indexInList, final boolean select) {
        Iterator<Pair<IStorage, IProject>> storages = storages(uri).iterator();
        if (storages != null && storages.hasNext()) {
            try {
                IStorage storage = storages.next().getFirst();
                IEditorInput editorInput = EditorUtils.createEditorInput(storage);
                IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
                final IEditorPart editor = IDE.openEditor(activePage, editorInput, getEditorId());
                selectAndReveal(editor, uri, crossReference, indexInList, select);
                return EditorUtils.getXtextEditor(editor);
            } catch (WrappedException e) {
                logger.error("Error while opening editor part for EMF URI '" + uri + "'", e.getCause());
            } catch (PartInitException partInitException) {
                logger.error("Error while opening editor part for EMF URI '" + uri + "'", partInitException);
            }
        }
        return null;
    }

    private Iterable<Pair<IStorage, IProject>> storages(final URI uri) {
        if ("target".equals(uri.scheme())) {
            URI platformURI = URI.createPlatformResourceURI(uri.segment(0), false);
            for (int i = 2; i < uri.segmentCount(); i++) {
                platformURI = platformURI.appendSegment(uri.segment(i));
            }
            FluentIterable<Pair<IStorage, IProject>> result = getJavaStorages(platformURI);
            return result.append(mapper.getStorages(uri.trimFragment()));
        }
        return mapper.getStorages(uri.trimFragment());
    }

    private FluentIterable<Pair<IStorage, IProject>> getJavaStorages(URI uri) {
        Storage2UriMapperJavaImpl jdtStorages = jdtStorageAccess.getSingleContributedInstance(Storage2UriMapperJavaImpl.class);
        return FluentIterable.from(jdtStorages.getStorages(uri));
    }
}
