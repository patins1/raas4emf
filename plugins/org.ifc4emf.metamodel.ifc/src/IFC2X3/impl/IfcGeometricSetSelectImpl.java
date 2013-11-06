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
import IFC2X3.IfcGeometricSetSelect;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Geometric Set Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcGeometricSetSelect")
@XmlSeeAlso({ IfcCartesianPointImpl.class, IfcBSplineCurveImpl.class, IfcBoundedSurfaceImpl.class, IfcCompositeCurveImpl.class, IfcTrimmedCurveImpl.class, IfcCircleImpl.class, IfcPointImpl.class, IfcRectangularTrimmedSurfaceImpl.class, IfcCurveBoundedPlaneImpl.class,
		IfcOffsetCurve2DImpl.class, IfcConicImpl.class, IfcSurfaceImpl.class, IfcLineImpl.class, IfcEllipseImpl.class, IfcCurveImpl.class, IfcRationalBezierCurveImpl.class, IfcPointOnSurfaceImpl.class, Ifc2DCompositeCurveImpl.class, IfcOffsetCurve3DImpl.class,
		IfcElementarySurfaceImpl.class, IfcPointOnCurveImpl.class, IfcSurfaceOfRevolutionImpl.class, IfcBezierCurveImpl.class, IfcPolylineImpl.class, IfcBoundedCurveImpl.class, IfcSurfaceOfLinearExtrusionImpl.class, IfcPlaneImpl.class, IfcSweptSurfaceImpl.class })
@XmlRootElement(name = "IfcGeometricSetSelectElement")
public abstract class IfcGeometricSetSelectImpl extends CDOObjectImpl implements IfcGeometricSetSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeometricSetSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcGeometricSetSelect();
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

} //IfcGeometricSetSelectImpl
