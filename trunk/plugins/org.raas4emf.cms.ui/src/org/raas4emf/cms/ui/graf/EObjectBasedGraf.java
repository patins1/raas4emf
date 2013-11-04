/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.graf;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.raas4emf.cms.core.geometry.XYZ;
import org.raas4emf.cms.core.graf.IVertex;

public class EObjectBasedGraf extends BaseGrafFactory {

	@Override
	public Set<IVertex> getVerticesFrom(Collection<? extends EObject> objects) {
		Set<IVertex> result = new HashSet<IVertex>();
		for (EObject v : objects) {
			result.add(new EObjectAsVertex(v));
		}
		return result;
	}

	@Override
	public boolean hasMaxCostGoal() {
		return true;
	}

	@Override
	public boolean hasTotalCostGoal() {
		return false;
	}

	@Override
	public void startPointMoved(XYZ startPoint, XYZ endPoint, Collection<? extends EObject> newEndPoints) {
		// TODO Auto-generated method stub
	}

}
