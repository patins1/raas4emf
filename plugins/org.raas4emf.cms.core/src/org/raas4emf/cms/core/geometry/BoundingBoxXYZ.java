/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core.geometry;

public class BoundingBoxXYZ {

	private double minZ = Integer.MAX_VALUE;
	private double maxZ = Integer.MIN_VALUE;
	private double minY = Integer.MAX_VALUE;
	private double maxY = Integer.MIN_VALUE;
	private double minX = Integer.MAX_VALUE;
	private double maxX = Integer.MIN_VALUE;

	public XYZ getCenter() {
		if (!isDefined())
			return XYZ.Zero;
		return new XYZ((minX + maxX) / 2, (minY + maxY) / 2, (minZ + maxZ) / 2);
	}

	public XYZ getTopCenter() {
		if (!isDefined())
			return XYZ.Zero;
		return new XYZ((minX + maxX) / 2, (minY + maxY) / 2, maxZ);
	}

	public XYZ getBottomCenter() {
		if (!isDefined())
			return XYZ.Zero;
		return new XYZ((minX + maxX) / 2, (minY + maxY) / 2, minZ);
	}

	public XYZ getMax() {
		if (!isDefined())
			return XYZ.Zero;
		return new XYZ(maxX, maxY, maxZ);
	}

	public XYZ getMin() {
		if (!isDefined())
			return XYZ.Zero;
		return new XYZ(minX, minY, minZ);
	}

	public void doMinMax(XYZ point) {
		minZ = Math.min(minZ, point.Z);
		maxZ = Math.max(maxZ, point.Z);
		minY = Math.min(minY, point.Y);
		maxY = Math.max(maxY, point.Y);
		minX = Math.min(minX, point.X);
		maxX = Math.max(maxX, point.X);
	}

	boolean isDefined() {
		return maxX >= minX;
	}

	public void merge(BoundingBoxXYZ boundingBox) {
		doMinMax(boundingBox.getMin());
		doMinMax(boundingBox.getMax());
	}

	public boolean contains(XYZ xyz) {
		return minX <= xyz.X && minY <= xyz.Y && minZ <= xyz.Z && maxX >= xyz.X && maxY >= xyz.Y && maxZ >= xyz.Z;
	}

}
