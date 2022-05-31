/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.debug.ui.launchview.LaunchConfigurationViewPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.wamas.ide.launching.generator.StandaloneLaunchConfigGenerator;
import com.wamas.ide.launching.lcDsl.LCModel;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.ui.internal.LaunchingActivator;

/**
 * Provides programmatic access to launch configuration loading and generation
 */
@SuppressWarnings("restriction")
public class LcDslHelper {

    /** Controls how many lines of logfile are appended in case of error **/
    public static int TAIL_LINES = Integer.getInteger("LcDslHelper.tailLines", 40);
    public static final String MODE_RUN = "run";
    public static final String MODE_DEBUG = "debug";

    @Inject
    private StandaloneLaunchConfigGenerator generator;

    @Inject
    private IResourceDescriptions index;

    @Inject
    private IResourceSetProvider resourceSetProvider;

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
        ResourceSet rs = resourceSetProvider.get(file.getProject());
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
                EObject obj = EcoreUtil.resolve(o.getEObjectOrProxy(), resourceSetProvider.get(null));
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
     */
    public void launch(LaunchConfig config, String mode) {
        launch(config, mode, false, false, null);
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
     */
    public void launch(LaunchConfig config, String mode, boolean build, boolean wait, File log) {
        launch(config, mode, build, wait, log, false);
    }

    /**
     * Launches the given {@link LaunchConfig}. Waits for the process to finish and removes the generated
     * {@link ILaunchConfiguration} afterwards.
     *
     * @param config the configuration to launch
     * @param mode the mode to use. See {@link ILaunchMode}
     */
    public void launchWaitAndRemove(LaunchConfig config, String mode) {
        launch(config, mode, false, true, null, true);
    }

    /**
     * Launches the given {@link LaunchConfig}. Waits for the process to finish and removes the generated
     * {@link ILaunchConfiguration} afterwards. Writes output to the given log file.
     *
     * @param config the configuration to launch
     * @param mode the mode to use. See {@link ILaunchMode}
     * @param log the log file to write output to.
     */
    public void launchWaitAndRemove(LaunchConfig config, String mode, File log) {
        launch(config, mode, false, true, log, true);
    }

    private void launch(LaunchConfig config, String mode, boolean build, boolean wait, File log, boolean removeAfterLaunch) {
        ILaunchConfiguration c = generate(config);
        if (c == null) {
            throw new RuntimeException("Cannot generate " + config.getName());
        }

        try {
            try {
                int exitCode = LaunchConfigurationViewPlugin.getExecutor().launchProcess(c, mode, build, wait, log);
                if (exitCode != 0) {
                    if (TAIL_LINES > 0 && log != null && log.exists()) {
                        try {
                            String encoding = c.getAttribute(DebugPlugin.ATTR_CONSOLE_ENCODING, "UTF-8");
                            List<String> lines = Files.readAllLines(log.toPath(), Charset.forName(encoding));
                            String tail = lines.stream().skip(Math.max(0, lines.size() - TAIL_LINES)).map(s -> "> " + s)
                                    .collect(Collectors.joining("\n"));
                            RuntimeException e = new RuntimeException(
                                    "Process " + config.getName() + " did exit with error " + exitCode);
                            e.addSuppressed(new Throwable("Logfile tail appended.\n--------- last " + TAIL_LINES
                                    + " lines of LogFile:\n" + tail + "\n--------- logfile end."));
                            throw e;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    throw new RuntimeException(
                            "Process " + config.getName() + " did exit with error " + exitCode + ". Logfile does not exist.");
                }
            } finally {
                if (removeAfterLaunch) {
                    c.delete();
                }
            }
        } catch (CoreException e) {
            throw new RuntimeException("Internal error when running " + config.getName(), e);
        }
    }

}
