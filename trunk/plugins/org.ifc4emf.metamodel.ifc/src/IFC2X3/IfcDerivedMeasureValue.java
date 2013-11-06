/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcDerivedMeasureValueImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Derived Measure Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcIonConcentrationMeasurevalue <em>Ifc Ion Concentration Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcPHMeasurevalue <em>Ifc PH Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcHeatingValueMeasurevalue <em>Ifc Heating Value Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcSoundPressureMeasurevalue <em>Ifc Sound Pressure Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcSoundPowerMeasurevalue <em>Ifc Sound Power Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcWarpingMomentMeasurevalue <em>Ifc Warping Moment Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcWarpingConstantMeasurevalue <em>Ifc Warping Constant Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalExpansionCoefficientMeasurevalue <em>Ifc Thermal Expansion Coefficient Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcTemperatureGradientMeasurevalue <em>Ifc Temperature Gradient Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcSectionModulusMeasurevalue <em>Ifc Section Modulus Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcSectionalAreaIntegralMeasurevalue <em>Ifc Sectional Area Integral Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcRotationalMassMeasurevalue <em>Ifc Rotational Mass Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfRotationalSubgradeReactionMeasurevalue <em>Ifc Modulus Of Rotational Subgrade Reaction Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfLinearSubgradeReactionMeasurevalue <em>Ifc Modulus Of Linear Subgrade Reaction Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcMassPerLengthMeasurevalue <em>Ifc Mass Per Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcCurvatureMeasurevalue <em>Ifc Curvature Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcLuminousIntensityDistributionMeasurevalue <em>Ifc Luminous Intensity Distribution Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearMomentMeasurevalue <em>Ifc Linear Moment Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcShearModulusMeasurevalue <em>Ifc Shear Modulus Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcRotationalStiffnessMeasurevalue <em>Ifc Rotational Stiffness Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcPlanarForceMeasurevalue <em>Ifc Planar Force Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcMomentOfInertiaMeasurevalue <em>Ifc Moment Of Inertia Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfElasticityMeasurevalue <em>Ifc Modulus Of Elasticity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfSubgradeReactionMeasurevalue <em>Ifc Modulus Of Subgrade Reaction Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearStiffnessMeasurevalue <em>Ifc Linear Stiffness Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearForceMeasurevalue <em>Ifc Linear Force Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcAccelerationMeasurevalue <em>Ifc Acceleration Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcTorqueMeasurevalue <em>Ifc Torque Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcRotationalFrequencyMeasurevalue <em>Ifc Rotational Frequency Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcRadioActivityMeasurevalue <em>Ifc Radio Activity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcAbsorbedDoseMeasurevalue <em>Ifc Absorbed Dose Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricCapacitanceMeasurevalue <em>Ifc Electric Capacitance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcDoseEquivalentMeasurevalue <em>Ifc Dose Equivalent Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricChargeMeasurevalue <em>Ifc Electric Charge Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricConductanceMeasurevalue <em>Ifc Electric Conductance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricResistanceMeasurevalue <em>Ifc Electric Resistance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcIlluminanceMeasurevalue <em>Ifc Illuminance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcInductanceMeasurevalue <em>Ifc Inductance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcForceMeasurevalue <em>Ifc Force Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcLuminousFluxMeasurevalue <em>Ifc Luminous Flux Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcMagneticFluxMeasurevalue <em>Ifc Magnetic Flux Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcMagneticFluxDensityMeasurevalue <em>Ifc Magnetic Flux Density Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcMonetaryMeasurevalue <em>Ifc Monetary Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcSpecificHeatCapacityMeasurevalue <em>Ifc Specific Heat Capacity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcIsothermalMoistureCapacityMeasurevalue <em>Ifc Isothermal Moisture Capacity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcMoistureDiffusivityMeasurevalue <em>Ifc Moisture Diffusivity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcVaporPermeabilityMeasurevalue <em>Ifc Vapor Permeability Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcMolecularWeightMeasurevalue <em>Ifc Molecular Weight Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalConductivityMeasurevalue <em>Ifc Thermal Conductivity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcAngularVelocityMeasurevalue <em>Ifc Angular Velocity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcDynamicViscosityMeasurevalue <em>Ifc Dynamic Viscosity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricVoltageMeasurevalue <em>Ifc Electric Voltage Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcEnergyMeasurevalue <em>Ifc Energy Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcFrequencyMeasurevalue <em>Ifc Frequency Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcHeatFluxDensityMeasurevalue <em>Ifc Heat Flux Density Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcIntegerCountRateMeasurevalue <em>Ifc Integer Count Rate Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcKinematicViscosityMeasurevalue <em>Ifc Kinematic Viscosity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearVelocityMeasurevalue <em>Ifc Linear Velocity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcMassDensityMeasurevalue <em>Ifc Mass Density Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcMassFlowRateMeasurevalue <em>Ifc Mass Flow Rate Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcPowerMeasurevalue <em>Ifc Power Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcPressureMeasurevalue <em>Ifc Pressure Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalAdmittanceMeasurevalue <em>Ifc Thermal Admittance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalResistanceMeasurevalue <em>Ifc Thermal Resistance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalTransmittanceMeasurevalue <em>Ifc Thermal Transmittance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcTimeStampvalue <em>Ifc Time Stampvalue</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedMeasureValue#getIfcVolumetricFlowRateMeasurevalue <em>Ifc Volumetric Flow Rate Measurevalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcDerivedMeasureValueImplAdapter.class)
public interface IfcDerivedMeasureValue extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Ifc Ion Concentration Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Ion Concentration Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Ion Concentration Measurevalue</em>' attribute.
	 * @see #isSetIfcIonConcentrationMeasurevalue()
	 * @see #unsetIfcIonConcentrationMeasurevalue()
	 * @see #setIfcIonConcentrationMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcIonConcentrationMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcIonConcentrationMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcIonConcentrationMeasurevalue <em>Ifc Ion Concentration Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Ion Concentration Measurevalue</em>' attribute.
	 * @see #isSetIfcIonConcentrationMeasurevalue()
	 * @see #unsetIfcIonConcentrationMeasurevalue()
	 * @see #getIfcIonConcentrationMeasurevalue()
	 * @generated
	 */
	void setIfcIonConcentrationMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcIonConcentrationMeasurevalue <em>Ifc Ion Concentration Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcIonConcentrationMeasurevalue()
	 * @see #getIfcIonConcentrationMeasurevalue()
	 * @see #setIfcIonConcentrationMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcIonConcentrationMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcIonConcentrationMeasurevalue <em>Ifc Ion Concentration Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Ion Concentration Measurevalue</em>' attribute is set.
	 * @see #unsetIfcIonConcentrationMeasurevalue()
	 * @see #getIfcIonConcentrationMeasurevalue()
	 * @see #setIfcIonConcentrationMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcIonConcentrationMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc PH Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc PH Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc PH Measurevalue</em>' attribute.
	 * @see #isSetIfcPHMeasurevalue()
	 * @see #unsetIfcPHMeasurevalue()
	 * @see #setIfcPHMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcPHMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcPHMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcPHMeasurevalue <em>Ifc PH Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc PH Measurevalue</em>' attribute.
	 * @see #isSetIfcPHMeasurevalue()
	 * @see #unsetIfcPHMeasurevalue()
	 * @see #getIfcPHMeasurevalue()
	 * @generated
	 */
	void setIfcPHMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcPHMeasurevalue <em>Ifc PH Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcPHMeasurevalue()
	 * @see #getIfcPHMeasurevalue()
	 * @see #setIfcPHMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcPHMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcPHMeasurevalue <em>Ifc PH Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc PH Measurevalue</em>' attribute is set.
	 * @see #unsetIfcPHMeasurevalue()
	 * @see #getIfcPHMeasurevalue()
	 * @see #setIfcPHMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcPHMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Heating Value Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Heating Value Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Heating Value Measurevalue</em>' attribute.
	 * @see #isSetIfcHeatingValueMeasurevalue()
	 * @see #unsetIfcHeatingValueMeasurevalue()
	 * @see #setIfcHeatingValueMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcHeatingValueMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcHeatingValueMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcHeatingValueMeasurevalue <em>Ifc Heating Value Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Heating Value Measurevalue</em>' attribute.
	 * @see #isSetIfcHeatingValueMeasurevalue()
	 * @see #unsetIfcHeatingValueMeasurevalue()
	 * @see #getIfcHeatingValueMeasurevalue()
	 * @generated
	 */
	void setIfcHeatingValueMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcHeatingValueMeasurevalue <em>Ifc Heating Value Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcHeatingValueMeasurevalue()
	 * @see #getIfcHeatingValueMeasurevalue()
	 * @see #setIfcHeatingValueMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcHeatingValueMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcHeatingValueMeasurevalue <em>Ifc Heating Value Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Heating Value Measurevalue</em>' attribute is set.
	 * @see #unsetIfcHeatingValueMeasurevalue()
	 * @see #getIfcHeatingValueMeasurevalue()
	 * @see #setIfcHeatingValueMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcHeatingValueMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Sound Pressure Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Sound Pressure Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Sound Pressure Measurevalue</em>' attribute.
	 * @see #isSetIfcSoundPressureMeasurevalue()
	 * @see #unsetIfcSoundPressureMeasurevalue()
	 * @see #setIfcSoundPressureMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcSoundPressureMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcSoundPressureMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSoundPressureMeasurevalue <em>Ifc Sound Pressure Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Sound Pressure Measurevalue</em>' attribute.
	 * @see #isSetIfcSoundPressureMeasurevalue()
	 * @see #unsetIfcSoundPressureMeasurevalue()
	 * @see #getIfcSoundPressureMeasurevalue()
	 * @generated
	 */
	void setIfcSoundPressureMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSoundPressureMeasurevalue <em>Ifc Sound Pressure Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcSoundPressureMeasurevalue()
	 * @see #getIfcSoundPressureMeasurevalue()
	 * @see #setIfcSoundPressureMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcSoundPressureMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSoundPressureMeasurevalue <em>Ifc Sound Pressure Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Sound Pressure Measurevalue</em>' attribute is set.
	 * @see #unsetIfcSoundPressureMeasurevalue()
	 * @see #getIfcSoundPressureMeasurevalue()
	 * @see #setIfcSoundPressureMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcSoundPressureMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Sound Power Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Sound Power Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Sound Power Measurevalue</em>' attribute.
	 * @see #isSetIfcSoundPowerMeasurevalue()
	 * @see #unsetIfcSoundPowerMeasurevalue()
	 * @see #setIfcSoundPowerMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcSoundPowerMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcSoundPowerMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSoundPowerMeasurevalue <em>Ifc Sound Power Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Sound Power Measurevalue</em>' attribute.
	 * @see #isSetIfcSoundPowerMeasurevalue()
	 * @see #unsetIfcSoundPowerMeasurevalue()
	 * @see #getIfcSoundPowerMeasurevalue()
	 * @generated
	 */
	void setIfcSoundPowerMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSoundPowerMeasurevalue <em>Ifc Sound Power Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcSoundPowerMeasurevalue()
	 * @see #getIfcSoundPowerMeasurevalue()
	 * @see #setIfcSoundPowerMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcSoundPowerMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSoundPowerMeasurevalue <em>Ifc Sound Power Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Sound Power Measurevalue</em>' attribute is set.
	 * @see #unsetIfcSoundPowerMeasurevalue()
	 * @see #getIfcSoundPowerMeasurevalue()
	 * @see #setIfcSoundPowerMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcSoundPowerMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Warping Moment Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Warping Moment Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Warping Moment Measurevalue</em>' attribute.
	 * @see #isSetIfcWarpingMomentMeasurevalue()
	 * @see #unsetIfcWarpingMomentMeasurevalue()
	 * @see #setIfcWarpingMomentMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcWarpingMomentMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcWarpingMomentMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcWarpingMomentMeasurevalue <em>Ifc Warping Moment Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Warping Moment Measurevalue</em>' attribute.
	 * @see #isSetIfcWarpingMomentMeasurevalue()
	 * @see #unsetIfcWarpingMomentMeasurevalue()
	 * @see #getIfcWarpingMomentMeasurevalue()
	 * @generated
	 */
	void setIfcWarpingMomentMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcWarpingMomentMeasurevalue <em>Ifc Warping Moment Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcWarpingMomentMeasurevalue()
	 * @see #getIfcWarpingMomentMeasurevalue()
	 * @see #setIfcWarpingMomentMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcWarpingMomentMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcWarpingMomentMeasurevalue <em>Ifc Warping Moment Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Warping Moment Measurevalue</em>' attribute is set.
	 * @see #unsetIfcWarpingMomentMeasurevalue()
	 * @see #getIfcWarpingMomentMeasurevalue()
	 * @see #setIfcWarpingMomentMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcWarpingMomentMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Warping Constant Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Warping Constant Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Warping Constant Measurevalue</em>' attribute.
	 * @see #isSetIfcWarpingConstantMeasurevalue()
	 * @see #unsetIfcWarpingConstantMeasurevalue()
	 * @see #setIfcWarpingConstantMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcWarpingConstantMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcWarpingConstantMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcWarpingConstantMeasurevalue <em>Ifc Warping Constant Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Warping Constant Measurevalue</em>' attribute.
	 * @see #isSetIfcWarpingConstantMeasurevalue()
	 * @see #unsetIfcWarpingConstantMeasurevalue()
	 * @see #getIfcWarpingConstantMeasurevalue()
	 * @generated
	 */
	void setIfcWarpingConstantMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcWarpingConstantMeasurevalue <em>Ifc Warping Constant Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcWarpingConstantMeasurevalue()
	 * @see #getIfcWarpingConstantMeasurevalue()
	 * @see #setIfcWarpingConstantMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcWarpingConstantMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcWarpingConstantMeasurevalue <em>Ifc Warping Constant Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Warping Constant Measurevalue</em>' attribute is set.
	 * @see #unsetIfcWarpingConstantMeasurevalue()
	 * @see #getIfcWarpingConstantMeasurevalue()
	 * @see #setIfcWarpingConstantMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcWarpingConstantMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Thermal Expansion Coefficient Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Thermal Expansion Coefficient Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Thermal Expansion Coefficient Measurevalue</em>' attribute.
	 * @see #isSetIfcThermalExpansionCoefficientMeasurevalue()
	 * @see #unsetIfcThermalExpansionCoefficientMeasurevalue()
	 * @see #setIfcThermalExpansionCoefficientMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcThermalExpansionCoefficientMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcThermalExpansionCoefficientMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalExpansionCoefficientMeasurevalue <em>Ifc Thermal Expansion Coefficient Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Thermal Expansion Coefficient Measurevalue</em>' attribute.
	 * @see #isSetIfcThermalExpansionCoefficientMeasurevalue()
	 * @see #unsetIfcThermalExpansionCoefficientMeasurevalue()
	 * @see #getIfcThermalExpansionCoefficientMeasurevalue()
	 * @generated
	 */
	void setIfcThermalExpansionCoefficientMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalExpansionCoefficientMeasurevalue <em>Ifc Thermal Expansion Coefficient Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcThermalExpansionCoefficientMeasurevalue()
	 * @see #getIfcThermalExpansionCoefficientMeasurevalue()
	 * @see #setIfcThermalExpansionCoefficientMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcThermalExpansionCoefficientMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalExpansionCoefficientMeasurevalue <em>Ifc Thermal Expansion Coefficient Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Thermal Expansion Coefficient Measurevalue</em>' attribute is set.
	 * @see #unsetIfcThermalExpansionCoefficientMeasurevalue()
	 * @see #getIfcThermalExpansionCoefficientMeasurevalue()
	 * @see #setIfcThermalExpansionCoefficientMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcThermalExpansionCoefficientMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Temperature Gradient Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Temperature Gradient Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Temperature Gradient Measurevalue</em>' attribute.
	 * @see #isSetIfcTemperatureGradientMeasurevalue()
	 * @see #unsetIfcTemperatureGradientMeasurevalue()
	 * @see #setIfcTemperatureGradientMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcTemperatureGradientMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcTemperatureGradientMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcTemperatureGradientMeasurevalue <em>Ifc Temperature Gradient Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Temperature Gradient Measurevalue</em>' attribute.
	 * @see #isSetIfcTemperatureGradientMeasurevalue()
	 * @see #unsetIfcTemperatureGradientMeasurevalue()
	 * @see #getIfcTemperatureGradientMeasurevalue()
	 * @generated
	 */
	void setIfcTemperatureGradientMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcTemperatureGradientMeasurevalue <em>Ifc Temperature Gradient Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcTemperatureGradientMeasurevalue()
	 * @see #getIfcTemperatureGradientMeasurevalue()
	 * @see #setIfcTemperatureGradientMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcTemperatureGradientMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcTemperatureGradientMeasurevalue <em>Ifc Temperature Gradient Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Temperature Gradient Measurevalue</em>' attribute is set.
	 * @see #unsetIfcTemperatureGradientMeasurevalue()
	 * @see #getIfcTemperatureGradientMeasurevalue()
	 * @see #setIfcTemperatureGradientMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcTemperatureGradientMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Section Modulus Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Section Modulus Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Section Modulus Measurevalue</em>' attribute.
	 * @see #isSetIfcSectionModulusMeasurevalue()
	 * @see #unsetIfcSectionModulusMeasurevalue()
	 * @see #setIfcSectionModulusMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcSectionModulusMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcSectionModulusMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSectionModulusMeasurevalue <em>Ifc Section Modulus Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Section Modulus Measurevalue</em>' attribute.
	 * @see #isSetIfcSectionModulusMeasurevalue()
	 * @see #unsetIfcSectionModulusMeasurevalue()
	 * @see #getIfcSectionModulusMeasurevalue()
	 * @generated
	 */
	void setIfcSectionModulusMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSectionModulusMeasurevalue <em>Ifc Section Modulus Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcSectionModulusMeasurevalue()
	 * @see #getIfcSectionModulusMeasurevalue()
	 * @see #setIfcSectionModulusMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcSectionModulusMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSectionModulusMeasurevalue <em>Ifc Section Modulus Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Section Modulus Measurevalue</em>' attribute is set.
	 * @see #unsetIfcSectionModulusMeasurevalue()
	 * @see #getIfcSectionModulusMeasurevalue()
	 * @see #setIfcSectionModulusMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcSectionModulusMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Sectional Area Integral Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Sectional Area Integral Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Sectional Area Integral Measurevalue</em>' attribute.
	 * @see #isSetIfcSectionalAreaIntegralMeasurevalue()
	 * @see #unsetIfcSectionalAreaIntegralMeasurevalue()
	 * @see #setIfcSectionalAreaIntegralMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcSectionalAreaIntegralMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcSectionalAreaIntegralMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSectionalAreaIntegralMeasurevalue <em>Ifc Sectional Area Integral Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Sectional Area Integral Measurevalue</em>' attribute.
	 * @see #isSetIfcSectionalAreaIntegralMeasurevalue()
	 * @see #unsetIfcSectionalAreaIntegralMeasurevalue()
	 * @see #getIfcSectionalAreaIntegralMeasurevalue()
	 * @generated
	 */
	void setIfcSectionalAreaIntegralMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSectionalAreaIntegralMeasurevalue <em>Ifc Sectional Area Integral Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcSectionalAreaIntegralMeasurevalue()
	 * @see #getIfcSectionalAreaIntegralMeasurevalue()
	 * @see #setIfcSectionalAreaIntegralMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcSectionalAreaIntegralMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSectionalAreaIntegralMeasurevalue <em>Ifc Sectional Area Integral Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Sectional Area Integral Measurevalue</em>' attribute is set.
	 * @see #unsetIfcSectionalAreaIntegralMeasurevalue()
	 * @see #getIfcSectionalAreaIntegralMeasurevalue()
	 * @see #setIfcSectionalAreaIntegralMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcSectionalAreaIntegralMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Rotational Mass Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Rotational Mass Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Rotational Mass Measurevalue</em>' attribute.
	 * @see #isSetIfcRotationalMassMeasurevalue()
	 * @see #unsetIfcRotationalMassMeasurevalue()
	 * @see #setIfcRotationalMassMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcRotationalMassMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcRotationalMassMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcRotationalMassMeasurevalue <em>Ifc Rotational Mass Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Rotational Mass Measurevalue</em>' attribute.
	 * @see #isSetIfcRotationalMassMeasurevalue()
	 * @see #unsetIfcRotationalMassMeasurevalue()
	 * @see #getIfcRotationalMassMeasurevalue()
	 * @generated
	 */
	void setIfcRotationalMassMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcRotationalMassMeasurevalue <em>Ifc Rotational Mass Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcRotationalMassMeasurevalue()
	 * @see #getIfcRotationalMassMeasurevalue()
	 * @see #setIfcRotationalMassMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcRotationalMassMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcRotationalMassMeasurevalue <em>Ifc Rotational Mass Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Rotational Mass Measurevalue</em>' attribute is set.
	 * @see #unsetIfcRotationalMassMeasurevalue()
	 * @see #getIfcRotationalMassMeasurevalue()
	 * @see #setIfcRotationalMassMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcRotationalMassMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Modulus Of Rotational Subgrade Reaction Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Modulus Of Rotational Subgrade Reaction Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Modulus Of Rotational Subgrade Reaction Measurevalue</em>' attribute.
	 * @see #isSetIfcModulusOfRotationalSubgradeReactionMeasurevalue()
	 * @see #unsetIfcModulusOfRotationalSubgradeReactionMeasurevalue()
	 * @see #setIfcModulusOfRotationalSubgradeReactionMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcModulusOfRotationalSubgradeReactionMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcModulusOfRotationalSubgradeReactionMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfRotationalSubgradeReactionMeasurevalue <em>Ifc Modulus Of Rotational Subgrade Reaction Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Modulus Of Rotational Subgrade Reaction Measurevalue</em>' attribute.
	 * @see #isSetIfcModulusOfRotationalSubgradeReactionMeasurevalue()
	 * @see #unsetIfcModulusOfRotationalSubgradeReactionMeasurevalue()
	 * @see #getIfcModulusOfRotationalSubgradeReactionMeasurevalue()
	 * @generated
	 */
	void setIfcModulusOfRotationalSubgradeReactionMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfRotationalSubgradeReactionMeasurevalue <em>Ifc Modulus Of Rotational Subgrade Reaction Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcModulusOfRotationalSubgradeReactionMeasurevalue()
	 * @see #getIfcModulusOfRotationalSubgradeReactionMeasurevalue()
	 * @see #setIfcModulusOfRotationalSubgradeReactionMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcModulusOfRotationalSubgradeReactionMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfRotationalSubgradeReactionMeasurevalue <em>Ifc Modulus Of Rotational Subgrade Reaction Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Modulus Of Rotational Subgrade Reaction Measurevalue</em>' attribute is set.
	 * @see #unsetIfcModulusOfRotationalSubgradeReactionMeasurevalue()
	 * @see #getIfcModulusOfRotationalSubgradeReactionMeasurevalue()
	 * @see #setIfcModulusOfRotationalSubgradeReactionMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcModulusOfRotationalSubgradeReactionMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Modulus Of Linear Subgrade Reaction Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Modulus Of Linear Subgrade Reaction Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Modulus Of Linear Subgrade Reaction Measurevalue</em>' attribute.
	 * @see #isSetIfcModulusOfLinearSubgradeReactionMeasurevalue()
	 * @see #unsetIfcModulusOfLinearSubgradeReactionMeasurevalue()
	 * @see #setIfcModulusOfLinearSubgradeReactionMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcModulusOfLinearSubgradeReactionMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcModulusOfLinearSubgradeReactionMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfLinearSubgradeReactionMeasurevalue <em>Ifc Modulus Of Linear Subgrade Reaction Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Modulus Of Linear Subgrade Reaction Measurevalue</em>' attribute.
	 * @see #isSetIfcModulusOfLinearSubgradeReactionMeasurevalue()
	 * @see #unsetIfcModulusOfLinearSubgradeReactionMeasurevalue()
	 * @see #getIfcModulusOfLinearSubgradeReactionMeasurevalue()
	 * @generated
	 */
	void setIfcModulusOfLinearSubgradeReactionMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfLinearSubgradeReactionMeasurevalue <em>Ifc Modulus Of Linear Subgrade Reaction Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcModulusOfLinearSubgradeReactionMeasurevalue()
	 * @see #getIfcModulusOfLinearSubgradeReactionMeasurevalue()
	 * @see #setIfcModulusOfLinearSubgradeReactionMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcModulusOfLinearSubgradeReactionMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfLinearSubgradeReactionMeasurevalue <em>Ifc Modulus Of Linear Subgrade Reaction Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Modulus Of Linear Subgrade Reaction Measurevalue</em>' attribute is set.
	 * @see #unsetIfcModulusOfLinearSubgradeReactionMeasurevalue()
	 * @see #getIfcModulusOfLinearSubgradeReactionMeasurevalue()
	 * @see #setIfcModulusOfLinearSubgradeReactionMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcModulusOfLinearSubgradeReactionMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Mass Per Length Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Mass Per Length Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Mass Per Length Measurevalue</em>' attribute.
	 * @see #isSetIfcMassPerLengthMeasurevalue()
	 * @see #unsetIfcMassPerLengthMeasurevalue()
	 * @see #setIfcMassPerLengthMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcMassPerLengthMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcMassPerLengthMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMassPerLengthMeasurevalue <em>Ifc Mass Per Length Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Mass Per Length Measurevalue</em>' attribute.
	 * @see #isSetIfcMassPerLengthMeasurevalue()
	 * @see #unsetIfcMassPerLengthMeasurevalue()
	 * @see #getIfcMassPerLengthMeasurevalue()
	 * @generated
	 */
	void setIfcMassPerLengthMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMassPerLengthMeasurevalue <em>Ifc Mass Per Length Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcMassPerLengthMeasurevalue()
	 * @see #getIfcMassPerLengthMeasurevalue()
	 * @see #setIfcMassPerLengthMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcMassPerLengthMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMassPerLengthMeasurevalue <em>Ifc Mass Per Length Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Mass Per Length Measurevalue</em>' attribute is set.
	 * @see #unsetIfcMassPerLengthMeasurevalue()
	 * @see #getIfcMassPerLengthMeasurevalue()
	 * @see #setIfcMassPerLengthMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcMassPerLengthMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Curvature Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Curvature Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Curvature Measurevalue</em>' attribute.
	 * @see #isSetIfcCurvatureMeasurevalue()
	 * @see #unsetIfcCurvatureMeasurevalue()
	 * @see #setIfcCurvatureMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcCurvatureMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcCurvatureMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcCurvatureMeasurevalue <em>Ifc Curvature Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Curvature Measurevalue</em>' attribute.
	 * @see #isSetIfcCurvatureMeasurevalue()
	 * @see #unsetIfcCurvatureMeasurevalue()
	 * @see #getIfcCurvatureMeasurevalue()
	 * @generated
	 */
	void setIfcCurvatureMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcCurvatureMeasurevalue <em>Ifc Curvature Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcCurvatureMeasurevalue()
	 * @see #getIfcCurvatureMeasurevalue()
	 * @see #setIfcCurvatureMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcCurvatureMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcCurvatureMeasurevalue <em>Ifc Curvature Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Curvature Measurevalue</em>' attribute is set.
	 * @see #unsetIfcCurvatureMeasurevalue()
	 * @see #getIfcCurvatureMeasurevalue()
	 * @see #setIfcCurvatureMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcCurvatureMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Luminous Intensity Distribution Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Luminous Intensity Distribution Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Luminous Intensity Distribution Measurevalue</em>' attribute.
	 * @see #isSetIfcLuminousIntensityDistributionMeasurevalue()
	 * @see #unsetIfcLuminousIntensityDistributionMeasurevalue()
	 * @see #setIfcLuminousIntensityDistributionMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcLuminousIntensityDistributionMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcLuminousIntensityDistributionMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLuminousIntensityDistributionMeasurevalue <em>Ifc Luminous Intensity Distribution Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Luminous Intensity Distribution Measurevalue</em>' attribute.
	 * @see #isSetIfcLuminousIntensityDistributionMeasurevalue()
	 * @see #unsetIfcLuminousIntensityDistributionMeasurevalue()
	 * @see #getIfcLuminousIntensityDistributionMeasurevalue()
	 * @generated
	 */
	void setIfcLuminousIntensityDistributionMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLuminousIntensityDistributionMeasurevalue <em>Ifc Luminous Intensity Distribution Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcLuminousIntensityDistributionMeasurevalue()
	 * @see #getIfcLuminousIntensityDistributionMeasurevalue()
	 * @see #setIfcLuminousIntensityDistributionMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcLuminousIntensityDistributionMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLuminousIntensityDistributionMeasurevalue <em>Ifc Luminous Intensity Distribution Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Luminous Intensity Distribution Measurevalue</em>' attribute is set.
	 * @see #unsetIfcLuminousIntensityDistributionMeasurevalue()
	 * @see #getIfcLuminousIntensityDistributionMeasurevalue()
	 * @see #setIfcLuminousIntensityDistributionMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcLuminousIntensityDistributionMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Linear Moment Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Linear Moment Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Linear Moment Measurevalue</em>' attribute.
	 * @see #isSetIfcLinearMomentMeasurevalue()
	 * @see #unsetIfcLinearMomentMeasurevalue()
	 * @see #setIfcLinearMomentMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcLinearMomentMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcLinearMomentMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearMomentMeasurevalue <em>Ifc Linear Moment Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Linear Moment Measurevalue</em>' attribute.
	 * @see #isSetIfcLinearMomentMeasurevalue()
	 * @see #unsetIfcLinearMomentMeasurevalue()
	 * @see #getIfcLinearMomentMeasurevalue()
	 * @generated
	 */
	void setIfcLinearMomentMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearMomentMeasurevalue <em>Ifc Linear Moment Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcLinearMomentMeasurevalue()
	 * @see #getIfcLinearMomentMeasurevalue()
	 * @see #setIfcLinearMomentMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcLinearMomentMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearMomentMeasurevalue <em>Ifc Linear Moment Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Linear Moment Measurevalue</em>' attribute is set.
	 * @see #unsetIfcLinearMomentMeasurevalue()
	 * @see #getIfcLinearMomentMeasurevalue()
	 * @see #setIfcLinearMomentMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcLinearMomentMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Shear Modulus Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Shear Modulus Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Shear Modulus Measurevalue</em>' attribute.
	 * @see #isSetIfcShearModulusMeasurevalue()
	 * @see #unsetIfcShearModulusMeasurevalue()
	 * @see #setIfcShearModulusMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcShearModulusMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcShearModulusMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcShearModulusMeasurevalue <em>Ifc Shear Modulus Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Shear Modulus Measurevalue</em>' attribute.
	 * @see #isSetIfcShearModulusMeasurevalue()
	 * @see #unsetIfcShearModulusMeasurevalue()
	 * @see #getIfcShearModulusMeasurevalue()
	 * @generated
	 */
	void setIfcShearModulusMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcShearModulusMeasurevalue <em>Ifc Shear Modulus Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcShearModulusMeasurevalue()
	 * @see #getIfcShearModulusMeasurevalue()
	 * @see #setIfcShearModulusMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcShearModulusMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcShearModulusMeasurevalue <em>Ifc Shear Modulus Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Shear Modulus Measurevalue</em>' attribute is set.
	 * @see #unsetIfcShearModulusMeasurevalue()
	 * @see #getIfcShearModulusMeasurevalue()
	 * @see #setIfcShearModulusMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcShearModulusMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Rotational Stiffness Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Rotational Stiffness Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Rotational Stiffness Measurevalue</em>' attribute.
	 * @see #isSetIfcRotationalStiffnessMeasurevalue()
	 * @see #unsetIfcRotationalStiffnessMeasurevalue()
	 * @see #setIfcRotationalStiffnessMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcRotationalStiffnessMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcRotationalStiffnessMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcRotationalStiffnessMeasurevalue <em>Ifc Rotational Stiffness Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Rotational Stiffness Measurevalue</em>' attribute.
	 * @see #isSetIfcRotationalStiffnessMeasurevalue()
	 * @see #unsetIfcRotationalStiffnessMeasurevalue()
	 * @see #getIfcRotationalStiffnessMeasurevalue()
	 * @generated
	 */
	void setIfcRotationalStiffnessMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcRotationalStiffnessMeasurevalue <em>Ifc Rotational Stiffness Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcRotationalStiffnessMeasurevalue()
	 * @see #getIfcRotationalStiffnessMeasurevalue()
	 * @see #setIfcRotationalStiffnessMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcRotationalStiffnessMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcRotationalStiffnessMeasurevalue <em>Ifc Rotational Stiffness Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Rotational Stiffness Measurevalue</em>' attribute is set.
	 * @see #unsetIfcRotationalStiffnessMeasurevalue()
	 * @see #getIfcRotationalStiffnessMeasurevalue()
	 * @see #setIfcRotationalStiffnessMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcRotationalStiffnessMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Planar Force Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Planar Force Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Planar Force Measurevalue</em>' attribute.
	 * @see #isSetIfcPlanarForceMeasurevalue()
	 * @see #unsetIfcPlanarForceMeasurevalue()
	 * @see #setIfcPlanarForceMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcPlanarForceMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcPlanarForceMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcPlanarForceMeasurevalue <em>Ifc Planar Force Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Planar Force Measurevalue</em>' attribute.
	 * @see #isSetIfcPlanarForceMeasurevalue()
	 * @see #unsetIfcPlanarForceMeasurevalue()
	 * @see #getIfcPlanarForceMeasurevalue()
	 * @generated
	 */
	void setIfcPlanarForceMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcPlanarForceMeasurevalue <em>Ifc Planar Force Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcPlanarForceMeasurevalue()
	 * @see #getIfcPlanarForceMeasurevalue()
	 * @see #setIfcPlanarForceMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcPlanarForceMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcPlanarForceMeasurevalue <em>Ifc Planar Force Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Planar Force Measurevalue</em>' attribute is set.
	 * @see #unsetIfcPlanarForceMeasurevalue()
	 * @see #getIfcPlanarForceMeasurevalue()
	 * @see #setIfcPlanarForceMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcPlanarForceMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Moment Of Inertia Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Moment Of Inertia Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Moment Of Inertia Measurevalue</em>' attribute.
	 * @see #isSetIfcMomentOfInertiaMeasurevalue()
	 * @see #unsetIfcMomentOfInertiaMeasurevalue()
	 * @see #setIfcMomentOfInertiaMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcMomentOfInertiaMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcMomentOfInertiaMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMomentOfInertiaMeasurevalue <em>Ifc Moment Of Inertia Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Moment Of Inertia Measurevalue</em>' attribute.
	 * @see #isSetIfcMomentOfInertiaMeasurevalue()
	 * @see #unsetIfcMomentOfInertiaMeasurevalue()
	 * @see #getIfcMomentOfInertiaMeasurevalue()
	 * @generated
	 */
	void setIfcMomentOfInertiaMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMomentOfInertiaMeasurevalue <em>Ifc Moment Of Inertia Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcMomentOfInertiaMeasurevalue()
	 * @see #getIfcMomentOfInertiaMeasurevalue()
	 * @see #setIfcMomentOfInertiaMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcMomentOfInertiaMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMomentOfInertiaMeasurevalue <em>Ifc Moment Of Inertia Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Moment Of Inertia Measurevalue</em>' attribute is set.
	 * @see #unsetIfcMomentOfInertiaMeasurevalue()
	 * @see #getIfcMomentOfInertiaMeasurevalue()
	 * @see #setIfcMomentOfInertiaMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcMomentOfInertiaMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Modulus Of Elasticity Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Modulus Of Elasticity Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Modulus Of Elasticity Measurevalue</em>' attribute.
	 * @see #isSetIfcModulusOfElasticityMeasurevalue()
	 * @see #unsetIfcModulusOfElasticityMeasurevalue()
	 * @see #setIfcModulusOfElasticityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcModulusOfElasticityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcModulusOfElasticityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfElasticityMeasurevalue <em>Ifc Modulus Of Elasticity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Modulus Of Elasticity Measurevalue</em>' attribute.
	 * @see #isSetIfcModulusOfElasticityMeasurevalue()
	 * @see #unsetIfcModulusOfElasticityMeasurevalue()
	 * @see #getIfcModulusOfElasticityMeasurevalue()
	 * @generated
	 */
	void setIfcModulusOfElasticityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfElasticityMeasurevalue <em>Ifc Modulus Of Elasticity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcModulusOfElasticityMeasurevalue()
	 * @see #getIfcModulusOfElasticityMeasurevalue()
	 * @see #setIfcModulusOfElasticityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcModulusOfElasticityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfElasticityMeasurevalue <em>Ifc Modulus Of Elasticity Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Modulus Of Elasticity Measurevalue</em>' attribute is set.
	 * @see #unsetIfcModulusOfElasticityMeasurevalue()
	 * @see #getIfcModulusOfElasticityMeasurevalue()
	 * @see #setIfcModulusOfElasticityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcModulusOfElasticityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Modulus Of Subgrade Reaction Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Modulus Of Subgrade Reaction Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Modulus Of Subgrade Reaction Measurevalue</em>' attribute.
	 * @see #isSetIfcModulusOfSubgradeReactionMeasurevalue()
	 * @see #unsetIfcModulusOfSubgradeReactionMeasurevalue()
	 * @see #setIfcModulusOfSubgradeReactionMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcModulusOfSubgradeReactionMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcModulusOfSubgradeReactionMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfSubgradeReactionMeasurevalue <em>Ifc Modulus Of Subgrade Reaction Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Modulus Of Subgrade Reaction Measurevalue</em>' attribute.
	 * @see #isSetIfcModulusOfSubgradeReactionMeasurevalue()
	 * @see #unsetIfcModulusOfSubgradeReactionMeasurevalue()
	 * @see #getIfcModulusOfSubgradeReactionMeasurevalue()
	 * @generated
	 */
	void setIfcModulusOfSubgradeReactionMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfSubgradeReactionMeasurevalue <em>Ifc Modulus Of Subgrade Reaction Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcModulusOfSubgradeReactionMeasurevalue()
	 * @see #getIfcModulusOfSubgradeReactionMeasurevalue()
	 * @see #setIfcModulusOfSubgradeReactionMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcModulusOfSubgradeReactionMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcModulusOfSubgradeReactionMeasurevalue <em>Ifc Modulus Of Subgrade Reaction Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Modulus Of Subgrade Reaction Measurevalue</em>' attribute is set.
	 * @see #unsetIfcModulusOfSubgradeReactionMeasurevalue()
	 * @see #getIfcModulusOfSubgradeReactionMeasurevalue()
	 * @see #setIfcModulusOfSubgradeReactionMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcModulusOfSubgradeReactionMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Linear Stiffness Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Linear Stiffness Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Linear Stiffness Measurevalue</em>' attribute.
	 * @see #isSetIfcLinearStiffnessMeasurevalue()
	 * @see #unsetIfcLinearStiffnessMeasurevalue()
	 * @see #setIfcLinearStiffnessMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcLinearStiffnessMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcLinearStiffnessMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearStiffnessMeasurevalue <em>Ifc Linear Stiffness Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Linear Stiffness Measurevalue</em>' attribute.
	 * @see #isSetIfcLinearStiffnessMeasurevalue()
	 * @see #unsetIfcLinearStiffnessMeasurevalue()
	 * @see #getIfcLinearStiffnessMeasurevalue()
	 * @generated
	 */
	void setIfcLinearStiffnessMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearStiffnessMeasurevalue <em>Ifc Linear Stiffness Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcLinearStiffnessMeasurevalue()
	 * @see #getIfcLinearStiffnessMeasurevalue()
	 * @see #setIfcLinearStiffnessMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcLinearStiffnessMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearStiffnessMeasurevalue <em>Ifc Linear Stiffness Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Linear Stiffness Measurevalue</em>' attribute is set.
	 * @see #unsetIfcLinearStiffnessMeasurevalue()
	 * @see #getIfcLinearStiffnessMeasurevalue()
	 * @see #setIfcLinearStiffnessMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcLinearStiffnessMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Linear Force Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Linear Force Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Linear Force Measurevalue</em>' attribute.
	 * @see #isSetIfcLinearForceMeasurevalue()
	 * @see #unsetIfcLinearForceMeasurevalue()
	 * @see #setIfcLinearForceMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcLinearForceMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcLinearForceMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearForceMeasurevalue <em>Ifc Linear Force Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Linear Force Measurevalue</em>' attribute.
	 * @see #isSetIfcLinearForceMeasurevalue()
	 * @see #unsetIfcLinearForceMeasurevalue()
	 * @see #getIfcLinearForceMeasurevalue()
	 * @generated
	 */
	void setIfcLinearForceMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearForceMeasurevalue <em>Ifc Linear Force Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcLinearForceMeasurevalue()
	 * @see #getIfcLinearForceMeasurevalue()
	 * @see #setIfcLinearForceMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcLinearForceMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearForceMeasurevalue <em>Ifc Linear Force Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Linear Force Measurevalue</em>' attribute is set.
	 * @see #unsetIfcLinearForceMeasurevalue()
	 * @see #getIfcLinearForceMeasurevalue()
	 * @see #setIfcLinearForceMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcLinearForceMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Acceleration Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Acceleration Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Acceleration Measurevalue</em>' attribute.
	 * @see #isSetIfcAccelerationMeasurevalue()
	 * @see #unsetIfcAccelerationMeasurevalue()
	 * @see #setIfcAccelerationMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcAccelerationMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcAccelerationMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcAccelerationMeasurevalue <em>Ifc Acceleration Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Acceleration Measurevalue</em>' attribute.
	 * @see #isSetIfcAccelerationMeasurevalue()
	 * @see #unsetIfcAccelerationMeasurevalue()
	 * @see #getIfcAccelerationMeasurevalue()
	 * @generated
	 */
	void setIfcAccelerationMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcAccelerationMeasurevalue <em>Ifc Acceleration Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcAccelerationMeasurevalue()
	 * @see #getIfcAccelerationMeasurevalue()
	 * @see #setIfcAccelerationMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcAccelerationMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcAccelerationMeasurevalue <em>Ifc Acceleration Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Acceleration Measurevalue</em>' attribute is set.
	 * @see #unsetIfcAccelerationMeasurevalue()
	 * @see #getIfcAccelerationMeasurevalue()
	 * @see #setIfcAccelerationMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcAccelerationMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Torque Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Torque Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Torque Measurevalue</em>' attribute.
	 * @see #isSetIfcTorqueMeasurevalue()
	 * @see #unsetIfcTorqueMeasurevalue()
	 * @see #setIfcTorqueMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcTorqueMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcTorqueMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcTorqueMeasurevalue <em>Ifc Torque Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Torque Measurevalue</em>' attribute.
	 * @see #isSetIfcTorqueMeasurevalue()
	 * @see #unsetIfcTorqueMeasurevalue()
	 * @see #getIfcTorqueMeasurevalue()
	 * @generated
	 */
	void setIfcTorqueMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcTorqueMeasurevalue <em>Ifc Torque Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcTorqueMeasurevalue()
	 * @see #getIfcTorqueMeasurevalue()
	 * @see #setIfcTorqueMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcTorqueMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcTorqueMeasurevalue <em>Ifc Torque Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Torque Measurevalue</em>' attribute is set.
	 * @see #unsetIfcTorqueMeasurevalue()
	 * @see #getIfcTorqueMeasurevalue()
	 * @see #setIfcTorqueMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcTorqueMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Rotational Frequency Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Rotational Frequency Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Rotational Frequency Measurevalue</em>' attribute.
	 * @see #isSetIfcRotationalFrequencyMeasurevalue()
	 * @see #unsetIfcRotationalFrequencyMeasurevalue()
	 * @see #setIfcRotationalFrequencyMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcRotationalFrequencyMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcRotationalFrequencyMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcRotationalFrequencyMeasurevalue <em>Ifc Rotational Frequency Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Rotational Frequency Measurevalue</em>' attribute.
	 * @see #isSetIfcRotationalFrequencyMeasurevalue()
	 * @see #unsetIfcRotationalFrequencyMeasurevalue()
	 * @see #getIfcRotationalFrequencyMeasurevalue()
	 * @generated
	 */
	void setIfcRotationalFrequencyMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcRotationalFrequencyMeasurevalue <em>Ifc Rotational Frequency Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcRotationalFrequencyMeasurevalue()
	 * @see #getIfcRotationalFrequencyMeasurevalue()
	 * @see #setIfcRotationalFrequencyMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcRotationalFrequencyMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcRotationalFrequencyMeasurevalue <em>Ifc Rotational Frequency Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Rotational Frequency Measurevalue</em>' attribute is set.
	 * @see #unsetIfcRotationalFrequencyMeasurevalue()
	 * @see #getIfcRotationalFrequencyMeasurevalue()
	 * @see #setIfcRotationalFrequencyMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcRotationalFrequencyMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Radio Activity Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Radio Activity Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Radio Activity Measurevalue</em>' attribute.
	 * @see #isSetIfcRadioActivityMeasurevalue()
	 * @see #unsetIfcRadioActivityMeasurevalue()
	 * @see #setIfcRadioActivityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcRadioActivityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcRadioActivityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcRadioActivityMeasurevalue <em>Ifc Radio Activity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Radio Activity Measurevalue</em>' attribute.
	 * @see #isSetIfcRadioActivityMeasurevalue()
	 * @see #unsetIfcRadioActivityMeasurevalue()
	 * @see #getIfcRadioActivityMeasurevalue()
	 * @generated
	 */
	void setIfcRadioActivityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcRadioActivityMeasurevalue <em>Ifc Radio Activity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcRadioActivityMeasurevalue()
	 * @see #getIfcRadioActivityMeasurevalue()
	 * @see #setIfcRadioActivityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcRadioActivityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcRadioActivityMeasurevalue <em>Ifc Radio Activity Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Radio Activity Measurevalue</em>' attribute is set.
	 * @see #unsetIfcRadioActivityMeasurevalue()
	 * @see #getIfcRadioActivityMeasurevalue()
	 * @see #setIfcRadioActivityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcRadioActivityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Absorbed Dose Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Absorbed Dose Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Absorbed Dose Measurevalue</em>' attribute.
	 * @see #isSetIfcAbsorbedDoseMeasurevalue()
	 * @see #unsetIfcAbsorbedDoseMeasurevalue()
	 * @see #setIfcAbsorbedDoseMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcAbsorbedDoseMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcAbsorbedDoseMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcAbsorbedDoseMeasurevalue <em>Ifc Absorbed Dose Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Absorbed Dose Measurevalue</em>' attribute.
	 * @see #isSetIfcAbsorbedDoseMeasurevalue()
	 * @see #unsetIfcAbsorbedDoseMeasurevalue()
	 * @see #getIfcAbsorbedDoseMeasurevalue()
	 * @generated
	 */
	void setIfcAbsorbedDoseMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcAbsorbedDoseMeasurevalue <em>Ifc Absorbed Dose Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcAbsorbedDoseMeasurevalue()
	 * @see #getIfcAbsorbedDoseMeasurevalue()
	 * @see #setIfcAbsorbedDoseMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcAbsorbedDoseMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcAbsorbedDoseMeasurevalue <em>Ifc Absorbed Dose Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Absorbed Dose Measurevalue</em>' attribute is set.
	 * @see #unsetIfcAbsorbedDoseMeasurevalue()
	 * @see #getIfcAbsorbedDoseMeasurevalue()
	 * @see #setIfcAbsorbedDoseMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcAbsorbedDoseMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Electric Capacitance Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Electric Capacitance Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Electric Capacitance Measurevalue</em>' attribute.
	 * @see #isSetIfcElectricCapacitanceMeasurevalue()
	 * @see #unsetIfcElectricCapacitanceMeasurevalue()
	 * @see #setIfcElectricCapacitanceMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcElectricCapacitanceMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcElectricCapacitanceMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricCapacitanceMeasurevalue <em>Ifc Electric Capacitance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Electric Capacitance Measurevalue</em>' attribute.
	 * @see #isSetIfcElectricCapacitanceMeasurevalue()
	 * @see #unsetIfcElectricCapacitanceMeasurevalue()
	 * @see #getIfcElectricCapacitanceMeasurevalue()
	 * @generated
	 */
	void setIfcElectricCapacitanceMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricCapacitanceMeasurevalue <em>Ifc Electric Capacitance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcElectricCapacitanceMeasurevalue()
	 * @see #getIfcElectricCapacitanceMeasurevalue()
	 * @see #setIfcElectricCapacitanceMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcElectricCapacitanceMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricCapacitanceMeasurevalue <em>Ifc Electric Capacitance Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Electric Capacitance Measurevalue</em>' attribute is set.
	 * @see #unsetIfcElectricCapacitanceMeasurevalue()
	 * @see #getIfcElectricCapacitanceMeasurevalue()
	 * @see #setIfcElectricCapacitanceMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcElectricCapacitanceMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Dose Equivalent Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Dose Equivalent Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Dose Equivalent Measurevalue</em>' attribute.
	 * @see #isSetIfcDoseEquivalentMeasurevalue()
	 * @see #unsetIfcDoseEquivalentMeasurevalue()
	 * @see #setIfcDoseEquivalentMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcDoseEquivalentMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcDoseEquivalentMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcDoseEquivalentMeasurevalue <em>Ifc Dose Equivalent Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Dose Equivalent Measurevalue</em>' attribute.
	 * @see #isSetIfcDoseEquivalentMeasurevalue()
	 * @see #unsetIfcDoseEquivalentMeasurevalue()
	 * @see #getIfcDoseEquivalentMeasurevalue()
	 * @generated
	 */
	void setIfcDoseEquivalentMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcDoseEquivalentMeasurevalue <em>Ifc Dose Equivalent Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcDoseEquivalentMeasurevalue()
	 * @see #getIfcDoseEquivalentMeasurevalue()
	 * @see #setIfcDoseEquivalentMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcDoseEquivalentMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcDoseEquivalentMeasurevalue <em>Ifc Dose Equivalent Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Dose Equivalent Measurevalue</em>' attribute is set.
	 * @see #unsetIfcDoseEquivalentMeasurevalue()
	 * @see #getIfcDoseEquivalentMeasurevalue()
	 * @see #setIfcDoseEquivalentMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcDoseEquivalentMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Electric Charge Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Electric Charge Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Electric Charge Measurevalue</em>' attribute.
	 * @see #isSetIfcElectricChargeMeasurevalue()
	 * @see #unsetIfcElectricChargeMeasurevalue()
	 * @see #setIfcElectricChargeMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcElectricChargeMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcElectricChargeMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricChargeMeasurevalue <em>Ifc Electric Charge Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Electric Charge Measurevalue</em>' attribute.
	 * @see #isSetIfcElectricChargeMeasurevalue()
	 * @see #unsetIfcElectricChargeMeasurevalue()
	 * @see #getIfcElectricChargeMeasurevalue()
	 * @generated
	 */
	void setIfcElectricChargeMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricChargeMeasurevalue <em>Ifc Electric Charge Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcElectricChargeMeasurevalue()
	 * @see #getIfcElectricChargeMeasurevalue()
	 * @see #setIfcElectricChargeMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcElectricChargeMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricChargeMeasurevalue <em>Ifc Electric Charge Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Electric Charge Measurevalue</em>' attribute is set.
	 * @see #unsetIfcElectricChargeMeasurevalue()
	 * @see #getIfcElectricChargeMeasurevalue()
	 * @see #setIfcElectricChargeMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcElectricChargeMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Electric Conductance Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Electric Conductance Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Electric Conductance Measurevalue</em>' attribute.
	 * @see #isSetIfcElectricConductanceMeasurevalue()
	 * @see #unsetIfcElectricConductanceMeasurevalue()
	 * @see #setIfcElectricConductanceMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcElectricConductanceMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcElectricConductanceMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricConductanceMeasurevalue <em>Ifc Electric Conductance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Electric Conductance Measurevalue</em>' attribute.
	 * @see #isSetIfcElectricConductanceMeasurevalue()
	 * @see #unsetIfcElectricConductanceMeasurevalue()
	 * @see #getIfcElectricConductanceMeasurevalue()
	 * @generated
	 */
	void setIfcElectricConductanceMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricConductanceMeasurevalue <em>Ifc Electric Conductance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcElectricConductanceMeasurevalue()
	 * @see #getIfcElectricConductanceMeasurevalue()
	 * @see #setIfcElectricConductanceMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcElectricConductanceMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricConductanceMeasurevalue <em>Ifc Electric Conductance Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Electric Conductance Measurevalue</em>' attribute is set.
	 * @see #unsetIfcElectricConductanceMeasurevalue()
	 * @see #getIfcElectricConductanceMeasurevalue()
	 * @see #setIfcElectricConductanceMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcElectricConductanceMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Electric Resistance Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Electric Resistance Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Electric Resistance Measurevalue</em>' attribute.
	 * @see #isSetIfcElectricResistanceMeasurevalue()
	 * @see #unsetIfcElectricResistanceMeasurevalue()
	 * @see #setIfcElectricResistanceMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcElectricResistanceMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcElectricResistanceMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricResistanceMeasurevalue <em>Ifc Electric Resistance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Electric Resistance Measurevalue</em>' attribute.
	 * @see #isSetIfcElectricResistanceMeasurevalue()
	 * @see #unsetIfcElectricResistanceMeasurevalue()
	 * @see #getIfcElectricResistanceMeasurevalue()
	 * @generated
	 */
	void setIfcElectricResistanceMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricResistanceMeasurevalue <em>Ifc Electric Resistance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcElectricResistanceMeasurevalue()
	 * @see #getIfcElectricResistanceMeasurevalue()
	 * @see #setIfcElectricResistanceMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcElectricResistanceMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricResistanceMeasurevalue <em>Ifc Electric Resistance Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Electric Resistance Measurevalue</em>' attribute is set.
	 * @see #unsetIfcElectricResistanceMeasurevalue()
	 * @see #getIfcElectricResistanceMeasurevalue()
	 * @see #setIfcElectricResistanceMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcElectricResistanceMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Illuminance Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Illuminance Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Illuminance Measurevalue</em>' attribute.
	 * @see #isSetIfcIlluminanceMeasurevalue()
	 * @see #unsetIfcIlluminanceMeasurevalue()
	 * @see #setIfcIlluminanceMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcIlluminanceMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcIlluminanceMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcIlluminanceMeasurevalue <em>Ifc Illuminance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Illuminance Measurevalue</em>' attribute.
	 * @see #isSetIfcIlluminanceMeasurevalue()
	 * @see #unsetIfcIlluminanceMeasurevalue()
	 * @see #getIfcIlluminanceMeasurevalue()
	 * @generated
	 */
	void setIfcIlluminanceMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcIlluminanceMeasurevalue <em>Ifc Illuminance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcIlluminanceMeasurevalue()
	 * @see #getIfcIlluminanceMeasurevalue()
	 * @see #setIfcIlluminanceMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcIlluminanceMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcIlluminanceMeasurevalue <em>Ifc Illuminance Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Illuminance Measurevalue</em>' attribute is set.
	 * @see #unsetIfcIlluminanceMeasurevalue()
	 * @see #getIfcIlluminanceMeasurevalue()
	 * @see #setIfcIlluminanceMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcIlluminanceMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Inductance Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Inductance Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Inductance Measurevalue</em>' attribute.
	 * @see #isSetIfcInductanceMeasurevalue()
	 * @see #unsetIfcInductanceMeasurevalue()
	 * @see #setIfcInductanceMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcInductanceMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcInductanceMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcInductanceMeasurevalue <em>Ifc Inductance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Inductance Measurevalue</em>' attribute.
	 * @see #isSetIfcInductanceMeasurevalue()
	 * @see #unsetIfcInductanceMeasurevalue()
	 * @see #getIfcInductanceMeasurevalue()
	 * @generated
	 */
	void setIfcInductanceMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcInductanceMeasurevalue <em>Ifc Inductance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcInductanceMeasurevalue()
	 * @see #getIfcInductanceMeasurevalue()
	 * @see #setIfcInductanceMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcInductanceMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcInductanceMeasurevalue <em>Ifc Inductance Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Inductance Measurevalue</em>' attribute is set.
	 * @see #unsetIfcInductanceMeasurevalue()
	 * @see #getIfcInductanceMeasurevalue()
	 * @see #setIfcInductanceMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcInductanceMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Force Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Force Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Force Measurevalue</em>' attribute.
	 * @see #isSetIfcForceMeasurevalue()
	 * @see #unsetIfcForceMeasurevalue()
	 * @see #setIfcForceMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcForceMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcForceMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcForceMeasurevalue <em>Ifc Force Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Force Measurevalue</em>' attribute.
	 * @see #isSetIfcForceMeasurevalue()
	 * @see #unsetIfcForceMeasurevalue()
	 * @see #getIfcForceMeasurevalue()
	 * @generated
	 */
	void setIfcForceMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcForceMeasurevalue <em>Ifc Force Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcForceMeasurevalue()
	 * @see #getIfcForceMeasurevalue()
	 * @see #setIfcForceMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcForceMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcForceMeasurevalue <em>Ifc Force Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Force Measurevalue</em>' attribute is set.
	 * @see #unsetIfcForceMeasurevalue()
	 * @see #getIfcForceMeasurevalue()
	 * @see #setIfcForceMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcForceMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Luminous Flux Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Luminous Flux Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Luminous Flux Measurevalue</em>' attribute.
	 * @see #isSetIfcLuminousFluxMeasurevalue()
	 * @see #unsetIfcLuminousFluxMeasurevalue()
	 * @see #setIfcLuminousFluxMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcLuminousFluxMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcLuminousFluxMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLuminousFluxMeasurevalue <em>Ifc Luminous Flux Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Luminous Flux Measurevalue</em>' attribute.
	 * @see #isSetIfcLuminousFluxMeasurevalue()
	 * @see #unsetIfcLuminousFluxMeasurevalue()
	 * @see #getIfcLuminousFluxMeasurevalue()
	 * @generated
	 */
	void setIfcLuminousFluxMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLuminousFluxMeasurevalue <em>Ifc Luminous Flux Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcLuminousFluxMeasurevalue()
	 * @see #getIfcLuminousFluxMeasurevalue()
	 * @see #setIfcLuminousFluxMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcLuminousFluxMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLuminousFluxMeasurevalue <em>Ifc Luminous Flux Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Luminous Flux Measurevalue</em>' attribute is set.
	 * @see #unsetIfcLuminousFluxMeasurevalue()
	 * @see #getIfcLuminousFluxMeasurevalue()
	 * @see #setIfcLuminousFluxMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcLuminousFluxMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Magnetic Flux Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Magnetic Flux Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Magnetic Flux Measurevalue</em>' attribute.
	 * @see #isSetIfcMagneticFluxMeasurevalue()
	 * @see #unsetIfcMagneticFluxMeasurevalue()
	 * @see #setIfcMagneticFluxMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcMagneticFluxMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcMagneticFluxMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMagneticFluxMeasurevalue <em>Ifc Magnetic Flux Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Magnetic Flux Measurevalue</em>' attribute.
	 * @see #isSetIfcMagneticFluxMeasurevalue()
	 * @see #unsetIfcMagneticFluxMeasurevalue()
	 * @see #getIfcMagneticFluxMeasurevalue()
	 * @generated
	 */
	void setIfcMagneticFluxMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMagneticFluxMeasurevalue <em>Ifc Magnetic Flux Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcMagneticFluxMeasurevalue()
	 * @see #getIfcMagneticFluxMeasurevalue()
	 * @see #setIfcMagneticFluxMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcMagneticFluxMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMagneticFluxMeasurevalue <em>Ifc Magnetic Flux Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Magnetic Flux Measurevalue</em>' attribute is set.
	 * @see #unsetIfcMagneticFluxMeasurevalue()
	 * @see #getIfcMagneticFluxMeasurevalue()
	 * @see #setIfcMagneticFluxMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcMagneticFluxMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Magnetic Flux Density Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Magnetic Flux Density Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Magnetic Flux Density Measurevalue</em>' attribute.
	 * @see #isSetIfcMagneticFluxDensityMeasurevalue()
	 * @see #unsetIfcMagneticFluxDensityMeasurevalue()
	 * @see #setIfcMagneticFluxDensityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcMagneticFluxDensityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcMagneticFluxDensityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMagneticFluxDensityMeasurevalue <em>Ifc Magnetic Flux Density Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Magnetic Flux Density Measurevalue</em>' attribute.
	 * @see #isSetIfcMagneticFluxDensityMeasurevalue()
	 * @see #unsetIfcMagneticFluxDensityMeasurevalue()
	 * @see #getIfcMagneticFluxDensityMeasurevalue()
	 * @generated
	 */
	void setIfcMagneticFluxDensityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMagneticFluxDensityMeasurevalue <em>Ifc Magnetic Flux Density Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcMagneticFluxDensityMeasurevalue()
	 * @see #getIfcMagneticFluxDensityMeasurevalue()
	 * @see #setIfcMagneticFluxDensityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcMagneticFluxDensityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMagneticFluxDensityMeasurevalue <em>Ifc Magnetic Flux Density Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Magnetic Flux Density Measurevalue</em>' attribute is set.
	 * @see #unsetIfcMagneticFluxDensityMeasurevalue()
	 * @see #getIfcMagneticFluxDensityMeasurevalue()
	 * @see #setIfcMagneticFluxDensityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcMagneticFluxDensityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Monetary Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Monetary Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Monetary Measurevalue</em>' attribute.
	 * @see #isSetIfcMonetaryMeasurevalue()
	 * @see #unsetIfcMonetaryMeasurevalue()
	 * @see #setIfcMonetaryMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcMonetaryMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcMonetaryMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMonetaryMeasurevalue <em>Ifc Monetary Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Monetary Measurevalue</em>' attribute.
	 * @see #isSetIfcMonetaryMeasurevalue()
	 * @see #unsetIfcMonetaryMeasurevalue()
	 * @see #getIfcMonetaryMeasurevalue()
	 * @generated
	 */
	void setIfcMonetaryMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMonetaryMeasurevalue <em>Ifc Monetary Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcMonetaryMeasurevalue()
	 * @see #getIfcMonetaryMeasurevalue()
	 * @see #setIfcMonetaryMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcMonetaryMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMonetaryMeasurevalue <em>Ifc Monetary Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Monetary Measurevalue</em>' attribute is set.
	 * @see #unsetIfcMonetaryMeasurevalue()
	 * @see #getIfcMonetaryMeasurevalue()
	 * @see #setIfcMonetaryMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcMonetaryMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Specific Heat Capacity Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Specific Heat Capacity Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Specific Heat Capacity Measurevalue</em>' attribute.
	 * @see #isSetIfcSpecificHeatCapacityMeasurevalue()
	 * @see #unsetIfcSpecificHeatCapacityMeasurevalue()
	 * @see #setIfcSpecificHeatCapacityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcSpecificHeatCapacityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcSpecificHeatCapacityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSpecificHeatCapacityMeasurevalue <em>Ifc Specific Heat Capacity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Specific Heat Capacity Measurevalue</em>' attribute.
	 * @see #isSetIfcSpecificHeatCapacityMeasurevalue()
	 * @see #unsetIfcSpecificHeatCapacityMeasurevalue()
	 * @see #getIfcSpecificHeatCapacityMeasurevalue()
	 * @generated
	 */
	void setIfcSpecificHeatCapacityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSpecificHeatCapacityMeasurevalue <em>Ifc Specific Heat Capacity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcSpecificHeatCapacityMeasurevalue()
	 * @see #getIfcSpecificHeatCapacityMeasurevalue()
	 * @see #setIfcSpecificHeatCapacityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcSpecificHeatCapacityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcSpecificHeatCapacityMeasurevalue <em>Ifc Specific Heat Capacity Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Specific Heat Capacity Measurevalue</em>' attribute is set.
	 * @see #unsetIfcSpecificHeatCapacityMeasurevalue()
	 * @see #getIfcSpecificHeatCapacityMeasurevalue()
	 * @see #setIfcSpecificHeatCapacityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcSpecificHeatCapacityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Isothermal Moisture Capacity Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Isothermal Moisture Capacity Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Isothermal Moisture Capacity Measurevalue</em>' attribute.
	 * @see #isSetIfcIsothermalMoistureCapacityMeasurevalue()
	 * @see #unsetIfcIsothermalMoistureCapacityMeasurevalue()
	 * @see #setIfcIsothermalMoistureCapacityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcIsothermalMoistureCapacityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcIsothermalMoistureCapacityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcIsothermalMoistureCapacityMeasurevalue <em>Ifc Isothermal Moisture Capacity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Isothermal Moisture Capacity Measurevalue</em>' attribute.
	 * @see #isSetIfcIsothermalMoistureCapacityMeasurevalue()
	 * @see #unsetIfcIsothermalMoistureCapacityMeasurevalue()
	 * @see #getIfcIsothermalMoistureCapacityMeasurevalue()
	 * @generated
	 */
	void setIfcIsothermalMoistureCapacityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcIsothermalMoistureCapacityMeasurevalue <em>Ifc Isothermal Moisture Capacity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcIsothermalMoistureCapacityMeasurevalue()
	 * @see #getIfcIsothermalMoistureCapacityMeasurevalue()
	 * @see #setIfcIsothermalMoistureCapacityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcIsothermalMoistureCapacityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcIsothermalMoistureCapacityMeasurevalue <em>Ifc Isothermal Moisture Capacity Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Isothermal Moisture Capacity Measurevalue</em>' attribute is set.
	 * @see #unsetIfcIsothermalMoistureCapacityMeasurevalue()
	 * @see #getIfcIsothermalMoistureCapacityMeasurevalue()
	 * @see #setIfcIsothermalMoistureCapacityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcIsothermalMoistureCapacityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Moisture Diffusivity Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Moisture Diffusivity Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Moisture Diffusivity Measurevalue</em>' attribute.
	 * @see #isSetIfcMoistureDiffusivityMeasurevalue()
	 * @see #unsetIfcMoistureDiffusivityMeasurevalue()
	 * @see #setIfcMoistureDiffusivityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcMoistureDiffusivityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcMoistureDiffusivityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMoistureDiffusivityMeasurevalue <em>Ifc Moisture Diffusivity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Moisture Diffusivity Measurevalue</em>' attribute.
	 * @see #isSetIfcMoistureDiffusivityMeasurevalue()
	 * @see #unsetIfcMoistureDiffusivityMeasurevalue()
	 * @see #getIfcMoistureDiffusivityMeasurevalue()
	 * @generated
	 */
	void setIfcMoistureDiffusivityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMoistureDiffusivityMeasurevalue <em>Ifc Moisture Diffusivity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcMoistureDiffusivityMeasurevalue()
	 * @see #getIfcMoistureDiffusivityMeasurevalue()
	 * @see #setIfcMoistureDiffusivityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcMoistureDiffusivityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMoistureDiffusivityMeasurevalue <em>Ifc Moisture Diffusivity Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Moisture Diffusivity Measurevalue</em>' attribute is set.
	 * @see #unsetIfcMoistureDiffusivityMeasurevalue()
	 * @see #getIfcMoistureDiffusivityMeasurevalue()
	 * @see #setIfcMoistureDiffusivityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcMoistureDiffusivityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Vapor Permeability Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Vapor Permeability Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Vapor Permeability Measurevalue</em>' attribute.
	 * @see #isSetIfcVaporPermeabilityMeasurevalue()
	 * @see #unsetIfcVaporPermeabilityMeasurevalue()
	 * @see #setIfcVaporPermeabilityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcVaporPermeabilityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcVaporPermeabilityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcVaporPermeabilityMeasurevalue <em>Ifc Vapor Permeability Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Vapor Permeability Measurevalue</em>' attribute.
	 * @see #isSetIfcVaporPermeabilityMeasurevalue()
	 * @see #unsetIfcVaporPermeabilityMeasurevalue()
	 * @see #getIfcVaporPermeabilityMeasurevalue()
	 * @generated
	 */
	void setIfcVaporPermeabilityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcVaporPermeabilityMeasurevalue <em>Ifc Vapor Permeability Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcVaporPermeabilityMeasurevalue()
	 * @see #getIfcVaporPermeabilityMeasurevalue()
	 * @see #setIfcVaporPermeabilityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcVaporPermeabilityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcVaporPermeabilityMeasurevalue <em>Ifc Vapor Permeability Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Vapor Permeability Measurevalue</em>' attribute is set.
	 * @see #unsetIfcVaporPermeabilityMeasurevalue()
	 * @see #getIfcVaporPermeabilityMeasurevalue()
	 * @see #setIfcVaporPermeabilityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcVaporPermeabilityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Molecular Weight Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Molecular Weight Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Molecular Weight Measurevalue</em>' attribute.
	 * @see #isSetIfcMolecularWeightMeasurevalue()
	 * @see #unsetIfcMolecularWeightMeasurevalue()
	 * @see #setIfcMolecularWeightMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcMolecularWeightMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcMolecularWeightMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMolecularWeightMeasurevalue <em>Ifc Molecular Weight Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Molecular Weight Measurevalue</em>' attribute.
	 * @see #isSetIfcMolecularWeightMeasurevalue()
	 * @see #unsetIfcMolecularWeightMeasurevalue()
	 * @see #getIfcMolecularWeightMeasurevalue()
	 * @generated
	 */
	void setIfcMolecularWeightMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMolecularWeightMeasurevalue <em>Ifc Molecular Weight Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcMolecularWeightMeasurevalue()
	 * @see #getIfcMolecularWeightMeasurevalue()
	 * @see #setIfcMolecularWeightMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcMolecularWeightMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMolecularWeightMeasurevalue <em>Ifc Molecular Weight Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Molecular Weight Measurevalue</em>' attribute is set.
	 * @see #unsetIfcMolecularWeightMeasurevalue()
	 * @see #getIfcMolecularWeightMeasurevalue()
	 * @see #setIfcMolecularWeightMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcMolecularWeightMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Thermal Conductivity Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Thermal Conductivity Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Thermal Conductivity Measurevalue</em>' attribute.
	 * @see #isSetIfcThermalConductivityMeasurevalue()
	 * @see #unsetIfcThermalConductivityMeasurevalue()
	 * @see #setIfcThermalConductivityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcThermalConductivityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcThermalConductivityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalConductivityMeasurevalue <em>Ifc Thermal Conductivity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Thermal Conductivity Measurevalue</em>' attribute.
	 * @see #isSetIfcThermalConductivityMeasurevalue()
	 * @see #unsetIfcThermalConductivityMeasurevalue()
	 * @see #getIfcThermalConductivityMeasurevalue()
	 * @generated
	 */
	void setIfcThermalConductivityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalConductivityMeasurevalue <em>Ifc Thermal Conductivity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcThermalConductivityMeasurevalue()
	 * @see #getIfcThermalConductivityMeasurevalue()
	 * @see #setIfcThermalConductivityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcThermalConductivityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalConductivityMeasurevalue <em>Ifc Thermal Conductivity Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Thermal Conductivity Measurevalue</em>' attribute is set.
	 * @see #unsetIfcThermalConductivityMeasurevalue()
	 * @see #getIfcThermalConductivityMeasurevalue()
	 * @see #setIfcThermalConductivityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcThermalConductivityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Angular Velocity Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Angular Velocity Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Angular Velocity Measurevalue</em>' attribute.
	 * @see #isSetIfcAngularVelocityMeasurevalue()
	 * @see #unsetIfcAngularVelocityMeasurevalue()
	 * @see #setIfcAngularVelocityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcAngularVelocityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcAngularVelocityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcAngularVelocityMeasurevalue <em>Ifc Angular Velocity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Angular Velocity Measurevalue</em>' attribute.
	 * @see #isSetIfcAngularVelocityMeasurevalue()
	 * @see #unsetIfcAngularVelocityMeasurevalue()
	 * @see #getIfcAngularVelocityMeasurevalue()
	 * @generated
	 */
	void setIfcAngularVelocityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcAngularVelocityMeasurevalue <em>Ifc Angular Velocity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcAngularVelocityMeasurevalue()
	 * @see #getIfcAngularVelocityMeasurevalue()
	 * @see #setIfcAngularVelocityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcAngularVelocityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcAngularVelocityMeasurevalue <em>Ifc Angular Velocity Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Angular Velocity Measurevalue</em>' attribute is set.
	 * @see #unsetIfcAngularVelocityMeasurevalue()
	 * @see #getIfcAngularVelocityMeasurevalue()
	 * @see #setIfcAngularVelocityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcAngularVelocityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Dynamic Viscosity Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Dynamic Viscosity Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Dynamic Viscosity Measurevalue</em>' attribute.
	 * @see #isSetIfcDynamicViscosityMeasurevalue()
	 * @see #unsetIfcDynamicViscosityMeasurevalue()
	 * @see #setIfcDynamicViscosityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcDynamicViscosityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcDynamicViscosityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcDynamicViscosityMeasurevalue <em>Ifc Dynamic Viscosity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Dynamic Viscosity Measurevalue</em>' attribute.
	 * @see #isSetIfcDynamicViscosityMeasurevalue()
	 * @see #unsetIfcDynamicViscosityMeasurevalue()
	 * @see #getIfcDynamicViscosityMeasurevalue()
	 * @generated
	 */
	void setIfcDynamicViscosityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcDynamicViscosityMeasurevalue <em>Ifc Dynamic Viscosity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcDynamicViscosityMeasurevalue()
	 * @see #getIfcDynamicViscosityMeasurevalue()
	 * @see #setIfcDynamicViscosityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcDynamicViscosityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcDynamicViscosityMeasurevalue <em>Ifc Dynamic Viscosity Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Dynamic Viscosity Measurevalue</em>' attribute is set.
	 * @see #unsetIfcDynamicViscosityMeasurevalue()
	 * @see #getIfcDynamicViscosityMeasurevalue()
	 * @see #setIfcDynamicViscosityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcDynamicViscosityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Electric Voltage Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Electric Voltage Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Electric Voltage Measurevalue</em>' attribute.
	 * @see #isSetIfcElectricVoltageMeasurevalue()
	 * @see #unsetIfcElectricVoltageMeasurevalue()
	 * @see #setIfcElectricVoltageMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcElectricVoltageMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcElectricVoltageMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricVoltageMeasurevalue <em>Ifc Electric Voltage Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Electric Voltage Measurevalue</em>' attribute.
	 * @see #isSetIfcElectricVoltageMeasurevalue()
	 * @see #unsetIfcElectricVoltageMeasurevalue()
	 * @see #getIfcElectricVoltageMeasurevalue()
	 * @generated
	 */
	void setIfcElectricVoltageMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricVoltageMeasurevalue <em>Ifc Electric Voltage Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcElectricVoltageMeasurevalue()
	 * @see #getIfcElectricVoltageMeasurevalue()
	 * @see #setIfcElectricVoltageMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcElectricVoltageMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcElectricVoltageMeasurevalue <em>Ifc Electric Voltage Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Electric Voltage Measurevalue</em>' attribute is set.
	 * @see #unsetIfcElectricVoltageMeasurevalue()
	 * @see #getIfcElectricVoltageMeasurevalue()
	 * @see #setIfcElectricVoltageMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcElectricVoltageMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Energy Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Energy Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Energy Measurevalue</em>' attribute.
	 * @see #isSetIfcEnergyMeasurevalue()
	 * @see #unsetIfcEnergyMeasurevalue()
	 * @see #setIfcEnergyMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcEnergyMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcEnergyMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcEnergyMeasurevalue <em>Ifc Energy Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Energy Measurevalue</em>' attribute.
	 * @see #isSetIfcEnergyMeasurevalue()
	 * @see #unsetIfcEnergyMeasurevalue()
	 * @see #getIfcEnergyMeasurevalue()
	 * @generated
	 */
	void setIfcEnergyMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcEnergyMeasurevalue <em>Ifc Energy Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcEnergyMeasurevalue()
	 * @see #getIfcEnergyMeasurevalue()
	 * @see #setIfcEnergyMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcEnergyMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcEnergyMeasurevalue <em>Ifc Energy Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Energy Measurevalue</em>' attribute is set.
	 * @see #unsetIfcEnergyMeasurevalue()
	 * @see #getIfcEnergyMeasurevalue()
	 * @see #setIfcEnergyMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcEnergyMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Frequency Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Frequency Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Frequency Measurevalue</em>' attribute.
	 * @see #isSetIfcFrequencyMeasurevalue()
	 * @see #unsetIfcFrequencyMeasurevalue()
	 * @see #setIfcFrequencyMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcFrequencyMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcFrequencyMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcFrequencyMeasurevalue <em>Ifc Frequency Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Frequency Measurevalue</em>' attribute.
	 * @see #isSetIfcFrequencyMeasurevalue()
	 * @see #unsetIfcFrequencyMeasurevalue()
	 * @see #getIfcFrequencyMeasurevalue()
	 * @generated
	 */
	void setIfcFrequencyMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcFrequencyMeasurevalue <em>Ifc Frequency Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcFrequencyMeasurevalue()
	 * @see #getIfcFrequencyMeasurevalue()
	 * @see #setIfcFrequencyMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcFrequencyMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcFrequencyMeasurevalue <em>Ifc Frequency Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Frequency Measurevalue</em>' attribute is set.
	 * @see #unsetIfcFrequencyMeasurevalue()
	 * @see #getIfcFrequencyMeasurevalue()
	 * @see #setIfcFrequencyMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcFrequencyMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Heat Flux Density Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Heat Flux Density Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Heat Flux Density Measurevalue</em>' attribute.
	 * @see #isSetIfcHeatFluxDensityMeasurevalue()
	 * @see #unsetIfcHeatFluxDensityMeasurevalue()
	 * @see #setIfcHeatFluxDensityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcHeatFluxDensityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcHeatFluxDensityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcHeatFluxDensityMeasurevalue <em>Ifc Heat Flux Density Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Heat Flux Density Measurevalue</em>' attribute.
	 * @see #isSetIfcHeatFluxDensityMeasurevalue()
	 * @see #unsetIfcHeatFluxDensityMeasurevalue()
	 * @see #getIfcHeatFluxDensityMeasurevalue()
	 * @generated
	 */
	void setIfcHeatFluxDensityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcHeatFluxDensityMeasurevalue <em>Ifc Heat Flux Density Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcHeatFluxDensityMeasurevalue()
	 * @see #getIfcHeatFluxDensityMeasurevalue()
	 * @see #setIfcHeatFluxDensityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcHeatFluxDensityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcHeatFluxDensityMeasurevalue <em>Ifc Heat Flux Density Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Heat Flux Density Measurevalue</em>' attribute is set.
	 * @see #unsetIfcHeatFluxDensityMeasurevalue()
	 * @see #getIfcHeatFluxDensityMeasurevalue()
	 * @see #setIfcHeatFluxDensityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcHeatFluxDensityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Integer Count Rate Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Integer Count Rate Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Integer Count Rate Measurevalue</em>' attribute.
	 * @see #isSetIfcIntegerCountRateMeasurevalue()
	 * @see #unsetIfcIntegerCountRateMeasurevalue()
	 * @see #setIfcIntegerCountRateMeasurevalue(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcIntegerCountRateMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER"
	 * @generated
	 */
	Integer getIfcIntegerCountRateMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcIntegerCountRateMeasurevalue <em>Ifc Integer Count Rate Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Integer Count Rate Measurevalue</em>' attribute.
	 * @see #isSetIfcIntegerCountRateMeasurevalue()
	 * @see #unsetIfcIntegerCountRateMeasurevalue()
	 * @see #getIfcIntegerCountRateMeasurevalue()
	 * @generated
	 */
	void setIfcIntegerCountRateMeasurevalue(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcIntegerCountRateMeasurevalue <em>Ifc Integer Count Rate Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcIntegerCountRateMeasurevalue()
	 * @see #getIfcIntegerCountRateMeasurevalue()
	 * @see #setIfcIntegerCountRateMeasurevalue(Integer)
	 * @generated
	 */
	void unsetIfcIntegerCountRateMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcIntegerCountRateMeasurevalue <em>Ifc Integer Count Rate Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Integer Count Rate Measurevalue</em>' attribute is set.
	 * @see #unsetIfcIntegerCountRateMeasurevalue()
	 * @see #getIfcIntegerCountRateMeasurevalue()
	 * @see #setIfcIntegerCountRateMeasurevalue(Integer)
	 * @generated
	 */
	boolean isSetIfcIntegerCountRateMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Kinematic Viscosity Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Kinematic Viscosity Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Kinematic Viscosity Measurevalue</em>' attribute.
	 * @see #isSetIfcKinematicViscosityMeasurevalue()
	 * @see #unsetIfcKinematicViscosityMeasurevalue()
	 * @see #setIfcKinematicViscosityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcKinematicViscosityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcKinematicViscosityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcKinematicViscosityMeasurevalue <em>Ifc Kinematic Viscosity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Kinematic Viscosity Measurevalue</em>' attribute.
	 * @see #isSetIfcKinematicViscosityMeasurevalue()
	 * @see #unsetIfcKinematicViscosityMeasurevalue()
	 * @see #getIfcKinematicViscosityMeasurevalue()
	 * @generated
	 */
	void setIfcKinematicViscosityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcKinematicViscosityMeasurevalue <em>Ifc Kinematic Viscosity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcKinematicViscosityMeasurevalue()
	 * @see #getIfcKinematicViscosityMeasurevalue()
	 * @see #setIfcKinematicViscosityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcKinematicViscosityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcKinematicViscosityMeasurevalue <em>Ifc Kinematic Viscosity Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Kinematic Viscosity Measurevalue</em>' attribute is set.
	 * @see #unsetIfcKinematicViscosityMeasurevalue()
	 * @see #getIfcKinematicViscosityMeasurevalue()
	 * @see #setIfcKinematicViscosityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcKinematicViscosityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Linear Velocity Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Linear Velocity Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Linear Velocity Measurevalue</em>' attribute.
	 * @see #isSetIfcLinearVelocityMeasurevalue()
	 * @see #unsetIfcLinearVelocityMeasurevalue()
	 * @see #setIfcLinearVelocityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcLinearVelocityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcLinearVelocityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearVelocityMeasurevalue <em>Ifc Linear Velocity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Linear Velocity Measurevalue</em>' attribute.
	 * @see #isSetIfcLinearVelocityMeasurevalue()
	 * @see #unsetIfcLinearVelocityMeasurevalue()
	 * @see #getIfcLinearVelocityMeasurevalue()
	 * @generated
	 */
	void setIfcLinearVelocityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearVelocityMeasurevalue <em>Ifc Linear Velocity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcLinearVelocityMeasurevalue()
	 * @see #getIfcLinearVelocityMeasurevalue()
	 * @see #setIfcLinearVelocityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcLinearVelocityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcLinearVelocityMeasurevalue <em>Ifc Linear Velocity Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Linear Velocity Measurevalue</em>' attribute is set.
	 * @see #unsetIfcLinearVelocityMeasurevalue()
	 * @see #getIfcLinearVelocityMeasurevalue()
	 * @see #setIfcLinearVelocityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcLinearVelocityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Mass Density Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Mass Density Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Mass Density Measurevalue</em>' attribute.
	 * @see #isSetIfcMassDensityMeasurevalue()
	 * @see #unsetIfcMassDensityMeasurevalue()
	 * @see #setIfcMassDensityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcMassDensityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcMassDensityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMassDensityMeasurevalue <em>Ifc Mass Density Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Mass Density Measurevalue</em>' attribute.
	 * @see #isSetIfcMassDensityMeasurevalue()
	 * @see #unsetIfcMassDensityMeasurevalue()
	 * @see #getIfcMassDensityMeasurevalue()
	 * @generated
	 */
	void setIfcMassDensityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMassDensityMeasurevalue <em>Ifc Mass Density Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcMassDensityMeasurevalue()
	 * @see #getIfcMassDensityMeasurevalue()
	 * @see #setIfcMassDensityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcMassDensityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMassDensityMeasurevalue <em>Ifc Mass Density Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Mass Density Measurevalue</em>' attribute is set.
	 * @see #unsetIfcMassDensityMeasurevalue()
	 * @see #getIfcMassDensityMeasurevalue()
	 * @see #setIfcMassDensityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcMassDensityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Mass Flow Rate Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Mass Flow Rate Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Mass Flow Rate Measurevalue</em>' attribute.
	 * @see #isSetIfcMassFlowRateMeasurevalue()
	 * @see #unsetIfcMassFlowRateMeasurevalue()
	 * @see #setIfcMassFlowRateMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcMassFlowRateMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcMassFlowRateMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMassFlowRateMeasurevalue <em>Ifc Mass Flow Rate Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Mass Flow Rate Measurevalue</em>' attribute.
	 * @see #isSetIfcMassFlowRateMeasurevalue()
	 * @see #unsetIfcMassFlowRateMeasurevalue()
	 * @see #getIfcMassFlowRateMeasurevalue()
	 * @generated
	 */
	void setIfcMassFlowRateMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMassFlowRateMeasurevalue <em>Ifc Mass Flow Rate Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcMassFlowRateMeasurevalue()
	 * @see #getIfcMassFlowRateMeasurevalue()
	 * @see #setIfcMassFlowRateMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcMassFlowRateMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcMassFlowRateMeasurevalue <em>Ifc Mass Flow Rate Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Mass Flow Rate Measurevalue</em>' attribute is set.
	 * @see #unsetIfcMassFlowRateMeasurevalue()
	 * @see #getIfcMassFlowRateMeasurevalue()
	 * @see #setIfcMassFlowRateMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcMassFlowRateMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Power Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Power Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Power Measurevalue</em>' attribute.
	 * @see #isSetIfcPowerMeasurevalue()
	 * @see #unsetIfcPowerMeasurevalue()
	 * @see #setIfcPowerMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcPowerMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcPowerMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcPowerMeasurevalue <em>Ifc Power Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Power Measurevalue</em>' attribute.
	 * @see #isSetIfcPowerMeasurevalue()
	 * @see #unsetIfcPowerMeasurevalue()
	 * @see #getIfcPowerMeasurevalue()
	 * @generated
	 */
	void setIfcPowerMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcPowerMeasurevalue <em>Ifc Power Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcPowerMeasurevalue()
	 * @see #getIfcPowerMeasurevalue()
	 * @see #setIfcPowerMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcPowerMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcPowerMeasurevalue <em>Ifc Power Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Power Measurevalue</em>' attribute is set.
	 * @see #unsetIfcPowerMeasurevalue()
	 * @see #getIfcPowerMeasurevalue()
	 * @see #setIfcPowerMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcPowerMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Pressure Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Pressure Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Pressure Measurevalue</em>' attribute.
	 * @see #isSetIfcPressureMeasurevalue()
	 * @see #unsetIfcPressureMeasurevalue()
	 * @see #setIfcPressureMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcPressureMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcPressureMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcPressureMeasurevalue <em>Ifc Pressure Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Pressure Measurevalue</em>' attribute.
	 * @see #isSetIfcPressureMeasurevalue()
	 * @see #unsetIfcPressureMeasurevalue()
	 * @see #getIfcPressureMeasurevalue()
	 * @generated
	 */
	void setIfcPressureMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcPressureMeasurevalue <em>Ifc Pressure Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcPressureMeasurevalue()
	 * @see #getIfcPressureMeasurevalue()
	 * @see #setIfcPressureMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcPressureMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcPressureMeasurevalue <em>Ifc Pressure Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Pressure Measurevalue</em>' attribute is set.
	 * @see #unsetIfcPressureMeasurevalue()
	 * @see #getIfcPressureMeasurevalue()
	 * @see #setIfcPressureMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcPressureMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Thermal Admittance Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Thermal Admittance Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Thermal Admittance Measurevalue</em>' attribute.
	 * @see #isSetIfcThermalAdmittanceMeasurevalue()
	 * @see #unsetIfcThermalAdmittanceMeasurevalue()
	 * @see #setIfcThermalAdmittanceMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcThermalAdmittanceMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcThermalAdmittanceMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalAdmittanceMeasurevalue <em>Ifc Thermal Admittance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Thermal Admittance Measurevalue</em>' attribute.
	 * @see #isSetIfcThermalAdmittanceMeasurevalue()
	 * @see #unsetIfcThermalAdmittanceMeasurevalue()
	 * @see #getIfcThermalAdmittanceMeasurevalue()
	 * @generated
	 */
	void setIfcThermalAdmittanceMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalAdmittanceMeasurevalue <em>Ifc Thermal Admittance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcThermalAdmittanceMeasurevalue()
	 * @see #getIfcThermalAdmittanceMeasurevalue()
	 * @see #setIfcThermalAdmittanceMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcThermalAdmittanceMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalAdmittanceMeasurevalue <em>Ifc Thermal Admittance Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Thermal Admittance Measurevalue</em>' attribute is set.
	 * @see #unsetIfcThermalAdmittanceMeasurevalue()
	 * @see #getIfcThermalAdmittanceMeasurevalue()
	 * @see #setIfcThermalAdmittanceMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcThermalAdmittanceMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Thermal Resistance Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Thermal Resistance Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Thermal Resistance Measurevalue</em>' attribute.
	 * @see #isSetIfcThermalResistanceMeasurevalue()
	 * @see #unsetIfcThermalResistanceMeasurevalue()
	 * @see #setIfcThermalResistanceMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcThermalResistanceMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcThermalResistanceMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalResistanceMeasurevalue <em>Ifc Thermal Resistance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Thermal Resistance Measurevalue</em>' attribute.
	 * @see #isSetIfcThermalResistanceMeasurevalue()
	 * @see #unsetIfcThermalResistanceMeasurevalue()
	 * @see #getIfcThermalResistanceMeasurevalue()
	 * @generated
	 */
	void setIfcThermalResistanceMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalResistanceMeasurevalue <em>Ifc Thermal Resistance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcThermalResistanceMeasurevalue()
	 * @see #getIfcThermalResistanceMeasurevalue()
	 * @see #setIfcThermalResistanceMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcThermalResistanceMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalResistanceMeasurevalue <em>Ifc Thermal Resistance Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Thermal Resistance Measurevalue</em>' attribute is set.
	 * @see #unsetIfcThermalResistanceMeasurevalue()
	 * @see #getIfcThermalResistanceMeasurevalue()
	 * @see #setIfcThermalResistanceMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcThermalResistanceMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Thermal Transmittance Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Thermal Transmittance Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Thermal Transmittance Measurevalue</em>' attribute.
	 * @see #isSetIfcThermalTransmittanceMeasurevalue()
	 * @see #unsetIfcThermalTransmittanceMeasurevalue()
	 * @see #setIfcThermalTransmittanceMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcThermalTransmittanceMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcThermalTransmittanceMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalTransmittanceMeasurevalue <em>Ifc Thermal Transmittance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Thermal Transmittance Measurevalue</em>' attribute.
	 * @see #isSetIfcThermalTransmittanceMeasurevalue()
	 * @see #unsetIfcThermalTransmittanceMeasurevalue()
	 * @see #getIfcThermalTransmittanceMeasurevalue()
	 * @generated
	 */
	void setIfcThermalTransmittanceMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalTransmittanceMeasurevalue <em>Ifc Thermal Transmittance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcThermalTransmittanceMeasurevalue()
	 * @see #getIfcThermalTransmittanceMeasurevalue()
	 * @see #setIfcThermalTransmittanceMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcThermalTransmittanceMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcThermalTransmittanceMeasurevalue <em>Ifc Thermal Transmittance Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Thermal Transmittance Measurevalue</em>' attribute is set.
	 * @see #unsetIfcThermalTransmittanceMeasurevalue()
	 * @see #getIfcThermalTransmittanceMeasurevalue()
	 * @see #setIfcThermalTransmittanceMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcThermalTransmittanceMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Time Stampvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Time Stampvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Time Stampvalue</em>' attribute.
	 * @see #isSetIfcTimeStampvalue()
	 * @see #unsetIfcTimeStampvalue()
	 * @see #setIfcTimeStampvalue(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcTimeStampvalue()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER"
	 * @generated
	 */
	Integer getIfcTimeStampvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcTimeStampvalue <em>Ifc Time Stampvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Time Stampvalue</em>' attribute.
	 * @see #isSetIfcTimeStampvalue()
	 * @see #unsetIfcTimeStampvalue()
	 * @see #getIfcTimeStampvalue()
	 * @generated
	 */
	void setIfcTimeStampvalue(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcTimeStampvalue <em>Ifc Time Stampvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcTimeStampvalue()
	 * @see #getIfcTimeStampvalue()
	 * @see #setIfcTimeStampvalue(Integer)
	 * @generated
	 */
	void unsetIfcTimeStampvalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcTimeStampvalue <em>Ifc Time Stampvalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Time Stampvalue</em>' attribute is set.
	 * @see #unsetIfcTimeStampvalue()
	 * @see #getIfcTimeStampvalue()
	 * @see #setIfcTimeStampvalue(Integer)
	 * @generated
	 */
	boolean isSetIfcTimeStampvalue();

	/**
	 * Returns the value of the '<em><b>Ifc Volumetric Flow Rate Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Volumetric Flow Rate Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Volumetric Flow Rate Measurevalue</em>' attribute.
	 * @see #isSetIfcVolumetricFlowRateMeasurevalue()
	 * @see #unsetIfcVolumetricFlowRateMeasurevalue()
	 * @see #setIfcVolumetricFlowRateMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedMeasureValue_IfcVolumetricFlowRateMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcVolumetricFlowRateMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcVolumetricFlowRateMeasurevalue <em>Ifc Volumetric Flow Rate Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Volumetric Flow Rate Measurevalue</em>' attribute.
	 * @see #isSetIfcVolumetricFlowRateMeasurevalue()
	 * @see #unsetIfcVolumetricFlowRateMeasurevalue()
	 * @see #getIfcVolumetricFlowRateMeasurevalue()
	 * @generated
	 */
	void setIfcVolumetricFlowRateMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcVolumetricFlowRateMeasurevalue <em>Ifc Volumetric Flow Rate Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcVolumetricFlowRateMeasurevalue()
	 * @see #getIfcVolumetricFlowRateMeasurevalue()
	 * @see #setIfcVolumetricFlowRateMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcVolumetricFlowRateMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedMeasureValue#getIfcVolumetricFlowRateMeasurevalue <em>Ifc Volumetric Flow Rate Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Volumetric Flow Rate Measurevalue</em>' attribute is set.
	 * @see #unsetIfcVolumetricFlowRateMeasurevalue()
	 * @see #getIfcVolumetricFlowRateMeasurevalue()
	 * @see #setIfcVolumetricFlowRateMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcVolumetricFlowRateMeasurevalue();

} // IfcDerivedMeasureValue
