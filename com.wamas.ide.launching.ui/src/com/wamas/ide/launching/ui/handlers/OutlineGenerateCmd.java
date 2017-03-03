/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;

import com.wamas.ide.launching.lcDsl.LaunchConfig;

public class OutlineGenerateCmd extends EditorGenerateCmd {

    @Override
    protected LaunchConfig getLaunchConfig(ExecutionEvent event) {
        return getLaunchConfigFromOutline(event);
    }

}
