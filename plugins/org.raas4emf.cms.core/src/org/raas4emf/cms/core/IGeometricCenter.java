/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core;

import org.raas4emf.cms.core.geometry.BoundingBoxXYZ;
import org.raas4emf.cms.core.geometry.XYZ;

public interface IGeometricCenter {

	XYZ getAbsoluteCenter();

	boolean isAir();

	BoundingBoxXYZ getBoundingBox();

	XYZ getOpeningDirection();

}
