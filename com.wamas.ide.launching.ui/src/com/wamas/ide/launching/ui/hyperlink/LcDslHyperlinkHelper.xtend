/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.hyperlink

import com.google.inject.Inject
import com.google.inject.Provider
import com.wamas.ide.launching.lcDsl.LcDslPackage
import com.wamas.ide.launching.lcDsl.Path
import com.wamas.ide.launching.lcDsl.StringWithVariables
import org.eclipse.core.internal.variables.StringVariableManager
import org.eclipse.jface.text.IRegion
import org.eclipse.jface.text.Region
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.EObjectAtOffsetHelper
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor
import java.io.File
import org.eclipse.core.resources.ResourcesPlugin
import com.wamas.ide.launching.lcDsl.PluginWithVersion
import org.eclipse.pde.core.plugin.PluginRegistry
import org.eclipse.pde.core.plugin.IMatchRules
import org.eclipse.pde.internal.ui.editor.plugin.ManifestEditor
import com.wamas.ide.launching.lcDsl.FeatureWithVersion
import org.eclipse.pde.internal.core.PDECore

class LcDslHyperlinkHelper extends HyperlinkHelper {

	@Inject	Provider<LcDslIFileHyperlink> fileLinkProvider;
	@Inject	Provider<LcDslIPluginModelBaseHyperlink> pluginLinkProvider;
	@Inject	Provider<LcDslIFeatureHyperlink> featureLinkProvider;

	@Inject
	EObjectAtOffsetHelper eObjectAtOffsetHelper;

	override void createHyperlinksByOffset(XtextResource resource, int offset, IHyperlinkAcceptor acceptor) {
		super.createHyperlinksByOffset(resource, offset, acceptor);

		val eObject = eObjectAtOffsetHelper.resolveContainedElementAt(resource, offset);
		if (eObject === null) {
			return
		}

		val node = NodeModelUtils.findActualNodeFor(eObject)
		if (node === null) {
			return
		}
		
		if (eObject.eContainer instanceof Path) {
			val link = fileLinkProvider.get
			val expandedPath = new File((eObject as StringWithVariables).expanded);

			if (!expandedPath.exists) {
				return; // not found
			}

			val matchedFiles = ResourcesPlugin.workspace.root.findFilesForLocationURI(expandedPath.toURI);
			if (matchedFiles === null || matchedFiles.length < 1) {
				return; // not matched
			}

			link.hyperlinkRegion = new Region(node.offset, node.length) as IRegion;
			link.hyperlinkText = "Open referenced File...";
			link.path = matchedFiles.get(0);

			acceptor.accept(link);
		}

		if (eObject instanceof PluginWithVersion) {
			val p = eObject as PluginWithVersion
			val bundle = PluginRegistry.findModel(p.name, p.version, IMatchRules.PERFECT, null)

			if(bundle === null) {
				return;
			}
			
			val link = pluginLinkProvider.get
			link.hyperlinkRegion = new Region(node.offset, node.length) as IRegion;
			link.hyperlinkText = "Open Plug-In...";
			link.model = bundle;
			
			acceptor.accept(link);
		}
		
		if(eObject instanceof FeatureWithVersion) {
			val f = eObject as FeatureWithVersion
			val mgr = PDECore.^default.featureModelManager
			val feature = mgr.findFeatureModel(f.name, f.version);
			
			val link = featureLinkProvider.get
			link.hyperlinkRegion = new Region(node.offset, node.length) as IRegion;
			link.hyperlinkText = "Open Feature...";
			link.model = feature;
			
			acceptor.accept(link);
		}
	}

	static def getExpanded(StringWithVariables original) {
		return StringVariableManager.^default.performStringSubstitution(original.value, false)
	}

}
