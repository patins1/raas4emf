/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcAxis2Placement3DImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Axis2 Placement3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcAxis2Placement3D#getAxis <em>Axis</em>}</li>
 *   <li>{@link IFC2X3.IfcAxis2Placement3D#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcAxis2Placement3D()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAxis2Placement3DImplAdapter.class)
public interface IfcAxis2Placement3D extends IfcAxis2Placement, IfcPlacement {
	/**
	 * Returns the value of the '<em><b>Ref Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Direction</em>' reference.
	 * @see #setRefDirection(IfcDirection)
	 * @see IFC2X3.IFC2X3Package#getIfcAxis2Placement3D_RefDirection()
	 * @model
	 * @generated
	 */
	IfcDirection getRefDirection();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAxis2Placement3D#getRefDirection <em>Ref Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Direction</em>' reference.
	 * @see #getRefDirection()
	 * @generated
	 */
	void setRefDirection(IfcDirection value);

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
	 * @see IFC2X3.IFC2X3Package#getIfcAxis2Placement3D_Axis()
	 * @model
	 * @generated
	 */
	IfcDirection getAxis();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAxis2Placement3D#getAxis <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(IfcDirection value);

} // IfcAxis2Placement3D
