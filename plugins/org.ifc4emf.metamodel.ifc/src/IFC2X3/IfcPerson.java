/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcPersonImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPerson#getId <em>Id</em>}</li>
 *   <li>{@link IFC2X3.IfcPerson#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link IFC2X3.IfcPerson#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link IFC2X3.IfcPerson#getMiddleNames <em>Middle Names</em>}</li>
 *   <li>{@link IFC2X3.IfcPerson#getPrefixTitles <em>Prefix Titles</em>}</li>
 *   <li>{@link IFC2X3.IfcPerson#getSuffixTitles <em>Suffix Titles</em>}</li>
 *   <li>{@link IFC2X3.IfcPerson#getRoles <em>Roles</em>}</li>
 *   <li>{@link IFC2X3.IfcPerson#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link IFC2X3.IfcPerson#getEngagedIn <em>Engaged In</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPerson()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPersonImplAdapter.class)
public interface IfcPerson extends IfcActorSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Engaged In</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcPersonAndOrganization}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPersonAndOrganization#getThePerson <em>The Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engaged In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engaged In</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPerson_EngagedIn()
	 * @see IFC2X3.IfcPersonAndOrganization#getThePerson
	 * @model opposite="ThePerson" ordered="false"
	 * @generated
	 */
	EList<IfcPersonAndOrganization> getEngagedIn();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcActorRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPerson_Roles()
	 * @model
	 * @generated
	 */
	EList<IfcActorRole> getRoles();

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcAddress}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcAddress#getOfPerson <em>Of Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPerson_Addresses()
	 * @see IFC2X3.IfcAddress#getOfPerson
	 * @model opposite="OfPerson"
	 * @generated
	 */
	EList<IfcAddress> getAddresses();

	/**
	 * Returns the value of the '<em><b>Suffix Titles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix Titles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix Titles</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcPerson_SuffixTitles()
	 * @model unique="false" dataType="IFC2X3.STRING"
	 * @generated
	 */
	EList<String> getSuffixTitles();

	/**
	 * Returns the value of the '<em><b>Prefix Titles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix Titles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix Titles</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcPerson_PrefixTitles()
	 * @model unique="false" dataType="IFC2X3.STRING"
	 * @generated
	 */
	EList<String> getPrefixTitles();

	/**
	 * Returns the value of the '<em><b>Middle Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Names</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcPerson_MiddleNames()
	 * @model unique="false" dataType="IFC2X3.STRING"
	 * @generated
	 */
	EList<String> getMiddleNames();

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see #isSetGivenName()
	 * @see #unsetGivenName()
	 * @see #setGivenName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPerson_GivenName()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getGivenName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPerson#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' attribute.
	 * @see #isSetGivenName()
	 * @see #unsetGivenName()
	 * @see #getGivenName()
	 * @generated
	 */
	void setGivenName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPerson#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGivenName()
	 * @see #getGivenName()
	 * @see #setGivenName(String)
	 * @generated
	 */
	void unsetGivenName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPerson#getGivenName <em>Given Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Given Name</em>' attribute is set.
	 * @see #unsetGivenName()
	 * @see #getGivenName()
	 * @see #setGivenName(String)
	 * @generated
	 */
	boolean isSetGivenName();

	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Name</em>' attribute.
	 * @see #isSetFamilyName()
	 * @see #unsetFamilyName()
	 * @see #setFamilyName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPerson_FamilyName()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getFamilyName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPerson#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' attribute.
	 * @see #isSetFamilyName()
	 * @see #unsetFamilyName()
	 * @see #getFamilyName()
	 * @generated
	 */
	void setFamilyName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPerson#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFamilyName()
	 * @see #getFamilyName()
	 * @see #setFamilyName(String)
	 * @generated
	 */
	void unsetFamilyName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPerson#getFamilyName <em>Family Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Family Name</em>' attribute is set.
	 * @see #unsetFamilyName()
	 * @see #getFamilyName()
	 * @see #setFamilyName(String)
	 * @generated
	 */
	boolean isSetFamilyName();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPerson_Id()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPerson#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPerson#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPerson#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	boolean isSetId();

} // IfcPerson
