/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.adapters;

import org.raas4emf.cms.core.IGeometricCenter;
import org.raas4emf.cms.core.geometry.BoundingBoxXYZ;
import org.raas4emf.cms.core.geometry.GeometryAlgorithms;
import org.raas4emf.cms.core.geometry.XYZ;
import org.raas4emf.cms.ui.AdapterFactoryTyped;

import IFC2X3.IfcProduct;
import IFC2X3.IfcSpace;

public class GeometricCenterAdapterFactory extends AdapterFactoryTyped<IfcProduct, IGeometricCenter> {

	@Override
	public IGeometricCenter getAdapterTyped(final IfcProduct ifcProduct, Class<IGeometricCenter> adapterType) {
		return new IGeometricCenter() {

			@Override
			public XYZ getAbsoluteCenter() {
				return GeometryAlgorithms.getAbsoluteCenterOf(ifcProduct);
			}

			@Override
			public BoundingBoxXYZ getBoundingBox() {
				return GeometryAlgorithms.getBoundingBox(ifcProduct);
			}

			@Override
			public boolean isAir() {
				return ifcProduct instanceof IfcSpace;
			}

			@Override
			public XYZ getOpeningDirection() {
				return GeometryAlgorithms.getOpeningDirection(ifcProduct);
			}

		};
	}

}
