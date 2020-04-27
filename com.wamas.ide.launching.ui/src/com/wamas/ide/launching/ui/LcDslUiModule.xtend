/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui

import com.wamas.ide.launching.ui.hyperlink.LcDslHyperlinkHelper
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.generator.IShouldGenerate
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class LcDslUiModule extends AbstractLcDslUiModule {
	
	override Class<? extends IShouldGenerate> bindIShouldGenerate() {
		return IShouldGenerate.Always;
	}

	def Class<? extends IHyperlinkHelper> bindIHyperlinkHelper() {
		return LcDslHyperlinkHelper;
	}
	
}
