/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.graf;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.ui.RAASUIUtils;

public class SetStartingPointAction extends AbstractHandler {

	public SetStartingPointAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		GrafUtil.getDefaultFactory().setStartPoints(RAASUIUtils.getSelection(event, EObject.class));
		GrafUtil.drawLines(HandlerUtil.getActiveShell(event));
		return null;
	}
}
