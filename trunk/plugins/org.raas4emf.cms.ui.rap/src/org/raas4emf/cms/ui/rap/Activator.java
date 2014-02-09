/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;
import org.raas4emf.cms.ui.discriminator.IRAASSessionSingletonService;

public class Activator extends Plugin {

	private static BundleContext context;

	// The shared instance
	private static Activator plugin;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		Activator.context = bundleContext;
		plugin = this;
		IRAASSessionSingletonService service = new RAASSessionSingletonService();
		// Third parameter is a hashmap which allows to configure the service
		// Not required in this example
		context.registerService(IRAASSessionSingletonService.class.getName(), service, null);
		Activator.log("IRAASSessionSingletonService is registered");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		plugin = null;
		super.stop(bundleContext);
	}

	public static Activator getDefault() {
		return plugin;
	}

	public static void log(String msg) {
		getDefault().getLog().log(new Status(Status.INFO, getDefault().getBundle().getSymbolicName(), Status.OK, msg, null));
	}

	public static void err(String msg) {
		getDefault().getLog().log(new Status(Status.ERROR, getDefault().getBundle().getSymbolicName(), Status.OK, msg, null));
	}

	public static void err(String msg, Throwable e) {
		getDefault().getLog().log(new Status(Status.ERROR, getDefault().getBundle().getSymbolicName(), Status.OK, msg, e));
	}

	public static void err(Throwable e) {
		getDefault().getLog().log(new Status(Status.ERROR, getDefault().getBundle().getSymbolicName(), Status.OK, e.getMessage(), e));
	}
}
