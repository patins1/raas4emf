/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.WorkbenchWindow;
import org.eclipse.ui.internal.WorkbenchWindowConfigurer;
import org.eclipse.ui.internal.layout.ITrimManager;
import org.eclipse.ui.internal.progress.ProgressRegion;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.actions.IsolateAction;
import org.raas4emf.cms.ui.editor.editor.RAASEditorUtil;
import org.raas4emf.cms.ui.views.DirectoryView;
import org.raas4emf.cms.ui.views.FilesView;
import org.raas4emf.cms.ui.views.PreviewView;

import raascms.Artifact;

@SuppressWarnings("restriction")
public class DemoWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public DemoWorkbenchWindowAdvisor(final IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(final IActionBarConfigurer configurer) {
		return new DemoActionBarAdvisor(configurer);
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		String loadPath = org.raas4emf.cms.ui.CMSActivator.getSessionInstance().getParameter("path");
		configurer.setShowCoolBar(loadPath==null);
		configurer.setShowPerspectiveBar(false);
		configurer.setTitle("RAAS CMS");
		configurer.setShellStyle(SWT.TITLE | SWT.MAX | SWT.RESIZE | SWT.NO_TRIM);
		configurer.setShowProgressIndicator(loadPath==null);
		configurer.setShowStatusLine(false); // otherwise editor-save causes internal Eclipse bug
		configurer.setShowMenuBar(false);
	}

	public void postWindowCreate() {
		Shell shell = getWindowConfigurer().getWindow().getShell();
		shell.setMaximized(true);

		Display.getDefault().asyncExec(new Runnable() {
			public void run() {

				final EObject artifact = openArtifact();
				// for (PreviewView view : PreviewView.findView()) {
				// view.setViewState(IWorkbenchPage.STATE_MAXIMIZED);
				// }

				// load into preview view
				if (artifact != null)
					displayIfcModel(artifact, null);
			}

		});

	}

	public void createWindowContents(Shell shell) {
		super.createWindowContents(shell);
		WorkbenchWindow workbenchWindow = ((WorkbenchWindow) ((WorkbenchWindowConfigurer) getWindowConfigurer()).getWindow());
		ProgressRegion progressRegion = workbenchWindow.getProgressRegion();
		if (progressRegion == null)
			return;
		ITrimManager defaultLayout = workbenchWindow.getTrimManager();
		defaultLayout.removeTrim(progressRegion);
		defaultLayout.addTrim(SWT.TOP, progressRegion);
	}

	public static EObject openArtifact() {
		String path = org.raas4emf.cms.ui.CMSActivator.getSessionInstance().getParameter("path");
		if (path == null) {
			return null;
		}
		EObject folder = RAASUtils.findByPath(path.split("/"));
		if (folder == null) {
			MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error", "Could not locate path!");
			return null;
		}
		return folder;
	}

	public static void displayIfcModel(EObject artifact, Runnable attachedOnLoad2) {
		
		if (artifact instanceof Artifact) {
				Artifact artifact2 = (Artifact) artifact;
				try {
					IWorkbenchPage page = RAASEditorUtil.openURIEditor(RAASUtils.getPath(artifact2));
					if (page!=null)
						page.setPartState(page.getActivePartReference(), WorkbenchPage.STATE_MAXIMIZED);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
		}

		if (artifact == null)
			return;
		for (PreviewView view : PreviewView.findView()) {
			view.attachedOnLoad = "";
			view.attachedImmediately = "";
			try {
				// view.attachedOnLoad += PreviewView.toggleSpaceJavaScript(artifact);
				// if (rbacModel.isEnableGoogleMaps()) {
				// view.attachedImmediately += ToggleMapsAction.configureMaps(rbacModel, true, false);
				// }
				if (attachedOnLoad2 != null)
					attachedOnLoad2.run();
				// view.attachedOnLoad += "effectController.panning_mode=true;";
				view.selectionChanged(null, new StructuredSelection(artifact));
				IWorkbenchPage page = view.getViewSite().getPage();
				page.setPartState(page.getActivePartReference(), WorkbenchPage.STATE_MAXIMIZED);
			} finally {
				view.attachedOnLoad = null;
				view.attachedImmediately = null;
			}
		}

		for (FilesView view : IsolateAction.findView(DirectoryView.class, true)) {
			view.selectionChanged(null, new StructuredSelection(artifact));
		}

	}

}
