/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSurfaceOfRevolutionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Of Revolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSurfaceOfRevolution#getAxisPosition <em>Axis Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSurfaceOfRevolution()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSurfaceOfRevolutionImplAdapter.class)
public interface IfcSurfaceOfRevolution extends IfcSweptSurface {
	/**
	 * Returns the value of the '<em><b>Axis Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Position</em>' reference.
	 * @see #setAxisPosition(IfcAxis1Placement)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceOfRevolution_AxisPosition()
	 * @model required="true"
	 * @generated
	 */
	IfcAxis1Placement getAxisPosition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceOfRevolution#getAxisPosition <em>Axis Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Position</em>' reference.
	 * @see #getAxisPosition()
	 * @generated
	 */
	void setAxisPosition(IfcAxis1Placement value);

} // IfcSurfaceOfRevolution
