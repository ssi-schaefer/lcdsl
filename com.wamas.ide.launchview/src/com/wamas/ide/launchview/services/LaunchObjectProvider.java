/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.services;

import java.util.Set;

public interface LaunchObjectProvider {

    public Set<LaunchObject> getLaunchObjects();

    public void addUpdateListener(Runnable r);

    public void removeUpdateListener(Runnable r);

    public int getPriority();

}
