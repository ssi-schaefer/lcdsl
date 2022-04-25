/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui

import com.google.inject.Inject
import com.google.inject.Provider
import com.wamas.ide.launching.ui.build.LcDslContainerManager
import com.wamas.ide.launching.ui.build.LcDslContainerState
import com.wamas.ide.launching.ui.build.LcDslResourceSetProvider
import com.wamas.ide.launching.ui.build.LcDslResourceUIServiceProvider
import com.wamas.ide.launching.ui.hyperlink.LcDslHyperlinkHelper
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.generator.IShouldGenerate
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.containers.IAllContainersState
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper
import org.eclipse.xtext.ui.resource.DefaultResourceUIServiceProvider
import org.eclipse.xtext.ui.resource.IResourceSetProvider
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class LcDslUiModule extends AbstractLcDslUiModule {
	
	override Class<? extends IShouldGenerate> bindIShouldGenerate() {
		return IShouldGenerate.Always
	}

	def Class<? extends IHyperlinkHelper> bindIHyperlinkHelper() {
		return LcDslHyperlinkHelper
	}
	
	override bindIResourceForEditorInputFactory() {
		LcDslResourceForIEditorInputFactory
	}
	
	def Class<? extends DefaultResourceUIServiceProvider> bindDefaultResourceUIServiceProvider() {
		LcDslResourceUIServiceProvider
	}

	def Class<? extends IContainer.Manager> bindIContainer$Manager() {
		return LcDslContainerManager
	}
	
	override Class<? extends IResourceSetProvider> bindIResourceSetProvider() {
		return LcDslResourceSetProvider;
	}
	
	override provideIAllContainersState() {
		return new Provider<IAllContainersState>() {
			@Inject
			LcDslContainerState state;
			
			override get() {
				return state;
			}
			
		}
	}
	
	def Class<? extends LanguageSpecificURIEditorOpener> bindEditorOpener() {
		return LcDslEditorOpener
	}
	
}
