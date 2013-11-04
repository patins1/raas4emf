/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.graf;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.raas4emf.cms.core.graf.IGrafFactory;
import org.raas4emf.cms.ui.CMSActivator;

abstract public class BaseGrafFactory implements IGrafFactory {

	@Override
	public void setStartPoints(Collection<? extends EObject> points) {
		CMSActivator.getSessionInstance().setUserObject("_startPoints", points);
	}

	@Override
	public void setEndPoints(Collection<? extends EObject> points) {
		CMSActivator.getSessionInstance().setUserObject("_endPoints", points);
	}

	@Override
	public Collection<EObject> getEndPoints() {
		@SuppressWarnings("unchecked")
		Collection<EObject> _endPoints = (Collection<EObject>) CMSActivator.getSessionInstance().getUserObject("_endPoints");
		if (_endPoints == null)
			_endPoints = new HashSet<EObject>();
		return _endPoints;
	}

	@Override
	public Collection<EObject> getStartPoints() {
		@SuppressWarnings("unchecked")
		Collection<EObject> _startPoints = (Collection<EObject>) CMSActivator.getSessionInstance().getUserObject("_startPoints");
		if (_startPoints == null)
			_startPoints = new HashSet<EObject>();
		return _startPoints;
	}

}
