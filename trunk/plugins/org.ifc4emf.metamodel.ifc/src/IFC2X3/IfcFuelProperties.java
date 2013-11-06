/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcFuelPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fuel Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFuelProperties#getCombustionTemperature <em>Combustion Temperature</em>}</li>
 *   <li>{@link IFC2X3.IfcFuelProperties#getCarbonContent <em>Carbon Content</em>}</li>
 *   <li>{@link IFC2X3.IfcFuelProperties#getLowerHeatingValue <em>Lower Heating Value</em>}</li>
 *   <li>{@link IFC2X3.IfcFuelProperties#getHigherHeatingValue <em>Higher Heating Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFuelProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFuelPropertiesImplAdapter.class)
public interface IfcFuelProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Higher Heating Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Higher Heating Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Higher Heating Value</em>' attribute.
	 * @see #isSetHigherHeatingValue()
	 * @see #unsetHigherHeatingValue()
	 * @see #setHigherHeatingValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFuelProperties_HigherHeatingValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getHigherHeatingValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFuelProperties#getHigherHeatingValue <em>Higher Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Higher Heating Value</em>' attribute.
	 * @see #isSetHigherHeatingValue()
	 * @see #unsetHigherHeatingValue()
	 * @see #getHigherHeatingValue()
	 * @generated
	 */
	void setHigherHeatingValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFuelProperties#getHigherHeatingValue <em>Higher Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHigherHeatingValue()
	 * @see #getHigherHeatingValue()
	 * @see #setHigherHeatingValue(Double)
	 * @generated
	 */
	void unsetHigherHeatingValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFuelProperties#getHigherHeatingValue <em>Higher Heating Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Higher Heating Value</em>' attribute is set.
	 * @see #unsetHigherHeatingValue()
	 * @see #getHigherHeatingValue()
	 * @see #setHigherHeatingValue(Double)
	 * @generated
	 */
	boolean isSetHigherHeatingValue();

	/**
	 * Returns the value of the '<em><b>Lower Heating Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Heating Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Heating Value</em>' attribute.
	 * @see #isSetLowerHeatingValue()
	 * @see #unsetLowerHeatingValue()
	 * @see #setLowerHeatingValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFuelProperties_LowerHeatingValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLowerHeatingValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFuelProperties#getLowerHeatingValue <em>Lower Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Heating Value</em>' attribute.
	 * @see #isSetLowerHeatingValue()
	 * @see #unsetLowerHeatingValue()
	 * @see #getLowerHeatingValue()
	 * @generated
	 */
	void setLowerHeatingValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFuelProperties#getLowerHeatingValue <em>Lower Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowerHeatingValue()
	 * @see #getLowerHeatingValue()
	 * @see #setLowerHeatingValue(Double)
	 * @generated
	 */
	void unsetLowerHeatingValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFuelProperties#getLowerHeatingValue <em>Lower Heating Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lower Heating Value</em>' attribute is set.
	 * @see #unsetLowerHeatingValue()
	 * @see #getLowerHeatingValue()
	 * @see #setLowerHeatingValue(Double)
	 * @generated
	 */
	boolean isSetLowerHeatingValue();

	/**
	 * Returns the value of the '<em><b>Carbon Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carbon Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carbon Content</em>' attribute.
	 * @see #isSetCarbonContent()
	 * @see #unsetCarbonContent()
	 * @see #setCarbonContent(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFuelProperties_CarbonContent()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCarbonContent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFuelProperties#getCarbonContent <em>Carbon Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carbon Content</em>' attribute.
	 * @see #isSetCarbonContent()
	 * @see #unsetCarbonContent()
	 * @see #getCarbonContent()
	 * @generated
	 */
	void setCarbonContent(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFuelProperties#getCarbonContent <em>Carbon Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCarbonContent()
	 * @see #getCarbonContent()
	 * @see #setCarbonContent(Double)
	 * @generated
	 */
	void unsetCarbonContent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFuelProperties#getCarbonContent <em>Carbon Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Carbon Content</em>' attribute is set.
	 * @see #unsetCarbonContent()
	 * @see #getCarbonContent()
	 * @see #setCarbonContent(Double)
	 * @generated
	 */
	boolean isSetCarbonContent();

	/**
	 * Returns the value of the '<em><b>Combustion Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combustion Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combustion Temperature</em>' attribute.
	 * @see #isSetCombustionTemperature()
	 * @see #unsetCombustionTemperature()
	 * @see #setCombustionTemperature(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFuelProperties_CombustionTemperature()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCombustionTemperature();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFuelProperties#getCombustionTemperature <em>Combustion Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combustion Temperature</em>' attribute.
	 * @see #isSetCombustionTemperature()
	 * @see #unsetCombustionTemperature()
	 * @see #getCombustionTemperature()
	 * @generated
	 */
	void setCombustionTemperature(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFuelProperties#getCombustionTemperature <em>Combustion Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCombustionTemperature()
	 * @see #getCombustionTemperature()
	 * @see #setCombustionTemperature(Double)
	 * @generated
	 */
	void unsetCombustionTemperature();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFuelProperties#getCombustionTemperature <em>Combustion Temperature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Combustion Temperature</em>' attribute is set.
	 * @see #unsetCombustionTemperature()
	 * @see #getCombustionTemperature()
	 * @see #setCombustionTemperature(Double)
	 * @generated
	 */
	boolean isSetCombustionTemperature();

} // IfcFuelProperties
