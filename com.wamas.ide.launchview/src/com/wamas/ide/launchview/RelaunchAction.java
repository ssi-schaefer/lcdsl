/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview;

import java.util.Collection;

import org.eclipse.jface.action.Action;

import com.wamas.ide.launchview.model.LaunchObjectModel;

public class RelaunchAction extends Action {

    private final Collection<LaunchObjectModel> models;

    public RelaunchAction(Collection<LaunchObjectModel> models) {
        this.models = models;

        setText("Relaunch");
        setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/relaunch.png"));
    }

    @Override
    public boolean isEnabled() {
        return models.stream().allMatch(m -> m.getObject() != null && m.getObject().canTerminate());
    }

    @Override
    public void run() {
        models.stream().forEach(m -> m.getObject().relaunch());
    }

}
