/*******************************************************************************
 *  Copyright (c) 2005, 2022 IBM Corporation and others.
 *
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *     IBM Corporation - initial API and implementation
 *     Karsten Thoms <karsten.thoms@itemis.de> - Bug 522332
 *     Hannes Wellmann - Bug 539637 major rework to consider versions and improve runtime behavior
 *******************************************************************************/
package com.wamas.ide.launching.generator;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.function.Predicate;

import org.eclipse.core.resources.IResource;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.ClasspathComputer;
import org.osgi.framework.Constants;
import org.osgi.framework.wiring.BundleRequirement;
import org.osgi.framework.wiring.BundleRevision;
import org.osgi.framework.wiring.BundleWire;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.resource.Resource;

/**
 * Utility class to return bundle description collections for a variety of
 * dependency scenarios
 * This is a copy of from org.eclipse.pde.internal.core.DependencyManager,
 * as of Eclipse release 4.28 (2023-06), since we need a little more features.
 *
 * @noextend This class is not intended to be subclassed by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 */
public class DependencyManager {

    private DependencyManager() { // static use only
    }

    public enum Options {
        /** Specifies to include all optional dependencies into the closure. */
        INCLUDE_OPTIONAL_DEPENDENCIES,

        /**
         * Specifies to include all fragments into the closure (must not be
         * combined with {@link #INCLUDE_NON_TEST_FRAGMENTS}).
         */
        INCLUDE_ALL_FRAGMENTS,
        /**
         * Specifies to include all non-test fragments into the closure (must
         * not be combined with {@link #INCLUDE_ALL_FRAGMENTS}).
         */
        INCLUDE_NON_TEST_FRAGMENTS;
    }

    /**
     * Returns a {@link Set} of bundle descriptions of the given
     * {@link IPluginModelBase}s and all of their required dependencies,
     * allowing the user to provide some filter for bundles to include.
     * <p>
     * The set includes the descriptions of the given bundle descriptions as
     * well as all transitively computed explicit and optional (if requested)
     * dependencies. So it is the self-contained closure for all required
     * dependencies of the given set of plug-ins.
     * </p>
     *
     * @param bundles
     *            the group of {@link BundleDescription}s to compute
     *            dependencies for.
     * @param bundleFilter
     *            user filter returning false to omit some bundle
     * @param options
     *            the specified {@link Options} for computing the closure
     * @return a set of bundle descriptions
     */
    public static Set<BundleDescription> findRequirementsClosure(Collection<BundleDescription> bundles,
            Predicate<BundleDescription> bundleFilter, Options... options) {

        Set<Options> optionSet = Set.of(options);
        boolean includeOptional = optionSet.contains(Options.INCLUDE_OPTIONAL_DEPENDENCIES);
        boolean includeAllFragments = optionSet.contains(Options.INCLUDE_ALL_FRAGMENTS);
        boolean includeNonTestFragments = optionSet.contains(Options.INCLUDE_NON_TEST_FRAGMENTS);
        if (includeAllFragments && includeNonTestFragments) {
            throw new AssertionError("Cannot combine INCLUDE_ALL_FRAGMENTS and INCLUDE_NON_TEST_FRAGMENTS"); //$NON-NLS-1$
        }

        if (bundleFilter == null) {
            bundleFilter = b -> true;
        }

        Set<BundleDescription> closure = new HashSet<>(bundles.size() * 4 / 3 + 1);
        Queue<BundleDescription> pending = new ArrayDeque<>(bundles.size());

        // initialize with given bundles
        for (BundleDescription bundle : bundles) {
            addNewRequiredBundle(bundle, bundleFilter, closure, pending);
        }

        // perform exhaustive iterative bfs for required wires
        while (!pending.isEmpty()) {
            BundleDescription bundle = pending.remove();

            BundleWiring wiring = bundle.getWiring();
            if (wiring == null || !wiring.isInUse()) {
                continue;
            }

            if (includeAllFragments || includeNonTestFragments) {
                // A fragment's host is already required by a wire
                for (BundleDescription fragment : bundle.getFragments()) {
                    if (includeAllFragments || !isTestWorkspaceProject(fragment)) {
                        addNewRequiredBundle(fragment, bundleFilter, closure, pending);
                    }
                }
            }

            List<BundleWire> requiredWires = wiring.getRequiredWires(null);
            for (BundleWire wire : requiredWires) {
                BundleRevision declaringBundle = wire.getRequirement().getRevision();
                if (declaringBundle != bundle && !closure.contains(declaringBundle)) {
                    // Requirement is declared by an attached fragment, which is
                    // not included into the closure.
                    continue;
                }
                BundleRevision provider = wire.getCapability().getRevision();
                // Use revision of required capability to support the case if
                // fragments contribute new packages to their host's API.
                if (provider instanceof BundleDescription && (includeOptional || !isOptional(wire.getRequirement()))) {
                    BundleDescription requiredBundle = (BundleDescription) provider;
                    addNewRequiredBundle(requiredBundle, bundleFilter, closure, pending);
                }
            }
        }
        return closure;
    }

    private static void addNewRequiredBundle(BundleDescription bundle, Predicate<BundleDescription> filter,
            Set<BundleDescription> requiredBundles, Queue<BundleDescription> pending) {
        if (bundle != null && filter.test(bundle) && !bundle.isRemovalPending() && requiredBundles.add(bundle)) {
            pending.add(bundle);
        }
    }

    private static boolean isOptional(BundleRequirement requirement) {
        return Constants.RESOLUTION_OPTIONAL.equals(requirement.getDirectives().get(Constants.RESOLUTION_DIRECTIVE));
    }

    private static boolean isTestWorkspaceProject(Resource f) {
        // Be defensive when declaring a fragment as 'test'-fragment
        IPluginModelBase pluginModel = PluginRegistry.findModel(f);
        if (pluginModel != null) {
            IResource resource = pluginModel.getUnderlyingResource();
            if (resource != null) {
                return ClasspathComputer.hasTestOnlyClasspath(resource.getProject());
            } // test-fragments are usually not part of the target-platform
        }
        return false;
    }
}
