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
import IFC2X3.IfcPerson;
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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPersonImpl#getId <em>Id</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPersonImpl#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPersonImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPersonImpl#getMiddleNames <em>Middle Names</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPersonImpl#getPrefixTitles <em>Prefix Titles</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPersonImpl#getSuffixTitles <em>Suffix Titles</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPersonImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPersonImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPersonImpl#getEngagedIn <em>Engaged In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPerson")
@XmlRootElement(name = "IfcPersonElement")
public class IfcPersonImpl extends IfcActorSelectImpl implements IfcPerson {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPerson();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPersonAndOrganization> getEngagedIn() {
		return (EList<IfcPersonAndOrganization>)eGet(IFC2X3Package.eINSTANCE.getIfcPerson_EngagedIn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcActorRole> getRoles() {
		return (EList<IfcActorRole>)eGet(IFC2X3Package.eINSTANCE.getIfcPerson_Roles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcAddress> getAddresses() {
		return (EList<IfcAddress>)eGet(IFC2X3Package.eINSTANCE.getIfcPerson_Addresses(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getSuffixTitles() {
		return (EList<String>)eGet(IFC2X3Package.eINSTANCE.getIfcPerson_SuffixTitles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getPrefixTitles() {
		return (EList<String>)eGet(IFC2X3Package.eINSTANCE.getIfcPerson_PrefixTitles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getMiddleNames() {
		return (EList<String>)eGet(IFC2X3Package.eINSTANCE.getIfcPerson_MiddleNames(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGivenName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPerson_GivenName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGivenName(String newGivenName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPerson_GivenName(), newGivenName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGivenName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPerson_GivenName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGivenName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPerson_GivenName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamilyName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPerson_FamilyName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamilyName(String newFamilyName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPerson_FamilyName(), newFamilyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFamilyName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPerson_FamilyName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFamilyName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPerson_FamilyName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPerson_Id(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPerson_Id(), newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPerson_Id());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPerson_Id());
	}

} //IfcPersonImpl
