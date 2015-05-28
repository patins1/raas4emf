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
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;
import org.raas4emf.cms.core.GeometryJob;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.PreviewView;

import raascms.Artifact;
import raascms.Folder;

public class BuildWebGLAction extends AbstractHandler {

	public BuildWebGLAction() {
		super();
	}

	private Shell shell;
	private List<Artifact> candWebGL;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		shell = HandlerUtil.getActiveShellChecked(event);
		final List<EObject> selection = RAASUIUtils.getSelection(event, EObject.class);

		candWebGL = new ArrayList<Artifact>();
		for (EObject element : selection) {
			process(new NullProgressMonitor(), element);
		}

		try {
			HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage().showView("org.eclipse.ui.views.ProgressView", null, IWorkbenchPage.VIEW_VISIBLE);
		} catch (PartInitException e) {
			CMSActivator.err(e);
		}
		buildArtifact();
		return null;
	}

	private void process(final IProgressMonitor monitor, EObject element) {
		if (monitor.isCanceled())
			return;
		if (element instanceof Folder) {
			Folder folder = (Folder) element;
			PreviewView.collectGeometryModels(candWebGL, folder);
			for (Folder subfolder : folder.getFolders()) {
				process(monitor, subfolder);
			}
		}
	}

	protected void buildArtifact() {
		for (Artifact artifact : candWebGL) {
			Job job = new GeometryJob(artifact) {
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
					if (status.getSeverity() == IStatus.OK && !isInDB) {
						Folder folder=(Folder) artifact.eContainer();
						if (RAASUtils.getNamedChild(folder, sceneName)==null) {
							try {
								InputStream is = artifact.asFile(sceneName, monitor);
								RAASUtils.addFile(folder, null, sceneName, is);
								RAASUtils.doSaveAsSubTask(folder, "Save WebGL representation", new SubProgressMonitor(monitor, 100));
							} catch (IOException e) {
								e.printStackTrace();
							}
							
						}
					}
					return status;
				}

			};
			job.schedule();
		}
	}

}
