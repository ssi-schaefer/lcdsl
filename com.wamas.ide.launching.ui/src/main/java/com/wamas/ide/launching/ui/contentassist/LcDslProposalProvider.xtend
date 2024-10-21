/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.contentassist

import com.google.inject.Inject
import com.wamas.ide.launching.generator.RecursiveCollectors
import com.wamas.ide.launching.lcDsl.FeatureWithVersion
import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.PluginWithVersion
import com.wamas.ide.launching.lcDsl.TraceEnablement
import com.wamas.ide.launching.services.LcDslGrammarAccess
import com.wamas.ide.launching.validation.InternalApiCalls
import com.wamas.ide.launching.validation.LcDslValidator
import java.util.stream.Stream
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EObject
import org.eclipse.jdt.core.Flags
import org.eclipse.jdt.core.IJavaElement
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.IMethod
import org.eclipse.jdt.core.IPackageFragment
import org.eclipse.jdt.core.IPackageFragmentRoot
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.search.IJavaSearchConstants
import org.eclipse.jdt.core.search.IJavaSearchScope
import org.eclipse.jdt.core.search.SearchEngine
import org.eclipse.jdt.core.search.SearchPattern
import org.eclipse.jdt.internal.core.JavaProject
import org.eclipse.jdt.launching.JavaRuntime
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.jface.viewers.StyledString
import org.eclipse.pde.core.plugin.IMatchRules
import org.eclipse.pde.core.plugin.PluginRegistry
import org.eclipse.pde.internal.core.PDECore
import org.eclipse.pde.internal.core.TracingOptionsManager
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.IImageHelper
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor.Delegate

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class LcDslProposalProvider extends AbstractLcDslProposalProvider {

	@Inject
	IImageHelper ih

	@Inject
	extension LcDslGrammarAccess ga
	
	override complete_Project(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		for (prj : ResourcesPlugin.workspace.root.projects) {
			if (prj !== null && prj.exists && prj.open && JavaProject.hasJavaNature(prj)) {
				acceptor.accept(
					createCompletionProposal(prj.name, new StyledString(prj.name), ih.getImage("showprojects.gif"),
						context))
			}
		}

		super.complete_Project(model, ruleCall, context, acceptor)
	}
	
	override completeLaunchConfig_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("MyConfiguration", new StyledString("MyConfiguration"), ih.getImage("start_application.png"), context));
		
		super.completeLaunchConfig_Name(model, assignment, context, acceptor);
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

		if (models !== null && !models.empty) {
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

		if (models !== null && !models.empty) {
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

		for (s : InternalApiCalls.pdeCoreGetTemplateTable(name).keySet) {
			val n = s.substring(s.indexOf('/') + 1)
			acceptor.accept(
				createCompletionProposal("'" + n + "'", new StyledString(n), ih.getImage("doc_section_obj.png"),
					context))
			}

			super.completeTraceEnablement_What(model, assignment, context, acceptor)
		}

		override completeJavaMainType_Name(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
			val lc = model.eContainer as LaunchConfig
			val mainprj = RecursiveCollectors.collectJavaMainProject(lc)

			if (mainprj !== null) {
				// project is set, lookup main types.
				val prj = ResourcesPlugin.workspace.root.getProject(mainprj)
				if (prj !== null && prj.exists && prj.open) {
					val jp = JavaCore.create(prj)

					// source scope for the relevant project
					val scope = SearchEngine.createJavaSearchScope(#{jp}, IJavaSearchScope.SOURCES)
					val pattern = SearchPattern.createPattern("main", IJavaSearchConstants.METHOD,
						IJavaSearchConstants.DECLARATIONS, SearchPattern.R_EXACT_MATCH)
					val engine = new SearchEngine()

					engine.search(pattern, #{SearchEngine.defaultSearchParticipant}, scope, [ m |
						if (m.element !== null && m.element instanceof IMethod) {
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
				acceptor.accept(
					createCompletionProposal("'" + id + "'", new StyledString(id), ih.getImage("library_obj.png"), context))
			]

			super.completeExecutionEnvironment_Name(model, assignment, context, acceptor)
		}

		override completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
			super.completeKeyword(keyword, contentAssistContext, new DescribingAcceptor(acceptor, keyword, ga))
		}
		
		override completeTestConfig_Container(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			val lc = model.eContainer as LaunchConfig
			val testContainer = RecursiveCollectors.collectTestContainerPlain(lc)
	
			if (testContainer === null) {
				addAllProjects(acceptor, context)
			} else {
				var resource = findExistingContainerResource(new Path(testContainer) as IPath)
				if (resource === null) {
					addAllProjects(acceptor, context)
				} else if (resource instanceof IContainer) {
					resource.members.stream().filter([childResource | isJavaTestContainer(childResource)]).map([project | project.fullPath]).map([fullPath | fullPath.toString]).forEach [path |
						acceptor.accept(createCompletionProposal("'" + path, new StyledString(path), ih.getImage("test_container.png"), context))
					]
				}
			}

			super.completeTestConfig_Container(model, assignment, context, acceptor)
		}

		private def void addAllProjects(ICompletionProposalAcceptor acceptor, ContentAssistContext context) {
			ResourcesPlugin.workspace.root.projects.stream().filter([project | isJavaTestContainer(project)]).map([project | project.fullPath]).map([fullPath | fullPath.toString]).forEach [path |
				acceptor.accept(createCompletionProposal("'" + path + "'", new StyledString(path), ih.getImage("test_container.png"), context))
			]
		}

		private def IResource findExistingContainerResource(IPath path) {
			val resource = ResourcesPlugin.workspace.root.findMember(path)
			if (resource !== null) {
				return resource;
			}

			val parentPath = path.removeLastSegments(1);
			if (parentPath === path) {
				return null;
			}

			return findExistingContainerResource(parentPath);
		}

		private def boolean isJavaTestContainer(IResource resource) {
			val javaElement = JavaCore.create(resource)

			return isJavaContainer(javaElement) && containsTestClasses(javaElement, true) 
		}

		private def boolean isJavaContainer(IJavaElement javaElement) {
			val elementType = javaElement?.elementType

			return IJavaElement.JAVA_PROJECT === elementType || IJavaElement.PACKAGE_FRAGMENT_ROOT === elementType || IJavaElement.PACKAGE_FRAGMENT === elementType 
		}

		private def boolean containsTestClasses(IJavaElement javaElement, boolean testChildPackages) {
			if (!javaElement.exists) {
				return false;
			}

			if (javaElement instanceof IJavaProject) {
				return javaElement.allPackageFragmentRoots.stream().anyMatch([p | containsTestClasses(p, false)])
			} else if (javaElement instanceof IPackageFragmentRoot) {
				return javaElement.children.stream().anyMatch([p | containsTestClasses(p, false)])
			} else if (javaElement instanceof IPackageFragment) {
				if (testChildPackages) {
					val javaElementRoot = javaElement.parent as IPackageFragmentRoot
					return javaElementRoot.children.stream.filter([p | p.elementName.startsWith(javaElement.elementName)]).map([p | p as IPackageFragment])
							.anyMatch([p | containsTestClasses(p)])
				} else {
					return containsTestClasses(javaElement)
				}
			}

			return false
		}

		private def boolean containsTestClasses(IPackageFragment javaElement) {
			javaElement.compilationUnits.stream
					.flatMap([unit | unit.allTypes.stream])
					.anyMatch([type | type.methods.stream().anyMatch([method  | isTestMethod(method)])])
		}

		override completeTestConfig_Class(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			val lc = model.eContainer as LaunchConfig
			val resource = RecursiveCollectors.collectTestContainerResource(lc);

			if (resource !== null) {
				val javaElement = JavaCore.create(resource)
				val allClassNames = findAllTestClasses(javaElement)

				allClassNames.forEach [ className |
					acceptor.accept(createCompletionProposal(className, new StyledString(className), ih.getImage("test_class.png"), context))
				]

			}

			super.completeTestConfig_Class(model, assignment, context, acceptor)
		}

		private def Stream<String> findAllTestClasses(IJavaElement javaElement) {
			if (javaElement instanceof IJavaProject) {
				return findAllTestClasses(javaElement.allPackageFragmentRoots.stream().flatMap([root | root.children.stream]).map([p | p as IPackageFragment]))
			} else if (javaElement instanceof IPackageFragmentRoot) {
				return findAllTestClasses(javaElement.children.stream.map([p | p as IPackageFragment]))
			} else if (javaElement instanceof IPackageFragment) {
				val javaElementRoot = javaElement.parent as IPackageFragmentRoot
				return findAllTestClasses(javaElementRoot.children.stream.filter([p | p.elementName.startsWith(javaElement.elementName)]).map([p | p as IPackageFragment]))
			}

			return Stream.empty
		}

		private def Stream<String> findAllTestClasses(Stream<IPackageFragment> stream) {
			stream.flatMap([p | p.compilationUnits.stream]).flatMap([unit | unit.allTypes.stream]).filter([type | type.methods.stream().anyMatch([method  | isTestMethod(method)])]).map([type | type.fullyQualifiedName])
		}

		override completeTestConfig_Method(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			val lc = model.eContainer as LaunchConfig
			val className = RecursiveCollectors.collectTestMainType(lc)
			val project = RecursiveCollectors.collectTestContainerResource(lc)?.project

			if (project !== null && className !== null) {
				val javaProject = JavaCore.create(project)

				val type = javaProject.findType(className)
				type.methods.stream().filter([method  | isTestMethod(method)]).map([method | method.elementName]).forEach [ name |
					acceptor.accept(createCompletionProposal("'" + name + "'", new StyledString(name), ih.getImage("test_method.png"), context))
				]
			}

			super.completeTestConfig_Method(model, assignment, context, acceptor)
		}

		private def boolean isTestMethod(IMethod method) {
			return Flags.isPublic(method.flags) && method.annotations.stream().anyMatch([annotation | LcDslValidator.TEST_ANNOTATION_NAMES.contains(annotation.elementName)])
		}

		override protected getImage(EObject eObject) {
			switch eObject {
				case launchConfigAccess.explicitExplicitKeyword_0_0_0,
				case launchConfigAccess.manualManualKeyword_0_1_0,
				case launchConfigAccess.abstractAbstractKeyword_0_2_0,
				case launchConfigAccess.foregroundForegroundKeyword_0_3_0,
				case launchConfigAccess.noConsoleNoConsoleKeyword_0_4_0,
				case launchConfigAccess.noValidateNoValidateKeyword_0_5_0,
				case launchConfigAccess.swInstallSupportSwInstallAllowedKeyword_0_6_0,
				case launchConfigAccess.replaceEnvReplaceEnvKeyword_0_7_0,
				case launchConfigAccess.stopInMainStopInMainKeyword_0_8_0,
				case launchConfigAccess.keepRunningKeepRunningKeyword_0_9_0,
				case launchConfigAccess.runInUiThreadRunInUiThreadKeyword_0_10_0,
				case launchConfigAccess.qualifyQualifiedKeyword_0_11_0_0: ih.getImage("style_modified.gif")
				case workspaceAccess.workspaceKeyword_0: ih.getImage("workspace_obj.gif")
				case workingDirAccess.workingDirKeyword_0: ih.getImage("folder.png")
				case mainProjectAccess.projectKeyword_0: ih.getImage("showprojects.gif")
				case mainTypeAccess.mainClassKeyword_0: ih.getImage("java_launch.gif")
				case addPluginAccess.optionalOptionalKeyword_0_0,
				case addFeatureAccess.optionalOptionalKeyword_0_0: ih.getImage("optional.gif")
				case ignorePluginAccess.ignoreKeyword_0,
				case addPluginAccess.pluginKeyword_1: ih.getImage("plugin_obj.png")
				case addFeatureAccess.featureKeyword_1: ih.getImage("feature_obj.png")
				case contentProviderProductAccess.contentProviderKeyword_0: ih.getImage("product_xml_obj.png")
				case vmArgumentAccess.vmArgumentKeyword_1,
				case programArgumentAccess.argumentKeyword_1: ih.getImage("arguments_tab.gif")
				case environmentVariableAccess.environmentKeyword_1: ih.getImage("environment_obj.png")
				case applicationExtPointAccess.applicationKeyword_0: ih.getImage("start_application.png")
				case productExtPointAccess.productKeyword_0: ih.getImage("product_xml_obj.png")
				case favoritesAccess.favoriteKeyword_1: ih.getImage("favorite_star.png")
				case redirectAccess.redirectKeyword_1: ih.getImage("edit_arrow2.gif")
				case executionEnvironmentAccess.executionEnvironmentKeyword_0: ih.getImage("library_obj.png")
				case configIniTemplateAccess.configIniTemplateKeyword_0: ih.getImage("option_obj.gif")
				case traceEnablementAccess.traceKeyword_0: ih.getImage("doc_section_obj.png")
				case javaMainSearchAccess.searchMainKeyword_1: ih.getImage("search.png")
				case rapServletConfigAccess.servletKeyword_0,
				case rapServletConfigAccess.pathKeyword_2_0_0,
				case rapServletConfigAccess.browserKeyword_2_1_0,
				case rapServletConfigAccess.portKeyword_2_2_0,
				case rapServletConfigAccess.sessionTimeoutKeyword_2_3_0,
				case rapServletConfigAccess.contextPathKeyword_2_4_0,
				case rapServletConfigAccess.devModeKeyword_2_5_0: ih.getImage("launcher.gif")
				case pluginWithVersionAndStartLevelAccess.autoStartAutostartKeyword_1_0_0,
				case pluginWithVersionAndStartLevelAccess.startlevelKeyword_1_1_0: ih.getImage("plugin_obj.png")
				case clearOptionAccess.clearKeyword_1: ih.getImage("clear.gif")
				case clearOptionAccess.workspaceWorkspaceKeyword_2_0_0_0_0: ih.getImage("workspace_obj.gif")
				case clearOptionAccess.logLogKeyword_2_0_0_1_0: ih.getImage("doc_section_obj.png")
				case clearOptionAccess.configConfigKeyword_2_1_0: ih.getImage("option_obj.gif")
				case memoryOptionAccess.memoryKeyword_1,
				case memoryOptionAccess.minKeyword_2_0_0,
				case memoryOptionAccess.maxKeyword_2_1_0,
				case memoryOptionAccess.permKeyword_2_2_0: ih.getImage("memory_view.png")
				case groupMemberAccess.adoptAdoptKeyword_0_1_0,
				case groupMemberAccess.memberKeyword_1,
				case groupPostLaunchDelayAccess.delayKeyword_0,
				case groupPostLaunchRegexAccess.regexKeyword_0,
				case groupPostLaunchWaitAccess.waitKeyword_1: ih.getImage("lgroup_obj.png")
				case browserLaunchModeAccess.INTERNALInternalKeyword_0_0,
				case browserLaunchModeAccess.EXTERNALExternalKeyword_1_0,
				case browserLaunchModeAccess.NONENoneKeyword_2_0: ih.getImage("launcher.gif")
				case launchConfigTypeAccess.JAVAJavaKeyword_0_0,
				case launchConfigTypeAccess.ECLIPSEEclipseKeyword_1_0,
				case launchConfigTypeAccess.RAPRapKeyword_2_0,
				case launchConfigTypeAccess.GROUPGroupKeyword_3_0,
				case launchConfigTypeAccess.SWTBOTSwtbotKeyword_4_0,
				case launchConfigTypeAccess.JUNIT_PLUGINJunitPluginKeyword_5_0 : ih.getImage("launch_run.gif")
				case launchModeTypeAccess.RUNRunKeyword_1_0,
				case launchModeTypeAccess.DEBUGDebugKeyword_2_0,
				case launchModeTypeAccess.PROFILEProfileKeyword_3_0,
				case launchModeTypeAccess.COVERAGECoverageKeyword_4_0,
				case launchModeTypeAccess.INHERITInheritKeyword_0_0: ih.getImage("launch_run.gif")
				case memoryUnitAccess.MBMbKeyword_1_0,
				case memoryUnitAccess.MBMBKeyword_2_0,
				case memoryUnitAccess.MBMKeyword_0_0,
				case memoryUnitAccess.MBMKeyword_3_0,
				case memoryUnitAccess.GBGbKeyword_5_0,
				case memoryUnitAccess.GBGBKeyword_6_0,
				case memoryUnitAccess.GBGKeyword_4_0,
				case memoryUnitAccess.GBGKeyword_7_0: ih.getImage("memory_view.png")
				case outputStreamAccess.STDOUTStdoutKeyword_0_0,
				case outputStreamAccess.STDERRStderrKeyword_1_0,
				case outputStreamAccess.BOTHBothOutKeyword_2_0,
				case inputStreamAccess.STDINStdinKeyword_0: ih.getImage("edit_arrow2.gif")
				case testConfigAccess.testKeyword_1: ih.getImage("test_config_junit_plugin.png")
				case testConfigAccess.runnerKeyword_3_0_0: ih.getImage("test_runner.png")
				case testConfigAccess.containerKeyword_3_1_0: ih.getImage("test_container.png")
				case testConfigAccess.classKeyword_3_2_0: ih.getImage("test_class.png")
				case testConfigAccess.methodKeyword_3_3_0: ih.getImage("test_method.gif")
				case testConfigAccess.excludeTagsKeyword_3_4_0: ih.getImage("test_exclude_tags.png")
				case testConfigAccess.includeTagsKeyword_3_5_0: ih.getImage("test_include_tags.png")
				default: super.getImage(eObject)
			}
		}

		private static class DescribingAcceptor extends Delegate {

			Keyword kw
			extension LcDslGrammarAccess ga

			new(ICompletionProposalAcceptor delegate, Keyword kw, LcDslGrammarAccess ga) {
				super(delegate)
				this.kw = kw;
				this.ga = ga;
			}

			override accept(ICompletionProposal p) {
				switch kw {
					case launchConfigAccess.explicitExplicitKeyword_0_0_0:
						p.addDescription(
							"Explicitly defines all plugins/features to use. Avoids automatic dependency resolution.")
					case launchConfigAccess.manualManualKeyword_0_1_0:
						p.addDescription(
							"Does not automatically generate the Eclipse Launch Configuration on build. However if a launch configuration is manually generated once, it will be updated by the build automatically (until deleted manually again).")
					case launchConfigAccess.abstractAbstractKeyword_0_2_0:
						p.addDescription(
							"Defines a launch configuration that serves as basis for other configurations only.")
					case launchConfigAccess.foregroundForegroundKeyword_0_3_0:
						p.addDescription("Disables 'launch in background'")
					case launchConfigAccess.noConsoleNoConsoleKeyword_0_4_0:
						p.addDescription("Do not allocate a console for the process when launched")
					case launchConfigAccess.noValidateNoValidateKeyword_0_5_0:
						p.addDescription("Do not validate the set of selected plugins prior to launching")
					case launchConfigAccess.swInstallSupportSwInstallAllowedKeyword_0_6_0:
						p.addDescription(
							"Generate a P2 profile for the launch, which allows to install software into the launched application via P2.")
					case launchConfigAccess.replaceEnvReplaceEnvKeyword_0_7_0:
						p.addDescription(
							"Instead of appending environment variables, replace the whole environment of the target process with the defined environment variables.")
					case launchConfigAccess.stopInMainStopInMainKeyword_0_8_0:
						p.addDescription("When debugging, always stop on the first line of the configured main.")
					case ignorePluginAccess.ignoreKeyword_0:
						p.addDescription("Ignores the given plugin as well as any dependencies of it during automatic dependency resolution. Does not remove an explicitly added plugin (directly or indirectly added - for example through features, ...).")
				}

				super.accept(p)
			}

			private def addDescription(ICompletionProposal proposal, String description) {
				if (proposal instanceof ConfigurableCompletionProposal) {
					proposal.additionalProposalInfo = description;
				}
			}

		}

	}
	
