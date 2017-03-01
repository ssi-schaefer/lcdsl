/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class OutlineGenerateCmd extends AbstractLaunchConfigContextHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        generator.generate(getLaunchConfigFromOutline(event));
        return null;
    }

}
