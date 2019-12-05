/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.SingletonUtil;
import org.eclipse.swt.SWT;
import org.raas4emf.cms.core.IRAASSessionSingletonService;
import org.raas4emf.cms.core.RAASSessionSingleton;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.PreviewView;

import raascms.Artifact;

public class RAASSessionSingletonService implements IRAASSessionSingletonService {

	public static class RAPRAASSessionSingleton extends RAASSessionSingleton {

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
			return super.get3dFormat();
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
