/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSpaceThermalLoadPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Space Thermal Load Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSpaceThermalLoadProperties#getApplicableValueRatio <em>Applicable Value Ratio</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceThermalLoadProperties#getThermalLoadSource <em>Thermal Load Source</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceThermalLoadProperties#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceThermalLoadProperties#getSourceDescription <em>Source Description</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceThermalLoadProperties#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceThermalLoadProperties#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceThermalLoadProperties#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceThermalLoadProperties#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceThermalLoadProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceThermalLoadProperties#getThermalLoadType <em>Thermal Load Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSpaceThermalLoadProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSpaceThermalLoadPropertiesImplAdapter.class)
public interface IfcSpaceThermalLoadProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Thermal Load Time Series Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Load Time Series Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Load Time Series Values</em>' reference.
	 * @see #setThermalLoadTimeSeriesValues(IfcTimeSeries)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues()
	 * @model
	 * @generated
	 */
	IfcTimeSeries getThermalLoadTimeSeriesValues();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Load Time Series Values</em>' reference.
	 * @see #getThermalLoadTimeSeriesValues()
	 * @generated
	 */
	void setThermalLoadTimeSeriesValues(IfcTimeSeries value);

	/**
	 * Returns the value of the '<em><b>Thermal Load Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcThermalLoadTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Load Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Load Type</em>' attribute.
	 * @see IFC2X3.IfcThermalLoadTypeEnum
	 * @see #isSetThermalLoadType()
	 * @see #unsetThermalLoadType()
	 * @see #setThermalLoadType(IfcThermalLoadTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceThermalLoadProperties_ThermalLoadType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcThermalLoadTypeEnum getThermalLoadType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getThermalLoadType <em>Thermal Load Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Load Type</em>' attribute.
	 * @see IFC2X3.IfcThermalLoadTypeEnum
	 * @see #isSetThermalLoadType()
	 * @see #unsetThermalLoadType()
	 * @see #getThermalLoadType()
	 * @generated
	 */
	void setThermalLoadType(IfcThermalLoadTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getThermalLoadType <em>Thermal Load Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalLoadType()
	 * @see #getThermalLoadType()
	 * @see #setThermalLoadType(IfcThermalLoadTypeEnum)
	 * @generated
	 */
	void unsetThermalLoadType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getThermalLoadType <em>Thermal Load Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Load Type</em>' attribute is set.
	 * @see #unsetThermalLoadType()
	 * @see #getThermalLoadType()
	 * @see #setThermalLoadType(IfcThermalLoadTypeEnum)
	 * @generated
	 */
	boolean isSetThermalLoadType();

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
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceThermalLoadProperties_UserDefinedPropertySource()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedPropertySource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedPropertySource()
	 * @see #getUserDefinedPropertySource()
	 * @see #setUserDefinedPropertySource(String)
	 * @generated
	 */
	void unsetUserDefinedPropertySource();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>User Defined Thermal Load Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Thermal Load Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Thermal Load Source</em>' attribute.
	 * @see #isSetUserDefinedThermalLoadSource()
	 * @see #unsetUserDefinedThermalLoadSource()
	 * @see #setUserDefinedThermalLoadSource(String)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedThermalLoadSource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Thermal Load Source</em>' attribute.
	 * @see #isSetUserDefinedThermalLoadSource()
	 * @see #unsetUserDefinedThermalLoadSource()
	 * @see #getUserDefinedThermalLoadSource()
	 * @generated
	 */
	void setUserDefinedThermalLoadSource(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedThermalLoadSource()
	 * @see #getUserDefinedThermalLoadSource()
	 * @see #setUserDefinedThermalLoadSource(String)
	 * @generated
	 */
	void unsetUserDefinedThermalLoadSource();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Thermal Load Source</em>' attribute is set.
	 * @see #unsetUserDefinedThermalLoadSource()
	 * @see #getUserDefinedThermalLoadSource()
	 * @see #setUserDefinedThermalLoadSource(String)
	 * @generated
	 */
	boolean isSetUserDefinedThermalLoadSource();

	/**
	 * Returns the value of the '<em><b>Minimum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Value</em>' attribute.
	 * @see #isSetMinimumValue()
	 * @see #unsetMinimumValue()
	 * @see #setMinimumValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceThermalLoadProperties_MinimumValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMinimumValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getMinimumValue <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Value</em>' attribute.
	 * @see #isSetMinimumValue()
	 * @see #unsetMinimumValue()
	 * @see #getMinimumValue()
	 * @generated
	 */
	void setMinimumValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getMinimumValue <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumValue()
	 * @see #getMinimumValue()
	 * @see #setMinimumValue(Double)
	 * @generated
	 */
	void unsetMinimumValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getMinimumValue <em>Minimum Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Value</em>' attribute is set.
	 * @see #unsetMinimumValue()
	 * @see #getMinimumValue()
	 * @see #setMinimumValue(Double)
	 * @generated
	 */
	boolean isSetMinimumValue();

	/**
	 * Returns the value of the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Value</em>' attribute.
	 * @see #isSetMaximumValue()
	 * @see #unsetMaximumValue()
	 * @see #setMaximumValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceThermalLoadProperties_MaximumValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getMaximumValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getMaximumValue <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Value</em>' attribute.
	 * @see #isSetMaximumValue()
	 * @see #unsetMaximumValue()
	 * @see #getMaximumValue()
	 * @generated
	 */
	void setMaximumValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getMaximumValue <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumValue()
	 * @see #getMaximumValue()
	 * @see #setMaximumValue(Double)
	 * @generated
	 */
	void unsetMaximumValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getMaximumValue <em>Maximum Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Value</em>' attribute is set.
	 * @see #unsetMaximumValue()
	 * @see #getMaximumValue()
	 * @see #setMaximumValue(Double)
	 * @generated
	 */
	boolean isSetMaximumValue();

	/**
	 * Returns the value of the '<em><b>Source Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Description</em>' attribute.
	 * @see #isSetSourceDescription()
	 * @see #unsetSourceDescription()
	 * @see #setSourceDescription(String)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceThermalLoadProperties_SourceDescription()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getSourceDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getSourceDescription <em>Source Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Description</em>' attribute.
	 * @see #isSetSourceDescription()
	 * @see #unsetSourceDescription()
	 * @see #getSourceDescription()
	 * @generated
	 */
	void setSourceDescription(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getSourceDescription <em>Source Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceDescription()
	 * @see #getSourceDescription()
	 * @see #setSourceDescription(String)
	 * @generated
	 */
	void unsetSourceDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getSourceDescription <em>Source Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Description</em>' attribute is set.
	 * @see #unsetSourceDescription()
	 * @see #getSourceDescription()
	 * @see #setSourceDescription(String)
	 * @generated
	 */
	boolean isSetSourceDescription();

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
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceThermalLoadProperties_PropertySource()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcPropertySourceEnum getPropertySource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getPropertySource <em>Property Source</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getPropertySource <em>Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertySource()
	 * @see #getPropertySource()
	 * @see #setPropertySource(IfcPropertySourceEnum)
	 * @generated
	 */
	void unsetPropertySource();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getPropertySource <em>Property Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property Source</em>' attribute is set.
	 * @see #unsetPropertySource()
	 * @see #getPropertySource()
	 * @see #setPropertySource(IfcPropertySourceEnum)
	 * @generated
	 */
	boolean isSetPropertySource();

	/**
	 * Returns the value of the '<em><b>Thermal Load Source</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcThermalLoadSourceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Load Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Load Source</em>' attribute.
	 * @see IFC2X3.IfcThermalLoadSourceEnum
	 * @see #isSetThermalLoadSource()
	 * @see #unsetThermalLoadSource()
	 * @see #setThermalLoadSource(IfcThermalLoadSourceEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceThermalLoadProperties_ThermalLoadSource()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcThermalLoadSourceEnum getThermalLoadSource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getThermalLoadSource <em>Thermal Load Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Load Source</em>' attribute.
	 * @see IFC2X3.IfcThermalLoadSourceEnum
	 * @see #isSetThermalLoadSource()
	 * @see #unsetThermalLoadSource()
	 * @see #getThermalLoadSource()
	 * @generated
	 */
	void setThermalLoadSource(IfcThermalLoadSourceEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getThermalLoadSource <em>Thermal Load Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalLoadSource()
	 * @see #getThermalLoadSource()
	 * @see #setThermalLoadSource(IfcThermalLoadSourceEnum)
	 * @generated
	 */
	void unsetThermalLoadSource();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getThermalLoadSource <em>Thermal Load Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Load Source</em>' attribute is set.
	 * @see #unsetThermalLoadSource()
	 * @see #getThermalLoadSource()
	 * @see #setThermalLoadSource(IfcThermalLoadSourceEnum)
	 * @generated
	 */
	boolean isSetThermalLoadSource();

	/**
	 * Returns the value of the '<em><b>Applicable Value Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Value Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Value Ratio</em>' attribute.
	 * @see #isSetApplicableValueRatio()
	 * @see #unsetApplicableValueRatio()
	 * @see #setApplicableValueRatio(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceThermalLoadProperties_ApplicableValueRatio()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getApplicableValueRatio();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getApplicableValueRatio <em>Applicable Value Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Value Ratio</em>' attribute.
	 * @see #isSetApplicableValueRatio()
	 * @see #unsetApplicableValueRatio()
	 * @see #getApplicableValueRatio()
	 * @generated
	 */
	void setApplicableValueRatio(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getApplicableValueRatio <em>Applicable Value Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicableValueRatio()
	 * @see #getApplicableValueRatio()
	 * @see #setApplicableValueRatio(Double)
	 * @generated
	 */
	void unsetApplicableValueRatio();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceThermalLoadProperties#getApplicableValueRatio <em>Applicable Value Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applicable Value Ratio</em>' attribute is set.
	 * @see #unsetApplicableValueRatio()
	 * @see #getApplicableValueRatio()
	 * @see #setApplicableValueRatio(Double)
	 * @generated
	 */
	boolean isSetApplicableValueRatio();

} // IfcSpaceThermalLoadProperties
