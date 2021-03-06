/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCircleHollowProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Circle Hollow Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCircleHollowProfileDef#getWallThickness <em>Wall Thickness</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCircleHollowProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCircleHollowProfileDefImplAdapter.class)
public interface IfcCircleHollowProfileDef extends IfcCircleProfileDef {
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
	 * @see IFC2X3.IFC2X3Package#getIfcCircleHollowProfileDef_WallThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getWallThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCircleHollowProfileDef#getWallThickness <em>Wall Thickness</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcCircleHollowProfileDef#getWallThickness <em>Wall Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWallThickness()
	 * @see #getWallThickness()
	 * @see #setWallThickness(Double)
	 * @generated
	 */
	void unsetWallThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCircleHollowProfileDef#getWallThickness <em>Wall Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wall Thickness</em>' attribute is set.
	 * @see #unsetWallThickness()
	 * @see #getWallThickness()
	 * @see #setWallThickness(Double)
	 * @generated
	 */
	boolean isSetWallThickness();

} // IfcCircleHollowProfileDef
