/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcProcedureImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcProcedure#getProcedureID <em>Procedure ID</em>}</li>
 *   <li>{@link IFC2X3.IfcProcedure#getProcedureType <em>Procedure Type</em>}</li>
 *   <li>{@link IFC2X3.IfcProcedure#getUserDefinedProcedureType <em>User Defined Procedure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcProcedure()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcProcedureImplAdapter.class)
public interface IfcProcedure extends IfcProcess {
	/**
	 * Returns the value of the '<em><b>User Defined Procedure Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Procedure Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Procedure Type</em>' attribute.
	 * @see #isSetUserDefinedProcedureType()
	 * @see #unsetUserDefinedProcedureType()
	 * @see #setUserDefinedProcedureType(String)
	 * @see IFC2X3.IFC2X3Package#getIfcProcedure_UserDefinedProcedureType()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedProcedureType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProcedure#getUserDefinedProcedureType <em>User Defined Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Procedure Type</em>' attribute.
	 * @see #isSetUserDefinedProcedureType()
	 * @see #unsetUserDefinedProcedureType()
	 * @see #getUserDefinedProcedureType()
	 * @generated
	 */
	void setUserDefinedProcedureType(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProcedure#getUserDefinedProcedureType <em>User Defined Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedProcedureType()
	 * @see #getUserDefinedProcedureType()
	 * @see #setUserDefinedProcedureType(String)
	 * @generated
	 */
	void unsetUserDefinedProcedureType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProcedure#getUserDefinedProcedureType <em>User Defined Procedure Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Procedure Type</em>' attribute is set.
	 * @see #unsetUserDefinedProcedureType()
	 * @see #getUserDefinedProcedureType()
	 * @see #setUserDefinedProcedureType(String)
	 * @generated
	 */
	boolean isSetUserDefinedProcedureType();

	/**
	 * Returns the value of the '<em><b>Procedure Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcProcedureTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Type</em>' attribute.
	 * @see IFC2X3.IfcProcedureTypeEnum
	 * @see #isSetProcedureType()
	 * @see #unsetProcedureType()
	 * @see #setProcedureType(IfcProcedureTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcProcedure_ProcedureType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcProcedureTypeEnum getProcedureType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProcedure#getProcedureType <em>Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Type</em>' attribute.
	 * @see IFC2X3.IfcProcedureTypeEnum
	 * @see #isSetProcedureType()
	 * @see #unsetProcedureType()
	 * @see #getProcedureType()
	 * @generated
	 */
	void setProcedureType(IfcProcedureTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProcedure#getProcedureType <em>Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcedureType()
	 * @see #getProcedureType()
	 * @see #setProcedureType(IfcProcedureTypeEnum)
	 * @generated
	 */
	void unsetProcedureType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProcedure#getProcedureType <em>Procedure Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Procedure Type</em>' attribute is set.
	 * @see #unsetProcedureType()
	 * @see #getProcedureType()
	 * @see #setProcedureType(IfcProcedureTypeEnum)
	 * @generated
	 */
	boolean isSetProcedureType();

	/**
	 * Returns the value of the '<em><b>Procedure ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure ID</em>' attribute.
	 * @see #isSetProcedureID()
	 * @see #unsetProcedureID()
	 * @see #setProcedureID(String)
	 * @see IFC2X3.IFC2X3Package#getIfcProcedure_ProcedureID()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getProcedureID();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProcedure#getProcedureID <em>Procedure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure ID</em>' attribute.
	 * @see #isSetProcedureID()
	 * @see #unsetProcedureID()
	 * @see #getProcedureID()
	 * @generated
	 */
	void setProcedureID(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProcedure#getProcedureID <em>Procedure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcedureID()
	 * @see #getProcedureID()
	 * @see #setProcedureID(String)
	 * @generated
	 */
	void unsetProcedureID();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProcedure#getProcedureID <em>Procedure ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Procedure ID</em>' attribute is set.
	 * @see #unsetProcedureID()
	 * @see #getProcedureID()
	 * @see #setProcedureID(String)
	 * @generated
	 */
	boolean isSetProcedureID();

} // IfcProcedure
