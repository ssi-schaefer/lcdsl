/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.model;

import org.eclipse.swt.graphics.Image;

import com.wamas.ide.launchview.Activator;

public class LaunchObjectFavoriteContainerModel extends LaunchObjectContainerModel {

    private static final Image FAV_ICON = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/favorite_star.png")
            .createImage();

    public LaunchObjectFavoriteContainerModel() {
        super("Favorites", FAV_ICON);
    }

}
