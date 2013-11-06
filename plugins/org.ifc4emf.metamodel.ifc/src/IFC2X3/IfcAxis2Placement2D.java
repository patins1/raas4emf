/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcAxis2Placement2DImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Axis2 Placement2 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcAxis2Placement2D#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcAxis2Placement2D()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAxis2Placement2DImplAdapter.class)
public interface IfcAxis2Placement2D extends IfcAxis2Placement, IfcPlacement {
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
	 * @see IFC2X3.IFC2X3Package#getIfcAxis2Placement2D_RefDirection()
	 * @model
	 * @generated
	 */
	IfcDirection getRefDirection();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAxis2Placement2D#getRefDirection <em>Ref Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Direction</em>' reference.
	 * @see #getRefDirection()
	 * @generated
	 */
	void setRefDirection(IfcDirection value);

} // IfcAxis2Placement2D
