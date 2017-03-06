/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.services;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractLaunchObjectProvider implements LaunchObjectProvider {

    private final List<Runnable> updateListeners = new ArrayList<>();

    @Override
    public void addUpdateListener(Runnable r) {
        updateListeners.add(r);
    }

    @Override
    public void removeUpdateListener(Runnable r) {
        updateListeners.remove(r);
    }

    protected void fireUpdate() {
        // prevent multiple updates in short row somehow?
        updateListeners.forEach(Runnable::run);
    }

}
