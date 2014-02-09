package org.raas4emf.cms.ui.actions;

import java.io.InputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.views.PreviewView;

import raascms.Artifact;

public class GeometryJob extends RAASJob {

	private String sceneName;

	public GeometryJob(Artifact artifact) {
		super("Generate WebGL for " + artifact.getName(), artifact);
		sceneName = PreviewView.getScene3dName();
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
			CMSActivator.err(e);
			return new Status(IStatus.ERROR, CMSActivator.PLUGIN_ID, e.getMessage(), e);
		}
		return Status.OK_STATUS;
	}

}
