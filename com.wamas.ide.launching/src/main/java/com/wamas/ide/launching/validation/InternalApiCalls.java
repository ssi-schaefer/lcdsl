package com.wamas.ide.launching.validation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.stream.Stream;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.TracingOptionsManager;

public class InternalApiCalls {

    @SuppressWarnings("unchecked")
    public static Map<String, String> pdeCoreGetTemplateTable(String pluginId) {
        if (pluginId == null) {
            return Map.of();
        }
        TracingOptionsManager tracingOptionsManager = PDECore.getDefault().getTracingOptionsManager();

        Method candidate = Stream.of(TracingOptionsManager.class.getMethods())
                .filter(mth -> mth.getName().equals("getTemplateTable")).findFirst().orElseThrow();
        try {
            if (candidate.getParameterCount() == 1) {
                return (Map<String, String>) candidate.invoke(tracingOptionsManager, pluginId);
            } else if (candidate.getParameterCount() == 2) {
                // getTemplateTable changed signature by adding a progress monitor parameter
                return (Map<String, String>) candidate.invoke(tracingOptionsManager, pluginId,
                        new NullProgressMonitor());
            } else {
                throw new IllegalStateException(
                        "Method PdeCore.getTracingManager.getTemplateTable was not found with needed signature");
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new IllegalStateException("Exception when calling PdeCore.getTracingManager.getTemplateTable", e);
        }
    }

}
