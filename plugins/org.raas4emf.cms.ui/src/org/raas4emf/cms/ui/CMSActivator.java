/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.net.URL;
import java.net.URLConnection;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.internal.server.bundle.CDOServerApplication;
import org.eclipse.net4j.internal.util.bundle.AbstractPlatform;
import org.eclipse.net4j.util.io.ZIPUtil;
import org.eclipse.osgi.framework.internal.core.FrameworkProperties;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.discriminator.IRAASSessionSingletonService;
import org.raas4emf.cms.ui.discriminator.RAASSessionSingleton;

@SuppressWarnings("restriction")
public class CMSActivator extends Plugin {

	public static final String PLUGIN_ID = "org.raas4emf.cms.ui";
	private static BundleContext context;

	static public CDOServerApplication dbapp;

	public static BundleContext getContext() {
		return context;
	}

	// The shared instance
	private static CMSActivator plugin;

	static private IRAASSessionSingletonService service;
	static public String REMOTE_PROVISIONING_STATUS = null;
	static public File remoteProvisioningZip = null;
	static public File remoteProvisioningTargetFolder = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		CMSActivator.context = bundleContext;
		plugin = this;

		final String url = System.getProperty("remoteProvisioningZip");
		remoteProvisioningZip = new File(Platform.getLocation().toFile(), "remote_provisioning.zip");
		remoteProvisioningTargetFolder = new File(Platform.getLocation().toFile(), "remote_provisioning");
		REMOTE_PROVISIONING_STATUS = null;

		if (url != null && !remoteProvisioningTargetFolder.exists()) {

			Thread t = new Thread() {
				@Override
				public void run() {
					try {
						CMSActivator.log(REMOTE_PROVISIONING_STATUS = "Remote provisioning: Downloading " + url);
						URL u = new URL(url);
						String name = u.getFile();
						name = name.substring(name.lastIndexOf('/') + 1);
						URLConnection c = u.openConnection();
						InputStream is = c.getInputStream();
						FileUtil.inputstreamToOutputstream(is, new FileOutputStream(remoteProvisioningZip));
						CMSActivator.log(REMOTE_PROVISIONING_STATUS = "Remote provisioning: Unzipping to " + remoteProvisioningTargetFolder);
						ZIPUtil.unzip(remoteProvisioningZip, remoteProvisioningTargetFolder);
						CMSActivator.log("Remote provisioning successful!");
					} catch (Exception e) {
						CMSActivator.err("Remote provisioning failed!", e);
					}
					REMOTE_PROVISIONING_STATUS = null;
				}

			};
			t.start();

		}

		URL fileURL = new URL("platform:/plugin/org.raas4emf.server/config/cdo-server.template.xml");
		URL u = FileLocator.resolve(fileURL);
		String fileName = u.getFile();
		File file = new File(fileName);
		String contents = FileUtil.inputstreamToString(new FileInputStream(file));

		String jdbc = System.getProperty("JDBC_CONNECTION_STRING");
		if (jdbc == null) {
			String dbName = System.getProperty("RDS_DB_NAME");
			String userName = System.getProperty("RDS_USERNAME");
			String password = System.getProperty("RDS_PASSWORD");
			String hostname = System.getProperty("RDS_HOSTNAME");
			String port = System.getProperty("RDS_PORT");
			if (hostname != null)
				jdbc = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
		}
		if (jdbc == null)
			jdbc = "jdbc:hsqldb:mem:repo1";
		CMSActivator.log("JDBC_CONNECTION_STRING=" + jdbc);

		for (String db : new String[] { "h2", "hsqldb", "postgresql" }) {
			if (jdbc.contains(db)) {
				int fromIndex = contents.indexOf("<!--<dbAdapter name=\"" + db);
				contents = contents.substring(0, fromIndex) + contents.substring(fromIndex + "<!--".length());
				contents = replaceAttribute(contents, fromIndex, "url", jdbc);
				contents = replaceAttribute(contents, fromIndex, "URL", jdbc);
				FileUtil.inputstreamToOutputstream(new StringBufferInputStream(contents), new FileOutputStream(new File(file.getParentFile(), "cdo-server.xml")));
				CMSActivator.log("Created cdo-server.xml from template using " + jdbc);
			}
		}
		CMSActivator.log("Read config file from " + file.getParentFile().toString());
		FrameworkProperties.setProperty(AbstractPlatform.SYSTEM_PROPERTY_NET4J_CONFIG, file.getParentFile().toString());

		try {
			RAASUtils.getRAASProp("RAASSERVER");
		} catch (Exception e) {
			// not defined, set default
			System.setProperty("RAASSERVER", "localhost:2036");
		}

		Thread t = new Thread() {
			@Override
			public void run() {
				try {
					dbapp = new CDOServerApplication();
					dbapp.start(null);
				} catch (Exception e) {
					CMSActivator.err(e);
				}
			}

		};
		t.start();
	}

	private String replaceAttribute(String contents, int fromIndex, String attribute, String value) {
		int index = contents.indexOf(attribute + "=\"", fromIndex);
		if (index >= 0 && index < contents.indexOf("-->", fromIndex)) {
			index += (attribute + "=\"").length();
			value = value.replace("&", "&amp;");
			return contents.substring(0, index) + value + contents.substring(contents.indexOf('"', index));
		}
		return contents;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		CMSActivator.context = null;
		plugin = null;
		super.stop(bundleContext);
	}

	static public IRAASSessionSingletonService getService() {
		if (service == null) {
			// Register directly with the service
			ServiceReference<?> reference = context.getServiceReference(IRAASSessionSingletonService.class.getName());
			service = (IRAASSessionSingletonService) context.getService(reference);
		}
		return service;
	}

	public static RAASSessionSingleton getSessionInstance() {
		return CMSActivator.getService().getInstance();
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
