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
import IFC2X3.IfcActorRole;
import IFC2X3.IfcRoleEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Actor Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcActorRoleImpl#getRole <em>Role</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcActorRoleImpl#getUserDefinedRole <em>User Defined Role</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcActorRoleImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcActorRole")
@XmlRootElement(name = "IfcActorRoleElement")
public class IfcActorRoleImpl extends CDOObjectImpl implements IfcActorRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcActorRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcActorRole();
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
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcActorRole_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcActorRole_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcActorRole_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcActorRole_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedRole() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcActorRole_UserDefinedRole(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedRole(String newUserDefinedRole) {
		eSet(IFC2X3Package.eINSTANCE.getIfcActorRole_UserDefinedRole(), newUserDefinedRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedRole() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcActorRole_UserDefinedRole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedRole() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcActorRole_UserDefinedRole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRoleEnum getRole() {
		return (IfcRoleEnum)eGet(IFC2X3Package.eINSTANCE.getIfcActorRole_Role(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(IfcRoleEnum newRole) {
		eSet(IFC2X3Package.eINSTANCE.getIfcActorRole_Role(), newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRole() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcActorRole_Role());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRole() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcActorRole_Role());
	}

} //IfcActorRoleImpl
