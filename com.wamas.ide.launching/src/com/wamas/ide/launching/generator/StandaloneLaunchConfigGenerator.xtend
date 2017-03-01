/*
 * Copyright (c) Salomon Automation GmbH
 */
package com.wamas.ide.launching.generator

import com.google.common.base.Joiner
import com.wamas.ide.launching.Activator
import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.LaunchConfigType
import org.eclipse.core.runtime.IStatus
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.core.ILaunchManager
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants
import org.eclipse.pde.ui.launcher.EclipseLaunchShortcut

import static extension com.wamas.ide.launching.generator.RecursiveCollectors.*

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
		if (config == null)
			return;

		if (config.hasError) {
			Activator.log(IStatus.ERROR, "launch configuration has errors, not generating " + config.name, null);
		}

		val copy = reCreateConfig(config)
		if (copy == null) {
			Activator.log(IStatus.ERROR, "cannot create launch configuration " + config.name, null)
			return
		}

		if (config.type != LaunchConfigType.GROUP) {
			copy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,
				Joiner.on(' ').join(config.collectArguments))
			copy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS,
				Joiner.on(' ').join(config.collectVmArguments))
			// TODO: no-console (!groups)
			// TODO: redirect (!groups)
			// TODO: replace-env (!groups)
			// TODO: env-vars (!groups)
		}

		// TODO: foreground
		// TODO: workingDir
		// TODO: favorites
		
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

	def hasError(LaunchConfig config) {
		val diagnostic = Diagnostician.INSTANCE.validate(config);
		return diagnostic.severity > Diagnostic.WARNING
	}

	def reCreateConfig(LaunchConfig config) {
		val type = getType(launchMgr, config.type)

		if (type == null) {
			Activator.log(IStatus.ERROR, "unsupported launch configuration type " + config.type.literal, null);
			return null;
		}

		val lc = launchMgr.getLaunchConfigurations(type).findFirst[l|l.name.equals(config.name)]

		lc?.delete

		return type.newInstance(null, config.name)
	}

	def generateJava(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		copy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME,
				config.collectJavaMainType)
		copy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,
				config.collectJavaMainProject)
		copy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_STOP_IN_MAIN,
				config.collectJavaStopInMain)
		
		// TODO: main type search
	}

	def generateEclipse(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		// TODO: no validate
		// TODO: sw-install-allowed
		// TODO: clear options
		// TODO: workspace
		// TODO: application
		// TODO: product
		// TODO: config.ini
		// TODO: add plugin / explicit
		// TODO: ignore plugin
		// TODO: traces
	}

	def generateRAP(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		// TODO: no validate (check eclipse share)
		// TODO: clear options (check eclipse share)
		// TODO: workspace (check eclipse share)
		// TODO: traces (check eclipse share)
		// TODO: servlet config
		// TODO: add plugin / explicit
		// TODO: ignore plugin
	}

	def generateGroup(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		// members
	}

}
