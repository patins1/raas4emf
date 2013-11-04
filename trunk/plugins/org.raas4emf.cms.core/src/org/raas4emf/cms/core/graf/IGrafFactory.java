/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core.graf;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.raas4emf.cms.core.geometry.XYZ;

public interface IGrafFactory {

	Set<IVertex> getVerticesFrom(Collection<? extends EObject> objects);

	void setStartPoints(Collection<? extends EObject> points);

	void setEndPoints(Collection<? extends EObject> points);

	Collection<EObject> getEndPoints();

	Collection<EObject> getStartPoints();

	boolean hasTotalCostGoal();

	boolean hasMaxCostGoal();

	void startPointMoved(XYZ startPoint, XYZ endPoint, Collection<? extends EObject> newEndPoints);

}
