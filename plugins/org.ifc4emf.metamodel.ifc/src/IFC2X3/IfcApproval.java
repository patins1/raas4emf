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

import IFC2X3.jaxb.IfcApprovalImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Approval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcApproval#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.IfcApproval#getApprovalDateTime <em>Approval Date Time</em>}</li>
 *   <li>{@link IFC2X3.IfcApproval#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link IFC2X3.IfcApproval#getApprovalLevel <em>Approval Level</em>}</li>
 *   <li>{@link IFC2X3.IfcApproval#getApprovalQualifier <em>Approval Qualifier</em>}</li>
 *   <li>{@link IFC2X3.IfcApproval#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcApproval#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link IFC2X3.IfcApproval#getActors <em>Actors</em>}</li>
 *   <li>{@link IFC2X3.IfcApproval#getIsRelatedWith <em>Is Related With</em>}</li>
 *   <li>{@link IFC2X3.IfcApproval#getRelates <em>Relates</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcApproval()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcApprovalImplAdapter.class)
public interface IfcApproval extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcApprovalActorRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcApprovalActorRelationship#getApproval <em>Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcApproval_Actors()
	 * @see IFC2X3.IfcApprovalActorRelationship#getApproval
	 * @model opposite="Approval" ordered="false"
	 * @generated
	 */
	EList<IfcApprovalActorRelationship> getActors();

	/**
	 * Returns the value of the '<em><b>Is Related With</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcApprovalRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcApprovalRelationship#getRelatedApproval <em>Related Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related With</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related With</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcApproval_IsRelatedWith()
	 * @see IFC2X3.IfcApprovalRelationship#getRelatedApproval
	 * @model opposite="RelatedApproval" ordered="false"
	 * @generated
	 */
	EList<IfcApprovalRelationship> getIsRelatedWith();

	/**
	 * Returns the value of the '<em><b>Relates</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcApprovalRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcApprovalRelationship#getRelatingApproval <em>Relating Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcApproval_Relates()
	 * @see IFC2X3.IfcApprovalRelationship#getRelatingApproval
	 * @model opposite="RelatingApproval" ordered="false"
	 * @generated
	 */
	EList<IfcApprovalRelationship> getRelates();

	/**
	 * Returns the value of the '<em><b>Approval Date Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval Date Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Date Time</em>' reference.
	 * @see #setApprovalDateTime(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcApproval_ApprovalDateTime()
	 * @model required="true"
	 * @generated
	 */
	IfcDateTimeSelect getApprovalDateTime();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApproval#getApprovalDateTime <em>Approval Date Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Date Time</em>' reference.
	 * @see #getApprovalDateTime()
	 * @generated
	 */
	void setApprovalDateTime(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #isSetIdentifier()
	 * @see #unsetIdentifier()
	 * @see #setIdentifier(String)
	 * @see IFC2X3.IFC2X3Package#getIfcApproval_Identifier()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApproval#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #isSetIdentifier()
	 * @see #unsetIdentifier()
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcApproval#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdentifier()
	 * @see #getIdentifier()
	 * @see #setIdentifier(String)
	 * @generated
	 */
	void unsetIdentifier();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcApproval#getIdentifier <em>Identifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Identifier</em>' attribute is set.
	 * @see #unsetIdentifier()
	 * @see #getIdentifier()
	 * @see #setIdentifier(String)
	 * @generated
	 */
	boolean isSetIdentifier();

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
	 * @see IFC2X3.IFC2X3Package#getIfcApproval_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApproval#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcApproval#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcApproval#getName <em>Name</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Approval Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Qualifier</em>' attribute.
	 * @see #isSetApprovalQualifier()
	 * @see #unsetApprovalQualifier()
	 * @see #setApprovalQualifier(String)
	 * @see IFC2X3.IFC2X3Package#getIfcApproval_ApprovalQualifier()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getApprovalQualifier();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApproval#getApprovalQualifier <em>Approval Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Qualifier</em>' attribute.
	 * @see #isSetApprovalQualifier()
	 * @see #unsetApprovalQualifier()
	 * @see #getApprovalQualifier()
	 * @generated
	 */
	void setApprovalQualifier(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcApproval#getApprovalQualifier <em>Approval Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApprovalQualifier()
	 * @see #getApprovalQualifier()
	 * @see #setApprovalQualifier(String)
	 * @generated
	 */
	void unsetApprovalQualifier();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcApproval#getApprovalQualifier <em>Approval Qualifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Approval Qualifier</em>' attribute is set.
	 * @see #unsetApprovalQualifier()
	 * @see #getApprovalQualifier()
	 * @see #setApprovalQualifier(String)
	 * @generated
	 */
	boolean isSetApprovalQualifier();

	/**
	 * Returns the value of the '<em><b>Approval Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Level</em>' attribute.
	 * @see #isSetApprovalLevel()
	 * @see #unsetApprovalLevel()
	 * @see #setApprovalLevel(String)
	 * @see IFC2X3.IFC2X3Package#getIfcApproval_ApprovalLevel()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getApprovalLevel();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApproval#getApprovalLevel <em>Approval Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Level</em>' attribute.
	 * @see #isSetApprovalLevel()
	 * @see #unsetApprovalLevel()
	 * @see #getApprovalLevel()
	 * @generated
	 */
	void setApprovalLevel(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcApproval#getApprovalLevel <em>Approval Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApprovalLevel()
	 * @see #getApprovalLevel()
	 * @see #setApprovalLevel(String)
	 * @generated
	 */
	void unsetApprovalLevel();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcApproval#getApprovalLevel <em>Approval Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Approval Level</em>' attribute is set.
	 * @see #unsetApprovalLevel()
	 * @see #getApprovalLevel()
	 * @see #setApprovalLevel(String)
	 * @generated
	 */
	boolean isSetApprovalLevel();

	/**
	 * Returns the value of the '<em><b>Approval Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Status</em>' attribute.
	 * @see #isSetApprovalStatus()
	 * @see #unsetApprovalStatus()
	 * @see #setApprovalStatus(String)
	 * @see IFC2X3.IFC2X3Package#getIfcApproval_ApprovalStatus()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getApprovalStatus();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApproval#getApprovalStatus <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Status</em>' attribute.
	 * @see #isSetApprovalStatus()
	 * @see #unsetApprovalStatus()
	 * @see #getApprovalStatus()
	 * @generated
	 */
	void setApprovalStatus(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcApproval#getApprovalStatus <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApprovalStatus()
	 * @see #getApprovalStatus()
	 * @see #setApprovalStatus(String)
	 * @generated
	 */
	void unsetApprovalStatus();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcApproval#getApprovalStatus <em>Approval Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Approval Status</em>' attribute is set.
	 * @see #unsetApprovalStatus()
	 * @see #getApprovalStatus()
	 * @see #setApprovalStatus(String)
	 * @generated
	 */
	boolean isSetApprovalStatus();

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
	 * @see IFC2X3.IFC2X3Package#getIfcApproval_Description()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApproval#getDescription <em>Description</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcApproval#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcApproval#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

} // IfcApproval
