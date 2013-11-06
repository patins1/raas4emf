/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRelConnectsWithRealizingElementsImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects With Realizing Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelConnectsWithRealizingElements#getRealizingElements <em>Realizing Elements</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsWithRealizingElements#getConnectionType <em>Connection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsWithRealizingElements()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelConnectsWithRealizingElementsImplAdapter.class)
public interface IfcRelConnectsWithRealizingElements extends IfcRelConnectsElements {
	/**
	 * Returns the value of the '<em><b>Realizing Elements</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcElement}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcElement#getIsConnectionRealization <em>Is Connection Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Elements</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsWithRealizingElements_RealizingElements()
	 * @see IFC2X3.IfcElement#getIsConnectionRealization
	 * @model opposite="IsConnectionRealization" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcElement> getRealizingElements();

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see #isSetConnectionType()
	 * @see #unsetConnectionType()
	 * @see #setConnectionType(String)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsWithRealizingElements_ConnectionType()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getConnectionType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsWithRealizingElements#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' attribute.
	 * @see #isSetConnectionType()
	 * @see #unsetConnectionType()
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelConnectsWithRealizingElements#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionType()
	 * @see #getConnectionType()
	 * @see #setConnectionType(String)
	 * @generated
	 */
	void unsetConnectionType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelConnectsWithRealizingElements#getConnectionType <em>Connection Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection Type</em>' attribute is set.
	 * @see #unsetConnectionType()
	 * @see #getConnectionType()
	 * @see #setConnectionType(String)
	 * @generated
	 */
	boolean isSetConnectionType();

} // IfcRelConnectsWithRealizingElements
