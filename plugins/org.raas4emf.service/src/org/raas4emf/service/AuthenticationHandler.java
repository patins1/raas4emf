/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.service;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.jaxrs.ext.RequestHandler;
import org.apache.cxf.jaxrs.impl.MetadataMap;
import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.jaxrs.provider.JSONProvider;
import org.apache.cxf.message.Message;
import org.eclipse.emf.cdo.view.CDOView;
import org.raas4emf.cms.core.RAASUtils;

public class AuthenticationHandler implements RequestHandler {

	private Map<String, CDOView> viewByUser = new HashMap<String, CDOView>();

	private String username;
	private String password;

	static public AuthenticationHandler SINGLETON;

	public AuthenticationHandler() {
		SINGLETON = this;
	}

	public Response handleRequest(Message m, ClassResourceInfo resourceClass) {
		AuthorizationPolicy policy = (AuthorizationPolicy) m.get(AuthorizationPolicy.class);
		if (policy == null) {
			// request authentication
			// return Response.status(401).header("WWW-Authenticate", "Basic").build();
			username = "Architect";
			password = "a";
		} else {
			username = policy.getUserName();
			password = policy.getPassword();
		}
		RAASUtils.registerRAASCMSMetamodels();
		CDOView view = authenticate();
		if (view != null) {
			m.setContextualProperty(CDOView.class.getName(), view);
			// let request to continue
			return null;
		} else {
			// authentication failed, request the authentication, add the realm name if needed to the value of WWW-Authenticate
			return Response.status(401).header("WWW-Authenticate", "Basic").build();
		}
	}

	public CDOView authenticate() {
		return RAASUtils.authenticate(username, password, viewByUser);
	}

	static public <T> T decodeRAASProtocol(InputStream responseBody, Class<T> targetType) throws SecurityException, NoSuchMethodException, IOException {
		JSONProvider reader = new JSONProvider();
		reader.setSupportUnwrapped(true);
		Object result = reader.readFrom((Class<Object>) targetType, targetType, new Annotation[] {}, MediaType.APPLICATION_JSON_TYPE, new MetadataMap<String, String>(), responseBody);
		return (T) result;
	}

}