/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.Arrays;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.impl.MetadataMap;
import org.apache.cxf.jaxrs.provider.JSONProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.SingletonUtil;
import org.eclipse.swt.SWT;
import org.raas4emf.cms.ui.discriminator.IRAASSessionSingletonService;
import org.raas4emf.cms.ui.discriminator.RAASSessionSingleton;

import raascms.Artifact;

public class RAASSessionSingletonService implements IRAASSessionSingletonService {

	public static class RAPRAASSessionSingleton extends RAASSessionSingleton {

		public Artifact workingArtifact;
		File zippedContents;

		@Override
		public String createDownloadUrl(String filename) {
			StringBuilder url = new StringBuilder();
			url.append(RWT.getServiceManager().getServiceHandlerUrl("downloadServiceHandler"));
			url.append("&artifact=");
			url.append(filename);
			String encodedURL = RWT.getResponse().encodeURL(url.toString());
			return encodedURL;
		}

		@Override
		public String createFullDownloadUrl(Artifact artifact) {
			StringBuilder url = new StringBuilder();
			url.append("http://");
			url.append(RWT.getRequest().getLocalAddr());
			url.append(":");
			url.append(RWT.getRequest().getLocalPort());
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
				e.printStackTrace();
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
				e.printStackTrace();
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
				e.printStackTrace();
			}
		}

		@Override
		public byte[] encodeJSON(Object arg) {

			JSONProvider writer = new JSONProvider();

			// writer.setExtraClass(new Class[] { ProductLineResponseImpl.class, ObjectLibraryResponseImpl.class });
			writer.setDropRootElement(true);
			writer.setSerializeAsArray(true);
			writer.setArrayKeys(Arrays.asList("representationItem", "innerCurves", "bounds", "sbsmBoundary", "styles", "documents"));

			ByteArrayOutputStream requestBody = new ByteArrayOutputStream();

			try {
				writer.writeTo(arg, arg.getClass(), arg.getClass(), new Annotation[] {}, MediaType.APPLICATION_JSON_TYPE, new MetadataMap<String, Object>(), requestBody);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			return requestBody.toByteArray();
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
		public Object decodeJSON(String arg, EObject rootElement) {

			arg = "{\"" + rootElement.eClass().getName() + "Element\":" + arg + "}";

			JSONProvider reader = new JSONProvider();

			// writer.setExtraClass(new Class[] { ProductLineResponseImpl.class, ObjectLibraryResponseImpl.class });
			reader.setDropRootElement(true);

			InputStream responseBody = new ByteArrayInputStream(arg.getBytes());
			Class targetType = rootElement.getClass();
			try {
				return reader.readFrom(targetType, targetType, new Annotation[] {}, MediaType.APPLICATION_JSON_TYPE, new MetadataMap<String, String>(), responseBody);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public void executeJSMethod(String methodName, String stringArg) {
			JSExecutor.executeJS("window.external." + methodName + "('" + stringArg.replace("\'", "\\\'").replace("\"", "\\\"") + "');");
		}

	};

	@Override
	public RAASSessionSingleton getInstance() {
		return (RAPRAASSessionSingleton) SingletonUtil.getSessionInstance(RAPRAASSessionSingleton.class);
	}

}
