/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.PreviewView;

public class LocateAction extends AbstractHandler {

	public LocateAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		for (PreviewView preview : PreviewView.findView()) {
			preview.locate(RAASUIUtils.getSelection(event, EObject.class));
		}
		return null;
	}

}
