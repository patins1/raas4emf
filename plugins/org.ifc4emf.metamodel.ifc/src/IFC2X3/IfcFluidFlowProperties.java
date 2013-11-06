/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcFluidFlowPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fluid Flow Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getFlowConditionTimeSeries <em>Flow Condition Time Series</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getVelocityTimeSeries <em>Velocity Time Series</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getFlowrateTimeSeries <em>Flowrate Time Series</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getFluid <em>Fluid</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getPressureTimeSeries <em>Pressure Time Series</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getTemperatureSingleValue <em>Temperature Single Value</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getWetBulbTemperatureTimeSeries <em>Wet Bulb Temperature Time Series</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getTemperatureTimeSeries <em>Temperature Time Series</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getFlowrateSingleValue <em>Flowrate Single Value</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getVelocitySingleValue <em>Velocity Single Value</em>}</li>
 *   <li>{@link IFC2X3.IfcFluidFlowProperties#getPressureSingleValue <em>Pressure Single Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFluidFlowPropertiesImplAdapter.class)
public interface IfcFluidFlowProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Flowrate Single Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowrate Single Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowrate Single Value</em>' containment reference.
	 * @see #setFlowrateSingleValue(IfcDerivedMeasureValue)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_FlowrateSingleValue()
	 * @model containment="true"
	 * @generated
	 */
	IfcDerivedMeasureValue getFlowrateSingleValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getFlowrateSingleValue <em>Flowrate Single Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flowrate Single Value</em>' containment reference.
	 * @see #getFlowrateSingleValue()
	 * @generated
	 */
	void setFlowrateSingleValue(IfcDerivedMeasureValue value);

	/**
	 * Returns the value of the '<em><b>Wet Bulb Temperature Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wet Bulb Temperature Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wet Bulb Temperature Time Series</em>' reference.
	 * @see #setWetBulbTemperatureTimeSeries(IfcTimeSeries)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_WetBulbTemperatureTimeSeries()
	 * @model
	 * @generated
	 */
	IfcTimeSeries getWetBulbTemperatureTimeSeries();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getWetBulbTemperatureTimeSeries <em>Wet Bulb Temperature Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wet Bulb Temperature Time Series</em>' reference.
	 * @see #getWetBulbTemperatureTimeSeries()
	 * @generated
	 */
	void setWetBulbTemperatureTimeSeries(IfcTimeSeries value);

	/**
	 * Returns the value of the '<em><b>Temperature Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Time Series</em>' reference.
	 * @see #setTemperatureTimeSeries(IfcTimeSeries)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_TemperatureTimeSeries()
	 * @model
	 * @generated
	 */
	IfcTimeSeries getTemperatureTimeSeries();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getTemperatureTimeSeries <em>Temperature Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Time Series</em>' reference.
	 * @see #getTemperatureTimeSeries()
	 * @generated
	 */
	void setTemperatureTimeSeries(IfcTimeSeries value);

	/**
	 * Returns the value of the '<em><b>Flow Condition Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Condition Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Condition Time Series</em>' reference.
	 * @see #setFlowConditionTimeSeries(IfcTimeSeries)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_FlowConditionTimeSeries()
	 * @model
	 * @generated
	 */
	IfcTimeSeries getFlowConditionTimeSeries();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getFlowConditionTimeSeries <em>Flow Condition Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Condition Time Series</em>' reference.
	 * @see #getFlowConditionTimeSeries()
	 * @generated
	 */
	void setFlowConditionTimeSeries(IfcTimeSeries value);

	/**
	 * Returns the value of the '<em><b>Fluid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fluid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fluid</em>' reference.
	 * @see #setFluid(IfcMaterial)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_Fluid()
	 * @model required="true"
	 * @generated
	 */
	IfcMaterial getFluid();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getFluid <em>Fluid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fluid</em>' reference.
	 * @see #getFluid()
	 * @generated
	 */
	void setFluid(IfcMaterial value);

	/**
	 * Returns the value of the '<em><b>Pressure Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Time Series</em>' reference.
	 * @see #setPressureTimeSeries(IfcTimeSeries)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_PressureTimeSeries()
	 * @model
	 * @generated
	 */
	IfcTimeSeries getPressureTimeSeries();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getPressureTimeSeries <em>Pressure Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Time Series</em>' reference.
	 * @see #getPressureTimeSeries()
	 * @generated
	 */
	void setPressureTimeSeries(IfcTimeSeries value);

	/**
	 * Returns the value of the '<em><b>Velocity Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity Time Series</em>' reference.
	 * @see #setVelocityTimeSeries(IfcTimeSeries)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_VelocityTimeSeries()
	 * @model
	 * @generated
	 */
	IfcTimeSeries getVelocityTimeSeries();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getVelocityTimeSeries <em>Velocity Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity Time Series</em>' reference.
	 * @see #getVelocityTimeSeries()
	 * @generated
	 */
	void setVelocityTimeSeries(IfcTimeSeries value);

	/**
	 * Returns the value of the '<em><b>Flowrate Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowrate Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowrate Time Series</em>' reference.
	 * @see #setFlowrateTimeSeries(IfcTimeSeries)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_FlowrateTimeSeries()
	 * @model
	 * @generated
	 */
	IfcTimeSeries getFlowrateTimeSeries();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getFlowrateTimeSeries <em>Flowrate Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flowrate Time Series</em>' reference.
	 * @see #getFlowrateTimeSeries()
	 * @generated
	 */
	void setFlowrateTimeSeries(IfcTimeSeries value);

	/**
	 * Returns the value of the '<em><b>Pressure Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Single Value</em>' attribute.
	 * @see #isSetPressureSingleValue()
	 * @see #unsetPressureSingleValue()
	 * @see #setPressureSingleValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_PressureSingleValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPressureSingleValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getPressureSingleValue <em>Pressure Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Single Value</em>' attribute.
	 * @see #isSetPressureSingleValue()
	 * @see #unsetPressureSingleValue()
	 * @see #getPressureSingleValue()
	 * @generated
	 */
	void setPressureSingleValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getPressureSingleValue <em>Pressure Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPressureSingleValue()
	 * @see #getPressureSingleValue()
	 * @see #setPressureSingleValue(Double)
	 * @generated
	 */
	void unsetPressureSingleValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFluidFlowProperties#getPressureSingleValue <em>Pressure Single Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pressure Single Value</em>' attribute is set.
	 * @see #unsetPressureSingleValue()
	 * @see #getPressureSingleValue()
	 * @see #setPressureSingleValue(Double)
	 * @generated
	 */
	boolean isSetPressureSingleValue();

	/**
	 * Returns the value of the '<em><b>Velocity Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity Single Value</em>' attribute.
	 * @see #isSetVelocitySingleValue()
	 * @see #unsetVelocitySingleValue()
	 * @see #setVelocitySingleValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_VelocitySingleValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getVelocitySingleValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getVelocitySingleValue <em>Velocity Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity Single Value</em>' attribute.
	 * @see #isSetVelocitySingleValue()
	 * @see #unsetVelocitySingleValue()
	 * @see #getVelocitySingleValue()
	 * @generated
	 */
	void setVelocitySingleValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getVelocitySingleValue <em>Velocity Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVelocitySingleValue()
	 * @see #getVelocitySingleValue()
	 * @see #setVelocitySingleValue(Double)
	 * @generated
	 */
	void unsetVelocitySingleValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFluidFlowProperties#getVelocitySingleValue <em>Velocity Single Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Velocity Single Value</em>' attribute is set.
	 * @see #unsetVelocitySingleValue()
	 * @see #getVelocitySingleValue()
	 * @see #setVelocitySingleValue(Double)
	 * @generated
	 */
	boolean isSetVelocitySingleValue();

	/**
	 * Returns the value of the '<em><b>Flow Condition Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Condition Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Condition Single Value</em>' attribute.
	 * @see #isSetFlowConditionSingleValue()
	 * @see #unsetFlowConditionSingleValue()
	 * @see #setFlowConditionSingleValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_FlowConditionSingleValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFlowConditionSingleValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Condition Single Value</em>' attribute.
	 * @see #isSetFlowConditionSingleValue()
	 * @see #unsetFlowConditionSingleValue()
	 * @see #getFlowConditionSingleValue()
	 * @generated
	 */
	void setFlowConditionSingleValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlowConditionSingleValue()
	 * @see #getFlowConditionSingleValue()
	 * @see #setFlowConditionSingleValue(Double)
	 * @generated
	 */
	void unsetFlowConditionSingleValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFluidFlowProperties#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flow Condition Single Value</em>' attribute is set.
	 * @see #unsetFlowConditionSingleValue()
	 * @see #getFlowConditionSingleValue()
	 * @see #setFlowConditionSingleValue(Double)
	 * @generated
	 */
	boolean isSetFlowConditionSingleValue();

	/**
	 * Returns the value of the '<em><b>Wet Bulb Temperature Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wet Bulb Temperature Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wet Bulb Temperature Single Value</em>' attribute.
	 * @see #isSetWetBulbTemperatureSingleValue()
	 * @see #unsetWetBulbTemperatureSingleValue()
	 * @see #setWetBulbTemperatureSingleValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_WetBulbTemperatureSingleValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getWetBulbTemperatureSingleValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wet Bulb Temperature Single Value</em>' attribute.
	 * @see #isSetWetBulbTemperatureSingleValue()
	 * @see #unsetWetBulbTemperatureSingleValue()
	 * @see #getWetBulbTemperatureSingleValue()
	 * @generated
	 */
	void setWetBulbTemperatureSingleValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWetBulbTemperatureSingleValue()
	 * @see #getWetBulbTemperatureSingleValue()
	 * @see #setWetBulbTemperatureSingleValue(Double)
	 * @generated
	 */
	void unsetWetBulbTemperatureSingleValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFluidFlowProperties#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wet Bulb Temperature Single Value</em>' attribute is set.
	 * @see #unsetWetBulbTemperatureSingleValue()
	 * @see #getWetBulbTemperatureSingleValue()
	 * @see #setWetBulbTemperatureSingleValue(Double)
	 * @generated
	 */
	boolean isSetWetBulbTemperatureSingleValue();

	/**
	 * Returns the value of the '<em><b>Temperature Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Single Value</em>' attribute.
	 * @see #isSetTemperatureSingleValue()
	 * @see #unsetTemperatureSingleValue()
	 * @see #setTemperatureSingleValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_TemperatureSingleValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTemperatureSingleValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getTemperatureSingleValue <em>Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Single Value</em>' attribute.
	 * @see #isSetTemperatureSingleValue()
	 * @see #unsetTemperatureSingleValue()
	 * @see #getTemperatureSingleValue()
	 * @generated
	 */
	void setTemperatureSingleValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getTemperatureSingleValue <em>Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTemperatureSingleValue()
	 * @see #getTemperatureSingleValue()
	 * @see #setTemperatureSingleValue(Double)
	 * @generated
	 */
	void unsetTemperatureSingleValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFluidFlowProperties#getTemperatureSingleValue <em>Temperature Single Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Temperature Single Value</em>' attribute is set.
	 * @see #unsetTemperatureSingleValue()
	 * @see #getTemperatureSingleValue()
	 * @see #setTemperatureSingleValue(Double)
	 * @generated
	 */
	boolean isSetTemperatureSingleValue();

	/**
	 * Returns the value of the '<em><b>User Defined Property Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Property Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Property Source</em>' attribute.
	 * @see #isSetUserDefinedPropertySource()
	 * @see #unsetUserDefinedPropertySource()
	 * @see #setUserDefinedPropertySource(String)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_UserDefinedPropertySource()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedPropertySource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Property Source</em>' attribute.
	 * @see #isSetUserDefinedPropertySource()
	 * @see #unsetUserDefinedPropertySource()
	 * @see #getUserDefinedPropertySource()
	 * @generated
	 */
	void setUserDefinedPropertySource(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedPropertySource()
	 * @see #getUserDefinedPropertySource()
	 * @see #setUserDefinedPropertySource(String)
	 * @generated
	 */
	void unsetUserDefinedPropertySource();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFluidFlowProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Property Source</em>' attribute is set.
	 * @see #unsetUserDefinedPropertySource()
	 * @see #getUserDefinedPropertySource()
	 * @see #setUserDefinedPropertySource(String)
	 * @generated
	 */
	boolean isSetUserDefinedPropertySource();

	/**
	 * Returns the value of the '<em><b>Property Source</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcPropertySourceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Source</em>' attribute.
	 * @see IFC2X3.IfcPropertySourceEnum
	 * @see #isSetPropertySource()
	 * @see #unsetPropertySource()
	 * @see #setPropertySource(IfcPropertySourceEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcFluidFlowProperties_PropertySource()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcPropertySourceEnum getPropertySource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getPropertySource <em>Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Source</em>' attribute.
	 * @see IFC2X3.IfcPropertySourceEnum
	 * @see #isSetPropertySource()
	 * @see #unsetPropertySource()
	 * @see #getPropertySource()
	 * @generated
	 */
	void setPropertySource(IfcPropertySourceEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFluidFlowProperties#getPropertySource <em>Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertySource()
	 * @see #getPropertySource()
	 * @see #setPropertySource(IfcPropertySourceEnum)
	 * @generated
	 */
	void unsetPropertySource();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFluidFlowProperties#getPropertySource <em>Property Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property Source</em>' attribute is set.
	 * @see #unsetPropertySource()
	 * @see #getPropertySource()
	 * @see #setPropertySource(IfcPropertySourceEnum)
	 * @generated
	 */
	boolean isSetPropertySource();

} // IfcFluidFlowProperties
