/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcPostalAddress;

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
 * An implementation of the model object '<em><b>Ifc Postal Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPostalAddressImpl#getInternalLocation <em>Internal Location</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPostalAddressImpl#getAddressLines <em>Address Lines</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPostalAddressImpl#getPostalBox <em>Postal Box</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPostalAddressImpl#getTown <em>Town</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPostalAddressImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPostalAddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPostalAddressImpl#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPostalAddress")
@XmlRootElement(name = "IfcPostalAddressElement")
public class IfcPostalAddressImpl extends IfcAddressImpl implements IfcPostalAddress {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPostalAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPostalAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_Country(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_Country(), newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCountry() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPostalAddress_Country());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCountry() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_Country());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_PostalCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_PostalCode(), newPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPostalCode() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPostalAddress_PostalCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPostalCode() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_PostalCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_Region(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_Region(), newRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRegion() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPostalAddress_Region());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRegion() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_Region());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTown() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_Town(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTown(String newTown) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_Town(), newTown);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTown() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPostalAddress_Town());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTown() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_Town());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalBox() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_PostalBox(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalBox(String newPostalBox) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_PostalBox(), newPostalBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPostalBox() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPostalAddress_PostalBox());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPostalBox() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_PostalBox());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getAddressLines() {
		return (EList<String>)eGet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_AddressLines(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternalLocation() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_InternalLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalLocation(String newInternalLocation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_InternalLocation(), newInternalLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInternalLocation() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPostalAddress_InternalLocation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInternalLocation() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPostalAddress_InternalLocation());
	}

} //IfcPostalAddressImpl
