/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.io.IOException;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.raas4emf.cms.core.LoggingUtil;
import org.raas4emf.cms.transformation.TransformationUtils;

public class ShowAccessLogAction implements IObjectActionDelegate {

	private IWorkbenchPart targetPart;

	@Override
	public void run(IAction arg0) {
		try {
			MemoDialog.openInformation(targetPart.getSite().getShell(), "Access Log", TransformationUtils.stringFromFile(LoggingUtil.getAccessLogFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection sel) {
		action.setEnabled(true);
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}
}
