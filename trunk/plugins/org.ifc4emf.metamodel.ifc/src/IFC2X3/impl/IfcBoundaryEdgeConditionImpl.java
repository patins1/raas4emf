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
import IFC2X3.IfcBoundaryEdgeCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Edge Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBoundaryEdgeCondition")
@XmlRootElement(name = "IfcBoundaryEdgeConditionElement")
public class IfcBoundaryEdgeConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryEdgeCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryEdgeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalStiffnessByLengthZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthZ(Double newRotationalStiffnessByLengthZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ(), newRotationalStiffnessByLengthZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessByLengthZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessByLengthZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalStiffnessByLengthY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthY(Double newRotationalStiffnessByLengthY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY(), newRotationalStiffnessByLengthY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessByLengthY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessByLengthY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalStiffnessByLengthX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthX(Double newRotationalStiffnessByLengthX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX(), newRotationalStiffnessByLengthX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessByLengthX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessByLengthX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessByLengthZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthZ(Double newLinearStiffnessByLengthZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ(), newLinearStiffnessByLengthZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByLengthZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByLengthZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessByLengthY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthY(Double newLinearStiffnessByLengthY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY(), newLinearStiffnessByLengthY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByLengthY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByLengthY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessByLengthX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthX(Double newLinearStiffnessByLengthX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX(), newLinearStiffnessByLengthX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByLengthX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByLengthX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX());
	}

} //IfcBoundaryEdgeConditionImpl
