/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.jface.action.Action;

import com.wamas.ide.launchview.model.LaunchObjectModel;

public class LaunchAction extends Action {

    private static final Map<String, String> COMMON_MODE_ICONS;

    static {
        COMMON_MODE_ICONS = new TreeMap<>();
        COMMON_MODE_ICONS.put("run", "icons/launch_run.gif");
        COMMON_MODE_ICONS.put("debug", "icons/debug_exc.gif");
        COMMON_MODE_ICONS.put("profile", "icons/profile_exc.gif");
        COMMON_MODE_ICONS.put("coverage", "icons/coverage.png");
    }

    private final Set<LaunchObjectModel> models;
    private final ILaunchMode mode;

    public LaunchAction(ILaunchMode mode, Set<LaunchObjectModel> models) {
        this.mode = mode;
        this.models = models;

        setText(mode.getLabel());

        if (COMMON_MODE_ICONS.containsKey(mode.getIdentifier())) {
            setImageDescriptor(
                    Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, COMMON_MODE_ICONS.get(mode.getIdentifier())));
        }
    }

    @Override
    public boolean isEnabled() {
        return models.stream().allMatch((m) -> {
            if (m.getObject() == null) {
                return false;
            }
            try {
                return m.getObject().getType().getDelegates(Collections.singleton(mode.getIdentifier())).length > 0;
            } catch (CoreException e) {
                Activator.log(IStatus.WARNING, "problem retreiving launch delegates", e);
                return false;
            }
        });
    }

    @Override
    public void run() {
        for (LaunchObjectModel m : models) {
            m.getObject().launch(mode);

            if (models.size() > 1) {
                // PDE has a nasty bug. If launching too fast, it tries to overwrite the last configurations platform.xml
                try {
                    Thread.sleep(2_000);
                } catch (InterruptedException ie) {
                    // ignored
                }
            }
        }
    }

}
