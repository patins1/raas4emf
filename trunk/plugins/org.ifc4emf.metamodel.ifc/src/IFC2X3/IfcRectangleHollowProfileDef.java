/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRectangleHollowProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rectangle Hollow Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRectangleHollowProfileDef#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcRectangleHollowProfileDef#getInnerFilletRadius <em>Inner Fillet Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcRectangleHollowProfileDef#getOuterFilletRadius <em>Outer Fillet Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRectangleHollowProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRectangleHollowProfileDefImplAdapter.class)
public interface IfcRectangleHollowProfileDef extends IfcRectangleProfileDef {
	/**
	 * Returns the value of the '<em><b>Outer Fillet Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Fillet Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Fillet Radius</em>' attribute.
	 * @see #isSetOuterFilletRadius()
	 * @see #unsetOuterFilletRadius()
	 * @see #setOuterFilletRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangleHollowProfileDef_OuterFilletRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getOuterFilletRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangleHollowProfileDef#getOuterFilletRadius <em>Outer Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Fillet Radius</em>' attribute.
	 * @see #isSetOuterFilletRadius()
	 * @see #unsetOuterFilletRadius()
	 * @see #getOuterFilletRadius()
	 * @generated
	 */
	void setOuterFilletRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRectangleHollowProfileDef#getOuterFilletRadius <em>Outer Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOuterFilletRadius()
	 * @see #getOuterFilletRadius()
	 * @see #setOuterFilletRadius(Double)
	 * @generated
	 */
	void unsetOuterFilletRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangleHollowProfileDef#getOuterFilletRadius <em>Outer Fillet Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Outer Fillet Radius</em>' attribute is set.
	 * @see #unsetOuterFilletRadius()
	 * @see #getOuterFilletRadius()
	 * @see #setOuterFilletRadius(Double)
	 * @generated
	 */
	boolean isSetOuterFilletRadius();

	/**
	 * Returns the value of the '<em><b>Inner Fillet Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Fillet Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Fillet Radius</em>' attribute.
	 * @see #isSetInnerFilletRadius()
	 * @see #unsetInnerFilletRadius()
	 * @see #setInnerFilletRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangleHollowProfileDef_InnerFilletRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getInnerFilletRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangleHollowProfileDef#getInnerFilletRadius <em>Inner Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Fillet Radius</em>' attribute.
	 * @see #isSetInnerFilletRadius()
	 * @see #unsetInnerFilletRadius()
	 * @see #getInnerFilletRadius()
	 * @generated
	 */
	void setInnerFilletRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRectangleHollowProfileDef#getInnerFilletRadius <em>Inner Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInnerFilletRadius()
	 * @see #getInnerFilletRadius()
	 * @see #setInnerFilletRadius(Double)
	 * @generated
	 */
	void unsetInnerFilletRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangleHollowProfileDef#getInnerFilletRadius <em>Inner Fillet Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inner Fillet Radius</em>' attribute is set.
	 * @see #unsetInnerFilletRadius()
	 * @see #getInnerFilletRadius()
	 * @see #setInnerFilletRadius(Double)
	 * @generated
	 */
	boolean isSetInnerFilletRadius();

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
	 * @see IFC2X3.IFC2X3Package#getIfcRectangleHollowProfileDef_WallThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getWallThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangleHollowProfileDef#getWallThickness <em>Wall Thickness</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcRectangleHollowProfileDef#getWallThickness <em>Wall Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWallThickness()
	 * @see #getWallThickness()
	 * @see #setWallThickness(Double)
	 * @generated
	 */
	void unsetWallThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangleHollowProfileDef#getWallThickness <em>Wall Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wall Thickness</em>' attribute is set.
	 * @see #unsetWallThickness()
	 * @see #getWallThickness()
	 * @see #setWallThickness(Double)
	 * @generated
	 */
	boolean isSetWallThickness();

} // IfcRectangleHollowProfileDef
