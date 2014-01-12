/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.service.ServiceHandler;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.transformation.TransformationUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.actions.RAASJob;
import org.raas4emf.cms.ui.actions.ZipAction;
import org.raas4emf.cms.ui.rap.RAASSessionSingletonService.RAPRAASSessionSingleton;

import raascms.Artifact;
import raascms.Folder;

public class DownloadServiceHandler implements ServiceHandler {

	private static final boolean OWN_PROVISION = true;

	@SuppressWarnings("deprecation")
	public void service(final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {

		// String type = RWT.getRequest().getParameter("type");
		// if (type != null) {
		//
		// CDOView trans = org.raas4emf.cms.ui.Activator.getSessionInstance().openView();
		// ObjectLibraryResponse result = RAASUtils.convertToWebPacket(type, trans);
		// byte[] bytes = encodeRaasProtocol(result);
		//
		// // Send the file in the response
		// HttpServletResponse response = RWT.getResponse();
		// response.setContentType("application/json");
		// // String contentDisposition = "attachment; filename=\"" + fileName
		// // + "\"";
		// // response.setHeader( "Content-Disposition", contentDisposition );
		// try {
		// // IWorkbenchPage page = PlatformUI.getWorkbench().getWorkbenchWindows().getActivePage();
		// TransformationUtils.inputstreamToOutputstream(new ByteArrayInputStream(bytes), response.getOutputStream(), Integer.MAX_VALUE);
		// } catch (IOException ioe) {
		// throw new RuntimeException(ioe);
		// }
		// return;
		//
		// }
		//
		// if (type != null) {
		//
		// // CDOView trans = org.raas4emf.cms.ui.Activator.getSessionInstance().openView();
		//
		// // List<?> result = RAASUtils.convertToWebPacket(type, trans);
		//
		// HttpClient httpclient = new HttpClient();
		//
		// String restUri = RAASUtils.getRAASProp("RAASSERVICEURL") + "services/Artifact/QueryArtifact/" + type;
		//
		// // Get the file content
		// GetMethod method = new GetMethod();
		// method.setURI(new org.apache.commons.httpclient.URI(restUri.toString(), true));
		// method.addRequestHeader("Accept", "application/json");
		// int responseCode = httpclient.executeMethod(method);
		// if (responseCode != 200 && responseCode != 204) {
		// System.err.println(method.getStatusText() + "\n" + method.getResponseBodyAsString());
		// throw new RuntimeException(method.getStatusText() + "\n" + method.getResponseBodyAsString());
		// }
		//
		// // Send the file in the response
		// HttpServletResponse response = RWT.getResponse();
		// response.setContentType("application/json");
		// response.setContentLength((int) method.getResponseContentLength());
		// // String contentDisposition = "attachment; filename=\"" + fileName
		// // + "\"";
		// // response.setHeader( "Content-Disposition", contentDisposition );
		// try {
		// TransformationUtils.inputstreamToOutputstream(method.getResponseBodyAsStream(), response.getOutputStream(), Integer.MAX_VALUE);
		// } catch (IOException ioe) {
		// throw new RuntimeException(ioe);
		// }
		// return;
		//
		// }

		String artifactId = RWT.getRequest().getParameter("artifact");
		if ("listjobs".equals(artifactId)) {
			String path = RWT.getRequest().getParameter("path");

			EObject eObject = RAASUIUtils.findByPath(path.split("/"));
			// if (folder == null) {
			// MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error", "Could not locate path!");
			// return null;
			// }
			Folder folder = (Folder) eObject;

			String result = "[";
			// result += examineFolder(folder);
			Job[] jobs = Job.getJobManager().find(null);
			for (Job job : jobs) {
				if (job instanceof RAASJob) {
					RAASJob raasJob = (RAASJob) job;
					if (raasJob.processedArtifat == null)
						continue;
					if (raasJob.monitor == null)
						continue;
					result += "{ \"ifcfile\":\"" + raasJob.processedArtifat.getName() + "\", ";
					result += " \"state\":\"" + (job.getState() == Job.RUNNING ? "RUNNING" : job.getState() == Job.WAITING ? "WAITING" : job.getState() == Job.SLEEPING ? "SLEEPING" : "NONE") + "\", ";

					job.toString();
					;

					result += " \"progress\":\"" + job.toString() + "\" ";
					result += " },\n";
				}

			}

			RAPRAASSessionSingleton si = (RAPRAASSessionSingleton) CMSActivator.getSessionInstance();
			// Send the file in the response

			response.addHeader("Access-Control-Allow-Origin", "*");
			response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");

			response.setContentType("application/octet-stream");
			response.setHeader("Content-Disposition", "attachment; filename=\"" + "response.json" + "\"");
			if (result.trim().endsWith(","))
				result = result.trim().substring(0, result.trim().length() - 1);
			result += "]";
			FileUtil.inputstreamToOutputstream(new StringBufferInputStream(result), response.getOutputStream());
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

			Artifact artifact = (Artifact) RAASUIUtils.findObjectById(artifactId);

			response.addHeader("Access-Control-Allow-Origin", "*");
			response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
			// Send the file in the response
			response.setContentType("application/octet-stream");

			String filename = RWT.getRequest().getParameter("filename");
			if (filename == null)
				throw new RuntimeException("No filename provided when requesting " + artifact.getName() + "!");
			response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");

			Object fileObject = artifact.getFileOrStream(filename, new NullProgressMonitor());
			InputStream inputStream;
			if (fileObject instanceof File) {
				File file = (File) fileObject;
				Date lastModified = new Date(file.lastModified());
				String sIfModifiedSince = RWT.getRequest().getHeader("If-Modified-Since");
				if (sIfModifiedSince != null) {
					// resetting milliseconds for Date.after() to work
					lastModified = new Date(lastModified.toGMTString());
					Date ifModifiedSince = new Date(sIfModifiedSince);
					if (!lastModified.after(ifModifiedSince)) {
						response.setStatus(304);
						return;
					}
				}
				String sDate = lastModified.toGMTString();
				response.setHeader("Last-Modified", sDate);
				if (file.length() < Integer.MAX_VALUE)
					response.setContentLength((int) file.length());
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
				System.err.println(method.getStatusText() + "\n" + method.getResponseBodyAsString());
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

	private String examineFolder(Folder folder) {
		String result = "";
		for (Artifact artifact : folder.getArtifacts()) {
			if (artifact.getName().endsWith(".ifc")) {
				result += "{ \"ifcname\":\"" + artifact.getName() + "\", ";
				for (EObject model : artifact.getContents()) {
					Double ratio = RAASUtils.getCompletionRatio(model);
					if (ratio != null) {
						result += "ratio:\"" + ((int) (100 * ratio)) + "\"";
					}
				}
				result += " }\n";
			}
		}

		for (Folder sub : folder.getFolders()) {
			result += examineFolder(sub);
		}
		return result;
	}

}