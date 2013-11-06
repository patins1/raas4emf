/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcPropertyEnumeratedValueImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Enumerated Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPropertyEnumeratedValue#getEnumerationValues <em>Enumeration Values</em>}</li>
 *   <li>{@link IFC2X3.IfcPropertyEnumeratedValue#getEnumerationReference <em>Enumeration Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPropertyEnumeratedValue()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPropertyEnumeratedValueImplAdapter.class)
public interface IfcPropertyEnumeratedValue extends IfcSimpleProperty {
	/**
	 * Returns the value of the '<em><b>Enumeration Values</b></em>' containment reference list.
	 * The list contents are of type {@link IFC2X3.IfcValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Values</em>' containment reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyEnumeratedValue_EnumerationValues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IfcValue> getEnumerationValues();

	/**
	 * Returns the value of the '<em><b>Enumeration Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Reference</em>' reference.
	 * @see #setEnumerationReference(IfcPropertyEnumeration)
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyEnumeratedValue_EnumerationReference()
	 * @model
	 * @generated
	 */
	IfcPropertyEnumeration getEnumerationReference();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertyEnumeratedValue#getEnumerationReference <em>Enumeration Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Reference</em>' reference.
	 * @see #getEnumerationReference()
	 * @generated
	 */
	void setEnumerationReference(IfcPropertyEnumeration value);

} // IfcPropertyEnumeratedValue
