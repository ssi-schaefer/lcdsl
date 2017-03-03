/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class LcDslStandaloneSetup extends LcDslStandaloneSetupGenerated {

	def static void doSetup() {
		new LcDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
