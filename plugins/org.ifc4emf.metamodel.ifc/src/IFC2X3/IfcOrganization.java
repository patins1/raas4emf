/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcOrganizationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcOrganization#getId <em>Id</em>}</li>
 *   <li>{@link IFC2X3.IfcOrganization#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcOrganization#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.IfcOrganization#getRoles <em>Roles</em>}</li>
 *   <li>{@link IFC2X3.IfcOrganization#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link IFC2X3.IfcOrganization#getIsRelatedBy <em>Is Related By</em>}</li>
 *   <li>{@link IFC2X3.IfcOrganization#getRelates <em>Relates</em>}</li>
 *   <li>{@link IFC2X3.IfcOrganization#getEngages <em>Engages</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcOrganization()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcOrganizationImplAdapter.class)
public interface IfcOrganization extends IfcActorSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Is Related By</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcOrganizationRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcOrganizationRelationship#getRelatedOrganizations <em>Related Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related By</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcOrganization_IsRelatedBy()
	 * @see IFC2X3.IfcOrganizationRelationship#getRelatedOrganizations
	 * @model opposite="RelatedOrganizations" ordered="false"
	 * @generated
	 */
	EList<IfcOrganizationRelationship> getIsRelatedBy();

	/**
	 * Returns the value of the '<em><b>Relates</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcOrganizationRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcOrganizationRelationship#getRelatingOrganization <em>Relating Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcOrganization_Relates()
	 * @see IFC2X3.IfcOrganizationRelationship#getRelatingOrganization
	 * @model opposite="RelatingOrganization" ordered="false"
	 * @generated
	 */
	EList<IfcOrganizationRelationship> getRelates();

	/**
	 * Returns the value of the '<em><b>Engages</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcPersonAndOrganization}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPersonAndOrganization#getTheOrganization <em>The Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engages</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engages</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcOrganization_Engages()
	 * @see IFC2X3.IfcPersonAndOrganization#getTheOrganization
	 * @model opposite="TheOrganization" ordered="false"
	 * @generated
	 */
	EList<IfcPersonAndOrganization> getEngages();

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
	 * @see IFC2X3.IFC2X3Package#getIfcOrganization_Roles()
	 * @model
	 * @generated
	 */
	EList<IfcActorRole> getRoles();

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcAddress}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcAddress#getOfOrganization <em>Of Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcOrganization_Addresses()
	 * @see IFC2X3.IfcAddress#getOfOrganization
	 * @model opposite="OfOrganization"
	 * @generated
	 */
	EList<IfcAddress> getAddresses();

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
	 * @see IFC2X3.IFC2X3Package#getIfcOrganization_Description()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOrganization#getDescription <em>Description</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcOrganization#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOrganization#getDescription <em>Description</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcOrganization_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOrganization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOrganization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOrganization#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

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
	 * @see IFC2X3.IFC2X3Package#getIfcOrganization_Id()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOrganization#getId <em>Id</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcOrganization#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOrganization#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	boolean isSetId();

} // IfcOrganization
