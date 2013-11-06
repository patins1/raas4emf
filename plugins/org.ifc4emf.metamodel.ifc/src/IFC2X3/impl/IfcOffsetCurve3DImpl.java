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
import IFC2X3.IfcDirection;
import IFC2X3.IfcOffsetCurve3D;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Offset Curve3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcOffsetCurve3DImpl#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOffsetCurve3DImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOffsetCurve3DImpl#getSelfIntersect <em>Self Intersect</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOffsetCurve3DImpl#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcOffsetCurve3D")
@XmlRootElement(name = "IfcOffsetCurve3DElement")
public class IfcOffsetCurve3DImpl extends IfcCurveImpl implements IfcOffsetCurve3D {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOffsetCurve3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getBasisCurve() {
		return (IfcCurve)eGet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D_BasisCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisCurve(IfcCurve newBasisCurve) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D_BasisCurve(), newBasisCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getRefDirection() {
		return (IfcDirection)eGet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D_RefDirection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefDirection(IfcDirection newRefDirection) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D_RefDirection(), newRefDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSelfIntersect() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D_SelfIntersect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfIntersect(Boolean newSelfIntersect) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D_SelfIntersect(), newSelfIntersect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelfIntersect() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D_SelfIntersect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelfIntersect() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D_SelfIntersect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDistance() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D_Distance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(Double newDistance) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D_Distance(), newDistance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistance() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D_Distance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistance() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOffsetCurve3D_Distance());
	}

} //IfcOffsetCurve3DImpl
