/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview;

import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;

import com.wamas.ide.launchview.model.LaunchObjectModel;

public class LaunchViewLabelProvider extends BaseLabelProvider implements IStyledLabelProvider {

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
            return ((LaunchObjectModel) element).getImage();
        }

        return null;
    }

}
