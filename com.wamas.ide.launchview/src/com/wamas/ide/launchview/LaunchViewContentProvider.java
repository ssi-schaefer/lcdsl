/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview;

import org.eclipse.jface.viewers.ITreeContentProvider;

import com.wamas.ide.launchview.model.LaunchObjectContainerModel;

public class LaunchViewContentProvider implements ITreeContentProvider {

    @Override
    public Object[] getElements(Object inputElement) {
        return getChildren(inputElement);
    }

    @Override
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof LaunchObjectContainerModel) {
            return ((LaunchObjectContainerModel) parentElement).getChildren().toArray();
        }

        return null;
    }

    @Override
    public Object getParent(Object element) {
        return null;
    }

    @Override
    public boolean hasChildren(Object element) {
        return (element instanceof LaunchObjectContainerModel && !((LaunchObjectContainerModel) element).getChildren().isEmpty());
    }

}
