/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcElectricalBasePropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Electrical Base Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcElectricalBaseProperties#getElectricCurrentType <em>Electric Current Type</em>}</li>
 *   <li>{@link IFC2X3.IfcElectricalBaseProperties#getInputVoltage <em>Input Voltage</em>}</li>
 *   <li>{@link IFC2X3.IfcElectricalBaseProperties#getInputFrequency <em>Input Frequency</em>}</li>
 *   <li>{@link IFC2X3.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}</li>
 *   <li>{@link IFC2X3.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}</li>
 *   <li>{@link IFC2X3.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}</li>
 *   <li>{@link IFC2X3.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}</li>
 *   <li>{@link IFC2X3.IfcElectricalBaseProperties#getInputPhase <em>Input Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcElectricalBaseProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcElectricalBasePropertiesImplAdapter.class)
public interface IfcElectricalBaseProperties extends IfcEnergyProperties {
	/**
	 * Returns the value of the '<em><b>Input Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Phase</em>' attribute.
	 * @see #isSetInputPhase()
	 * @see #unsetInputPhase()
	 * @see #setInputPhase(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcElectricalBaseProperties_InputPhase()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getInputPhase();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getInputPhase <em>Input Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Phase</em>' attribute.
	 * @see #isSetInputPhase()
	 * @see #unsetInputPhase()
	 * @see #getInputPhase()
	 * @generated
	 */
	void setInputPhase(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getInputPhase <em>Input Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInputPhase()
	 * @see #getInputPhase()
	 * @see #setInputPhase(Integer)
	 * @generated
	 */
	void unsetInputPhase();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getInputPhase <em>Input Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Input Phase</em>' attribute is set.
	 * @see #unsetInputPhase()
	 * @see #getInputPhase()
	 * @see #setInputPhase(Integer)
	 * @generated
	 */
	boolean isSetInputPhase();

	/**
	 * Returns the value of the '<em><b>Rated Power Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Power Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Power Input</em>' attribute.
	 * @see #isSetRatedPowerInput()
	 * @see #unsetRatedPowerInput()
	 * @see #setRatedPowerInput(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcElectricalBaseProperties_RatedPowerInput()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRatedPowerInput();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Power Input</em>' attribute.
	 * @see #isSetRatedPowerInput()
	 * @see #unsetRatedPowerInput()
	 * @see #getRatedPowerInput()
	 * @generated
	 */
	void setRatedPowerInput(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedPowerInput()
	 * @see #getRatedPowerInput()
	 * @see #setRatedPowerInput(Double)
	 * @generated
	 */
	void unsetRatedPowerInput();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Power Input</em>' attribute is set.
	 * @see #unsetRatedPowerInput()
	 * @see #getRatedPowerInput()
	 * @see #setRatedPowerInput(Double)
	 * @generated
	 */
	boolean isSetRatedPowerInput();

	/**
	 * Returns the value of the '<em><b>Maximum Power Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Power Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Power Input</em>' attribute.
	 * @see #isSetMaximumPowerInput()
	 * @see #unsetMaximumPowerInput()
	 * @see #setMaximumPowerInput(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcElectricalBaseProperties_MaximumPowerInput()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMaximumPowerInput();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Power Input</em>' attribute.
	 * @see #isSetMaximumPowerInput()
	 * @see #unsetMaximumPowerInput()
	 * @see #getMaximumPowerInput()
	 * @generated
	 */
	void setMaximumPowerInput(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumPowerInput()
	 * @see #getMaximumPowerInput()
	 * @see #setMaximumPowerInput(Double)
	 * @generated
	 */
	void unsetMaximumPowerInput();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Power Input</em>' attribute is set.
	 * @see #unsetMaximumPowerInput()
	 * @see #getMaximumPowerInput()
	 * @see #setMaximumPowerInput(Double)
	 * @generated
	 */
	boolean isSetMaximumPowerInput();

	/**
	 * Returns the value of the '<em><b>Minimum Circuit Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Circuit Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Circuit Current</em>' attribute.
	 * @see #isSetMinimumCircuitCurrent()
	 * @see #unsetMinimumCircuitCurrent()
	 * @see #setMinimumCircuitCurrent(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcElectricalBaseProperties_MinimumCircuitCurrent()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMinimumCircuitCurrent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Circuit Current</em>' attribute.
	 * @see #isSetMinimumCircuitCurrent()
	 * @see #unsetMinimumCircuitCurrent()
	 * @see #getMinimumCircuitCurrent()
	 * @generated
	 */
	void setMinimumCircuitCurrent(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumCircuitCurrent()
	 * @see #getMinimumCircuitCurrent()
	 * @see #setMinimumCircuitCurrent(Double)
	 * @generated
	 */
	void unsetMinimumCircuitCurrent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Circuit Current</em>' attribute is set.
	 * @see #unsetMinimumCircuitCurrent()
	 * @see #getMinimumCircuitCurrent()
	 * @see #setMinimumCircuitCurrent(Double)
	 * @generated
	 */
	boolean isSetMinimumCircuitCurrent();

	/**
	 * Returns the value of the '<em><b>Full Load Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Load Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Load Current</em>' attribute.
	 * @see #isSetFullLoadCurrent()
	 * @see #unsetFullLoadCurrent()
	 * @see #setFullLoadCurrent(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcElectricalBaseProperties_FullLoadCurrent()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFullLoadCurrent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Load Current</em>' attribute.
	 * @see #isSetFullLoadCurrent()
	 * @see #unsetFullLoadCurrent()
	 * @see #getFullLoadCurrent()
	 * @generated
	 */
	void setFullLoadCurrent(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFullLoadCurrent()
	 * @see #getFullLoadCurrent()
	 * @see #setFullLoadCurrent(Double)
	 * @generated
	 */
	void unsetFullLoadCurrent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Full Load Current</em>' attribute is set.
	 * @see #unsetFullLoadCurrent()
	 * @see #getFullLoadCurrent()
	 * @see #setFullLoadCurrent(Double)
	 * @generated
	 */
	boolean isSetFullLoadCurrent();

	/**
	 * Returns the value of the '<em><b>Input Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Frequency</em>' attribute.
	 * @see #isSetInputFrequency()
	 * @see #unsetInputFrequency()
	 * @see #setInputFrequency(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcElectricalBaseProperties_InputFrequency()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getInputFrequency();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getInputFrequency <em>Input Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Frequency</em>' attribute.
	 * @see #isSetInputFrequency()
	 * @see #unsetInputFrequency()
	 * @see #getInputFrequency()
	 * @generated
	 */
	void setInputFrequency(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getInputFrequency <em>Input Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInputFrequency()
	 * @see #getInputFrequency()
	 * @see #setInputFrequency(Double)
	 * @generated
	 */
	void unsetInputFrequency();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getInputFrequency <em>Input Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Input Frequency</em>' attribute is set.
	 * @see #unsetInputFrequency()
	 * @see #getInputFrequency()
	 * @see #setInputFrequency(Double)
	 * @generated
	 */
	boolean isSetInputFrequency();

	/**
	 * Returns the value of the '<em><b>Input Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Voltage</em>' attribute.
	 * @see #isSetInputVoltage()
	 * @see #unsetInputVoltage()
	 * @see #setInputVoltage(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcElectricalBaseProperties_InputVoltage()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getInputVoltage();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getInputVoltage <em>Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Voltage</em>' attribute.
	 * @see #isSetInputVoltage()
	 * @see #unsetInputVoltage()
	 * @see #getInputVoltage()
	 * @generated
	 */
	void setInputVoltage(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getInputVoltage <em>Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInputVoltage()
	 * @see #getInputVoltage()
	 * @see #setInputVoltage(Double)
	 * @generated
	 */
	void unsetInputVoltage();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getInputVoltage <em>Input Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Input Voltage</em>' attribute is set.
	 * @see #unsetInputVoltage()
	 * @see #getInputVoltage()
	 * @see #setInputVoltage(Double)
	 * @generated
	 */
	boolean isSetInputVoltage();

	/**
	 * Returns the value of the '<em><b>Electric Current Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcElectricCurrentEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electric Current Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electric Current Type</em>' attribute.
	 * @see IFC2X3.IfcElectricCurrentEnum
	 * @see #isSetElectricCurrentType()
	 * @see #unsetElectricCurrentType()
	 * @see #setElectricCurrentType(IfcElectricCurrentEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcElectricalBaseProperties_ElectricCurrentType()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcElectricCurrentEnum getElectricCurrentType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getElectricCurrentType <em>Electric Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electric Current Type</em>' attribute.
	 * @see IFC2X3.IfcElectricCurrentEnum
	 * @see #isSetElectricCurrentType()
	 * @see #unsetElectricCurrentType()
	 * @see #getElectricCurrentType()
	 * @generated
	 */
	void setElectricCurrentType(IfcElectricCurrentEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getElectricCurrentType <em>Electric Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElectricCurrentType()
	 * @see #getElectricCurrentType()
	 * @see #setElectricCurrentType(IfcElectricCurrentEnum)
	 * @generated
	 */
	void unsetElectricCurrentType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElectricalBaseProperties#getElectricCurrentType <em>Electric Current Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Electric Current Type</em>' attribute is set.
	 * @see #unsetElectricCurrentType()
	 * @see #getElectricCurrentType()
	 * @see #setElectricCurrentType(IfcElectricCurrentEnum)
	 * @generated
	 */
	boolean isSetElectricCurrentType();

} // IfcElectricalBaseProperties
