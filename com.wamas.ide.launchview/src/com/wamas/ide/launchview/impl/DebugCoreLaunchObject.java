/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview.impl;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.ui.PlatformUI;

import com.wamas.ide.launchview.Activator;
import com.wamas.ide.launchview.launcher.StandaloneLaunchConfigExecutor;
import com.wamas.ide.launchview.services.LaunchObject;

public class DebugCoreLaunchObject implements LaunchObject {

    private final ILaunchConfiguration config;

    public DebugCoreLaunchObject(ILaunchConfiguration config) {
        this.config = config;
    }

    @Override
    public String getId() {
        return config.getName();
    }

    @Override
    public StyledString getLabel() {
        return new StyledString(config.getName());
    }

    @Override
    public ILaunchConfigurationType getType() {
        try {
            return config.getType();
        } catch (CoreException e) {
            Activator.getDefault().getLog()
                    .log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "cannot get type of " + config.getName(), e));
        }
        return null;
    }

    @Override
    public void launch(ILaunchMode mode) {
        StandaloneLaunchConfigExecutor.launchProcess(config, mode.getIdentifier(), true, false, null);
    }

    @Override
    public boolean canTerminate() {
        ILaunch launch = findLaunch();
        if (launch != null && launch.canTerminate()) {
            return true;
        }
        return false;
    }

    @Override
    public void terminate() {
        // DON'T use Eclipse' mechanism - it's a little broken if shutdown of the processes takes longer than a few seconds.
        // Instead we start a job that tries to terminate processes. If the job itself is stopped, we give up like Eclipse does.
        ILaunch launch = findLaunch();
        if (launch != null && launch.canTerminate()) {
            Job terminateJob = new Job("Terminate " + config.getName()) {

                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    while (true) {
                        if (monitor.isCanceled()) {
                            return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "cannot terminate " + config.getName());
                        }

                        if (launch.isTerminated()) {
                            return Status.OK_STATUS;
                        }

                        for (IProcess p : launch.getProcesses()) {
                            if (!p.isTerminated() && p.canTerminate()) {
                                try {
                                    p.terminate();
                                } catch (DebugException e) {
                                    // try again next time.
                                }
                            }
                        }
                    }
                }
            };

            terminateJob.setUser(true);
            terminateJob.schedule();
        }
    }

    private ILaunch findLaunch() {
        for (ILaunch l : DebugPlugin.getDefault().getLaunchManager().getLaunches()) {
            if (l.getLaunchConfiguration() == null) {
                continue;
            }
            if (l.getLaunchConfiguration().getName().equals(config.getName())) {
                return l;
            }
        }
        return null;
    }

    @Override
    public void edit() {
        // TODO: This uses "run" mode ALWAYS as the Eclipse infrastructure requires a group to be given.
        DebugUITools.openLaunchConfigurationDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), config,
                DebugUITools.getLaunchGroup(config, "run").getIdentifier(), null);
    }

}
