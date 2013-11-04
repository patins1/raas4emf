/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.editor.editor.RAASEditorUtil;

import raascms.Artifact;
import raascms.Folder;

public class EditAction extends AbstractHandler {

	public EditAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		for (Object element : RAASUIUtils.getSelection(event)) {
			if (element instanceof CDOObject) {
				CDOObject modelElement = (CDOObject) element;
				openEditor(modelElement);
			}
		}
		return null;
	}

	public static void openEditor(CDOObject originalModelElement) {
		openEditor(originalModelElement, originalModelElement);
	}

	public static void openEditor(CDOObject modelElement, CDOObject originalModelElement) {
		openEditor(modelElement, originalModelElement, modelElement == originalModelElement);
	}

	public static void openEditor(CDOObject modelElement, CDOObject originalModelElement, boolean persistent) {
		openEditor(modelElement, originalModelElement, persistent, true);
	}

	public static void openEditor(CDOObject modelElement, CDOObject originalModelElement, boolean persistent, boolean activate) {
		CDOView view = null;
		String resourcePath;
		CDOResource res = modelElement.cdoResource();
		if (res != null) {
			view = res.cdoView();
			resourcePath = RAASUIUtils.getPath(modelElement);
		} else {
			resourcePath = RAASUIUtils.getPath(originalModelElement);
		}
		RAASEditorUtil.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), view, resourcePath, modelElement, persistent, activate);
	}

	public static void openEditor(ISelection sel) {
		if (sel instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) sel;
			for (Object ele : selection.toList()) {
				if (ele instanceof Folder) {
					Folder folder = (Folder) ele;
					ele = RAASUtils.getPropertiesFile(folder);
				}
				if (ele instanceof Artifact) {
					Artifact artifact = (Artifact) ele;
					openEditor(RAASUtils.getPropertiesFileCopy(artifact), artifact, !(RAASUtils.hasExtension(artifact, ".psd") || RAASUtils.hasExtension(artifact, ".xls")));
				} else if (ele instanceof CDOObject) {
					CDOObject cdoObject = (CDOObject) ele;
					openEditor(cdoObject);
				}
			}
		}
	}

}
