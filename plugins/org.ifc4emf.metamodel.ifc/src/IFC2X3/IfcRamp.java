/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRampImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Ramp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRamp#getShapeType <em>Shape Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRamp()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRampImplAdapter.class)
public interface IfcRamp extends IfcBuildingElement {
	/**
	 * Returns the value of the '<em><b>Shape Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcRampTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Type</em>' attribute.
	 * @see IFC2X3.IfcRampTypeEnum
	 * @see #isSetShapeType()
	 * @see #unsetShapeType()
	 * @see #setShapeType(IfcRampTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcRamp_ShapeType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcRampTypeEnum getShapeType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRamp#getShapeType <em>Shape Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Type</em>' attribute.
	 * @see IFC2X3.IfcRampTypeEnum
	 * @see #isSetShapeType()
	 * @see #unsetShapeType()
	 * @see #getShapeType()
	 * @generated
	 */
	void setShapeType(IfcRampTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRamp#getShapeType <em>Shape Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShapeType()
	 * @see #getShapeType()
	 * @see #setShapeType(IfcRampTypeEnum)
	 * @generated
	 */
	void unsetShapeType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRamp#getShapeType <em>Shape Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shape Type</em>' attribute is set.
	 * @see #unsetShapeType()
	 * @see #getShapeType()
	 * @see #setShapeType(IfcRampTypeEnum)
	 * @generated
	 */
	boolean isSetShapeType();

} // IfcRamp
