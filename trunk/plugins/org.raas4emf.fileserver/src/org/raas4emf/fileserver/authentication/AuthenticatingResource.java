/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.fileserver.authentication;

import com.bradmcevoy.http.Auth;
import com.bradmcevoy.http.ConditionalCompatibleResource;
import com.bradmcevoy.http.Request;
import com.bradmcevoy.http.Request.Method;
import com.bradmcevoy.http.Resource;

/**
 * Forwards authentication and authorization to the ResourceFactory, which in turn should set the correct target resource to which all following calls are forwarded.
 * 
 */
public class AuthenticatingResource extends DelegatingResource implements ConditionalCompatibleResource {

	private final String host;
	private final String path;
	private final LateResolvingResourceFactory lateResolvingFactory;
	private Resource target;

	public AuthenticatingResource(String host, String path, LateResolvingResourceFactory lateResolvingFactory) {
		super();
		this.host = host;
		this.path = path;
		this.lateResolvingFactory = lateResolvingFactory;
	}

	@Override
	public Object authenticate(String user, String password) {
		return lateResolvingFactory.authenticateInternal(user, password, this);
	}

	@Override
	public boolean authorise(Request request, Method method, Auth auth) {
		return lateResolvingFactory.authoriseInternal(request, method, auth, this);
	}

	@Override
	public String getRealm() {
		return lateResolvingFactory.getRealm();
	}

	@Override
	public String checkRedirect(Request request) {
		return lateResolvingFactory.checkRedirect(request);
	}

	public void setTarget(Resource target) {
		this.target = target;
	}

	/**
	 * Let authorization decide whether the method is allowed - TODO is this correct?
	 */
	@Override
	public boolean isCompatible(Method m) {
		return true;
	}

	public Resource getTarget() {
		if (target == null) {
			lateResolvingFactory.authenticateInternalUsingLastUser(this);
		}
		return target;
	}

	public String getHost() {
		return host;
	}

	public String getPath() {
		return path;
	}

}
