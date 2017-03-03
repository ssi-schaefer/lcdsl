/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.debug.core.ILaunchConfiguration;

import com.wamas.ide.launching.generator.StandaloneLaunchConfigExecutor;
import com.wamas.ide.launching.lcDsl.LaunchConfig;

public class EditorLaunchCmd extends AbstractLaunchConfigExecutionHandler {

    @Override
    protected LaunchConfig getLaunchConfig(ExecutionEvent event) {
        return getLaunchConfigFromEditor(event);
    }

    @Override
    protected void launch(ILaunchConfiguration c) {
        StandaloneLaunchConfigExecutor.launchProcess(c, false, true, false, null);
    }

}
