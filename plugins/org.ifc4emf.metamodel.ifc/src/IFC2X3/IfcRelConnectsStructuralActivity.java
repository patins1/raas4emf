/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelConnectsStructuralActivityImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelConnectsStructuralActivity#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsStructuralActivity#getRelatedStructuralActivity <em>Related Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralActivity()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelConnectsStructuralActivityImplAdapter.class)
public interface IfcRelConnectsStructuralActivity extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Structural Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralActivity#getAssignedToStructuralItem <em>Assigned To Structural Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Structural Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Structural Activity</em>' reference.
	 * @see #setRelatedStructuralActivity(IfcStructuralActivity)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralActivity_RelatedStructuralActivity()
	 * @see IFC2X3.IfcStructuralActivity#getAssignedToStructuralItem
	 * @model opposite="AssignedToStructuralItem" required="true"
	 * @generated
	 */
	IfcStructuralActivity getRelatedStructuralActivity();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsStructuralActivity#getRelatedStructuralActivity <em>Related Structural Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Structural Activity</em>' reference.
	 * @see #getRelatedStructuralActivity()
	 * @generated
	 */
	void setRelatedStructuralActivity(IfcStructuralActivity value);

	/**
	 * Returns the value of the '<em><b>Relating Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralActivityAssignmentSelect#getAssignedStructuralActivity <em>Assigned Structural Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Element</em>' reference.
	 * @see #setRelatingElement(IfcStructuralActivityAssignmentSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralActivity_RelatingElement()
	 * @see IFC2X3.IfcStructuralActivityAssignmentSelect#getAssignedStructuralActivity
	 * @model opposite="AssignedStructuralActivity" required="true"
	 * @generated
	 */
	IfcStructuralActivityAssignmentSelect getRelatingElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsStructuralActivity#getRelatingElement <em>Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Element</em>' reference.
	 * @see #getRelatingElement()
	 * @generated
	 */
	void setRelatingElement(IfcStructuralActivityAssignmentSelect value);

} // IfcRelConnectsStructuralActivity
