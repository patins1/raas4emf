/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDistributionControlElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Distribution Control Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDistributionControlElement#getControlElementId <em>Control Element Id</em>}</li>
 *   <li>{@link IFC2X3.IfcDistributionControlElement#getAssignedToFlowElement <em>Assigned To Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDistributionControlElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDistributionControlElementImplAdapter.class)
public interface IfcDistributionControlElement extends IfcDistributionElement {
	/**
	 * Returns the value of the '<em><b>Assigned To Flow Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelFlowControlElements#getRelatedControlElements <em>Related Control Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned To Flow Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To Flow Element</em>' reference.
	 * @see #setAssignedToFlowElement(IfcRelFlowControlElements)
	 * @see IFC2X3.IFC2X3Package#getIfcDistributionControlElement_AssignedToFlowElement()
	 * @see IFC2X3.IfcRelFlowControlElements#getRelatedControlElements
	 * @model opposite="RelatedControlElements" ordered="false"
	 * @generated
	 */
	IfcRelFlowControlElements getAssignedToFlowElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDistributionControlElement#getAssignedToFlowElement <em>Assigned To Flow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned To Flow Element</em>' reference.
	 * @see #getAssignedToFlowElement()
	 * @generated
	 */
	void setAssignedToFlowElement(IfcRelFlowControlElements value);

	/**
	 * Returns the value of the '<em><b>Control Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Element Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Element Id</em>' attribute.
	 * @see #isSetControlElementId()
	 * @see #unsetControlElementId()
	 * @see #setControlElementId(String)
	 * @see IFC2X3.IFC2X3Package#getIfcDistributionControlElement_ControlElementId()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getControlElementId();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDistributionControlElement#getControlElementId <em>Control Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Element Id</em>' attribute.
	 * @see #isSetControlElementId()
	 * @see #unsetControlElementId()
	 * @see #getControlElementId()
	 * @generated
	 */
	void setControlElementId(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDistributionControlElement#getControlElementId <em>Control Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlElementId()
	 * @see #getControlElementId()
	 * @see #setControlElementId(String)
	 * @generated
	 */
	void unsetControlElementId();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDistributionControlElement#getControlElementId <em>Control Element Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control Element Id</em>' attribute is set.
	 * @see #unsetControlElementId()
	 * @see #getControlElementId()
	 * @see #setControlElementId(String)
	 * @generated
	 */
	boolean isSetControlElementId();

} // IfcDistributionControlElement
