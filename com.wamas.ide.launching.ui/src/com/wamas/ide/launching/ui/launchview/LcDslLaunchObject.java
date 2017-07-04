/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.launchview;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.debug.ui.launchview.internal.impl.DebugCoreLaunchObject;
import org.eclipse.debug.ui.launchview.launcher.StandaloneLaunchConfigExecutor;
import org.eclipse.debug.ui.launchview.services.LaunchObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;

import com.wamas.ide.launching.generator.RecursiveCollectors;
import com.wamas.ide.launching.generator.StandaloneLaunchConfigGenerator;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.ui.LcDslHelper;
import com.wamas.ide.launching.ui.internal.LaunchingActivator;
import com.wamas.ide.launching.ui.internal.LcDslInternalHelper;

public class LcDslLaunchObject implements LaunchObject {

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
        return new StyledString(generator.fullName(cfg)).append(' ').append("[" + cfg.eResource().getURI().lastSegment() + "]",
                StyledString.QUALIFIER_STYLER);
    }

    @Override
    public Image getImage() {
        Image undecorated = LaunchObject.super.getImage();

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
                if (config.getName().equals(generator.fullName(cfg))) {
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

}
