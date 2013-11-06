/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSanitaryTerminalTypeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Sanitary Terminal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSanitaryTerminalType#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSanitaryTerminalType()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSanitaryTerminalTypeImplAdapter.class)
public interface IfcSanitaryTerminalType extends IfcFlowTerminalType {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcSanitaryTerminalTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcSanitaryTerminalTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcSanitaryTerminalTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcSanitaryTerminalType_PredefinedType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcSanitaryTerminalTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSanitaryTerminalType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcSanitaryTerminalTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcSanitaryTerminalTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSanitaryTerminalType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcSanitaryTerminalTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSanitaryTerminalType#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcSanitaryTerminalTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

} // IfcSanitaryTerminalType
