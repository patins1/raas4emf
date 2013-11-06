/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSlippageConnectionConditionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Slippage Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSlippageConnectionCondition#getSlippageX <em>Slippage X</em>}</li>
 *   <li>{@link IFC2X3.IfcSlippageConnectionCondition#getSlippageY <em>Slippage Y</em>}</li>
 *   <li>{@link IFC2X3.IfcSlippageConnectionCondition#getSlippageZ <em>Slippage Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSlippageConnectionCondition()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSlippageConnectionConditionImplAdapter.class)
public interface IfcSlippageConnectionCondition extends IfcStructuralConnectionCondition {
	/**
	 * Returns the value of the '<em><b>Slippage Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slippage Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slippage Z</em>' attribute.
	 * @see #isSetSlippageZ()
	 * @see #unsetSlippageZ()
	 * @see #setSlippageZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSlippageConnectionCondition_SlippageZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getSlippageZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSlippageConnectionCondition#getSlippageZ <em>Slippage Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slippage Z</em>' attribute.
	 * @see #isSetSlippageZ()
	 * @see #unsetSlippageZ()
	 * @see #getSlippageZ()
	 * @generated
	 */
	void setSlippageZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSlippageConnectionCondition#getSlippageZ <em>Slippage Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlippageZ()
	 * @see #getSlippageZ()
	 * @see #setSlippageZ(Double)
	 * @generated
	 */
	void unsetSlippageZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSlippageConnectionCondition#getSlippageZ <em>Slippage Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slippage Z</em>' attribute is set.
	 * @see #unsetSlippageZ()
	 * @see #getSlippageZ()
	 * @see #setSlippageZ(Double)
	 * @generated
	 */
	boolean isSetSlippageZ();

	/**
	 * Returns the value of the '<em><b>Slippage Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slippage Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slippage Y</em>' attribute.
	 * @see #isSetSlippageY()
	 * @see #unsetSlippageY()
	 * @see #setSlippageY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSlippageConnectionCondition_SlippageY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getSlippageY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSlippageConnectionCondition#getSlippageY <em>Slippage Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slippage Y</em>' attribute.
	 * @see #isSetSlippageY()
	 * @see #unsetSlippageY()
	 * @see #getSlippageY()
	 * @generated
	 */
	void setSlippageY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSlippageConnectionCondition#getSlippageY <em>Slippage Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlippageY()
	 * @see #getSlippageY()
	 * @see #setSlippageY(Double)
	 * @generated
	 */
	void unsetSlippageY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSlippageConnectionCondition#getSlippageY <em>Slippage Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slippage Y</em>' attribute is set.
	 * @see #unsetSlippageY()
	 * @see #getSlippageY()
	 * @see #setSlippageY(Double)
	 * @generated
	 */
	boolean isSetSlippageY();

	/**
	 * Returns the value of the '<em><b>Slippage X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slippage X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slippage X</em>' attribute.
	 * @see #isSetSlippageX()
	 * @see #unsetSlippageX()
	 * @see #setSlippageX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSlippageConnectionCondition_SlippageX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getSlippageX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSlippageConnectionCondition#getSlippageX <em>Slippage X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slippage X</em>' attribute.
	 * @see #isSetSlippageX()
	 * @see #unsetSlippageX()
	 * @see #getSlippageX()
	 * @generated
	 */
	void setSlippageX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSlippageConnectionCondition#getSlippageX <em>Slippage X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlippageX()
	 * @see #getSlippageX()
	 * @see #setSlippageX(Double)
	 * @generated
	 */
	void unsetSlippageX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSlippageConnectionCondition#getSlippageX <em>Slippage X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slippage X</em>' attribute is set.
	 * @see #unsetSlippageX()
	 * @see #getSlippageX()
	 * @see #setSlippageX(Double)
	 * @generated
	 */
	boolean isSetSlippageX();

} // IfcSlippageConnectionCondition
