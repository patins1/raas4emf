/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcElectricDistributionPointImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Electric Distribution Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcElectricDistributionPoint#getDistributionPointFunction <em>Distribution Point Function</em>}</li>
 *   <li>{@link IFC2X3.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcElectricDistributionPoint()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcElectricDistributionPointImplAdapter.class)
public interface IfcElectricDistributionPoint extends IfcFlowController {
	/**
	 * Returns the value of the '<em><b>User Defined Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Function</em>' attribute.
	 * @see #isSetUserDefinedFunction()
	 * @see #unsetUserDefinedFunction()
	 * @see #setUserDefinedFunction(String)
	 * @see IFC2X3.IFC2X3Package#getIfcElectricDistributionPoint_UserDefinedFunction()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedFunction();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Function</em>' attribute.
	 * @see #isSetUserDefinedFunction()
	 * @see #unsetUserDefinedFunction()
	 * @see #getUserDefinedFunction()
	 * @generated
	 */
	void setUserDefinedFunction(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedFunction()
	 * @see #getUserDefinedFunction()
	 * @see #setUserDefinedFunction(String)
	 * @generated
	 */
	void unsetUserDefinedFunction();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Function</em>' attribute is set.
	 * @see #unsetUserDefinedFunction()
	 * @see #getUserDefinedFunction()
	 * @see #setUserDefinedFunction(String)
	 * @generated
	 */
	boolean isSetUserDefinedFunction();

	/**
	 * Returns the value of the '<em><b>Distribution Point Function</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcElectricDistributionPointFunctionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution Point Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Point Function</em>' attribute.
	 * @see IFC2X3.IfcElectricDistributionPointFunctionEnum
	 * @see #isSetDistributionPointFunction()
	 * @see #unsetDistributionPointFunction()
	 * @see #setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcElectricDistributionPoint_DistributionPointFunction()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcElectricDistributionPointFunctionEnum getDistributionPointFunction();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElectricDistributionPoint#getDistributionPointFunction <em>Distribution Point Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Point Function</em>' attribute.
	 * @see IFC2X3.IfcElectricDistributionPointFunctionEnum
	 * @see #isSetDistributionPointFunction()
	 * @see #unsetDistributionPointFunction()
	 * @see #getDistributionPointFunction()
	 * @generated
	 */
	void setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElectricDistributionPoint#getDistributionPointFunction <em>Distribution Point Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistributionPointFunction()
	 * @see #getDistributionPointFunction()
	 * @see #setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum)
	 * @generated
	 */
	void unsetDistributionPointFunction();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElectricDistributionPoint#getDistributionPointFunction <em>Distribution Point Function</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distribution Point Function</em>' attribute is set.
	 * @see #unsetDistributionPointFunction()
	 * @see #getDistributionPointFunction()
	 * @see #setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum)
	 * @generated
	 */
	boolean isSetDistributionPointFunction();

} // IfcElectricDistributionPoint
