/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.fileserver.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.fileserver.HrResourceFactory;

import raascms.Artifact;
import raascms.impl.ArtifactImpl;

import com.bradmcevoy.http.Auth;
import com.bradmcevoy.http.GetableResource;
import com.bradmcevoy.http.Range;
import com.bradmcevoy.http.exceptions.BadRequestException;
import com.bradmcevoy.http.exceptions.NotAuthorizedException;

public class ArtifactResource extends CDOObjectResource<Artifact> implements GetableResource {

	public ArtifactResource(HrResourceFactory resourceFactory, Artifact o) {
		super(resourceFactory, o);
	}

	@Override
	public String getName() {
		return RAASUtils.getSerializationNameForExport(modelElement);
	}

	@Override
	public Long getContentLength() {
		if (modelElement.isBlobUpToDate())
			return modelElement.getFileContent().getSize();
		else if (!modelElement.getContents().isEmpty()) {
			try {
				File file = ArtifactImpl.serializeModel(modelElement, getName(), new NullProgressMonitor());
				return file.length();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public String getContentType(String arg0) {
		return "application/octet-stream";
	}

	@Override
	public Long getMaxAgeSeconds(Auth arg0) {
		return null;
	}

	@Override
	public void sendContent(OutputStream out, Range range, Map<String, String> params, String contentType) throws IOException, NotAuthorizedException, BadRequestException {
		String name = getName();
		InputStream is;
		long size;
		if (modelElement.isBlobUpToDate()) {
			is = modelElement.getFileContent().getContents();
			size = modelElement.getFileContent().getSize();
		} else {
			File file = ArtifactImpl.serializeModel(modelElement, name, new NullProgressMonitor());
			is = new FileInputStream(file);
			size = file.length();
		}
		if (range != null && range.getStart() != 0) {
			System.out.println("Resuming from " + range.getStart() + " to  " + range.getFinish());
			is.skip(range.getStart());
			FileUtil.inputstreamToOutputstream(is, out, range.getFinish() - range.getStart());
		} else {
			FileUtil.inputstreamToOutputstream(is, out, size);
		}
	}

}
