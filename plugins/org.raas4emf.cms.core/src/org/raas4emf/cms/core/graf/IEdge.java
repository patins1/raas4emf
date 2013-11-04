/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core.graf;

import java.util.Collection;

public interface IEdge {

	Collection<IVertex> getVertices();

	double getCost();

	String getName();

	Object getUserObject();
}
