/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcQuantityWeightImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Quantity Weight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcQuantityWeight#getWeightValue <em>Weight Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcQuantityWeight()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcQuantityWeightImplAdapter.class)
public interface IfcQuantityWeight extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Weight Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Value</em>' attribute.
	 * @see #isSetWeightValue()
	 * @see #unsetWeightValue()
	 * @see #setWeightValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcQuantityWeight_WeightValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getWeightValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcQuantityWeight#getWeightValue <em>Weight Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Value</em>' attribute.
	 * @see #isSetWeightValue()
	 * @see #unsetWeightValue()
	 * @see #getWeightValue()
	 * @generated
	 */
	void setWeightValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcQuantityWeight#getWeightValue <em>Weight Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeightValue()
	 * @see #getWeightValue()
	 * @see #setWeightValue(Double)
	 * @generated
	 */
	void unsetWeightValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcQuantityWeight#getWeightValue <em>Weight Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Weight Value</em>' attribute is set.
	 * @see #unsetWeightValue()
	 * @see #getWeightValue()
	 * @see #setWeightValue(Double)
	 * @generated
	 */
	boolean isSetWeightValue();

} // IfcQuantityWeight
