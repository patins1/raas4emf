/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core.geometry;

public class XYZ {

	public static final XYZ BasisX = new XYZ(1, 0, 0);
	public static final XYZ BasisZ = new XYZ(0, 0, 1);
	public static final XYZ Zero = new XYZ(0, 0, 0);
	public final double X;
	public final double Y;
	public final double Z;

	public XYZ(double X, double Y, double Z) {
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}

	public XYZ add(XYZ location) {
		return new XYZ(X + location.X, Y + location.Y, Z + location.Z);
	}

	public double dotProduct(XYZ location) {
		return X * location.X + Y * location.Y + Z * location.Z;
	}

	public XYZ multiply(double scalar) {
		return new XYZ(X * scalar, Y * scalar, Z * scalar);
	}

	public XYZ normalize() {
		double length = Math.sqrt(X * X + Y * Y + Z * Z);
		return new XYZ(X / length, Y / length, Z / length);
	}

	@Override
	public String toString() {
		return "[" + X + ", " + Y + ", " + Z + "]";
	}

	public double getLength() {
		return Math.sqrt(X * X + Y * Y + Z * Z);
	}

	public XYZ subtract(XYZ point) {
		return new XYZ(X - point.X, Y - point.Y, Z - point.Z);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(X);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		XYZ other = (XYZ) obj;
		if (Double.doubleToLongBits(X) != Double.doubleToLongBits(other.X))
			return false;
		if (Double.doubleToLongBits(Y) != Double.doubleToLongBits(other.Y))
			return false;
		if (Double.doubleToLongBits(Z) != Double.doubleToLongBits(other.Z))
			return false;
		return true;
	}

	public String toMeters() {
		return X / 1000 + "," + Y / 1000 + "," + Z / 1000 + ",";
	}

	public String toMillimeters() {
		return Math.round(X) + "," + Math.round(Y) + "," + Math.round(Z) + ",";
	}

	public double distanceTo(XYZ v) {
		return this.subtract(v).getLength();
	}
}
