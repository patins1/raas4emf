/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcOrganizationRelationshipImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Organization Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcOrganizationRelationship#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcOrganizationRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.IfcOrganizationRelationship#getRelatingOrganization <em>Relating Organization</em>}</li>
 *   <li>{@link IFC2X3.IfcOrganizationRelationship#getRelatedOrganizations <em>Related Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcOrganizationRelationship()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcOrganizationRelationshipImplAdapter.class)
public interface IfcOrganizationRelationship extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Relating Organization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcOrganization#getRelates <em>Relates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Organization</em>' reference.
	 * @see #setRelatingOrganization(IfcOrganization)
	 * @see IFC2X3.IFC2X3Package#getIfcOrganizationRelationship_RelatingOrganization()
	 * @see IFC2X3.IfcOrganization#getRelates
	 * @model opposite="Relates" required="true"
	 * @generated
	 */
	IfcOrganization getRelatingOrganization();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOrganizationRelationship#getRelatingOrganization <em>Relating Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Organization</em>' reference.
	 * @see #getRelatingOrganization()
	 * @generated
	 */
	void setRelatingOrganization(IfcOrganization value);

	/**
	 * Returns the value of the '<em><b>Related Organizations</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcOrganization}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcOrganization#getIsRelatedBy <em>Is Related By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Organizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Organizations</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcOrganizationRelationship_RelatedOrganizations()
	 * @see IFC2X3.IfcOrganization#getIsRelatedBy
	 * @model opposite="IsRelatedBy" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcOrganization> getRelatedOrganizations();

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
	 * @see IFC2X3.IFC2X3Package#getIfcOrganizationRelationship_Description()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOrganizationRelationship#getDescription <em>Description</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcOrganizationRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOrganizationRelationship#getDescription <em>Description</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcOrganizationRelationship_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOrganizationRelationship#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcOrganizationRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOrganizationRelationship#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // IfcOrganizationRelationship
