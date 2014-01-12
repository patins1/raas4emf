package org.raas4emf.cms.ui.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;

import raascms.Artifact;

abstract public class RAASJob extends Job {

	public RAASJob(String name) {
		super(name);
	}

	public IProgressMonitor monitor;

	public Artifact processedArtifat;

}
