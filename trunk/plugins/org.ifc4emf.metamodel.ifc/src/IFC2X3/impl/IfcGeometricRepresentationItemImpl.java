/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcGeometricRepresentationItem;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Geometric Representation Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcGeometricRepresentationItem")
@XmlSeeAlso({ IfcCartesianPointImpl.class, IfcSweptAreaSolidImpl.class, IfcTwoDirectionRepeatFactorImpl.class, IfcPlanarExtentImpl.class, IfcBoundedSurfaceImpl.class, IfcCompositeCurveImpl.class, IfcFillAreaStyleTilesImpl.class, IfcRightCircularConeImpl.class,
		IfcExtrudedAreaSolidImpl.class, IfcLightSourceGoniometricImpl.class, IfcFillAreaStyleHatchingImpl.class, IfcSectionedSpineImpl.class, IfcCartesianTransformationOperator3DImpl.class, IfcTrimmedCurveImpl.class, IfcCartesianTransformationOperator2DImpl.class,
		IfcBooleanResultImpl.class, IfcLightSourceSpotImpl.class, IfcCartesianTransformationOperator2DnonUniformImpl.class, IfcHalfSpaceSolidImpl.class, IfcPolygonalBoundedHalfSpaceImpl.class, IfcPlanarBoxImpl.class, IfcFacetedBrepWithVoidsImpl.class, IfcConicImpl.class,
		IfcSurfaceImpl.class, IfcAnnotationSurfaceImpl.class, IfcLineImpl.class, IfcEllipseImpl.class, IfcSweptDiskSolidImpl.class, IfcCurveImpl.class, IfcLightSourceAmbientImpl.class, IfcBoundingBoxImpl.class, IfcAxis1PlacementImpl.class,
		IfcCartesianTransformationOperator3DnonUniformImpl.class, IfcFaceBasedSurfaceModelImpl.class, IfcPointOnSurfaceImpl.class, Ifc2DCompositeCurveImpl.class, IfcLightSourceImpl.class, IfcCsgSolidImpl.class, IfcCsgPrimitive3DImpl.class,
		IfcCartesianTransformationOperatorImpl.class, IfcRectangularPyramidImpl.class, IfcAxis2Placement3DImpl.class, IfcGeometricSetImpl.class, IfcSphereImpl.class, IfcShellBasedSurfaceModelImpl.class, IfcAnnotationFillAreaImpl.class, IfcElementarySurfaceImpl.class,
		IfcDraughtingCalloutImpl.class, IfcSurfaceCurveSweptAreaSolidImpl.class, IfcDefinedSymbolImpl.class, IfcDimensionCurveDirectedCalloutImpl.class, IfcPlacementImpl.class, IfcBezierCurveImpl.class, IfcOneDirectionRepeatFactorImpl.class, IfcLinearDimensionImpl.class,
		IfcSurfaceOfLinearExtrusionImpl.class, IfcPlaneImpl.class, IfcBSplineCurveImpl.class, IfcFillAreaStyleTileSymbolWithStyleImpl.class, IfcCircleImpl.class, IfcBlockImpl.class, IfcDirectionImpl.class, IfcRectangularTrimmedSurfaceImpl.class, IfcCurveBoundedPlaneImpl.class,
		IfcPointImpl.class, IfcRevolvedAreaSolidImpl.class, IfcOffsetCurve2DImpl.class, IfcFacetedBrepImpl.class, IfcCompositeCurveSegmentImpl.class, IfcBoxedHalfSpaceImpl.class, IfcGeometricCurveSetImpl.class, IfcRightCircularCylinderImpl.class,
		IfcBooleanClippingResultImpl.class, IfcTextLiteralImpl.class, IfcLightSourcePositionalImpl.class, IfcRationalBezierCurveImpl.class, IfcAngularDimensionImpl.class, IfcLightSourceDirectionalImpl.class, IfcOffsetCurve3DImpl.class, IfcStructuredDimensionCalloutImpl.class,
		IfcSolidModelImpl.class, IfcPointOnCurveImpl.class, IfcAxis2Placement2DImpl.class, IfcSurfaceOfRevolutionImpl.class, IfcTextLiteralWithExtentImpl.class, IfcPolylineImpl.class, IfcBoundedCurveImpl.class, IfcDiameterDimensionImpl.class, IfcRadiusDimensionImpl.class,
		IfcManifoldSolidBrepImpl.class, IfcVectorImpl.class, IfcSweptSurfaceImpl.class })
@XmlRootElement(name = "IfcGeometricRepresentationItemElement")
public class IfcGeometricRepresentationItemImpl extends IfcRepresentationItemImpl implements IfcGeometricRepresentationItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeometricRepresentationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationItem();
	}

} //IfcGeometricRepresentationItemImpl
