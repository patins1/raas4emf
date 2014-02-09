/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;

import raascms.Artifact;
import raascms.Folder;

public class UnzipAction extends AbstractHandler {

	public UnzipAction() {
		super();
	}

	static public IStatus runJob(Folder folder, InputStream is, final IProgressMonitor monitor, Display display) {
		List<Status> stati = new ArrayList<Status>();
		monitor.beginTask("Unzip contents", -1);
		ZipUtility zip = new ZipUtility(monitor, null);
		try {
			zip.unzip(is, folder);
			stati.addAll(zip.getStati());
			if (!monitor.isCanceled() && zip.getStati().isEmpty()) {
				AddArtifactAction.increaseSessionTimeout(folder);
				RAASUtils.doSaveAsSubTask(folder, "Save unzipped contents to database", new SubProgressMonitor(monitor, 100));
			} else {
				CDOTransaction transaction = (CDOTransaction) folder.cdoResource().cdoView();
				transaction.rollback();
			}
		} catch (Exception e) {
			stati.add(new Status(Status.ERROR, CMSActivator.PLUGIN_ID, "Failed to unzip contents", e));
		}
		monitor.done();
		if (monitor.isCanceled())
			return Status.CANCEL_STATUS;
		if (!stati.isEmpty()) {
			final MultiStatus multiStatus = new MultiStatus(CMSActivator.PLUGIN_ID, IStatus.ERROR, stati.toArray(new Status[] {}), "Operation failed", new Exception("Errors occured while unzipping file!"));
			display.asyncExec(new Runnable() {
				public void run() {
					StatusManager.getManager().handle(multiStatus, StatusManager.SHOW);
				}
			});
			return multiStatus;
		}
		return Status.OK_STATUS;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Shell shell = HandlerUtil.getActiveShell(event);
		for (final Artifact zipArtifact : RAASUIUtils.getSelection(event, Artifact.class)) {
			Job job = new Job("Zipping Folder Contents") {
				public IStatus run(IProgressMonitor monitor) {
					try {
						return runJob((Folder) zipArtifact.eContainer(), zipArtifact.getFileContent().getContents(), monitor, shell.getDisplay());
					} catch (IOException e) {
						CMSActivator.err(e);
						return Status.CANCEL_STATUS;
					}
				}
			};
			job.setRule(new RAASSchedulingRule());
			job.schedule();
			try {
				HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage().showView("org.eclipse.ui.views.ProgressView", null, IWorkbenchPage.VIEW_VISIBLE);
			} catch (PartInitException e) {
				CMSActivator.err(e);
			}
		}
		return null;
	}

}
