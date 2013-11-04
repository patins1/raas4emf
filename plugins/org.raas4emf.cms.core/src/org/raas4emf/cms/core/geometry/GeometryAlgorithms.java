/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core.geometry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.EList;
import org.raas4emf.cms.core.RAASUtils;

import IFC2X3.IfcArbitraryClosedProfileDef;
import IFC2X3.IfcAxis2Placement3D;
import IFC2X3.IfcCartesianPoint;
import IFC2X3.IfcCompositeCurve;
import IFC2X3.IfcCompositeCurveSegment;
import IFC2X3.IfcConnectedFaceSet;
import IFC2X3.IfcCurve;
import IFC2X3.IfcDirection;
import IFC2X3.IfcDoor;
import IFC2X3.IfcExtrudedAreaSolid;
import IFC2X3.IfcFace;
import IFC2X3.IfcFaceBasedSurfaceModel;
import IFC2X3.IfcFaceBound;
import IFC2X3.IfcLocalPlacement;
import IFC2X3.IfcManifoldSolidBrep;
import IFC2X3.IfcObjectPlacement;
import IFC2X3.IfcPolyLoop;
import IFC2X3.IfcPolyline;
import IFC2X3.IfcProduct;
import IFC2X3.IfcRectangleProfileDef;
import IFC2X3.IfcRepresentationItem;
import IFC2X3.IfcShell;
import IFC2X3.IfcShellBasedSurfaceModel;
import IFC2X3.util.GeometricAlgorithms;

/**
 * Algorithms to compute absolute coordinates. The algorithms in here are partly a subset of the algorithms in the C# Revit plugin
 * 
 * @author kiegelan
 * 
 */
public class GeometryAlgorithms {

	private static final boolean USE_SIMPLE_MATRIX_CALCULATION = false;
	private static Map<IfcProduct, BoundingBoxXYZ> cacheBoundingBox = new WeakHashMap<IfcProduct, BoundingBoxXYZ>();

	private BoundingBoxXYZ boundingBox = new BoundingBoxXYZ();

	public BoundingBoxXYZ processGeometryParts(Collection<IfcRepresentationItem> foo) {
		for (IfcRepresentationItem item : foo) {
			if (item instanceof IfcFaceBasedSurfaceModel) {
				IfcFaceBasedSurfaceModel ifcFaceBasedSurfaceModel = (IfcFaceBasedSurfaceModel) item;
				for (IfcConnectedFaceSet faceSet : ifcFaceBasedSurfaceModel.getFbsmFaces()) {
					processFace(faceSet);
				}
			} else if (item instanceof IfcShellBasedSurfaceModel) {
				IfcShellBasedSurfaceModel ifcShellBasedSurfaceModel = (IfcShellBasedSurfaceModel) item;
				for (IfcShell shell : ifcShellBasedSurfaceModel.getSbsmBoundary()) {
					IfcConnectedFaceSet shell2 = (IfcConnectedFaceSet) shell;
					processFace(shell2);
				}
			} else if (item instanceof IfcManifoldSolidBrep) {
				IfcManifoldSolidBrep ifcShellBasedSurfaceModel = (IfcManifoldSolidBrep) item;
				IfcShell shell = ifcShellBasedSurfaceModel.getOuter();
				if (shell != null) {
					IfcConnectedFaceSet shell2 = (IfcConnectedFaceSet) shell;
					processFace(shell2);
				}
			} else if (item instanceof IfcExtrudedAreaSolid) {
				IfcExtrudedAreaSolid sld = (IfcExtrudedAreaSolid) item;
				Transform flatten = getTransform(sld.getPosition());

				XYZ location = asXYZ(sld.getPosition().getLocation().getCoordinates());
				XYZ normal = flatten.ofPoint(asXYZo(sld.getExtrudedDirection().getDirectionRatios())).normalize();

				if (sld.getSweptArea() instanceof IfcArbitraryClosedProfileDef) {
					IfcArbitraryClosedProfileDef profile = (IfcArbitraryClosedProfileDef) sld.getSweptArea();
					IfcCurve outerCurve = profile.getOuterCurve();
					examinePolyline(sld, flatten, location, normal, outerCurve);
					if (outerCurve instanceof IfcCompositeCurve) {
						IfcCompositeCurve ifcCompositeCurve = (IfcCompositeCurve) outerCurve;
						for (IfcCompositeCurveSegment segment : ifcCompositeCurve.getSegments()) {
							IfcCurve curve = segment.getParentCurve();
							examinePolyline(sld, flatten, location, normal, curve);
						}
					}
				} else if (sld.getSweptArea() instanceof IfcRectangleProfileDef) {
					IfcRectangleProfileDef rectangleProfile = (IfcRectangleProfileDef) sld.getSweptArea();
					List<XYZ> points = new ArrayList<XYZ>();
					double x = mmToFeet(rectangleProfile.getXDim() / 2);
					double y = mmToFeet(rectangleProfile.getYDim() / 2);
					points.add(new XYZ(x, y, 0));
					points.add(new XYZ(-x, y, 0));
					points.add(new XYZ(-x, -y, 0));
					points.add(new XYZ(x, -y, 0));
					points.add(new XYZ(x, y, 0));
					points = ofPoints(flatten, points);
					CreateExtrusion(normal, location, points, sld.getDepth());
				}
			}
		}
		return boundingBox;
	}

	private void examinePolyline(IfcExtrudedAreaSolid sld, Transform flatten, XYZ location, XYZ normal, IfcCurve outerCurve) {
		if (outerCurve instanceof IfcPolyline) {
			IfcPolyline polyline = (IfcPolyline) outerCurve;
			if (polyline.getPoints().size() >= 1) {
				List<XYZ> points = ofPoints(flatten, asPoints(polyline.getPoints()));
				CreateExtrusion(normal, location, points, sld.getDepth());
			}
		}
	}

	private void CreateExtrusion(XYZ normal, XYZ origin, List<XYZ> points, Double height) {
		height = mmToFeet(height);
		for (XYZ p : points) {
			doMinMax(p.add(origin));
			doMinMax((p.add(origin)).add(normal.multiply(height)));
		}
	}

	private List<XYZ> ofPoints(Transform transform, List<XYZ> list) {
		List<XYZ> result = new ArrayList<XYZ>();
		for (XYZ point : list)
			result.add(transform.ofPoint(point));
		return result;
	}

	private void processFace(IfcConnectedFaceSet faceSet) {
		for (IfcFace face : faceSet.getCfsFaces()) {
			for (IfcFaceBound ifcFaceBound : face.getBounds())
				if (ifcFaceBound.getBound() instanceof IfcPolyLoop) {
					IfcPolyLoop polyline = (IfcPolyLoop) ifcFaceBound.getBound();
					if (polyline != null && polyline.getPolygon().size() >= 2) {
						List<XYZ> points = asPoints(polyline.getPolygon());
						for (XYZ point : points) {
							doMinMax(point);
						}
					}
				}
		}
	}

	private void doMinMax(XYZ point) {
		boundingBox.doMinMax(point);
	}

	public static List<XYZ> asPoints(List<IfcCartesianPoint> pts) {
		List<XYZ> points = new ArrayList<XYZ>();
		for (IfcCartesianPoint ifcCartesianPoint : pts) {
			XYZ xyz;
			if (ifcCartesianPoint.getCoordinates().size() == 3)
				xyz = new XYZ(mmToFeet(ifcCartesianPoint.getCoordinates().get(0)), mmToFeet(ifcCartesianPoint.getCoordinates().get(1)), mmToFeet(ifcCartesianPoint.getCoordinates().get(2)));
			else
				xyz = new XYZ(mmToFeet(ifcCartesianPoint.getCoordinates().get(0)), mmToFeet(ifcCartesianPoint.getCoordinates().get(1)), 0);
			points.add(xyz);
		}
		XYZ first = points.get(0);
		XYZ last = points.get(points.size() - 1);
		if (!(first.X == last.X && first.Y == last.Y && first.Z == last.Z)) {
			points.add(first);
		}
		return points;
	}

	private static double mmToFeet(Double mmVal) {
		return mmVal;
	}

	public static XYZ asXYZo(EList<Double> coords) {
		return new XYZ(coords.get(0), coords.get(1), coords.get(2));
	}

	public static XYZ asXYZ(EList<Double> coords) {
		return new XYZ(coords.get(0), coords.get(1), coords.get(2));
	}

	static public Transform getTransform(IfcAxis2Placement3D placement) {
		if (USE_SIMPLE_MATRIX_CALCULATION) {
			return getSimpleTransform(placement);
		}
		List<IfcDirection> m = GeometricAlgorithms.getP(placement);
		Transform flatten = new Transform();
		flatten.set_Basis(0, GeometryAlgorithms.asXYZ(m.get(0).getDirectionRatios()));
		flatten.set_Basis(1, GeometryAlgorithms.asXYZ(m.get(1).getDirectionRatios()));
		flatten.set_Basis(2, GeometryAlgorithms.asXYZ(m.get(2).getDirectionRatios()));
		return flatten;
	}

	public static Transform getSimpleTransform(IfcAxis2Placement3D placement) {
		XYZ r = XYZ.BasisX;
		if (placement.getRefDirection() != null)
			r = GeometryAlgorithms.asXYZo(placement.getRefDirection().getDirectionRatios());
		XYZ a = XYZ.BasisZ;
		if (placement.getAxis() != null)
			a = GeometryAlgorithms.asXYZo(placement.getAxis().getDirectionRatios());
		Transform flatten = new Transform();
		flatten.set_Basis(0, new XYZ(r.X, r.Y, r.Z));
		flatten.set_Basis(1, new XYZ(a.Y * r.Z - a.Z * r.Y, a.Z * r.X - a.X * r.Z, a.X * r.Y - a.Y * r.X));
		flatten.set_Basis(2, new XYZ(a.X, a.Y, a.Z));
		return flatten;
	}

	public static XYZ getAbsolutePosition(XYZ point, IfcObjectPlacement objectPlacement) {
		if (objectPlacement instanceof IfcLocalPlacement) {
			IfcLocalPlacement ifcLocalPlacement = (IfcLocalPlacement) objectPlacement;
			if (ifcLocalPlacement.getRelativePlacement() instanceof IfcAxis2Placement3D) {
				IfcAxis2Placement3D placement = (IfcAxis2Placement3D) ifcLocalPlacement.getRelativePlacement();
				Transform flatten = GeometryAlgorithms.getTransform(placement);
				point = flatten.ofPoint(point);
				XYZ location = GeometryAlgorithms.asXYZ(placement.getLocation().getCoordinates());
				point = point.add(location);
				return getAbsolutePosition(point, ifcLocalPlacement.getPlacementRelTo());
			}
		}
		return point;
	}

	public static XYZ getAbsoluteCenterOf(IfcProduct ifcElement) {
		return getBoundingBox(ifcElement).getCenter();
	}

	public static XYZ getAbsoluteTopCenterOf(IfcProduct ifcElement) {
		return getBoundingBox(ifcElement).getTopCenter();
	}

	public static XYZ getAbsoluteBottomCenterOf(IfcProduct ifcElement) {
		return getBoundingBox(ifcElement).getBottomCenter();
	}

	public static XYZ getAbsoluteCenterOf(Collection<IfcProduct> ifcElements) {
		BoundingBoxXYZ result = new BoundingBoxXYZ();
		for (IfcProduct ifcElement : ifcElements) {
			result.merge(getBoundingBox(ifcElement));
		}
		return result.getCenter();
	}

	public static BoundingBoxXYZ getBoundingBox(IfcProduct ifcElement) {
		return getBoundingBox(ifcElement, false);
	}

	public static BoundingBoxXYZ getBoundingBox(IfcProduct ifcElement, boolean relativeToLocalCoordinateSystem) {
		BoundingBoxXYZ result = cacheBoundingBox.get(ifcElement);
		if (!relativeToLocalCoordinateSystem && result != null)
			return result;
		Collection<IfcRepresentationItem> foo = new ArrayList<IfcRepresentationItem>();
		RAASUtils.examine(ifcElement, foo);
		GeometryAlgorithms algos = new GeometryAlgorithms();
		BoundingBoxXYZ box = algos.processGeometryParts(foo);
		if (relativeToLocalCoordinateSystem) {
			result = box;
		} else {
			List<XYZ> points = new ArrayList<XYZ>();
			XYZ min = box.getMin();
			XYZ max = box.getMax();
			points.add(getAbsolutePosition(new XYZ(min.X, min.Y, min.Z), ifcElement.getObjectPlacement()));
			points.add(getAbsolutePosition(new XYZ(max.X, min.Y, min.Z), ifcElement.getObjectPlacement()));
			points.add(getAbsolutePosition(new XYZ(max.X, max.Y, min.Z), ifcElement.getObjectPlacement()));
			points.add(getAbsolutePosition(new XYZ(min.X, max.Y, min.Z), ifcElement.getObjectPlacement()));
			points.add(getAbsolutePosition(new XYZ(min.X, min.Y, max.Z), ifcElement.getObjectPlacement()));
			points.add(getAbsolutePosition(new XYZ(max.X, min.Y, max.Z), ifcElement.getObjectPlacement()));
			points.add(getAbsolutePosition(new XYZ(max.X, max.Y, max.Z), ifcElement.getObjectPlacement()));
			points.add(getAbsolutePosition(new XYZ(min.X, max.Y, max.Z), ifcElement.getObjectPlacement()));
			result = getBoundingBox(points);
		}
		if (!relativeToLocalCoordinateSystem)
			cacheBoundingBox.put(ifcElement, result);
		return result;
	}

	public static BoundingBoxXYZ getBoundingBox(List<XYZ> points) {
		BoundingBoxXYZ result = new BoundingBoxXYZ();
		for (XYZ xyz : points)
			result.doMinMax(xyz);
		return result;
	}

	public static XYZ getOpeningDirection(IfcProduct ifcProduct) {
		if (ifcProduct instanceof IfcDoor) {
			IfcDoor ifcDoor = (IfcDoor) ifcProduct;
			// IfcRelFillsElement fillsRel = ifcDoor.getFillsVoids();
			// if (fillsRel == null)
			// return null;
			// IfcOpeningElement opening = fillsRel.getRelatingOpeningElement();
			// if (opening == null)
			// return null;
			XYZ origin = getAbsolutePosition(new XYZ(0, 0, 0), ifcDoor.getObjectPlacement());
			XYZ openPoint = getAbsolutePosition(new XYZ(0, 1, 0), ifcDoor.getObjectPlacement());
			return openPoint.subtract(origin).normalize();
		}
		return null;
	}

}
