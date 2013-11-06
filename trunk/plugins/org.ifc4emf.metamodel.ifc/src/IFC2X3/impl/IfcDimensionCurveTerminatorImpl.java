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
import IFC2X3.IfcDimensionCurveTerminator;
import IFC2X3.IfcDimensionExtentUsage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Dimension Curve Terminator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDimensionCurveTerminatorImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDimensionCurveTerminator")
@XmlRootElement(name = "IfcDimensionCurveTerminatorElement")
public class IfcDimensionCurveTerminatorImpl extends IfcTerminatorSymbolImpl implements IfcDimensionCurveTerminator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDimensionCurveTerminatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDimensionCurveTerminator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionExtentUsage getRole() {
		return (IfcDimensionExtentUsage)eGet(IFC2X3Package.eINSTANCE.getIfcDimensionCurveTerminator_Role(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(IfcDimensionExtentUsage newRole) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDimensionCurveTerminator_Role(), newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRole() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDimensionCurveTerminator_Role());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRole() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDimensionCurveTerminator_Role());
	}

} //IfcDimensionCurveTerminatorImpl
