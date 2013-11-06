/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCShapeProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc CShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCShapeProfileDef#getDepth <em>Depth</em>}</li>
 *   <li>{@link IFC2X3.IfcCShapeProfileDef#getWidth <em>Width</em>}</li>
 *   <li>{@link IFC2X3.IfcCShapeProfileDef#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcCShapeProfileDef#getGirth <em>Girth</em>}</li>
 *   <li>{@link IFC2X3.IfcCShapeProfileDef#getInternalFilletRadius <em>Internal Fillet Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcCShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCShapeProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCShapeProfileDefImplAdapter.class)
public interface IfcCShapeProfileDef extends IfcParameterizedProfileDef {
	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In X</em>' attribute.
	 * @see #isSetCentreOfGravityInX()
	 * @see #unsetCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCShapeProfileDef_CentreOfGravityInX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCentreOfGravityInX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In X</em>' attribute.
	 * @see #isSetCentreOfGravityInX()
	 * @see #unsetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @generated
	 */
	void setCentreOfGravityInX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(Double)
	 * @generated
	 */
	void unsetCentreOfGravityInX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In X</em>' attribute is set.
	 * @see #unsetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(Double)
	 * @generated
	 */
	boolean isSetCentreOfGravityInX();

	/**
	 * Returns the value of the '<em><b>Internal Fillet Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Fillet Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Fillet Radius</em>' attribute.
	 * @see #isSetInternalFilletRadius()
	 * @see #unsetInternalFilletRadius()
	 * @see #setInternalFilletRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCShapeProfileDef_InternalFilletRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getInternalFilletRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCShapeProfileDef#getInternalFilletRadius <em>Internal Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Fillet Radius</em>' attribute.
	 * @see #isSetInternalFilletRadius()
	 * @see #unsetInternalFilletRadius()
	 * @see #getInternalFilletRadius()
	 * @generated
	 */
	void setInternalFilletRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCShapeProfileDef#getInternalFilletRadius <em>Internal Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInternalFilletRadius()
	 * @see #getInternalFilletRadius()
	 * @see #setInternalFilletRadius(Double)
	 * @generated
	 */
	void unsetInternalFilletRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCShapeProfileDef#getInternalFilletRadius <em>Internal Fillet Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Internal Fillet Radius</em>' attribute is set.
	 * @see #unsetInternalFilletRadius()
	 * @see #getInternalFilletRadius()
	 * @see #setInternalFilletRadius(Double)
	 * @generated
	 */
	boolean isSetInternalFilletRadius();

	/**
	 * Returns the value of the '<em><b>Girth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Girth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Girth</em>' attribute.
	 * @see #isSetGirth()
	 * @see #unsetGirth()
	 * @see #setGirth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCShapeProfileDef_Girth()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getGirth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCShapeProfileDef#getGirth <em>Girth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Girth</em>' attribute.
	 * @see #isSetGirth()
	 * @see #unsetGirth()
	 * @see #getGirth()
	 * @generated
	 */
	void setGirth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCShapeProfileDef#getGirth <em>Girth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGirth()
	 * @see #getGirth()
	 * @see #setGirth(Double)
	 * @generated
	 */
	void unsetGirth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCShapeProfileDef#getGirth <em>Girth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Girth</em>' attribute is set.
	 * @see #unsetGirth()
	 * @see #getGirth()
	 * @see #setGirth(Double)
	 * @generated
	 */
	boolean isSetGirth();

	/**
	 * Returns the value of the '<em><b>Wall Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wall Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wall Thickness</em>' attribute.
	 * @see #isSetWallThickness()
	 * @see #unsetWallThickness()
	 * @see #setWallThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCShapeProfileDef_WallThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getWallThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCShapeProfileDef#getWallThickness <em>Wall Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall Thickness</em>' attribute.
	 * @see #isSetWallThickness()
	 * @see #unsetWallThickness()
	 * @see #getWallThickness()
	 * @generated
	 */
	void setWallThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCShapeProfileDef#getWallThickness <em>Wall Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWallThickness()
	 * @see #getWallThickness()
	 * @see #setWallThickness(Double)
	 * @generated
	 */
	void unsetWallThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCShapeProfileDef#getWallThickness <em>Wall Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wall Thickness</em>' attribute is set.
	 * @see #unsetWallThickness()
	 * @see #getWallThickness()
	 * @see #setWallThickness(Double)
	 * @generated
	 */
	boolean isSetWallThickness();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #setWidth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCShapeProfileDef_Width()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCShapeProfileDef#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCShapeProfileDef#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(Double)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCShapeProfileDef#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(Double)
	 * @generated
	 */
	boolean isSetWidth();

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #isSetDepth()
	 * @see #unsetDepth()
	 * @see #setDepth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCShapeProfileDef_Depth()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCShapeProfileDef#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #isSetDepth()
	 * @see #unsetDepth()
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCShapeProfileDef#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDepth()
	 * @see #getDepth()
	 * @see #setDepth(Double)
	 * @generated
	 */
	void unsetDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCShapeProfileDef#getDepth <em>Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Depth</em>' attribute is set.
	 * @see #unsetDepth()
	 * @see #getDepth()
	 * @see #setDepth(Double)
	 * @generated
	 */
	boolean isSetDepth();

} // IfcCShapeProfileDef
