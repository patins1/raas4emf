/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.DirectoryView;

import raascms.Folder;
import raascms.RaascmsFactory;

public class AddFolderAction extends AbstractHandler {

	public AddFolderAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		for (Object element : RAASUIUtils.getSelection(event)) {
			if (element instanceof CDOObject) {
				CDOObject modelElement = (CDOObject) element;
				final Shell shell = HandlerUtil.getActiveShell(event);
				if (!DirectoryView.checkCanWrite(modelElement, shell)) {
					return null;
				}
				InputDialog dialog = new InputDialog(shell, "Specify Value", "Enter name for new folder", null, new FilenameInputValidator());
				if (dialog.open() == Window.OK) {
					String name = dialog.getValue();
					if (RAASUtils.getChildWithName(modelElement, name) != null) {
						MessageDialog.openError(shell, "Error", "File with this name already exists!");
						return null;
					}
					Folder folder = RaascmsFactory.eINSTANCE.createFolder();
					folder.setName(name);
					RAASUtils.addToContent(modelElement, folder);
					RAASUtils.doSave(modelElement, "AddFolderAction.run(" + name + ")");
				}
			}
		}
		return null;
	}

}
