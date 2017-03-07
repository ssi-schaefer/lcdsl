/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;

import com.google.inject.Injector;
import com.wamas.ide.launching.generator.StandaloneLaunchConfigGenerator;
import com.wamas.ide.launching.lcDsl.LCModel;
import com.wamas.ide.launching.ui.internal.LaunchingActivator;

public class LcDslInjectionHelper {

    public static Injector getLcDslInjector() {
        return LaunchingActivator.getInstance().getInjector(LaunchingActivator.COM_WAMAS_IDE_LAUNCHING_LCDSL);
    }

    public static LCModel loadModelFromSingleFile(IFile file) {
        ResourceSet rs = getLcDslInjector().getInstance(ResourceSet.class);
        Resource r = rs.getResource(URI.createFileURI(file.getLocation().toFile().getAbsolutePath()), true);

        if (r == null || r.getContents().isEmpty() || r.getContents().size() != 1) {
            throw new IllegalStateException("file does not contain a launch configuration model");
        }

        LCModel m = (LCModel) r.getContents().get(0);
        EcoreUtil2.resolveAll(m);
        return m;
    }

    public static StandaloneLaunchConfigGenerator getGenerator() {
        return getLcDslInjector().getInstance(StandaloneLaunchConfigGenerator.class);
    }

}
