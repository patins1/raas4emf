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
import IFC2X3.IfcStructuralLoadSingleForce;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Single Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleForceImpl#getForceX <em>Force X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleForceImpl#getForceY <em>Force Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleForceImpl#getForceZ <em>Force Z</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleForceImpl#getMomentX <em>Moment X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleForceImpl#getMomentY <em>Moment Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleForceImpl#getMomentZ <em>Moment Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralLoadSingleForce")
@XmlSeeAlso({ IfcStructuralLoadSingleForceWarpingImpl.class })
@XmlRootElement(name = "IfcStructuralLoadSingleForceElement")
public class IfcStructuralLoadSingleForceImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadSingleForce {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadSingleForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMomentZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentZ(Double newMomentZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentZ(), newMomentZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMomentY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentY(Double newMomentY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentY(), newMomentY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMomentX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentX(Double newMomentX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentX(), newMomentX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getForceZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceZ(Double newForceZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceZ(), newForceZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getForceY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceY(Double newForceY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceY(), newForceY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getForceX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceX(Double newForceX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceX(), newForceX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceX());
	}

} //IfcStructuralLoadSingleForceImpl
