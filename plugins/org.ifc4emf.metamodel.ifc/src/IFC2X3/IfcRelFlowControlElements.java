/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRelFlowControlElementsImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Flow Control Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelFlowControlElements#getRelatedControlElements <em>Related Control Elements</em>}</li>
 *   <li>{@link IFC2X3.IfcRelFlowControlElements#getRelatingFlowElement <em>Relating Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelFlowControlElements()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelFlowControlElementsImplAdapter.class)
public interface IfcRelFlowControlElements extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Control Elements</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcDistributionControlElement}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcDistributionControlElement#getAssignedToFlowElement <em>Assigned To Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Control Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Control Elements</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRelFlowControlElements_RelatedControlElements()
	 * @see IFC2X3.IfcDistributionControlElement#getAssignedToFlowElement
	 * @model opposite="AssignedToFlowElement" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcDistributionControlElement> getRelatedControlElements();

	/**
	 * Returns the value of the '<em><b>Relating Flow Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcDistributionFlowElement#getHasControlElements <em>Has Control Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Flow Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Flow Element</em>' reference.
	 * @see #setRelatingFlowElement(IfcDistributionFlowElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelFlowControlElements_RelatingFlowElement()
	 * @see IFC2X3.IfcDistributionFlowElement#getHasControlElements
	 * @model opposite="HasControlElements" required="true"
	 * @generated
	 */
	IfcDistributionFlowElement getRelatingFlowElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelFlowControlElements#getRelatingFlowElement <em>Relating Flow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Flow Element</em>' reference.
	 * @see #getRelatingFlowElement()
	 * @generated
	 */
	void setRelatingFlowElement(IfcDistributionFlowElement value);

} // IfcRelFlowControlElements
