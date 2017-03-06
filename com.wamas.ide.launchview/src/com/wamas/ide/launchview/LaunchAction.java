/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launchview;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.jface.action.Action;

import com.wamas.ide.launchview.model.LaunchObjectModel;

public class LaunchAction extends Action {

	private static final Map<String, String> COMMON_MODE_ICONS;
	
	static {
		COMMON_MODE_ICONS = new TreeMap<>();
		COMMON_MODE_ICONS.put("run", "icons/launch_run.gif");
		COMMON_MODE_ICONS.put("debug", "icons/debug_exc.gif");
		COMMON_MODE_ICONS.put("profile", "icons/profile_exc.gif");
	}
	
    private final Set<LaunchObjectModel> models;
    private final ILaunchMode mode;

    public LaunchAction(ILaunchMode mode, Set<LaunchObjectModel> models) {
        this.mode = mode;
        this.models = models;

        setText(mode.getLabel() + " selected");
        
        if(COMMON_MODE_ICONS.containsKey(mode.getIdentifier())) {
        	setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, COMMON_MODE_ICONS.get(mode.getIdentifier())));
        }
    }

    @Override
    public void run() {
        for (LaunchObjectModel m : models) {
            m.getObject().launch(mode);
        }
    }

}
