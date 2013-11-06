/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelConnectsStructuralElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Structural Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelConnectsStructuralElement#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsStructuralElement#getRelatedStructuralMember <em>Related Structural Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelConnectsStructuralElementImplAdapter.class)
public interface IfcRelConnectsStructuralElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Structural Member</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralMember#getReferencesElement <em>References Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Structural Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Structural Member</em>' reference.
	 * @see #setRelatedStructuralMember(IfcStructuralMember)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralElement_RelatedStructuralMember()
	 * @see IFC2X3.IfcStructuralMember#getReferencesElement
	 * @model opposite="ReferencesElement" required="true"
	 * @generated
	 */
	IfcStructuralMember getRelatedStructuralMember();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsStructuralElement#getRelatedStructuralMember <em>Related Structural Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Structural Member</em>' reference.
	 * @see #getRelatedStructuralMember()
	 * @generated
	 */
	void setRelatedStructuralMember(IfcStructuralMember value);

	/**
	 * Returns the value of the '<em><b>Relating Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcElement#getHasStructuralMember <em>Has Structural Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Element</em>' reference.
	 * @see #setRelatingElement(IfcElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralElement_RelatingElement()
	 * @see IFC2X3.IfcElement#getHasStructuralMember
	 * @model opposite="HasStructuralMember" required="true"
	 * @generated
	 */
	IfcElement getRelatingElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsStructuralElement#getRelatingElement <em>Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Element</em>' reference.
	 * @see #getRelatingElement()
	 * @generated
	 */
	void setRelatingElement(IfcElement value);

} // IfcRelConnectsStructuralElement
