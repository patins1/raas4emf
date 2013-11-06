/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcParameterizedProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Parameterized Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcParameterizedProfileDef#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcParameterizedProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcParameterizedProfileDefImplAdapter.class)
public interface IfcParameterizedProfileDef extends IfcProfileDef {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(IfcAxis2Placement2D)
	 * @see IFC2X3.IFC2X3Package#getIfcParameterizedProfileDef_Position()
	 * @model required="true"
	 * @generated
	 */
	IfcAxis2Placement2D getPosition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcParameterizedProfileDef#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IfcAxis2Placement2D value);

} // IfcParameterizedProfileDef
