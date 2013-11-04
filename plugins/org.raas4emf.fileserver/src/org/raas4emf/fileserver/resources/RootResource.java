/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.fileserver.resources;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.fileserver.HrResourceFactory;

import raascms.Folder;
import raascms.RaascmsFactory;

public class RootResource extends CDOObjectFolder<CDOResource> {

	public RootResource(HrResourceFactory resourceFactory, CDOResource o) {
		super(resourceFactory, o);
	}

	@Override
	public String getName() {
		return modelElement.getName();
	}

	@Override
	protected EList<EObject> getContentList() {
		return getRootContent(modelElement);
	}

	public EList<EObject> getRootContent(CDOResource modelElement) {
		EList<EObject> result = modelElement.getContents();
		if (result.isEmpty()) {
			Folder repositoryRoot = RaascmsFactory.eINSTANCE.createFolder();
			repositoryRoot.setName("RepositoryRoot");
			CDOResource res = ((CDOTransaction) modelElement.cdoView()).createResource(RAASUtils.ROOT_RESOURCE_NAME);
			res.getContents().add(repositoryRoot);
			RAASUtils.doSave(repositoryRoot, "Creating RepositoryRoot");
			result = modelElement.getContents();
		}
		return result;
	}

}
