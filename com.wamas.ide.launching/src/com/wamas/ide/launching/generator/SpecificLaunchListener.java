/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.generator;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchesListener2;
import org.eclipse.debug.core.model.IProcess;

/**
 * Wrapper around {@link ILaunchesListener2} which unwraps to a single specific {@link ILaunch}
 * matching the given {@link ILaunchConfiguration}
 */
public abstract class SpecificLaunchListener implements ILaunchesListener2 {

    private interface ILaunchMethod {

        public void theMethod(ILaunch launch);
    }

    private final ILaunchConfiguration config;

    public SpecificLaunchListener(ILaunchConfiguration config) {
        this.config = config;
    }

    private boolean matches(ILaunch launch) {
        // this can happen if re-generating a running launch configuration
        if (launch == null || launch.getLaunchConfiguration() == null) {
            return false;
        }

        return launch.getLaunchConfiguration().contentsEqual(this.config);
    }

    private void runIfMatches(ILaunch[] launches, ILaunchMethod handle) {
        for (ILaunch l : launches) {
            if (matches(l)) {
                handle.theMethod(l);
            }
        }
    }

    @Override
    public void launchesRemoved(ILaunch[] launches) {
        runIfMatches(launches, this::launchRemoved);
    }

    @Override
    public void launchesAdded(ILaunch[] launches) {
        runIfMatches(launches, this::launchAdded);
    }

    @Override
    public void launchesChanged(ILaunch[] launches) {
        runIfMatches(launches, this::launchChanged);
    }

    @Override
    public void launchesTerminated(ILaunch[] launches) {
        runIfMatches(launches, this::launchTerminated);
    }

    public void launchRemoved(ILaunch launch) {
        // default: nothing
    }

    public void launchAdded(ILaunch launch) {
        // default: nothing
    }

    /**
     * Called whenever a launch changes. Adding an {@link IProcess} to the {@link ILaunch} is a
     * change.
     */
    public void launchChanged(ILaunch launch) {
        // default: nothing
    }

    /**
     * Called whenever the launch is terminated.
     */
    public void launchTerminated(ILaunch launch) {
        // default: nothing
    }

}
