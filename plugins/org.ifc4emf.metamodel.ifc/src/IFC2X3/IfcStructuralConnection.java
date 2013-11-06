/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcStructuralConnectionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralConnection#getAppliedCondition <em>Applied Condition</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralConnection#getConnectsStructuralMembers <em>Connects Structural Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralConnection()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralConnectionImplAdapter.class)
public interface IfcStructuralConnection extends IfcStructuralItem {
	/**
	 * Returns the value of the '<em><b>Connects Structural Members</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelConnectsStructuralMember}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsStructuralMember#getRelatedStructuralConnection <em>Related Structural Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connects Structural Members</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects Structural Members</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralConnection_ConnectsStructuralMembers()
	 * @see IFC2X3.IfcRelConnectsStructuralMember#getRelatedStructuralConnection
	 * @model opposite="RelatedStructuralConnection" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcRelConnectsStructuralMember> getConnectsStructuralMembers();

	/**
	 * Returns the value of the '<em><b>Applied Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Condition</em>' reference.
	 * @see #setAppliedCondition(IfcBoundaryCondition)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralConnection_AppliedCondition()
	 * @model
	 * @generated
	 */
	IfcBoundaryCondition getAppliedCondition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralConnection#getAppliedCondition <em>Applied Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Condition</em>' reference.
	 * @see #getAppliedCondition()
	 * @generated
	 */
	void setAppliedCondition(IfcBoundaryCondition value);

} // IfcStructuralConnection
