/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCartesianTransformationOperator3DImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cartesian Transformation Operator3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCartesianTransformationOperator3D#getAxis3 <em>Axis3</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCartesianTransformationOperator3D()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCartesianTransformationOperator3DImplAdapter.class)
public interface IfcCartesianTransformationOperator3D extends IfcCartesianTransformationOperator {
	/**
	 * Returns the value of the '<em><b>Axis3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis3</em>' reference.
	 * @see #setAxis3(IfcDirection)
	 * @see IFC2X3.IFC2X3Package#getIfcCartesianTransformationOperator3D_Axis3()
	 * @model
	 * @generated
	 */
	IfcDirection getAxis3();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCartesianTransformationOperator3D#getAxis3 <em>Axis3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis3</em>' reference.
	 * @see #getAxis3()
	 * @generated
	 */
	void setAxis3(IfcDirection value);

} // IfcCartesianTransformationOperator3D
