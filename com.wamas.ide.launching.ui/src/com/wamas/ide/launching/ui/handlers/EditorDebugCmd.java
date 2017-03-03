/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.handlers;

import org.eclipse.debug.core.ILaunchConfiguration;

import com.wamas.ide.launching.generator.StandaloneLaunchConfigExecutor;

public class EditorDebugCmd extends EditorLaunchCmd {

    @Override
    protected void launch(ILaunchConfiguration c) {
        StandaloneLaunchConfigExecutor.launchProcess(c, true, true, false, null);
    }

}
