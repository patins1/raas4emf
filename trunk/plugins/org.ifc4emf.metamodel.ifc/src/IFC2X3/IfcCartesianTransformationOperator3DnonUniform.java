/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCartesianTransformationOperator3DnonUniformImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cartesian Transformation Operator3 Dnon Uniform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCartesianTransformationOperator3DnonUniform#getScale2 <em>Scale2</em>}</li>
 *   <li>{@link IFC2X3.IfcCartesianTransformationOperator3DnonUniform#getScale3 <em>Scale3</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCartesianTransformationOperator3DnonUniform()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCartesianTransformationOperator3DnonUniformImplAdapter.class)
public interface IfcCartesianTransformationOperator3DnonUniform extends IfcCartesianTransformationOperator3D {
	/**
	 * Returns the value of the '<em><b>Scale3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale3</em>' attribute.
	 * @see #isSetScale3()
	 * @see #unsetScale3()
	 * @see #setScale3(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCartesianTransformationOperator3DnonUniform_Scale3()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getScale3();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCartesianTransformationOperator3DnonUniform#getScale3 <em>Scale3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale3</em>' attribute.
	 * @see #isSetScale3()
	 * @see #unsetScale3()
	 * @see #getScale3()
	 * @generated
	 */
	void setScale3(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCartesianTransformationOperator3DnonUniform#getScale3 <em>Scale3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale3()
	 * @see #getScale3()
	 * @see #setScale3(Double)
	 * @generated
	 */
	void unsetScale3();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCartesianTransformationOperator3DnonUniform#getScale3 <em>Scale3</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale3</em>' attribute is set.
	 * @see #unsetScale3()
	 * @see #getScale3()
	 * @see #setScale3(Double)
	 * @generated
	 */
	boolean isSetScale3();

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
	 * @see IFC2X3.IFC2X3Package#getIfcCartesianTransformationOperator3DnonUniform_Scale2()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getScale2();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCartesianTransformationOperator3DnonUniform#getScale2 <em>Scale2</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcCartesianTransformationOperator3DnonUniform#getScale2 <em>Scale2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale2()
	 * @see #getScale2()
	 * @see #setScale2(Double)
	 * @generated
	 */
	void unsetScale2();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCartesianTransformationOperator3DnonUniform#getScale2 <em>Scale2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale2</em>' attribute is set.
	 * @see #unsetScale2()
	 * @see #getScale2()
	 * @see #setScale2(Double)
	 * @generated
	 */
	boolean isSetScale2();

} // IfcCartesianTransformationOperator3DnonUniform
