/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.model;

import java.util.Set;
import java.util.TreeSet;

import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.internal.ui.DebugPluginImages;
import org.eclipse.swt.graphics.Image;

public class LaunchObjectContainerModel extends LaunchObjectModel {

    private final Set<LaunchObjectModel> children = new TreeSet<>((a, b) -> {
        if (a instanceof LaunchObjectFavoriteContainerModel) {
            return -1;
        } else if (b instanceof LaunchObjectFavoriteContainerModel) {
            return 1;
        }

        return a.compareTo(b);
    });
    private final ILaunchConfigurationType type;

    LaunchObjectContainerModel() {
        this(null, null);
    }

    LaunchObjectContainerModel(ILaunchConfigurationType type) {
        super(type.getName(), DebugPluginImages.getImage(type.getIdentifier()));
        this.type = type;
    }

    protected LaunchObjectContainerModel(String id, Image image) {
        super(id, image);
        this.type = null;
    }

    public void addChild(LaunchObjectModel model) {
        children.add(model);
    }

    public Set<LaunchObjectModel> getChildren() {
        return children;
    }

    public LaunchObjectContainerModel getContainerFor(LaunchObjectModel m) {
        for (LaunchObjectModel child : children) {
            if (child instanceof LaunchObjectContainerModel) {
                if (m.getObject().getType().equals(((LaunchObjectContainerModel) child).type)) {
                    return (LaunchObjectContainerModel) child;
                }
            }
        }
        return null;
    }

}
