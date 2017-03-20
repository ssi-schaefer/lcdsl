/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import com.wamas.ide.launching.lcDsl.LaunchConfig
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.resource.IResourceDescriptions
import com.google.inject.Inject
import com.wamas.ide.launching.lcDsl.LcDslPackage
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class LcDslScopeProvider extends AbstractDeclarativeScopeProvider {

	@Inject
	IResourceDescriptions index;

	def scope_LaunchConfig_superConfig(LaunchConfig config, EReference ref) {
		val allLcs = index.getExportedObjectsByType(LcDslPackage.eINSTANCE.launchConfig);
		
		Scopes.scopeFor(allLcs.filter[!name.lastSegment.equals(config.name)].map[EcoreUtil.resolve(EObjectOrProxy, config)])
	}

}
