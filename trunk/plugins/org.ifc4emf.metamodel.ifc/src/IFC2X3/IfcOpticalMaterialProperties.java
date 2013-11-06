/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcOpticalMaterialPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Optical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcOpticalMaterialProperties#getVisibleTransmittance <em>Visible Transmittance</em>}</li>
 *   <li>{@link IFC2X3.IfcOpticalMaterialProperties#getSolarTransmittance <em>Solar Transmittance</em>}</li>
 *   <li>{@link IFC2X3.IfcOpticalMaterialProperties#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}</li>
 *   <li>{@link IFC2X3.IfcOpticalMaterialProperties#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}</li>
 *   <li>{@link IFC2X3.IfcOpticalMaterialProperties#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}</li>
 *   <li>{@link IFC2X3.IfcOpticalMaterialProperties#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}</li>
 *   <li>{@link IFC2X3.IfcOpticalMaterialProperties#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}</li>
 *   <li>{@link IFC2X3.IfcOpticalMaterialProperties#getSolarReflectanceFront <em>Solar Reflectance Front</em>}</li>
 *   <li>{@link IFC2X3.IfcOpticalMaterialProperties#getSolarReflectanceBack <em>Solar Reflectance Back</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcOpticalMaterialProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcOpticalMaterialPropertiesImplAdapter.class)
public interface IfcOpticalMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Solar Reflectance Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar Reflectance Back</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar Reflectance Back</em>' attribute.
	 * @see #isSetSolarReflectanceBack()
	 * @see #unsetSolarReflectanceBack()
	 * @see #setSolarReflectanceBack(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcOpticalMaterialProperties_SolarReflectanceBack()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getSolarReflectanceBack();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getSolarReflectanceBack <em>Solar Reflectance Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar Reflectance Back</em>' attribute.
	 * @see #isSetSolarReflectanceBack()
	 * @see #unsetSolarReflectanceBack()
	 * @see #getSolarReflectanceBack()
	 * @generated
	 */
	void setSolarReflectanceBack(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getSolarReflectanceBack <em>Solar Reflectance Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSolarReflectanceBack()
	 * @see #getSolarReflectanceBack()
	 * @see #setSolarReflectanceBack(Double)
	 * @generated
	 */
	void unsetSolarReflectanceBack();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getSolarReflectanceBack <em>Solar Reflectance Back</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Solar Reflectance Back</em>' attribute is set.
	 * @see #unsetSolarReflectanceBack()
	 * @see #getSolarReflectanceBack()
	 * @see #setSolarReflectanceBack(Double)
	 * @generated
	 */
	boolean isSetSolarReflectanceBack();

	/**
	 * Returns the value of the '<em><b>Solar Reflectance Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar Reflectance Front</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar Reflectance Front</em>' attribute.
	 * @see #isSetSolarReflectanceFront()
	 * @see #unsetSolarReflectanceFront()
	 * @see #setSolarReflectanceFront(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcOpticalMaterialProperties_SolarReflectanceFront()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getSolarReflectanceFront();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getSolarReflectanceFront <em>Solar Reflectance Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar Reflectance Front</em>' attribute.
	 * @see #isSetSolarReflectanceFront()
	 * @see #unsetSolarReflectanceFront()
	 * @see #getSolarReflectanceFront()
	 * @generated
	 */
	void setSolarReflectanceFront(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getSolarReflectanceFront <em>Solar Reflectance Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSolarReflectanceFront()
	 * @see #getSolarReflectanceFront()
	 * @see #setSolarReflectanceFront(Double)
	 * @generated
	 */
	void unsetSolarReflectanceFront();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getSolarReflectanceFront <em>Solar Reflectance Front</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Solar Reflectance Front</em>' attribute is set.
	 * @see #unsetSolarReflectanceFront()
	 * @see #getSolarReflectanceFront()
	 * @see #setSolarReflectanceFront(Double)
	 * @generated
	 */
	boolean isSetSolarReflectanceFront();

	/**
	 * Returns the value of the '<em><b>Visible Reflectance Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Reflectance Front</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Reflectance Front</em>' attribute.
	 * @see #isSetVisibleReflectanceFront()
	 * @see #unsetVisibleReflectanceFront()
	 * @see #setVisibleReflectanceFront(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcOpticalMaterialProperties_VisibleReflectanceFront()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getVisibleReflectanceFront();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Reflectance Front</em>' attribute.
	 * @see #isSetVisibleReflectanceFront()
	 * @see #unsetVisibleReflectanceFront()
	 * @see #getVisibleReflectanceFront()
	 * @generated
	 */
	void setVisibleReflectanceFront(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibleReflectanceFront()
	 * @see #getVisibleReflectanceFront()
	 * @see #setVisibleReflectanceFront(Double)
	 * @generated
	 */
	void unsetVisibleReflectanceFront();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible Reflectance Front</em>' attribute is set.
	 * @see #unsetVisibleReflectanceFront()
	 * @see #getVisibleReflectanceFront()
	 * @see #setVisibleReflectanceFront(Double)
	 * @generated
	 */
	boolean isSetVisibleReflectanceFront();

	/**
	 * Returns the value of the '<em><b>Visible Reflectance Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Reflectance Back</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Reflectance Back</em>' attribute.
	 * @see #isSetVisibleReflectanceBack()
	 * @see #unsetVisibleReflectanceBack()
	 * @see #setVisibleReflectanceBack(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcOpticalMaterialProperties_VisibleReflectanceBack()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getVisibleReflectanceBack();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Reflectance Back</em>' attribute.
	 * @see #isSetVisibleReflectanceBack()
	 * @see #unsetVisibleReflectanceBack()
	 * @see #getVisibleReflectanceBack()
	 * @generated
	 */
	void setVisibleReflectanceBack(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibleReflectanceBack()
	 * @see #getVisibleReflectanceBack()
	 * @see #setVisibleReflectanceBack(Double)
	 * @generated
	 */
	void unsetVisibleReflectanceBack();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible Reflectance Back</em>' attribute is set.
	 * @see #unsetVisibleReflectanceBack()
	 * @see #getVisibleReflectanceBack()
	 * @see #setVisibleReflectanceBack(Double)
	 * @generated
	 */
	boolean isSetVisibleReflectanceBack();

	/**
	 * Returns the value of the '<em><b>Thermal Ir Emissivity Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Ir Emissivity Front</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Ir Emissivity Front</em>' attribute.
	 * @see #isSetThermalIrEmissivityFront()
	 * @see #unsetThermalIrEmissivityFront()
	 * @see #setThermalIrEmissivityFront(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcOpticalMaterialProperties_ThermalIrEmissivityFront()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getThermalIrEmissivityFront();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Ir Emissivity Front</em>' attribute.
	 * @see #isSetThermalIrEmissivityFront()
	 * @see #unsetThermalIrEmissivityFront()
	 * @see #getThermalIrEmissivityFront()
	 * @generated
	 */
	void setThermalIrEmissivityFront(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalIrEmissivityFront()
	 * @see #getThermalIrEmissivityFront()
	 * @see #setThermalIrEmissivityFront(Double)
	 * @generated
	 */
	void unsetThermalIrEmissivityFront();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Ir Emissivity Front</em>' attribute is set.
	 * @see #unsetThermalIrEmissivityFront()
	 * @see #getThermalIrEmissivityFront()
	 * @see #setThermalIrEmissivityFront(Double)
	 * @generated
	 */
	boolean isSetThermalIrEmissivityFront();

	/**
	 * Returns the value of the '<em><b>Thermal Ir Emissivity Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Ir Emissivity Back</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Ir Emissivity Back</em>' attribute.
	 * @see #isSetThermalIrEmissivityBack()
	 * @see #unsetThermalIrEmissivityBack()
	 * @see #setThermalIrEmissivityBack(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcOpticalMaterialProperties_ThermalIrEmissivityBack()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getThermalIrEmissivityBack();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Ir Emissivity Back</em>' attribute.
	 * @see #isSetThermalIrEmissivityBack()
	 * @see #unsetThermalIrEmissivityBack()
	 * @see #getThermalIrEmissivityBack()
	 * @generated
	 */
	void setThermalIrEmissivityBack(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalIrEmissivityBack()
	 * @see #getThermalIrEmissivityBack()
	 * @see #setThermalIrEmissivityBack(Double)
	 * @generated
	 */
	void unsetThermalIrEmissivityBack();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Ir Emissivity Back</em>' attribute is set.
	 * @see #unsetThermalIrEmissivityBack()
	 * @see #getThermalIrEmissivityBack()
	 * @see #setThermalIrEmissivityBack(Double)
	 * @generated
	 */
	boolean isSetThermalIrEmissivityBack();

	/**
	 * Returns the value of the '<em><b>Thermal Ir Transmittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Ir Transmittance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Ir Transmittance</em>' attribute.
	 * @see #isSetThermalIrTransmittance()
	 * @see #unsetThermalIrTransmittance()
	 * @see #setThermalIrTransmittance(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcOpticalMaterialProperties_ThermalIrTransmittance()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getThermalIrTransmittance();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Ir Transmittance</em>' attribute.
	 * @see #isSetThermalIrTransmittance()
	 * @see #unsetThermalIrTransmittance()
	 * @see #getThermalIrTransmittance()
	 * @generated
	 */
	void setThermalIrTransmittance(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalIrTransmittance()
	 * @see #getThermalIrTransmittance()
	 * @see #setThermalIrTransmittance(Double)
	 * @generated
	 */
	void unsetThermalIrTransmittance();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Ir Transmittance</em>' attribute is set.
	 * @see #unsetThermalIrTransmittance()
	 * @see #getThermalIrTransmittance()
	 * @see #setThermalIrTransmittance(Double)
	 * @generated
	 */
	boolean isSetThermalIrTransmittance();

	/**
	 * Returns the value of the '<em><b>Solar Transmittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar Transmittance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar Transmittance</em>' attribute.
	 * @see #isSetSolarTransmittance()
	 * @see #unsetSolarTransmittance()
	 * @see #setSolarTransmittance(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcOpticalMaterialProperties_SolarTransmittance()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getSolarTransmittance();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getSolarTransmittance <em>Solar Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar Transmittance</em>' attribute.
	 * @see #isSetSolarTransmittance()
	 * @see #unsetSolarTransmittance()
	 * @see #getSolarTransmittance()
	 * @generated
	 */
	void setSolarTransmittance(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getSolarTransmittance <em>Solar Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSolarTransmittance()
	 * @see #getSolarTransmittance()
	 * @see #setSolarTransmittance(Double)
	 * @generated
	 */
	void unsetSolarTransmittance();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getSolarTransmittance <em>Solar Transmittance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Solar Transmittance</em>' attribute is set.
	 * @see #unsetSolarTransmittance()
	 * @see #getSolarTransmittance()
	 * @see #setSolarTransmittance(Double)
	 * @generated
	 */
	boolean isSetSolarTransmittance();

	/**
	 * Returns the value of the '<em><b>Visible Transmittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Transmittance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Transmittance</em>' attribute.
	 * @see #isSetVisibleTransmittance()
	 * @see #unsetVisibleTransmittance()
	 * @see #setVisibleTransmittance(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcOpticalMaterialProperties_VisibleTransmittance()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getVisibleTransmittance();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getVisibleTransmittance <em>Visible Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Transmittance</em>' attribute.
	 * @see #isSetVisibleTransmittance()
	 * @see #unsetVisibleTransmittance()
	 * @see #getVisibleTransmittance()
	 * @generated
	 */
	void setVisibleTransmittance(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getVisibleTransmittance <em>Visible Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibleTransmittance()
	 * @see #getVisibleTransmittance()
	 * @see #setVisibleTransmittance(Double)
	 * @generated
	 */
	void unsetVisibleTransmittance();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOpticalMaterialProperties#getVisibleTransmittance <em>Visible Transmittance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible Transmittance</em>' attribute is set.
	 * @see #unsetVisibleTransmittance()
	 * @see #getVisibleTransmittance()
	 * @see #setVisibleTransmittance(Double)
	 * @generated
	 */
	boolean isSetVisibleTransmittance();

} // IfcOpticalMaterialProperties
