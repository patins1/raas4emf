/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcDerivedUnitImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Derived Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDerivedUnit#getElements <em>Elements</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedUnit#getUnitType <em>Unit Type</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedUnit#getUserDefinedType <em>User Defined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDerivedUnit()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDerivedUnitImplAdapter.class)
public interface IfcDerivedUnit extends IfcUnit {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcDerivedUnitElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedUnit_Elements()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcDerivedUnitElement> getElements();

	/**
	 * Returns the value of the '<em><b>User Defined Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Type</em>' attribute.
	 * @see #isSetUserDefinedType()
	 * @see #unsetUserDefinedType()
	 * @see #setUserDefinedType(String)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedUnit_UserDefinedType()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedUnit#getUserDefinedType <em>User Defined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Type</em>' attribute.
	 * @see #isSetUserDefinedType()
	 * @see #unsetUserDefinedType()
	 * @see #getUserDefinedType()
	 * @generated
	 */
	void setUserDefinedType(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedUnit#getUserDefinedType <em>User Defined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedType()
	 * @see #getUserDefinedType()
	 * @see #setUserDefinedType(String)
	 * @generated
	 */
	void unsetUserDefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedUnit#getUserDefinedType <em>User Defined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Type</em>' attribute is set.
	 * @see #unsetUserDefinedType()
	 * @see #getUserDefinedType()
	 * @see #setUserDefinedType(String)
	 * @generated
	 */
	boolean isSetUserDefinedType();

	/**
	 * Returns the value of the '<em><b>Unit Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcDerivedUnitEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Type</em>' attribute.
	 * @see IFC2X3.IfcDerivedUnitEnum
	 * @see #isSetUnitType()
	 * @see #unsetUnitType()
	 * @see #setUnitType(IfcDerivedUnitEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedUnit_UnitType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcDerivedUnitEnum getUnitType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedUnit#getUnitType <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Type</em>' attribute.
	 * @see IFC2X3.IfcDerivedUnitEnum
	 * @see #isSetUnitType()
	 * @see #unsetUnitType()
	 * @see #getUnitType()
	 * @generated
	 */
	void setUnitType(IfcDerivedUnitEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedUnit#getUnitType <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnitType()
	 * @see #getUnitType()
	 * @see #setUnitType(IfcDerivedUnitEnum)
	 * @generated
	 */
	void unsetUnitType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedUnit#getUnitType <em>Unit Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit Type</em>' attribute is set.
	 * @see #unsetUnitType()
	 * @see #getUnitType()
	 * @see #setUnitType(IfcDerivedUnitEnum)
	 * @generated
	 */
	boolean isSetUnitType();

} // IfcDerivedUnit
