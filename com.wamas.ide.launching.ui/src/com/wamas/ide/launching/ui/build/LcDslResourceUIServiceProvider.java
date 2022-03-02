package com.wamas.ide.launching.ui.build;

import org.eclipse.core.resources.IStorage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJarEntryResource;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.PluginModelManager;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.resource.DefaultResourceUIServiceProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("restriction")
@Singleton
public class LcDslResourceUIServiceProvider extends DefaultResourceUIServiceProvider {

	@Inject
	public LcDslResourceUIServiceProvider(IResourceServiceProvider delegate) {
		super(delegate);
	}
	
	@Override
	public boolean canBuild(URI uri, IStorage storage) {
		// Don't build jar entries from classpath but process them from the TP instead
		if (storage instanceof IJarEntryResource && uri.isPlatformResource()) {
			PluginModelManager modelManager = PDECore.getDefault().getModelManager();
			IPluginModelBase model = modelManager.findModel(uri.segment(1));
			if (model != null) {
				return false;
			}
		}
		return super.canBuild(uri, storage);
	}
	
	
}
