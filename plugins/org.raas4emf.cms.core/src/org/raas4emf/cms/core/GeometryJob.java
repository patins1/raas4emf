package org.raas4emf.cms.core;

import java.io.InputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.net4j.util.HexUtil;

import raascms.Artifact;
import raascms.Folder;

public class GeometryJob extends RAASJob {

	private String sceneName;

	public GeometryJob(Artifact artifact) {
		super("Generate WebGL for " + artifact.getName(), artifact);
		Folder folder = (Folder) artifact.eContainer();
		sceneName = "scene.js";
		String url = Activator.getSessionInstance().createFullDownloadUrl(artifact);
		System.setProperty(HexUtil.bytesToHex(artifact.getFileContent().getID()) + ".ifc", url);
		String jsurl = url.substring(0, url.indexOf("downloadServiceHandler")) + "embeddedapi&request=GeometryUploadRequest&UUID=" + folder.getName();
		System.setProperty(HexUtil.bytesToHex(artifact.getFileContent().getID()) + ".js", jsurl);
	}

	protected IStatus run(IProgressMonitor monitor) {
		monitor = interceptMonitor(monitor);
		try {
			InputStream is = artifact.asFile(sceneName, monitor);
			if (is == null)
				return Status.CANCEL_STATUS;
			is.close();
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;
		} catch (final Exception e) {
			Activator.err(e);
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
		}
		return Status.OK_STATUS;
	}

}
