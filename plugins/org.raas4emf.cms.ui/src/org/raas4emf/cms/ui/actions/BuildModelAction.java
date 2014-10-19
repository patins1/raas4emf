/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;
import org.raas4emf.cms.core.ParsingJob;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;

import raascms.Artifact;
import raascms.Folder;

public class BuildModelAction extends AbstractHandler {

	public BuildModelAction() {
		super();
	}

	private Shell shell;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		shell = HandlerUtil.getActiveShellChecked(event);
		final List<EObject> selection = RAASUIUtils.getSelection(event, EObject.class);

		for (EObject element : selection) {
			process(new NullProgressMonitor(), element);
		}

		try {
			HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage().showView("org.eclipse.ui.views.ProgressView", null, IWorkbenchPage.VIEW_VISIBLE);
		} catch (PartInitException e) {
			CMSActivator.err(e);
		}
		return null;
	}

	private void process(final IProgressMonitor monitor, EObject element) {
		if (monitor.isCanceled())
			return;
		if (element instanceof Artifact) {
			Artifact artifact = (Artifact) element;

			buildArtifact(artifact);

		} else if (element instanceof Folder) {
			Folder folder = (Folder) element;
			for (Artifact artifact : folder.getArtifacts()) {
				process(monitor, artifact);
			}
			for (Folder subfolder : folder.getFolders()) {
				process(monitor, subfolder);
			}
		}
	}

	protected void buildArtifact(Artifact artifact) {
		Job job = new ParsingJob(artifact, isTreeMvd(), true) {

			protected IStatus run(final IProgressMonitor monitor) {
				long start = System.currentTimeMillis();
				final IStatus status = super.run(monitor);
				long end = System.currentTimeMillis();
				CMSActivator.log("Building " + artifact.getName() + " took " + (end - start) + "ms");
				if (status.getSeverity() == IStatus.ERROR) {
					shell.getDisplay().asyncExec(new Runnable() {
						public void run() {
							StatusManager.getManager().handle(status, StatusManager.SHOW);
						}
					});
				}
				return status;
			}

		};
		job.schedule();
	}

	protected boolean isTreeMvd() {
		return false;
	}

}
