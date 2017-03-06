/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.generator

import com.google.inject.Inject
import com.wamas.ide.launching.lcDsl.LaunchConfig
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.debug.core.DebugPlugin
import java.util.List
import com.wamas.ide.launching.Activator
import org.eclipse.core.runtime.IStatus

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LcDslGenerator extends AbstractGenerator {

	@Inject
	extension StandaloneLaunchConfigGenerator generator

	private static List<Runnable> listeners = newArrayList

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (x : resource.allContents.filter(typeof(LaunchConfig)).toIterable) {
			if (x.needsGeneration)
				x.generate
		}

		try {
			listeners.forEach[run]
		} catch (Exception e) {
			Activator.log(IStatus.ERROR, "generator listener threw an exception", e)
		}
	}

	def boolean needsGeneration(LaunchConfig config) {
		if (!isTypeSupported(config))
			return false

		if (config.abstract)
			return false

		// always generate if the launch config is already there to update it, regardless of 'manual' mode.
		for (lc : DebugPlugin.^default.launchManager.launchConfigurations) {
			if (lc.name.equals(config.name))
				return true
		}

		!config.manual
	}

	def static boolean isTypeSupported(LaunchConfig config) {
		StandaloneLaunchConfigGenerator.getType(DebugPlugin.^default.launchManager, config.type) != null
	}

	def static addListener(Runnable r) {
		listeners.add(r)
	}

	def static removeListener(Runnable r) {
		listeners.remove(r)
	}

}
