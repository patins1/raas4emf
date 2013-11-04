/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.raas4emf.cms.core.RAASUtils;

import raascms.Folder;

public class DownloadOrAddFile extends InputDialog {

	private String fileName;
	private Folder targetFolder;

	public DownloadOrAddFile(Shell shell, String dialogTitle, String dialogMessage, String initialValue, final Folder targetFolder) {
		super(shell, dialogTitle, dialogMessage, initialValue, new FilenameInputValidator() {

			@Override
			public String isValid(String newText) {
				String result = super.isValid(newText);
				if (result != null) {
					return result;
				}
				if (RAASUtils.getNamesOfChildren(targetFolder).contains(newText)) {
					return "An artifact with name \"" + newText + "\" already exists in folder \"" + targetFolder.getName() + "\"!";
				}
				return null;
			}

		});
		this.targetFolder = targetFolder;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		((GridLayout) parent.getLayout()).makeColumnsEqualWidth = false;
		createButton(parent, IDialogConstants.OK_ID, "Download", true);
		createButton(parent, IDialogConstants.YES_ID, "Add to folder \"" + targetFolder.getName() + "\"", false);
		createButton(parent, IDialogConstants.CANCEL_ID, "Cancel", false);
		getText().setFocus();
		if (getValue() != null) {
			getText().setText(getValue());
			getText().selectAll();
		}
	}

	@Override
	public void setErrorMessage(String errorMessage) {
		super.setErrorMessage(errorMessage);
		Control okButton = getButton(IDialogConstants.OK_ID);
		Control yesButton = getButton(IDialogConstants.YES_ID);
		if (okButton != null && yesButton != null) {
			yesButton.setEnabled(okButton.isEnabled());
		}
	}

	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID || buttonId == IDialogConstants.YES_ID) {
			fileName = getText().getText();
		}
		if (buttonId == IDialogConstants.YES_ID) {
			setReturnCode(IDialogConstants.YES_ID);
			close();
			return;
		}
		super.buttonPressed(buttonId);
	}

	public String getFileName() {
		return fileName;
	}

}
