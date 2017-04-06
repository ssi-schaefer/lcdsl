/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.launchview;

import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.menu.ItemType;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import com.wamas.ide.launching.generator.LcDslGenerator;
import com.wamas.ide.launching.generator.StandaloneLaunchConfigGenerator;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.ui.LcDslHelper;
import com.wamas.ide.launching.ui.internal.LaunchingActivator;
import com.wamas.ide.launching.ui.internal.LcDslInternalHelper;
import com.wamas.ide.launchview.services.AbstractLaunchObjectProvider;
import com.wamas.ide.launchview.services.LaunchObjectProvider;

@Component(service = LaunchObjectProvider.class)
public class LcDslProvider extends AbstractLaunchObjectProvider implements LaunchObjectProvider {

    private final ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
    private final Runnable generatorListener = () -> fireUpdate();
    private boolean hideManual = true;
    private StandaloneLaunchConfigGenerator generator;

    private static final String HIDE_PREF = "lcdsl.hideManual";

    @Activate
    public void createService() {
        LcDslGenerator.addListener(generatorListener);

        getPreferenceStore().setDefault(HIDE_PREF, true);
        hideManual = getPreferenceStore().getBoolean(HIDE_PREF);
        generator = LcDslHelper.getInjector().getInstance(StandaloneLaunchConfigGenerator.class);
    }

    private IPreferenceStore getPreferenceStore() {
        return LaunchingActivator.getInstance().getPreferenceStore();
    }

    @Deactivate
    public void destroyService() {
        LcDslGenerator.removeListener(generatorListener);
    }

    @Override
    public Set<LcDslLaunchObject> getLaunchObjects() {
        IResourceDescriptions index = LcDslHelper.getInjector().getInstance(IResourceDescriptions.class);
        ResourceSet set = LcDslHelper.getInjector().getInstance(ResourceSet.class);

        Set<LcDslLaunchObject> result = new TreeSet<>();
        Iterable<IEObjectDescription> descs = index.getExportedObjectsByType(LcDslPackage.eINSTANCE.getLaunchConfig());
        for (IEObjectDescription obj : descs) {
            EObject lc = EcoreUtil2.resolve(obj.getEObjectOrProxy(), set);
            if (lc instanceof LaunchConfig) {
                LaunchConfig l = (LaunchConfig) lc;
                if (l.isAbstract()) {
                    continue;
                }

                LcDslLaunchObject o = new LcDslLaunchObject((LaunchConfig) lc);
                if (o.getType() == null) { // unsupported type
                    continue;
                }

                // only hide manual if there is no other object it would be (properly) hiding
                if (hideManual && l.isManual() && findLaunchConfiguration(o.getType(), generator.fullName(l)) == null) {
                    continue;
                }

                result.add(o);
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

    @Override
    public void contributeViewMenu(MMenu menu) {
        MDirectMenuItem hide = MMenuFactory.INSTANCE.createDirectMenuItem();
        hide.setLabel("Hide 'manual' LcDsl configurations");
        hide.setType(ItemType.CHECK);
        hide.setSelected(hideManual);
        hide.setIconURI("platform:/plugin/" + LcDslInternalHelper.PLUGIN_ID + "/icons/clear.gif");
        hide.setObject(new Object() {

            @Execute
            public void toggleHide() {
                hideManual = hide.isSelected();
                getPreferenceStore().setValue(HIDE_PREF, hideManual);
                fireUpdate();
            }

        });

        MDirectMenuItem cleanup = MMenuFactory.INSTANCE.createDirectMenuItem();
        cleanup.setLabel("Remove 'manual' LcDsl artifacts");
        cleanup.setTooltip(
                "Removes all launch configurations from Eclipse that have been generated from a 'manual' LcDsl launch configuration");
        cleanup.setIconURI("platform:/plugin/" + LcDslInternalHelper.PLUGIN_ID + "/icons/clear.gif");
        cleanup.setObject(new Object() {

            @Execute
            public void cleanup() {
                for (LcDslLaunchObject lo : getLaunchObjects()) {
                    if (!lo.getLaunchConfig().isManual()) {
                        continue;
                    }
                    ILaunchConfiguration c = findLaunchConfiguration(lo.getType(), lo.getId());
                    if (c != null) {
                        try {
                            c.delete();
                        } catch (CoreException e) {
                            LcDslInternalHelper.log(IStatus.WARNING, "cannot delete generated configuration " + c.getName(), e);
                        }
                    }
                }
                fireUpdate();
            }
        });

        menu.getChildren().add(MMenuFactory.INSTANCE.createMenuSeparator());
        menu.getChildren().add(hide);
        menu.getChildren().add(cleanup);
    }

}
