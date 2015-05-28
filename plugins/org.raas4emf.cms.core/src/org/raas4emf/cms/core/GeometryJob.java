package org.raas4emf.cms.core;

import java.io.InputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import raascms.Artifact;
import raascms.Folder;

public class GeometryJob extends RAASJob {

	protected String sceneName;
	private String fingerprint;
	private String ifcUrl;
	private String jsUrl;
	private String instanceId;
	private String ipAddress;
	public boolean isInDB;
	public static StatusChangeCallback STATUS_CHANGED_CALLBACK;

	public GeometryJob(Artifact artifact) {
		super("Generate WebGL for " + artifact.getName(), artifact);
		Folder folder = (Folder) artifact.eContainer();
		sceneName = "scene.js";
		ifcUrl = Activator.getSessionInstance().createFullDownloadUrl(artifact);
		fingerprint = artifact.getFingerPrint();
		jsUrl = ifcUrl.substring(0, ifcUrl.indexOf("downloadServiceHandler")) + "embeddedapi&request=GeometryUploadRequest&UUID=" + folder.getName();
		this.setRule(new RAASSchedulingRule(Integer.parseInt(System.getProperty("PARALLEL_GEOMETRY", "10")), "GEOMETRY"));
	}

	public GeometryJob(Artifact artifact, String sceneName) {
		this(artifact);
		this.sceneName = sceneName;
	}

	protected IStatus run(IProgressMonitor monitor) {
		monitor = interceptMonitor(monitor);
		try {
			this.monitor.setProperty("ifc", ifcUrl);
			this.monitor.setProperty("js", jsUrl);
			this.monitor.setProperty("job", this);
			Object fs = artifact.getFileOrStream(sceneName, monitor);
			if (fs == null)
				return Status.CANCEL_STATUS;
			if (fs instanceof InputStream) {
				((InputStream)fs).close();
				isInDB = true;
			}
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;
		} catch (final Exception e) {
			Activator.err(e);
			return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, e.getMessage(), e);
		} finally {
			if (STATUS_CHANGED_CALLBACK != null)
				STATUS_CHANGED_CALLBACK.stateChanged(artifact);
		}
		return Status.OK_STATUS;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String value) {
		instanceId = value;		
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

}
