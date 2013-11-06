/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcActorRole;
import IFC2X3.IfcAddress;
import IFC2X3.IfcOrganization;
import IFC2X3.IfcOrganizationRelationship;
import IFC2X3.IfcPersonAndOrganization;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcOrganizationImpl#getId <em>Id</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOrganizationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOrganizationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOrganizationImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOrganizationImpl#getIsRelatedBy <em>Is Related By</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOrganizationImpl#getRelates <em>Relates</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOrganizationImpl#getEngages <em>Engages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcOrganization")
@XmlRootElement(name = "IfcOrganizationElement")
public class IfcOrganizationImpl extends IfcActorSelectImpl implements IfcOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcOrganization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcOrganizationRelationship> getIsRelatedBy() {
		return (EList<IfcOrganizationRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcOrganization_IsRelatedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcOrganizationRelationship> getRelates() {
		return (EList<IfcOrganizationRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcOrganization_Relates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPersonAndOrganization> getEngages() {
		return (EList<IfcPersonAndOrganization>)eGet(IFC2X3Package.eINSTANCE.getIfcOrganization_Engages(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcActorRole> getRoles() {
		return (EList<IfcActorRole>)eGet(IFC2X3Package.eINSTANCE.getIfcOrganization_Roles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcAddress> getAddresses() {
		return (EList<IfcAddress>)eGet(IFC2X3Package.eINSTANCE.getIfcOrganization_Addresses(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcOrganization_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOrganization_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOrganization_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOrganization_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcOrganization_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOrganization_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOrganization_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOrganization_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcOrganization_Id(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOrganization_Id(), newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOrganization_Id());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOrganization_Id());
	}

} //IfcOrganizationImpl
