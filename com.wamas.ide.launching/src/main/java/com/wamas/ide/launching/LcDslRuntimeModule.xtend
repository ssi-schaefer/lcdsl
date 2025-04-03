/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching

import com.wamas.ide.launching.naming.LcDslQualifiedNameProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.impl.SimpleResourceDescriptionsBasedContainerManager

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class LcDslRuntimeModule extends AbstractLcDslRuntimeModule {

	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		LcDslQualifiedNameProvider
	}

	override bindIContainer$Manager() {
		SimpleResourceDescriptionsBasedContainerManager
	}
	
	override Class<? extends XtextResource> bindXtextResource() {
		return LcDslResource;
	}

}
