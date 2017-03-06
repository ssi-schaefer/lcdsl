/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.launchview;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.jface.viewers.StyledString;

import com.wamas.ide.launching.generator.StandaloneLaunchConfigGenerator;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launchview.launcher.StandaloneLaunchConfigExecutor;
import com.wamas.ide.launchview.services.LaunchObject;

public class LcDslLaunchObject implements LaunchObject {

    private final LaunchConfig cfg;
    private final StandaloneLaunchConfigGenerator generator;

    public LcDslLaunchObject(LaunchConfig cfg) {
        this.cfg = cfg;
        this.generator = LcDslProvider.getLcDslInjector().getInstance(StandaloneLaunchConfigGenerator.class);
    }
    
    @Override
    public String getId() {
    	return cfg.getName();
    }

    @Override
    public StyledString getLabel() {
        return new StyledString(cfg.getName()).append(' ').append("[" + cfg.eResource().getURI().lastSegment() + "]", StyledString.QUALIFIER_STYLER);
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
		return false; // a "LaunchConfig" never runs. Only the generated ILaunchConfiguration runs (handled elsewhere)
	}

	@Override
	public void terminate() {
		// cannot happen, see canTerminate.
		throw new UnsupportedOperationException("unexpected operation");
	}

}
