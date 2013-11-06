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
import IFC2X3.IfcBoundaryNodeCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Node Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessX <em>Linear Stiffness X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessY <em>Linear Stiffness Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessZ <em>Linear Stiffness Z</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessX <em>Rotational Stiffness X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBoundaryNodeCondition")
@XmlSeeAlso({ IfcBoundaryNodeConditionWarpingImpl.class })
@XmlRootElement(name = "IfcBoundaryNodeConditionElement")
public class IfcBoundaryNodeConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryNodeCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryNodeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalStiffnessZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessZ(Double newRotationalStiffnessZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessZ(), newRotationalStiffnessZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalStiffnessY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessY(Double newRotationalStiffnessY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessY(), newRotationalStiffnessY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalStiffnessX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessX(Double newRotationalStiffnessX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessX(), newRotationalStiffnessX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessZ(Double newLinearStiffnessZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessZ(), newLinearStiffnessZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessY(Double newLinearStiffnessY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessY(), newLinearStiffnessY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessX(Double newLinearStiffnessX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessX(), newLinearStiffnessX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessX());
	}

} //IfcBoundaryNodeConditionImpl
