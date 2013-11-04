/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.DirectoryView;

public class RenameAction extends AbstractHandler {

	public RenameAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		for (CDOObject modelElement : RAASUIUtils.getSelection(event, CDOObject.class)) {
			EObject eParent = modelElement.eContainer();
			if (eParent == null)
				continue;
			Shell shell = HandlerUtil.getActiveShellChecked(event);
			if (!DirectoryView.checkCanWrite(eParent, shell)) {
				return null;
			}
			InputDialog dialog = new InputDialog(shell, "Specify Value", "Enter name for new folder", RAASUtils.getNameOf(modelElement), null);
			if (dialog.open() == Window.OK) {
				String name = dialog.getValue();
				Object sameNamed = RAASUtils.getChildWithName(eParent, name);
				if (sameNamed != null && sameNamed != modelElement) {
					MessageDialog.openError(shell, "Error", "File with this name already exists!");
					return null;
				}
				RAASUtils.setNameOf(modelElement, name);
				RAASUtils.doSave(modelElement, "RenameAction.run(" + name + ")");
			}
		}
		return null;
	}

}
