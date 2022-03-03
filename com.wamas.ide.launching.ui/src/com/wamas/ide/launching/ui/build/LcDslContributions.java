package com.wamas.ide.launching.ui.build;

import org.eclipse.xtext.builder.impl.IQueuedBuildDataContribution;
import org.eclipse.xtext.builder.impl.IToBeBuiltComputerContribution;
import org.eclipse.xtext.ui.resource.IResourceSetInitializer;
import org.eclipse.xtext.ui.resource.IStorage2UriMapperContribution;

import com.google.inject.Binder;

@SuppressWarnings("restriction")
public class LcDslContributions implements com.google.inject.Module {

	@Override
	public void configure(Binder binder) {
		binder.bind(IStorage2UriMapperContribution.class).to(LcDslTargetPlatformSupport.class);
		binder.bind(IResourceSetInitializer.class).to(LcDslTargetPlatformSupport.class);
		binder.bind(IToBeBuiltComputerContribution.class).to(LcDslTargetPlatformSupport.class);
		binder.bind(IQueuedBuildDataContribution.class).to(LcDslTargetPlatformSupport.class);
	}

}
