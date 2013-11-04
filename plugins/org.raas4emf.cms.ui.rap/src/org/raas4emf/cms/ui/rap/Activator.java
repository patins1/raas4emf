/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.raas4emf.cms.ui.discriminator.IRAASSessionSingletonService;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		IRAASSessionSingletonService service = new RAASSessionSingletonService();
		// Third parameter is a hashmap which allows to configure the service
		// Not required in this example
		context.registerService(IRAASSessionSingletonService.class.getName(), service, null);
		System.out.println("IRAASSessionSingletonService is registered");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
