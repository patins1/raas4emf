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

import IFC2X3.jaxb.IfcApprovalPropertyRelationshipImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Approval Property Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcApprovalPropertyRelationship#getApprovedProperties <em>Approved Properties</em>}</li>
 *   <li>{@link IFC2X3.IfcApprovalPropertyRelationship#getApproval <em>Approval</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcApprovalPropertyRelationship()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcApprovalPropertyRelationshipImplAdapter.class)
public interface IfcApprovalPropertyRelationship extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Approved Properties</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approved Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved Properties</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcApprovalPropertyRelationship_ApprovedProperties()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcProperty> getApprovedProperties();

	/**
	 * Returns the value of the '<em><b>Approval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval</em>' reference.
	 * @see #setApproval(IfcApproval)
	 * @see IFC2X3.IFC2X3Package#getIfcApprovalPropertyRelationship_Approval()
	 * @model required="true"
	 * @generated
	 */
	IfcApproval getApproval();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApprovalPropertyRelationship#getApproval <em>Approval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval</em>' reference.
	 * @see #getApproval()
	 * @generated
	 */
	void setApproval(IfcApproval value);

} // IfcApprovalPropertyRelationship
