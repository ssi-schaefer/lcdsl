/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview;

import java.util.Collection;

import org.eclipse.jface.action.Action;

import com.wamas.ide.launchview.model.LaunchObjectModel;

public class EditAction extends Action {

    private final Collection<LaunchObjectModel> models;

    public EditAction(Collection<LaunchObjectModel> models) {
        this.models = models;

        setText("Edit...");
        setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/edit.gif"));
    }

    @Override
    public boolean isEnabled() {
        return models.size() == 1 && models.iterator().next().getObject() != null;
    }

    @Override
    public void run() {
        LaunchObjectModel m = models.iterator().next();
        m.getObject().edit();
    }

}
