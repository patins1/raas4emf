/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.io.File;
import java.io.FileInputStream;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;
import org.raas4emf.cms.core.RAASSchedulingRule;
import org.raas4emf.cms.core.RAASSessionSingleton;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;

import raascms.Folder;

public class ZipAction extends AbstractHandler {

	public static final String TEMP_SEPARATOR = "_";
	private Shell shell;
	private List<EObject> selection;
	private Folder commonFolder;
	private String zipFileName;
	private int level;
	private RAASSessionSingleton sessionInstance;

	public ZipAction() {
		super();
	}

	protected IStatus runJob(final IProgressMonitor monitor, boolean download, String name) {
		List<Status> stati = new ArrayList<Status>();
		monitor.beginTask("Compression " + name, -1);
		ZipUtility zip = new ZipUtility(monitor, sessionInstance);
		try {
			final File file = File.createTempFile(name + TEMP_SEPARATOR, ".zip");
			CMSActivator.log("Zipping at " + file);
			zip.zip(selection, file, level);
			stati.addAll(zip.getStati());
			monitor.done();
			if (!monitor.isCanceled()) {
				if (download) {
					shell.getDisplay().asyncExec(new Runnable() {
						public void run() {
							CMSActivator.getSessionInstance().exportFolderContents(file);
						}
					});
				} else {
					monitor.subTask("Add zip file to folder");
					RAASUtils.increaseSessionTimeout(commonFolder);
					RAASUtils.addFile(commonFolder, null, name, new FileInputStream(file));
					RAASUtils.doSaveAsSubTask(commonFolder, "Save zip to database", new SubProgressMonitor(monitor, 100));
				}
			}
		} catch (Exception e) {
			CMSActivator.err(e);
			monitor.done();
			stati.add(new Status(Status.ERROR, CMSActivator.PLUGIN_ID, "Failed to zip contents", e));
		}
		if (monitor.isCanceled())
			return Status.CANCEL_STATUS;
		if (!stati.isEmpty()) {
			final MultiStatus multiStatus = new MultiStatus(CMSActivator.PLUGIN_ID, IStatus.ERROR, stati.toArray(new Status[] {}), "Operation failed", new Exception("Errors occured while zipping folder contents!"));
			shell.getDisplay().asyncExec(new Runnable() {
				public void run() {
					StatusManager.getManager().handle(multiStatus, StatusManager.SHOW);
				}
			});
			return Status.CANCEL_STATUS;
		}
		return Status.OK_STATUS;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		execute(HandlerUtil.getActiveWorkbenchWindowChecked(event), RAASUIUtils.getSelection(event, EObject.class));
		return null;
	}

	public void execute(IWorkbenchWindow window, List<EObject> selection) throws ExecutionException {
		this.selection = selection;
		shell = window.getShell();
		sessionInstance = CMSActivator.getSessionInstance();
		commonFolder = (Folder) selection.get(0).eContainer();

		final DownloadOrAddFile dialog = new DownloadOrAddFile(shell, "Add to archive", "Archive:", (selection.size() == 1 ? RAASUtils.getNameOf(selection.get(0)) : commonFolder.getName()) + ".zip", commonFolder);
		final int returnCode = dialog.open();
		if (returnCode == Window.CANCEL) {
			return;
		}
		zipFileName = dialog.getFileName();

		ComboInputDialog dialogLevel = new ComboInputDialog(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }, shell, "Compression Level", "Choose compression level:", "3", null);
		if (dialogLevel.open() != Window.OK)
			return;
		level = Integer.parseInt(dialogLevel.getValue());

		Job job = new Job("Zipping") {
			public IStatus run(IProgressMonitor monitor) {
				return runJob(monitor, returnCode == Window.OK, zipFileName);
			}
		};
		job.setRule(new RAASSchedulingRule());
		job.schedule();
		try {
			window.getActivePage().showView("org.eclipse.ui.views.ProgressView", null, IWorkbenchPage.VIEW_VISIBLE);
		} catch (PartInitException e) {
			CMSActivator.err(e);
		}
	}
}
