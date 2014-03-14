/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.SingletonUtil;
import org.eclipse.swt.SWT;
import org.raas4emf.cms.core.IRAASSessionSingletonService;
import org.raas4emf.cms.core.RAASSessionSingleton;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.PreviewView;

import raascms.Artifact;

public class RAASSessionSingletonService implements IRAASSessionSingletonService {

	public static class RAPRAASSessionSingleton extends RAASSessionSingleton {

		@Override
		public String createDownloadUrl(String filename) {
			StringBuilder url = new StringBuilder();
			url.append(RWT.getServiceManager().getServiceHandlerUrl("downloadServiceHandler"));
			url.append("&artifact=");
			url.append(filename);
			String result = RWT.getResponse().encodeURL(url.toString());
			if ("zipped".equals(filename) || "current".equals(filename))
				return result;
			return result.substring(0, result.indexOf("cid=")) + result.substring(result.indexOf("artifact="));
		}

		@Override
		public String get3dRendererUrl() {
			return createDownloadUrl("WebContent/threejs/");
		}

		@Override
		public String createFullDownloadUrl(Artifact artifact) {
			StringBuilder url = new StringBuilder();
			url.append("http://");
			url.append(RWT.getRequest().getServerName());
			url.append(":");
			url.append(RWT.getRequest().getServerPort());
			url.append(RWT.getServiceManager().getServiceHandlerUrl("downloadServiceHandler"));
			url.append("&artifact=");
			url.append(artifact.cdoID().toURIFragment());
			url.append("&filename=");
			url.append(artifact.getName());
			String encodedURL = RWT.getResponse().encodeURL(url.toString());
			return encodedURL;
		}

		@Override
		public int getBrowserType() {
			return SWT.NONE;
		}

		@Override
		public void exportPSets(Artifact workingArtifact) {
			this.workingArtifact = workingArtifact;
			JSExecutor.executeJS("self.location.href='" + createDownloadUrl("current") + "'");
		}

		@Override
		public void exportFolderContents(File zippedContents) {
			this.zippedContents = zippedContents;
			JSExecutor.executeJS("self.location.href='" + createDownloadUrl("zipped") + "'");
		}

		@Override
		public String getUserAgent() {
			return RWT.getRequest().getHeader("User-Agent");
		}

		@Override
		public boolean loadWebGLFromRaaSServer() {
			return false;
			// otherwise no color scheme adjustment, if-modified-since logic, and also SecurityRestriction for javascript bound methods
		}

		@Override
		public String getRenderer() {
			String result = RWT.getSettingStore().getAttribute("renderer");
			if (result != null) {
				return result;
			}
			return "three.js - WebGL";
		}

		@Override
		public void setRenderer(String g_renderer) {
			try {
				RWT.getSettingStore().setAttribute("renderer", g_renderer);
			} catch (IOException e) {
				Activator.err(e);
			}
		}

		@Override
		public String get3dFormat() {
			String result = RWT.getSettingStore().getAttribute("3dFormat");
			if (result != null) {
				return result;
			}
			return ".js - three.js internal JSON format";
		}

		@Override
		public void set3dFormat(String g_format) {
			try {
				RWT.getSettingStore().setAttribute("3dFormat", g_format);
			} catch (IOException e) {
				Activator.err(e);
			}
		}

		@Override
		public void loadPasswordList() {
			String result = RWT.getSettingStore().getAttribute("passwords");
			super.setPasswordList(result);
		}

		@Override
		public void setPasswordList(String value) {
			try {
				RWT.getSettingStore().setAttribute("passwords", value);
				super.setPasswordList(value);
			} catch (IOException e) {
				Activator.err(e);
			}
		}

		@Override
		public byte[] encodeJSON(Object arg) {
			ByteArrayOutputStream requestBody = new ByteArrayOutputStream();
			RAASUtils.encodeJSON(arg, requestBody, Arrays.asList("representationItem", "innerCurves", "bounds", "sbsmBoundary", "styles", "documents", "objects", "comments"), true);
			return requestBody.toByteArray();
		}

		@Override
		public Object decodeJSON(String arg, EClass eClass) {
			arg = "{\"" + eClass.getName() + "Element\":" + arg + "}";
			InputStream responseBody = new ByteArrayInputStream(arg.getBytes());
			return RAASUtils.decodeJSON(responseBody, eClass);
		}

		@Override
		public void executeJSMethod(String methodName, String stringArg) {
			JSExecutor.executeJS("window.external." + methodName + "('" + stringArg.replace("\'", "\\\'").replace("\"", "\\\"") + "');");
		}

		@Override
		public boolean propagateTreeSelection(Object selection, boolean isDblClick) {
			String objectIDs = PreviewView.getObjectIDs(RAASUIUtils.getSelection((ISelection) selection, EObject.class));
			if (!"[]".equals(objectIDs)) {
				JSExecutor.executeJS(" window.parent.postMessage({'" + (isDblClick ? "locateShape" : "selectShape") + "':" + objectIDs + "},'*'); ");
				return true;
			}
			return false;
		}
	};

	@Override
	public RAASSessionSingleton getInstance() {
		return (RAPRAASSessionSingleton) SingletonUtil.getSessionInstance(RAPRAASSessionSingleton.class);
	}

}
