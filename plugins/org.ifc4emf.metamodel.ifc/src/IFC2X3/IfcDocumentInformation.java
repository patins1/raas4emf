/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcDocumentInformationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Document Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getDocumentReferences <em>Document References</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getScope <em>Scope</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getRevision <em>Revision</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getDocumentOwner <em>Document Owner</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getEditors <em>Editors</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getLastRevisionTime <em>Last Revision Time</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getElectronicFormat <em>Electronic Format</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getStatus <em>Status</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getIsPointedTo <em>Is Pointed To</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentInformation#getIsPointer <em>Is Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDocumentInformationImplAdapter.class)
public interface IfcDocumentInformation extends IfcDocumentSelect {
	/**
	 * Returns the value of the '<em><b>Is Pointed To</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcDocumentInformationRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcDocumentInformationRelationship#getRelatedDocuments <em>Related Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Pointed To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pointed To</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_IsPointedTo()
	 * @see IFC2X3.IfcDocumentInformationRelationship#getRelatedDocuments
	 * @model opposite="RelatedDocuments" ordered="false"
	 * @generated
	 */
	EList<IfcDocumentInformationRelationship> getIsPointedTo();

	/**
	 * Returns the value of the '<em><b>Is Pointer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcDocumentInformationRelationship#getRelatingDocument <em>Relating Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Pointer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pointer</em>' reference.
	 * @see #setIsPointer(IfcDocumentInformationRelationship)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_IsPointer()
	 * @see IFC2X3.IfcDocumentInformationRelationship#getRelatingDocument
	 * @model opposite="RelatingDocument" ordered="false"
	 * @generated
	 */
	IfcDocumentInformationRelationship getIsPointer();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getIsPointer <em>Is Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Pointer</em>' reference.
	 * @see #getIsPointer()
	 * @generated
	 */
	void setIsPointer(IfcDocumentInformationRelationship value);

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From</em>' reference.
	 * @see #setValidFrom(IfcCalendarDate)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_ValidFrom()
	 * @model
	 * @generated
	 */
	IfcCalendarDate getValidFrom();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getValidFrom <em>Valid From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' reference.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(IfcCalendarDate value);

	/**
	 * Returns the value of the '<em><b>Electronic Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Format</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Format</em>' reference.
	 * @see #setElectronicFormat(IfcDocumentElectronicFormat)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_ElectronicFormat()
	 * @model
	 * @generated
	 */
	IfcDocumentElectronicFormat getElectronicFormat();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getElectronicFormat <em>Electronic Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Format</em>' reference.
	 * @see #getElectronicFormat()
	 * @generated
	 */
	void setElectronicFormat(IfcDocumentElectronicFormat value);

	/**
	 * Returns the value of the '<em><b>Document References</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcDocumentReference}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcDocumentReference#getReferenceToDocument <em>Reference To Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document References</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_DocumentReferences()
	 * @see IFC2X3.IfcDocumentReference#getReferenceToDocument
	 * @model opposite="ReferenceToDocument" ordered="false"
	 * @generated
	 */
	EList<IfcDocumentReference> getDocumentReferences();

	/**
	 * Returns the value of the '<em><b>Editors</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcActorSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editors</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_Editors()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IfcActorSelect> getEditors();

	/**
	 * Returns the value of the '<em><b>Valid Until</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Until</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Until</em>' reference.
	 * @see #setValidUntil(IfcCalendarDate)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_ValidUntil()
	 * @model
	 * @generated
	 */
	IfcCalendarDate getValidUntil();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getValidUntil <em>Valid Until</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Until</em>' reference.
	 * @see #getValidUntil()
	 * @generated
	 */
	void setValidUntil(IfcCalendarDate value);

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' reference.
	 * @see #setCreationTime(IfcDateAndTime)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_CreationTime()
	 * @model
	 * @generated
	 */
	IfcDateAndTime getCreationTime();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getCreationTime <em>Creation Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' reference.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(IfcDateAndTime value);

	/**
	 * Returns the value of the '<em><b>Document Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Owner</em>' reference.
	 * @see #setDocumentOwner(IfcActorSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_DocumentOwner()
	 * @model
	 * @generated
	 */
	IfcActorSelect getDocumentOwner();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getDocumentOwner <em>Document Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Owner</em>' reference.
	 * @see #getDocumentOwner()
	 * @generated
	 */
	void setDocumentOwner(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>Last Revision Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Revision Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Revision Time</em>' reference.
	 * @see #setLastRevisionTime(IfcDateAndTime)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_LastRevisionTime()
	 * @model
	 * @generated
	 */
	IfcDateAndTime getLastRevisionTime();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getLastRevisionTime <em>Last Revision Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Revision Time</em>' reference.
	 * @see #getLastRevisionTime()
	 * @generated
	 */
	void setLastRevisionTime(IfcDateAndTime value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcDocumentStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see IFC2X3.IfcDocumentStatusEnum
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(IfcDocumentStatusEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_Status()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDocumentStatusEnum getStatus();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see IFC2X3.IfcDocumentStatusEnum
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IfcDocumentStatusEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentInformation#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(IfcDocumentStatusEnum)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentInformation#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(IfcDocumentStatusEnum)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcDocumentConfidentialityEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confidentiality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see IFC2X3.IfcDocumentConfidentialityEnum
	 * @see #isSetConfidentiality()
	 * @see #unsetConfidentiality()
	 * @see #setConfidentiality(IfcDocumentConfidentialityEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_Confidentiality()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDocumentConfidentialityEnum getConfidentiality();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see IFC2X3.IfcDocumentConfidentialityEnum
	 * @see #isSetConfidentiality()
	 * @see #unsetConfidentiality()
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(IfcDocumentConfidentialityEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentInformation#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfidentiality()
	 * @see #getConfidentiality()
	 * @see #setConfidentiality(IfcDocumentConfidentialityEnum)
	 * @generated
	 */
	void unsetConfidentiality();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentInformation#getConfidentiality <em>Confidentiality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Confidentiality</em>' attribute is set.
	 * @see #unsetConfidentiality()
	 * @see #getConfidentiality()
	 * @see #setConfidentiality(IfcDocumentConfidentialityEnum)
	 * @generated
	 */
	boolean isSetConfidentiality();

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #isSetRevision()
	 * @see #unsetRevision()
	 * @see #setRevision(String)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_Revision()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #isSetRevision()
	 * @see #unsetRevision()
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentInformation#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevision()
	 * @see #getRevision()
	 * @see #setRevision(String)
	 * @generated
	 */
	void unsetRevision();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentInformation#getRevision <em>Revision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revision</em>' attribute is set.
	 * @see #unsetRevision()
	 * @see #getRevision()
	 * @see #setRevision(String)
	 * @generated
	 */
	boolean isSetRevision();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #setScope(String)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_Scope()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentInformation#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScope()
	 * @see #getScope()
	 * @see #setScope(String)
	 * @generated
	 */
	void unsetScope();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentInformation#getScope <em>Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scope</em>' attribute is set.
	 * @see #unsetScope()
	 * @see #getScope()
	 * @see #setScope(String)
	 * @generated
	 */
	boolean isSetScope();

	/**
	 * Returns the value of the '<em><b>Intended Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intended Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intended Use</em>' attribute.
	 * @see #isSetIntendedUse()
	 * @see #unsetIntendedUse()
	 * @see #setIntendedUse(String)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_IntendedUse()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getIntendedUse();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getIntendedUse <em>Intended Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended Use</em>' attribute.
	 * @see #isSetIntendedUse()
	 * @see #unsetIntendedUse()
	 * @see #getIntendedUse()
	 * @generated
	 */
	void setIntendedUse(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentInformation#getIntendedUse <em>Intended Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntendedUse()
	 * @see #getIntendedUse()
	 * @see #setIntendedUse(String)
	 * @generated
	 */
	void unsetIntendedUse();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentInformation#getIntendedUse <em>Intended Use</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Intended Use</em>' attribute is set.
	 * @see #unsetIntendedUse()
	 * @see #getIntendedUse()
	 * @see #setIntendedUse(String)
	 * @generated
	 */
	boolean isSetIntendedUse();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #setPurpose(String)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_Purpose()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentInformation#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(String)
	 * @generated
	 */
	void unsetPurpose();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentInformation#getPurpose <em>Purpose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Purpose</em>' attribute is set.
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(String)
	 * @generated
	 */
	boolean isSetPurpose();

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
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_Description()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getDescription <em>Description</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentInformation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentInformation#getDescription <em>Description</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentInformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentInformation#getName <em>Name</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Document Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Id</em>' attribute.
	 * @see #isSetDocumentId()
	 * @see #unsetDocumentId()
	 * @see #setDocumentId(String)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentInformation_DocumentId()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getDocumentId();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentInformation#getDocumentId <em>Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Id</em>' attribute.
	 * @see #isSetDocumentId()
	 * @see #unsetDocumentId()
	 * @see #getDocumentId()
	 * @generated
	 */
	void setDocumentId(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentInformation#getDocumentId <em>Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDocumentId()
	 * @see #getDocumentId()
	 * @see #setDocumentId(String)
	 * @generated
	 */
	void unsetDocumentId();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentInformation#getDocumentId <em>Document Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Document Id</em>' attribute is set.
	 * @see #unsetDocumentId()
	 * @see #getDocumentId()
	 * @see #setDocumentId(String)
	 * @generated
	 */
	boolean isSetDocumentId();

} // IfcDocumentInformation
