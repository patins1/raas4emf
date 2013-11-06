/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRectangleProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rectangle Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRectangleProfileDef#getXDim <em>XDim</em>}</li>
 *   <li>{@link IFC2X3.IfcRectangleProfileDef#getYDim <em>YDim</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRectangleProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRectangleProfileDefImplAdapter.class)
public interface IfcRectangleProfileDef extends IfcParameterizedProfileDef {
	/**
	 * Returns the value of the '<em><b>YDim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YDim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YDim</em>' attribute.
	 * @see #isSetYDim()
	 * @see #unsetYDim()
	 * @see #setYDim(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangleProfileDef_YDim()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getYDim();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangleProfileDef#getYDim <em>YDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDim</em>' attribute.
	 * @see #isSetYDim()
	 * @see #unsetYDim()
	 * @see #getYDim()
	 * @generated
	 */
	void setYDim(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRectangleProfileDef#getYDim <em>YDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYDim()
	 * @see #getYDim()
	 * @see #setYDim(Double)
	 * @generated
	 */
	void unsetYDim();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangleProfileDef#getYDim <em>YDim</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>YDim</em>' attribute is set.
	 * @see #unsetYDim()
	 * @see #getYDim()
	 * @see #setYDim(Double)
	 * @generated
	 */
	boolean isSetYDim();

	/**
	 * Returns the value of the '<em><b>XDim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDim</em>' attribute.
	 * @see #isSetXDim()
	 * @see #unsetXDim()
	 * @see #setXDim(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangleProfileDef_XDim()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getXDim();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangleProfileDef#getXDim <em>XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDim</em>' attribute.
	 * @see #isSetXDim()
	 * @see #unsetXDim()
	 * @see #getXDim()
	 * @generated
	 */
	void setXDim(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRectangleProfileDef#getXDim <em>XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXDim()
	 * @see #getXDim()
	 * @see #setXDim(Double)
	 * @generated
	 */
	void unsetXDim();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangleProfileDef#getXDim <em>XDim</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XDim</em>' attribute is set.
	 * @see #unsetXDim()
	 * @see #getXDim()
	 * @see #setXDim(Double)
	 * @generated
	 */
	boolean isSetXDim();

} // IfcRectangleProfileDef
