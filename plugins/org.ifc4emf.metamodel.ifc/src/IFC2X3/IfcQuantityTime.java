/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcQuantityTimeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Quantity Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcQuantityTime#getTimeValue <em>Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcQuantityTime()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcQuantityTimeImplAdapter.class)
public interface IfcQuantityTime extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Value</em>' attribute.
	 * @see #isSetTimeValue()
	 * @see #unsetTimeValue()
	 * @see #setTimeValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcQuantityTime_TimeValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getTimeValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcQuantityTime#getTimeValue <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value</em>' attribute.
	 * @see #isSetTimeValue()
	 * @see #unsetTimeValue()
	 * @see #getTimeValue()
	 * @generated
	 */
	void setTimeValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcQuantityTime#getTimeValue <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeValue()
	 * @see #getTimeValue()
	 * @see #setTimeValue(Double)
	 * @generated
	 */
	void unsetTimeValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcQuantityTime#getTimeValue <em>Time Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Value</em>' attribute is set.
	 * @see #unsetTimeValue()
	 * @see #getTimeValue()
	 * @see #setTimeValue(Double)
	 * @generated
	 */
	boolean isSetTimeValue();

} // IfcQuantityTime
