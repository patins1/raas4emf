/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCartesianTransformationOperatorImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cartesian Transformation Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCartesianTransformationOperator#getAxis1 <em>Axis1</em>}</li>
 *   <li>{@link IFC2X3.IfcCartesianTransformationOperator#getAxis2 <em>Axis2</em>}</li>
 *   <li>{@link IFC2X3.IfcCartesianTransformationOperator#getLocalOrigin <em>Local Origin</em>}</li>
 *   <li>{@link IFC2X3.IfcCartesianTransformationOperator#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCartesianTransformationOperator()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCartesianTransformationOperatorImplAdapter.class)
public interface IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Axis1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis1</em>' reference.
	 * @see #setAxis1(IfcDirection)
	 * @see IFC2X3.IFC2X3Package#getIfcCartesianTransformationOperator_Axis1()
	 * @model
	 * @generated
	 */
	IfcDirection getAxis1();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCartesianTransformationOperator#getAxis1 <em>Axis1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis1</em>' reference.
	 * @see #getAxis1()
	 * @generated
	 */
	void setAxis1(IfcDirection value);

	/**
	 * Returns the value of the '<em><b>Axis2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis2</em>' reference.
	 * @see #setAxis2(IfcDirection)
	 * @see IFC2X3.IFC2X3Package#getIfcCartesianTransformationOperator_Axis2()
	 * @model
	 * @generated
	 */
	IfcDirection getAxis2();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCartesianTransformationOperator#getAxis2 <em>Axis2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis2</em>' reference.
	 * @see #getAxis2()
	 * @generated
	 */
	void setAxis2(IfcDirection value);

	/**
	 * Returns the value of the '<em><b>Local Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Origin</em>' reference.
	 * @see #setLocalOrigin(IfcCartesianPoint)
	 * @see IFC2X3.IFC2X3Package#getIfcCartesianTransformationOperator_LocalOrigin()
	 * @model required="true"
	 * @generated
	 */
	IfcCartesianPoint getLocalOrigin();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCartesianTransformationOperator#getLocalOrigin <em>Local Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Origin</em>' reference.
	 * @see #getLocalOrigin()
	 * @generated
	 */
	void setLocalOrigin(IfcCartesianPoint value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #setScale(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCartesianTransformationOperator_Scale()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getScale();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCartesianTransformationOperator#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCartesianTransformationOperator#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale()
	 * @see #getScale()
	 * @see #setScale(Double)
	 * @generated
	 */
	void unsetScale();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCartesianTransformationOperator#getScale <em>Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale</em>' attribute is set.
	 * @see #unsetScale()
	 * @see #getScale()
	 * @see #setScale(Double)
	 * @generated
	 */
	boolean isSetScale();

} // IfcCartesianTransformationOperator
