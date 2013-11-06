/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelConnectsPortsImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelConnectsPorts#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsPorts#getRelatedPort <em>Related Port</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsPorts#getRealizingElement <em>Realizing Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsPorts()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelConnectsPortsImplAdapter.class)
public interface IfcRelConnectsPorts extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPort#getConnectedFrom <em>Connected From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Port</em>' reference.
	 * @see #setRelatedPort(IfcPort)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsPorts_RelatedPort()
	 * @see IFC2X3.IfcPort#getConnectedFrom
	 * @model opposite="ConnectedFrom" required="true"
	 * @generated
	 */
	IfcPort getRelatedPort();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsPorts#getRelatedPort <em>Related Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Port</em>' reference.
	 * @see #getRelatedPort()
	 * @generated
	 */
	void setRelatedPort(IfcPort value);

	/**
	 * Returns the value of the '<em><b>Relating Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPort#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Port</em>' reference.
	 * @see #setRelatingPort(IfcPort)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsPorts_RelatingPort()
	 * @see IFC2X3.IfcPort#getConnectedTo
	 * @model opposite="ConnectedTo" required="true"
	 * @generated
	 */
	IfcPort getRelatingPort();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsPorts#getRelatingPort <em>Relating Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Port</em>' reference.
	 * @see #getRelatingPort()
	 * @generated
	 */
	void setRelatingPort(IfcPort value);

	/**
	 * Returns the value of the '<em><b>Realizing Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Element</em>' reference.
	 * @see #setRealizingElement(IfcElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsPorts_RealizingElement()
	 * @model
	 * @generated
	 */
	IfcElement getRealizingElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsPorts#getRealizingElement <em>Realizing Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizing Element</em>' reference.
	 * @see #getRealizingElement()
	 * @generated
	 */
	void setRealizingElement(IfcElement value);

} // IfcRelConnectsPorts
