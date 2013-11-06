/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRectangularPyramidImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rectangular Pyramid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRectangularPyramid#getXLength <em>XLength</em>}</li>
 *   <li>{@link IFC2X3.IfcRectangularPyramid#getYLength <em>YLength</em>}</li>
 *   <li>{@link IFC2X3.IfcRectangularPyramid#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRectangularPyramid()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRectangularPyramidImplAdapter.class)
public interface IfcRectangularPyramid extends IfcCsgPrimitive3D {
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
	 * @see IFC2X3.IFC2X3Package#getIfcRectangularPyramid_Height()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getHeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangularPyramid#getHeight <em>Height</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcRectangularPyramid#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeight()
	 * @see #getHeight()
	 * @see #setHeight(Double)
	 * @generated
	 */
	void unsetHeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangularPyramid#getHeight <em>Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Height</em>' attribute is set.
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @see #setHeight(Double)
	 * @generated
	 */
	boolean isSetHeight();

	/**
	 * Returns the value of the '<em><b>YLength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YLength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YLength</em>' attribute.
	 * @see #isSetYLength()
	 * @see #unsetYLength()
	 * @see #setYLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangularPyramid_YLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getYLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangularPyramid#getYLength <em>YLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YLength</em>' attribute.
	 * @see #isSetYLength()
	 * @see #unsetYLength()
	 * @see #getYLength()
	 * @generated
	 */
	void setYLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRectangularPyramid#getYLength <em>YLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYLength()
	 * @see #getYLength()
	 * @see #setYLength(Double)
	 * @generated
	 */
	void unsetYLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangularPyramid#getYLength <em>YLength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>YLength</em>' attribute is set.
	 * @see #unsetYLength()
	 * @see #getYLength()
	 * @see #setYLength(Double)
	 * @generated
	 */
	boolean isSetYLength();

	/**
	 * Returns the value of the '<em><b>XLength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XLength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XLength</em>' attribute.
	 * @see #isSetXLength()
	 * @see #unsetXLength()
	 * @see #setXLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangularPyramid_XLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getXLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangularPyramid#getXLength <em>XLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XLength</em>' attribute.
	 * @see #isSetXLength()
	 * @see #unsetXLength()
	 * @see #getXLength()
	 * @generated
	 */
	void setXLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRectangularPyramid#getXLength <em>XLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXLength()
	 * @see #getXLength()
	 * @see #setXLength(Double)
	 * @generated
	 */
	void unsetXLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangularPyramid#getXLength <em>XLength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XLength</em>' attribute is set.
	 * @see #unsetXLength()
	 * @see #getXLength()
	 * @see #setXLength(Double)
	 * @generated
	 */
	boolean isSetXLength();

} // IfcRectangularPyramid
