/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.services;

import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.debug.internal.ui.DebugPluginImages;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;

public interface LaunchObject extends Comparable<LaunchObject> {

    public String getId();

    public StyledString getLabel();

    default public Image getImage() {
        if (getType() == null) {
            return null;
        }
        return DebugPluginImages.getImage(getType().getIdentifier());
    }

    public ILaunchConfigurationType getType();

    public void launch(ILaunchMode mode);

    public boolean canTerminate();

    public void terminate();

    public void relaunch();

    @Override
    default int compareTo(LaunchObject o) {
        return getLabel().toString().compareTo(o.getLabel().toString());
    }

    public void edit();

    public boolean isFavorite();

}
