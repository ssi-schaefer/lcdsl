/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.internal;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

public class LcDslInternalHelper {

    public static final String PLUGIN_ID = "com.wamas.ide.launching.ui";

    public static ILog getLog() {
        return Platform.getLog(LaunchingActivator.getInstance().getBundle());
    }

    public static void log(int severity, String message, Throwable t) {
        getLog().log(new Status(severity, PLUGIN_ID, message, t));
    }

}
