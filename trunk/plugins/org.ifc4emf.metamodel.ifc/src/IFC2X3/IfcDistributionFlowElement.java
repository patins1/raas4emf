/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDistributionFlowElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Distribution Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDistributionFlowElement#getHasControlElements <em>Has Control Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDistributionFlowElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDistributionFlowElementImplAdapter.class)
public interface IfcDistributionFlowElement extends IfcDistributionElement {
	/**
	 * Returns the value of the '<em><b>Has Control Elements</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelFlowControlElements#getRelatingFlowElement <em>Relating Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Control Elements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Control Elements</em>' reference.
	 * @see #setHasControlElements(IfcRelFlowControlElements)
	 * @see IFC2X3.IFC2X3Package#getIfcDistributionFlowElement_HasControlElements()
	 * @see IFC2X3.IfcRelFlowControlElements#getRelatingFlowElement
	 * @model opposite="RelatingFlowElement" ordered="false"
	 * @generated
	 */
	IfcRelFlowControlElements getHasControlElements();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDistributionFlowElement#getHasControlElements <em>Has Control Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Control Elements</em>' reference.
	 * @see #getHasControlElements()
	 * @generated
	 */
	void setHasControlElements(IfcRelFlowControlElements value);

} // IfcDistributionFlowElement
