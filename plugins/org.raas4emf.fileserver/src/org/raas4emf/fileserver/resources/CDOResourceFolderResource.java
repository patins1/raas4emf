/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.fileserver.resources;

import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.eresource.EresourceFactory;
import org.eclipse.emf.common.util.EList;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.fileserver.HrResourceFactory;

import com.bradmcevoy.http.CollectionResource;
import com.bradmcevoy.http.MakeCollectionableResource;
import com.bradmcevoy.http.exceptions.ConflictException;
import com.bradmcevoy.http.exceptions.NotAuthorizedException;

public class CDOResourceFolderResource extends CDOObjectFolder<CDOResourceFolder> implements MakeCollectionableResource {

	public CDOResourceFolderResource(HrResourceFactory resourceFactory, CDOResourceFolder o) {
		super(resourceFactory, o);
	}

	@Override
	public String getName() {
		return modelElement.getName();
	}

	@Override
	protected EList<?> getContentList() {
		return modelElement.getNodes();
	}

	@Override
	public CollectionResource createCollection(String name) throws NotAuthorizedException, ConflictException {
		CDOResourceFolder folder = EresourceFactory.eINSTANCE.createCDOResourceFolder();
		folder.setName(name);
		modelElement.getNodes().add(folder);
		RAASUtils.doSave(modelElement, "CDOResourceFolderResource.createCollection(" + name + ")");
		return (CollectionResource) resourceFactory.asResource(folder);
	}

}
