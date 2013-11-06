/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcApprovalActorRelationshipImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Approval Actor Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcApprovalActorRelationship#getActor <em>Actor</em>}</li>
 *   <li>{@link IFC2X3.IfcApprovalActorRelationship#getApproval <em>Approval</em>}</li>
 *   <li>{@link IFC2X3.IfcApprovalActorRelationship#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcApprovalActorRelationship()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcApprovalActorRelationshipImplAdapter.class)
public interface IfcApprovalActorRelationship extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(IfcActorRole)
	 * @see IFC2X3.IFC2X3Package#getIfcApprovalActorRelationship_Role()
	 * @model required="true"
	 * @generated
	 */
	IfcActorRole getRole();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApprovalActorRelationship#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(IfcActorRole value);

	/**
	 * Returns the value of the '<em><b>Approval</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcApproval#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval</em>' reference.
	 * @see #setApproval(IfcApproval)
	 * @see IFC2X3.IFC2X3Package#getIfcApprovalActorRelationship_Approval()
	 * @see IFC2X3.IfcApproval#getActors
	 * @model opposite="Actors" required="true"
	 * @generated
	 */
	IfcApproval getApproval();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApprovalActorRelationship#getApproval <em>Approval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval</em>' reference.
	 * @see #getApproval()
	 * @generated
	 */
	void setApproval(IfcApproval value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(IfcActorSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcApprovalActorRelationship_Actor()
	 * @model required="true"
	 * @generated
	 */
	IfcActorSelect getActor();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApprovalActorRelationship#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(IfcActorSelect value);

} // IfcApprovalActorRelationship
