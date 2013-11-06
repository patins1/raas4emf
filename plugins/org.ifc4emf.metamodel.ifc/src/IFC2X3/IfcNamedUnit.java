/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcNamedUnitImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Named Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcNamedUnit#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link IFC2X3.IfcNamedUnit#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcNamedUnit()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcNamedUnitImplAdapter.class)
public interface IfcNamedUnit extends IfcUnit {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' reference.
	 * @see #setDimensions(IfcDimensionalExponents)
	 * @see IFC2X3.IFC2X3Package#getIfcNamedUnit_Dimensions()
	 * @model required="true"
	 * @generated
	 */
	IfcDimensionalExponents getDimensions();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcNamedUnit#getDimensions <em>Dimensions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(IfcDimensionalExponents value);

	/**
	 * Returns the value of the '<em><b>Unit Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcUnitEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Type</em>' attribute.
	 * @see IFC2X3.IfcUnitEnum
	 * @see #isSetUnitType()
	 * @see #unsetUnitType()
	 * @see #setUnitType(IfcUnitEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcNamedUnit_UnitType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcUnitEnum getUnitType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcNamedUnit#getUnitType <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Type</em>' attribute.
	 * @see IFC2X3.IfcUnitEnum
	 * @see #isSetUnitType()
	 * @see #unsetUnitType()
	 * @see #getUnitType()
	 * @generated
	 */
	void setUnitType(IfcUnitEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcNamedUnit#getUnitType <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnitType()
	 * @see #getUnitType()
	 * @see #setUnitType(IfcUnitEnum)
	 * @generated
	 */
	void unsetUnitType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcNamedUnit#getUnitType <em>Unit Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit Type</em>' attribute is set.
	 * @see #unsetUnitType()
	 * @see #getUnitType()
	 * @see #setUnitType(IfcUnitEnum)
	 * @generated
	 */
	boolean isSetUnitType();

} // IfcNamedUnit
