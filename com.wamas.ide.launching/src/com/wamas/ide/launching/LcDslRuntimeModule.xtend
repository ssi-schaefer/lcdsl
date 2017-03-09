/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching

import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.wamas.ide.launching.naming.LcDslQualifiedNameProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class LcDslRuntimeModule extends AbstractLcDslRuntimeModule {
	
    override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        LcDslQualifiedNameProvider
    }
	
}
