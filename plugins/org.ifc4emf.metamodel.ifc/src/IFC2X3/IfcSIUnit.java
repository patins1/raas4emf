/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSIUnitImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc SI Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSIUnit#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link IFC2X3.IfcSIUnit#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSIUnit()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSIUnitImplAdapter.class)
public interface IfcSIUnit extends IfcNamedUnit {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcSIUnitName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see IFC2X3.IfcSIUnitName
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(IfcSIUnitName)
	 * @see IFC2X3.IFC2X3Package#getIfcSIUnit_Name()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcSIUnitName getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSIUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see IFC2X3.IfcSIUnitName
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(IfcSIUnitName value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSIUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(IfcSIUnitName)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSIUnit#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(IfcSIUnitName)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcSIPrefix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see IFC2X3.IfcSIPrefix
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #setPrefix(IfcSIPrefix)
	 * @see IFC2X3.IFC2X3Package#getIfcSIUnit_Prefix()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSIPrefix getPrefix();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSIUnit#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see IFC2X3.IfcSIPrefix
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(IfcSIPrefix value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSIUnit#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(IfcSIPrefix)
	 * @generated
	 */
	void unsetPrefix();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSIUnit#getPrefix <em>Prefix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefix</em>' attribute is set.
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(IfcSIPrefix)
	 * @generated
	 */
	boolean isSetPrefix();

} // IfcSIUnit
