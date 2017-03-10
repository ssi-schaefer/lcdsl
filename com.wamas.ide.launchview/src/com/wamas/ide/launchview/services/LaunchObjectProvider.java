/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.services;

import java.util.Set;

import org.eclipse.e4.ui.model.application.ui.menu.MMenu;

/**
 * Provides different {@link LaunchObject} implementations to the view for display. Also allows some interaction with the view by
 * means of an update listener and menu contributions.
 */
public interface LaunchObjectProvider {

    /**
     * @return all {@link LaunchObject}s that this provider contributes to the view
     */
    public Set<LaunchObject> getLaunchObjects();

    /**
     * @param r register a {@link Runnable} that should be notified whenever the provider's state changed. The view will react
     *            with refreshing it's in-memory models.
     */
    public void addUpdateListener(Runnable r);

    /**
     * @param r a previously registered update listener {@link Runnable}.
     */
    public void removeUpdateListener(Runnable r);

    /**
     * @return the priority of the provider. The default (debug.core) provider has priority 0. A higher priority means that
     *         {@link LaunchObject}s with the same type and id will take precedence. This allows to provide {@link LaunchObject}s
     *         that will generate {@link LaunchObject}s in lower priority providers.
     */
    public int getPriority();

    /**
     * @param menu the view's menu where items can be contributed.
     */
    public void contributeViewMenu(MMenu menu);

}
