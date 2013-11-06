/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcFillAreaStyleHatchingImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fill Area Style Hatching</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFillAreaStyleHatching#getHatchLineAppearance <em>Hatch Line Appearance</em>}</li>
 *   <li>{@link IFC2X3.IfcFillAreaStyleHatching#getStartOfNextHatchLine <em>Start Of Next Hatch Line</em>}</li>
 *   <li>{@link IFC2X3.IfcFillAreaStyleHatching#getPointOfReferenceHatchLine <em>Point Of Reference Hatch Line</em>}</li>
 *   <li>{@link IFC2X3.IfcFillAreaStyleHatching#getPatternStart <em>Pattern Start</em>}</li>
 *   <li>{@link IFC2X3.IfcFillAreaStyleHatching#getHatchLineAngle <em>Hatch Line Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyleHatching()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFillAreaStyleHatchingImplAdapter.class)
public interface IfcFillAreaStyleHatching extends IfcFillStyleSelect, IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Start Of Next Hatch Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Of Next Hatch Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Of Next Hatch Line</em>' containment reference.
	 * @see #setStartOfNextHatchLine(IfcHatchLineDistanceSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyleHatching_StartOfNextHatchLine()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IfcHatchLineDistanceSelect getStartOfNextHatchLine();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFillAreaStyleHatching#getStartOfNextHatchLine <em>Start Of Next Hatch Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Of Next Hatch Line</em>' containment reference.
	 * @see #getStartOfNextHatchLine()
	 * @generated
	 */
	void setStartOfNextHatchLine(IfcHatchLineDistanceSelect value);

	/**
	 * Returns the value of the '<em><b>Pattern Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Start</em>' reference.
	 * @see #setPatternStart(IfcCartesianPoint)
	 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyleHatching_PatternStart()
	 * @model
	 * @generated
	 */
	IfcCartesianPoint getPatternStart();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFillAreaStyleHatching#getPatternStart <em>Pattern Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Start</em>' reference.
	 * @see #getPatternStart()
	 * @generated
	 */
	void setPatternStart(IfcCartesianPoint value);

	/**
	 * Returns the value of the '<em><b>Point Of Reference Hatch Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Of Reference Hatch Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Of Reference Hatch Line</em>' reference.
	 * @see #setPointOfReferenceHatchLine(IfcCartesianPoint)
	 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyleHatching_PointOfReferenceHatchLine()
	 * @model
	 * @generated
	 */
	IfcCartesianPoint getPointOfReferenceHatchLine();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFillAreaStyleHatching#getPointOfReferenceHatchLine <em>Point Of Reference Hatch Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Of Reference Hatch Line</em>' reference.
	 * @see #getPointOfReferenceHatchLine()
	 * @generated
	 */
	void setPointOfReferenceHatchLine(IfcCartesianPoint value);

	/**
	 * Returns the value of the '<em><b>Hatch Line Appearance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hatch Line Appearance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hatch Line Appearance</em>' reference.
	 * @see #setHatchLineAppearance(IfcCurveStyle)
	 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyleHatching_HatchLineAppearance()
	 * @model required="true"
	 * @generated
	 */
	IfcCurveStyle getHatchLineAppearance();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFillAreaStyleHatching#getHatchLineAppearance <em>Hatch Line Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Line Appearance</em>' reference.
	 * @see #getHatchLineAppearance()
	 * @generated
	 */
	void setHatchLineAppearance(IfcCurveStyle value);

	/**
	 * Returns the value of the '<em><b>Hatch Line Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hatch Line Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hatch Line Angle</em>' attribute.
	 * @see #isSetHatchLineAngle()
	 * @see #unsetHatchLineAngle()
	 * @see #setHatchLineAngle(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyleHatching_HatchLineAngle()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getHatchLineAngle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFillAreaStyleHatching#getHatchLineAngle <em>Hatch Line Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Line Angle</em>' attribute.
	 * @see #isSetHatchLineAngle()
	 * @see #unsetHatchLineAngle()
	 * @see #getHatchLineAngle()
	 * @generated
	 */
	void setHatchLineAngle(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFillAreaStyleHatching#getHatchLineAngle <em>Hatch Line Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHatchLineAngle()
	 * @see #getHatchLineAngle()
	 * @see #setHatchLineAngle(Double)
	 * @generated
	 */
	void unsetHatchLineAngle();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFillAreaStyleHatching#getHatchLineAngle <em>Hatch Line Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hatch Line Angle</em>' attribute is set.
	 * @see #unsetHatchLineAngle()
	 * @see #getHatchLineAngle()
	 * @see #setHatchLineAngle(Double)
	 * @generated
	 */
	boolean isSetHatchLineAngle();

} // IfcFillAreaStyleHatching
