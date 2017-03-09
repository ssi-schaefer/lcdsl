/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import com.wamas.ide.launching.lcDsl.LaunchConfig;

public class LcDslQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

    protected QualifiedName qualifiedName(LaunchConfig config) {
        return QualifiedName.create(config.getName());
    }

}
