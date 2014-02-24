/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.DirectoryView;

import raascms.Folder;

public class AddArtifactAction extends AbstractHandler {

	public AddArtifactAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Shell shell = HandlerUtil.getActiveShellChecked(event);
		for (Object element : RAASUIUtils.getSelection(event)) {
			if (element instanceof Folder) {
				final Folder root = (Folder) element;
				execute(root, shell, false, null);
			}
		}
		return null;
	}

	public void execute(final Folder root, final Shell shell, boolean unzipWithoutAsking, final Runnable finalizeAction) {
		if (!DirectoryView.checkCanWrite(root, shell)) {
			return;
		}
		FileDialog fileDialog = new FileDialog(shell, SWT.TITLE | SWT.MULTI);
		// fileDialog.setFilterNames(new String[] { "All Files" });
		// fileDialog.setFilterExtensions(new String[] { "*.*" });
		fileDialog.setText("Upload Files");
		// fileDialog.setFilterIndex(0);
		if (fileDialog.open() == null)
			return;
		final String[] fileNames = fileDialog.getFileNames();
		String desc = "Add file(s)";
		int i = 0;
		for (String f : fileNames) {
			if (!new File(f).exists()) {
				fileNames[i] = f = new File(new File(fileDialog.getFilterPath()), f).toString();
			}
			desc += " " + removeTempFileNamePart(new File(f).getName());
			i++;
		}

		final boolean unzip = fileNames.length == 1 && (fileNames[0].toLowerCase().endsWith(".zip") || fileNames[0].toLowerCase().endsWith(".kmz")) && (unzipWithoutAsking || MessageDialog.openQuestion(shell, "Unzipping Contents", "Do you want to unzip the zipped file instead of uploading it?"));

		Job job = new Job(desc) {
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					long started = new Date().getTime();
					for (String f : fileNames) {
						String name = removeTempFileNamePart(new File(f).getName());
						if (RAASUtils.getChildWithName(root, name) == null) {
							if (unzip) {
								IStatus status = UnzipAction.runJob(root, new FileInputStream(f), monitor, shell.getDisplay());
								if (!status.isOK())
									return status;
							} else
								RAASUtils.addFile(root, URI.createFileURI(f), name);
							refreshParentLabels(root);
						}
					}
					long ended = new Date().getTime();
					CMSActivator.log("Took " + (ended - started) + "ms to add to model");
					Resource resource = root.eResource();
					increaseSessionTimeout(root);
					final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
					saveOptions.put(CDOResource.OPTION_SAVE_PROGRESS_MONITOR, new SubProgressMonitor(monitor, 100));
					resource.save(saveOptions);
					long ended2 = new Date().getTime();
					CMSActivator.log("Took " + (ended2 - ended) + "ms to commit");
					if (finalizeAction != null)
						finalizeAction.run();
				} catch (Exception e) {
					CMSActivator.err(e);
					return new Status(IStatus.ERROR, CMSActivator.PLUGIN_ID, e.getMessage(), e);
				}
				return Status.OK_STATUS;
			}

		};
		job.schedule();
	}

	private String removeTempFileNamePart(String filename) {
		return filename;
	}

	public static void refreshParentLabels(EObject eParent) {
		while (eParent != null) {
			final EObject feParent = eParent;
			eParent.eNotify(new NotificationImpl(Notification.SET, null, null) {
				@Override
				public Object getNotifier() {
					return feParent;
				}

			});
			eParent = eParent.eContainer();
		}
	}

	public static void increaseSessionTimeout(final CDOObject root) {
		CDOSession session = root.cdoView().getSession();
		((CDONet4jSession.Options) session.options()).setCommitTimeout(10 * 60);
	}
}
