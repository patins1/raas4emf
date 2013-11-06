/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcPropertyTableValueImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Table Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPropertyTableValue#getDefiningValues <em>Defining Values</em>}</li>
 *   <li>{@link IFC2X3.IfcPropertyTableValue#getDefinedValues <em>Defined Values</em>}</li>
 *   <li>{@link IFC2X3.IfcPropertyTableValue#getExpression <em>Expression</em>}</li>
 *   <li>{@link IFC2X3.IfcPropertyTableValue#getDefiningUnit <em>Defining Unit</em>}</li>
 *   <li>{@link IFC2X3.IfcPropertyTableValue#getDefinedUnit <em>Defined Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPropertyTableValue()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPropertyTableValueImplAdapter.class)
public interface IfcPropertyTableValue extends IfcSimpleProperty {
	/**
	 * Returns the value of the '<em><b>Defining Values</b></em>' containment reference list.
	 * The list contents are of type {@link IFC2X3.IfcValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Values</em>' containment reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyTableValue_DefiningValues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IfcValue> getDefiningValues();

	/**
	 * Returns the value of the '<em><b>Defined Values</b></em>' containment reference list.
	 * The list contents are of type {@link IFC2X3.IfcValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Values</em>' containment reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyTableValue_DefinedValues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IfcValue> getDefinedValues();

	/**
	 * Returns the value of the '<em><b>Defined Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Unit</em>' reference.
	 * @see #setDefinedUnit(IfcUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyTableValue_DefinedUnit()
	 * @model
	 * @generated
	 */
	IfcUnit getDefinedUnit();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertyTableValue#getDefinedUnit <em>Defined Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined Unit</em>' reference.
	 * @see #getDefinedUnit()
	 * @generated
	 */
	void setDefinedUnit(IfcUnit value);

	/**
	 * Returns the value of the '<em><b>Defining Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Unit</em>' reference.
	 * @see #setDefiningUnit(IfcUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyTableValue_DefiningUnit()
	 * @model
	 * @generated
	 */
	IfcUnit getDefiningUnit();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertyTableValue#getDefiningUnit <em>Defining Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Unit</em>' reference.
	 * @see #getDefiningUnit()
	 * @generated
	 */
	void setDefiningUnit(IfcUnit value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #isSetExpression()
	 * @see #unsetExpression()
	 * @see #setExpression(String)
	 * @see IFC2X3.IFC2X3Package#getIfcPropertyTableValue_Expression()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertyTableValue#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #isSetExpression()
	 * @see #unsetExpression()
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPropertyTableValue#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpression()
	 * @see #getExpression()
	 * @see #setExpression(String)
	 * @generated
	 */
	void unsetExpression();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPropertyTableValue#getExpression <em>Expression</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expression</em>' attribute is set.
	 * @see #unsetExpression()
	 * @see #getExpression()
	 * @see #setExpression(String)
	 * @generated
	 */
	boolean isSetExpression();

} // IfcPropertyTableValue
