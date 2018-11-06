/*
 * generated by Xtext 2.12.0
 */
package com.wamas.ide.launching.formatting2

import com.google.inject.Inject
import com.wamas.ide.launching.lcDsl.AddFeature
import com.wamas.ide.launching.lcDsl.AddPlugin
import com.wamas.ide.launching.lcDsl.EnvironmentVariable
import com.wamas.ide.launching.lcDsl.GroupMember
import com.wamas.ide.launching.lcDsl.IgnorePlugin
import com.wamas.ide.launching.lcDsl.LCModel
import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.ProgramArgument
import com.wamas.ide.launching.lcDsl.TraceEnablement
import com.wamas.ide.launching.lcDsl.VmArgument
import com.wamas.ide.launching.services.LcDslGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.apache.commons.logging.impl.ServletContextCleaner
import com.wamas.ide.launching.lcDsl.RapServletConfig

class LcDslFormatter extends AbstractFormatter2 {
	
	@Inject extension LcDslGrammarAccess

	def dispatch void format(LCModel lCModel, extension IFormattableDocument document) {
		for (LaunchConfig launchConfig : lCModel.getConfigurations()) {
			launchConfig.format;
		}
	}

	def dispatch void format(LaunchConfig launchConfig, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc.
		val open = launchConfig.regionFor.ruleCall(launchConfigAccess.BLOCK_BEGINTerminalRuleCall_5)
		val close = launchConfig.regionFor.ruleCall(launchConfigAccess.BLOCK_ENDTerminalRuleCall_7)
		
		open.append[newLine]
		close.prepend[newLine]
		
		interior(open, close)[indent]
		 
		launchConfig.getClears.format;
		launchConfig.getWorkspace.format;
		launchConfig.getWorkingDir.format;
		launchConfig.getMemory.format;
		launchConfig.getMainProject.format;
		launchConfig.getMainType.format;
		launchConfig.getApplication.format;
		launchConfig.getProduct.format;
		launchConfig.getFavorites.format;
		launchConfig.getRedirect.format;
		launchConfig.getExecEnv.format;
		launchConfig.getConfigIniTemplate.format;
		launchConfig.getJavaMainSearch.format;
		launchConfig.getServletConfig.format;
		launchConfig.getContentProviderProduct.format;
		for (AddPlugin addPlugin : launchConfig.getPlugins()) {
			addPlugin.format;
		}
		for (AddFeature addFeature : launchConfig.getFeatures()) {
			addFeature.format;
		}
		for (IgnorePlugin ignorePlugin : launchConfig.getIgnore()) {
			ignorePlugin.format;
		}
		for (GroupMember groupMember : launchConfig.getGroupMembers()) {
			groupMember.format;
		}
		for (VmArgument vmArgument : launchConfig.getVmArgs()) {
			vmArgument.format;
		}
		for (ProgramArgument programArgument : launchConfig.getProgArgs()) {
			programArgument.format;
		}
		for (EnvironmentVariable environmentVariable : launchConfig.getEnvVars()) {
			environmentVariable.format;
		}
		for (TraceEnablement traceEnablement : launchConfig.getTraces()) {
			traceEnablement.format;
		}
	}

	def dispatch void format(RapServletConfig cfg, extension IFormattableDocument document) {
		val open = cfg.regionFor.ruleCall(rapServletConfigAccess.BLOCK_BEGINTerminalRuleCall_1)
		val close = cfg.regionFor.ruleCall(rapServletConfigAccess.BLOCK_ENDTerminalRuleCall_3)
		
		open.append[newLine]
		close.prepend[newLine]
		
		interior(open, close)[indent]
	}
}