/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPropertySingleValueImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Single Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPropertySingleValue#getNominalValue <em>Nominal Value</em>}</li>
 *   <li>{@link IFC2X3.IfcPropertySingleValue#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPropertySingleValue()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPropertySingleValueImplAdapter.class)
public interface IfcPropertySingleValue extends IfcSimpleProperty {
	/**
	 * Returns the value of the '<em><b>Nominal Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Value</em>' containment reference.
	 * @see #setNominalValue(IfcValue)
	 * @see IFC2X3.IFC2X3Package#getIfcPropertySingleValue_NominalValue()
	 * @model containment="true"
	 * @generated
	 */
	IfcValue getNominalValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertySingleValue#getNominalValue <em>Nominal Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Value</em>' containment reference.
	 * @see #getNominalValue()
	 * @generated
	 */
	void setNominalValue(IfcValue value);

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
	 * @see IFC2X3.IFC2X3Package#getIfcPropertySingleValue_Unit()
	 * @model
	 * @generated
	 */
	IfcUnit getUnit();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertySingleValue#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(IfcUnit value);

} // IfcPropertySingleValue
