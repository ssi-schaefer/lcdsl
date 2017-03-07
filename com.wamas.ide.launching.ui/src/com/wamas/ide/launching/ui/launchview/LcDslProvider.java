/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.launchview;

import java.util.Set;
import java.util.TreeSet;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import com.wamas.ide.launching.generator.LcDslGenerator;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.ui.LcDslInjectionHelper;
import com.wamas.ide.launchview.services.AbstractLaunchObjectProvider;
import com.wamas.ide.launchview.services.LaunchObject;
import com.wamas.ide.launchview.services.LaunchObjectProvider;

@Component(service = LaunchObjectProvider.class)
public class LcDslProvider extends AbstractLaunchObjectProvider implements LaunchObjectProvider {

    private final ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
    private final Runnable generatorListener = () -> fireUpdate();

    @Activate
    public void createService() {
        LcDslGenerator.addListener(generatorListener);
    }

    @Deactivate
    public void destroyService() {
        LcDslGenerator.removeListener(generatorListener);
    }

    @Override
    public Set<LaunchObject> getLaunchObjects() {
        IResourceDescriptions index = LcDslInjectionHelper.getLcDslInjector().getInstance(IResourceDescriptions.class);
        ResourceSet set = LcDslInjectionHelper.getLcDslInjector().getInstance(ResourceSet.class);

        Set<LaunchObject> result = new TreeSet<>();
        Iterable<IEObjectDescription> descs = index.getExportedObjectsByType(LcDslPackage.eINSTANCE.getLaunchConfig());
        for (IEObjectDescription obj : descs) {
            EObject lc = EcoreUtil2.resolve(obj.getEObjectOrProxy(), set);
            if (lc instanceof LaunchConfig) {
                if (!((LaunchConfig) lc).isAbstract()) {
                    result.add(new LcDslLaunchObject((LaunchConfig) lc));
                }
            }
        }

        return result;
    }

    ILaunchConfiguration findLaunchConfiguration(ILaunchConfigurationType type, String name) {
        try {
            for (ILaunchConfiguration config : manager.getLaunchConfigurations(type)) {
                if (config.getName().equals(name)) {
                    return config;
                }
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("cannot fetch existing launch configurations", e);
        }
    }

    @Override
    public int getPriority() {
        return 10; // more prio than the debug core version
    }

}
