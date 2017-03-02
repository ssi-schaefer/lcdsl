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
import org.eclipse.debug.ui.IDebugUIConstants
import org.eclipse.pde.launching.IPDELauncherConstants
import java.util.Map

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
		if (config == null || config.abstract)
			return;

		if (config.hasError) {
			Activator.log(IStatus.ERROR, "launch configuration has errors, not generating " + config.name, null)
			return
		}

		val copy = reCreateConfig(config)
		if (copy == null) {
			Activator.log(IStatus.ERROR, "cannot create launch configuration " + config.name, null)
			return
		}

		if (config.type != LaunchConfigType.GROUP) {
			copy.setIfAvailable(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,
				Joiner.on(' ').join(config.collectArguments))
			copy.setIfAvailable(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS,
				Joiner.on(' ').join(config.collectVmArguments))
			
			val out = config.collectRedirectOutFile
			if(out != null && !out.trim.empty) {
				copy.setAttribute(IDebugUIConstants.ATTR_APPEND_TO_FILE, config.collectRedirectOutAppend)
				copy.setAttribute(IDebugUIConstants.ATTR_CAPTURE_IN_FILE, out)
			}
			copy.setIfAvailable(IDebugUIConstants.ATTR_CAPTURE_STDIN_FILE, config.collectRedirectInFile)
			copy.setAttribute(IDebugUIConstants.ATTR_CAPTURE_IN_CONSOLE, !config.collectNoConsole)
			copy.setAttribute("org.eclipse.debug.core.appendEnvironmentVariables", !config.collectReplaceEnv)
			
			val env = config.collectEnvMap
			if(env != null && !env.empty) {
				copy.setAttribute("org.eclipse.debug.core.environmentVariables", env)
			}
			
			copy.setIfAvailable(IJavaLaunchConfigurationConstants.ATTR_JRE_CONTAINER_PATH, config.collectExecEnvPath)
		}

		copy.setIfAvailable(IJavaLaunchConfigurationConstants.ATTR_WORKING_DIRECTORY, config.collectWorkingDir)
		copy.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, !config.collectForeground)
		
		val favGroups = config.collectFavoriteGroups
		if(favGroups != null && !favGroups.empty) {
			copy.setAttribute(IDebugUIConstants.ATTR_FAVORITE_GROUPS, favGroups)
		}
		
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

	def setIfAvailable(ILaunchConfigurationWorkingCopy l, String attr, String value) {
		if (value != null && !value.trim.empty) {
			l.setAttribute(attr, value.trim)
		}
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
		copy.setIfAvailable(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, config.collectJavaMainType)
		copy.setIfAvailable(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, config.collectJavaMainProject)
		copy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_STOP_IN_MAIN, config.collectJavaStopInMain)

		copy.setAttribute("org.eclipse.jdt.debug.ui.CONSIDER_INHERITED_MAIN", config.collectJavaMainSearchInherited)
		copy.setAttribute("org.eclipse.jdt.debug.ui.INCLUDE_EXTERNAL_JARS", config.collectJavaMainSearchSystem)
	}
	
	def generateCommonEclipseRap(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		copy.setAttribute(IPDELauncherConstants.AUTOMATIC_VALIDATE, !config.collectNoValidate)
		
		val clear = config.collectClearOptions
		if(clear != null) {
			copy.setAttribute(IPDELauncherConstants.CONFIG_CLEAR_AREA, clear.config)
			copy.setAttribute(IPDELauncherConstants.ASKCLEAR, !clear.noAskClear)
			copy.setAttribute(IPDELauncherConstants.DOCLEAR, clear.workspace || clear.log)
			copy.setAttribute(IPDELauncherConstants.DOCLEAR + "log", clear.log)
		}
		
		val traces = config.collectTracing
		if(traces != null) {
			copy.setAttribute(IPDELauncherConstants.TRACING, true)
			copy.setAttribute(IPDELauncherConstants.TRACING_CHECKED, Joiner.on(',').join(traces.keySet))
			copy.setAttribute(IPDELauncherConstants.TRACING_OPTIONS, traces.mapTraceOptions)
		}
	}
	
	private def mapTraceOptions(Map<String, Iterable<String>> tracing) {
		val opts = newHashMap
		
		for(e : tracing.entrySet) {
			for(o : e.value) {
				opts.put(e.key + "/" + o, Boolean.TRUE.toString)
			}
		}
		
		opts
	}

	def generateEclipse(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		generateCommonEclipseRap(config, copy)
		
		copy.setIfAvailable(IPDELauncherConstants.LOCATION, config.collectWorkspace)
		copy.setIfAvailable(IPDELauncherConstants.APPLICATION, config.collectApplication)
		copy.setIfAvailable(IPDELauncherConstants.PRODUCT, config.collectProduct)
		
		copy.setAttribute(IPDELauncherConstants.GENERATE_PROFILE, config.collectSwInstall)
		
		val cfg = config.collectConfigIniTemplate
		if(cfg != null && !cfg.empty) {
			copy.setAttribute(IPDELauncherConstants.CONFIG_TEMPLATE_LOCATION, cfg)
			copy.setAttribute(IPDELauncherConstants.CONFIG_GENERATE_DEFAULT, false)
		}
		
		// TODO: add plugin / explicit
		// TODO: add feature
		// TODO: add content-provider (product)
		// TODO: ignore plugin
	}

	def generateRAP(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		generateCommonEclipseRap(config, copy)
		
		copy.setIfAvailable("org.eclipse.rap.launch.dataLocation", config.collectWorkspace)
		
		// TODO: servlet config
		// TODO: add plugin / explicit
		// TODO: add feature
		// TODO: add content-provider (product)
		// TODO: ignore plugin
	}

	def generateGroup(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		// TODO: members
	}

}
