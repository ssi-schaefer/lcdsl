/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.validation

import com.wamas.ide.launching.generator.LcDslGenerator
import com.wamas.ide.launching.generator.RecursiveCollectors
import com.wamas.ide.launching.lcDsl.AddFeature
import com.wamas.ide.launching.lcDsl.AddPlugin
import com.wamas.ide.launching.lcDsl.ApplicationExtPoint
import com.wamas.ide.launching.lcDsl.ContentProviderProduct
import com.wamas.ide.launching.lcDsl.ExecutionEnvironment
import com.wamas.ide.launching.lcDsl.ExistingPath
import com.wamas.ide.launching.lcDsl.Favorites
import com.wamas.ide.launching.lcDsl.FeatureWithVersion
import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.LcDslPackage
import com.wamas.ide.launching.lcDsl.PluginWithVersion
import com.wamas.ide.launching.lcDsl.ProductExtPoint
import com.wamas.ide.launching.lcDsl.Project
import com.wamas.ide.launching.lcDsl.StringWithVariables
import com.wamas.ide.launching.lcDsl.TraceEnablement
import java.io.File
import java.util.List
import java.util.Set
import org.eclipse.core.internal.variables.StringVariableManager
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.launching.JavaRuntime
import org.eclipse.pde.core.plugin.IMatchRules
import org.eclipse.pde.core.plugin.PluginRegistry
import org.eclipse.pde.internal.core.PDECore
import org.eclipse.xtext.validation.Check

import static com.wamas.ide.launching.lcDsl.LaunchConfigType.*

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class LcDslValidator extends AbstractLcDslValidator {

	public static final val EXT_APPLICATIONS = "org.eclipse.core.runtime.applications"
	public static final val EXT_PRODUCTS = "org.eclipse.core.runtime.products"

	private LcDslPackage LC = LcDslPackage.eINSTANCE

	// map config features to types where this feature is allowed. not mentioned features are allowed on all types.
	private val allowedFeatures = newHashMap(
		// modifiers on config
		LC.launchConfig_Explicit -> #{ECLIPSE, RAP},
		LC.launchConfig_NoConsole -> #{ECLIPSE, RAP, JAVA},
		LC.launchConfig_NoValidate -> #{ECLIPSE, RAP},
		LC.launchConfig_SwInstallSupport -> #{ECLIPSE},
		LC.launchConfig_ReplaceEnv -> #{ECLIPSE, RAP, JAVA},
		LC.launchConfig_StopInMain -> #{JAVA},
		// single appearance features
		LC.launchConfig_Clears -> #{ECLIPSE, RAP},
		LC.launchConfig_Workspace -> #{ECLIPSE, RAP},
		LC.launchConfig_WorkingDir -> #{ECLIPSE, RAP, JAVA},
		LC.launchConfig_Memory -> #{ECLIPSE, RAP, JAVA},
		LC.launchConfig_MainProject -> #{JAVA},
		LC.launchConfig_MainType -> #{JAVA},
		LC.launchConfig_Application -> #{ECLIPSE},
		LC.launchConfig_Product -> #{ECLIPSE},
		LC.launchConfig_Redirect -> #{ECLIPSE, RAP, JAVA},
		LC.launchConfig_ExecEnv -> #{ECLIPSE, RAP, JAVA},
		LC.launchConfig_ConfigIniTemplate -> #{ECLIPSE},
		LC.launchConfig_JavaMainSearch -> #{JAVA},
		LC.launchConfig_ServletConfig -> #{RAP},
		LC.launchConfig_ContentProviderProduct -> #{ECLIPSE, RAP},
		// multi appearance features
		LC.launchConfig_Plugins -> #{ECLIPSE, RAP},
		LC.launchConfig_Features -> #{ECLIPSE, RAP},
		LC.launchConfig_Ignore -> #{ECLIPSE, RAP},
		LC.launchConfig_GroupMembers -> #{GROUP},
		LC.launchConfig_VmArgs -> #{ECLIPSE, RAP, JAVA},
		LC.launchConfig_ProgArgs -> #{ECLIPSE, RAP, JAVA},
		LC.launchConfig_EnvVars -> #{ECLIPSE, RAP, JAVA},
		LC.launchConfig_Traces -> #{ECLIPSE, RAP}
	)

	private val requiredFeatures = newHashMap(
		ECLIPSE -> #{
			#{LC.launchConfig_Application, LC.launchConfig_Product},
			#{LC.launchConfig_Plugins, LC.launchConfig_Features, LC.launchConfig_ContentProviderProduct}
		},
		RAP -> #{
			#{LC.launchConfig_ServletConfig},
			#{LC.launchConfig_Plugins, LC.launchConfig_Features, LC.launchConfig_ContentProviderProduct}
		},
		JAVA -> #{
			#{LC.launchConfig_MainType},
			#{LC.launchConfig_MainProject} // TODO: maybe default to project containing file?
		},
		GROUP -> #{
			#{LC.launchConfig_GroupMembers}
		}
	)
	
	static def mapSaveSuperConfig(LaunchConfig config) {
		if(LcDslValidator.checkCircle(config, config.superConfig))
			return null
		
		return config.superConfig
	}

	@Check
	def checkSpecifics(LaunchConfig lc) {
		// validate supported attributes
		for (entry : allowedFeatures.entrySet) {
			val feature = entry.key
			val types = entry.value

			if (!types.contains(lc.type)) {
				// not allowed to have it, check
				val e = lc.eGet(feature)

				if (e !== null) {
					// it is set, check for empty collection
					if (e instanceof EList<?>) {
						if (!e.empty) {
							error("unsupported attribute for type " + lc.type, feature)
						}
					} else if (e instanceof Boolean) {
						if (e.equals(Boolean.TRUE))
							error("unsupported attribute for type " + lc.type, feature)
					} else {
						error("unsupported attribute for type " + lc.type, feature)
					}
				}
			}
		}

		if (lc.abstract)
			return

		val required = requiredFeatures.get(lc.type)
		if (required === null) {
			error("unsupported launch configuration type - validation not implemented", LC.launchConfig_Type)
		} else {
			for (alternatives : required) {
				var anySet = false
				for (feature : alternatives) {
					if (lc.isFeatureSetRecursive(feature))
						anySet = true
				}

				if (!anySet) {
					// missing required feature.
					error("missing required attribute: " + alternatives.simpleNames, LC.launchConfig_Name)
				}
			}
		}
	}

	def boolean isFeatureSetRecursive(LaunchConfig lc, EStructuralFeature feature) {
		val e = lc.eGet(feature)
		if (e !== null) {
			if (e instanceof EList<?>) {
				if (!e.empty)
					return true
			} else {
				return true
			}
		}

		if (lc.mapSaveSuperConfig === null)
			return false

		return lc.mapSaveSuperConfig.isFeatureSetRecursive(feature)
	}

	def List<String> simpleNames(Set<? extends EStructuralFeature> features) {
		val names = newArrayList()

		features.forEach[f|names.add(f.name)]

		return names
	}

	@Check
	def checkInheritance(LaunchConfig lc) {
		// check that inheriting from another config of same type only
		if (lc.superConfig !== null && lc.superConfig.type != lc.type) {
			error("Super launch configuration has a different type", LC.launchConfig_SuperConfig)
		}
		
		if(checkCircle(lc, lc.superConfig)) {
			error("Circular inheritance found", LC.launchConfig_SuperConfig)
		}
	}
	
	static def boolean checkCircle(LaunchConfig config, LaunchConfig superConfig) {
		if(superConfig === null)
			return false
		
		if(config.equals(superConfig))
			return true
		
		return checkCircle(config, superConfig.superConfig)
	}

	@Check
	def checkProjectExists(Project p) {
		val prj = ResourcesPlugin.workspace.root.getProject(p.name);
		if (prj === null || !prj.exists) {
			warning("Project " + p.name + " does not exist in the workspace", p, LC.project_Name)
		} else if (!prj.open) {
			warning("Project " + p.name + " is closed", p, LC.project_Name)
		}
	}

	@Check
	def checkPluginExists(PluginWithVersion p) {
		if (p.name === null)
			return;

		// used in PluginWithVersionAndStartlevel -> AddPlugin
		val container = p.eContainer.eContainer
		if (container instanceof AddPlugin) {
			if (container.optional)
				return;
		}

		val bundle = PluginRegistry.findModel(p.name, p.version, IMatchRules.PERFECT, null)

		if (bundle === null) {
			if (PluginRegistry.findModel(p.name, null, IMatchRules.NONE, null) !== null) {
				warning("Bundle " + p.name + " does not exist in version " + p.version, p,
					LC.pluginWithVersion_Version);
			} else {
				error("Bundle " + p.name + " does not exist in the workspace or the current target platform", p,
					LC.pluginWithVersion_Name);
			}
		}
	}

	@Check
	def checkFeatureExists(FeatureWithVersion f) {
		if (f.name === null)
			return;

		// feature used directly (different to plugin)
		val container = f.eContainer
		if (container instanceof AddFeature)
			if (container.optional)
				return;

		val mgr = PDECore.^default.featureModelManager
		val feature = mgr.findFeatureModel(f.name, f.version)
		if (feature === null) {
			if (mgr.findFeatureModel(f.name) !== null) {
				warning("Feature " + f.name + " does not exists in version " + f.version, f,
					LC.featureWithVersion_Version)
			} else {
				error("Feature " + f.name + " does not exist in the workspace or the current target platform", f,
					LC.featureWithVersion_Name)
			}
		}
	}

	@Check
	def checkMainType(LaunchConfig cfg) {
		val mainprj = RecursiveCollectors.collectJavaMainProject(cfg)
		if (cfg.type == JAVA && mainprj !== null &&
			cfg.mainType?.mainClass !== null && !cfg.mainType.mainClass.name.empty) {
			val prj = ResourcesPlugin.workspace.root.getProject(mainprj);
			if (prj !== null && prj.exists && prj.open) {
				val jp = JavaCore.create(prj)
				if (!jp.exists) {
					error("project " + mainprj + " is not a java project",
						LC.launchConfig_MainProject)
					return
				}

				val type = jp.findType(cfg.mainType.mainClass.name, new NullProgressMonitor)
				if (type === null || !type.exists) {
					error("main type " + cfg.mainType.mainClass.name + " not found in class-path of " +
						mainprj, LC.launchConfig_MainType)
					return
				}

				if (!type.methods.exists[mainMethod]) {
					error("type " + cfg.mainType.mainClass.name + " does not contain a main method",
						LC.launchConfig_MainType)
					return
				}
			}
		}
	}

	@Check
	def checkPathExists(ExistingPath p) {
		try {
			val x = p.name.expanded
			val f = new File(x);
			if (!f.exists) {
				warning("Path " + x + " does not exist", p, LC.path_Name)
			}
		} catch (CoreException e) {
			warning(e.message, LC.path_Name)
		}
	}

	@Check
	def checkSupportedType(LaunchConfig cfg) {
		if (!LcDslGenerator.isTypeSupported(cfg)) {
			warning("Unsupported configuration type in current setup, can not generate launch configuration",
				LC.launchConfig_Type)
		}
	}

	@Check
	def checkExecutionEnvironment(ExecutionEnvironment e) {
		if (e.name === null || e.name.empty)
			return

		val exe = JavaRuntime.getExecutionEnvironmentsManager().getEnvironment(e.name);
		if (exe === null) {
			error("cannot find execution environment " + e.name, LC.executionEnvironment_Name)
		} else if (exe.compatibleVMs.empty) {
			error("no compatible VMs available in the current configuration for " + e.name,
				LC.executionEnvironment_Name)
		} else if (exe.defaultVM === null) {
			warning("no default VM configured for execution environment " + e.name, LC.executionEnvironment_Name)
		}
	}

	@Check
	def checkFavorites(Favorites f) {
		for (t : f.types) {
			if (RecursiveCollectors.mapToFavoriteType(t) === null) {
				error(t.literal + " is not a valid favorite type", LC.favorites_Types)
			}
		}
	}

	@Check
	def checkApplication(ApplicationExtPoint e) {
		if (!getAllExtensionsOf(e, EXT_APPLICATIONS).toSet.contains(e.name)) {
			error("application " + e.name + " does not exist", LC.applicationExtPoint_Name)
		}
	}

	@Check
	def checkProduct(ProductExtPoint e) {
		if (!getAllExtensionsOf(e, EXT_PRODUCTS).toSet.contains(e.name)) {
			error("product " + e.name + " does not exist", LC.productExtPoint_Name)
		}
	}

	@Check
	def checkApplicationProductXor(LaunchConfig c) {
		if (c.application !== null && c.product !== null) {
			error("either application or product can be set, not both", LC.launchConfig_Application)
		}
	}

	@Check
	def checkContentProviderProductFile(ContentProviderProduct p) {
		if (!p.product.name.value.endsWith(".product")) {
			warning("content provider should reference a .product file", LC.contentProviderProduct_Product)
		}
	}

	@Check
	def checkTracingOptions(TraceEnablement e) {
		val ok = PDECore.^default.tracingOptionsManager.getTemplateTable(e.plugin).keySet
		var idx = 0;
		for (w : e.what) {
			if (!ok.contains(e.plugin + "/" + w)) {
				error("unsupported trace option for " + e.plugin + ": " + w, LC.traceEnablement_What, idx)
			}
			idx++;
		}
	}

	@Check
	def checkStringVars(StringWithVariables s) {
		try {
			StringVariableManager.^default.validateStringVariables(s.value)
		} catch (CoreException e) {
			warning(e.message, LC.stringWithVariables_Value)
		}
	}

	/** only required for validation/label. raw value must be written into launch configurations to allow expansion at launch time */
	static def getExpanded(StringWithVariables original) {
		return StringVariableManager.^default.performStringSubstitution(original.value, false)
	}

	static def getAllExtensionsOf(EObject model, String ext) {
		// TODO: possibly filter to plugins that are actually included in the launch configuration...?
		PluginRegistry.activeModels.map[extensions.extensions.toList].flatten.filter [
			point.equals(ext)
		].map[pluginModel.bundleDescription.symbolicName + "." + id]
	}

}
