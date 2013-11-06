/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCenterLineProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Center Line Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCenterLineProfileDef#getThickness <em>Thickness</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCenterLineProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCenterLineProfileDefImplAdapter.class)
public interface IfcCenterLineProfileDef extends IfcArbitraryOpenProfileDef {
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
	 * @see IFC2X3.IFC2X3Package#getIfcCenterLineProfileDef_Thickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCenterLineProfileDef#getThickness <em>Thickness</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcCenterLineProfileDef#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThickness()
	 * @see #getThickness()
	 * @see #setThickness(Double)
	 * @generated
	 */
	void unsetThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCenterLineProfileDef#getThickness <em>Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thickness</em>' attribute is set.
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @see #setThickness(Double)
	 * @generated
	 */
	boolean isSetThickness();

} // IfcCenterLineProfileDef
