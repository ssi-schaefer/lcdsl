/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;

import com.wamas.ide.launchview.model.LaunchObjectModel;

public class LaunchViewLabelProvider extends BaseLabelProvider implements IStyledLabelProvider {

    private static final ImageDescriptor ICON_RUNNING = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
            "icons/run_co.gif");

    private final ImageRegistry perConfig = new ImageRegistry();

    @Override
    public StyledString getStyledText(Object element) {
        if (element instanceof LaunchObjectModel) {
            return ((LaunchObjectModel) element).getLabel();
        }

        return null;
    }

    @Override
    public Image getImage(Object element) {
        if (element instanceof LaunchObjectModel) {
            LaunchObjectModel obj = (LaunchObjectModel) element;
            if (obj.getObject() != null && obj.getObject().canTerminate()) {
                return getCachedRunningImage(obj);
            }

            return obj.getImage();
        }

        return null;
    }

    private Image getCachedRunningImage(LaunchObjectModel obj) {
        Image img = perConfig.get(obj.getObject().getId());
        if (img == null) {
            img = new DecorationOverlayIcon(obj.getImage(), ICON_RUNNING, IDecoration.TOP_LEFT).createImage();
            perConfig.put(obj.getObject().getId(), img);
        }
        return img;
    }

    @Override
    public void dispose() {
        perConfig.dispose();
        super.dispose();
    }

}
