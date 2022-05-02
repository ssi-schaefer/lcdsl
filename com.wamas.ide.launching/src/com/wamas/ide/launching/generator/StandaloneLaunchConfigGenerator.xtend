/*
 * Copyright (c) Salomon Automation GmbH
 */
package com.wamas.ide.launching.generator

import com.google.common.base.Joiner
import com.google.inject.Inject
import com.wamas.ide.launching.Activator
import com.wamas.ide.launching.lcDsl.GroupPostLaunchAction
import com.wamas.ide.launching.lcDsl.GroupPostLaunchDelay
import com.wamas.ide.launching.lcDsl.GroupPostLaunchRegex
import com.wamas.ide.launching.lcDsl.GroupPostLaunchWait
import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.LaunchConfigType
import com.wamas.ide.launching.services.LcDslPostProcessor
import java.io.File
import java.util.Map
import java.util.TreeSet
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IStatus
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.core.ILaunchManager
import org.eclipse.debug.internal.core.groups.GroupLaunchConfigurationDelegate
import org.eclipse.debug.internal.core.groups.GroupLaunchElement
import org.eclipse.debug.ui.IDebugUIConstants
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants
import org.eclipse.pde.core.plugin.PluginRegistry
import org.eclipse.pde.core.plugin.TargetPlatform
import org.eclipse.pde.internal.core.product.WorkspaceProductModel
import org.eclipse.pde.internal.launching.IPDEConstants
import org.eclipse.pde.launching.IPDELauncherConstants
import org.eclipse.pde.ui.launcher.EclipseLaunchShortcut
import org.eclipse.xtext.naming.IQualifiedNameProvider

import static extension com.wamas.ide.launching.generator.RecursiveCollectors.*
import org.eclipse.pde.core.plugin.TargetPlatform
import org.eclipse.jdt.internal.junit.launcher.JUnitLaunchConfigurationConstants
import org.eclipse.jdt.internal.junit.launcher.TestKindRegistry
import org.eclipse.debug.internal.core.LaunchConfiguration
import org.eclipse.emf.ecore.InternalEObject

class StandaloneLaunchConfigGenerator {

	@Inject
	extension IQualifiedNameProvider qnp

	// also see org.eclipse.pde.internal.ui.editor.product.PluginConfigurationSection.getBundlesWithStartLevels()
	// for a list of known default start-levels which should be present.
	val knownStartLevels = newHashMap(
		"org.eclipse.osgi" -> "@-1:true",
		"org.apache.felix.scr" -> "@2:true",
		"org.eclipse.core.runtime" -> "@default:true",
		"org.eclipse.equinox.common" -> "@2:true",
		"org.eclipse.equinox.event" -> "@2:true",
		"org.eclipse.equinox.simpleconfigurator" -> "@1:true"
	)
	val launchMgr = DebugPlugin.^default.launchManager

	public static final String CONFIGURATION_TYPE_RAP = "org.eclipse.rap.ui.launch.RAPLauncher";
	public static final String CONFIGURATION_TYPE_SWTBOT = "org.eclipse.swtbot.eclipse.ui.launcher.JunitLaunchConfig";
	public static final String CONFIGURATION_TYPE_JUNIT = "org.eclipse.pde.ui.JunitLaunchConfig";	
	public static final String CONFIGURATION_TYPE_GROUP = "org.eclipse.debug.core.groups.GroupLaunchConfigurationType";

	static val TYPE_MAP = newHashMap(
		LaunchConfigType.JAVA -> IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION,
		LaunchConfigType.ECLIPSE -> EclipseLaunchShortcut.CONFIGURATION_TYPE,
		LaunchConfigType.SWTBOT -> CONFIGURATION_TYPE_SWTBOT,
		LaunchConfigType.JUNIT_PLUGIN -> CONFIGURATION_TYPE_JUNIT,
		LaunchConfigType.RAP -> CONFIGURATION_TYPE_RAP,
		LaunchConfigType.GROUP -> CONFIGURATION_TYPE_GROUP
	)

	static def getType(ILaunchManager mgr, LaunchConfigType type) {
		mgr.getLaunchConfigurationType(TYPE_MAP.get(type))
	}

	static def getTypeName(LaunchConfigType type) {
		TYPE_MAP.get(type)
	}
	
	def fullName(LaunchConfig c) {
		c.fullyQualifiedName?.toString
	}

	def ILaunchConfiguration generate(LaunchConfig c) {
		val config = postProcess(c);
		
		if (config === null || config.abstract)
			return null;

		if (config.fullName === null) {
			// happend for group configuration with error inside
			Activator.log(IStatus.ERROR, "Launch configuration was not build correctly: "+(config as InternalEObject).eProxyURI(), null)
			return null;		
		}
		if (config.hasError) {
			Activator.log(IStatus.ERROR, "launch configuration has errors, not generating " + config.fullName, null)
			return null;
		}

		val copy = reCreateConfig(config)
		if (copy === null) {
			Activator.log(IStatus.ERROR, "cannot create launch configuration " + config.fullName, null)
			return null;
		}
		
		if(Activator.isDebug) {
			Activator.log(IStatus.INFO, "generating " + config.fullName, null);
		}

		if (config.type != LaunchConfigType.GROUP) {
			var additionalProgramArgs = "";
			var additionalVMArgs = "";

			val model = config.loadProduct
			if (model !==null) {
				val os = TargetPlatform.getOS();
				val arch = TargetPlatform.getOSArch();
				val launcherArguments = model.product.launcherArguments

				additionalProgramArgs = launcherArguments.getCompleteProgramArguments(os, arch) + ' '
				additionalVMArgs = launcherArguments.getCompleteVMArguments(os, arch) + ' '
			}

			copy.setIfAvailable(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, additionalProgramArgs +
				Joiner.on(' ').join(config.collectArguments.map[quote]))
			copy.setIfAvailable(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS, additionalVMArgs +
				Joiner.on(' ').join(config.collectVmArguments.map[quote]))

			val out = config.collectRedirectOutFile
			if (out !== null && !out.trim.empty) {
				copy.setAttribute(IDebugUIConstants.ATTR_APPEND_TO_FILE, config.collectRedirectOutAppend)
				copy.setAttribute(IDebugUIConstants.ATTR_CAPTURE_IN_FILE, out)
			}
			copy.setIfAvailable(IDebugUIConstants.ATTR_CAPTURE_STDIN_FILE, config.collectRedirectInFile)
			val capture = !config.collectNoConsole
			copy.setAttribute(IDebugUIConstants.ATTR_CAPTURE_IN_CONSOLE, capture)
			copy.setAttribute(DebugPlugin.ATTR_CAPTURE_OUTPUT, capture)
			
			copy.setAttribute("org.eclipse.debug.core.appendEnvironmentVariables", !config.collectReplaceEnv)

			val env = config.collectEnvMap
			if (env !== null && !env.empty) {
				copy.setAttribute("org.eclipse.debug.core.environmentVariables", env)
			}

			copy.setIfAvailable(IJavaLaunchConfigurationConstants.ATTR_JRE_CONTAINER_PATH, config.collectExecEnvPath)
		}

		copy.setIfAvailable(IJavaLaunchConfigurationConstants.ATTR_WORKING_DIRECTORY, config.collectWorkingDir)
		copy.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, !config.collectForeground)

		val favGroups = config.collectFavoriteGroups
		if (favGroups !== null && !favGroups.empty) {
			copy.setAttribute(IDebugUIConstants.ATTR_FAVORITE_GROUPS, favGroups)
		}

		switch (config.type) {
			case LaunchConfigType.JAVA:
				generateJava(c.eResource, config, copy)
			case ECLIPSE:
				generateEclipse(config, copy)
			case GROUP:
				generateGroup(config, copy)
			case RAP:
				generateRAP(config, copy)
			case SWTBOT:
				generateSWTBotJUnitPlugin(c.eResource, config, copy)
			case JUNIT_PLUGIN:
				generatJUnitPlugin(c.eResource, config, copy)
		}

		copy.doSave
	}

	private def loadProduct(LaunchConfig  config) {
		val cp = config.collectContentProvider
		if (cp === null || cp.empty) {
			return null
		}

		val file = new File(cp)
		val wsFiles = ResourcesPlugin.workspace.root.findFilesForLocationURI(file.toURI)

		if (wsFiles === null || wsFiles.length <= 0) {
			return null
		}

		val model = new WorkspaceProductModel(wsFiles.get(0), false)
		model.load

		return model;
	}

 /**  command line arguments need to be quoted with single or double quote if they contain a space **/
	def quote(String string) {
		if (!string.contains(' ')) {
			return string
		}
		if (string.contains('"')) {
			return string; // quoted itself already?
		}
		return '"' + string + '"';
	}
	
	def postProcess(LaunchConfig config) {
		val processors = Activator.getAllServices(LcDslPostProcessor);
		if(processors.empty)
			return config;
		
		var processed = config;
		for(p : processors) {
			processed = p.apply(processed.fullName, processed);
		}
		return processed;
	}

	def setIfAvailable(ILaunchConfigurationWorkingCopy l, String attr, String value) {
		if (value !== null && !value.trim.empty) {
			l.setAttribute(attr, value.trim)
		}
	}

	def hasError(LaunchConfig config) {
		val diagnostic = Diagnostician.INSTANCE.validate(config);
		return diagnostic.severity > Diagnostic.WARNING
	}

	def reCreateConfig(LaunchConfig config) {
		val type = getType(launchMgr, config.type)

		if (type === null) {
			Activator.log(IStatus.ERROR, "unsupported launch configuration type " + config.type.literal, null);
			return null;
		}

		val lc = launchMgr.getLaunchConfigurations(type).findFirst[l|l.name.equals(config.fullName)]
		
		if(lc !== null) {
			// keep the original configuration so existing launches don't loose their association
			val wc = lc.getWorkingCopy;
			wc.attributes = null; // still clear out ALL attributes to start fresh
			return wc;
		}

		return type.newInstance(null, config.fullName)
	}

	def generateJava(org.eclipse.emf.ecore.resource.Resource eResource, LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		copy.setIfAvailable(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, config.collectJavaMainType)
		copy.setIfAvailable(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, config.collectJavaMainProject(eResource))
		copy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_STOP_IN_MAIN, config.collectJavaStopInMain)

		copy.setAttribute("org.eclipse.jdt.debug.ui.CONSIDER_INHERITED_MAIN", config.collectJavaMainSearchInherited)
		copy.setAttribute("org.eclipse.jdt.debug.ui.INCLUDE_EXTERNAL_JARS", config.collectJavaMainSearchSystem)
	}

	def generateCommonEclipseRap(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		copy.setAttribute(IPDELauncherConstants.AUTOMATIC_VALIDATE, !config.collectNoValidate)

		val clear = config.collectClearOptions
		if (clear !== null) {
			copy.setAttribute(IPDELauncherConstants.CONFIG_CLEAR_AREA, clear.config)
			copy.setAttribute(IPDELauncherConstants.ASKCLEAR, !clear.noAskClear)
			copy.setAttribute(IPDELauncherConstants.DOCLEAR, clear.workspace || clear.log)
			copy.setAttribute(IPDELauncherConstants.DOCLEAR + "log", clear.log)
		}

		val traces = config.collectTracing
		if (traces !== null && !traces.empty) {
			copy.setAttribute(IPDELauncherConstants.TRACING, true)
			copy.setAttribute(IPDELauncherConstants.TRACING_CHECKED, Joiner.on(',').join(traces.keySet))
			copy.setAttribute(IPDELauncherConstants.TRACING_OPTIONS, traces.mapTraceOptions)
		}
	}

	private def mapTraceOptions(Map<String, Iterable<String>> tracing) {
		val opts = newHashMap

		for (e : tracing.entrySet) {
			for (o : e.value) {
				opts.put(e.key + "/" + o, Boolean.TRUE.toString)
			}
		}

		opts
	}

	def generateEclipse(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		generateCommonEclipseRap(config, copy)

		copy.setIfAvailable(IPDELauncherConstants.LOCATION, config.collectWorkspace)
		copy.setIfAvailable(IPDELauncherConstants.APPLICATION, config.collectApplication)

		val prod = config.collectProduct
		if(prod !== null && !prod.empty) {
			copy.setAttribute(IPDELauncherConstants.PRODUCT, prod)
			copy.setAttribute(IPDELauncherConstants.USE_PRODUCT, true)
		}

		copy.setAttribute(IPDELauncherConstants.GENERATE_PROFILE, config.collectSwInstall)

		val cfg = config.collectConfigIniTemplate
		if (cfg !== null && !cfg.empty) {
			copy.setAttribute(IPDELauncherConstants.CONFIG_TEMPLATE_LOCATION, cfg)
			copy.setAttribute(IPDELauncherConstants.CONFIG_GENERATE_DEFAULT, false)
		}

		generateDependenciesEclipseRap(config, copy)
	}

	def generateDependenciesEclipseRap(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		val ws = newArrayList
		val tp = newArrayList
		val ntp = newArrayList
		for(entry : DependencyResolver.findDependencies(config, false).entrySet) {
			val pluginId = entry?.key?.symbolicName
        	val me = PluginRegistry.findEntry(pluginId);
        	if (me !== null) {
	            val sizeworkSpace = me.workspaceModels.length;
	            val sizeInstalled = me.externalModels.length;
	
	            if (sizeworkSpace > 0) {
	                ws.add(pluginId + "@" + entry.value.level + ":" + entry.value.autostart)
	            } else if (sizeInstalled != 0) {
	                var sl = knownStartLevels.get(pluginId);
	                if(sl === null) {
	                	sl = "@" + entry.value.level + ":" + entry.value.autostart
	                }
	
	                val bestMatch = me.getModel(entry.key);
	                if (bestMatch === null) {
	                    // but... how!?
	                    Activator.log(IStatus.WARNING, "cannot find model for " + pluginId, null)
	                } else {
		                val version = bestMatch.bundleDescription.version.toString;
		                val fullName = pluginId + "*" + version;
		                tp.add(fullName);
		                ntp.add(fullName + sl);
	                }
	            }
	        }
		}
		
		val wsValue = Joiner.on(',').join(ws)
		val tpValue = Joiner.on(',').join(tp)
		
		if(config.type == LaunchConfigType.ECLIPSE || config.type == LaunchConfigType.SWTBOT || config.type == LaunchConfigType.JUNIT_PLUGIN) {
			copy.setAttribute(IPDEConstants.LAUNCHER_PDE_VERSION, "3.3");
			copy.setAttribute(IPDELauncherConstants.SELECTED_WORKSPACE_BUNDLES, new TreeSet<String>(ws))
			copy.setAttribute(IPDELauncherConstants.SELECTED_TARGET_BUNDLES, new TreeSet<String>(ntp))
		} else if(config.type == LaunchConfigType.RAP) {
			copy.setAttribute("workspace_bundles", wsValue)
			copy.setAttribute("target_bundles", tpValue)
		}
		
		copy.setAttribute(IPDELauncherConstants.USE_DEFAULT, false);
		copy.setAttribute(IPDELauncherConstants.AUTOMATIC_ADD, false);
	}

	def generateRAP(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		generateCommonEclipseRap(config, copy)

		val ws = config.collectWorkspace
		if (ws !== null && !ws.empty) {
			copy.setAttribute("org.eclipse.rap.launch.dataLocation", ws)
			copy.setAttribute("org.eclipse.rap.launch.useDefaultDataLocation", false)
		}

		val cp = config.collectRAPContextPath
		if (cp !== null && !cp.empty) {
			copy.setAttribute("org.eclipse.rap.launch.contextpath", cp)
			copy.setAttribute("org.eclipse.rap.launch.useManualContextPath", true)
		}

		copy.setIfAvailable("org.eclipse.rap.launch.servletPath", config.collectRAPServletPath)
		copy.setAttribute("org.eclipse.rap.launch.developmentMode", config.collectRAPDevMode)
		
		copy.setAttribute("useCustomFeatures", false);

		val m = config.collectRAPBrowserMode
		if (m !== null) {
			switch m {
				case "NONE": {
					copy.setAttribute("org.eclipse.rap.launch.openBrowser", false)
				}
				default: {
					copy.setAttribute("org.eclipse.rap.launch.browserMode", m)
					copy.setAttribute("org.eclipse.rap.launch.openBrowser", true)
				}
			}
		}

		val st = config.collectRAPSessionTimeout
		if (st > 0) {
			copy.setAttribute("org.eclipse.rap.launch.sessionTimeout", st)
			copy.setAttribute("org.eclipse.rap.launch.useSessionTimeout", true)
		}

		val p = config.collectRAPServletPort
		if (p > 0) {
			copy.setAttribute("org.eclipse.rap.launch.port", p)
			copy.setAttribute("org.eclipse.rap.launch.useManualPort", true)
		}

		generateDependenciesEclipseRap(config, copy)
	}

	def generateGroup(LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		val l = config.collectGroupMembers.map[
			val m = new GroupLaunchElement;
			
			m.name = it.member.name;
			m.setAction(it.postAction)
			m.mode = it.type.literal
			m.adoptIfRunning = it.adopt
			
			if (it.member.fullName === null) {
				// "Launch configuration Group has Errors: "+copy.name
				return null;		
			}
			generate(it.member)
			
			m
		]
		
		GroupLaunchConfigurationDelegate.storeLaunchElements(copy, l);
	}
	
	def void setAction(GroupLaunchElement m, GroupPostLaunchAction a) {
		if(a === null) {
			return;
		}
		
		switch a {
			GroupPostLaunchDelay: {
					m.action = GroupLaunchElement.GroupElementPostLaunchAction.DELAY
					m.actionParam = a.delay
				}
			GroupPostLaunchWait: {
					m.action = GroupLaunchElement.GroupElementPostLaunchAction.WAIT_FOR_TERMINATION
				}
			GroupPostLaunchRegex: {
					m.action= GroupLaunchElement.GroupElementPostLaunchAction.OUTPUT_REGEXP
					m.actionParam = a.regex
			}
		}
	}

	def generatJUnitPlugin(org.eclipse.emf.ecore.resource.Resource eResource, LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		generateSWTBotJUnitPlugin(eResource, config, copy)

		copy.setAttribute(IPDELauncherConstants.RUN_IN_UI_THREAD, config.collectTestRunUiThread)
	}

	def generateSWTBotJUnitPlugin(org.eclipse.emf.ecore.resource.Resource eResource, LaunchConfig config, ILaunchConfigurationWorkingCopy copy) {
		generateEclipse(config, copy)

		copy.mappedResources = config.collectTestResources(eResource)

		copy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, config.collectTestProject(eResource))
		copy.setAttribute(JUnitLaunchConfigurationConstants.ATTR_TEST_RUNNER_KIND, config.collectTestKind)
		copy.setAttribute(JUnitLaunchConfigurationConstants.ATTR_KEEPRUNNING, config.collectTestKeepRunning)
		copy.setAttribute(JUnitLaunchConfigurationConstants.ATTR_TEST_CONTAINER, config.collectTestContainer(eResource))
		copy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, config.collectTestMainType)
		copy.setAttribute(JUnitLaunchConfigurationConstants.ATTR_TEST_NAME, config.collectTestName)

		copy.setAttribute(JUnitLaunchConfigurationConstants.ATTR_TEST_EXCLUDE_TAGS, config.collectTestExcludeTags)
		copy.setAttribute(JUnitLaunchConfigurationConstants.ATTR_TEST_HAS_EXCLUDE_TAGS, config.collectTestHasExcludeTags)
		copy.setAttribute(JUnitLaunchConfigurationConstants.ATTR_TEST_INCLUDE_TAGS, config.collectTestIncludeTags)
		copy.setAttribute(JUnitLaunchConfigurationConstants.ATTR_TEST_HAS_INCLUDE_TAGS, config.collectTestHasIncludeTags)
	}

}
