/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.fileserver.resources;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.fileserver.HrResourceFactory;

import raascms.Folder;
import raascms.RaascmsFactory;

import com.bradmcevoy.http.CollectionResource;
import com.bradmcevoy.http.MakeCollectionableResource;
import com.bradmcevoy.http.PutableResource;
import com.bradmcevoy.http.Resource;
import com.bradmcevoy.http.exceptions.ConflictException;
import com.bradmcevoy.http.exceptions.NotAuthorizedException;

public class CDOResourceResource extends CDOObjectFolder<CDOResource> implements MakeCollectionableResource, PutableResource {

	public CDOResourceResource(HrResourceFactory resourceFactory, CDOResource o) {
		super(resourceFactory, o);
	}

	@Override
	public String getName() {
		return modelElement.getName();
	}

	protected EList<EObject> getContentList() {
		return modelElement.getContents();
	}

	@Override
	public CollectionResource createCollection(String name) throws NotAuthorizedException, ConflictException {
		Folder folder = RaascmsFactory.eINSTANCE.createFolder();
		folder.setName(name);
		modelElement.getContents().add(folder);
		RAASUtils.doSave(modelElement, "CDOResourceResource.createCollection(" + name + ")");
		return (CollectionResource) resourceFactory.asResource(folder);
	}

	public Resource createNew(final String name, InputStream in, Long length, String contentType) throws IOException {
		return resourceFactory.asResource(RAASFolderResource.createNew(name, in, length, contentType, modelElement));
	}
}
