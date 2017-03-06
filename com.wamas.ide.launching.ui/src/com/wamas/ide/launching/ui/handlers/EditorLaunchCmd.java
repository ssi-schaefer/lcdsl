/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;

import com.wamas.ide.launching.generator.StandaloneLaunchConfigExecutor;
import com.wamas.ide.launching.lcDsl.LaunchConfig;

/**
 * TODO: replace these menu items with dynamic one's that allow to run any supported mode.
 */
public class EditorLaunchCmd extends AbstractLaunchConfigExecutionHandler {

    @Override
    protected LaunchConfig getLaunchConfig(ExecutionEvent event) {
        return getLaunchConfigFromEditor(event);
    }

    @Override
    protected void launch(ILaunchConfiguration c) {
        StandaloneLaunchConfigExecutor.launchProcess(c, ILaunchManager.RUN_MODE, true, false, null);
    }

}
