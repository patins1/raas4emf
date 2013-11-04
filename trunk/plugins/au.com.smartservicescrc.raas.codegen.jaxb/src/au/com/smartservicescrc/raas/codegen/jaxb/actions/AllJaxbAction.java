/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxb.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.Workbench;

public class AllJaxbAction implements IObjectActionDelegate {
	private MultiJaxbAction fCleanUpDelegate;
	private IStructuredSelection selection;

	public AllJaxbAction() {
		super();
		fCleanUpDelegate = new MultiJaxbAction(Workbench.getInstance().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite());
	}

	public void selectionChanged(IStructuredSelection selection) {
		fCleanUpDelegate.selectionChanged(selection);
	}

	@Override
	public void run(IAction arg0) {
		fCleanUpDelegate.run(selection);
	}

	@Override
	public void selectionChanged(IAction action, ISelection sel) {
		if (sel instanceof IStructuredSelection) {
			selection = (IStructuredSelection) sel;
			selectionChanged(selection);
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}
}
