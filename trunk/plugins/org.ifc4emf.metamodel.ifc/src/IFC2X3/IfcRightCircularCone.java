/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRightCircularConeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Right Circular Cone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRightCircularCone#getHeight <em>Height</em>}</li>
 *   <li>{@link IFC2X3.IfcRightCircularCone#getBottomRadius <em>Bottom Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRightCircularCone()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRightCircularConeImplAdapter.class)
public interface IfcRightCircularCone extends IfcCsgPrimitive3D {
	/**
	 * Returns the value of the '<em><b>Bottom Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Radius</em>' attribute.
	 * @see #isSetBottomRadius()
	 * @see #unsetBottomRadius()
	 * @see #setBottomRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRightCircularCone_BottomRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getBottomRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRightCircularCone#getBottomRadius <em>Bottom Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Radius</em>' attribute.
	 * @see #isSetBottomRadius()
	 * @see #unsetBottomRadius()
	 * @see #getBottomRadius()
	 * @generated
	 */
	void setBottomRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRightCircularCone#getBottomRadius <em>Bottom Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBottomRadius()
	 * @see #getBottomRadius()
	 * @see #setBottomRadius(Double)
	 * @generated
	 */
	void unsetBottomRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRightCircularCone#getBottomRadius <em>Bottom Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bottom Radius</em>' attribute is set.
	 * @see #unsetBottomRadius()
	 * @see #getBottomRadius()
	 * @see #setBottomRadius(Double)
	 * @generated
	 */
	boolean isSetBottomRadius();

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
	 * @see IFC2X3.IFC2X3Package#getIfcRightCircularCone_Height()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getHeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRightCircularCone#getHeight <em>Height</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcRightCircularCone#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeight()
	 * @see #getHeight()
	 * @see #setHeight(Double)
	 * @generated
	 */
	void unsetHeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRightCircularCone#getHeight <em>Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Height</em>' attribute is set.
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @see #setHeight(Double)
	 * @generated
	 */
	boolean isSetHeight();

} // IfcRightCircularCone
