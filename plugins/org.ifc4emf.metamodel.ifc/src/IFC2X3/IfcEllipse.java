/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcEllipseImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Ellipse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcEllipse#getSemiAxis1 <em>Semi Axis1</em>}</li>
 *   <li>{@link IFC2X3.IfcEllipse#getSemiAxis2 <em>Semi Axis2</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcEllipse()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcEllipseImplAdapter.class)
public interface IfcEllipse extends IfcConic {
	/**
	 * Returns the value of the '<em><b>Semi Axis2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semi Axis2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semi Axis2</em>' attribute.
	 * @see #isSetSemiAxis2()
	 * @see #unsetSemiAxis2()
	 * @see #setSemiAxis2(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcEllipse_SemiAxis2()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getSemiAxis2();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcEllipse#getSemiAxis2 <em>Semi Axis2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Axis2</em>' attribute.
	 * @see #isSetSemiAxis2()
	 * @see #unsetSemiAxis2()
	 * @see #getSemiAxis2()
	 * @generated
	 */
	void setSemiAxis2(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcEllipse#getSemiAxis2 <em>Semi Axis2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSemiAxis2()
	 * @see #getSemiAxis2()
	 * @see #setSemiAxis2(Double)
	 * @generated
	 */
	void unsetSemiAxis2();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcEllipse#getSemiAxis2 <em>Semi Axis2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Semi Axis2</em>' attribute is set.
	 * @see #unsetSemiAxis2()
	 * @see #getSemiAxis2()
	 * @see #setSemiAxis2(Double)
	 * @generated
	 */
	boolean isSetSemiAxis2();

	/**
	 * Returns the value of the '<em><b>Semi Axis1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semi Axis1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semi Axis1</em>' attribute.
	 * @see #isSetSemiAxis1()
	 * @see #unsetSemiAxis1()
	 * @see #setSemiAxis1(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcEllipse_SemiAxis1()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getSemiAxis1();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcEllipse#getSemiAxis1 <em>Semi Axis1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Axis1</em>' attribute.
	 * @see #isSetSemiAxis1()
	 * @see #unsetSemiAxis1()
	 * @see #getSemiAxis1()
	 * @generated
	 */
	void setSemiAxis1(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcEllipse#getSemiAxis1 <em>Semi Axis1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSemiAxis1()
	 * @see #getSemiAxis1()
	 * @see #setSemiAxis1(Double)
	 * @generated
	 */
	void unsetSemiAxis1();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcEllipse#getSemiAxis1 <em>Semi Axis1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Semi Axis1</em>' attribute is set.
	 * @see #unsetSemiAxis1()
	 * @see #getSemiAxis1()
	 * @see #setSemiAxis1(Double)
	 * @generated
	 */
	boolean isSetSemiAxis1();

} // IfcEllipse
