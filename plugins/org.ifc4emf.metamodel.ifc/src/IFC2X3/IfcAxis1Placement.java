/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcAxis1PlacementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Axis1 Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcAxis1Placement#getAxis <em>Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcAxis1Placement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAxis1PlacementImplAdapter.class)
public interface IfcAxis1Placement extends IfcPlacement {
	/**
	 * Returns the value of the '<em><b>Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' reference.
	 * @see #setAxis(IfcDirection)
	 * @see IFC2X3.IFC2X3Package#getIfcAxis1Placement_Axis()
	 * @model
	 * @generated
	 */
	IfcDirection getAxis();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAxis1Placement#getAxis <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(IfcDirection value);

} // IfcAxis1Placement
