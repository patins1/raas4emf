/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcPostalAddressImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Postal Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPostalAddress#getInternalLocation <em>Internal Location</em>}</li>
 *   <li>{@link IFC2X3.IfcPostalAddress#getAddressLines <em>Address Lines</em>}</li>
 *   <li>{@link IFC2X3.IfcPostalAddress#getPostalBox <em>Postal Box</em>}</li>
 *   <li>{@link IFC2X3.IfcPostalAddress#getTown <em>Town</em>}</li>
 *   <li>{@link IFC2X3.IfcPostalAddress#getRegion <em>Region</em>}</li>
 *   <li>{@link IFC2X3.IfcPostalAddress#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link IFC2X3.IfcPostalAddress#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPostalAddress()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPostalAddressImplAdapter.class)
public interface IfcPostalAddress extends IfcAddress {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #isSetCountry()
	 * @see #unsetCountry()
	 * @see #setCountry(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPostalAddress_Country()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPostalAddress#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #isSetCountry()
	 * @see #unsetCountry()
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPostalAddress#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCountry()
	 * @see #getCountry()
	 * @see #setCountry(String)
	 * @generated
	 */
	void unsetCountry();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPostalAddress#getCountry <em>Country</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Country</em>' attribute is set.
	 * @see #unsetCountry()
	 * @see #getCountry()
	 * @see #setCountry(String)
	 * @generated
	 */
	boolean isSetCountry();

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #isSetPostalCode()
	 * @see #unsetPostalCode()
	 * @see #setPostalCode(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPostalAddress_PostalCode()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPostalAddress#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #isSetPostalCode()
	 * @see #unsetPostalCode()
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPostalAddress#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPostalCode()
	 * @see #getPostalCode()
	 * @see #setPostalCode(String)
	 * @generated
	 */
	void unsetPostalCode();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPostalAddress#getPostalCode <em>Postal Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Postal Code</em>' attribute is set.
	 * @see #unsetPostalCode()
	 * @see #getPostalCode()
	 * @see #setPostalCode(String)
	 * @generated
	 */
	boolean isSetPostalCode();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #isSetRegion()
	 * @see #unsetRegion()
	 * @see #setRegion(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPostalAddress_Region()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPostalAddress#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #isSetRegion()
	 * @see #unsetRegion()
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPostalAddress#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegion()
	 * @see #getRegion()
	 * @see #setRegion(String)
	 * @generated
	 */
	void unsetRegion();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPostalAddress#getRegion <em>Region</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Region</em>' attribute is set.
	 * @see #unsetRegion()
	 * @see #getRegion()
	 * @see #setRegion(String)
	 * @generated
	 */
	boolean isSetRegion();

	/**
	 * Returns the value of the '<em><b>Town</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Town</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Town</em>' attribute.
	 * @see #isSetTown()
	 * @see #unsetTown()
	 * @see #setTown(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPostalAddress_Town()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getTown();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPostalAddress#getTown <em>Town</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Town</em>' attribute.
	 * @see #isSetTown()
	 * @see #unsetTown()
	 * @see #getTown()
	 * @generated
	 */
	void setTown(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPostalAddress#getTown <em>Town</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTown()
	 * @see #getTown()
	 * @see #setTown(String)
	 * @generated
	 */
	void unsetTown();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPostalAddress#getTown <em>Town</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Town</em>' attribute is set.
	 * @see #unsetTown()
	 * @see #getTown()
	 * @see #setTown(String)
	 * @generated
	 */
	boolean isSetTown();

	/**
	 * Returns the value of the '<em><b>Postal Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Box</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Box</em>' attribute.
	 * @see #isSetPostalBox()
	 * @see #unsetPostalBox()
	 * @see #setPostalBox(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPostalAddress_PostalBox()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getPostalBox();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPostalAddress#getPostalBox <em>Postal Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Box</em>' attribute.
	 * @see #isSetPostalBox()
	 * @see #unsetPostalBox()
	 * @see #getPostalBox()
	 * @generated
	 */
	void setPostalBox(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPostalAddress#getPostalBox <em>Postal Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPostalBox()
	 * @see #getPostalBox()
	 * @see #setPostalBox(String)
	 * @generated
	 */
	void unsetPostalBox();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPostalAddress#getPostalBox <em>Postal Box</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Postal Box</em>' attribute is set.
	 * @see #unsetPostalBox()
	 * @see #getPostalBox()
	 * @see #setPostalBox(String)
	 * @generated
	 */
	boolean isSetPostalBox();

	/**
	 * Returns the value of the '<em><b>Address Lines</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Lines</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Lines</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcPostalAddress_AddressLines()
	 * @model unique="false" dataType="IFC2X3.STRING"
	 * @generated
	 */
	EList<String> getAddressLines();

	/**
	 * Returns the value of the '<em><b>Internal Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Location</em>' attribute.
	 * @see #isSetInternalLocation()
	 * @see #unsetInternalLocation()
	 * @see #setInternalLocation(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPostalAddress_InternalLocation()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getInternalLocation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPostalAddress#getInternalLocation <em>Internal Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Location</em>' attribute.
	 * @see #isSetInternalLocation()
	 * @see #unsetInternalLocation()
	 * @see #getInternalLocation()
	 * @generated
	 */
	void setInternalLocation(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPostalAddress#getInternalLocation <em>Internal Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInternalLocation()
	 * @see #getInternalLocation()
	 * @see #setInternalLocation(String)
	 * @generated
	 */
	void unsetInternalLocation();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPostalAddress#getInternalLocation <em>Internal Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Internal Location</em>' attribute is set.
	 * @see #unsetInternalLocation()
	 * @see #getInternalLocation()
	 * @see #setInternalLocation(String)
	 * @generated
	 */
	boolean isSetInternalLocation();

} // IfcPostalAddress
