/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.build;

import java.util.List;

import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;
import org.eclipse.xtext.resource.impl.SimpleResourceDescriptionsBasedContainerManager;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * A container manager that is aware of target platform URIs.
 * All resources from the target platform are configured such that they can
 * reach / see every other resource.
 * Resources from the workspace are configured to consider the project dependencies
 * and are allowed to refer to all URIs from the target platform.
 * This is an approximation only to avoid the need to keep track of dependencies
 * within the target platform itself.
 */
@Singleton
public class LcDslContainerManager extends StateBasedContainerManager {

    @Inject
    private SimpleResourceDescriptionsBasedContainerManager targetPlatformContainer;

    @Override
    public IContainer getContainer(IResourceDescription desc, IResourceDescriptions resourceDescriptions) {
        if ("target".equals(desc.getURI().scheme())) {
            return targetPlatformContainer.getContainer(desc, resourceDescriptions);
        }
        return super.getContainer(desc, resourceDescriptions);
    }

    @Override
    public List<IContainer> getVisibleContainers(IResourceDescription desc, IResourceDescriptions resourceDescriptions) {
        if ("target".equals(desc.getURI().scheme())) {
            return targetPlatformContainer.getVisibleContainers(desc, resourceDescriptions);
        }
        return super.getVisibleContainers(desc, resourceDescriptions);
    }

}
