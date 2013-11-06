/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCurveStyleFontAndScalingImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve Style Font And Scaling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCurveStyleFontAndScaling#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcCurveStyleFontAndScaling#getCurveFont <em>Curve Font</em>}</li>
 *   <li>{@link IFC2X3.IfcCurveStyleFontAndScaling#getCurveFontScaling <em>Curve Font Scaling</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCurveStyleFontAndScaling()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCurveStyleFontAndScalingImplAdapter.class)
public interface IfcCurveStyleFontAndScaling extends IfcCurveFontOrScaledCurveFontSelect {
	/**
	 * Returns the value of the '<em><b>Curve Font</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Font</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Font</em>' reference.
	 * @see #setCurveFont(IfcCurveStyleFontSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcCurveStyleFontAndScaling_CurveFont()
	 * @model required="true"
	 * @generated
	 */
	IfcCurveStyleFontSelect getCurveFont();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurveStyleFontAndScaling#getCurveFont <em>Curve Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Font</em>' reference.
	 * @see #getCurveFont()
	 * @generated
	 */
	void setCurveFont(IfcCurveStyleFontSelect value);

	/**
	 * Returns the value of the '<em><b>Curve Font Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Font Scaling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Font Scaling</em>' attribute.
	 * @see #isSetCurveFontScaling()
	 * @see #unsetCurveFontScaling()
	 * @see #setCurveFontScaling(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCurveStyleFontAndScaling_CurveFontScaling()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getCurveFontScaling();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurveStyleFontAndScaling#getCurveFontScaling <em>Curve Font Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Font Scaling</em>' attribute.
	 * @see #isSetCurveFontScaling()
	 * @see #unsetCurveFontScaling()
	 * @see #getCurveFontScaling()
	 * @generated
	 */
	void setCurveFontScaling(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCurveStyleFontAndScaling#getCurveFontScaling <em>Curve Font Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurveFontScaling()
	 * @see #getCurveFontScaling()
	 * @see #setCurveFontScaling(Double)
	 * @generated
	 */
	void unsetCurveFontScaling();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCurveStyleFontAndScaling#getCurveFontScaling <em>Curve Font Scaling</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Curve Font Scaling</em>' attribute is set.
	 * @see #unsetCurveFontScaling()
	 * @see #getCurveFontScaling()
	 * @see #setCurveFontScaling(Double)
	 * @generated
	 */
	boolean isSetCurveFontScaling();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcCurveStyleFontAndScaling_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurveStyleFontAndScaling#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCurveStyleFontAndScaling#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCurveStyleFontAndScaling#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // IfcCurveStyleFontAndScaling
