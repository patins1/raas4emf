/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public String remoteProvisioningStatus = null;
	public File remoteProvisioningZip = null;
	public File remoteProvisioningTargetFolder = null;

	public static Map<String, List<String>> getUrlParameters(String url) throws UnsupportedEncodingException {
		Map<String, List<String>> params = new HashMap<String, List<String>>();
		String[] urlParts = url.split("\\?");
		if (urlParts.length > 1) {
			String query = urlParts[1];
			for (String param : query.split("&")) {
				String pair[] = param.split("=");
				String key = URLDecoder.decode(pair[0], "UTF-8");
				String value = "";
				if (pair.length > 1) {
					value = URLDecoder.decode(pair[1], "UTF-8");
				}
				List<String> values = params.get(key);
				if (values == null) {
					values = new ArrayList<String>();
					params.put(key, values);
				}
				values.add(value);
			}
		}
		return params;
	}

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
				URI jdbcurl = new URI(jdbc.substring("jdbc:".length()));
				if (jdbcurl.getHost() != null)
					contents = replaceAttribute(contents, fromIndex, "serverName", jdbcurl.getHost());
				if (jdbcurl.getPath() != null)
					contents = replaceAttribute(contents, fromIndex, "databaseName", jdbcurl.getPath().substring("/".length()));
				if (jdbcurl.getPort() != -1)
					contents = replaceAttribute(contents, fromIndex, "portNumber", "" + jdbcurl.getPort());
				for (Map.Entry<String, List<String>> param : getUrlParameters(jdbc).entrySet())
					contents = replaceAttribute(contents, fromIndex, param.getKey(), param.getValue().get(0));
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
		remoteProvisioningStatus = null;
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
