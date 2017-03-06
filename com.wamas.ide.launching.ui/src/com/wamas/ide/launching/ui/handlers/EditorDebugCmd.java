/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.handlers;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;

import com.wamas.ide.launching.generator.StandaloneLaunchConfigExecutor;

public class EditorDebugCmd extends EditorLaunchCmd {

    @Override
    protected void launch(ILaunchConfiguration c) {
        StandaloneLaunchConfigExecutor.launchProcess(c, ILaunchManager.DEBUG_MODE, true, false, null);
    }

}
