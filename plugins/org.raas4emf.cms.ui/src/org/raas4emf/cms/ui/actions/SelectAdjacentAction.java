/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IViewPart;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.PreviewView;

import IFC2X3.IfcDoor;
import IFC2X3.IfcElement;
import IFC2X3.IfcRelConnectsElements;
import IFC2X3.IfcRelSpaceBoundary;
import IFC2X3.IfcRoot;
import IFC2X3.IfcSpace;

public class SelectAdjacentAction extends AbstractHandler {

	public SelectAdjacentAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		for (IViewPart view : PreviewView.findView()) {
			PreviewView preview = (PreviewView) view;
			Set<Object> newSel = new HashSet<Object>();
			for (Object sel : RAASUIUtils.getSelection(event, IfcRoot.class)) {
				if (sel instanceof IfcDoor) {
					IfcDoor ifcDoor = (IfcDoor) sel;
					for (IfcRelSpaceBoundary b : ifcDoor.getProvidesBoundaries()) {
						IfcSpace re = b.getRelatingSpace();
						newSel.add(re);
					}
				} else if (sel instanceof IfcSpace) {
					IfcSpace ifcSpace = (IfcSpace) sel;
					for (IfcRelSpaceBoundary b : ifcSpace.getBoundedBy()) {
						IfcElement re = b.getRelatedBuildingElement();
						newSel.add(re);
					}
				} else if (sel instanceof IfcElement) {
					IfcElement ifcWall = (IfcElement) sel;
					// newSel.add(sel);
					for (IfcRelConnectsElements r : ifcWall.getConnectedTo()) {
						IfcElement re = r.getRelatedElement();
						newSel.add(re);
					}
					for (IfcRelConnectsElements r : ifcWall.getConnectedFrom()) {
						IfcElement re = r.getRelatingElement();
						newSel.add(re);
					}
				}
			}
			preview.selectionChanged(null, new StructuredSelection(newSel.toArray()));
		}
		return null;
	}

}
