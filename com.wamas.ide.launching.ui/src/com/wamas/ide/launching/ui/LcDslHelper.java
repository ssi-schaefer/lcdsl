/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.debug.ui.launchview.launcher.StandaloneLaunchConfigExecutor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.wamas.ide.launching.generator.StandaloneLaunchConfigGenerator;
import com.wamas.ide.launching.lcDsl.LCModel;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.ui.internal.LaunchingActivator;

/**
 * Provides programmatic access to launch configuration loading and generation
 */
public class LcDslHelper {

    public static final String MODE_RUN = "run";
    public static final String MODE_DEBUG = "debug";

    @Inject
    private StandaloneLaunchConfigGenerator generator;

    @Inject
    private IResourceDescriptions index;

    @Inject
    private Provider<ResourceSet> rsProvider;

    private static LcDslHelper INSTANCE;

    /**
     * @return the LcDslHelper instance.
     */
    public synchronized static LcDslHelper getInstance() {
        if (INSTANCE == null) {
            INSTANCE = getInjector().getInstance(LcDslHelper.class);
        }
        return INSTANCE;
    }

    /**
     * @return the {@link Injector} used for LcDsl. Use with care.
     */
    public static Injector getInjector() {
        return LaunchingActivator.getInstance().getInjector(LaunchingActivator.COM_WAMAS_IDE_LAUNCHING_LCDSL);
    }

    /**
     * Loads the complete model from a file, including all launch configurations in that file.
     *
     * @param file the file to load
     * @return the model
     * @throws RuntimeException in case of an error
     */
    public LCModel loadModel(IFile file) {
        ResourceSet rs = getInjector().getInstance(ResourceSet.class);
        Resource r = rs.getResource(URI.createFileURI(file.getLocation().toFile().getAbsolutePath()), true);

        if (r == null || r.getContents().isEmpty() || r.getContents().size() != 1) {
            throw new IllegalStateException("file does not contain a launch configuration model");
        }

        LCModel m = (LCModel) r.getContents().get(0);
        EcoreUtil2.resolveAll(m);
        return m;
    }

    /**
     * Finds a launch configuration with the given name, loading launch configurations from the given file.
     *
     * @param name the name to look for
     * @param file the file to load from
     * @return the launch configuration or <code>null</code>
     * @throws RuntimeException in case the file is not valid
     */
    public LaunchConfig findLaunchConfig(String name, IFile file) {
        LCModel model = loadModel(file);

        for (LaunchConfig c : model.getConfigurations()) {
            if (generator.fullName(c).equals(name)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Finds a launch configuration with the given name from the current EMF index. The index contains all
     * launch configurations from projects that have the Xtext nature. Launch configurations from projects
     * without the Xtext nature are not found. Use {@link #findLaunchConfig(String, IFile)} in this case.
     *
     * @param name the name of the configuration to find
     * @return the configuration or <code>null</code>
     */
    public LaunchConfig findLaunchConfig(String name) {
        Iterable<IEObjectDescription> indexed = index.getExportedObjectsByType(LcDslPackage.eINSTANCE.getLaunchConfig());

        for (IEObjectDescription o : indexed) {
            if (o.getName().getLastSegment().equals(name)) {
                EObject obj = EcoreUtil.resolve(o.getEObjectOrProxy(), rsProvider.get());
                EcoreUtil.resolveAll(obj);
                return (LaunchConfig) obj;
            }
        }
        return null;
    }

    /**
     * Generate the Eclipse {@link ILaunchConfiguration} from the given {@link LaunchConfig} model.
     *
     * @param config the configuration to generate
     * @return the actual generated {@link ILaunchConfiguration} or <code>null</code>
     */
    public ILaunchConfiguration generate(LaunchConfig config) {
        return generator.generate(config);
    }

    /**
     * Launches the given {@link LaunchConfig}. Does not wait for the process to exit.
     *
     * @param config the configuration to launch
     * @param mode the mode to use. See {@link ILaunchMode}
     * @return 0 on success, -1 on failure.
     */
    public int launch(LaunchConfig config, String mode) {
        return launch(config, mode, false, false, null);
    }

    /**
     * Launches the given {@link LaunchConfig}.
     *
     * @param config the configuration to launch
     * @param mode the mode to use. See {@link ILaunchMode}
     * @param build whether to build before launch
     * @param wait whether to wait for the process to finish
     * @param log a log file to write console output to or <code>null</code>. This has no effect on the presence of the console in
     *            the console view.
     * @return 0 on successful launch (if wait is false), the process exit value (if wait is true), -1 on launch failure.
     */
    public int launch(LaunchConfig config, String mode, boolean build, boolean wait, File log) {
        return launch(config, mode, build, wait, log, false);
    }

    /**
     * Launches the given {@link LaunchConfig}. Waits for the process to finish and removes the generated
     * {@link ILaunchConfiguration} afterwards.
     *
     * @param config the configuration to launch
     * @param mode the mode to use. See {@link ILaunchMode}
     * @return the process exit value, -1 on launch failure.
     */
    public int launchWaitAndRemove(LaunchConfig config, String mode) {
        return launch(config, mode, false, true, null, true);
    }

    /**
     * Launches the given {@link LaunchConfig}. Waits for the process to finish and removes the generated
     * {@link ILaunchConfiguration} afterwards. Writes output to the given log file.
     *
     * @param config the configuration to launch
     * @param mode the mode to use. See {@link ILaunchMode}
     * @param log the log file to write output to.
     * @return the process exit value, -1 on launch failure.
     */
    public int launchWaitAndRemove(LaunchConfig config, String mode, File log) {
        return launch(config, mode, false, true, log, true);
    }

    private int launch(LaunchConfig config, String mode, boolean build, boolean wait, File log, boolean removeAfterLaunch) {
        ILaunchConfiguration c = generate(config);
        if (c == null) {
            return -1;
        }

        try {
            try {
                return StandaloneLaunchConfigExecutor.launchProcess(c, mode, build, wait, log);
            } finally {
                if (removeAfterLaunch) {
                    c.delete();
                }
            }
        } catch (Exception e) {
            // TODO log it
            return -1;
        }
    }

}
