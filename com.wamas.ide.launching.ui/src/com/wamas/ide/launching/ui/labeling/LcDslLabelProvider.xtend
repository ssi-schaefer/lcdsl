/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.labeling

import com.google.common.base.Joiner
import com.google.inject.Inject
import com.wamas.ide.launching.generator.StandaloneLaunchConfigGenerator
import com.wamas.ide.launching.lcDsl.AddPlugin
import com.wamas.ide.launching.lcDsl.ApplicationExtPoint
import com.wamas.ide.launching.lcDsl.ClearOption
import com.wamas.ide.launching.lcDsl.ConfigIniTemplate
import com.wamas.ide.launching.lcDsl.EnvironmentVariable
import com.wamas.ide.launching.lcDsl.ExecutionEnvironment
import com.wamas.ide.launching.lcDsl.Favorites
import com.wamas.ide.launching.lcDsl.IgnorePlugin
import com.wamas.ide.launching.lcDsl.JavaMainSearch
import com.wamas.ide.launching.lcDsl.LCModel
import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.MainProject
import com.wamas.ide.launching.lcDsl.MainType
import com.wamas.ide.launching.lcDsl.MemoryOption
import com.wamas.ide.launching.lcDsl.ProductExtPoint
import com.wamas.ide.launching.lcDsl.ProgramArgument
import com.wamas.ide.launching.lcDsl.Redirect
import com.wamas.ide.launching.lcDsl.StringWithVariables
import com.wamas.ide.launching.lcDsl.TraceEnablement
import com.wamas.ide.launching.lcDsl.VmArgument
import com.wamas.ide.launching.lcDsl.WorkingDir
import com.wamas.ide.launching.lcDsl.Workspace
import org.eclipse.debug.internal.ui.DebugPluginImages
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.jface.viewers.StyledString
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

import static extension com.wamas.ide.launching.validation.LcDslValidator.getExpanded
import com.wamas.ide.launching.lcDsl.GroupMember
import com.wamas.ide.launching.lcDsl.GroupPostLaunchAction
import com.wamas.ide.launching.lcDsl.GroupPostLaunchWait
import com.wamas.ide.launching.lcDsl.GroupPostLaunchDelay
import com.wamas.ide.launching.lcDsl.GroupPostLaunchRegex
import com.wamas.ide.launching.lcDsl.AddFeature
import com.wamas.ide.launching.lcDsl.ContentProviderProduct

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class LcDslLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	def image(LCModel m) {
		"launch_run.gif"
	}

	def text(LaunchConfig lc) {
		val ss = new StyledString(lc.name)

		val flags = newArrayList()

		if (lc.explicit)
			flags.add("explicit")
		if (lc.manual)
			flags.add("manual")
		if (lc.stopInMain)
			flags.add("stop-in-main")

		if (!flags.empty) {
			ss.append(" [" + Joiner.on(", ").join(flags) + "]", StyledString.DECORATIONS_STYLER)
		}

		ss
	}
	
	def image(LaunchConfig lc) {
		val img = DebugPluginImages.getImage(StandaloneLaunchConfigGenerator.getTypeName(lc.type))
		if(img == null)
			return "message_warning.gif"
		img
	}

	def text(Redirect r) {
		val builder = new StringBuilder
		builder.append("redirect")
		if (r.outFile != null) {
			builder.append(' ').append(r.outWhich.literal).append(" to ").append(r.outFile.name.expanded)
		}
		if (r.inFile != null) {
			builder.append(' ').append(r.inWhich.literal).append(" from ").append(r.inFile.name.expanded)
		}
		builder.toString
	}
	
	def image(Redirect r) {
		"edit_arrow2.gif"
	}

	def text(Workspace ws) {
		"workspace " + ws.workspace.name.expanded
	}
	
	def image(Workspace ws) {
		"workspace_obj.gif"
	}

	def text(WorkingDir wd) {
		"working directory " + wd.workingDir.name.expanded
	}
	
	def image(WorkingDir wd) {
		"folder.png"
	}

	def text(AddPlugin a) {
		val p = a.plugin
		val ss = new StyledString
		ss.append("plugin ").append(p.plugin.name)
		if (p.plugin.version != null)
			ss.append(' ').append(p.plugin.version, StyledString.QUALIFIER_STYLER)

		if (p.autoStart)
			ss.append(' ').append("[autostart]", StyledString.DECORATIONS_STYLER)

		if (p.startLevel != 0)
			ss.append(' ').append("[lvl=" + p.startLevel + "]", StyledString.DECORATIONS_STYLER)

		ss
	}
	
	def image(AddPlugin a) {
		if(a.optional)
			"plugin_obj_opt.png"
		else
			"plugin_obj.png"
	}
	
	def text(AddFeature a) {
		val ss = new StyledString("feature " + a.feature.name)
		if(a.feature.version != null)
			ss.append(' ').append(a.feature.version, StyledString.QUALIFIER_STYLER)
		
		ss
	}
	
	def image(AddFeature a) {
		if(a.optional)
			"feature_obj_opt.png"
		else
			"feature_obj.png"
	}
	
	def text(ContentProviderProduct p) {
		"expand content from " + p.product.name.expanded
	}
	
	def image(ContentProviderProduct p) {
		"product_xml_obj.png"
	}
	
	def text(IgnorePlugin i) {
		val ss = new StyledString
		ss.append("ignore ").append(i.plugin.name)
		if (i.plugin.version != null)
			ss.append(' ').append(i.plugin.version, StyledString.QUALIFIER_STYLER)
		ss
	}
	
	def image(IgnorePlugin i) {
		"plugin_obj_ignore.png"
	}

	def text(TraceEnablement e) {
		"trace " + e.plugin + " [" + Joiner.on(", ").join(e.what) + "]"
	}
	
	def image(TraceEnablement e) {
		"doc_section_obj.png"
	}

	def text(ExecutionEnvironment e) {
		"exec-env " + e.name
	}
	
	def image(ExecutionEnvironment e) {
		"library_obj.png"
	}

	def text(ApplicationExtPoint e) {
		"application " + e.name
	}
	
	def image(ApplicationExtPoint e) {
		"start_application.png"
	}

	def text(ProductExtPoint e) {
		"product " + e.name
	}
	
	def image(ProductExtPoint e) {
		"product_xml_obj.png"
	}

	def text(ClearOption co) {
		val builder = new StringBuilder
		builder.append("clear")
		if (co.workspace) {
			builder.append(" workspace")
		} else if (co.log) {
			builder.append(" log")
		}
		if ((co.workspace || co.log) && co.noAskClear)
			builder.append(" (don't ask)")

		if (co.config) {
			if (co.workspace || co.log)
				builder.append(", ")

			builder.append("config area")
		}
	}
	
	def image(ClearOption o) {
		"clear.gif"
	}

	def text(Favorites f) {
		"favorite for " + Joiner.on(", ").join(f.types)
	}
	
	def image(Favorites f) {
		"favorite_star.png"
	}

	def text(ConfigIniTemplate t) {
		"config.ini template " + t.path.name.expanded
	}
	
	def image(ConfigIniTemplate t) {
		"option_obj.gif"
	}

	def text(MemoryOption mo) {
		val builder = new StringBuilder
		builder.append("memory")

		if (mo.min != 0)
			builder.append(" min=").append(mo.min).append(mo.minUnit.literal)
		if (mo.max != 0)
			builder.append(" max=").append(mo.max).append(mo.maxUnit.literal)
		if (mo.perm != 0)
			builder.append(" perm=").append(mo.perm).append(mo.permUnit.literal)

		builder.toString
	}
	
	def image(MemoryOption mo) {
		"memory_view.png"
	}

	def text(MainProject mp) {
		"project " + mp.project.name
	}
	
	def image(MainProject mp) {
		"showprojects.gif"
	}

	def text(MainType mt) {
		"main-class " + mt.mainClass.name
	}
	
	def image(MainType mt) {
		"java_launch.gif"
	}

	def text(JavaMainSearch s) {
		val builder = new StringBuilder().append("search main method in")
		if (s.system)
			builder.append(" system")
		if (s.inherited)
			builder.append(" inherited")
		builder.toString
	}
	
	def image(JavaMainSearch s) {
		"search.png"
	}

	def text(VmArgument va) {
		"vmargs " + Joiner.on(' ').join(va.arguments.map[expanded])
	}
	
	def image(VmArgument va) {
		"vm.png"
	}

	def text(ProgramArgument pa) {
		"args " + Joiner.on(' ').join(pa.arguments.map[expanded])
	}
	
	def image(ProgramArgument pa) {
		"arguments_tab.gif"
	}

	def text(EnvironmentVariable e) {
		"env " + e.name + "=" + e.value.expanded
	}
	
	def image(EnvironmentVariable e) {
		"environment_obj.png"
	}
	
	def text(GroupMember m) {
		val ss = new StyledString(m.member.name)
		
		ss.append(" [" + m.type, StyledString.QUALIFIER_STYLER)
		if(m.adopt)
			ss.append(", adopt]", StyledString.QUALIFIER_STYLER)
		else
			ss.append("]", StyledString.QUALIFIER_STYLER)
		
		if(m.postAction != null) {
			ss.append(" [" + m.postAction.text() + "]", StyledString.DECORATIONS_STYLER)
		}
		
		ss
	}
	
	def text(GroupPostLaunchAction e) {
		switch e {
			GroupPostLaunchWait: "wait exit"
			GroupPostLaunchDelay: "delay " + e.delay + "ms"
			GroupPostLaunchRegex: "wait output: \"" + e.regex + "\""
		}
	}
	
	def image(GroupMember m) {
		"lgroup_obj.png"
	}
	
	def image(StringWithVariables s) {
		doGetImage(s.eContainer)
	}
}
