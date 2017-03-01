/*
 * Copyright (c) Salomon Automation GmbH
 */
package com.wamas.ide.launching.generator

import com.google.common.base.Joiner
import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.LaunchConfigType
import com.wamas.ide.launching.lcDsl.ProgramArgument
import java.util.List
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.core.ILaunchManager
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants
import org.eclipse.pde.ui.launcher.EclipseLaunchShortcut

class StandaloneLaunchConfigGenerator {

	val launchMgr = DebugPlugin.^default.launchManager

	public static final String CONFIGURATION_TYPE_RAP = "org.eclipse.rap.ui.launch.RAPLauncher";
	public static final String CONFIGURATION_TYPE_GROUP = "org.eclipse.debug.core.groups.GroupLaunchConfigurationType";

	static val TYPE_MAP = newHashMap(
		LaunchConfigType.JAVA -> IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION,
		LaunchConfigType.ECLIPSE -> EclipseLaunchShortcut.CONFIGURATION_TYPE,
		LaunchConfigType.RAP -> CONFIGURATION_TYPE_RAP,
		LaunchConfigType.GROUP -> CONFIGURATION_TYPE_GROUP
	)

	static def getType(ILaunchManager mgr, LaunchConfigType type) {
		mgr.getLaunchConfigurationType(TYPE_MAP.get(type))
	}
	
	static def getTypeName(LaunchConfigType type) {
		TYPE_MAP.get(type)
	}

	def generate(LaunchConfig config) {
		System.err.println("generating " + config.name)

		val copy = reCreateConfig(config)
		if (copy == null) {
			return // type not supported
		}

		copy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,
			Joiner.on(' ').join(collectArguments(config)))

		switch (config.type) {
			case LaunchConfigType.JAVA:
				generateJava(config, copy)
			case ECLIPSE:
				generateEclipse(config, copy)
			case GROUP:
				generateGroup(config, copy)
			case RAP:
				generateRAP(config, copy)
		}

		copy.doSave
	}

	def List<String> collectArguments(LaunchConfig config) {
		val result = newArrayList()

		if (config.superConfig != null) {
			result.addAll(collectArguments(config.superConfig))
		}

		for (ProgramArgument pa : config.progArgs) {
			// multiple arguments per entry supported.
			result.addAll(pa.arguments.map[value])
		}

		return result;
	}

	def reCreateConfig(LaunchConfig config) {
		val type = getType(launchMgr, config.type)

		if (type == null)
			return null;

		val lc = launchMgr.getLaunchConfigurations(type).findFirst[l|l.name.equals(config.name)]

		lc?.delete

		return type.newInstance(null, config.name)
	}

	def generateJava(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
	}

	def generateEclipse(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
	}

	def generateRAP(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
	}

	def generateGroup(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
	}

}
