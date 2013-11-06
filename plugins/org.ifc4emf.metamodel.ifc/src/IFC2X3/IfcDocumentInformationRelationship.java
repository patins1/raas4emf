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

import IFC2X3.jaxb.IfcDocumentInformationRelationshipImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Document Information Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDocumentInformationRelationship#getRelatingDocument <em>Relating Document</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformationRelationship#getRelatedDocuments <em>Related Documents</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformationRelationship()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcDocumentInformationRelationshipImplAdapter.class)
public interface IfcDocumentInformationRelationship extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Relating Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcDocumentInformation#getIsPointer <em>Is Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Document</em>' reference.
	 * @see #setRelatingDocument(IfcDocumentInformation)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformationRelationship_RelatingDocument()
	 * @see IFC2X3.IfcDocumentInformation#getIsPointer
	 * @model opposite="IsPointer" required="true"
	 * @generated
	 */
	IfcDocumentInformation getRelatingDocument();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformationRelationship#getRelatingDocument <em>Relating Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Document</em>' reference.
	 * @see #getRelatingDocument()
	 * @generated
	 */
	void setRelatingDocument(IfcDocumentInformation value);

	/**
	 * Returns the value of the '<em><b>Related Documents</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcDocumentInformation}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcDocumentInformation#getIsPointedTo <em>Is Pointed To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Documents</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformationRelationship_RelatedDocuments()
	 * @see IFC2X3.IfcDocumentInformation#getIsPointedTo
	 * @model opposite="IsPointedTo" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcDocumentInformation> getRelatedDocuments();

	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #setRelationshipType(String)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformationRelationship_RelationshipType()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getRelationshipType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(String)
	 * @generated
	 */
	void unsetRelationshipType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relationship Type</em>' attribute is set.
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(String)
	 * @generated
	 */
	boolean isSetRelationshipType();

} // IfcDocumentInformationRelationship
