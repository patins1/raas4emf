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
import IFC2X3.IfcStructuralLoadLinearForce;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Linear Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadLinearForceImpl#getLinearForceX <em>Linear Force X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadLinearForceImpl#getLinearForceY <em>Linear Force Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadLinearForceImpl#getLinearForceZ <em>Linear Force Z</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentX <em>Linear Moment X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentY <em>Linear Moment Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentZ <em>Linear Moment Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralLoadLinearForce")
@XmlRootElement(name = "IfcStructuralLoadLinearForceElement")
public class IfcStructuralLoadLinearForceImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadLinearForce {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadLinearForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearMomentZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentZ(Double newLinearMomentZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentZ(), newLinearMomentZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearMomentZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearMomentZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearMomentY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentY(Double newLinearMomentY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentY(), newLinearMomentY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearMomentY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearMomentY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearMomentX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentX(Double newLinearMomentX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentX(), newLinearMomentX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearMomentX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearMomentX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearForceZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceZ(Double newLinearForceZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceZ(), newLinearForceZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearForceZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearForceZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearForceY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceY(Double newLinearForceY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceY(), newLinearForceY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearForceY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearForceY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearForceX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceX(Double newLinearForceX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceX(), newLinearForceX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearForceX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearForceX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceX());
	}

} //IfcStructuralLoadLinearForceImpl
