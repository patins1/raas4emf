/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.CMSActivator;

import raascms.Artifact;
import raascms.Folder;

public class BuildModelAction extends AbstractHandler {

	public BuildModelAction() {
		super();
	}

	List<Status> stati = new ArrayList<Status>();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Shell shell = HandlerUtil.getActiveShellChecked(event);
		final List<EObject> selection = RAASUIUtils.getSelection(event, EObject.class);

		Job job = new Job("Build model(s)") {

			protected IStatus run(final IProgressMonitor monitor) {
				for (EObject element : selection) {
					process(monitor, element);
				}
				if (!selection.isEmpty())
					RAASUtils.doSave((CDOObject) selection.get(0), "Save model");
				if (!stati.isEmpty()) {
					final MultiStatus multiStatus = new MultiStatus(CMSActivator.PLUGIN_ID, IStatus.ERROR, stati.toArray(new Status[] {}), "Operation failed", new Exception("Errors occured while building models!"));
					shell.getDisplay().asyncExec(new Runnable() {
						public void run() {
							StatusManager.getManager().handle(multiStatus, StatusManager.SHOW);
						}
					});
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}

			private void process(final IProgressMonitor monitor, EObject element) {
				if (monitor.isCanceled())
					return;
				if (element instanceof Artifact) {
					Artifact artifact = (Artifact) element;

					long start = System.currentTimeMillis();
					// try {
					// artifact = RAASUtils.assureModelTree(artifact, monitor);
					// // Model model=(Model) artifact.getContents().get(0);
					// } catch (IOException e) {
					// e.printStackTrace();
					// }
					AddArtifactAction.increaseSessionTimeout(artifact);
					buildArtifact(monitor, artifact);
					long end = System.currentTimeMillis();
					System.out.println("Building " + artifact.getName() + " took " + (end - start) + "ms");
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

		};
		job.setRule(new RAASSchedulingRule());
		job.schedule();
		try {
			HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage().showView("org.eclipse.ui.views.ProgressView", null, IWorkbenchPage.VIEW_VISIBLE);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void buildArtifact(final IProgressMonitor monitor, Artifact artifact) {
		if (artifact.getFileContent() != null && !RAASUIUtils.isModelComplete(artifact)) {
			try {
				monitor.subTask("Build " + artifact.getName());
				RAASUtils.generateModel(getResourceSet(), URI.createFileURI("/dev/" + artifact.getName()), artifact, monitor);
			} catch (Exception e) {
				e.printStackTrace();
				stati.add(new Status(IStatus.ERROR, CMSActivator.PLUGIN_ID, "Error while building " + RAASUtils.getPath(artifact), e));
			}
		}
	}

	protected ResourceSetImpl getResourceSet() {
		return new ResourceSetImpl();
	}

}
