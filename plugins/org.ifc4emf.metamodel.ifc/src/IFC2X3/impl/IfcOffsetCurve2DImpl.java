/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcCurve;
import IFC2X3.IfcOffsetCurve2D;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Offset Curve2 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcOffsetCurve2DImpl#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOffsetCurve2DImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOffsetCurve2DImpl#getSelfIntersect <em>Self Intersect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcOffsetCurve2D")
@XmlRootElement(name = "IfcOffsetCurve2DElement")
public class IfcOffsetCurve2DImpl extends IfcCurveImpl implements IfcOffsetCurve2D {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOffsetCurve2DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcOffsetCurve2D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getBasisCurve() {
		return (IfcCurve)eGet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve2D_BasisCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisCurve(IfcCurve newBasisCurve) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve2D_BasisCurve(), newBasisCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSelfIntersect() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve2D_SelfIntersect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfIntersect(Boolean newSelfIntersect) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve2D_SelfIntersect(), newSelfIntersect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelfIntersect() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOffsetCurve2D_SelfIntersect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelfIntersect() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve2D_SelfIntersect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDistance() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve2D_Distance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(Double newDistance) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve2D_Distance(), newDistance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistance() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOffsetCurve2D_Distance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistance() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve2D_Distance());
	}

} //IfcOffsetCurve2DImpl
