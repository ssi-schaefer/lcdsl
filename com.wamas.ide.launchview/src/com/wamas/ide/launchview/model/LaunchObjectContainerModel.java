/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.model;

import java.util.Set;
import java.util.TreeSet;

import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.internal.ui.DebugPluginImages;
import org.eclipse.jface.viewers.StyledString;

public class LaunchObjectContainerModel extends LaunchObjectModel {

    private final Set<LaunchObjectModel> children = new TreeSet<>();
    private final ILaunchConfigurationType type;

    LaunchObjectContainerModel() {
        super(null, null);
        this.type = null;
    }

    LaunchObjectContainerModel(ILaunchConfigurationType type) {
        super(new StyledString(type.getName()), DebugPluginImages.getImage(type.getIdentifier()));
        this.type = type;
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

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();

        if (type != null) {
            b.append(getLabel() + "{\n");
        }

        for (LaunchObjectModel c : children) {
            if (type != null) {
                b.append("    ");
            }
            b.append(c.toString());
            b.append("\n");
        }
        if (type != null) {
            b.append("}");
        }

        return b.toString();
    }

}
