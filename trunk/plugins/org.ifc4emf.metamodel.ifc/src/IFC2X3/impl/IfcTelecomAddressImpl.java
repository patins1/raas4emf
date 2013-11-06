/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcTelecomAddress;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Telecom Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTelecomAddressImpl#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTelecomAddressImpl#getFacsimileNumbers <em>Facsimile Numbers</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTelecomAddressImpl#getPagerNumber <em>Pager Number</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTelecomAddressImpl#getElectronicMailAddresses <em>Electronic Mail Addresses</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTelecomAddressImpl#getWWWHomePageURL <em>WWW Home Page URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTelecomAddress")
@XmlRootElement(name = "IfcTelecomAddressElement")
public class IfcTelecomAddressImpl extends IfcAddressImpl implements IfcTelecomAddress {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTelecomAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTelecomAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWWWHomePageURL() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWWWHomePageURL(String newWWWHomePageURL) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL(), newWWWHomePageURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWWWHomePageURL() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWWWHomePageURL() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getElectronicMailAddresses() {
		return (EList<String>)eGet(IFC2X3Package.eINSTANCE.getIfcTelecomAddress_ElectronicMailAddresses(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPagerNumber() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTelecomAddress_PagerNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagerNumber(String newPagerNumber) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTelecomAddress_PagerNumber(), newPagerNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPagerNumber() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTelecomAddress_PagerNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPagerNumber() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTelecomAddress_PagerNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getFacsimileNumbers() {
		return (EList<String>)eGet(IFC2X3Package.eINSTANCE.getIfcTelecomAddress_FacsimileNumbers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getTelephoneNumbers() {
		return (EList<String>)eGet(IFC2X3Package.eINSTANCE.getIfcTelecomAddress_TelephoneNumbers(), true);
	}

} //IfcTelecomAddressImpl
