/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.net.URL;
import java.net.URLConnection;
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
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.DirectoryView;

import raascms.Folder;

public class AddArtifactFromURLAction extends AbstractHandler {

	public AddArtifactFromURLAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		for (Object element : RAASUIUtils.getSelection(event)) {
			if (element instanceof Folder) {
				final Folder root = (Folder) element;
				final Shell shell = HandlerUtil.getActiveShell(event);
				if (!DirectoryView.checkCanWrite(root, shell)) {
					return null;
				}
				InputDialog dialog = new InputDialog(shell, "Add Artifact From URL", "Specify URL of file to upload", null, null);
				if (dialog.open() == Window.OK) {
					final String url = dialog.getValue();

					String desc = "Add file(s)";
					final boolean unzip = url.toLowerCase().endsWith(".zip") && MessageDialog.openQuestion(shell, "Unzipping Contents", "Do you want to unzip the zipped file instead of uploading it as zip file?");

					if (unzip) {
						try {
							HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage().showView("org.eclipse.ui.views.ProgressView", null, IWorkbenchPage.VIEW_ACTIVATE);
						} catch (PartInitException e) {
							CMSActivator.err(e);
						}
					}
					Job job = new Job(desc) {
						protected IStatus run(final IProgressMonitor monitor) {
							try {
								long started = new Date().getTime();
								URL u = new URL(url);
								String name = u.getFile();
								name = name.substring(name.lastIndexOf('/') + 1);
								URLConnection c = u.openConnection();
								if (RAASUtils.getChildWithName(root, name) == null) {
									if (unzip) {
										IStatus status = UnzipAction.runJob(root, c.getInputStream(), monitor, shell.getDisplay());
										if (!status.isOK())
											return status;
									} else
										RAASUtils.addFile(root, null, name, c.getInputStream());
								}
								long ended = new Date().getTime();
								CMSActivator.log("Took " + (ended - started) + "ms to add to model");
								Resource resource = root.eResource();
								AddArtifactAction.increaseSessionTimeout(root);
								final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
								saveOptions.put(CDOResource.OPTION_SAVE_PROGRESS_MONITOR, new SubProgressMonitor(monitor, 100));
								resource.save(saveOptions);
								long ended2 = new Date().getTime();
								CMSActivator.log("Took " + (ended2 - ended) + "ms to commit");
							} catch (Exception e) {
								CMSActivator.err(e);
								return new Status(IStatus.ERROR, CMSActivator.PLUGIN_ID, e.getMessage(), e);
							}
							return Status.OK_STATUS;
						}

					};
					job.schedule();
					try {
						HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage().showView("org.eclipse.ui.views.ProgressView", null, IWorkbenchPage.VIEW_VISIBLE);
					} catch (PartInitException e) {
						CMSActivator.err(e);
					}
				}
			}
		}
		return null;
	}

}
