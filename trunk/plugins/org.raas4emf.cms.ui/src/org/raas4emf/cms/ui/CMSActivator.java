/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.emf.cdo.internal.server.bundle.CDOServerApplication;
import org.eclipse.net4j.internal.util.bundle.AbstractPlatform;
import org.eclipse.osgi.framework.internal.core.FrameworkProperties;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.discriminator.IRAASSessionSingletonService;
import org.raas4emf.cms.ui.discriminator.RAASSessionSingleton;

@SuppressWarnings("restriction")
public class CMSActivator implements BundleActivator {

	public static final String PLUGIN_ID = "org.raas4emf.cms.ui";
	private static BundleContext context;

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

		if (FrameworkProperties.getProperty(AbstractPlatform.SYSTEM_PROPERTY_NET4J_CONFIG) == null)
			FrameworkProperties.setProperty(AbstractPlatform.SYSTEM_PROPERTY_NET4J_CONFIG, RAASUtils.ROOTPATH + "/raasserver/config");

		Thread t = new Thread() {
			@Override
			public void run() {
				try {
					CDOServerApplication app = new CDOServerApplication();
					app.start(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		};
		t.start();
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
