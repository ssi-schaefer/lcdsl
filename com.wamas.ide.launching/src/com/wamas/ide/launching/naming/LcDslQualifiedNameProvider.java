/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.naming;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.base.Splitter;
import com.wamas.ide.launching.lcDsl.LaunchConfig;

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

}
