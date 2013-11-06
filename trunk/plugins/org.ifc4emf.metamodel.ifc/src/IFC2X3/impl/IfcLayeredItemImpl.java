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
import IFC2X3.IfcLayeredItem;
import IFC2X3.IfcPresentationLayerAssignment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Layered Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcLayeredItemImpl#getLayerAssignments <em>Layer Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcLayeredItem")
@XmlSeeAlso({ IfcTwoDirectionRepeatFactorImpl.class, IfcBoundedSurfaceImpl.class, IfcPlanarExtentImpl.class, IfcRightCircularConeImpl.class, IfcFillAreaStyleTilesImpl.class, IfcExtrudedAreaSolidImpl.class, IfcFaceOuterBoundImpl.class, IfcAnnotationOccurrenceImpl.class,
		IfcSectionedSpineImpl.class, IfcCartesianTransformationOperator3DImpl.class, IfcLoopImpl.class, IfcEdgeCurveImpl.class, IfcAnnotationCurveOccurrenceImpl.class, IfcHalfSpaceSolidImpl.class, IfcPolygonalBoundedHalfSpaceImpl.class, IfcVertexLoopImpl.class,
		IfcPlanarBoxImpl.class, IfcConnectedFaceSetImpl.class, IfcConicImpl.class, IfcSubedgeImpl.class, IfcLineImpl.class, IfcMappedItemImpl.class, IfcAxis1PlacementImpl.class, IfcCartesianTransformationOperator3DnonUniformImpl.class, IfcFaceBasedSurfaceModelImpl.class,
		IfcCartesianTransformationOperatorImpl.class, IfcRectangularPyramidImpl.class, IfcGeometricSetImpl.class, IfcShellBasedSurfaceModelImpl.class, IfcSurfaceCurveSweptAreaSolidImpl.class, IfcDefinedSymbolImpl.class, IfcDimensionCurveDirectedCalloutImpl.class,
		IfcPlacementImpl.class, IfcPolyLoopImpl.class, IfcFaceBoundImpl.class, IfcOpenShellImpl.class, IfcLinearDimensionImpl.class, IfcStyledRepresentationImpl.class, IfcSurfaceOfLinearExtrusionImpl.class, IfcEdgeLoopImpl.class, IfcFillAreaStyleTileSymbolWithStyleImpl.class,
		IfcAnnotationFillAreaOccurrenceImpl.class, IfcBlockImpl.class, IfcCircleImpl.class, IfcDirectionImpl.class, IfcAnnotationSurfaceOccurrenceImpl.class, IfcCurveBoundedPlaneImpl.class, IfcAnnotationSymbolOccurrenceImpl.class, IfcTerminatorSymbolImpl.class,
		IfcOffsetCurve2DImpl.class, IfcEdgeImpl.class, IfcVertexImpl.class, IfcCompositeCurveSegmentImpl.class, IfcBoxedHalfSpaceImpl.class, IfcBooleanClippingResultImpl.class, IfcTextLiteralImpl.class, IfcRationalBezierCurveImpl.class, IfcAngularDimensionImpl.class,
		IfcRepresentationItemImpl.class, IfcOffsetCurve3DImpl.class, IfcStructuredDimensionCalloutImpl.class, IfcSolidModelImpl.class, IfcOrientedEdgeImpl.class, IfcStyledItemImpl.class, IfcDiameterDimensionImpl.class, IfcManifoldSolidBrepImpl.class, IfcVectorImpl.class,
		IfcSweptSurfaceImpl.class, IfcCartesianPointImpl.class, IfcSweptAreaSolidImpl.class, IfcShapeModelImpl.class, IfcCompositeCurveImpl.class, IfcLightSourceGoniometricImpl.class, IfcFillAreaStyleHatchingImpl.class, IfcShapeRepresentationImpl.class,
		IfcTrimmedCurveImpl.class, IfcCartesianTransformationOperator2DImpl.class, IfcLightSourceSpotImpl.class, IfcBooleanResultImpl.class, IfcCartesianTransformationOperator2DnonUniformImpl.class, IfcRepresentationImpl.class, IfcFacetedBrepWithVoidsImpl.class,
		IfcSurfaceImpl.class, IfcClosedShellImpl.class, IfcAnnotationSurfaceImpl.class, IfcDimensionCurveImpl.class, IfcEllipseImpl.class, IfcSweptDiskSolidImpl.class, IfcCurveImpl.class, IfcLightSourceAmbientImpl.class, IfcFaceSurfaceImpl.class, IfcBoundingBoxImpl.class,
		IfcDimensionCurveTerminatorImpl.class, IfcFaceImpl.class, IfcPointOnSurfaceImpl.class, IfcLightSourceImpl.class, Ifc2DCompositeCurveImpl.class, IfcCsgSolidImpl.class, IfcCsgPrimitive3DImpl.class, IfcAxis2Placement3DImpl.class, IfcSphereImpl.class,
		IfcAnnotationFillAreaImpl.class, IfcDraughtingCalloutImpl.class, IfcElementarySurfaceImpl.class, IfcBezierCurveImpl.class, IfcOneDirectionRepeatFactorImpl.class, IfcPathImpl.class, IfcPlaneImpl.class, IfcBSplineCurveImpl.class, IfcRectangularTrimmedSurfaceImpl.class,
		IfcPointImpl.class, IfcRevolvedAreaSolidImpl.class, IfcVertexPointImpl.class, IfcProjectionCurveImpl.class, IfcTopologicalRepresentationItemImpl.class, IfcAnnotationTextOccurrenceImpl.class, IfcFacetedBrepImpl.class, IfcGeometricCurveSetImpl.class,
		IfcRightCircularCylinderImpl.class, IfcLightSourcePositionalImpl.class, IfcLightSourceDirectionalImpl.class, IfcGeometricRepresentationItemImpl.class, IfcPointOnCurveImpl.class, IfcTopologyRepresentationImpl.class, IfcAxis2Placement2DImpl.class,
		IfcSurfaceOfRevolutionImpl.class, IfcStyleModelImpl.class, IfcTextLiteralWithExtentImpl.class, IfcPolylineImpl.class, IfcBoundedCurveImpl.class, IfcRadiusDimensionImpl.class })
@XmlRootElement(name = "IfcLayeredItemElement")
public abstract class IfcLayeredItemImpl extends CDOObjectImpl implements IfcLayeredItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLayeredItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcLayeredItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPresentationLayerAssignment> getLayerAssignments() {
		return (EList<IfcPresentationLayerAssignment>)eGet(IFC2X3Package.eINSTANCE.getIfcLayeredItem_LayerAssignments(), true);
	}

} //IfcLayeredItemImpl
