/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.generator

import com.wamas.ide.launching.lcDsl.LaunchConfig
import java.util.List
import java.util.function.Function

/**
 * Collects raw values for launch configuration fields, taking into account inheritance
 */
class RecursiveCollectors {

	static def List<String> collectArguments(LaunchConfig config) {
		collectFlatList(config, [progArgs.map[arguments.map[value]].flatten])
	}
	
	static def List<String> collectVmArguments(LaunchConfig config) {
		var result = newArrayList

		val mem = config.memory
		if (mem != null) {
			if (mem.min > 0)
				result.add("-Xms" + mem.min + mem.minUnit.literal)
			if (mem.max > 0)
				result.add("-Xmx" + mem.max + mem.maxUnit.literal)
			if (mem.perm > 0)
				result.add("-XX:MaxPermSize=" + mem.perm + mem.permUnit.literal)
		}

		result.addAll(collectFlatList(config, [vmArgs.map[arguments.map[value]].flatten]))
		result
	}
	
	static def collectJavaMainType(LaunchConfig config) {
		collectFlatObject(config, [mainType.mainClass.name])
	}
	
	static def collectJavaMainProject(LaunchConfig config) {
		collectFlatObject(config, [mainProject.project.name])
	}
	
	static def collectJavaStopInMain(LaunchConfig config) {
		collectFlatObject(config, [stopInMain])
	}

	/**
	 * Collects a single attribute from a launch configuration model, traversing supertypes if necessary 
	 */
	private static def <T> T collectFlatObject(LaunchConfig config, Function<LaunchConfig, T> extractor) {
		val o = extractor.apply(config)
		
		if(o != null)
			return o
		
		if(config.superConfig != null)
			return collectFlatObject(config.superConfig, extractor)
		
		return null;
	}

	/**
	 * Collects a list of elements for an attribute from a launch configuration mode, traversing all supertypes 
	 */
	private static def <T> List<T> collectFlatList(LaunchConfig config,
		Function<LaunchConfig, Iterable<T>> extractor) {
		var result = newArrayList()

		if (config.superConfig != null) {
			result.addAll(collectFlatList(config.superConfig, extractor))
		}

		result.addAll(extractor.apply(config))
		result
	}

}
