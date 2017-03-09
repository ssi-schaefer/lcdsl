/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.services;

import com.wamas.ide.launching.lcDsl.LaunchConfig;

/**
 * Service registered using this interface have the chance to post process a given launch configuration.
 * <p>
 * Post processing happens before generation of the actual Eclipse launch configuration. A common use case for this interception
 * of the generation is to set a common workspace path for all launch configurations that don't explicitly specify one.
 */
public interface LcDslPostProcessor {

    /**
     * Applies changes to the launch configuration. Allows to completely replace the configuration, or simply change certain
     * things.
     * <p>
     * Attention: post processors MUST make sure to create a copy of the objects changed to avoid problems with editor
     * representations, etc. The passed in launch config MAY be the real object backed by the actual files on disk.
     *
     * @param lc the launch configuration - copy if appropriate!
     * @return a post processes launch configuration if required.
     */
    public LaunchConfig apply(LaunchConfig lc);

}
