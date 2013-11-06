/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPhysicalSimpleQuantityImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Physical Simple Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPhysicalSimpleQuantity#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPhysicalSimpleQuantity()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPhysicalSimpleQuantityImplAdapter.class)
public interface IfcPhysicalSimpleQuantity extends IfcPhysicalQuantity {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(IfcNamedUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcPhysicalSimpleQuantity_Unit()
	 * @model
	 * @generated
	 */
	IfcNamedUnit getUnit();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPhysicalSimpleQuantity#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(IfcNamedUnit value);

} // IfcPhysicalSimpleQuantity
