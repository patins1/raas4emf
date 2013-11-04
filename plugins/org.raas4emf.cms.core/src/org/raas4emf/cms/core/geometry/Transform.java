/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core.geometry;

public class Transform {

	XYZ[] matrix = new XYZ[] { new XYZ(1, 0, 0), new XYZ(0, 1, 0), new XYZ(0, 0, 1) };

	public void set_Basis(int idx, XYZ xyz) {
		transpose();
		matrix[idx] = xyz;
		transpose();
	}

	public XYZ get_Basis(int idx) {
		transpose();
		XYZ result = matrix[idx];
		transpose();
		return result;
	}

	private void transpose() {
		matrix = new XYZ[] { new XYZ(matrix[0].X, matrix[1].X, matrix[2].X), new XYZ(matrix[0].Y, matrix[1].Y, matrix[2].Y), new XYZ(matrix[0].Z, matrix[1].Z, matrix[2].Z) };
	}

	public XYZ ofPoint(XYZ point) {
		XYZ result = new XYZ(matrix[0].dotProduct(point), matrix[1].dotProduct(point), matrix[2].dotProduct(point));
		return result;
	}

}
