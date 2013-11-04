/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxws.actions;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import au.com.smartservicescrc.raas.codegen.jaxws.wizard.JaxwsWizard;

public class GenerateJAXWSAction implements IObjectActionDelegate {
	private IStructuredSelection selection;

	public GenerateJAXWSAction() {
		super();
	}

	@Override
	public void run(IAction arg0) {
		for (Object element : selection.toArray()) {
			if (element instanceof GenModel) {
				final GenModel genModel = (GenModel) element;
				JaxwsWizard wizard = new JaxwsWizard(genModel);
				wizard.setNeedsProgressMonitor(true);
				WizardDialog dialog = new WizardDialog(Display.getCurrent().getActiveShell(), wizard);
				if (dialog.open() != Window.OK)
					return;

			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection sel) {
		if (sel instanceof IStructuredSelection) {
			selection = (IStructuredSelection) sel;
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}
}
