/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPileImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Pile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPile#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.IfcPile#getConstructionType <em>Construction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPile()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPileImplAdapter.class)
public interface IfcPile extends IfcBuildingElement {
	/**
	 * Returns the value of the '<em><b>Construction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcPileConstructionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Type</em>' attribute.
	 * @see IFC2X3.IfcPileConstructionEnum
	 * @see #isSetConstructionType()
	 * @see #unsetConstructionType()
	 * @see #setConstructionType(IfcPileConstructionEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcPile_ConstructionType()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPileConstructionEnum getConstructionType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPile#getConstructionType <em>Construction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Type</em>' attribute.
	 * @see IFC2X3.IfcPileConstructionEnum
	 * @see #isSetConstructionType()
	 * @see #unsetConstructionType()
	 * @see #getConstructionType()
	 * @generated
	 */
	void setConstructionType(IfcPileConstructionEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPile#getConstructionType <em>Construction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstructionType()
	 * @see #getConstructionType()
	 * @see #setConstructionType(IfcPileConstructionEnum)
	 * @generated
	 */
	void unsetConstructionType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPile#getConstructionType <em>Construction Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Construction Type</em>' attribute is set.
	 * @see #unsetConstructionType()
	 * @see #getConstructionType()
	 * @see #setConstructionType(IfcPileConstructionEnum)
	 * @generated
	 */
	boolean isSetConstructionType();

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcPileTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcPileTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcPileTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcPile_PredefinedType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcPileTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPile#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcPileTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcPileTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPile#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcPileTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPile#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcPileTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

} // IfcPile
