/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRightCircularCylinderImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Right Circular Cylinder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRightCircularCylinder#getHeight <em>Height</em>}</li>
 *   <li>{@link IFC2X3.IfcRightCircularCylinder#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRightCircularCylinder()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRightCircularCylinderImplAdapter.class)
public interface IfcRightCircularCylinder extends IfcCsgPrimitive3D {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #setRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRightCircularCylinder_Radius()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRightCircularCylinder#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRightCircularCylinder#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadius()
	 * @see #getRadius()
	 * @see #setRadius(Double)
	 * @generated
	 */
	void unsetRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRightCircularCylinder#getRadius <em>Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radius</em>' attribute is set.
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @see #setRadius(Double)
	 * @generated
	 */
	boolean isSetRadius();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #setHeight(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRightCircularCylinder_Height()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getHeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRightCircularCylinder#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRightCircularCylinder#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeight()
	 * @see #getHeight()
	 * @see #setHeight(Double)
	 * @generated
	 */
	void unsetHeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRightCircularCylinder#getHeight <em>Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Height</em>' attribute is set.
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @see #setHeight(Double)
	 * @generated
	 */
	boolean isSetHeight();

} // IfcRightCircularCylinder
