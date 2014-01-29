/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rcp;

import java.io.File;

import org.eclipse.swt.SWT;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.discriminator.IRAASSessionSingletonService;
import org.raas4emf.cms.ui.discriminator.RAASSessionSingleton;
import org.raas4emf.cms.ui.views.PreviewView;

import raascms.Artifact;

public class RAASSessionSingletonService implements IRAASSessionSingletonService {

	static RAASSessionSingleton singleton = new RAASSessionSingleton() {

		@Override
		public String createDownloadUrl(String ids) {
			return RAASUtils.getRAASProp("RAASSERVICEURL") + "o3d/ifcview.html?artifact=" + ids;
		}

		@Override
		public String get3dRendererUrl() {
			return RAASUtils.getRAASProp("RAASSERVICEURL") + (PreviewView.isThreeJS() ? "threejs/" : "o3d/");
		}

		@Override
		public int getBrowserType() {
			return SWT.NONE;
		}

		@Override
		public void exportPSets(Artifact workingArtifact) {
		}

		@Override
		public void exportFolderContents(File zippedContents) {
		}

		@Override
		public String getUserAgent() {
			return "";
		}

		@Override
		public String createFullDownloadUrl(Artifact artifact) {
			return RAASUtils.getRAASProp("RAASSERVICEURL") + "services/Artifact/GetArtifact/" + artifact.cdoID().toURIFragment() + "/" + artifact.getName();
		}

		@Override
		public boolean loadWebGLFromRaaSServer() {
			return true;
			// otherwise problems with cross-domain access permission with IE
		}

	};

	@Override
	public RAASSessionSingleton getInstance() {
		return singleton;
	}

}
