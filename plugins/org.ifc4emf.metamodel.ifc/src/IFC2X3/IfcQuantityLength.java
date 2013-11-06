/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcQuantityLengthImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Quantity Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcQuantityLength#getLengthValue <em>Length Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcQuantityLength()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcQuantityLengthImplAdapter.class)
public interface IfcQuantityLength extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Length Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Value</em>' attribute.
	 * @see #isSetLengthValue()
	 * @see #unsetLengthValue()
	 * @see #setLengthValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcQuantityLength_LengthValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getLengthValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcQuantityLength#getLengthValue <em>Length Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Value</em>' attribute.
	 * @see #isSetLengthValue()
	 * @see #unsetLengthValue()
	 * @see #getLengthValue()
	 * @generated
	 */
	void setLengthValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcQuantityLength#getLengthValue <em>Length Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLengthValue()
	 * @see #getLengthValue()
	 * @see #setLengthValue(Double)
	 * @generated
	 */
	void unsetLengthValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcQuantityLength#getLengthValue <em>Length Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length Value</em>' attribute is set.
	 * @see #unsetLengthValue()
	 * @see #getLengthValue()
	 * @see #setLengthValue(Double)
	 * @generated
	 */
	boolean isSetLengthValue();

} // IfcQuantityLength
