/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcUShapeProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc UShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcUShapeProfileDef#getDepth <em>Depth</em>}</li>
 *   <li>{@link IFC2X3.IfcUShapeProfileDef#getFlangeWidth <em>Flange Width</em>}</li>
 *   <li>{@link IFC2X3.IfcUShapeProfileDef#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcUShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcUShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcUShapeProfileDef#getEdgeRadius <em>Edge Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcUShapeProfileDef#getFlangeSlope <em>Flange Slope</em>}</li>
 *   <li>{@link IFC2X3.IfcUShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcUShapeProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcUShapeProfileDefImplAdapter.class)
public interface IfcUShapeProfileDef extends IfcParameterizedProfileDef {
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
	 * @see IFC2X3.IFC2X3Package#getIfcUShapeProfileDef_CentreOfGravityInX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCentreOfGravityInX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(Double)
	 * @generated
	 */
	void unsetCentreOfGravityInX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcUShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Flange Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flange Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flange Slope</em>' attribute.
	 * @see #isSetFlangeSlope()
	 * @see #unsetFlangeSlope()
	 * @see #setFlangeSlope(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcUShapeProfileDef_FlangeSlope()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFlangeSlope();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getFlangeSlope <em>Flange Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flange Slope</em>' attribute.
	 * @see #isSetFlangeSlope()
	 * @see #unsetFlangeSlope()
	 * @see #getFlangeSlope()
	 * @generated
	 */
	void setFlangeSlope(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getFlangeSlope <em>Flange Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlangeSlope()
	 * @see #getFlangeSlope()
	 * @see #setFlangeSlope(Double)
	 * @generated
	 */
	void unsetFlangeSlope();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcUShapeProfileDef#getFlangeSlope <em>Flange Slope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flange Slope</em>' attribute is set.
	 * @see #unsetFlangeSlope()
	 * @see #getFlangeSlope()
	 * @see #setFlangeSlope(Double)
	 * @generated
	 */
	boolean isSetFlangeSlope();

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
	 * @see IFC2X3.IFC2X3Package#getIfcUShapeProfileDef_EdgeRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getEdgeRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getEdgeRadius <em>Edge Radius</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getEdgeRadius <em>Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdgeRadius()
	 * @see #getEdgeRadius()
	 * @see #setEdgeRadius(Double)
	 * @generated
	 */
	void unsetEdgeRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcUShapeProfileDef#getEdgeRadius <em>Edge Radius</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcUShapeProfileDef_FilletRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFilletRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilletRadius()
	 * @see #getFilletRadius()
	 * @see #setFilletRadius(Double)
	 * @generated
	 */
	void unsetFilletRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcUShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Flange Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flange Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flange Thickness</em>' attribute.
	 * @see #isSetFlangeThickness()
	 * @see #unsetFlangeThickness()
	 * @see #setFlangeThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcUShapeProfileDef_FlangeThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getFlangeThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flange Thickness</em>' attribute.
	 * @see #isSetFlangeThickness()
	 * @see #unsetFlangeThickness()
	 * @see #getFlangeThickness()
	 * @generated
	 */
	void setFlangeThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlangeThickness()
	 * @see #getFlangeThickness()
	 * @see #setFlangeThickness(Double)
	 * @generated
	 */
	void unsetFlangeThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcUShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flange Thickness</em>' attribute is set.
	 * @see #unsetFlangeThickness()
	 * @see #getFlangeThickness()
	 * @see #setFlangeThickness(Double)
	 * @generated
	 */
	boolean isSetFlangeThickness();

	/**
	 * Returns the value of the '<em><b>Web Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Thickness</em>' attribute.
	 * @see #isSetWebThickness()
	 * @see #unsetWebThickness()
	 * @see #setWebThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcUShapeProfileDef_WebThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getWebThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getWebThickness <em>Web Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Thickness</em>' attribute.
	 * @see #isSetWebThickness()
	 * @see #unsetWebThickness()
	 * @see #getWebThickness()
	 * @generated
	 */
	void setWebThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getWebThickness <em>Web Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWebThickness()
	 * @see #getWebThickness()
	 * @see #setWebThickness(Double)
	 * @generated
	 */
	void unsetWebThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcUShapeProfileDef#getWebThickness <em>Web Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Web Thickness</em>' attribute is set.
	 * @see #unsetWebThickness()
	 * @see #getWebThickness()
	 * @see #setWebThickness(Double)
	 * @generated
	 */
	boolean isSetWebThickness();

	/**
	 * Returns the value of the '<em><b>Flange Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flange Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flange Width</em>' attribute.
	 * @see #isSetFlangeWidth()
	 * @see #unsetFlangeWidth()
	 * @see #setFlangeWidth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcUShapeProfileDef_FlangeWidth()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getFlangeWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getFlangeWidth <em>Flange Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flange Width</em>' attribute.
	 * @see #isSetFlangeWidth()
	 * @see #unsetFlangeWidth()
	 * @see #getFlangeWidth()
	 * @generated
	 */
	void setFlangeWidth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getFlangeWidth <em>Flange Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlangeWidth()
	 * @see #getFlangeWidth()
	 * @see #setFlangeWidth(Double)
	 * @generated
	 */
	void unsetFlangeWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcUShapeProfileDef#getFlangeWidth <em>Flange Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flange Width</em>' attribute is set.
	 * @see #unsetFlangeWidth()
	 * @see #getFlangeWidth()
	 * @see #setFlangeWidth(Double)
	 * @generated
	 */
	boolean isSetFlangeWidth();

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
	 * @see IFC2X3.IFC2X3Package#getIfcUShapeProfileDef_Depth()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getDepth <em>Depth</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcUShapeProfileDef#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDepth()
	 * @see #getDepth()
	 * @see #setDepth(Double)
	 * @generated
	 */
	void unsetDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcUShapeProfileDef#getDepth <em>Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Depth</em>' attribute is set.
	 * @see #unsetDepth()
	 * @see #getDepth()
	 * @see #setDepth(Double)
	 * @generated
	 */
	boolean isSetDepth();

} // IfcUShapeProfileDef
