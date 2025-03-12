/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.generator

import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.LaunchConfigType
import java.io.File
import java.util.Collection
import java.util.List
import java.util.function.Predicate
import org.apache.log4j.Logger
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.osgi.service.resolver.BundleDescription
import org.eclipse.pde.core.plugin.IMatchRules
import org.eclipse.pde.core.plugin.PluginRegistry
import org.eclipse.pde.internal.core.PDECore
import org.eclipse.pde.internal.core.PDEState
import org.eclipse.pde.internal.core.TargetPlatformHelper
import org.eclipse.pde.internal.core.ifeature.IFeature
import org.eclipse.pde.internal.core.ifeature.IFeatureImport
import org.eclipse.pde.internal.core.iproduct.IProductModel
import org.eclipse.pde.internal.core.product.WorkspaceProductModel

import static extension com.wamas.ide.launching.generator.RecursiveCollectors.*
import java.util.stream.Collectors
import java.util.Map

class DependencyResolver {

	static val log = Logger.getLogger(DependencyResolver)

	static class StartLevel {

		static val DEFAULT = new StartLevel(false, 0)

		val boolean autostart
		val int level

		new(boolean autostart, int level) {
			this.autostart = autostart;
			this.level = level;
		}

		def getAutostart() {
			if (autostart)
				"true"
			else
				"default"
		}

		def getLevel() {
			if (level == 0)
				"default"
			else
				Integer.toString(level)
		}
	}
	// see org.eclipse.pde.internal.ui.util.SourcePluginFilter.test(IPluginModelBase)
	static def isNotSourceBundle(PDEState pdeState, BundleDescription description) {
		return pdeState.getBundleSourceEntry(description.getBundleId()) === null;
	}
	static def findDependencies(LaunchConfig config, boolean addAll) {
		val plugins = config.collectPlugins
		val features = config.collectFeatures
		val ignores = config.collectIgnores
		val cp = config.collectContentProvider
		val fState=TargetPlatformHelper.getPDEState();

		val mappedIgnores = ignores.map[getBestPluginMatch(it.name, it.version)?.bundleDescription].filterNull.toList
		var Map<BundleDescription, StartLevel> allBundles = newHashMap()

		if (cp !== null && !cp.empty) {
			log.info("collecting from " + cp)
			val files = ResourcesPlugin.workspace.root.findFilesForLocationURI(new File(cp).toURI)
			if (files !== null && files.length > 0) {
				val file = files.get(0)
				val prodBundles = file.findBundlesInProduct
				allBundles.putAll(prodBundles.toInvertedMap[StartLevel.DEFAULT])
				// TODO get start level from product
				// feature may not contain required dependencies
				resolveAndExpand(config, allBundles, prodBundles, mappedIgnores, addAll, fState)
			}
		}

		if (features !== null && !features.empty) {
			for (fwv : features) {
				log.info("top-level feature " + fwv)
				val f = getBestFeatureMatch(fwv.name, fwv.version)
				val ps = f?.feature?.pluginModels?.filterNull?.filter[description|isNotSourceBundle(fState,description)]
				if (ps !== null && !ps.empty) {
					allBundles.putAll(ps.toInvertedMap[StartLevel.DEFAULT])

					// feature may not contain required dependencies
					resolveAndExpand(config, allBundles, ps, mappedIgnores, addAll, fState)
				}
			}
		}

		if (plugins !== null && !plugins.empty) {
			val toResolve = newArrayList
			for (pwv : plugins) {
				log.info("top-level plugin " + pwv)
				val sl = new StartLevel(pwv.autoStart, pwv.startLevel)

				val desc = getBestPluginMatch(pwv.plugin.name, pwv.plugin.version)
				if (desc !== null) {
					toResolve.add(desc.bundleDescription)
					allBundles.put(desc.bundleDescription, sl)
				}
			}

			resolveAndExpand(config, allBundles, toResolve, mappedIgnores, addAll, fState)
		}

		// add the plugin of the test project it self, if not yet present
		if (config.type == LaunchConfigType.SWTBOT || config.type == LaunchConfigType.JUNIT_PLUGIN) {
			val project = RecursiveCollectors.collectTestContainerResource(config)?.project
			val testBundleDescription = PDECore.^default.modelManager.findModel(project)?.bundleDescription

			allBundles.putIfAbsent(testBundleDescription, StartLevel.DEFAULT)
			resolveAndExpand(config, allBundles, #[testBundleDescription], mappedIgnores, addAll, fState)
		}

		// remove unresolved plugins (that might happen when using Maven targets and adding platform filter on the fly)
		allBundles = allBundles.entrySet.stream.filter(e | e.key.isResolved).collect(Collectors.toMap([e | e.key], [e | e.value]));

		if (cp !== null && !cp.empty) {
			log.info("collecting plugin start level and autostart from " + cp)
			val files = ResourcesPlugin.workspace.root.findFilesForLocationURI(new File(cp).toURI)
			if (files !== null && files.length > 0) {
				val file = files.get(0)
				val pluginConfigurations = file.findPluginConfigurationsInProduct

				for (pc : pluginConfigurations) {
					allBundles.entrySet.stream
						.filter([e | e.key.symbolicName.equals(pc.id)])
						.findFirst
						.filter([e | e.value == StartLevel.DEFAULT])
						.ifPresent([e | e.value = new StartLevel(pc.autoStart, pc.startLevel)])
				}
			}
		}

		allBundles
	}

	protected def static void resolveAndExpand(LaunchConfig config, Map<BundleDescription, StartLevel> allBundles,
		Iterable<BundleDescription> toResolve, List<BundleDescription> mappedIgnores, boolean addAll, PDEState fState) {
		// only if requested
		if (!config.explicit) {
			// resolve and add
			val all = toResolve.findDependencies(mappedIgnores, addAll)

			for (d : all) {
				if (!allBundles.containsKey(d) && isNotSourceBundle(fState,d)) {
					allBundles.put(d, StartLevel.DEFAULT)
				}
			}
		}
	}

	private static def findBundlesInProduct(IFile product) {
		val model = new WorkspaceProductModel(product, false)
		val result = newArrayList

		model.load

		result.addAll(model.pluginModels)
		result.addAll(model.featureModels?.filterNull.map[feature.pluginModels].filterNull.flatten)

		result.filterNull.filter[resolved]
	}

	private static def findPluginConfigurationsInProduct(IFile product) {
		val model = new WorkspaceProductModel(product, false)

		model.load

		model.product.pluginConfigurations
	}

	private static def getFeatureModels(IProductModel pm) {
		val list = newArrayList;
		val features = pm.product.features;
		for (f : features) {
			val model = getBestFeatureMatch(f.id, f.version);
			if (model !== null)
				list.add(model);
		}
		list
	}

	private static def Iterable<BundleDescription> getPluginModels(IFeature feature) {
		val result = newArrayList

		for (child : feature.includedFeatures) {
			if (child.feature !== null) {
				// features seem to be able to include themselves
				val childFeature = getBestFeatureMatch(child.id, child.version)
				if (childFeature !== null) {
					result.addAll(childFeature.feature.pluginModels)
				} else if (!child.optional) {
					log.warn("non-optional feature " + child.id + " (" + child.version + ") missing");
				}
			}
		}

		for (plugin : feature.plugins) {
			val bundle = getBestPluginMatch(plugin.id, plugin.version)
			if (bundle !== null)
				result.add(bundle.bundleDescription)
		}

		for (imp : feature.imports) {
			switch (imp.type) {
				case IFeatureImport.PLUGIN: {
					val bundle = getBestPluginMatch(imp.id, imp.version)
					if (bundle !== null)
						result.add(bundle.bundleDescription)
				}
				case IFeatureImport.FEATURE: {
					val f = getBestFeatureMatch(imp.id, imp.version)
					if (f !== null) {
						result.addAll(f.feature.pluginModels)
					}
				}
			}
		}

		result.filterNull
	}

	private def static getBestFeatureMatch(String id, String version) {
		val manager = PDECore.^default.featureModelManager
		val model = manager.findFeatureModel(id, version)

		if (model === null) {
			log.info("cannot find feature " + id + " (" + version + ")")
		}

		model
	}

	private static def getBestPluginMatch(String id, String version) {
		// TODO: check version matching for ranges, ...
		var bundle = PluginRegistry.findModel(id, version, IMatchRules.PERFECT, null)

		if (bundle === null) {
			bundle = PluginRegistry.findModel(id, null, IMatchRules.NONE, null)
		}

		bundle
	}

	private static def getPluginModels(IProductModel pm) {
		val list = newArrayList;
		val plugins = pm.product.plugins;

		for (p : plugins) {
			val bundle = getBestPluginMatch(p.id, p.version)

			if (bundle !== null)
				list.add(bundle.bundleDescription)
		}

		list
	}

	private static def findDependencies(Iterable<BundleDescription> preselected, Collection<BundleDescription> toIgnore,
		boolean addAll) {
		var Predicate<BundleDescription> filter = [!toIgnore.contains(it)]
		if (!addAll) filter = filter.and([resolved])
		val result = DependencyManager.findRequirementsClosure(preselected.toList, filter,
			DependencyManager.Options.INCLUDE_OPTIONAL_DEPENDENCIES, DependencyManager.Options.INCLUDE_NON_TEST_FRAGMENTS
		)
		return result
	}

}
