/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcAddressImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcAddress#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link IFC2X3.IfcAddress#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.IfcAddress#getUserDefinedPurpose <em>User Defined Purpose</em>}</li>
 *   <li>{@link IFC2X3.IfcAddress#getOfPerson <em>Of Person</em>}</li>
 *   <li>{@link IFC2X3.IfcAddress#getOfOrganization <em>Of Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcAddress()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAddressImplAdapter.class)
public interface IfcAddress extends IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Of Person</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcPerson}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPerson#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Person</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcAddress_OfPerson()
	 * @see IFC2X3.IfcPerson#getAddresses
	 * @model opposite="Addresses" ordered="false"
	 * @generated
	 */
	EList<IfcPerson> getOfPerson();

	/**
	 * Returns the value of the '<em><b>Of Organization</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcOrganization}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcOrganization#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Organization</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcAddress_OfOrganization()
	 * @see IFC2X3.IfcOrganization#getAddresses
	 * @model opposite="Addresses" ordered="false"
	 * @generated
	 */
	EList<IfcOrganization> getOfOrganization();

	/**
	 * Returns the value of the '<em><b>User Defined Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Purpose</em>' attribute.
	 * @see #isSetUserDefinedPurpose()
	 * @see #unsetUserDefinedPurpose()
	 * @see #setUserDefinedPurpose(String)
	 * @see IFC2X3.IFC2X3Package#getIfcAddress_UserDefinedPurpose()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedPurpose();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAddress#getUserDefinedPurpose <em>User Defined Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Purpose</em>' attribute.
	 * @see #isSetUserDefinedPurpose()
	 * @see #unsetUserDefinedPurpose()
	 * @see #getUserDefinedPurpose()
	 * @generated
	 */
	void setUserDefinedPurpose(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAddress#getUserDefinedPurpose <em>User Defined Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedPurpose()
	 * @see #getUserDefinedPurpose()
	 * @see #setUserDefinedPurpose(String)
	 * @generated
	 */
	void unsetUserDefinedPurpose();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAddress#getUserDefinedPurpose <em>User Defined Purpose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Purpose</em>' attribute is set.
	 * @see #unsetUserDefinedPurpose()
	 * @see #getUserDefinedPurpose()
	 * @see #setUserDefinedPurpose(String)
	 * @generated
	 */
	boolean isSetUserDefinedPurpose();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see IFC2X3.IFC2X3Package#getIfcAddress_Description()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAddress#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAddress#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAddress#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcAddressTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see IFC2X3.IfcAddressTypeEnum
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #setPurpose(IfcAddressTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcAddress_Purpose()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAddressTypeEnum getPurpose();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAddress#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see IFC2X3.IfcAddressTypeEnum
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(IfcAddressTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAddress#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(IfcAddressTypeEnum)
	 * @generated
	 */
	void unsetPurpose();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAddress#getPurpose <em>Purpose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Purpose</em>' attribute is set.
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(IfcAddressTypeEnum)
	 * @generated
	 */
	boolean isSetPurpose();

} // IfcAddress
