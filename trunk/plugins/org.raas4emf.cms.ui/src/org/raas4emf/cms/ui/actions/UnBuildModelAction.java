/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.io.InputStream;
import java.util.Date;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.CMSActivator;

import raascms.Artifact;

public class UnBuildModelAction extends BuildModelAction {
	public void buildArtifact(final IProgressMonitor monitor, Artifact artifact) {
		buildArtifact(monitor, artifact, artifact);
	}

	public void buildArtifact(final IProgressMonitor monitor, Artifact artifact, Artifact target) {
		if (RAASUIUtils.isModelComplete(artifact)) {
			try {
				monitor.subTask("Unbuild " + artifact.getName());
				InputStream is = artifact.asFile(artifact.getName());
				target.setFileContent(new CDOBlob(is));
				target.getContents().clear();
				target.setModelDate(null);
				RAASUtils.setModificationDate(target, new Date());
			} catch (Exception e) {
				e.printStackTrace();
				stati.add(new Status(IStatus.ERROR, CMSActivator.PLUGIN_ID, "Error while unfolding " + RAASUtils.getPath(artifact), e));
			}
		}
	}

}
