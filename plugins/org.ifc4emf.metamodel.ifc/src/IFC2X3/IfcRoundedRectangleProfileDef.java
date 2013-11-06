/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRoundedRectangleProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rounded Rectangle Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRoundedRectangleProfileDef#getRoundingRadius <em>Rounding Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRoundedRectangleProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRoundedRectangleProfileDefImplAdapter.class)
public interface IfcRoundedRectangleProfileDef extends IfcRectangleProfileDef {
	/**
	 * Returns the value of the '<em><b>Rounding Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rounding Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounding Radius</em>' attribute.
	 * @see #isSetRoundingRadius()
	 * @see #unsetRoundingRadius()
	 * @see #setRoundingRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRoundedRectangleProfileDef_RoundingRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getRoundingRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRoundedRectangleProfileDef#getRoundingRadius <em>Rounding Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounding Radius</em>' attribute.
	 * @see #isSetRoundingRadius()
	 * @see #unsetRoundingRadius()
	 * @see #getRoundingRadius()
	 * @generated
	 */
	void setRoundingRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRoundedRectangleProfileDef#getRoundingRadius <em>Rounding Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoundingRadius()
	 * @see #getRoundingRadius()
	 * @see #setRoundingRadius(Double)
	 * @generated
	 */
	void unsetRoundingRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRoundedRectangleProfileDef#getRoundingRadius <em>Rounding Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rounding Radius</em>' attribute is set.
	 * @see #unsetRoundingRadius()
	 * @see #getRoundingRadius()
	 * @see #setRoundingRadius(Double)
	 * @generated
	 */
	boolean isSetRoundingRadius();

} // IfcRoundedRectangleProfileDef
