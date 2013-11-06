/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcPropertyListValueImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property List Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPropertyListValue#getListValues <em>List Values</em>}</li>
 *   <li>{@link IFC2X3.IfcPropertyListValue#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPropertyListValue()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPropertyListValueImplAdapter.class)
public interface IfcPropertyListValue extends IfcSimpleProperty {
	/**
	 * Returns the value of the '<em><b>List Values</b></em>' containment reference list.
	 * The list contents are of type {@link IFC2X3.IfcValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Values</em>' containment reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyListValue_ListValues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IfcValue> getListValues();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(IfcUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyListValue_Unit()
	 * @model
	 * @generated
	 */
	IfcUnit getUnit();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertyListValue#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(IfcUnit value);

} // IfcPropertyListValue
