/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.contentassist

import com.google.inject.Inject
import com.wamas.ide.launching.lcDsl.FeatureWithVersion
import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.PluginWithVersion
import com.wamas.ide.launching.lcDsl.TraceEnablement
import com.wamas.ide.launching.validation.LcDslValidator
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.ecore.EObject
import org.eclipse.jdt.core.IMethod
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.search.IJavaSearchConstants
import org.eclipse.jdt.core.search.IJavaSearchScope
import org.eclipse.jdt.core.search.SearchEngine
import org.eclipse.jdt.core.search.SearchPattern
import org.eclipse.jdt.internal.core.JavaProject
import org.eclipse.jdt.launching.JavaRuntime
import org.eclipse.jface.viewers.StyledString
import org.eclipse.pde.core.plugin.IMatchRules
import org.eclipse.pde.core.plugin.PluginRegistry
import org.eclipse.pde.internal.core.PDECore
import org.eclipse.pde.internal.core.TracingOptionsManager
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.IImageHelper
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class LcDslProposalProvider extends AbstractLcDslProposalProvider {

	@Inject
	private IImageHelper ih

	override complete_Project(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		for (prj : ResourcesPlugin.workspace.root.projects) {
			if (prj != null && prj.exists && prj.open && JavaProject.hasJavaNature(prj)) {
				acceptor.accept(
					createCompletionProposal(prj.name, new StyledString(prj.name), ih.getImage("showprojects.gif"),
						context))
			}
		}

		super.complete_Project(model, ruleCall, context, acceptor)
	}

	override completePluginWithVersion_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		for (wsm : PluginRegistry.workspaceModels) {
			val name = wsm.bundleDescription.name
			acceptor.accept(
				createCompletionProposal(name, new StyledString(name), ih.getImage("showprojects.gif"), context))
		}

		for (tpm : PluginRegistry.externalModels) {
			val name = tpm.bundleDescription.name
			val ver = tpm.bundleDescription.version

			acceptor.accept(
				createCompletionProposal(name,
					new StyledString(name + " ").append(ver.toString, StyledString.QUALIFIER_STYLER),
					ih.getImage("plugin_obj.png"), context))
		}
		super.completePluginWithVersion_Name(model, assignment, context, acceptor)
	}

	override completePluginWithVersion_Version(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		val pv = model as PluginWithVersion
		val models = PluginRegistry.findModels(pv.name, null, IMatchRules.NONE, null)

		if (models != null && !models.empty) {
			for (m : models) {
				val ver = m.bundleDescription.version.toString
				acceptor.accept(
					createCompletionProposal(ver, new StyledString(ver), ih.getImage("plugin_obj.png"), context))
			}
		}

		super.completePluginWithVersion_Version(model, assignment, context, acceptor)
	}

	override completeFeatureWithVersion_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		for (wsm : PDECore.^default.featureModelManager.workspaceModels) {
			val name = wsm.feature.id
			acceptor.accept(
				createCompletionProposal(name, new StyledString(name), ih.getImage("showprojects.gif"), context))
		}

		for (tpm : PDECore.^default.featureModelManager.externalModels) {
			val name = tpm.feature.id
			val ver = tpm.feature.version

			acceptor.accept(
				createCompletionProposal(name,
					new StyledString(name + " ").append(ver.toString, StyledString.QUALIFIER_STYLER),
					ih.getImage("feature_obj.png"), context))
		}

		super.completeFeatureWithVersion_Name(model, assignment, context, acceptor)
	}

	override completeFeatureWithVersion_Version(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		val f = model as FeatureWithVersion
		val models = PDECore.^default.featureModelManager.findFeatureModels(f.name)

		if (models != null && !models.empty) {
			for (m : models) {
				val ver = m.feature.version
				acceptor.accept(
					createCompletionProposal(ver, new StyledString(ver), ih.getImage("feature_obj.png"), context))
			}
		}

		super.completeFeatureWithVersion_Version(model, assignment, context, acceptor)
	}

	override completeProductExtPoint_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		for (e : LcDslValidator.getAllExtensionsOf(model, LcDslValidator.EXT_PRODUCTS)) {
			acceptor.accept(
				createCompletionProposal(e, new StyledString(e), ih.getImage("product_xml_obj.png"), context))
		}

		super.completeProductExtPoint_Name(model, assignment, context, acceptor)
	}

	override completeApplicationExtPoint_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		for (e : LcDslValidator.getAllExtensionsOf(model, LcDslValidator.EXT_APPLICATIONS)) {
			acceptor.accept(
				createCompletionProposal(e, new StyledString(e), ih.getImage("start_application.png"), context))
		}
		super.completeApplicationExtPoint_Name(model, assignment, context, acceptor)
	}

	override completeTraceEnablement_Plugin(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		for (n : PluginRegistry.activeModels.filter[TracingOptionsManager.isTraceable(it)].map [
			bundleDescription.symbolicName
		]) {
			acceptor.accept(createCompletionProposal(n, new StyledString(n), ih.getImage("plugin_obj.png"), context))
		}
		super.completeTraceEnablement_Plugin(model, assignment, context, acceptor)
	}

	override completeTraceEnablement_What(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		val te = model as TraceEnablement
		val name = te.plugin

		for (s : PDECore.^default.tracingOptionsManager.getTemplateTable(name).keySet) {
			val n = s.substring(s.indexOf('/') + 1)
			acceptor.accept(
				createCompletionProposal("'" + n + "'", new StyledString(n), ih.getImage("doc_section_obj.png"), context))
		}

		super.completeTraceEnablement_What(model, assignment, context, acceptor)
	}

	override completeJavaMainType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val lc = model.eContainer as LaunchConfig

		if (lc.mainProject?.project?.name != null && !lc.mainProject.project.name.empty) {
			// project is set, lookup main types.
			val prj = ResourcesPlugin.workspace.root.getProject(lc.mainProject.project.name)
			if (prj != null && prj.exists && prj.open) {
				val jp = JavaCore.create(prj)

				// source scope for the relevant project
				val scope = SearchEngine.createJavaSearchScope(#{jp}, IJavaSearchScope.SOURCES)
				val pattern = SearchPattern.createPattern("main", IJavaSearchConstants.METHOD,
					IJavaSearchConstants.DECLARATIONS, SearchPattern.R_EXACT_MATCH)
				val engine = new SearchEngine()

				engine.search(pattern, #{SearchEngine.defaultSearchParticipant}, scope, [ m |
					System.err.println(m.element)
					if (m.element != null && m.element instanceof IMethod) {
						val ele = m.element as IMethod
						if (ele.mainMethod) {
							val fullName = ele.declaringType.fullyQualifiedName
							acceptor.accept(
								createCompletionProposal(fullName, new StyledString(fullName),
									ih.getImage("java_launch.gif"), context))
						}
					}
				], null)
			}
		}
		
		super.completeJavaMainType_Name(model, assignment, context, acceptor)
	}

	override completeExecutionEnvironment_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		JavaRuntime.getExecutionEnvironmentsManager().getExecutionEnvironments().forEach [
			acceptor.accept(createCompletionProposal(id, new StyledString(id), ih.getImage("library_obj.png"), context))
		]

		super.completeExecutionEnvironment_Name(model, assignment, context, acceptor)
	}

}
