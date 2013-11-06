/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcMonetaryUnitImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Monetary Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMonetaryUnit#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMonetaryUnit()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMonetaryUnitImplAdapter.class)
public interface IfcMonetaryUnit extends IfcUnit {
	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcCurrencyEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see IFC2X3.IfcCurrencyEnum
	 * @see #isSetCurrency()
	 * @see #unsetCurrency()
	 * @see #setCurrency(IfcCurrencyEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcMonetaryUnit_Currency()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcCurrencyEnum getCurrency();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMonetaryUnit#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see IFC2X3.IfcCurrencyEnum
	 * @see #isSetCurrency()
	 * @see #unsetCurrency()
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(IfcCurrencyEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMonetaryUnit#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrency()
	 * @see #getCurrency()
	 * @see #setCurrency(IfcCurrencyEnum)
	 * @generated
	 */
	void unsetCurrency();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMonetaryUnit#getCurrency <em>Currency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Currency</em>' attribute is set.
	 * @see #unsetCurrency()
	 * @see #getCurrency()
	 * @see #setCurrency(IfcCurrencyEnum)
	 * @generated
	 */
	boolean isSetCurrency();

} // IfcMonetaryUnit
