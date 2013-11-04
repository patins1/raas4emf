/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */

package au.com.smartservicescrc.raas.codegen.jaxws.wizard;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.internal.ui.IJavaHelpContextIds;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

/**
 * Wizard page to create choose a target to generate source code to.
 */
public class TargetWizardPage extends NewTypeWizardPage {
	private final static String PAGE_NAME = "NewInterfaceWizardPage"; //$NON-NLS-1$
	private boolean initial = true;

	/**
	 * Create a new <code>NewInterfaceWizardPage</code>
	 */
	public TargetWizardPage() {
		super(false, PAGE_NAME);
		setTitle("Choose destination");
		setDescription("Specify where to save generated Java files");
	}

	// -------- Initialization ---------
	/**
	 * The wizard owning this page is responsible for calling this method with the current selection. The selection is used to initialize the fields of the wizard page.
	 * 
	 * @param selection
	 *            used to initialize the fields
	 */
	public void init(IStructuredSelection selection) {
		IJavaElement jelem = getInitialJavaElement(selection);
		initContainerPage(jelem);
		initTypePage(jelem);
		doStatusUpdate();
	}

	// ------ validation --------
	private void doStatusUpdate() {
		// all used component status
		IStatus[] status = new IStatus[] { fContainerStatus, isEnclosingTypeSelected() ? fEnclosingTypeStatus : fPackageStatus };
		// the mode severe status will be displayed and the OK button
		// enabled/disabled.
		updateStatus(status);
	}

	/*
	 * @see NewContainerWizardPage#handleFieldChanged
	 */
	protected void handleFieldChanged(String fieldName) {
		super.handleFieldChanged(fieldName);
		doStatusUpdate();
	}

	// ------ UI --------
	/*
	 * @see WizardPage#createControl
	 */
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());
		int nColumns = 4;
		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);
		createContainerControls(composite, nColumns);
		createPackageControls(composite, nColumns);
		setControl(composite);
		Dialog.applyDialogFont(composite);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(composite, IJavaHelpContextIds.NEW_INTERFACE_WIZARD_PAGE);
		fContainerStatus = containerChanged();
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (initial) {
			setPageComplete(false);
			initial = false;
		}
	}
}
