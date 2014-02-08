/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StringBufferInputStream;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.cdo.internal.server.bundle.CDOServerApplication;
import org.eclipse.net4j.internal.util.bundle.AbstractPlatform;
import org.eclipse.osgi.framework.internal.core.FrameworkProperties;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.discriminator.IRAASSessionSingletonService;
import org.raas4emf.cms.ui.discriminator.RAASSessionSingleton;

@SuppressWarnings("restriction")
public class CMSActivator implements BundleActivator {

	public static final String PLUGIN_ID = "org.raas4emf.cms.ui";
	private static BundleContext context;

	static public CDOServerApplication dbapp;

	public static BundleContext getContext() {
		return context;
	}

	static private IRAASSessionSingletonService service;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		CMSActivator.context = bundleContext;

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
		System.out.println("JDBC_CONNECTION_STRING=" + jdbc);

		for (String db : new String[] { "h2", "hsqldb", "postgresql" }) {
			if (jdbc.contains(db)) {
				int fromIndex = contents.indexOf("<!--<dbAdapter name=\"" + db);
				contents = contents.substring(0, fromIndex) + contents.substring(fromIndex + "<!--".length());
				contents = replaceAttribute(contents, fromIndex, "url", jdbc);
				contents = replaceAttribute(contents, fromIndex, "URL", jdbc);
				FileUtil.inputstreamToOutputstream(new StringBufferInputStream(contents), new FileOutputStream(new File(file.getParentFile(), "cdo-server.xml")));
				System.out.println("Created cdo-server.xml from template using " + jdbc);
			}
		}
		System.out.println("Read config file from " + file.getParentFile().toString());
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
					e.printStackTrace();
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

}
