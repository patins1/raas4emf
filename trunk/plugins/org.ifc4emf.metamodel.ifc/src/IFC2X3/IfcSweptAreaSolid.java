/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSweptAreaSolidImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSweptAreaSolid#getSweptArea <em>Swept Area</em>}</li>
 *   <li>{@link IFC2X3.IfcSweptAreaSolid#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSweptAreaSolid()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSweptAreaSolidImplAdapter.class)
public interface IfcSweptAreaSolid extends IfcSolidModel {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(IfcAxis2Placement3D)
	 * @see IFC2X3.IFC2X3Package#getIfcSweptAreaSolid_Position()
	 * @model required="true"
	 * @generated
	 */
	IfcAxis2Placement3D getPosition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSweptAreaSolid#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IfcAxis2Placement3D value);

	/**
	 * Returns the value of the '<em><b>Swept Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swept Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swept Area</em>' reference.
	 * @see #setSweptArea(IfcProfileDef)
	 * @see IFC2X3.IFC2X3Package#getIfcSweptAreaSolid_SweptArea()
	 * @model required="true"
	 * @generated
	 */
	IfcProfileDef getSweptArea();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSweptAreaSolid#getSweptArea <em>Swept Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swept Area</em>' reference.
	 * @see #getSweptArea()
	 * @generated
	 */
	void setSweptArea(IfcProfileDef value);

} // IfcSweptAreaSolid
