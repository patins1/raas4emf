/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDoorStyleImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Door Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDoorStyle#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorStyle#getConstructionType <em>Construction Type</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorStyle#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorStyle#getSizeable <em>Sizeable</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDoorStyle()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDoorStyleImplAdapter.class)
public interface IfcDoorStyle extends IfcTypeProduct {
	/**
	 * Returns the value of the '<em><b>Sizeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sizeable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizeable</em>' attribute.
	 * @see #isSetSizeable()
	 * @see #unsetSizeable()
	 * @see #setSizeable(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorStyle_Sizeable()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getSizeable();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorStyle#getSizeable <em>Sizeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sizeable</em>' attribute.
	 * @see #isSetSizeable()
	 * @see #unsetSizeable()
	 * @see #getSizeable()
	 * @generated
	 */
	void setSizeable(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorStyle#getSizeable <em>Sizeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeable()
	 * @see #getSizeable()
	 * @see #setSizeable(Boolean)
	 * @generated
	 */
	void unsetSizeable();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorStyle#getSizeable <em>Sizeable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sizeable</em>' attribute is set.
	 * @see #unsetSizeable()
	 * @see #getSizeable()
	 * @see #setSizeable(Boolean)
	 * @generated
	 */
	boolean isSetSizeable();

	/**
	 * Returns the value of the '<em><b>Parameter Takes Precedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Takes Precedence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Takes Precedence</em>' attribute.
	 * @see #isSetParameterTakesPrecedence()
	 * @see #unsetParameterTakesPrecedence()
	 * @see #setParameterTakesPrecedence(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorStyle_ParameterTakesPrecedence()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getParameterTakesPrecedence();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorStyle#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Takes Precedence</em>' attribute.
	 * @see #isSetParameterTakesPrecedence()
	 * @see #unsetParameterTakesPrecedence()
	 * @see #getParameterTakesPrecedence()
	 * @generated
	 */
	void setParameterTakesPrecedence(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorStyle#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParameterTakesPrecedence()
	 * @see #getParameterTakesPrecedence()
	 * @see #setParameterTakesPrecedence(Boolean)
	 * @generated
	 */
	void unsetParameterTakesPrecedence();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorStyle#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parameter Takes Precedence</em>' attribute is set.
	 * @see #unsetParameterTakesPrecedence()
	 * @see #getParameterTakesPrecedence()
	 * @see #setParameterTakesPrecedence(Boolean)
	 * @generated
	 */
	boolean isSetParameterTakesPrecedence();

	/**
	 * Returns the value of the '<em><b>Construction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcDoorStyleConstructionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Type</em>' attribute.
	 * @see IFC2X3.IfcDoorStyleConstructionEnum
	 * @see #isSetConstructionType()
	 * @see #unsetConstructionType()
	 * @see #setConstructionType(IfcDoorStyleConstructionEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorStyle_ConstructionType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcDoorStyleConstructionEnum getConstructionType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorStyle#getConstructionType <em>Construction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Type</em>' attribute.
	 * @see IFC2X3.IfcDoorStyleConstructionEnum
	 * @see #isSetConstructionType()
	 * @see #unsetConstructionType()
	 * @see #getConstructionType()
	 * @generated
	 */
	void setConstructionType(IfcDoorStyleConstructionEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorStyle#getConstructionType <em>Construction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstructionType()
	 * @see #getConstructionType()
	 * @see #setConstructionType(IfcDoorStyleConstructionEnum)
	 * @generated
	 */
	void unsetConstructionType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorStyle#getConstructionType <em>Construction Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Construction Type</em>' attribute is set.
	 * @see #unsetConstructionType()
	 * @see #getConstructionType()
	 * @see #setConstructionType(IfcDoorStyleConstructionEnum)
	 * @generated
	 */
	boolean isSetConstructionType();

	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcDoorStyleOperationEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see IFC2X3.IfcDoorStyleOperationEnum
	 * @see #isSetOperationType()
	 * @see #unsetOperationType()
	 * @see #setOperationType(IfcDoorStyleOperationEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorStyle_OperationType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcDoorStyleOperationEnum getOperationType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorStyle#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see IFC2X3.IfcDoorStyleOperationEnum
	 * @see #isSetOperationType()
	 * @see #unsetOperationType()
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(IfcDoorStyleOperationEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorStyle#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperationType()
	 * @see #getOperationType()
	 * @see #setOperationType(IfcDoorStyleOperationEnum)
	 * @generated
	 */
	void unsetOperationType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorStyle#getOperationType <em>Operation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operation Type</em>' attribute is set.
	 * @see #unsetOperationType()
	 * @see #getOperationType()
	 * @see #setOperationType(IfcDoorStyleOperationEnum)
	 * @generated
	 */
	boolean isSetOperationType();

} // IfcDoorStyle
