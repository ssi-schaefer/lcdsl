/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.launchview;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.jface.viewers.StyledString;

import com.wamas.ide.launching.generator.StandaloneLaunchConfigExecutor;
import com.wamas.ide.launching.generator.StandaloneLaunchConfigGenerator;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launchview.services.LaunchObject;

public class LcDslLaunchObject implements LaunchObject {

    private final LaunchConfig cfg;
    private final StandaloneLaunchConfigGenerator generator;

    public LcDslLaunchObject(LaunchConfig cfg) {
        this.cfg = cfg;
        this.generator = LcDslProvider.getLcDslInjector().getInstance(StandaloneLaunchConfigGenerator.class);
    }

    @Override
    public StyledString getLabel() {
        return new StyledString(cfg.getName());
    }

    @Override
    public ILaunchConfigurationType getType() {
        return StandaloneLaunchConfigGenerator.getType(DebugPlugin.getDefault().getLaunchManager(), cfg.getType());
    }

    @Override
    public void launch(ILaunchMode mode) {
        StandaloneLaunchConfigExecutor.launchProcess(generator.generate(cfg), mode.getIdentifier(), true, false, null);
    }

}
