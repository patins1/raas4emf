/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRevolvedAreaSolidImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Revolved Area Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRevolvedAreaSolid#getAxis <em>Axis</em>}</li>
 *   <li>{@link IFC2X3.IfcRevolvedAreaSolid#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRevolvedAreaSolid()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRevolvedAreaSolidImplAdapter.class)
public interface IfcRevolvedAreaSolid extends IfcSweptAreaSolid {
	/**
	 * Returns the value of the '<em><b>Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' reference.
	 * @see #setAxis(IfcAxis1Placement)
	 * @see IFC2X3.IFC2X3Package#getIfcRevolvedAreaSolid_Axis()
	 * @model required="true"
	 * @generated
	 */
	IfcAxis1Placement getAxis();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRevolvedAreaSolid#getAxis <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(IfcAxis1Placement value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #isSetAngle()
	 * @see #unsetAngle()
	 * @see #setAngle(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRevolvedAreaSolid_Angle()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getAngle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRevolvedAreaSolid#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #isSetAngle()
	 * @see #unsetAngle()
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRevolvedAreaSolid#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAngle()
	 * @see #getAngle()
	 * @see #setAngle(Double)
	 * @generated
	 */
	void unsetAngle();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRevolvedAreaSolid#getAngle <em>Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Angle</em>' attribute is set.
	 * @see #unsetAngle()
	 * @see #getAngle()
	 * @see #setAngle(Double)
	 * @generated
	 */
	boolean isSetAngle();

} // IfcRevolvedAreaSolid
