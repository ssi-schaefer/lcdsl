/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.ILaunchConfiguration;

import com.wamas.ide.launching.Activator;

public abstract class AbstractLaunchConfigExecutionHandler extends AbstractLaunchConfigGeneratorHandler {

    @Override
    public ILaunchConfiguration execute(ExecutionEvent event) throws ExecutionException {
        ILaunchConfiguration lc = super.execute(event);
        if (lc == null) {
            Activator.log(IStatus.ERROR, "failed to generate launch configuration, not launching", null);
            return null;
        }
        launch(lc);
        return lc;
    }

    protected abstract void launch(ILaunchConfiguration config);

}
