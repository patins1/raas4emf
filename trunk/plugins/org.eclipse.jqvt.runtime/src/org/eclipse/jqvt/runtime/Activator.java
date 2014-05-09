package org.eclipse.jqvt.runtime;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
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

	public static void err(String msg) {
		getDefault().getLog().log(new Status(Status.ERROR, getDefault().getBundle().getSymbolicName(), Status.OK, msg, null));

	}

	public static void err(String msg, Throwable e) {
		getDefault().getLog().log(new Status(Status.ERROR, getDefault().getBundle().getSymbolicName(), Status.OK, msg, e));

	}

	public static void err(Exception e) {
		getDefault().getLog().log(new Status(Status.ERROR, getDefault().getBundle().getSymbolicName(), Status.OK, e.getMessage(), e));
	}

}
