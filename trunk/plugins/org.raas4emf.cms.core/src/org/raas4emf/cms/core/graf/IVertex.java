/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core.graf;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

public interface IVertex {

	Collection<IEdge> getEdges();

	double getCost();

	String getName();

	EObject getUserObject();
}
