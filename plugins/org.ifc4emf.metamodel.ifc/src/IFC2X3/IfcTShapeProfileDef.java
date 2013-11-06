/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTShapeProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc TShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTShapeProfileDef#getDepth <em>Depth</em>}</li>
 *   <li>{@link IFC2X3.IfcTShapeProfileDef#getFlangeWidth <em>Flange Width</em>}</li>
 *   <li>{@link IFC2X3.IfcTShapeProfileDef#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcTShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcTShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcTShapeProfileDef#getFlangeEdgeRadius <em>Flange Edge Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcTShapeProfileDef#getWebEdgeRadius <em>Web Edge Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcTShapeProfileDef#getWebSlope <em>Web Slope</em>}</li>
 *   <li>{@link IFC2X3.IfcTShapeProfileDef#getFlangeSlope <em>Flange Slope</em>}</li>
 *   <li>{@link IFC2X3.IfcTShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTShapeProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTShapeProfileDefImplAdapter.class)
public interface IfcTShapeProfileDef extends IfcParameterizedProfileDef {
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
	 * @see IFC2X3.IFC2X3Package#getIfcTShapeProfileDef_CentreOfGravityInY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCentreOfGravityInY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(Double)
	 * @generated
	 */
	void unsetCentreOfGravityInY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcTShapeProfileDef_FlangeSlope()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFlangeSlope();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFlangeSlope <em>Flange Slope</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFlangeSlope <em>Flange Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlangeSlope()
	 * @see #getFlangeSlope()
	 * @see #setFlangeSlope(Double)
	 * @generated
	 */
	void unsetFlangeSlope();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFlangeSlope <em>Flange Slope</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Web Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Slope</em>' attribute.
	 * @see #isSetWebSlope()
	 * @see #unsetWebSlope()
	 * @see #setWebSlope(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTShapeProfileDef_WebSlope()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getWebSlope();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getWebSlope <em>Web Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Slope</em>' attribute.
	 * @see #isSetWebSlope()
	 * @see #unsetWebSlope()
	 * @see #getWebSlope()
	 * @generated
	 */
	void setWebSlope(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getWebSlope <em>Web Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWebSlope()
	 * @see #getWebSlope()
	 * @see #setWebSlope(Double)
	 * @generated
	 */
	void unsetWebSlope();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTShapeProfileDef#getWebSlope <em>Web Slope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Web Slope</em>' attribute is set.
	 * @see #unsetWebSlope()
	 * @see #getWebSlope()
	 * @see #setWebSlope(Double)
	 * @generated
	 */
	boolean isSetWebSlope();

	/**
	 * Returns the value of the '<em><b>Web Edge Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Edge Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Edge Radius</em>' attribute.
	 * @see #isSetWebEdgeRadius()
	 * @see #unsetWebEdgeRadius()
	 * @see #setWebEdgeRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTShapeProfileDef_WebEdgeRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getWebEdgeRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getWebEdgeRadius <em>Web Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Edge Radius</em>' attribute.
	 * @see #isSetWebEdgeRadius()
	 * @see #unsetWebEdgeRadius()
	 * @see #getWebEdgeRadius()
	 * @generated
	 */
	void setWebEdgeRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getWebEdgeRadius <em>Web Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWebEdgeRadius()
	 * @see #getWebEdgeRadius()
	 * @see #setWebEdgeRadius(Double)
	 * @generated
	 */
	void unsetWebEdgeRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTShapeProfileDef#getWebEdgeRadius <em>Web Edge Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Web Edge Radius</em>' attribute is set.
	 * @see #unsetWebEdgeRadius()
	 * @see #getWebEdgeRadius()
	 * @see #setWebEdgeRadius(Double)
	 * @generated
	 */
	boolean isSetWebEdgeRadius();

	/**
	 * Returns the value of the '<em><b>Flange Edge Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flange Edge Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flange Edge Radius</em>' attribute.
	 * @see #isSetFlangeEdgeRadius()
	 * @see #unsetFlangeEdgeRadius()
	 * @see #setFlangeEdgeRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTShapeProfileDef_FlangeEdgeRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFlangeEdgeRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFlangeEdgeRadius <em>Flange Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flange Edge Radius</em>' attribute.
	 * @see #isSetFlangeEdgeRadius()
	 * @see #unsetFlangeEdgeRadius()
	 * @see #getFlangeEdgeRadius()
	 * @generated
	 */
	void setFlangeEdgeRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFlangeEdgeRadius <em>Flange Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlangeEdgeRadius()
	 * @see #getFlangeEdgeRadius()
	 * @see #setFlangeEdgeRadius(Double)
	 * @generated
	 */
	void unsetFlangeEdgeRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFlangeEdgeRadius <em>Flange Edge Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flange Edge Radius</em>' attribute is set.
	 * @see #unsetFlangeEdgeRadius()
	 * @see #getFlangeEdgeRadius()
	 * @see #setFlangeEdgeRadius(Double)
	 * @generated
	 */
	boolean isSetFlangeEdgeRadius();

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
	 * @see IFC2X3.IFC2X3Package#getIfcTShapeProfileDef_FilletRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFilletRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilletRadius()
	 * @see #getFilletRadius()
	 * @see #setFilletRadius(Double)
	 * @generated
	 */
	void unsetFilletRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcTShapeProfileDef_FlangeThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getFlangeThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlangeThickness()
	 * @see #getFlangeThickness()
	 * @see #setFlangeThickness(Double)
	 * @generated
	 */
	void unsetFlangeThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcTShapeProfileDef_WebThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getWebThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getWebThickness <em>Web Thickness</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getWebThickness <em>Web Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWebThickness()
	 * @see #getWebThickness()
	 * @see #setWebThickness(Double)
	 * @generated
	 */
	void unsetWebThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTShapeProfileDef#getWebThickness <em>Web Thickness</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcTShapeProfileDef_FlangeWidth()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getFlangeWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFlangeWidth <em>Flange Width</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFlangeWidth <em>Flange Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlangeWidth()
	 * @see #getFlangeWidth()
	 * @see #setFlangeWidth(Double)
	 * @generated
	 */
	void unsetFlangeWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTShapeProfileDef#getFlangeWidth <em>Flange Width</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcTShapeProfileDef_Depth()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getDepth <em>Depth</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcTShapeProfileDef#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDepth()
	 * @see #getDepth()
	 * @see #setDepth(Double)
	 * @generated
	 */
	void unsetDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTShapeProfileDef#getDepth <em>Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Depth</em>' attribute is set.
	 * @see #unsetDepth()
	 * @see #getDepth()
	 * @see #setDepth(Double)
	 * @generated
	 */
	boolean isSetDepth();

} // IfcTShapeProfileDef
