/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcEnvironmentalImpactValueImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Environmental Impact Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcEnvironmentalImpactValue#getImpactType <em>Impact Type</em>}</li>
 *   <li>{@link IFC2X3.IfcEnvironmentalImpactValue#getCategory <em>Category</em>}</li>
 *   <li>{@link IFC2X3.IfcEnvironmentalImpactValue#getUserDefinedCategory <em>User Defined Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcEnvironmentalImpactValue()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcEnvironmentalImpactValueImplAdapter.class)
public interface IfcEnvironmentalImpactValue extends IfcAppliedValue {
	/**
	 * Returns the value of the '<em><b>User Defined Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Category</em>' attribute.
	 * @see #isSetUserDefinedCategory()
	 * @see #unsetUserDefinedCategory()
	 * @see #setUserDefinedCategory(String)
	 * @see IFC2X3.IFC2X3Package#getIfcEnvironmentalImpactValue_UserDefinedCategory()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedCategory();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcEnvironmentalImpactValue#getUserDefinedCategory <em>User Defined Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Category</em>' attribute.
	 * @see #isSetUserDefinedCategory()
	 * @see #unsetUserDefinedCategory()
	 * @see #getUserDefinedCategory()
	 * @generated
	 */
	void setUserDefinedCategory(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcEnvironmentalImpactValue#getUserDefinedCategory <em>User Defined Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedCategory()
	 * @see #getUserDefinedCategory()
	 * @see #setUserDefinedCategory(String)
	 * @generated
	 */
	void unsetUserDefinedCategory();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcEnvironmentalImpactValue#getUserDefinedCategory <em>User Defined Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Category</em>' attribute is set.
	 * @see #unsetUserDefinedCategory()
	 * @see #getUserDefinedCategory()
	 * @see #setUserDefinedCategory(String)
	 * @generated
	 */
	boolean isSetUserDefinedCategory();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcEnvironmentalImpactCategoryEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see IFC2X3.IfcEnvironmentalImpactCategoryEnum
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(IfcEnvironmentalImpactCategoryEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcEnvironmentalImpactValue_Category()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcEnvironmentalImpactCategoryEnum getCategory();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcEnvironmentalImpactValue#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see IFC2X3.IfcEnvironmentalImpactCategoryEnum
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(IfcEnvironmentalImpactCategoryEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcEnvironmentalImpactValue#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(IfcEnvironmentalImpactCategoryEnum)
	 * @generated
	 */
	void unsetCategory();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcEnvironmentalImpactValue#getCategory <em>Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Category</em>' attribute is set.
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @see #setCategory(IfcEnvironmentalImpactCategoryEnum)
	 * @generated
	 */
	boolean isSetCategory();

	/**
	 * Returns the value of the '<em><b>Impact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impact Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Type</em>' attribute.
	 * @see #isSetImpactType()
	 * @see #unsetImpactType()
	 * @see #setImpactType(String)
	 * @see IFC2X3.IFC2X3Package#getIfcEnvironmentalImpactValue_ImpactType()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getImpactType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcEnvironmentalImpactValue#getImpactType <em>Impact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Type</em>' attribute.
	 * @see #isSetImpactType()
	 * @see #unsetImpactType()
	 * @see #getImpactType()
	 * @generated
	 */
	void setImpactType(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcEnvironmentalImpactValue#getImpactType <em>Impact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImpactType()
	 * @see #getImpactType()
	 * @see #setImpactType(String)
	 * @generated
	 */
	void unsetImpactType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcEnvironmentalImpactValue#getImpactType <em>Impact Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impact Type</em>' attribute is set.
	 * @see #unsetImpactType()
	 * @see #getImpactType()
	 * @see #setImpactType(String)
	 * @generated
	 */
	boolean isSetImpactType();

} // IfcEnvironmentalImpactValue
