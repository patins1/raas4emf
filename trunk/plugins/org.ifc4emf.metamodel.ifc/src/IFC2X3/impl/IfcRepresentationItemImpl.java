/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcRepresentationItem;
import IFC2X3.IfcStyledItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Representation Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRepresentationItemImpl#getStyledByItem <em>Styled By Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRepresentationItem")
@XmlSeeAlso({ IfcTwoDirectionRepeatFactorImpl.class, IfcPlanarExtentImpl.class, IfcBoundedSurfaceImpl.class, IfcRightCircularConeImpl.class, IfcFillAreaStyleTilesImpl.class, IfcExtrudedAreaSolidImpl.class, IfcFaceOuterBoundImpl.class, IfcAnnotationOccurrenceImpl.class,
		IfcSectionedSpineImpl.class, IfcCartesianTransformationOperator3DImpl.class, IfcLoopImpl.class, IfcEdgeCurveImpl.class, IfcAnnotationCurveOccurrenceImpl.class, IfcHalfSpaceSolidImpl.class, IfcPolygonalBoundedHalfSpaceImpl.class, IfcVertexLoopImpl.class,
		IfcPlanarBoxImpl.class, IfcConnectedFaceSetImpl.class, IfcConicImpl.class, IfcSubedgeImpl.class, IfcLineImpl.class, IfcMappedItemImpl.class, IfcAxis1PlacementImpl.class, IfcCartesianTransformationOperator3DnonUniformImpl.class, IfcFaceBasedSurfaceModelImpl.class,
		IfcCartesianTransformationOperatorImpl.class, IfcRectangularPyramidImpl.class, IfcGeometricSetImpl.class, IfcShellBasedSurfaceModelImpl.class, IfcSurfaceCurveSweptAreaSolidImpl.class, IfcDefinedSymbolImpl.class, IfcDimensionCurveDirectedCalloutImpl.class,
		IfcPlacementImpl.class, IfcPolyLoopImpl.class, IfcFaceBoundImpl.class, IfcOpenShellImpl.class, IfcLinearDimensionImpl.class, IfcSurfaceOfLinearExtrusionImpl.class, IfcEdgeLoopImpl.class, IfcFillAreaStyleTileSymbolWithStyleImpl.class,
		IfcAnnotationFillAreaOccurrenceImpl.class, IfcBlockImpl.class, IfcCircleImpl.class, IfcDirectionImpl.class, IfcAnnotationSurfaceOccurrenceImpl.class, IfcCurveBoundedPlaneImpl.class, IfcAnnotationSymbolOccurrenceImpl.class, IfcTerminatorSymbolImpl.class,
		IfcOffsetCurve2DImpl.class, IfcEdgeImpl.class, IfcVertexImpl.class, IfcCompositeCurveSegmentImpl.class, IfcBoxedHalfSpaceImpl.class, IfcBooleanClippingResultImpl.class, IfcTextLiteralImpl.class, IfcRationalBezierCurveImpl.class, IfcAngularDimensionImpl.class,
		IfcOffsetCurve3DImpl.class, IfcStructuredDimensionCalloutImpl.class, IfcOrientedEdgeImpl.class, IfcSolidModelImpl.class, IfcStyledItemImpl.class, IfcDiameterDimensionImpl.class, IfcManifoldSolidBrepImpl.class, IfcVectorImpl.class, IfcSweptSurfaceImpl.class,
		IfcCartesianPointImpl.class, IfcSweptAreaSolidImpl.class, IfcCompositeCurveImpl.class, IfcLightSourceGoniometricImpl.class, IfcFillAreaStyleHatchingImpl.class, IfcTrimmedCurveImpl.class, IfcLightSourceSpotImpl.class, IfcBooleanResultImpl.class,
		IfcCartesianTransformationOperator2DImpl.class, IfcCartesianTransformationOperator2DnonUniformImpl.class, IfcFacetedBrepWithVoidsImpl.class, IfcSurfaceImpl.class, IfcClosedShellImpl.class, IfcAnnotationSurfaceImpl.class, IfcDimensionCurveImpl.class, IfcEllipseImpl.class,
		IfcSweptDiskSolidImpl.class, IfcCurveImpl.class, IfcLightSourceAmbientImpl.class, IfcFaceSurfaceImpl.class, IfcBoundingBoxImpl.class, IfcDimensionCurveTerminatorImpl.class, IfcFaceImpl.class, IfcPointOnSurfaceImpl.class, IfcLightSourceImpl.class,
		Ifc2DCompositeCurveImpl.class, IfcCsgSolidImpl.class, IfcCsgPrimitive3DImpl.class, IfcAxis2Placement3DImpl.class, IfcSphereImpl.class, IfcAnnotationFillAreaImpl.class, IfcDraughtingCalloutImpl.class, IfcElementarySurfaceImpl.class, IfcBezierCurveImpl.class,
		IfcOneDirectionRepeatFactorImpl.class, IfcPathImpl.class, IfcPlaneImpl.class, IfcBSplineCurveImpl.class, IfcRectangularTrimmedSurfaceImpl.class, IfcPointImpl.class, IfcRevolvedAreaSolidImpl.class, IfcVertexPointImpl.class, IfcProjectionCurveImpl.class,
		IfcTopologicalRepresentationItemImpl.class, IfcAnnotationTextOccurrenceImpl.class, IfcFacetedBrepImpl.class, IfcGeometricCurveSetImpl.class, IfcRightCircularCylinderImpl.class, IfcLightSourcePositionalImpl.class, IfcLightSourceDirectionalImpl.class,
		IfcGeometricRepresentationItemImpl.class, IfcPointOnCurveImpl.class, IfcAxis2Placement2DImpl.class, IfcSurfaceOfRevolutionImpl.class, IfcTextLiteralWithExtentImpl.class, IfcPolylineImpl.class, IfcBoundedCurveImpl.class, IfcRadiusDimensionImpl.class })
@XmlRootElement(name = "IfcRepresentationItemElement")
public class IfcRepresentationItemImpl extends IfcLayeredItemImpl implements IfcRepresentationItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRepresentationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRepresentationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlTransient
	public IfcStyledItem getStyledByItem() {
		return (IfcStyledItem)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentationItem_StyledByItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyledByItem(IfcStyledItem newStyledByItem) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRepresentationItem_StyledByItem(), newStyledByItem);
	}

} //IfcRepresentationItemImpl
