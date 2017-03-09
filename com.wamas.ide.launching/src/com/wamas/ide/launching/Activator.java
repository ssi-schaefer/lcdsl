/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

    private static BundleContext ctx;

    @Override
    public void start(BundleContext context) throws Exception {
        ctx = context;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        ctx = null;
    }

    public static <T> Collection<T> getAllServices(Class<T> clazz) {
        List<T> l = new ArrayList<>();
        try {
            Collection<ServiceReference<T>> srs = ctx.getServiceReferences(clazz, null);
            for (ServiceReference<T> s : srs) {
                l.add(ctx.getService(s));
                ctx.ungetService(s);
            }
        } catch (InvalidSyntaxException e) {
            // cannot happen - not using filter above
        }
        return l;
    }

    public static ILog getLog() {
        return Platform.getLog(ctx.getBundle());
    }

    public static void log(int severity, String message, Throwable t) {
        getLog().log(new Status(severity, ctx.getBundle().getSymbolicName(), message, t));
    }

}
