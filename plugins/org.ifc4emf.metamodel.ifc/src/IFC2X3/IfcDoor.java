/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDoorImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Door</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDoor#getOverallHeight <em>Overall Height</em>}</li>
 *   <li>{@link IFC2X3.IfcDoor#getOverallWidth <em>Overall Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDoor()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDoorImplAdapter.class)
public interface IfcDoor extends IfcBuildingElement {
	/**
	 * Returns the value of the '<em><b>Overall Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Width</em>' attribute.
	 * @see #isSetOverallWidth()
	 * @see #unsetOverallWidth()
	 * @see #setOverallWidth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoor_OverallWidth()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getOverallWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoor#getOverallWidth <em>Overall Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Width</em>' attribute.
	 * @see #isSetOverallWidth()
	 * @see #unsetOverallWidth()
	 * @see #getOverallWidth()
	 * @generated
	 */
	void setOverallWidth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoor#getOverallWidth <em>Overall Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverallWidth()
	 * @see #getOverallWidth()
	 * @see #setOverallWidth(Double)
	 * @generated
	 */
	void unsetOverallWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoor#getOverallWidth <em>Overall Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overall Width</em>' attribute is set.
	 * @see #unsetOverallWidth()
	 * @see #getOverallWidth()
	 * @see #setOverallWidth(Double)
	 * @generated
	 */
	boolean isSetOverallWidth();

	/**
	 * Returns the value of the '<em><b>Overall Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Height</em>' attribute.
	 * @see #isSetOverallHeight()
	 * @see #unsetOverallHeight()
	 * @see #setOverallHeight(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoor_OverallHeight()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getOverallHeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoor#getOverallHeight <em>Overall Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Height</em>' attribute.
	 * @see #isSetOverallHeight()
	 * @see #unsetOverallHeight()
	 * @see #getOverallHeight()
	 * @generated
	 */
	void setOverallHeight(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoor#getOverallHeight <em>Overall Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverallHeight()
	 * @see #getOverallHeight()
	 * @see #setOverallHeight(Double)
	 * @generated
	 */
	void unsetOverallHeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoor#getOverallHeight <em>Overall Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overall Height</em>' attribute is set.
	 * @see #unsetOverallHeight()
	 * @see #getOverallHeight()
	 * @see #setOverallHeight(Double)
	 * @generated
	 */
	boolean isSetOverallHeight();

} // IfcDoor
