/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.util.Arrays;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.DirectoryView;
import org.raas4emf.cms.ui.views.PreviewView;

import IFC2X3.IfcBuildingStorey;
import IFC2X3.IfcRoot;

public class IsolateStoreyAction extends AbstractHandler {

	public IsolateStoreyAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Object object = RAASUIUtils.getSelection(event, IfcRoot.class).toArray()[0];
		while (object != null) {
			if (object instanceof IfcBuildingStorey) {
				IfcBuildingStorey ifcBuildingStorey = (IfcBuildingStorey) object;
				for (PreviewView preview : PreviewView.findView()) {
					preview.isolate(Arrays.asList(ifcBuildingStorey));
				}
				return null;
			}
			object = DirectoryView.getAssertedContainer(object);
		}
		return null;
	}

}
