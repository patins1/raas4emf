/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcThermalMaterialPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Thermal Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcThermalMaterialProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link IFC2X3.IfcThermalMaterialProperties#getBoilingPoint <em>Boiling Point</em>}</li>
 *   <li>{@link IFC2X3.IfcThermalMaterialProperties#getFreezingPoint <em>Freezing Point</em>}</li>
 *   <li>{@link IFC2X3.IfcThermalMaterialProperties#getThermalConductivity <em>Thermal Conductivity</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcThermalMaterialProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcThermalMaterialPropertiesImplAdapter.class)
public interface IfcThermalMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Thermal Conductivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Conductivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Conductivity</em>' attribute.
	 * @see #isSetThermalConductivity()
	 * @see #unsetThermalConductivity()
	 * @see #setThermalConductivity(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcThermalMaterialProperties_ThermalConductivity()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getThermalConductivity();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcThermalMaterialProperties#getThermalConductivity <em>Thermal Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Conductivity</em>' attribute.
	 * @see #isSetThermalConductivity()
	 * @see #unsetThermalConductivity()
	 * @see #getThermalConductivity()
	 * @generated
	 */
	void setThermalConductivity(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcThermalMaterialProperties#getThermalConductivity <em>Thermal Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalConductivity()
	 * @see #getThermalConductivity()
	 * @see #setThermalConductivity(Double)
	 * @generated
	 */
	void unsetThermalConductivity();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcThermalMaterialProperties#getThermalConductivity <em>Thermal Conductivity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Conductivity</em>' attribute is set.
	 * @see #unsetThermalConductivity()
	 * @see #getThermalConductivity()
	 * @see #setThermalConductivity(Double)
	 * @generated
	 */
	boolean isSetThermalConductivity();

	/**
	 * Returns the value of the '<em><b>Freezing Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freezing Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freezing Point</em>' attribute.
	 * @see #isSetFreezingPoint()
	 * @see #unsetFreezingPoint()
	 * @see #setFreezingPoint(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcThermalMaterialProperties_FreezingPoint()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFreezingPoint();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcThermalMaterialProperties#getFreezingPoint <em>Freezing Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freezing Point</em>' attribute.
	 * @see #isSetFreezingPoint()
	 * @see #unsetFreezingPoint()
	 * @see #getFreezingPoint()
	 * @generated
	 */
	void setFreezingPoint(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcThermalMaterialProperties#getFreezingPoint <em>Freezing Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFreezingPoint()
	 * @see #getFreezingPoint()
	 * @see #setFreezingPoint(Double)
	 * @generated
	 */
	void unsetFreezingPoint();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcThermalMaterialProperties#getFreezingPoint <em>Freezing Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Freezing Point</em>' attribute is set.
	 * @see #unsetFreezingPoint()
	 * @see #getFreezingPoint()
	 * @see #setFreezingPoint(Double)
	 * @generated
	 */
	boolean isSetFreezingPoint();

	/**
	 * Returns the value of the '<em><b>Boiling Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boiling Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boiling Point</em>' attribute.
	 * @see #isSetBoilingPoint()
	 * @see #unsetBoilingPoint()
	 * @see #setBoilingPoint(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcThermalMaterialProperties_BoilingPoint()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getBoilingPoint();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcThermalMaterialProperties#getBoilingPoint <em>Boiling Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boiling Point</em>' attribute.
	 * @see #isSetBoilingPoint()
	 * @see #unsetBoilingPoint()
	 * @see #getBoilingPoint()
	 * @generated
	 */
	void setBoilingPoint(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcThermalMaterialProperties#getBoilingPoint <em>Boiling Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoilingPoint()
	 * @see #getBoilingPoint()
	 * @see #setBoilingPoint(Double)
	 * @generated
	 */
	void unsetBoilingPoint();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcThermalMaterialProperties#getBoilingPoint <em>Boiling Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boiling Point</em>' attribute is set.
	 * @see #unsetBoilingPoint()
	 * @see #getBoilingPoint()
	 * @see #setBoilingPoint(Double)
	 * @generated
	 */
	boolean isSetBoilingPoint();

	/**
	 * Returns the value of the '<em><b>Specific Heat Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Heat Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Heat Capacity</em>' attribute.
	 * @see #isSetSpecificHeatCapacity()
	 * @see #unsetSpecificHeatCapacity()
	 * @see #setSpecificHeatCapacity(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcThermalMaterialProperties_SpecificHeatCapacity()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getSpecificHeatCapacity();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcThermalMaterialProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Heat Capacity</em>' attribute.
	 * @see #isSetSpecificHeatCapacity()
	 * @see #unsetSpecificHeatCapacity()
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 */
	void setSpecificHeatCapacity(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcThermalMaterialProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecificHeatCapacity()
	 * @see #getSpecificHeatCapacity()
	 * @see #setSpecificHeatCapacity(Double)
	 * @generated
	 */
	void unsetSpecificHeatCapacity();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcThermalMaterialProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specific Heat Capacity</em>' attribute is set.
	 * @see #unsetSpecificHeatCapacity()
	 * @see #getSpecificHeatCapacity()
	 * @see #setSpecificHeatCapacity(Double)
	 * @generated
	 */
	boolean isSetSpecificHeatCapacity();

} // IfcThermalMaterialProperties
