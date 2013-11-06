/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcAppliedValueRelationshipImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Applied Value Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcAppliedValueRelationship#getComponentOfTotal <em>Component Of Total</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValueRelationship#getComponents <em>Components</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValueRelationship#getArithmeticOperator <em>Arithmetic Operator</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValueRelationship#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValueRelationship#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcAppliedValueRelationship()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcAppliedValueRelationshipImplAdapter.class)
public interface IfcAppliedValueRelationship extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcAppliedValue}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcAppliedValue#getIsComponentIn <em>Is Component In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValueRelationship_Components()
	 * @see IFC2X3.IfcAppliedValue#getIsComponentIn
	 * @model opposite="IsComponentIn" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcAppliedValue> getComponents();

	/**
	 * Returns the value of the '<em><b>Component Of Total</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcAppliedValue#getValueOfComponents <em>Value Of Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Of Total</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Of Total</em>' reference.
	 * @see #setComponentOfTotal(IfcAppliedValue)
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValueRelationship_ComponentOfTotal()
	 * @see IFC2X3.IfcAppliedValue#getValueOfComponents
	 * @model opposite="ValueOfComponents" required="true"
	 * @generated
	 */
	IfcAppliedValue getComponentOfTotal();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValueRelationship#getComponentOfTotal <em>Component Of Total</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Of Total</em>' reference.
	 * @see #getComponentOfTotal()
	 * @generated
	 */
	void setComponentOfTotal(IfcAppliedValue value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValueRelationship_Description()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValueRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAppliedValueRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAppliedValueRelationship#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValueRelationship_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValueRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAppliedValueRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAppliedValueRelationship#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Arithmetic Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcArithmeticOperatorEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arithmetic Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arithmetic Operator</em>' attribute.
	 * @see IFC2X3.IfcArithmeticOperatorEnum
	 * @see #isSetArithmeticOperator()
	 * @see #unsetArithmeticOperator()
	 * @see #setArithmeticOperator(IfcArithmeticOperatorEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValueRelationship_ArithmeticOperator()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcArithmeticOperatorEnum getArithmeticOperator();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValueRelationship#getArithmeticOperator <em>Arithmetic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arithmetic Operator</em>' attribute.
	 * @see IFC2X3.IfcArithmeticOperatorEnum
	 * @see #isSetArithmeticOperator()
	 * @see #unsetArithmeticOperator()
	 * @see #getArithmeticOperator()
	 * @generated
	 */
	void setArithmeticOperator(IfcArithmeticOperatorEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAppliedValueRelationship#getArithmeticOperator <em>Arithmetic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArithmeticOperator()
	 * @see #getArithmeticOperator()
	 * @see #setArithmeticOperator(IfcArithmeticOperatorEnum)
	 * @generated
	 */
	void unsetArithmeticOperator();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAppliedValueRelationship#getArithmeticOperator <em>Arithmetic Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arithmetic Operator</em>' attribute is set.
	 * @see #unsetArithmeticOperator()
	 * @see #getArithmeticOperator()
	 * @see #setArithmeticOperator(IfcArithmeticOperatorEnum)
	 * @generated
	 */
	boolean isSetArithmeticOperator();

} // IfcAppliedValueRelationship
