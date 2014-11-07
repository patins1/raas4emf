package org.raas4emf.cms.core;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.rap.rwt.SingletonUtil;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	public static final String PLUGIN_ID = "org.raas4emf.cms.core";
	// The shared instance
	private static Activator plugin;
	private static BundleContext context;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	public static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		plugin = this;
		context = bundleContext;

		RAASUtils.setupCDOServer();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		context = null;
		plugin = null;
		super.stop(bundleContext);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public static void log(String msg) {
		getDefault().getLog().log(new Status(Status.OK, getDefault().getBundle().getSymbolicName(), Status.OK, msg, null));
	}

	public static void info(String msg) {
		getDefault().getLog().log(new Status(Status.INFO, getDefault().getBundle().getSymbolicName(), Status.OK, msg, null));
	}

	public static void perf(String msg) {
		getDefault().getLog().log(new Status(Status.OK, getDefault().getBundle().getSymbolicName(), Status.OK, msg, null));
	}

	public static void err(String msg) {
		getDefault().getLog().log(new Status(Status.ERROR, getDefault().getBundle().getSymbolicName(), Status.OK, msg, null));

	}

	public static void err(String msg, Throwable e) {
		getDefault().getLog().log(new Status(Status.ERROR, getDefault().getBundle().getSymbolicName(), Status.OK, msg, e));

	}

	public static void err(Exception e) {
		getDefault().getLog().log(new Status(Status.ERROR, getDefault().getBundle().getSymbolicName(), Status.OK, e.getMessage(), e));
	}

	static private IRAASSessionSingletonService service;

	static public IRAASSessionSingletonService getService() {
		if (service == null) {
			// Register directly with the service
			ServiceReference<?> reference = context.getServiceReference(IRAASSessionSingletonService.class.getName());
			if (reference != null)
				service = (IRAASSessionSingletonService) context.getService(reference);
		}
		return service;
	}

	public static RAASSessionSingleton getSessionInstance() {
		if (Activator.getService() != null)
			return Activator.getService().getInstance();
		return SingletonUtil.getSessionInstance(RAASSessionSingleton.class);
	}
}
