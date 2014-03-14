/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.net4j.util.io.ZIPUtil;
import org.osgi.framework.BundleContext;
import org.raas4emf.cms.core.Activator;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.core.RAASSessionSingleton;

@SuppressWarnings("restriction")
public class CMSActivator extends Plugin {

	public static final String PLUGIN_ID = "org.raas4emf.cms.ui";

	// The shared instance
	private static CMSActivator plugin;

	public String remoteProvisioningStatus = null;
	public File remoteProvisioningZip = null;
	public File remoteProvisioningTargetFolder = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		plugin = this;

		final String url = System.getProperty("remoteProvisioningZip");
		remoteProvisioningZip = new File(Platform.getLocation().toFile(), "remote_provisioning.zip");
		remoteProvisioningTargetFolder = new File(Platform.getLocation().toFile(), "remote_provisioning");
		remoteProvisioningStatus = null;

		if (url != null && !remoteProvisioningTargetFolder.exists()) {

			Thread t = new Thread() {
				@Override
				public void run() {
					try {
						CMSActivator.log(remoteProvisioningStatus = "Remote provisioning: Downloading " + url);
						URL u = new URL(url);
						String name = u.getFile();
						name = name.substring(name.lastIndexOf('/') + 1);
						URLConnection c = u.openConnection();
						InputStream is = c.getInputStream();
						FileUtil.inputstreamToOutputstream(is, new FileOutputStream(remoteProvisioningZip));
						CMSActivator.log(remoteProvisioningStatus = "Remote provisioning: Unzipping to " + remoteProvisioningTargetFolder);
						ZIPUtil.unzip(remoteProvisioningZip, remoteProvisioningTargetFolder);
						CMSActivator.log("Remote provisioning successful!");
					} catch (Exception e) {
						CMSActivator.err("Remote provisioning failed!", e);
					}
					remoteProvisioningStatus = null;
				}

			};
			t.start();

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
		remoteProvisioningStatus = null;
		super.stop(bundleContext);
	}

	public static RAASSessionSingleton getSessionInstance() {
		return Activator.getSessionInstance();
	}

	public static CMSActivator getDefault() {
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
