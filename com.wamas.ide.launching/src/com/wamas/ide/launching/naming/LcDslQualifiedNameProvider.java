/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.naming;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.base.Splitter;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.lcDsl.PluginWithVersion;

public class LcDslQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

    protected QualifiedName qualifiedName(LaunchConfig config) {
        if (config.isQualify()) {
            if (config.getQualifierId() != null) {
                return QualifiedName.create(Splitter.on('.').splitToList(config.getQualifierId())).append(config.getName());
            }

            IFile f = ResourcesPlugin.getWorkspace().getRoot()
                    .getFile(new Path(config.eResource().getURI().toPlatformString(true)));
            if (f != null && f.exists()) {
                return QualifiedName.create(Splitter.on('.').splitToList(f.getProject().getName())).append(config.getName());
            }
        }

        return QualifiedName.create(config.getName());
    }

    protected QualifiedName qualifiedName(PluginWithVersion plugin) {
        QualifiedName containerName = qualifiedName(findLc(plugin));

        if (plugin.getVersion() == null) {
            return containerName.append(plugin.getName());
        } else {
            return containerName.append(plugin.getName()).append(plugin.getVersion());
        }
    }

    private LaunchConfig findLc(EObject contained) {
        if (contained.eContainer() instanceof LaunchConfig) {
            return (LaunchConfig) contained.eContainer();
        }

        if (contained.eContainer() == null) {
            return null;
        }

        return findLc(contained.eContainer());
    }

}
