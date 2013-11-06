/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPortImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPort#getContainedIn <em>Contained In</em>}</li>
 *   <li>{@link IFC2X3.IfcPort#getConnectedFrom <em>Connected From</em>}</li>
 *   <li>{@link IFC2X3.IfcPort#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPort()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPortImplAdapter.class)
public interface IfcPort extends IfcProduct {
	/**
	 * Returns the value of the '<em><b>Contained In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsPortToElement#getRelatingPort <em>Relating Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In</em>' reference.
	 * @see #setContainedIn(IfcRelConnectsPortToElement)
	 * @see IFC2X3.IFC2X3Package#getIfcPort_ContainedIn()
	 * @see IFC2X3.IfcRelConnectsPortToElement#getRelatingPort
	 * @model opposite="RelatingPort" required="true"
	 * @generated
	 */
	IfcRelConnectsPortToElement getContainedIn();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPort#getContainedIn <em>Contained In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained In</em>' reference.
	 * @see #getContainedIn()
	 * @generated
	 */
	void setContainedIn(IfcRelConnectsPortToElement value);

	/**
	 * Returns the value of the '<em><b>Connected From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsPorts#getRelatedPort <em>Related Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected From</em>' reference.
	 * @see #setConnectedFrom(IfcRelConnectsPorts)
	 * @see IFC2X3.IFC2X3Package#getIfcPort_ConnectedFrom()
	 * @see IFC2X3.IfcRelConnectsPorts#getRelatedPort
	 * @model opposite="RelatedPort" ordered="false"
	 * @generated
	 */
	IfcRelConnectsPorts getConnectedFrom();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPort#getConnectedFrom <em>Connected From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected From</em>' reference.
	 * @see #getConnectedFrom()
	 * @generated
	 */
	void setConnectedFrom(IfcRelConnectsPorts value);

	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsPorts#getRelatingPort <em>Relating Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference.
	 * @see #setConnectedTo(IfcRelConnectsPorts)
	 * @see IFC2X3.IFC2X3Package#getIfcPort_ConnectedTo()
	 * @see IFC2X3.IfcRelConnectsPorts#getRelatingPort
	 * @model opposite="RelatingPort" ordered="false"
	 * @generated
	 */
	IfcRelConnectsPorts getConnectedTo();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPort#getConnectedTo <em>Connected To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected To</em>' reference.
	 * @see #getConnectedTo()
	 * @generated
	 */
	void setConnectedTo(IfcRelConnectsPorts value);

} // IfcPort
