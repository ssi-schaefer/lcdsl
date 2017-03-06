/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview;

import java.util.Set;

import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.jface.action.Action;

import com.wamas.ide.launchview.model.LaunchObjectModel;

public class LaunchAction extends Action {

    private final Set<LaunchObjectModel> models;
    private final ILaunchMode mode;

    public LaunchAction(ILaunchMode mode, Set<LaunchObjectModel> models) {
        this.mode = mode;
        this.models = models;

        setText(mode.getLabel() + " selected");
        // TODO: how to do it... eclipse does not have icons for this :D
        //        setImageDescriptor(DebugPluginImages.getImageDescriptor(mode.getIdentifier()));
    }

    @Override
    public void run() {
        for (LaunchObjectModel m : models) {
            m.getObject().launch(mode);
        }
    }

}
