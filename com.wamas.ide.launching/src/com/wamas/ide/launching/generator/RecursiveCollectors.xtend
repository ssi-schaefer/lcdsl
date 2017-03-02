/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.generator

import com.wamas.ide.launching.lcDsl.EnvironmentVariable
import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.LaunchModeType
import java.util.List
import java.util.Map
import java.util.function.Function
import org.eclipse.debug.ui.IDebugUIConstants
import org.eclipse.jdt.launching.JavaRuntime

/**
 * Collects raw values for launch configuration fields, taking into account inheritance
 */
class RecursiveCollectors {

	static Map<LaunchModeType, String> favoriteGroupMap = newHashMap(
		LaunchModeType.RUN -> IDebugUIConstants.ID_RUN_LAUNCH_GROUP,
		LaunchModeType.DEBUG -> IDebugUIConstants.ID_DEBUG_LAUNCH_GROUP,
		LaunchModeType.PROFILE -> IDebugUIConstants.ID_PROFILE_LAUNCH_GROUP,
		LaunchModeType.COVERAGE -> "com.mountainminds.eclemma.ui.launchGroup.coverage"
	)
	
	static def mapToFavoriteType(LaunchModeType t) {
		favoriteGroupMap.get(t)
	}

	static def List<String> collectArguments(LaunchConfig config) {
		collectFlatList(config, [progArgs?.map[arguments?.map[value]]?.flatten])
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

		result.addAll(collectFlatList(config, [vmArgs?.map[arguments?.map[value]]?.flatten]))
		result
	}

	static def collectJavaMainType(LaunchConfig config) {
		collectFlatObject(config, [mainType?.mainClass?.name])
	}

	static def collectJavaMainProject(LaunchConfig config) {
		collectFlatObject(config, [mainProject?.project?.name])
	}

	static def collectJavaStopInMain(LaunchConfig config) {
		collectFlatBoolean(config, true, [stopInMain])
	}
	
	static def collectJavaMainSearchInherited(LaunchConfig config) {
		collectFlatBoolean(config, true, [javaMainSearch?.inherited])
	}
	
	static def collectJavaMainSearchSystem(LaunchConfig config) {
		collectFlatBoolean(config, true, [javaMainSearch?.system])
	}
	
	static def collectWorkingDir(LaunchConfig config) {
		collectFlatObject(config, [workingDir?.workingDir?.name?.value])
	}
	
	static def collectRedirectOutFile(LaunchConfig config) {
		collectFlatObject(config, [redirect?.outFile?.name?.value])
	}
	
	static def collectRedirectOutAppend(LaunchConfig config) {
		collectFlatBoolean(config, false, [
			if(redirect == null)
				return true
			redirect.noAppend
		])
	}
	
	static def collectRedirectInFile(LaunchConfig config) {
		collectFlatObject(config, [redirect?.inFile?.name?.value])
	}
	
	static def collectNoConsole(LaunchConfig config) {
		collectFlatBoolean(config, true, [noConsole])
	}
	
	static def collectReplaceEnv(LaunchConfig config) {
		collectFlatBoolean(config, true, [replaceEnv])
	}
	
	static def collectForeground(LaunchConfig config) {
		collectFlatBoolean(config, true, [foreground])
	}
	
	static def collectNoValidate(LaunchConfig config) {
		collectFlatBoolean(config, true, [noValidate])
	}
	
	static def collectWorkspace(LaunchConfig config) {
		collectFlatObject(config, [workspace?.workspace?.name?.value])
	}
	
	static def collectClearOptions(LaunchConfig config) {
		collectFlatObject(config, [clears])
	}
	
	static def collectTracing(LaunchConfig config) {
		collectFlatList(config, [traces])?.groupBy[plugin].mapValues[map[what].flatten]
	}
	
	static def collectApplication(LaunchConfig config) {
		collectFlatObject(config, [application?.name])
	}
	
	static def collectProduct(LaunchConfig config) {
		collectFlatObject(config, [product?.name])
	}
	
	static def collectSwInstall(LaunchConfig config) {
		collectFlatBoolean(config, true, [swInstallSupport])
	}
	
	static def collectConfigIniTemplate(LaunchConfig config) {
		collectFlatObject(config, [configIniTemplate?.path?.name?.value])
	}
	
	static def collectExecEnvPath(LaunchConfig config) {
		val e = collectFlatObject(config, [execEnv?.name])
		if(e != null && !e.empty) {
			return JavaRuntime.newJREContainerPath(JavaRuntime.getExecutionEnvironmentsManager().getEnvironment(e))?.toPortableString
		}
		null
	}
	
	static def collectFavoriteGroups(LaunchConfig config) {
		collectFlatList(config, [
			favorites?.types?.map[favoriteGroupMap.get(it)]
		])
	}
	
	static def collectEnvMap(LaunchConfig config) {
		collectFlatEnvMap(config)
	}
	
	private static def Map<String, String> collectFlatEnvMap(LaunchConfig config) {
		val o = newHashMap()
		
		if(config.superConfig != null) {
			o.putAll(collectFlatEnvMap(config.superConfig))
		}
		
		o.putAll(config.envVars.envVarsToMap)
		o
	}
	
	private static def Map<String, String> envVarsToMap(Iterable<EnvironmentVariable> vars) {
		val r = newHashMap()
		
		if(vars != null && !vars.empty) {
			vars.forEach[r.put(name, value.value)]
		}
		
		r
	}

	/**
	 * Collects a single attribute from a launch configuration model, traversing supertypes if necessary 
	 */
	private static def <T> T collectFlatObject(LaunchConfig config, Function<LaunchConfig, T> extractor) {
		val o = extractor.apply(config)

		if (o != null)
			return o

		if (config.superConfig != null)
			return collectFlatObject(config.superConfig, extractor)

		return null;
	}

	/**
	 * Collects a list of elements for an attribute from a launch configuration mode, traversing all supertypes 
	 */
	private static def <T> List<T> collectFlatList(LaunchConfig config, Function<LaunchConfig, ? extends Iterable<T>> extractor) {
		var result = newArrayList()

		if (config.superConfig != null) {
			result.addAll(collectFlatList(config.superConfig, extractor))
		}

		val v = extractor.apply(config)
		if(v != null)
			result.addAll(v)
			
		result
	}

	/**
	 * Checks the launch configuration hierarchy for the given boolean having the expected value.
	 * 
	 * @return true if any of the launch configurations in the hierarchy has a extracts the expected boolean value. false otherwise.
	 */
	private static def boolean collectFlatBoolean(LaunchConfig config, boolean expected,
		Function<LaunchConfig, Boolean> extractor) {
		val o = extractor.apply(config)

		if (o != null && o == expected)
			return true

		if (config.superConfig != null)
			return collectFlatBoolean(config.superConfig, expected, extractor)

		return false;
	}

}
