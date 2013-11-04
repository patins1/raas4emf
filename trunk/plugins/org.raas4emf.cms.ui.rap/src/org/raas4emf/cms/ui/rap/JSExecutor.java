/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.client.service.JavaScriptExecutor;

public class JSExecutor {

	public static void executeJS(String javaScriptCode) {

		JavaScriptExecutor executor = RWT.getClient().getService(JavaScriptExecutor.class);
		if (executor != null) {
			executor.execute(javaScriptCode);
		}

	}

}
