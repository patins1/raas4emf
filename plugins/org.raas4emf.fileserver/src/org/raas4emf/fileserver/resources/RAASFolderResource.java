/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.fileserver.resources;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.eclipse.emf.ecore.EObject;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.fileserver.HrResourceFactory;

import raascms.Artifact;
import raascms.Folder;
import raascms.RaascmsFactory;

import com.bradmcevoy.http.CollectionResource;
import com.bradmcevoy.http.MakeCollectionableResource;
import com.bradmcevoy.http.PutableResource;
import com.bradmcevoy.http.Resource;
import com.bradmcevoy.http.exceptions.ConflictException;
import com.bradmcevoy.http.exceptions.NotAuthorizedException;

public class RAASFolderResource extends CDOObjectFolder<Folder> implements MakeCollectionableResource, PutableResource {

	public RAASFolderResource(HrResourceFactory resourceFactory, Folder o) {
		super(resourceFactory, o);
	}

	@Override
	public String getName() {
		return modelElement.getName();
	}

	public Resource createNew(final String name, InputStream in, Long length, String contentType) throws IOException {
		return resourceFactory.asResource(createNew(name, in, length, contentType, modelElement));
	}

	synchronized static public Object createNew(String originalName, InputStream in, Long length, String contentType, EObject root) throws IOException {
		String name = RAASUtils.getIntendedNameForExport(originalName);
		Artifact artifact;
		Object aFile = RAASUtils.getChildWithName(root, name);
		if (aFile instanceof Artifact) {
			artifact = (Artifact) aFile;
			artifact.getContents().clear();
			artifact.setModelDate(null);
			artifact.setBlobDate(null);
		} else if (aFile != null) {
			return aFile;
		} else {
			artifact = RaascmsFactory.eINSTANCE.createArtifact();
			artifact.setName(name);
			RAASUtils.addToContent(root, artifact);
		}
		artifact.setFileContent(new CDOBlob(in));
		RAASUtils.doSave(artifact, "RAASFolderResource.createNew(" + name + ")");
		return artifact;
	}

	@Override
	public CollectionResource createCollection(String name) throws NotAuthorizedException, ConflictException {
		Folder folder = RaascmsFactory.eINSTANCE.createFolder();
		folder.setName(name);
		modelElement.getFolders().add(folder);
		RAASUtils.doSave(modelElement, "RAASFolderResource.createCollection(" + name + ")");
		return (CollectionResource) resourceFactory.asResource(folder);
	}

}
