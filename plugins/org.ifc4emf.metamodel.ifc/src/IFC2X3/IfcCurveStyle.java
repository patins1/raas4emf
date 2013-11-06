/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCurveStyleImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCurveStyle#getCurveFont <em>Curve Font</em>}</li>
 *   <li>{@link IFC2X3.IfcCurveStyle#getCurveWidth <em>Curve Width</em>}</li>
 *   <li>{@link IFC2X3.IfcCurveStyle#getCurveColour <em>Curve Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCurveStyle()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCurveStyleImplAdapter.class)
public interface IfcCurveStyle extends IfcPresentationStyle {
	/**
	 * Returns the value of the '<em><b>Curve Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Width</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Width</em>' containment reference.
	 * @see #setCurveWidth(IfcSizeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcCurveStyle_CurveWidth()
	 * @model containment="true"
	 * @generated
	 */
	IfcSizeSelect getCurveWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurveStyle#getCurveWidth <em>Curve Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Width</em>' containment reference.
	 * @see #getCurveWidth()
	 * @generated
	 */
	void setCurveWidth(IfcSizeSelect value);

	/**
	 * Returns the value of the '<em><b>Curve Font</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Font</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Font</em>' reference.
	 * @see #setCurveFont(IfcCurveFontOrScaledCurveFontSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcCurveStyle_CurveFont()
	 * @model
	 * @generated
	 */
	IfcCurveFontOrScaledCurveFontSelect getCurveFont();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurveStyle#getCurveFont <em>Curve Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Font</em>' reference.
	 * @see #getCurveFont()
	 * @generated
	 */
	void setCurveFont(IfcCurveFontOrScaledCurveFontSelect value);

	/**
	 * Returns the value of the '<em><b>Curve Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Colour</em>' reference.
	 * @see #setCurveColour(IfcColour)
	 * @see IFC2X3.IFC2X3Package#getIfcCurveStyle_CurveColour()
	 * @model
	 * @generated
	 */
	IfcColour getCurveColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurveStyle#getCurveColour <em>Curve Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Colour</em>' reference.
	 * @see #getCurveColour()
	 * @generated
	 */
	void setCurveColour(IfcColour value);

} // IfcCurveStyle
