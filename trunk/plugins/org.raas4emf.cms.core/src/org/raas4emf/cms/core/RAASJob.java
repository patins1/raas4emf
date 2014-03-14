package org.raas4emf.cms.core;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ProgressMonitorWrapper;
import org.eclipse.core.runtime.jobs.Job;

import raascms.Artifact;

abstract public class RAASJob extends Job {

	final protected Artifact artifact;

	int _worked;
	int _totalWork;

	public RAASJob(String name, Artifact artifact2) {
		super(name);
		artifact = artifact2;
	}

	public Artifact getArtifact() {
		return artifact;
	}

	public IProgressMonitor monitor;

	public IProgressMonitor getMonitor() {
		return monitor;
	}

	public IProgressMonitor interceptMonitor(IProgressMonitor monitor) {
		return this.monitor = new ProgressMonitorWrapper(monitor) {
			@Override
			public void worked(int work) {
				_worked += work;
				super.worked(work);
			}

			@Override
			public void beginTask(String name, int totalWork) {
				_totalWork = totalWork;
				super.beginTask(name, totalWork);
			}

		};
	}

	@Override
	public boolean belongsTo(Object family) {
		return artifact.cdoID() != null && family instanceof Artifact && artifact.cdoID().equals(((Artifact) family).cdoID());
	}

	public int getPercentageDone() {
		if (monitor != null) {
			int result = new Double(_worked * 100.0 / _totalWork).intValue();
			if (result == 100 && _worked < _totalWork) {
				// returning 100 can be confused with having completed the job
				return 99;
			}
			return result;
		}
		return 0;
	}

}
