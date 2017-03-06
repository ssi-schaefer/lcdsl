/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.impl;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.jface.viewers.StyledString;

import com.wamas.ide.launchview.Activator;
import com.wamas.ide.launchview.launcher.StandaloneLaunchConfigExecutor;
import com.wamas.ide.launchview.services.LaunchObject;

public class DebugCoreLaunchObject implements LaunchObject {

    private final ILaunchConfiguration config;

    DebugCoreLaunchObject(ILaunchConfiguration config) {
        this.config = config;
    }
    
    @Override
    public String getId() {
    	return config.getName();
    }

    @Override
    public StyledString getLabel() {
        return new StyledString(config.getName());
    }

    @Override
    public ILaunchConfigurationType getType() {
        try {
            return config.getType();
        } catch (CoreException e) {
            Activator.getDefault().getLog()
                    .log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "cannot get type of " + config.getName(), e));
        }
        return null;
    }

    @Override
    public void launch(ILaunchMode mode) {
        StandaloneLaunchConfigExecutor.launchProcess(config, mode.getIdentifier(), true, false, null);
    }

}
