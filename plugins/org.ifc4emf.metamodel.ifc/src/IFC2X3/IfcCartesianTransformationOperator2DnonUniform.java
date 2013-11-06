/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCartesianTransformationOperator2DnonUniformImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cartesian Transformation Operator2 Dnon Uniform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCartesianTransformationOperator2DnonUniform#getScale2 <em>Scale2</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCartesianTransformationOperator2DnonUniform()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCartesianTransformationOperator2DnonUniformImplAdapter.class)
public interface IfcCartesianTransformationOperator2DnonUniform extends IfcCartesianTransformationOperator2D {
	/**
	 * Returns the value of the '<em><b>Scale2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale2</em>' attribute.
	 * @see #isSetScale2()
	 * @see #unsetScale2()
	 * @see #setScale2(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCartesianTransformationOperator2DnonUniform_Scale2()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getScale2();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCartesianTransformationOperator2DnonUniform#getScale2 <em>Scale2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale2</em>' attribute.
	 * @see #isSetScale2()
	 * @see #unsetScale2()
	 * @see #getScale2()
	 * @generated
	 */
	void setScale2(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCartesianTransformationOperator2DnonUniform#getScale2 <em>Scale2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale2()
	 * @see #getScale2()
	 * @see #setScale2(Double)
	 * @generated
	 */
	void unsetScale2();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCartesianTransformationOperator2DnonUniform#getScale2 <em>Scale2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale2</em>' attribute is set.
	 * @see #unsetScale2()
	 * @see #getScale2()
	 * @see #setScale2(Double)
	 * @generated
	 */
	boolean isSetScale2();

} // IfcCartesianTransformationOperator2DnonUniform
