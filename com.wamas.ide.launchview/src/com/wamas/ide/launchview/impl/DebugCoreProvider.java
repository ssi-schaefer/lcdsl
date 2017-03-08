/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationListener;
import org.eclipse.debug.core.ILaunchesListener2;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import com.wamas.ide.launchview.Activator;
import com.wamas.ide.launchview.services.AbstractLaunchObjectProvider;
import com.wamas.ide.launchview.services.LaunchObject;
import com.wamas.ide.launchview.services.LaunchObjectProvider;

@Component(service = LaunchObjectProvider.class)
public class DebugCoreProvider extends AbstractLaunchObjectProvider
        implements LaunchObjectProvider, ILaunchConfigurationListener, ILaunchesListener2 {

    @Activate
    public void createService() {
        DebugPlugin.getDefault().getLaunchManager().addLaunchConfigurationListener(this);
        DebugPlugin.getDefault().getLaunchManager().addLaunchListener(this);
    }

    @Deactivate
    public void destroyService() {
        DebugPlugin.getDefault().getLaunchManager().removeLaunchConfigurationListener(this);
        DebugPlugin.getDefault().getLaunchManager().removeLaunchListener(this);
    }

    @Override
    public Set<LaunchObject> getLaunchObjects() {
        try {
            return Arrays.stream(DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations())
                    .map(DebugCoreLaunchObject::new).collect(Collectors.toCollection(TreeSet::new));
        } catch (CoreException e) {
            Activator.getDefault().getLog()
                    .log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "cannot fetch launch configurations from Eclipse.", e));
            return Collections.emptySet();
        }
    }

    @Override
    public void launchConfigurationAdded(ILaunchConfiguration configuration) {
        fireUpdate();
    }

    @Override
    public void launchConfigurationChanged(ILaunchConfiguration configuration) {
        fireUpdate();
    }

    @Override
    public void launchConfigurationRemoved(ILaunchConfiguration configuration) {
        fireUpdate();
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public void launchesRemoved(ILaunch[] launches) {
    }

    @Override
    public void launchesAdded(ILaunch[] launches) {
    }

    @Override
    public void launchesChanged(ILaunch[] launches) {
        fireUpdate(); // process added, thus can terminate
    }

    @Override
    public void launchesTerminated(ILaunch[] launches) {
        fireUpdate();
    }

}
