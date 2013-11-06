/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcLightSourceGoniometricImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Source Goniometric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLightSourceGoniometric#getPosition <em>Position</em>}</li>
 *   <li>{@link IFC2X3.IfcLightSourceGoniometric#getColourAppearance <em>Colour Appearance</em>}</li>
 *   <li>{@link IFC2X3.IfcLightSourceGoniometric#getColourTemperature <em>Colour Temperature</em>}</li>
 *   <li>{@link IFC2X3.IfcLightSourceGoniometric#getLuminousFlux <em>Luminous Flux</em>}</li>
 *   <li>{@link IFC2X3.IfcLightSourceGoniometric#getLightEmissionSource <em>Light Emission Source</em>}</li>
 *   <li>{@link IFC2X3.IfcLightSourceGoniometric#getLightDistributionDataSource <em>Light Distribution Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLightSourceGoniometric()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcLightSourceGoniometricImplAdapter.class)
public interface IfcLightSourceGoniometric extends IfcLightSource {
	/**
	 * Returns the value of the '<em><b>Light Distribution Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Distribution Data Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Distribution Data Source</em>' reference.
	 * @see #setLightDistributionDataSource(IfcLightDistributionDataSourceSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourceGoniometric_LightDistributionDataSource()
	 * @model required="true"
	 * @generated
	 */
	IfcLightDistributionDataSourceSelect getLightDistributionDataSource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourceGoniometric#getLightDistributionDataSource <em>Light Distribution Data Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Distribution Data Source</em>' reference.
	 * @see #getLightDistributionDataSource()
	 * @generated
	 */
	void setLightDistributionDataSource(IfcLightDistributionDataSourceSelect value);

	/**
	 * Returns the value of the '<em><b>Colour Appearance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour Appearance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour Appearance</em>' reference.
	 * @see #setColourAppearance(IfcColourRgb)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourceGoniometric_ColourAppearance()
	 * @model
	 * @generated
	 */
	IfcColourRgb getColourAppearance();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourceGoniometric#getColourAppearance <em>Colour Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Appearance</em>' reference.
	 * @see #getColourAppearance()
	 * @generated
	 */
	void setColourAppearance(IfcColourRgb value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(IfcAxis2Placement3D)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourceGoniometric_Position()
	 * @model required="true"
	 * @generated
	 */
	IfcAxis2Placement3D getPosition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourceGoniometric#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IfcAxis2Placement3D value);

	/**
	 * Returns the value of the '<em><b>Light Emission Source</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcLightEmissionSourceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Emission Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Emission Source</em>' attribute.
	 * @see IFC2X3.IfcLightEmissionSourceEnum
	 * @see #isSetLightEmissionSource()
	 * @see #unsetLightEmissionSource()
	 * @see #setLightEmissionSource(IfcLightEmissionSourceEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourceGoniometric_LightEmissionSource()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcLightEmissionSourceEnum getLightEmissionSource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourceGoniometric#getLightEmissionSource <em>Light Emission Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Emission Source</em>' attribute.
	 * @see IFC2X3.IfcLightEmissionSourceEnum
	 * @see #isSetLightEmissionSource()
	 * @see #unsetLightEmissionSource()
	 * @see #getLightEmissionSource()
	 * @generated
	 */
	void setLightEmissionSource(IfcLightEmissionSourceEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLightSourceGoniometric#getLightEmissionSource <em>Light Emission Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLightEmissionSource()
	 * @see #getLightEmissionSource()
	 * @see #setLightEmissionSource(IfcLightEmissionSourceEnum)
	 * @generated
	 */
	void unsetLightEmissionSource();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLightSourceGoniometric#getLightEmissionSource <em>Light Emission Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Light Emission Source</em>' attribute is set.
	 * @see #unsetLightEmissionSource()
	 * @see #getLightEmissionSource()
	 * @see #setLightEmissionSource(IfcLightEmissionSourceEnum)
	 * @generated
	 */
	boolean isSetLightEmissionSource();

	/**
	 * Returns the value of the '<em><b>Luminous Flux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminous Flux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminous Flux</em>' attribute.
	 * @see #isSetLuminousFlux()
	 * @see #unsetLuminousFlux()
	 * @see #setLuminousFlux(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourceGoniometric_LuminousFlux()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getLuminousFlux();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourceGoniometric#getLuminousFlux <em>Luminous Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminous Flux</em>' attribute.
	 * @see #isSetLuminousFlux()
	 * @see #unsetLuminousFlux()
	 * @see #getLuminousFlux()
	 * @generated
	 */
	void setLuminousFlux(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLightSourceGoniometric#getLuminousFlux <em>Luminous Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLuminousFlux()
	 * @see #getLuminousFlux()
	 * @see #setLuminousFlux(Double)
	 * @generated
	 */
	void unsetLuminousFlux();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLightSourceGoniometric#getLuminousFlux <em>Luminous Flux</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Luminous Flux</em>' attribute is set.
	 * @see #unsetLuminousFlux()
	 * @see #getLuminousFlux()
	 * @see #setLuminousFlux(Double)
	 * @generated
	 */
	boolean isSetLuminousFlux();

	/**
	 * Returns the value of the '<em><b>Colour Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour Temperature</em>' attribute.
	 * @see #isSetColourTemperature()
	 * @see #unsetColourTemperature()
	 * @see #setColourTemperature(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourceGoniometric_ColourTemperature()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getColourTemperature();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourceGoniometric#getColourTemperature <em>Colour Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Temperature</em>' attribute.
	 * @see #isSetColourTemperature()
	 * @see #unsetColourTemperature()
	 * @see #getColourTemperature()
	 * @generated
	 */
	void setColourTemperature(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLightSourceGoniometric#getColourTemperature <em>Colour Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColourTemperature()
	 * @see #getColourTemperature()
	 * @see #setColourTemperature(Double)
	 * @generated
	 */
	void unsetColourTemperature();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLightSourceGoniometric#getColourTemperature <em>Colour Temperature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Colour Temperature</em>' attribute is set.
	 * @see #unsetColourTemperature()
	 * @see #getColourTemperature()
	 * @see #setColourTemperature(Double)
	 * @generated
	 */
	boolean isSetColourTemperature();

} // IfcLightSourceGoniometric
