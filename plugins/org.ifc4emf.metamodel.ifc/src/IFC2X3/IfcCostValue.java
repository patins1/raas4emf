/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCostValueImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cost Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCostValue#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link IFC2X3.IfcCostValue#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCostValue()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCostValueImplAdapter.class)
public interface IfcCostValue extends IfcAppliedValue {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #isSetCondition()
	 * @see #unsetCondition()
	 * @see #setCondition(String)
	 * @see IFC2X3.IFC2X3Package#getIfcCostValue_Condition()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCostValue#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #isSetCondition()
	 * @see #unsetCondition()
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCostValue#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCondition()
	 * @see #getCondition()
	 * @see #setCondition(String)
	 * @generated
	 */
	void unsetCondition();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCostValue#getCondition <em>Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition</em>' attribute is set.
	 * @see #unsetCondition()
	 * @see #getCondition()
	 * @see #setCondition(String)
	 * @generated
	 */
	boolean isSetCondition();

	/**
	 * Returns the value of the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Type</em>' attribute.
	 * @see #isSetCostType()
	 * @see #unsetCostType()
	 * @see #setCostType(String)
	 * @see IFC2X3.IFC2X3Package#getIfcCostValue_CostType()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getCostType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCostValue#getCostType <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Type</em>' attribute.
	 * @see #isSetCostType()
	 * @see #unsetCostType()
	 * @see #getCostType()
	 * @generated
	 */
	void setCostType(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCostValue#getCostType <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCostType()
	 * @see #getCostType()
	 * @see #setCostType(String)
	 * @generated
	 */
	void unsetCostType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCostValue#getCostType <em>Cost Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost Type</em>' attribute is set.
	 * @see #unsetCostType()
	 * @see #getCostType()
	 * @see #setCostType(String)
	 * @generated
	 */
	boolean isSetCostType();

} // IfcCostValue
