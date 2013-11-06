/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcActionRequestImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Action Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcActionRequest#getRequestID <em>Request ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcActionRequest()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcActionRequestImplAdapter.class)
public interface IfcActionRequest extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Request ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request ID</em>' attribute.
	 * @see #isSetRequestID()
	 * @see #unsetRequestID()
	 * @see #setRequestID(String)
	 * @see IFC2X3.IFC2X3Package#getIfcActionRequest_RequestID()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getRequestID();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcActionRequest#getRequestID <em>Request ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request ID</em>' attribute.
	 * @see #isSetRequestID()
	 * @see #unsetRequestID()
	 * @see #getRequestID()
	 * @generated
	 */
	void setRequestID(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcActionRequest#getRequestID <em>Request ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestID()
	 * @see #getRequestID()
	 * @see #setRequestID(String)
	 * @generated
	 */
	void unsetRequestID();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcActionRequest#getRequestID <em>Request ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request ID</em>' attribute is set.
	 * @see #unsetRequestID()
	 * @see #getRequestID()
	 * @see #setRequestID(String)
	 * @generated
	 */
	boolean isSetRequestID();

} // IfcActionRequest
