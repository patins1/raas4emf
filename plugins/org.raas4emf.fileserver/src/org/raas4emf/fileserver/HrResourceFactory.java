/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.fileserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.view.CDOView;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.fileserver.authentication.LateResolvingResourceFactory;
import org.raas4emf.fileserver.resources.ArtifactResource;
import org.raas4emf.fileserver.resources.CDOResourceFolderResource;
import org.raas4emf.fileserver.resources.CDOResourceResource;
import org.raas4emf.fileserver.resources.RAASFolderResource;
import org.raas4emf.fileserver.resources.RootResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import raascms.Artifact;
import raascms.Folder;

import com.bradmcevoy.common.Path;
import com.bradmcevoy.http.Auth;
import com.bradmcevoy.http.CollectionResource;
import com.bradmcevoy.http.Request;
import com.bradmcevoy.http.Request.Method;
import com.bradmcevoy.http.Resource;

public class HrResourceFactory extends LateResolvingResourceFactory {

	private Logger log = LoggerFactory.getLogger(HrResourceFactory.class);

	public static final String REALM = "RAAS_REALM";

	private Map<String, CDOView> viewByUser = new HashMap<String, CDOView>();

	public HrResourceFactory() {
	}

	public Resource getResourceAfterAuthentication(String host, String p, Object authenticationResult) {
		Path path = Path.path(p).getStripFirst();
		log.debug("getResource: " + path);
		Resource result = new RootResource(this, ((CDOView) authenticationResult).getRootResource());
		while (!path.isRoot() && result instanceof CollectionResource) {
			CollectionResource collectionResource = (CollectionResource) result;
			result = collectionResource.child(path.getFirst());
			path = path.getStripFirst();
		}
		return result;
	}

	public List<Resource> findResources(List<?> list) {
		List<Resource> resources = new ArrayList<Resource>();
		for (Object o : list) {
			Resource resource = asResource(o);
			if (resource != null)
				resources.add(resource);
		}
		return resources;
	}

	public Resource findResource(String name, List<?> list) {
		log.debug("findResource: " + name);
		for (Object o : list) {
			Resource res = asResource(o);
			if (res != null && name.equals(res.getName()))
				return asResource(o);
		}
		return null;
	}

	public Resource asResource(Object o) {
		if (o instanceof CDOResource) {
			return new CDOResourceResource(this, (CDOResource) o);
		}
		if (o instanceof CDOResourceFolder) {
			return new CDOResourceFolderResource(this, (CDOResourceFolder) o);
		}
		if (o instanceof Artifact) {
			return new ArtifactResource(this, (Artifact) o);
		}
		if (o instanceof Folder) {
			return new RAASFolderResource(this, (Folder) o);
		}
		if (o instanceof Resource) {
			return (Resource) o;
		}
		return null;
	}

	@Override
	public Object authenticate(String user, String pwd) {
		RAASUtils.registerRAASCMSMetamodels();
		return RAASUtils.authenticate(user, pwd, viewByUser);
	}

	@Override
	public boolean authorise(Request request, Method method, Auth auth) {
		if (auth == null)
			return false;
		if (method.isWrite)
			return RAASUtils.isLibrarian(auth.getUser());
		return true;
	}

	@Override
	public String checkRedirect(Request arg0) {
		// No redirects
		return null;
	}

	@Override
	public String getRealm() {
		return HrResourceFactory.REALM;
	}

}
