/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.fileserver.authentication;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bradmcevoy.http.Auth;
import com.bradmcevoy.http.CollectionResource;
import com.bradmcevoy.http.DeletableResource;
import com.bradmcevoy.http.GetableResource;
import com.bradmcevoy.http.MakeCollectionableResource;
import com.bradmcevoy.http.MoveableResource;
import com.bradmcevoy.http.PropFindableResource;
import com.bradmcevoy.http.PutableResource;
import com.bradmcevoy.http.QuotaResource;
import com.bradmcevoy.http.Range;
import com.bradmcevoy.http.Request;
import com.bradmcevoy.http.Request.Method;
import com.bradmcevoy.http.Resource;
import com.bradmcevoy.http.exceptions.BadRequestException;
import com.bradmcevoy.http.exceptions.ConflictException;
import com.bradmcevoy.http.exceptions.NotAuthorizedException;
import com.bradmcevoy.http.exceptions.NotFoundException;

/**
 * Just delegates calls to a bunch of interfaces to a target
 */
public abstract class DelegatingResource implements Resource, DeletableResource, GetableResource, MakeCollectionableResource, MoveableResource, PutableResource, PropFindableResource, QuotaResource {

	public DelegatingResource() {
	}

	@Override
	public String getUniqueId() {
		return getTarget().getUniqueId();
	}

	@Override
	public String getName() {
		Resource target = getTarget();
		if (target == null)
			return null;
		return target.getName();
	}

	@Override
	public Object authenticate(String user, String password) {
		return getTarget().authenticate(user, password);
	}

	@Override
	public boolean authorise(Request request, Method method, Auth auth) {
		return getTarget().authorise(request, method, auth);
	}

	@Override
	public String getRealm() {
		return getTarget().getRealm();
	}

	@Override
	public Date getModifiedDate() {
		Resource target = getTarget();
		if (target == null)
			return null;
		return target.getModifiedDate();
	}

	@Override
	public String checkRedirect(Request request) {
		return getTarget().checkRedirect(request);
	}

	@Override
	public Resource child(String childName) {
		return ((CollectionResource) getTarget()).child(childName);
	}

	@Override
	public List<? extends Resource> getChildren() {
		if (!(getTarget() instanceof CollectionResource)) {
			/**
			 * We pretended to be a folder, but actually we are not - so return no children
			 */
			return Collections.emptyList();
		}
		return ((CollectionResource) getTarget()).getChildren();
	}

	@Override
	public Long getQuotaUsed() {
		return ((QuotaResource) getTarget()).getQuotaUsed();
	}

	@Override
	public Long getQuotaAvailable() {
		return ((QuotaResource) getTarget()).getQuotaAvailable();
	}

	@Override
	public Date getCreateDate() {
		PropFindableResource propFindableResource = (PropFindableResource) getTarget();
		if (propFindableResource == null)
			return null;
		return propFindableResource.getCreateDate();
	}

	@Override
	public Resource createNew(String newName, InputStream inputStream, Long length, String contentType) throws IOException, ConflictException, NotAuthorizedException, BadRequestException {
		return ((PutableResource) getTarget()).createNew(newName, inputStream, length, contentType);
	}

	@Override
	public void moveTo(CollectionResource rDest, String name) throws ConflictException, NotAuthorizedException, BadRequestException {
		if (rDest instanceof DelegatingResource) {
			DelegatingResource delegatingResource = (DelegatingResource) rDest;
			if (delegatingResource.getTarget() instanceof CollectionResource) {
				rDest = (CollectionResource) delegatingResource.getTarget();
			}
		}
		((MoveableResource) getTarget()).moveTo(rDest, name);

	}

	@Override
	public CollectionResource createCollection(String newName) throws NotAuthorizedException, ConflictException, BadRequestException {
		return ((MakeCollectionableResource) getTarget()).createCollection(newName);
	}

	@Override
	public void sendContent(OutputStream out, Range range, Map<String, String> params, String contentType) throws IOException, NotAuthorizedException, BadRequestException, NotFoundException {
		((GetableResource) getTarget()).sendContent(out, range, params, contentType);
	}

	@Override
	public Long getMaxAgeSeconds(Auth auth) {
		return ((GetableResource) getTarget()).getMaxAgeSeconds(auth);
	}

	@Override
	public String getContentType(String accepts) {
		return ((GetableResource) getTarget()).getContentType(accepts);
	}

	@Override
	public Long getContentLength() {
		if (getTarget() == null) {
			/**
			 * A <code>null</code> value means that also {@link ResourceFactory#getResource(String, String)} would have returned <code>null</code>, so return <code>null</code> right now
			 */
			return null;
		}
		return ((GetableResource) getTarget()).getContentLength();
	}

	@Override
	public void delete() throws NotAuthorizedException, ConflictException, BadRequestException {
		if (getTarget() == null)
			return;
		((DeletableResource) getTarget()).delete();
	}

	abstract public Resource getTarget();

}
