/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.fileserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bradmcevoy.http.AuthenticationService;
import com.bradmcevoy.http.ResourceFactory;
import com.bradmcevoy.http.ResourceFactoryFactory;
import com.bradmcevoy.http.webdav.DefaultWebDavResponseHandler;
import com.bradmcevoy.http.webdav.WebDavResponseHandler;

public class HrResourceFactoryFactory implements ResourceFactoryFactory {

	private Logger log = LoggerFactory.getLogger(HrResourceFactoryFactory.class);

	private static AuthenticationService authenticationService;
	private static HrResourceFactory resourceFactory;

	@Override
	public ResourceFactory createResourceFactory() {
		return resourceFactory;
	}

	@Override
	public WebDavResponseHandler createResponseHandler() {
		return new DefaultWebDavResponseHandler(authenticationService);
	}

	@Override
	public void init() {
		log.debug("init");
		if (authenticationService == null) {
			authenticationService = new AuthenticationService();
			resourceFactory = new HrResourceFactory();
		}
		log.debug("init finished");
	}

}
