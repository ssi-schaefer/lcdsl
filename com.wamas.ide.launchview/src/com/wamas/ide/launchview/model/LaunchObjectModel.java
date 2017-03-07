/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.model;

import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;

import com.wamas.ide.launchview.services.LaunchObject;

public class LaunchObjectModel implements Comparable<LaunchObjectModel> {

    private final String id;
    private final Image image;

    private final LaunchObject object;

    LaunchObjectModel(LaunchObject obj) {
        this.id = obj.getId();
        this.image = obj.getImage();
        this.object = obj;
    }

    LaunchObjectModel(String id, Image image) {
        this.id = id;
        this.image = image;
        this.object = null;
    }

    public StyledString getLabel() {
        if (object == null) {
            return new StyledString(id);
        }
        return object.getLabel();
    }

    public Image getImage() {
        return image;
    }

    public LaunchObject getObject() {
        return object;
    }

    @Override
    public String toString() {
        return uniqueId() + "(" + getObject() + ")";
    }

    @Override
    public int compareTo(LaunchObjectModel o) {
        return uniqueId().compareTo(o.uniqueId());
    }

    public String uniqueId() {
        if (id == null) {
            return "root";
        } else if (object == null || object.getType() == null) {
            return id;
        }
        return object.getType().getIdentifier() + "." + id;
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
