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
import IFC2X3.IfcCurveOrEdgeCurve;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Or Edge Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCurveOrEdgeCurve")
@XmlSeeAlso({ IfcBSplineCurveImpl.class, IfcCompositeCurveImpl.class, IfcTrimmedCurveImpl.class, IfcBezierCurveImpl.class, IfcRationalBezierCurveImpl.class, Ifc2DCompositeCurveImpl.class, IfcPolylineImpl.class, IfcBoundedCurveImpl.class, IfcEdgeCurveImpl.class })
@XmlRootElement(name = "IfcCurveOrEdgeCurveElement")
public abstract class IfcCurveOrEdgeCurveImpl extends CDOObjectImpl implements IfcCurveOrEdgeCurve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveOrEdgeCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCurveOrEdgeCurve();
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

} //IfcCurveOrEdgeCurveImpl
