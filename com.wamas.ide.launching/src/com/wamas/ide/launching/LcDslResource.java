package com.wamas.ide.launching;

import org.eclipse.xtext.linking.lazy.LazyLinkingResource;

public class LcDslResource extends LazyLinkingResource {
	
	@Override
	protected void clearErrorsAndWarnings() {
		super.clearErrorsAndWarnings();
		getUnresolvableURIFragments().clear();
	}

}
