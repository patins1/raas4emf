/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcTelecomAddressImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Telecom Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTelecomAddress#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link IFC2X3.IfcTelecomAddress#getFacsimileNumbers <em>Facsimile Numbers</em>}</li>
 *   <li>{@link IFC2X3.IfcTelecomAddress#getPagerNumber <em>Pager Number</em>}</li>
 *   <li>{@link IFC2X3.IfcTelecomAddress#getElectronicMailAddresses <em>Electronic Mail Addresses</em>}</li>
 *   <li>{@link IFC2X3.IfcTelecomAddress#getWWWHomePageURL <em>WWW Home Page URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTelecomAddress()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTelecomAddressImplAdapter.class)
public interface IfcTelecomAddress extends IfcAddress {
	/**
	 * Returns the value of the '<em><b>WWW Home Page URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WWW Home Page URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WWW Home Page URL</em>' attribute.
	 * @see #isSetWWWHomePageURL()
	 * @see #unsetWWWHomePageURL()
	 * @see #setWWWHomePageURL(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTelecomAddress_WWWHomePageURL()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getWWWHomePageURL();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTelecomAddress#getWWWHomePageURL <em>WWW Home Page URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WWW Home Page URL</em>' attribute.
	 * @see #isSetWWWHomePageURL()
	 * @see #unsetWWWHomePageURL()
	 * @see #getWWWHomePageURL()
	 * @generated
	 */
	void setWWWHomePageURL(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTelecomAddress#getWWWHomePageURL <em>WWW Home Page URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWWWHomePageURL()
	 * @see #getWWWHomePageURL()
	 * @see #setWWWHomePageURL(String)
	 * @generated
	 */
	void unsetWWWHomePageURL();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTelecomAddress#getWWWHomePageURL <em>WWW Home Page URL</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>WWW Home Page URL</em>' attribute is set.
	 * @see #unsetWWWHomePageURL()
	 * @see #getWWWHomePageURL()
	 * @see #setWWWHomePageURL(String)
	 * @generated
	 */
	boolean isSetWWWHomePageURL();

	/**
	 * Returns the value of the '<em><b>Electronic Mail Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Mail Addresses</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Mail Addresses</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcTelecomAddress_ElectronicMailAddresses()
	 * @model unique="false" dataType="IFC2X3.STRING"
	 * @generated
	 */
	EList<String> getElectronicMailAddresses();

	/**
	 * Returns the value of the '<em><b>Pager Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pager Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pager Number</em>' attribute.
	 * @see #isSetPagerNumber()
	 * @see #unsetPagerNumber()
	 * @see #setPagerNumber(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTelecomAddress_PagerNumber()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getPagerNumber();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTelecomAddress#getPagerNumber <em>Pager Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pager Number</em>' attribute.
	 * @see #isSetPagerNumber()
	 * @see #unsetPagerNumber()
	 * @see #getPagerNumber()
	 * @generated
	 */
	void setPagerNumber(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTelecomAddress#getPagerNumber <em>Pager Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPagerNumber()
	 * @see #getPagerNumber()
	 * @see #setPagerNumber(String)
	 * @generated
	 */
	void unsetPagerNumber();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTelecomAddress#getPagerNumber <em>Pager Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pager Number</em>' attribute is set.
	 * @see #unsetPagerNumber()
	 * @see #getPagerNumber()
	 * @see #setPagerNumber(String)
	 * @generated
	 */
	boolean isSetPagerNumber();

	/**
	 * Returns the value of the '<em><b>Facsimile Numbers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facsimile Numbers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facsimile Numbers</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcTelecomAddress_FacsimileNumbers()
	 * @model unique="false" dataType="IFC2X3.STRING"
	 * @generated
	 */
	EList<String> getFacsimileNumbers();

	/**
	 * Returns the value of the '<em><b>Telephone Numbers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone Numbers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Numbers</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcTelecomAddress_TelephoneNumbers()
	 * @model unique="false" dataType="IFC2X3.STRING"
	 * @generated
	 */
	EList<String> getTelephoneNumbers();

} // IfcTelecomAddress
