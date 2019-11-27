/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.generator

import com.wamas.ide.launching.lcDsl.LaunchConfig
import java.io.File
import java.util.Collection
import java.util.HashMap
import java.util.List
import java.util.Set
import org.apache.log4j.Logger
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.osgi.service.resolver.BundleDescription
import org.eclipse.pde.core.plugin.IMatchRules
import org.eclipse.pde.core.plugin.PluginRegistry
import org.eclipse.pde.internal.core.PDECore
import org.eclipse.pde.internal.core.ifeature.IFeature
import org.eclipse.pde.internal.core.ifeature.IFeatureImport
import org.eclipse.pde.internal.core.iproduct.IProductModel
import org.eclipse.pde.internal.core.product.WorkspaceProductModel

import static extension com.wamas.ide.launching.generator.RecursiveCollectors.*
import com.wamas.ide.launching.lcDsl.LaunchConfigType

class DependencyResolver {

	static val log = Logger.getLogger(DependencyResolver)

	static class StartLevel {
		boolean autostart = false;
		int level = 0

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

	static def findDependencies(LaunchConfig config, boolean addAll) {
		val plugins = config.collectPlugins
		val features = config.collectFeatures
		val ignores = config.collectIgnores
		val cp = config.collectContentProvider

		val mappedIgnores = ignores.map[getBestPluginMatch(it.name, it.version)?.bundleDescription].filterNull.toList
		val allBundles = newHashMap()

		if (cp !== null && !cp.empty) {
			log.info("collecting from " + cp)
			val files = ResourcesPlugin.workspace.root.findFilesForLocationURI(new File(cp).toURI)
			if(files !== null && files.length > 0) {
				val file = files.get(0)
				val prodBundles = file.findBundlesInProduct
				allBundles.putAll(prodBundles.toInvertedMap[new StartLevel])
	
				// feature may not contain required dependencies
				resolveAndExpand(config, allBundles, prodBundles, mappedIgnores, addAll)
			}
		}

		if (features !== null && !features.empty) {
			for (fwv : features) {
				log.info("top-level feature " + fwv)
				val f = getBestFeatureMatch(fwv.name, fwv.version)
				val ps = f?.feature?.pluginModels?.filterNull
				if (ps !== null && !ps.empty) {
					allBundles.putAll(ps.toInvertedMap[new StartLevel])

					// feature may not contain required dependencies
					resolveAndExpand(config, allBundles, ps, mappedIgnores, addAll)
				}
			}
		}

		if (plugins !== null && !plugins.empty) {
			val toResolve = newArrayList
			for (pwv : plugins) {
				log.info("top-level plugin " + pwv)
				val sl = new StartLevel

				sl.autostart = pwv.autoStart
				sl.level = pwv.startLevel

				val desc = getBestPluginMatch(pwv.plugin.name, pwv.plugin.version)
				if (desc !== null) {
					toResolve.add(desc.bundleDescription)
					allBundles.put(desc.bundleDescription, sl)
				}
			}

			resolveAndExpand(config, allBundles, toResolve, mappedIgnores, addAll)
		}

		// add the plugin of the test project it self, if not yet present
		if (config.type == LaunchConfigType.SWTBOT || config.type == LaunchConfigType.JUNIT_PLUGIN) {
			val project = RecursiveCollectors.collectTestContainerResource(config)?.project
			val testBundleDescription = PDECore.^default.modelManager.findModel(project)?.bundleDescription

			allBundles.putIfAbsent(testBundleDescription, new StartLevel)
		}

		allBundles
	}

	protected def static void resolveAndExpand(LaunchConfig config, HashMap<BundleDescription, StartLevel> allBundles,
		Iterable<BundleDescription> toResolve, List<BundleDescription> mappedIgnores, boolean addAll) {
		// only if requested
		if (!config.explicit) {
			// resolve and add
			val all = toResolve.findDependencies(mappedIgnores, addAll)

			for (d : all) {
				if (!allBundles.containsKey(d)) {
					allBundles.put(d, new StartLevel)
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

		result.filterNull
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
				if(childFeature !== null) {
					result.addAll(childFeature.feature.pluginModels)
				} else if(!child.optional) {
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
		
		if(model === null) {
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

	private static def findDependencies(Iterable<BundleDescription> preselected, Collection<BundleDescription> toIgnore, boolean addAll) {
		val result = newHashSet();

		for (d : preselected) {
			addDependenciesRecursive(d, result, toIgnore, addAll);
		}

		return result;
	}

	private static def void addDependenciesRecursive(BundleDescription desc, Set<BundleDescription> targets,
		Collection<BundleDescription> toIgnore, boolean addAll) {
		if (targets.contains(desc) || toIgnore.contains(desc)) {
			return;
		}

		targets.add(desc);

		val directDeps = findDirectDependencies(desc, addAll);
		directDeps.forEach[it.addDependenciesRecursive(targets, toIgnore, addAll)];
	}

	private static def findDirectDependencies(BundleDescription desc, boolean addAll) {
		val result = newHashSet();

		// add all fragments that can be resolved
		for (frag : desc.getFragments()) {
			// Note: add all fragments, also unresolved, so that update sites contain fragments for all platforms
			if(frag.resolved || addAll)
				result.add(frag);
		}

		// add all explicit dependencies
		for (dep : desc.getResolvedRequires()) {
			result.add(dep);
		}

		// add all package imports that could be resolved
		for (dep : desc.getResolvedImports()) {
			result.add(dep.getExporter());
		}

		return result;
	}

}
