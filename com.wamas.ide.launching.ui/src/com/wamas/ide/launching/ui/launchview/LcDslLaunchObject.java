/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.launchview;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;

import com.wamas.ide.launching.generator.RecursiveCollectors;
import com.wamas.ide.launching.generator.StandaloneLaunchConfigGenerator;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.ui.LcDslHelper;
import com.wamas.ide.launching.ui.internal.LaunchingActivator;
import com.wamas.ide.launchview.impl.DebugCoreLaunchObject;
import com.wamas.ide.launchview.launcher.StandaloneLaunchConfigExecutor;
import com.wamas.ide.launchview.services.LaunchObject;

public class LcDslLaunchObject implements LaunchObject {

    private static final ImageDescriptor NATURE_OVERLAY = LaunchingActivator
            .imageDescriptorFromPlugin("com.wamas.ide.launching.ui", "icons/nature_overlay.png");

    private final LaunchConfig cfg;
    private final StandaloneLaunchConfigGenerator generator;

    private static final ImageRegistry registry = new ImageRegistry();
    private ILaunchConfiguration cachedGenerated;

    public LcDslLaunchObject(LaunchConfig cfg) {
        this.cfg = cfg;
        this.generator = LcDslHelper.getInjector().getInstance(StandaloneLaunchConfigGenerator.class);
    }

    @Override
    public String getId() {
        return cfg.getName();
    }

    @Override
    public StyledString getLabel() {
        return new StyledString(cfg.getName()).append(' ').append("[" + cfg.eResource().getURI().lastSegment() + "]",
                StyledString.QUALIFIER_STYLER);
    }

    @Override
    public Image getImage() {
        Image undecorated = LaunchObject.super.getImage();

        if (undecorated == null) {
            return null;
        }

        Image image = registry.get(getType().getIdentifier());
        if (image == null) {
            ImageData blended = undecorated.getImageData();
            blended.alpha = 128;
            ImageDescriptor overlay = NATURE_OVERLAY;
            image = new DecorationOverlayIcon(undecorated, overlay, IDecoration.TOP_RIGHT).createImage();
            registry.put(getType().getIdentifier(), image);
        }
        return image;
    }

    @Override
    public ILaunchConfigurationType getType() {
        return StandaloneLaunchConfigGenerator.getType(DebugPlugin.getDefault().getLaunchManager(), cfg.getType());
    }

    @Override
    public void launch(ILaunchMode mode) {
        StandaloneLaunchConfigExecutor.launchProcess(generator.generate(cfg), mode.getIdentifier(), true, false, null);
    }

    @Override
    public boolean canTerminate() {
        ILaunchConfiguration generated = findConfig();
        if (generated == null) {
            return false;
        }
        return new DebugCoreLaunchObject(generated).canTerminate();
    }

    @Override
    public void terminate() {
        new DebugCoreLaunchObject(findConfig()).terminate();
    }

    @Override
    public void relaunch() {
        new DebugCoreLaunchObject(findConfig()).relaunch();
    }

    private ILaunchConfiguration findConfig() {
        if (cachedGenerated != null) {
            return cachedGenerated;
        }
        try {
            for (ILaunchConfiguration config : DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(getType())) {
                if (config.getName().equals(cfg.getName())) {
                    cachedGenerated = config;
                    break;
                }
            }
        } catch (CoreException e) {
            LaunchingActivator.getInstance().getLog()
                    .log(new Status(IStatus.WARNING, "com.wamas.ide.launching.ui", "cannot lookup launch configuration", e));
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

}
