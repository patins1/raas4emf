/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt;

/**
 * Initialization support for running Xtext languages without equinox extension registry
 */
public class JQVTStandaloneSetup extends JQVTStandaloneSetupGenerated {

	public static void doSetup() {
		new JQVTStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
