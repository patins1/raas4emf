/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPropertyBoundedValueImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Bounded Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPropertyBoundedValue#getUpperBoundValue <em>Upper Bound Value</em>}</li>
 *   <li>{@link IFC2X3.IfcPropertyBoundedValue#getLowerBoundValue <em>Lower Bound Value</em>}</li>
 *   <li>{@link IFC2X3.IfcPropertyBoundedValue#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPropertyBoundedValue()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPropertyBoundedValueImplAdapter.class)
public interface IfcPropertyBoundedValue extends IfcSimpleProperty {
	/**
	 * Returns the value of the '<em><b>Upper Bound Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound Value</em>' containment reference.
	 * @see #setUpperBoundValue(IfcValue)
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyBoundedValue_UpperBoundValue()
	 * @model containment="true"
	 * @generated
	 */
	IfcValue getUpperBoundValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertyBoundedValue#getUpperBoundValue <em>Upper Bound Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound Value</em>' containment reference.
	 * @see #getUpperBoundValue()
	 * @generated
	 */
	void setUpperBoundValue(IfcValue value);

	/**
	 * Returns the value of the '<em><b>Lower Bound Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound Value</em>' containment reference.
	 * @see #setLowerBoundValue(IfcValue)
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyBoundedValue_LowerBoundValue()
	 * @model containment="true"
	 * @generated
	 */
	IfcValue getLowerBoundValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertyBoundedValue#getLowerBoundValue <em>Lower Bound Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound Value</em>' containment reference.
	 * @see #getLowerBoundValue()
	 * @generated
	 */
	void setLowerBoundValue(IfcValue value);

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
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyBoundedValue_Unit()
	 * @model
	 * @generated
	 */
	IfcUnit getUnit();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertyBoundedValue#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(IfcUnit value);

} // IfcPropertyBoundedValue
