/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.ui.IStartup;
import org.raas4emf.cms.ui.graf.EObjectBasedGraf;
import org.raas4emf.cms.ui.graf.GrafUtil;

public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		if (GrafUtil.getDefaultFactory() == null)
			GrafUtil.setDefaultFactory(new EObjectBasedGraf());
		// Thread t = new Thread() {
		// @Override
		// public void run() {
		// try {
		// Thread.sleep(1000);
		// CDOServerApplication app = new CDOServerApplication();
		// app.start(null);
		// } catch (Exception e) {
		// CMSActivator.err(e);
		// }
		// }
		//
		// };
		// t.start();

	}

}
