/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.service.ServiceHandler;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.transformation.TransformationUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.actions.ZipAction;
import org.raas4emf.cms.ui.rap.RAASSessionSingletonService.RAPRAASSessionSingleton;

import raascms.Artifact;
import raascms.Folder;

public class DownloadServiceHandler implements ServiceHandler {

	private static final boolean OWN_PROVISION = true;

	public void service(final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {
		DemoWorkbench.fixBug347967();

		String artifactId = RWT.getRequest().getParameter("artifact");
		if (artifactId.startsWith("WebContent/"))
			artifactId = "platform:/plugin/org.raas4emf.service/" + artifactId;
		if (artifactId.startsWith("/plugin/"))
			artifactId = "platform:" + artifactId;
		if (artifactId.startsWith("platform:")) {
			URL fileURL = new URL(artifactId);
			try {
				URL u = FileLocator.resolve(fileURL);
				String fileName = u.getFile();
				if (fileName.endsWith(".js"))
					response.setContentType("text/javascript");
				else if (fileName.endsWith(".css"))
					response.setContentType("text/css");
				else if (fileName.endsWith(".png"))
					response.setContentType("image/png");
				else if (fileName.endsWith(".jpg"))
					response.setContentType("image/jpg");
				else if (fileName.endsWith(".html"))
					response.setContentType("text/html");
				else
					Activator.err("unknown content:" + fileName);
				File fileForLastModified;
				if (fileName.lastIndexOf("!") != -1) {
					fileForLastModified = new File(fileName.substring(0, fileName.lastIndexOf("!")));
				} else {
					fileForLastModified = new File(u.toURI());
				}
				if (!isModified(response, null, fileForLastModified)) {
					return;
				}
				TransformationUtils.inputstreamToOutputstream(u.openStream(), response.getOutputStream(), Integer.MAX_VALUE);
			} catch (URISyntaxException e) {
				Activator.err(e);
				throw new IOException(e);
			}
			return;
		}
		if ("current".equals(artifactId)) {
			RAPRAASSessionSingleton si = (RAPRAASSessionSingleton) CMSActivator.getSessionInstance();
			// Send the file in the response
			response.setContentType("application/octet-stream");
			response.setHeader("Content-Disposition", "attachment; filename=\"" + si.workingArtifact.getName() + "\"");
			FileUtil.inputstreamToOutputstream(si.workingArtifact.asFile(si.workingArtifact.getName()), response.getOutputStream());
			return;
		}
		if ("zipped".equals(artifactId)) {
			RAPRAASSessionSingleton si = (RAPRAASSessionSingleton) CMSActivator.getSessionInstance();
			// Send the file in the response
			response.setContentType("application/octet-stream");
			String name = si.zippedContents.getName();
			if (name.indexOf(ZipAction.TEMP_SEPARATOR) != -1)
				name = name.substring(0, name.indexOf(ZipAction.TEMP_SEPARATOR));
			response.setHeader("Content-Disposition", "attachment; filename=\"" + name + "\"");
			response.setContentType("application/octet-stream");
			if (si.zippedContents.length() < Integer.MAX_VALUE) {
				// response.setContentLength((int) si.zippedContents.length());
				// response.setHeader("Content-Length", "" + si.zippedContents.length());
			}
			try {
				TransformationUtils.inputstreamToOutputstream(new FileInputStream(si.zippedContents), response.getOutputStream(), Long.MAX_VALUE);
			} catch (IOException ioe) {
				throw new RuntimeException(ioe);
			}
			return;
		}

		if (OWN_PROVISION) {

			response.addHeader("Access-Control-Allow-Origin", "*");
			response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
			// Send the file in the response
			response.setContentType("application/octet-stream");

			String filename = RWT.getRequest().getParameter("filename");
			if (filename == null)
				throw new RuntimeException("No filename provided when requesting " + artifactId + "!");
			response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");

			Object fileObject = null;
			Artifact artifact = null;
			if (artifactId.startsWith("RepositoryRoot/")) {
				EObject eObject = RAASUIUtils.findByPath(artifactId.split("/"));
				if (eObject instanceof Artifact) {
					artifact = (Artifact) eObject;
					fileObject = artifact.getFileOrStream(filename, new NullProgressMonitor());
				}
				if (eObject instanceof Folder) {
					Folder folder = (Folder) eObject;
					for (Artifact a : folder.getArtifacts()) {
						fileObject = a.getFileOrStream(filename, new NullProgressMonitor());
						if (fileObject != null) {
							artifact = a;
							break;
						}
					}
				}
			} else {
				artifact = (Artifact) RAASUIUtils.findObjectById(artifactId);
				fileObject = artifact.getFileOrStream(filename, new NullProgressMonitor());
			}

			InputStream inputStream;
			if (fileObject instanceof File) {
				File file = (File) fileObject;
				if (!isModified(response, file, file))
					return;
				inputStream = new FileInputStream(file);
			} else
				inputStream = (InputStream) fileObject;

			try {
				TransformationUtils.inputstreamToOutputstream(inputStream, response.getOutputStream(), Integer.MAX_VALUE);
			} catch (IOException ioe) {
				throw new RuntimeException(ioe);
			}
		} else {
			HttpClient httpclient = new HttpClient();

			String restUri = RAASUtils.getRAASProp("RAASSERVICEURL") + "services/Artifact/GetArtifact/" + artifactId + "/scene.o3djson";
			// Get the file content
			GetMethod method = new GetMethod();
			method.setURI(new org.apache.commons.httpclient.URI(restUri.toString(), true));
			method.addRequestHeader("Accept", "application/octet-stream");
			int responseCode = httpclient.executeMethod(method);
			if (responseCode != 200 && responseCode != 204) {
				Activator.err(method.getStatusText() + "\n" + method.getResponseBodyAsString());
				throw new RuntimeException(method.getStatusText() + "\n" + method.getResponseBodyAsString());
			}

			// Send the file in the response
			response.setContentType("application/octet-stream");
			response.setContentLength((int) method.getResponseContentLength());
			// String contentDisposition = "attachment; filename=\"" + fileName
			// + "\"";
			// response.setHeader( "Content-Disposition", contentDisposition );
			try {
				TransformationUtils.inputstreamToOutputstream(method.getResponseBodyAsStream(), response.getOutputStream(), Integer.MAX_VALUE);
			} catch (IOException ioe) {
				throw new RuntimeException(ioe);
			}
		}
	}

	private boolean isModified(final HttpServletResponse response, File file, File fileForLastModified) {
		Date lastModified = new Date(fileForLastModified.lastModified());
		String sIfModifiedSince = RWT.getRequest().getHeader("If-Modified-Since");
		if (sIfModifiedSince != null) {
			// resetting milliseconds for Date.after() to work
			lastModified = new Date(lastModified.toGMTString());
			Date ifModifiedSince = new Date(sIfModifiedSince);
			if (!lastModified.after(ifModifiedSince)) {
				response.setStatus(304);
				return false;
			}
		}
		String sDate = lastModified.toGMTString();
		response.setHeader("Last-Modified", sDate);
		if (file != null && file.length() < Integer.MAX_VALUE)
			response.setContentLength((int) file.length());
		return true;
	}

}