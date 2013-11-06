/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcLightSourceSpotImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Source Spot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLightSourceSpot#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link IFC2X3.IfcLightSourceSpot#getConcentrationExponent <em>Concentration Exponent</em>}</li>
 *   <li>{@link IFC2X3.IfcLightSourceSpot#getSpreadAngle <em>Spread Angle</em>}</li>
 *   <li>{@link IFC2X3.IfcLightSourceSpot#getBeamWidthAngle <em>Beam Width Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLightSourceSpot()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcLightSourceSpotImplAdapter.class)
public interface IfcLightSourceSpot extends IfcLightSourcePositional {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' reference.
	 * @see #setOrientation(IfcDirection)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourceSpot_Orientation()
	 * @model required="true"
	 * @generated
	 */
	IfcDirection getOrientation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourceSpot#getOrientation <em>Orientation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(IfcDirection value);

	/**
	 * Returns the value of the '<em><b>Beam Width Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beam Width Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beam Width Angle</em>' attribute.
	 * @see #isSetBeamWidthAngle()
	 * @see #unsetBeamWidthAngle()
	 * @see #setBeamWidthAngle(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourceSpot_BeamWidthAngle()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getBeamWidthAngle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourceSpot#getBeamWidthAngle <em>Beam Width Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beam Width Angle</em>' attribute.
	 * @see #isSetBeamWidthAngle()
	 * @see #unsetBeamWidthAngle()
	 * @see #getBeamWidthAngle()
	 * @generated
	 */
	void setBeamWidthAngle(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLightSourceSpot#getBeamWidthAngle <em>Beam Width Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBeamWidthAngle()
	 * @see #getBeamWidthAngle()
	 * @see #setBeamWidthAngle(Double)
	 * @generated
	 */
	void unsetBeamWidthAngle();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLightSourceSpot#getBeamWidthAngle <em>Beam Width Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Beam Width Angle</em>' attribute is set.
	 * @see #unsetBeamWidthAngle()
	 * @see #getBeamWidthAngle()
	 * @see #setBeamWidthAngle(Double)
	 * @generated
	 */
	boolean isSetBeamWidthAngle();

	/**
	 * Returns the value of the '<em><b>Spread Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spread Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spread Angle</em>' attribute.
	 * @see #isSetSpreadAngle()
	 * @see #unsetSpreadAngle()
	 * @see #setSpreadAngle(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourceSpot_SpreadAngle()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getSpreadAngle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourceSpot#getSpreadAngle <em>Spread Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spread Angle</em>' attribute.
	 * @see #isSetSpreadAngle()
	 * @see #unsetSpreadAngle()
	 * @see #getSpreadAngle()
	 * @generated
	 */
	void setSpreadAngle(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLightSourceSpot#getSpreadAngle <em>Spread Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpreadAngle()
	 * @see #getSpreadAngle()
	 * @see #setSpreadAngle(Double)
	 * @generated
	 */
	void unsetSpreadAngle();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLightSourceSpot#getSpreadAngle <em>Spread Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spread Angle</em>' attribute is set.
	 * @see #unsetSpreadAngle()
	 * @see #getSpreadAngle()
	 * @see #setSpreadAngle(Double)
	 * @generated
	 */
	boolean isSetSpreadAngle();

	/**
	 * Returns the value of the '<em><b>Concentration Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concentration Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentration Exponent</em>' attribute.
	 * @see #isSetConcentrationExponent()
	 * @see #unsetConcentrationExponent()
	 * @see #setConcentrationExponent(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourceSpot_ConcentrationExponent()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getConcentrationExponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourceSpot#getConcentrationExponent <em>Concentration Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentration Exponent</em>' attribute.
	 * @see #isSetConcentrationExponent()
	 * @see #unsetConcentrationExponent()
	 * @see #getConcentrationExponent()
	 * @generated
	 */
	void setConcentrationExponent(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLightSourceSpot#getConcentrationExponent <em>Concentration Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConcentrationExponent()
	 * @see #getConcentrationExponent()
	 * @see #setConcentrationExponent(Double)
	 * @generated
	 */
	void unsetConcentrationExponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLightSourceSpot#getConcentrationExponent <em>Concentration Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Concentration Exponent</em>' attribute is set.
	 * @see #unsetConcentrationExponent()
	 * @see #getConcentrationExponent()
	 * @see #setConcentrationExponent(Double)
	 * @generated
	 */
	boolean isSetConcentrationExponent();

} // IfcLightSourceSpot
