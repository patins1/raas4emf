/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.fileserver.authentication;

import com.bradmcevoy.http.Auth;
import com.bradmcevoy.http.Request;
import com.bradmcevoy.http.Request.Method;
import com.bradmcevoy.http.Resource;
import com.bradmcevoy.http.ResourceFactory;

/**
 * Implements {@link #getResource(String, String)} itself so that subclasses of this class just have to implement {@link #getResourceAfterAuthentication(String, String)}, which can rely on that {@link #authenticate(String, String)} and {@link #authenticate(String, String)} already passed successfully. Note that
 * {@link Resource#authenticate(String, String)} and {@link Resource#authenticate(String, String)} should never be called in turn.
 */
public abstract class LateResolvingResourceFactory implements ResourceFactory {

	// TODO should be removed
	private String lastUser;
	// TODO should be removed
	private String lastPwd;

	@Override
	final public Resource getResource(String host, String path) {
		return new AuthenticatingResource(host, path, this);
	}

	protected Object authenticateInternal(String user, String pwd, AuthenticatingResource resource) {
		lastUser = user;
		lastPwd = pwd;
		Object authenticationResult = authenticate(user, pwd);
		if (authenticationResult != null)
			resource.setTarget(getResourceAfterAuthentication(resource.getHost(), resource.getPath(), authenticationResult));
		return authenticationResult;
	}

	/**
	 * This method authenticates with the last user/psw combination<br>
	 * TODO this is a security hole if actually the request comes from a totally different computer; currently required for the destination resource of a move-file operation, as the destination resource is not authenticated
	 * 
	 * @param resource
	 */
	protected void authenticateInternalUsingLastUser(AuthenticatingResource resource) {
		authenticateInternal(lastUser, lastPwd, resource);
	}

	protected boolean authoriseInternal(Request request, Method method, Auth auth, AuthenticatingResource resource) {
		return authorise(request, method, auth);
	}

	/**
	 * Replacement for {@link ResourceFactory#getResource(String, String)}
	 * 
	 * @param host
	 * @param path
	 * @return
	 */
	abstract public Resource getResourceAfterAuthentication(String host, String path, Object authenticationResult);

	/**
	 * See {@link Resource#authenticate(String, String)}
	 * 
	 * @param user
	 * @param password
	 * @return
	 */
	abstract public Object authenticate(String user, String password);

	/**
	 * See {@link Resource#authorise(Request, Method, Auth)}
	 * 
	 * @param request
	 * @param method
	 * @param auth
	 * @return
	 */
	abstract public boolean authorise(Request request, Method method, Auth auth);

	/**
	 * See {@link Resource#checkRedirect(Request)}; as this method can be called without prior authentication, it cannot be delegated and must be implemented by subclasses of this class.
	 * 
	 * @param request
	 * @return
	 */
	abstract public String checkRedirect(Request request);

	/**
	 * See {@link Resource#getRealm()}; as this method can be called without prior authentication, it cannot be delegated and must be implemented by subclasses of this class.
	 * 
	 * @return
	 */
	abstract public String getRealm();

}
