/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.outline

import com.wamas.ide.launching.lcDsl.LCModel
import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.ProgramArgument
import com.wamas.ide.launching.lcDsl.VmArgument
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
class LcDslOutlineTreeProvider extends DefaultOutlineTreeProvider {

	override protected _isLeaf(EObject modelElement) {
		switch(modelElement) {
			LCModel, LaunchConfig, VmArgument, ProgramArgument: false
			default: true
		}
	}
	
}
