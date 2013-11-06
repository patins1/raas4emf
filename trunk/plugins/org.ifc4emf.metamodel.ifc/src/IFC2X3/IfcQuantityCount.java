/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcQuantityCountImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Quantity Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcQuantityCount#getCountValue <em>Count Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcQuantityCount()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcQuantityCountImplAdapter.class)
public interface IfcQuantityCount extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Count Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Value</em>' attribute.
	 * @see #isSetCountValue()
	 * @see #unsetCountValue()
	 * @see #setCountValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcQuantityCount_CountValue()
	 * @model unsettable="true" dataType="IFC2X3.NUMBER" required="true"
	 * @generated
	 */
	Double getCountValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcQuantityCount#getCountValue <em>Count Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Value</em>' attribute.
	 * @see #isSetCountValue()
	 * @see #unsetCountValue()
	 * @see #getCountValue()
	 * @generated
	 */
	void setCountValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcQuantityCount#getCountValue <em>Count Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCountValue()
	 * @see #getCountValue()
	 * @see #setCountValue(Double)
	 * @generated
	 */
	void unsetCountValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcQuantityCount#getCountValue <em>Count Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Count Value</em>' attribute is set.
	 * @see #unsetCountValue()
	 * @see #getCountValue()
	 * @see #setCountValue(Double)
	 * @generated
	 */
	boolean isSetCountValue();

} // IfcQuantityCount
