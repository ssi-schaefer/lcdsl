/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.model;

import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;

import com.wamas.ide.launchview.services.LaunchObject;

public class LaunchObjectModel implements Comparable<LaunchObjectModel> {

    private final StyledString label;
    private final Image image;

    private final LaunchObject object;

    LaunchObjectModel(LaunchObject obj) {
        this.label = obj.getLabel();
        this.image = obj.getImage();
        this.object = obj;
    }

    LaunchObjectModel(StyledString label, Image image) {
        this.label = label;
        this.image = image;
        this.object = null;
    }

    public StyledString getLabel() {
        return label;
    }

    public Image getImage() {
        return image;
    }

    public LaunchObject getObject() {
        return object;
    }

    @Override
    public String toString() {
        return getLabel().toString();
    }

    @Override
    public int compareTo(LaunchObjectModel o) {
        return getLabel().toString().compareTo(o.getLabel().toString());
    }

    public String uniqueId() {
        if (label == null) {
            return "root";
        } else if (object == null || object.getType() == null) {
            return label.toString();
        }
        return object.getType().getName() + "." + label.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (uniqueId().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        LaunchObjectModel other = (LaunchObjectModel) obj;
        return uniqueId().equals(other.uniqueId());
    }

}
