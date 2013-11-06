/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTextStyleWithBoxCharacteristicsImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Style With Box Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxSlantAngle <em>Box Slant Angle</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxRotateAngle <em>Box Rotate Angle</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getCharacterSpacing <em>Character Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTextStyleWithBoxCharacteristics()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTextStyleWithBoxCharacteristicsImplAdapter.class)
public interface IfcTextStyleWithBoxCharacteristics extends IfcTextStyleSelect {
	/**
	 * Returns the value of the '<em><b>Character Spacing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Spacing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Spacing</em>' containment reference.
	 * @see #setCharacterSpacing(IfcSizeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleWithBoxCharacteristics_CharacterSpacing()
	 * @model containment="true"
	 * @generated
	 */
	IfcSizeSelect getCharacterSpacing();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getCharacterSpacing <em>Character Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Spacing</em>' containment reference.
	 * @see #getCharacterSpacing()
	 * @generated
	 */
	void setCharacterSpacing(IfcSizeSelect value);

	/**
	 * Returns the value of the '<em><b>Box Rotate Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Rotate Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Rotate Angle</em>' attribute.
	 * @see #isSetBoxRotateAngle()
	 * @see #unsetBoxRotateAngle()
	 * @see #setBoxRotateAngle(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getBoxRotateAngle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxRotateAngle <em>Box Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Rotate Angle</em>' attribute.
	 * @see #isSetBoxRotateAngle()
	 * @see #unsetBoxRotateAngle()
	 * @see #getBoxRotateAngle()
	 * @generated
	 */
	void setBoxRotateAngle(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxRotateAngle <em>Box Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxRotateAngle()
	 * @see #getBoxRotateAngle()
	 * @see #setBoxRotateAngle(Double)
	 * @generated
	 */
	void unsetBoxRotateAngle();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxRotateAngle <em>Box Rotate Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Rotate Angle</em>' attribute is set.
	 * @see #unsetBoxRotateAngle()
	 * @see #getBoxRotateAngle()
	 * @see #setBoxRotateAngle(Double)
	 * @generated
	 */
	boolean isSetBoxRotateAngle();

	/**
	 * Returns the value of the '<em><b>Box Slant Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Slant Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Slant Angle</em>' attribute.
	 * @see #isSetBoxSlantAngle()
	 * @see #unsetBoxSlantAngle()
	 * @see #setBoxSlantAngle(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getBoxSlantAngle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxSlantAngle <em>Box Slant Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Slant Angle</em>' attribute.
	 * @see #isSetBoxSlantAngle()
	 * @see #unsetBoxSlantAngle()
	 * @see #getBoxSlantAngle()
	 * @generated
	 */
	void setBoxSlantAngle(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxSlantAngle <em>Box Slant Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxSlantAngle()
	 * @see #getBoxSlantAngle()
	 * @see #setBoxSlantAngle(Double)
	 * @generated
	 */
	void unsetBoxSlantAngle();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxSlantAngle <em>Box Slant Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Slant Angle</em>' attribute is set.
	 * @see #unsetBoxSlantAngle()
	 * @see #getBoxSlantAngle()
	 * @see #setBoxSlantAngle(Double)
	 * @generated
	 */
	boolean isSetBoxSlantAngle();

	/**
	 * Returns the value of the '<em><b>Box Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Width</em>' attribute.
	 * @see #isSetBoxWidth()
	 * @see #unsetBoxWidth()
	 * @see #setBoxWidth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleWithBoxCharacteristics_BoxWidth()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getBoxWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxWidth <em>Box Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Width</em>' attribute.
	 * @see #isSetBoxWidth()
	 * @see #unsetBoxWidth()
	 * @see #getBoxWidth()
	 * @generated
	 */
	void setBoxWidth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxWidth <em>Box Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxWidth()
	 * @see #getBoxWidth()
	 * @see #setBoxWidth(Double)
	 * @generated
	 */
	void unsetBoxWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxWidth <em>Box Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Width</em>' attribute is set.
	 * @see #unsetBoxWidth()
	 * @see #getBoxWidth()
	 * @see #setBoxWidth(Double)
	 * @generated
	 */
	boolean isSetBoxWidth();

	/**
	 * Returns the value of the '<em><b>Box Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Height</em>' attribute.
	 * @see #isSetBoxHeight()
	 * @see #unsetBoxHeight()
	 * @see #setBoxHeight(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleWithBoxCharacteristics_BoxHeight()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getBoxHeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxHeight <em>Box Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Height</em>' attribute.
	 * @see #isSetBoxHeight()
	 * @see #unsetBoxHeight()
	 * @see #getBoxHeight()
	 * @generated
	 */
	void setBoxHeight(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxHeight <em>Box Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxHeight()
	 * @see #getBoxHeight()
	 * @see #setBoxHeight(Double)
	 * @generated
	 */
	void unsetBoxHeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextStyleWithBoxCharacteristics#getBoxHeight <em>Box Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Height</em>' attribute is set.
	 * @see #unsetBoxHeight()
	 * @see #getBoxHeight()
	 * @see #setBoxHeight(Double)
	 * @generated
	 */
	boolean isSetBoxHeight();

} // IfcTextStyleWithBoxCharacteristics
