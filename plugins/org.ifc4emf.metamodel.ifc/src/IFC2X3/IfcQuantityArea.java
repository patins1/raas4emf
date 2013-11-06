/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcQuantityAreaImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Quantity Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcQuantityArea#getAreaValue <em>Area Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcQuantityArea()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcQuantityAreaImplAdapter.class)
public interface IfcQuantityArea extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Area Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Value</em>' attribute.
	 * @see #isSetAreaValue()
	 * @see #unsetAreaValue()
	 * @see #setAreaValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcQuantityArea_AreaValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getAreaValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcQuantityArea#getAreaValue <em>Area Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Value</em>' attribute.
	 * @see #isSetAreaValue()
	 * @see #unsetAreaValue()
	 * @see #getAreaValue()
	 * @generated
	 */
	void setAreaValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcQuantityArea#getAreaValue <em>Area Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAreaValue()
	 * @see #getAreaValue()
	 * @see #setAreaValue(Double)
	 * @generated
	 */
	void unsetAreaValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcQuantityArea#getAreaValue <em>Area Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Area Value</em>' attribute is set.
	 * @see #unsetAreaValue()
	 * @see #getAreaValue()
	 * @see #setAreaValue(Double)
	 * @generated
	 */
	boolean isSetAreaValue();

} // IfcQuantityArea
