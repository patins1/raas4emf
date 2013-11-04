/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.fileserver.resources;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.cdo.CDOObject;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.fileserver.HrResourceFactory;

import com.bradmcevoy.http.Auth;
import com.bradmcevoy.http.CollectionResource;
import com.bradmcevoy.http.GetableResource;
import com.bradmcevoy.http.QuotaResource;
import com.bradmcevoy.http.Range;
import com.bradmcevoy.http.Resource;
import com.bradmcevoy.http.XmlWriter;
import com.bradmcevoy.http.exceptions.NotAuthorizedException;

public abstract class CDOObjectFolder<T extends CDOObject> extends CDOObjectResource<T> implements CollectionResource, QuotaResource, GetableResource {

	public CDOObjectFolder(HrResourceFactory resourceFactory, T o) {
		super(resourceFactory, o);
	}

	@Override
	public Resource child(String name) {
		return resourceFactory.findResource(name, RAASUtils.safeList(getContentList()));
	}

	@Override
	public List<? extends Resource> getChildren() {
		return resourceFactory.findResources(RAASUtils.safeList(getContentList()));
	}

	protected List<?> getContentList() {
		return modelElement.eContents();
	}

	@Override
	public Long getQuotaAvailable() {
		return (long) 1024 * 1024 * 1024 * 1024; // one TB should be enough for the first!
	}

	@Override
	public Long getQuotaUsed() {
		return (long) 0;
	}

	/**
	 * Will generate a listing of the contents of this directory, unless the factory's allowDirectoryBrowsing has been set to false.
	 * 
	 * If so it will just output a message saying that access has been disabled.
	 * 
	 * @param out
	 * @param range
	 * @param params
	 * @param contentType
	 * @throws IOException
	 * @throws NotAuthorizedException
	 */
	public void sendContent(OutputStream out, Range range, Map<String, String> params, String contentType) throws IOException, NotAuthorizedException {
		XmlWriter w = new XmlWriter(out);
		w.open("html");
		w.open("head");
		w.writeText("<style type=\"text/css\">\n");
		w.writeText("table, td, th { border:1px solid green; }\n");
		w.writeText("th { background-color:green; color:white; }\n");
		w.writeText("</style>\n");
		w.close("head");
		w.open("body");
		if (this.getName() != null)
			w.begin("h1").open().writeText(this.getName()).close();
		w.open("table");
		w.writeText("<tr><th>Name</th><th>Date modified</th><th>Size</th></tr>");
		for (Resource r : getChildren()) {
			w.open("tr");

			w.open("td");
			String path = r.getName();
			if (r instanceof CollectionResource)
				path += "/";
			w.begin("a").writeAtt("href", path).open().writeText(r.getName()).close();

			w.close("td");

			w.begin("td").open().writeText(r.getModifiedDate() + "").close();
			w.begin("td").open();
			if (r instanceof GetableResource) {
				GetableResource getableResource = (GetableResource) r;
				if (getableResource.getContentLength() != null) {
					w.writeText("" + getableResource.getContentLength());
				}
			}
			w.close("td");
			w.close("tr");
		}
		if (this.getName() != null)
			w.writeText("<tr><td><a href=\"..\">[..]</a></td><td></td><td></td></tr>");
		w.close("table");
		w.close("body");
		w.close("html");
		w.flush();
	}

	public Long getMaxAgeSeconds(Auth auth) {
		return null;
	}

	public String getContentType(String accepts) {
		return "text/html";
	}

	public Long getContentLength() {
		return null;
	}

}
