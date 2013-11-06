/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelConnectsPortToElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Port To Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelConnectsPortToElement#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsPortToElement#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsPortToElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelConnectsPortToElementImplAdapter.class)
public interface IfcRelConnectsPortToElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPort#getContainedIn <em>Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Port</em>' reference.
	 * @see #setRelatingPort(IfcPort)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsPortToElement_RelatingPort()
	 * @see IFC2X3.IfcPort#getContainedIn
	 * @model opposite="ContainedIn" required="true"
	 * @generated
	 */
	IfcPort getRelatingPort();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsPortToElement#getRelatingPort <em>Relating Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Port</em>' reference.
	 * @see #getRelatingPort()
	 * @generated
	 */
	void setRelatingPort(IfcPort value);

	/**
	 * Returns the value of the '<em><b>Related Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcElement#getHasPorts <em>Has Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Element</em>' reference.
	 * @see #setRelatedElement(IfcElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsPortToElement_RelatedElement()
	 * @see IFC2X3.IfcElement#getHasPorts
	 * @model opposite="HasPorts" required="true"
	 * @generated
	 */
	IfcElement getRelatedElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsPortToElement#getRelatedElement <em>Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Element</em>' reference.
	 * @see #getRelatedElement()
	 * @generated
	 */
	void setRelatedElement(IfcElement value);

} // IfcRelConnectsPortToElement
