/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcLShapeProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc LShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLShapeProfileDef#getDepth <em>Depth</em>}</li>
 *   <li>{@link IFC2X3.IfcLShapeProfileDef#getWidth <em>Width</em>}</li>
 *   <li>{@link IFC2X3.IfcLShapeProfileDef#getThickness <em>Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcLShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcLShapeProfileDef#getEdgeRadius <em>Edge Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcLShapeProfileDef#getLegSlope <em>Leg Slope</em>}</li>
 *   <li>{@link IFC2X3.IfcLShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link IFC2X3.IfcLShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLShapeProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcLShapeProfileDefImplAdapter.class)
public interface IfcLShapeProfileDef extends IfcParameterizedProfileDef {
	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In Y</em>' attribute.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLShapeProfileDef_CentreOfGravityInY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCentreOfGravityInY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In Y</em>' attribute.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @generated
	 */
	void setCentreOfGravityInY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(Double)
	 * @generated
	 */
	void unsetCentreOfGravityInY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In Y</em>' attribute is set.
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(Double)
	 * @generated
	 */
	boolean isSetCentreOfGravityInY();

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
	 * @see IFC2X3.IFC2X3Package#getIfcLShapeProfileDef_CentreOfGravityInX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCentreOfGravityInX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(Double)
	 * @generated
	 */
	void unsetCentreOfGravityInX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Leg Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leg Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leg Slope</em>' attribute.
	 * @see #isSetLegSlope()
	 * @see #unsetLegSlope()
	 * @see #setLegSlope(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLShapeProfileDef_LegSlope()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLegSlope();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getLegSlope <em>Leg Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg Slope</em>' attribute.
	 * @see #isSetLegSlope()
	 * @see #unsetLegSlope()
	 * @see #getLegSlope()
	 * @generated
	 */
	void setLegSlope(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getLegSlope <em>Leg Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLegSlope()
	 * @see #getLegSlope()
	 * @see #setLegSlope(Double)
	 * @generated
	 */
	void unsetLegSlope();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLShapeProfileDef#getLegSlope <em>Leg Slope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Leg Slope</em>' attribute is set.
	 * @see #unsetLegSlope()
	 * @see #getLegSlope()
	 * @see #setLegSlope(Double)
	 * @generated
	 */
	boolean isSetLegSlope();

	/**
	 * Returns the value of the '<em><b>Edge Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Radius</em>' attribute.
	 * @see #isSetEdgeRadius()
	 * @see #unsetEdgeRadius()
	 * @see #setEdgeRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLShapeProfileDef_EdgeRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getEdgeRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getEdgeRadius <em>Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Radius</em>' attribute.
	 * @see #isSetEdgeRadius()
	 * @see #unsetEdgeRadius()
	 * @see #getEdgeRadius()
	 * @generated
	 */
	void setEdgeRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getEdgeRadius <em>Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdgeRadius()
	 * @see #getEdgeRadius()
	 * @see #setEdgeRadius(Double)
	 * @generated
	 */
	void unsetEdgeRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLShapeProfileDef#getEdgeRadius <em>Edge Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edge Radius</em>' attribute is set.
	 * @see #unsetEdgeRadius()
	 * @see #getEdgeRadius()
	 * @see #setEdgeRadius(Double)
	 * @generated
	 */
	boolean isSetEdgeRadius();

	/**
	 * Returns the value of the '<em><b>Fillet Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fillet Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fillet Radius</em>' attribute.
	 * @see #isSetFilletRadius()
	 * @see #unsetFilletRadius()
	 * @see #setFilletRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLShapeProfileDef_FilletRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFilletRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fillet Radius</em>' attribute.
	 * @see #isSetFilletRadius()
	 * @see #unsetFilletRadius()
	 * @see #getFilletRadius()
	 * @generated
	 */
	void setFilletRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilletRadius()
	 * @see #getFilletRadius()
	 * @see #setFilletRadius(Double)
	 * @generated
	 */
	void unsetFilletRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fillet Radius</em>' attribute is set.
	 * @see #unsetFilletRadius()
	 * @see #getFilletRadius()
	 * @see #setFilletRadius(Double)
	 * @generated
	 */
	boolean isSetFilletRadius();

	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness</em>' attribute.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #setThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLShapeProfileDef_Thickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' attribute.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThickness()
	 * @see #getThickness()
	 * @see #setThickness(Double)
	 * @generated
	 */
	void unsetThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLShapeProfileDef#getThickness <em>Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thickness</em>' attribute is set.
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @see #setThickness(Double)
	 * @generated
	 */
	boolean isSetThickness();

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
	 * @see IFC2X3.IFC2X3Package#getIfcLShapeProfileDef_Width()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getWidth <em>Width</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(Double)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLShapeProfileDef#getWidth <em>Width</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcLShapeProfileDef_Depth()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getDepth <em>Depth</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcLShapeProfileDef#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDepth()
	 * @see #getDepth()
	 * @see #setDepth(Double)
	 * @generated
	 */
	void unsetDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLShapeProfileDef#getDepth <em>Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Depth</em>' attribute is set.
	 * @see #unsetDepth()
	 * @see #getDepth()
	 * @see #setDepth(Double)
	 * @generated
	 */
	boolean isSetDepth();

} // IfcLShapeProfileDef
