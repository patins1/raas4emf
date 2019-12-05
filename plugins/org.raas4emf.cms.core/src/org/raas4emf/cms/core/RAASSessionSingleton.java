/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.rap.rwt.RWT;

import raascms.Artifact;

public class RAASSessionSingleton {

	public Artifact workingArtifact;
	protected File zippedContents;

	public static final boolean USE_SINGLE_CDOCLIENT = Boolean.valueOf(System.getProperty("USE_SINGLE_CDOCLIENT"));
	private String userID = "Architect";
	private String password = "a";
	private CDONet4jSession session;
	private CDOView transaction;
	private String g_colors;
	private boolean g_ortho = false;
	private String g_renderer;
	private String g_format;
	private String passwords;
	private Map<Artifact, Artifact> cacheModelTrees = new WeakHashMap<Artifact, Artifact>();
	private Exception storedDBException;
	private Map<String, Object> userObject = new HashMap<String, Object>();
	private Map<String, String> parameters = new HashMap<String, String>();
	public static RAASSessionSingleton SINGLETON;

	public RAASSessionSingleton() {
		if (SINGLETON == null)
			SINGLETON = this;
		// prevent instantiation from outside
	}

	public void setCredentials(String userID, String password) {
		if (USE_SINGLE_CDOCLIENT && SINGLETON != this) {
			SINGLETON.setCredentials(userID, password);
			return;
		}
		this.userID = userID;
		this.password = password;
	}

	public void resetDBErrors() {
		if (USE_SINGLE_CDOCLIENT && SINGLETON != this) {
			SINGLETON.resetDBErrors();
			return;
		}
		storedDBException = null;
	}

	public void resetDBConnection() {
		if (USE_SINGLE_CDOCLIENT && SINGLETON != this) {
			SINGLETON.resetDBConnection();
			return;
		}
		cacheModelTrees.clear();
		storedDBException = null;
		if (transaction != null) {
			transaction.close();
			transaction = null;
		}
		if (session != null) {
			session.close();
			session = null;
		}
	}

	public CDOView openTransaction() {
		if (USE_SINGLE_CDOCLIENT && SINGLETON != this)
			return SINGLETON.openTransaction();
		CDONet4jSession session = getSession();
		if (transaction == null)
			if (isLibarian())
				transaction = session.openTransaction();
			else
				transaction = session.openView();
		return transaction;
	}

	public CDONet4jSession getSession() {
		if (USE_SINGLE_CDOCLIENT && SINGLETON != this)
			return SINGLETON.getSession();
		if (storedDBException != null)
			throw new RuntimeException("Database connection error!", storedDBException);
		try {
			if (session == null) {
				session = RAASUtils.getCDOSession(userID, password);
			}
		} catch (Exception e) {
			if (!USE_SINGLE_CDOCLIENT) {
				storedDBException = e;
			}
			if (e instanceof RuntimeException)
				throw (RuntimeException) e;
			throw new RuntimeException("Database connection error!", storedDBException);
		}
		return session;
	}

	public CDOView openView() {
		return openTransaction();
	}

	public boolean isLibarian() {
		if (USE_SINGLE_CDOCLIENT && SINGLETON != this)
			return SINGLETON.isLibarian();
		return RAASUtils.isLibrarian(userID);
	}

	public boolean isOperator() {
		if (USE_SINGLE_CDOCLIENT && SINGLETON != this)
			return SINGLETON.isOperator();
		return RAASUtils.isOperator(userID);
	}

	public String createDownloadUrl(String filename) {
		StringBuilder url = new StringBuilder();
		url.append(RWT.getServiceManager().getServiceHandlerUrl("downloadServiceHandler"));
		url.append("&artifact=");
		url.append(filename);
		String result = RWT.getResponse().encodeURL(url.toString());
		if ("zipped".equals(filename) || "current".equals(filename))
			return result;
		return removeCid(result);
	}

	public String get3dRendererUrl() {
		return createDownloadUrl("WebContent/threejs/");
	}

	public String createFullDownloadUrl(Artifact artifact) {
		StringBuilder url = new StringBuilder();
		url.append(RWT.getRequest().getScheme() + "://");
		url.append(RWT.getRequest().getServerName());
		url.append(":");
		url.append(RWT.getRequest().getServerPort());
		url.append(RWT.getServiceManager().getServiceHandlerUrl("downloadServiceHandler"));
		if (artifact != null) {
			url.append("&artifact=");
			url.append(artifact.cdoID().toURIFragment());
			url.append("&filename=");
			url.append(RWT.getRequest().getParameter("filename") != null ? RWT.getRequest().getParameter("filename") : artifact.getName());
		}
		String result = RWT.getResponse().encodeURL(url.toString());
		return removeCid(result);
	}

	private String removeCid(String url) {
		int cid = url.indexOf("&cid=");
		if (cid != -1) {
			String result = url.substring(0, cid);
			int nextParam = url.indexOf("&", cid + 1);
			if (nextParam != -1)
				return result + url.substring(nextParam);
			return result;
		}
		return url;
	}

	public int getBrowserType() {
		return 0;
	}

	public void exportPSets(Artifact workingArtifact) {

	}

	public void exportFolderContents(File zippedContents) {

	}

	public String getUserAgent() {
		return "";
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public String getParameter(String name) {
		return parameters.get(name);
	}

	public void setParameter(String name, String value) {
		parameters.put(name, value);
	}

	public boolean loadWebGLFromRaaSServer() {
		return false;
	}

	public String getColors() {
		return g_colors;
	}

	public void setColors(String string) {
		g_colors = string;
	}

	public boolean getOrtho() {
		return g_ortho;
	}

	public void setOrtho(boolean value) {
		g_ortho = value;
	}

	public Artifact getArtifactWithModelTree(Artifact artifact) {
		if (USE_SINGLE_CDOCLIENT && SINGLETON != this)
			return SINGLETON.getArtifactWithModelTree(artifact);
		if (!cacheModelTrees.containsKey(artifact)) {
			try {
				cacheModelTrees.put(artifact, RAASUtils.assureModelTree(artifact));
			} catch (IOException e) {
				cacheModelTrees.put(artifact, artifact); // not try to parse again
			}
		}
		return cacheModelTrees.get(artifact);
	}

	public String getRenderer() {
		if (g_renderer != null)
			return g_renderer;
		return "three.js - WebGL";
	}

	public void setRenderer(String g_renderer) {
		this.g_renderer = g_renderer;
	}

	public String get3dFormat() {
		if (g_format != null)
			return g_format;
		return ".gltf - glTF";
	}

	public void set3dFormat(String g_format) {
		this.g_format = g_format;
	}

	public String getPasswordList() {
		if (passwords != null)
			return passwords;
		return "";
	}

	public void setPasswordList(String value) {
		this.passwords = value;
	}

	public void loadPasswordList() {
	}

	public Integer getIEVersion() {
		String answer = getUserAgent();
		if (answer != null) {
			int indexMSIE = answer.indexOf("MSIE");
			int indexDot = answer.indexOf(".", indexMSIE + 1);
			if (indexMSIE != -1 && indexDot != -1) {
				int ieVersion = Integer.parseInt(answer.substring(indexMSIE + "MSIE".length(), indexDot).trim());
				return ieVersion;
			}
		}
		return null;
	}

	public void setUserObject(String key, Object userObject) {
		this.userObject.put(key, userObject);
	}

	public Object getUserObject(String key) {
		return userObject.get(key);
	}

	public void executeJSMethod(String methodName, String stringArg) {
	}

	public boolean propagateTreeSelection(Object selection, boolean isDblClick) {
		return false;
	}

}
