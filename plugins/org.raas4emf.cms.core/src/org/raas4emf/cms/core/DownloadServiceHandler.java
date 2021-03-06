/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.util.io.ExpectedFileInputStream;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.service.ServiceHandler;
import org.raas4emf.cms.transformation.TransformationUtils;

import raascms.Artifact;
import raascms.Folder;
import raascms.RaascmsFactory;

public class DownloadServiceHandler implements ServiceHandler {

	private static final boolean OWN_PROVISION = true;
	public static final String TEMP_SEPARATOR = "_";

	public void service(final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {
		RAASUtils.fixServiceHandlePreconditions();

		String artifactId = request.getParameter("artifact");
		String viewer = request.getParameter("viewer");
		if (viewer != null)
			artifactId = viewer;
		if (artifactId.startsWith("WebContent/"))
			artifactId = "platform:/plugin/org.raas4emf.service/" + artifactId;
		if (artifactId.startsWith("/plugin/"))
			artifactId = "platform:" + artifactId;
		if (artifactId.startsWith("plugin/"))
			artifactId = "platform:/" + artifactId;
		if (artifactId.startsWith("platform:")) {
			URL fileURL = new URL(artifactId);
			try {
				URL u = FileLocator.resolve(fileURL);
				String fileName = u.getFile();
				guessContentType(response, fileName);
				File fileForLastModified;
				if (fileName.lastIndexOf("!") != -1) {
					fileForLastModified = new File(fileName.substring(0, fileName.lastIndexOf("!")));
				} else {
					fileForLastModified = new File(u.toURI());
				}
				if (fileForLastModified.exists() && !isModified(request, response, null, fileForLastModified)) {
					return;
				}
				TransformationUtils.inputstreamToOutputstream(u.openStream(), response.getOutputStream(), Integer.MAX_VALUE);
			} catch (URISyntaxException e) {
				Activator.err(e);
				throw new IOException(e);
			}
			return;
		}
		if ("log".equals(artifactId)) {
			String body = FileUtil.inputstreamToString(request.getInputStream());
			Activator.info("Logged request body:" + body);
			return;
		}
		if ("iframe_contents".equals(artifactId)) {
			// Send the file in the response
			response.setContentType("text/html");
			String iframe_contents = Activator.getSessionInstance().getParameter("iframe_contents");
			FileUtil.inputstreamToOutputstream(new StringBufferInputStream(iframe_contents), response.getOutputStream());
			return;
		}
		if ("current".equals(artifactId)) {
			RAASSessionSingleton si = Activator.getSessionInstance();
			// Send the file in the response
			response.setContentType("application/octet-stream");
			response.setHeader("Content-Disposition", "attachment; filename=\"" + si.workingArtifact.getName() + "\"");
			FileUtil.inputstreamToOutputstream(si.workingArtifact.asFile(si.workingArtifact.getName()), response.getOutputStream());
			return;
		}
		if ("zipped".equals(artifactId)) {
			RAASSessionSingleton si = Activator.getSessionInstance();
			// Send the file in the response
			response.setContentType("application/octet-stream");
			String name = si.zippedContents.getName();
			if (name.indexOf(TEMP_SEPARATOR) != -1)
				name = name.substring(0, name.indexOf(TEMP_SEPARATOR));
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
			try {
				response.setHeader("Expires", "-1");
				response.setHeader("Cache-Control", "must-revalidate, private");
				response.addHeader("Access-Control-Allow-Origin", "*");
				response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
				// Send the file in the response

				String filename = request.getParameter("filename");
				if (filename == null)
					throw new RuntimeException("No filename provided when requesting " + artifactId + "!");
				String download = request.getParameter("download");
				if (!(download != null && "yes".equals(download))) {
					guessContentType(response, filename);
				} else {
					response.setContentType("application/octet-stream");
					response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
				}

				Object fileObject = null;
				Artifact artifact = null;
				if (artifactId.startsWith("RepositoryRoot/")) {
					EObject eObject = RAASUtils.findByPath(artifactId.split("/"));
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
					artifact = (Artifact) RAASUtils.findObjectById(artifactId);
					fileObject = artifact.getFileOrStream(filename, new NullProgressMonitor());
				}
				String downloadurl = request.getParameter("downloadurl");
				if (downloadurl != null && fileObject == null) {

					String name = request.getParameter("name");
					if (name == null) {
						throw new RuntimeException("No name provided for downloadurl " + downloadurl + " !");
					}

					// File file = new File("c:/dev/try.txt");
					// org.apache.commons.io.FileUtils.copyURLToFile(new URL(artifactId), file);
					// FileInputStream ins = new FileInputStream(file);

					URL myurl = new URL(downloadurl);
					URLConnection con = myurl.openConnection();
					InputStream ins = con.getInputStream();

					artifact = RaascmsFactory.eINSTANCE.createArtifact();
					artifact.setName(name);
					artifact.setFileContent(new CDOBlob(ins));

					fileObject = artifact.getFileOrStream(filename, new NullProgressMonitor());

					// // Send the file in the response
					// response.setContentType("application/octet-stream");
					// // response.setContentLength((int) file.length());
					// try {
					// TransformationUtils.inputstreamToOutputstream(ins, response.getOutputStream(), Integer.MAX_VALUE);
					// } catch (IOException ioe) {
					// throw new RuntimeException(ioe);
					// }

				}

				InputStream inputStream;
				if (fileObject instanceof File) {
					File file = (File) fileObject;
					if (!isModified(request, response, file, file))
						return;
					inputStream = new FileInputStream(file);
				} else {
					inputStream = (InputStream) fileObject;
					if (fileObject instanceof ExpectedFileInputStream) {
						ExpectedFileInputStream expectedFileInputStream = (ExpectedFileInputStream) fileObject;
						try {
							Field f = expectedFileInputStream.getClass().getDeclaredField("file");
							f.setAccessible(true);
							File file = (File) f.get(expectedFileInputStream);
							if (!isModified(request, response, file, file))
								return;
						} catch (Exception e) {
							Activator.err(e.getMessage());
						}
					}
				}

				try {
					TransformationUtils.inputstreamToOutputstream(inputStream, response.getOutputStream(), Integer.MAX_VALUE);
				} catch (IOException ioe) {
					throw new RuntimeException(ioe);
				}
			} catch (Throwable e) {
				response.setStatus(400);
				String message = "" + e.getMessage();
				response.setHeader("RAASResponseMessage", "" + message);
				message = "{\"errorMessage\": " + RAASUtils.quote(message) + "}";
				FileUtil.inputstreamToOutputstream(new StringBufferInputStream(message), response.getOutputStream());
			}
		} else {
			HttpClient httpclient = new HttpClient();

			String restUri = RAASUtils.getRAASProp("RAASSERVICEURL") + "services/Artifact/GetArtifact/" + artifactId + "/scene.js";
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

	private void guessContentType(final HttpServletResponse response, String fileName) {
		if (fileName.endsWith(".js"))
			response.setContentType("text/javascript");
		else if (fileName.endsWith(".css"))
			response.setContentType("text/css");
		else if (fileName.endsWith(".png"))
			response.setContentType("image/png");
		else if (fileName.endsWith(".jpg"))
			response.setContentType("image/jpg");
		else if (fileName.endsWith(".gif"))
			response.setContentType("image/gif");
		else if (fileName.endsWith(".html"))
			response.setContentType("text/html");
		else
			response.setContentType("application/octet-stream");
	}

	private boolean isModified(final HttpServletRequest request, final HttpServletResponse response, File file, File fileForLastModified) {
		Date lastModified = new Date(fileForLastModified.lastModified());
		String sIfModifiedSince = request.getHeader("If-Modified-Since");
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