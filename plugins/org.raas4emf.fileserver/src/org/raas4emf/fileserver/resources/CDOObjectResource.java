/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.fileserver.resources;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.fileserver.HrResourceFactory;

import com.bradmcevoy.http.Auth;
import com.bradmcevoy.http.CollectionResource;
import com.bradmcevoy.http.DeletableResource;
import com.bradmcevoy.http.MoveableResource;
import com.bradmcevoy.http.PropFindableResource;
import com.bradmcevoy.http.Request;

public abstract class CDOObjectResource<T extends CDOObject> implements PropFindableResource, DeletableResource, MoveableResource {

	protected final HrResourceFactory resourceFactory;
	protected final T modelElement;

	public CDOObjectResource(HrResourceFactory resourceFactory, T o) {
		this.resourceFactory = resourceFactory;
		this.modelElement = o;
	}

	@Override
	public Date getCreateDate() {
		// Unknown
		return null;
	}

	@Override
	public Object authenticate(String user, String pwd) {
		throw new RuntimeException("Should never be executed!");
	}

	@Override
	public boolean authorise(Request request, Request.Method method, Auth auth) {
		throw new RuntimeException("Should never be executed!");
	}

	@Override
	public String checkRedirect(Request arg0) {
		// No redirects
		return null;
	}

	@Override
	public Date getModifiedDate() {
		return RAASUtils.getModificationDate(modelElement);
	}

	@Override
	public String getRealm() {
		return HrResourceFactory.REALM;
	}

	@Override
	public String getUniqueId() {
		return modelElement.cdoID().toString();
	}

	@Override
	public void delete() {
		CDOResource resource = modelElement.cdoResource();
		EcoreUtil.remove(modelElement);
		RAASUtils.doSave(resource, "Delete");
	}

	@SuppressWarnings("unchecked")
	public void moveTo(CollectionResource newParent, String newName) {
		if (newParent instanceof CDOObjectFolder) {
			CDOObjectFolder<?> cdoObjectFolder = (CDOObjectFolder<?>) newParent;
			CDOObject newContainer = cdoObjectFolder.modelElement;
			for (EReference ref : newContainer.eClass().getEAllContainments()) {
				if (ref.getEType().isInstance(this.modelElement)) {
					if (ref.isMany())
						((EList<T>) newContainer.eGet(ref)).add(this.modelElement);
					else
						newContainer.eSet(ref, this.modelElement);
					RAASUtils.setNameOf(modelElement, newName);
					RAASUtils.doSave(modelElement, "CDOObjectResource.moveTo(" + newParent + "," + newName + ")");
					return;
				}
			}
			throw new RuntimeException("Cannot move a " + this.modelElement.eClass().getName() + " into a " + newContainer.eClass().getName());
		}
		throw new RuntimeException("Destination is an unknown type. Must be a CDOObjectFolder, is a: " + newParent.getClass());
	}

}
