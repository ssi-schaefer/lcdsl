/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.launchview;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.debug.ui.launchview.LaunchConfigurationViewPlugin;
import org.eclipse.debug.ui.launchview.services.ILaunchObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;

import com.wamas.ide.launching.Activator;
import com.wamas.ide.launching.generator.RecursiveCollectors;
import com.wamas.ide.launching.generator.StandaloneLaunchConfigGenerator;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.ui.LcDslHelper;
import com.wamas.ide.launching.ui.internal.LaunchingActivator;
import com.wamas.ide.launching.ui.internal.LcDslInternalHelper;

public class LcDslLaunchObject implements ILaunchObject {

    private static final ImageDescriptor NATURE_OVERLAY = LaunchingActivator
            .imageDescriptorFromPlugin(LcDslInternalHelper.PLUGIN_ID, "icons/nature_overlay.png");

    private final LaunchConfig cfg;
    private final StandaloneLaunchConfigGenerator generator;

    private static final ImageRegistry registry = new ImageRegistry();
    private ILaunchConfiguration cachedGenerated;

    public LcDslLaunchObject(LaunchConfig cfg) {
        this.cfg = cfg;
        this.generator = LcDslHelper.getInjector().getInstance(StandaloneLaunchConfigGenerator.class);
    }

    LaunchConfig getLaunchConfig() {
        return cfg;
    }

    @Override
    public String getId() {
        return generator.fullName(cfg);
    }

    @Override
    public StyledString getLabel() {
        return new StyledString(getId() == null ? "" : getId()).append(' ')
                .append("[" + cfg.eResource().getURI().lastSegment() + "]", StyledString.QUALIFIER_STYLER);
    }

    @Override
    public Image getImage() {
        Image undecorated = ILaunchObject.super.getImage();

        if (undecorated == null) {
            return null;
        }

        boolean isGenerated = findConfig() != null;
        String imgid = getType().getIdentifier() + (isGenerated ? "-enabled" : "-disabled");

        Image image = registry.get(imgid);
        if (image == null) {
            if (!isGenerated) {
                undecorated = new Image(undecorated.getDevice(), undecorated, SWT.IMAGE_DISABLE);
            }
            ImageDescriptor overlay = NATURE_OVERLAY;
            image = new DecorationOverlayIcon(undecorated, overlay, IDecoration.TOP_RIGHT).createImage();
            registry.put(imgid, image);
            if (!isGenerated) {
                undecorated.dispose();
            }
        }
        return image;
    }

    @Override
    public ILaunchConfigurationType getType() {
        return StandaloneLaunchConfigGenerator.getType(DebugPlugin.getDefault().getLaunchManager(), cfg.getType());
    }

    @Override
    public void launch(ILaunchMode mode) {
        ILaunchConfiguration generated = generator.generate(cfg);
        if (generated != null) {
			LaunchConfigurationViewPlugin.getExecutor().launchProcess(generated, mode.getIdentifier(), true, false, null);
        }
    }

    @Override
    public boolean canTerminate() {
        ILaunchConfiguration generated = findConfig();
        if (generated == null) {
            return false;
        }
        ILaunch launch = findLaunch(generated.getName());
        if (launch != null && launch.canTerminate()) {
            return true;
        }
        return false;
    }

    @Override
    public void terminate() {
        ILaunchConfiguration config = findConfig();
        // DON'T use Eclipse' mechanism - it's a little broken if shutdown of
        // the processes takes longer than a few seconds.
        // Instead we start a job that tries to terminate processes. If the job
        // itself is stopped, we give up like Eclipse does.
        ILaunch launch = findLaunch(config.getName());
        if (launch != null && launch.canTerminate()) {
            Job terminateJob = new Job("Terminate " + config.getName()) {

                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    if (!launch.isTerminated()) {
                        try {
                            launch.terminate();
                        } catch (DebugException e) {
                            // could not terminate - but we cannot do anything
                            // anyway... :(
                            return new Status(IStatus.WARNING, Activator.PLUGIN_ID, "Cannot terminate " + config.getName());
                        }
                    }
                    return Status.OK_STATUS;
                }
            };

            terminateJob.setUser(true);
            terminateJob.schedule();
        }
    }

    @Override
    public void relaunch() {
        ILaunchConfiguration config = findConfig();
        ILaunch launch = findLaunch(config.getName());
        String launchMode = launch.getLaunchMode();
        try {
            launch.terminate();
            LaunchConfigurationViewPlugin.getExecutor().launchProcess(config, launchMode, true, false, null);
        } catch (Exception e) {
            throw new RuntimeException("Cannot relaunch " + config.getName(), e);
        }
    }

    private static ILaunch findLaunch(String name) {
        for (ILaunch l : DebugPlugin.getDefault().getLaunchManager().getLaunches()) {
            if (l.getLaunchConfiguration() == null || l.isTerminated()) {
                continue;
            }
            if (l.getLaunchConfiguration().getName().equals(name)) {
                return l;
            }
        }
        return null;
    }

    private ILaunchConfiguration findConfig() {
        if (cachedGenerated != null) {
            return cachedGenerated;
        }
        try {
            for (ILaunchConfiguration config : DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(getType())) {
                if (config.getName().equals(getId())) {
                    cachedGenerated = config;
                    break;
                }
            }
        } catch (CoreException e) {
            LcDslInternalHelper.log(IStatus.WARNING, "cannot lookup launch configuration", e);
        }
        return cachedGenerated;
    }

    @Override
    public void edit() {
        IURIEditorOpener opener = LcDslHelper.getInjector().getInstance(IURIEditorOpener.class);
        opener.open(EcoreUtil2.getPlatformResourceOrNormalizedURI(cfg), true);
    }

    @Override
    public boolean isFavorite() {
        return !RecursiveCollectors.collectFavoriteGroups(cfg).isEmpty();
    }

    @Override
    public int compareTo(ILaunchObject o) {
        if (getId() == null) {
            Activator.log(IStatus.WARNING, "LaunchObject with null id: " + this, null);
            if (o.getId() == null) {
                return 0;
            }
            return 1;
        }

        return getId().compareTo(o.getId());
    }

}
