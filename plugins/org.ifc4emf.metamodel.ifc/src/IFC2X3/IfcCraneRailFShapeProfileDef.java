/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCraneRailFShapeProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Crane Rail FShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCraneRailFShapeProfileDef#getOverallHeight <em>Overall Height</em>}</li>
 *   <li>{@link IFC2X3.IfcCraneRailFShapeProfileDef#getHeadWidth <em>Head Width</em>}</li>
 *   <li>{@link IFC2X3.IfcCraneRailFShapeProfileDef#getRadius <em>Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcCraneRailFShapeProfileDef#getHeadDepth2 <em>Head Depth2</em>}</li>
 *   <li>{@link IFC2X3.IfcCraneRailFShapeProfileDef#getHeadDepth3 <em>Head Depth3</em>}</li>
 *   <li>{@link IFC2X3.IfcCraneRailFShapeProfileDef#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcCraneRailFShapeProfileDef#getBaseDepth1 <em>Base Depth1</em>}</li>
 *   <li>{@link IFC2X3.IfcCraneRailFShapeProfileDef#getBaseDepth2 <em>Base Depth2</em>}</li>
 *   <li>{@link IFC2X3.IfcCraneRailFShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCraneRailFShapeProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCraneRailFShapeProfileDefImplAdapter.class)
public interface IfcCraneRailFShapeProfileDef extends IfcParameterizedProfileDef {
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
	 * @see IFC2X3.IFC2X3Package#getIfcCraneRailFShapeProfileDef_CentreOfGravityInY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCentreOfGravityInY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(Double)
	 * @generated
	 */
	void unsetCentreOfGravityInY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Base Depth2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Depth2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Depth2</em>' attribute.
	 * @see #isSetBaseDepth2()
	 * @see #unsetBaseDepth2()
	 * @see #setBaseDepth2(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCraneRailFShapeProfileDef_BaseDepth2()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getBaseDepth2();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getBaseDepth2 <em>Base Depth2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Depth2</em>' attribute.
	 * @see #isSetBaseDepth2()
	 * @see #unsetBaseDepth2()
	 * @see #getBaseDepth2()
	 * @generated
	 */
	void setBaseDepth2(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getBaseDepth2 <em>Base Depth2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseDepth2()
	 * @see #getBaseDepth2()
	 * @see #setBaseDepth2(Double)
	 * @generated
	 */
	void unsetBaseDepth2();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getBaseDepth2 <em>Base Depth2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Depth2</em>' attribute is set.
	 * @see #unsetBaseDepth2()
	 * @see #getBaseDepth2()
	 * @see #setBaseDepth2(Double)
	 * @generated
	 */
	boolean isSetBaseDepth2();

	/**
	 * Returns the value of the '<em><b>Base Depth1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Depth1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Depth1</em>' attribute.
	 * @see #isSetBaseDepth1()
	 * @see #unsetBaseDepth1()
	 * @see #setBaseDepth1(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCraneRailFShapeProfileDef_BaseDepth1()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getBaseDepth1();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getBaseDepth1 <em>Base Depth1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Depth1</em>' attribute.
	 * @see #isSetBaseDepth1()
	 * @see #unsetBaseDepth1()
	 * @see #getBaseDepth1()
	 * @generated
	 */
	void setBaseDepth1(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getBaseDepth1 <em>Base Depth1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseDepth1()
	 * @see #getBaseDepth1()
	 * @see #setBaseDepth1(Double)
	 * @generated
	 */
	void unsetBaseDepth1();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getBaseDepth1 <em>Base Depth1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Depth1</em>' attribute is set.
	 * @see #unsetBaseDepth1()
	 * @see #getBaseDepth1()
	 * @see #setBaseDepth1(Double)
	 * @generated
	 */
	boolean isSetBaseDepth1();

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
	 * @see IFC2X3.IFC2X3Package#getIfcCraneRailFShapeProfileDef_WebThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getWebThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getWebThickness <em>Web Thickness</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getWebThickness <em>Web Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWebThickness()
	 * @see #getWebThickness()
	 * @see #setWebThickness(Double)
	 * @generated
	 */
	void unsetWebThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getWebThickness <em>Web Thickness</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Head Depth3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Depth3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Depth3</em>' attribute.
	 * @see #isSetHeadDepth3()
	 * @see #unsetHeadDepth3()
	 * @see #setHeadDepth3(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCraneRailFShapeProfileDef_HeadDepth3()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getHeadDepth3();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getHeadDepth3 <em>Head Depth3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Depth3</em>' attribute.
	 * @see #isSetHeadDepth3()
	 * @see #unsetHeadDepth3()
	 * @see #getHeadDepth3()
	 * @generated
	 */
	void setHeadDepth3(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getHeadDepth3 <em>Head Depth3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeadDepth3()
	 * @see #getHeadDepth3()
	 * @see #setHeadDepth3(Double)
	 * @generated
	 */
	void unsetHeadDepth3();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getHeadDepth3 <em>Head Depth3</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Head Depth3</em>' attribute is set.
	 * @see #unsetHeadDepth3()
	 * @see #getHeadDepth3()
	 * @see #setHeadDepth3(Double)
	 * @generated
	 */
	boolean isSetHeadDepth3();

	/**
	 * Returns the value of the '<em><b>Head Depth2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Depth2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Depth2</em>' attribute.
	 * @see #isSetHeadDepth2()
	 * @see #unsetHeadDepth2()
	 * @see #setHeadDepth2(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCraneRailFShapeProfileDef_HeadDepth2()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getHeadDepth2();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getHeadDepth2 <em>Head Depth2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Depth2</em>' attribute.
	 * @see #isSetHeadDepth2()
	 * @see #unsetHeadDepth2()
	 * @see #getHeadDepth2()
	 * @generated
	 */
	void setHeadDepth2(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getHeadDepth2 <em>Head Depth2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeadDepth2()
	 * @see #getHeadDepth2()
	 * @see #setHeadDepth2(Double)
	 * @generated
	 */
	void unsetHeadDepth2();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getHeadDepth2 <em>Head Depth2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Head Depth2</em>' attribute is set.
	 * @see #unsetHeadDepth2()
	 * @see #getHeadDepth2()
	 * @see #setHeadDepth2(Double)
	 * @generated
	 */
	boolean isSetHeadDepth2();

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
	 * @see IFC2X3.IFC2X3Package#getIfcCraneRailFShapeProfileDef_Radius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getRadius <em>Radius</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadius()
	 * @see #getRadius()
	 * @see #setRadius(Double)
	 * @generated
	 */
	void unsetRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getRadius <em>Radius</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Head Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Width</em>' attribute.
	 * @see #isSetHeadWidth()
	 * @see #unsetHeadWidth()
	 * @see #setHeadWidth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCraneRailFShapeProfileDef_HeadWidth()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getHeadWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getHeadWidth <em>Head Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Width</em>' attribute.
	 * @see #isSetHeadWidth()
	 * @see #unsetHeadWidth()
	 * @see #getHeadWidth()
	 * @generated
	 */
	void setHeadWidth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getHeadWidth <em>Head Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeadWidth()
	 * @see #getHeadWidth()
	 * @see #setHeadWidth(Double)
	 * @generated
	 */
	void unsetHeadWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getHeadWidth <em>Head Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Head Width</em>' attribute is set.
	 * @see #unsetHeadWidth()
	 * @see #getHeadWidth()
	 * @see #setHeadWidth(Double)
	 * @generated
	 */
	boolean isSetHeadWidth();

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
	 * @see IFC2X3.IFC2X3Package#getIfcCraneRailFShapeProfileDef_OverallHeight()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getOverallHeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getOverallHeight <em>Overall Height</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getOverallHeight <em>Overall Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverallHeight()
	 * @see #getOverallHeight()
	 * @see #setOverallHeight(Double)
	 * @generated
	 */
	void unsetOverallHeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCraneRailFShapeProfileDef#getOverallHeight <em>Overall Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overall Height</em>' attribute is set.
	 * @see #unsetOverallHeight()
	 * @see #getOverallHeight()
	 * @see #setOverallHeight(Double)
	 * @generated
	 */
	boolean isSetOverallHeight();

} // IfcCraneRailFShapeProfileDef
