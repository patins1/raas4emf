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
import IFC2X3.IfcAddress;
import IFC2X3.IfcAddressTypeEnum;
import IFC2X3.IfcOrganization;
import IFC2X3.IfcPerson;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcAddressImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAddressImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAddressImpl#getUserDefinedPurpose <em>User Defined Purpose</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAddressImpl#getOfPerson <em>Of Person</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAddressImpl#getOfOrganization <em>Of Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcAddress")
@XmlSeeAlso({ IfcTelecomAddressImpl.class, IfcPostalAddressImpl.class })
@XmlRootElement(name = "IfcAddressElement")
public class IfcAddressImpl extends IfcObjectReferenceSelectImpl implements IfcAddress {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPerson> getOfPerson() {
		return (EList<IfcPerson>)eGet(IFC2X3Package.eINSTANCE.getIfcAddress_OfPerson(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcOrganization> getOfOrganization() {
		return (EList<IfcOrganization>)eGet(IFC2X3Package.eINSTANCE.getIfcAddress_OfOrganization(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedPurpose() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcAddress_UserDefinedPurpose(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedPurpose(String newUserDefinedPurpose) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAddress_UserDefinedPurpose(), newUserDefinedPurpose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedPurpose() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAddress_UserDefinedPurpose());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedPurpose() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAddress_UserDefinedPurpose());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcAddress_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAddress_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAddress_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAddress_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAddressTypeEnum getPurpose() {
		return (IfcAddressTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcAddress_Purpose(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(IfcAddressTypeEnum newPurpose) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAddress_Purpose(), newPurpose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPurpose() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAddress_Purpose());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPurpose() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAddress_Purpose());
	}

} //IfcAddressImpl
