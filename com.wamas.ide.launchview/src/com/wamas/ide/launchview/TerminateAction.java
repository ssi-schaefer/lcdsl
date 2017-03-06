package com.wamas.ide.launchview;

import java.util.Collection;

import org.eclipse.jface.action.Action;

import com.wamas.ide.launchview.model.LaunchObjectModel;

public class TerminateAction extends Action {

	private Collection<LaunchObjectModel> models;

	public TerminateAction(Collection<LaunchObjectModel> models) {
		this.models = models;
		
		setText("Terminate");
		setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/progress_stop.gif"));
	}
	
	@Override
	public boolean isEnabled() {
		return models.stream().allMatch(m -> m.getObject() != null && m.getObject().canTerminate());
	}
	
	@Override
	public void run() {
		for(LaunchObjectModel model : models) {
			model.getObject().terminate();
		}
	}
	
}
