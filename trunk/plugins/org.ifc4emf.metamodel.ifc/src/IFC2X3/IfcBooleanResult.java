/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBooleanResultImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Boolean Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcBooleanResult#getOperator <em>Operator</em>}</li>
 *   <li>{@link IFC2X3.IfcBooleanResult#getFirstOperand <em>First Operand</em>}</li>
 *   <li>{@link IFC2X3.IfcBooleanResult#getSecondOperand <em>Second Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcBooleanResult()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBooleanResultImplAdapter.class)
public interface IfcBooleanResult extends IfcBooleanOperand, IfcCsgSelect, IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>First Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Operand</em>' reference.
	 * @see #setFirstOperand(IfcBooleanOperand)
	 * @see IFC2X3.IFC2X3Package#getIfcBooleanResult_FirstOperand()
	 * @model required="true"
	 * @generated
	 */
	IfcBooleanOperand getFirstOperand();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBooleanResult#getFirstOperand <em>First Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Operand</em>' reference.
	 * @see #getFirstOperand()
	 * @generated
	 */
	void setFirstOperand(IfcBooleanOperand value);

	/**
	 * Returns the value of the '<em><b>Second Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Operand</em>' reference.
	 * @see #setSecondOperand(IfcBooleanOperand)
	 * @see IFC2X3.IFC2X3Package#getIfcBooleanResult_SecondOperand()
	 * @model required="true"
	 * @generated
	 */
	IfcBooleanOperand getSecondOperand();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBooleanResult#getSecondOperand <em>Second Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Operand</em>' reference.
	 * @see #getSecondOperand()
	 * @generated
	 */
	void setSecondOperand(IfcBooleanOperand value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcBooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see IFC2X3.IfcBooleanOperator
	 * @see #isSetOperator()
	 * @see #unsetOperator()
	 * @see #setOperator(IfcBooleanOperator)
	 * @see IFC2X3.IFC2X3Package#getIfcBooleanResult_Operator()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcBooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBooleanResult#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see IFC2X3.IfcBooleanOperator
	 * @see #isSetOperator()
	 * @see #unsetOperator()
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(IfcBooleanOperator value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBooleanResult#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperator()
	 * @see #getOperator()
	 * @see #setOperator(IfcBooleanOperator)
	 * @generated
	 */
	void unsetOperator();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBooleanResult#getOperator <em>Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operator</em>' attribute is set.
	 * @see #unsetOperator()
	 * @see #getOperator()
	 * @see #setOperator(IfcBooleanOperator)
	 * @generated
	 */
	boolean isSetOperator();

} // IfcBooleanResult
