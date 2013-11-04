/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.cdo.CDOObject;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.RAASUIUtils;

public class SaveAction extends AbstractHandler {

	public SaveAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		for (Object element : RAASUIUtils.getSelection(event)) {
			if (element instanceof CDOObject) {
				CDOObject modelElement = (CDOObject) element;

				RAASUtils.doSave(modelElement, "Save tree editor");
			}
		}
		return null;
	}

}
