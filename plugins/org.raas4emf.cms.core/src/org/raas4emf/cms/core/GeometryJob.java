package org.raas4emf.cms.core;

import java.io.InputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import raascms.Artifact;
import raascms.Folder;

public class GeometryJob extends RAASJob {

	private String sceneName;
	private String fingerprint;
	private String ifcUrl;
	private String jsUrl;
	public static StatusChangeCallback STATUS_CHANGED_CALLBACK;

	public GeometryJob(Artifact artifact) {
		super("Generate WebGL for " + artifact.getName(), artifact);
		Folder folder = (Folder) artifact.eContainer();
		sceneName = "scene.js";
		ifcUrl = Activator.getSessionInstance().createFullDownloadUrl(artifact);
		fingerprint = artifact.getFingerPrint();
		jsUrl = ifcUrl.substring(0, ifcUrl.indexOf("downloadServiceHandler")) + "embeddedapi&request=GeometryUploadRequest&UUID=" + folder.getName();
	}

	public GeometryJob(Artifact artifact, String sceneName) {
		this(artifact);
		this.sceneName = sceneName;
	}

	protected IStatus run(IProgressMonitor monitor) {
		monitor = interceptMonitor(monitor);
		try {
			System.setProperty(fingerprint + ".ifc", ifcUrl);
			System.setProperty(fingerprint + ".js", jsUrl);
			InputStream is = artifact.asFile(sceneName, monitor);
			if (is == null)
				return Status.CANCEL_STATUS;
			is.close();
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;
		} catch (final Exception e) {
			Activator.err(e);
			return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, e.getMessage(), e);
		} finally {
			System.setProperty(fingerprint + ".ifc", "");
			System.setProperty(fingerprint + ".js", "");
			if (STATUS_CHANGED_CALLBACK != null)
				STATUS_CHANGED_CALLBACK.stateChanged(artifact);
		}
		return Status.OK_STATUS;
	}

}
