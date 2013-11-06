/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcDerivedMeasureValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Derived Measure Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcIonConcentrationMeasurevalue <em>Ifc Ion Concentration Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcPHMeasurevalue <em>Ifc PH Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcHeatingValueMeasurevalue <em>Ifc Heating Value Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcSoundPressureMeasurevalue <em>Ifc Sound Pressure Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcSoundPowerMeasurevalue <em>Ifc Sound Power Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcWarpingMomentMeasurevalue <em>Ifc Warping Moment Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcWarpingConstantMeasurevalue <em>Ifc Warping Constant Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcThermalExpansionCoefficientMeasurevalue <em>Ifc Thermal Expansion Coefficient Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcTemperatureGradientMeasurevalue <em>Ifc Temperature Gradient Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcSectionModulusMeasurevalue <em>Ifc Section Modulus Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcSectionalAreaIntegralMeasurevalue <em>Ifc Sectional Area Integral Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcRotationalMassMeasurevalue <em>Ifc Rotational Mass Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcModulusOfRotationalSubgradeReactionMeasurevalue <em>Ifc Modulus Of Rotational Subgrade Reaction Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcModulusOfLinearSubgradeReactionMeasurevalue <em>Ifc Modulus Of Linear Subgrade Reaction Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcMassPerLengthMeasurevalue <em>Ifc Mass Per Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcCurvatureMeasurevalue <em>Ifc Curvature Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcLuminousIntensityDistributionMeasurevalue <em>Ifc Luminous Intensity Distribution Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcLinearMomentMeasurevalue <em>Ifc Linear Moment Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcShearModulusMeasurevalue <em>Ifc Shear Modulus Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcRotationalStiffnessMeasurevalue <em>Ifc Rotational Stiffness Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcPlanarForceMeasurevalue <em>Ifc Planar Force Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcMomentOfInertiaMeasurevalue <em>Ifc Moment Of Inertia Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcModulusOfElasticityMeasurevalue <em>Ifc Modulus Of Elasticity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcModulusOfSubgradeReactionMeasurevalue <em>Ifc Modulus Of Subgrade Reaction Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcLinearStiffnessMeasurevalue <em>Ifc Linear Stiffness Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcLinearForceMeasurevalue <em>Ifc Linear Force Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcAccelerationMeasurevalue <em>Ifc Acceleration Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcTorqueMeasurevalue <em>Ifc Torque Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcRotationalFrequencyMeasurevalue <em>Ifc Rotational Frequency Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcRadioActivityMeasurevalue <em>Ifc Radio Activity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcAbsorbedDoseMeasurevalue <em>Ifc Absorbed Dose Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcElectricCapacitanceMeasurevalue <em>Ifc Electric Capacitance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcDoseEquivalentMeasurevalue <em>Ifc Dose Equivalent Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcElectricChargeMeasurevalue <em>Ifc Electric Charge Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcElectricConductanceMeasurevalue <em>Ifc Electric Conductance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcElectricResistanceMeasurevalue <em>Ifc Electric Resistance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcIlluminanceMeasurevalue <em>Ifc Illuminance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcInductanceMeasurevalue <em>Ifc Inductance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcForceMeasurevalue <em>Ifc Force Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcLuminousFluxMeasurevalue <em>Ifc Luminous Flux Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcMagneticFluxMeasurevalue <em>Ifc Magnetic Flux Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcMagneticFluxDensityMeasurevalue <em>Ifc Magnetic Flux Density Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcMonetaryMeasurevalue <em>Ifc Monetary Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcSpecificHeatCapacityMeasurevalue <em>Ifc Specific Heat Capacity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcIsothermalMoistureCapacityMeasurevalue <em>Ifc Isothermal Moisture Capacity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcMoistureDiffusivityMeasurevalue <em>Ifc Moisture Diffusivity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcVaporPermeabilityMeasurevalue <em>Ifc Vapor Permeability Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcMolecularWeightMeasurevalue <em>Ifc Molecular Weight Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcThermalConductivityMeasurevalue <em>Ifc Thermal Conductivity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcAngularVelocityMeasurevalue <em>Ifc Angular Velocity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcDynamicViscosityMeasurevalue <em>Ifc Dynamic Viscosity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcElectricVoltageMeasurevalue <em>Ifc Electric Voltage Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcEnergyMeasurevalue <em>Ifc Energy Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcFrequencyMeasurevalue <em>Ifc Frequency Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcHeatFluxDensityMeasurevalue <em>Ifc Heat Flux Density Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcIntegerCountRateMeasurevalue <em>Ifc Integer Count Rate Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcKinematicViscosityMeasurevalue <em>Ifc Kinematic Viscosity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcLinearVelocityMeasurevalue <em>Ifc Linear Velocity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcMassDensityMeasurevalue <em>Ifc Mass Density Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcMassFlowRateMeasurevalue <em>Ifc Mass Flow Rate Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcPowerMeasurevalue <em>Ifc Power Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcPressureMeasurevalue <em>Ifc Pressure Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcThermalAdmittanceMeasurevalue <em>Ifc Thermal Admittance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcThermalResistanceMeasurevalue <em>Ifc Thermal Resistance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcThermalTransmittanceMeasurevalue <em>Ifc Thermal Transmittance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcTimeStampvalue <em>Ifc Time Stampvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedMeasureValueImpl#getIfcVolumetricFlowRateMeasurevalue <em>Ifc Volumetric Flow Rate Measurevalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDerivedMeasureValue")
@XmlRootElement(name = "IfcDerivedMeasureValueElement")
public class IfcDerivedMeasureValueImpl extends CDOObjectImpl implements IfcDerivedMeasureValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDerivedMeasureValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcIonConcentrationMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIonConcentrationMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIonConcentrationMeasurevalue(Double newIfcIonConcentrationMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIonConcentrationMeasurevalue(), newIfcIonConcentrationMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcIonConcentrationMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIonConcentrationMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcIonConcentrationMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIonConcentrationMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPHMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPHMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPHMeasurevalue(Double newIfcPHMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPHMeasurevalue(), newIfcPHMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPHMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPHMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPHMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPHMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcHeatingValueMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcHeatingValueMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcHeatingValueMeasurevalue(Double newIfcHeatingValueMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcHeatingValueMeasurevalue(), newIfcHeatingValueMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcHeatingValueMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcHeatingValueMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcHeatingValueMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcHeatingValueMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSoundPressureMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSoundPressureMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSoundPressureMeasurevalue(Double newIfcSoundPressureMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSoundPressureMeasurevalue(), newIfcSoundPressureMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSoundPressureMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSoundPressureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSoundPressureMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSoundPressureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSoundPowerMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSoundPowerMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSoundPowerMeasurevalue(Double newIfcSoundPowerMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSoundPowerMeasurevalue(), newIfcSoundPowerMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSoundPowerMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSoundPowerMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSoundPowerMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSoundPowerMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcWarpingMomentMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcWarpingMomentMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcWarpingMomentMeasurevalue(Double newIfcWarpingMomentMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcWarpingMomentMeasurevalue(), newIfcWarpingMomentMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcWarpingMomentMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcWarpingMomentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcWarpingMomentMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcWarpingMomentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcWarpingConstantMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcWarpingConstantMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcWarpingConstantMeasurevalue(Double newIfcWarpingConstantMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcWarpingConstantMeasurevalue(), newIfcWarpingConstantMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcWarpingConstantMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcWarpingConstantMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcWarpingConstantMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcWarpingConstantMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcThermalExpansionCoefficientMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalExpansionCoefficientMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalExpansionCoefficientMeasurevalue(Double newIfcThermalExpansionCoefficientMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalExpansionCoefficientMeasurevalue(), newIfcThermalExpansionCoefficientMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcThermalExpansionCoefficientMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalExpansionCoefficientMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcThermalExpansionCoefficientMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalExpansionCoefficientMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcTemperatureGradientMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcTemperatureGradientMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTemperatureGradientMeasurevalue(Double newIfcTemperatureGradientMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcTemperatureGradientMeasurevalue(), newIfcTemperatureGradientMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcTemperatureGradientMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcTemperatureGradientMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcTemperatureGradientMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcTemperatureGradientMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSectionModulusMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSectionModulusMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSectionModulusMeasurevalue(Double newIfcSectionModulusMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSectionModulusMeasurevalue(), newIfcSectionModulusMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSectionModulusMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSectionModulusMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSectionModulusMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSectionModulusMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSectionalAreaIntegralMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSectionalAreaIntegralMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSectionalAreaIntegralMeasurevalue(Double newIfcSectionalAreaIntegralMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSectionalAreaIntegralMeasurevalue(), newIfcSectionalAreaIntegralMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSectionalAreaIntegralMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSectionalAreaIntegralMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSectionalAreaIntegralMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSectionalAreaIntegralMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRotationalMassMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRotationalMassMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRotationalMassMeasurevalue(Double newIfcRotationalMassMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRotationalMassMeasurevalue(), newIfcRotationalMassMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRotationalMassMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRotationalMassMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRotationalMassMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRotationalMassMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcModulusOfRotationalSubgradeReactionMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfRotationalSubgradeReactionMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcModulusOfRotationalSubgradeReactionMeasurevalue(Double newIfcModulusOfRotationalSubgradeReactionMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfRotationalSubgradeReactionMeasurevalue(), newIfcModulusOfRotationalSubgradeReactionMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcModulusOfRotationalSubgradeReactionMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfRotationalSubgradeReactionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcModulusOfRotationalSubgradeReactionMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfRotationalSubgradeReactionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcModulusOfLinearSubgradeReactionMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfLinearSubgradeReactionMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcModulusOfLinearSubgradeReactionMeasurevalue(Double newIfcModulusOfLinearSubgradeReactionMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfLinearSubgradeReactionMeasurevalue(), newIfcModulusOfLinearSubgradeReactionMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcModulusOfLinearSubgradeReactionMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfLinearSubgradeReactionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcModulusOfLinearSubgradeReactionMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfLinearSubgradeReactionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMassPerLengthMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMassPerLengthMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMassPerLengthMeasurevalue(Double newIfcMassPerLengthMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMassPerLengthMeasurevalue(), newIfcMassPerLengthMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMassPerLengthMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMassPerLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMassPerLengthMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMassPerLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcCurvatureMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcCurvatureMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCurvatureMeasurevalue(Double newIfcCurvatureMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcCurvatureMeasurevalue(), newIfcCurvatureMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcCurvatureMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcCurvatureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcCurvatureMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcCurvatureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLuminousIntensityDistributionMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLuminousIntensityDistributionMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLuminousIntensityDistributionMeasurevalue(Double newIfcLuminousIntensityDistributionMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLuminousIntensityDistributionMeasurevalue(), newIfcLuminousIntensityDistributionMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLuminousIntensityDistributionMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLuminousIntensityDistributionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLuminousIntensityDistributionMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLuminousIntensityDistributionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLinearMomentMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearMomentMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLinearMomentMeasurevalue(Double newIfcLinearMomentMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearMomentMeasurevalue(), newIfcLinearMomentMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLinearMomentMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearMomentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLinearMomentMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearMomentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcShearModulusMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcShearModulusMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcShearModulusMeasurevalue(Double newIfcShearModulusMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcShearModulusMeasurevalue(), newIfcShearModulusMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcShearModulusMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcShearModulusMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcShearModulusMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcShearModulusMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRotationalStiffnessMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRotationalStiffnessMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRotationalStiffnessMeasurevalue(Double newIfcRotationalStiffnessMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRotationalStiffnessMeasurevalue(), newIfcRotationalStiffnessMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRotationalStiffnessMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRotationalStiffnessMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRotationalStiffnessMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRotationalStiffnessMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPlanarForceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPlanarForceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPlanarForceMeasurevalue(Double newIfcPlanarForceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPlanarForceMeasurevalue(), newIfcPlanarForceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPlanarForceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPlanarForceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPlanarForceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPlanarForceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMomentOfInertiaMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMomentOfInertiaMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMomentOfInertiaMeasurevalue(Double newIfcMomentOfInertiaMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMomentOfInertiaMeasurevalue(), newIfcMomentOfInertiaMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMomentOfInertiaMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMomentOfInertiaMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMomentOfInertiaMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMomentOfInertiaMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcModulusOfElasticityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfElasticityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcModulusOfElasticityMeasurevalue(Double newIfcModulusOfElasticityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfElasticityMeasurevalue(), newIfcModulusOfElasticityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcModulusOfElasticityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfElasticityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcModulusOfElasticityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfElasticityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcModulusOfSubgradeReactionMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfSubgradeReactionMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcModulusOfSubgradeReactionMeasurevalue(Double newIfcModulusOfSubgradeReactionMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfSubgradeReactionMeasurevalue(), newIfcModulusOfSubgradeReactionMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcModulusOfSubgradeReactionMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfSubgradeReactionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcModulusOfSubgradeReactionMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcModulusOfSubgradeReactionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLinearStiffnessMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearStiffnessMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLinearStiffnessMeasurevalue(Double newIfcLinearStiffnessMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearStiffnessMeasurevalue(), newIfcLinearStiffnessMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLinearStiffnessMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearStiffnessMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLinearStiffnessMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearStiffnessMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLinearForceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearForceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLinearForceMeasurevalue(Double newIfcLinearForceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearForceMeasurevalue(), newIfcLinearForceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLinearForceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearForceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLinearForceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearForceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcAccelerationMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcAccelerationMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAccelerationMeasurevalue(Double newIfcAccelerationMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcAccelerationMeasurevalue(), newIfcAccelerationMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcAccelerationMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcAccelerationMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcAccelerationMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcAccelerationMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcTorqueMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcTorqueMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTorqueMeasurevalue(Double newIfcTorqueMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcTorqueMeasurevalue(), newIfcTorqueMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcTorqueMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcTorqueMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcTorqueMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcTorqueMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRotationalFrequencyMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRotationalFrequencyMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRotationalFrequencyMeasurevalue(Double newIfcRotationalFrequencyMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRotationalFrequencyMeasurevalue(), newIfcRotationalFrequencyMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRotationalFrequencyMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRotationalFrequencyMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRotationalFrequencyMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRotationalFrequencyMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRadioActivityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRadioActivityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRadioActivityMeasurevalue(Double newIfcRadioActivityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRadioActivityMeasurevalue(), newIfcRadioActivityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRadioActivityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRadioActivityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRadioActivityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcRadioActivityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcAbsorbedDoseMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcAbsorbedDoseMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAbsorbedDoseMeasurevalue(Double newIfcAbsorbedDoseMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcAbsorbedDoseMeasurevalue(), newIfcAbsorbedDoseMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcAbsorbedDoseMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcAbsorbedDoseMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcAbsorbedDoseMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcAbsorbedDoseMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcElectricCapacitanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricCapacitanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricCapacitanceMeasurevalue(Double newIfcElectricCapacitanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricCapacitanceMeasurevalue(), newIfcElectricCapacitanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcElectricCapacitanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricCapacitanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcElectricCapacitanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricCapacitanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcDoseEquivalentMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcDoseEquivalentMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDoseEquivalentMeasurevalue(Double newIfcDoseEquivalentMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcDoseEquivalentMeasurevalue(), newIfcDoseEquivalentMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcDoseEquivalentMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcDoseEquivalentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcDoseEquivalentMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcDoseEquivalentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcElectricChargeMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricChargeMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricChargeMeasurevalue(Double newIfcElectricChargeMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricChargeMeasurevalue(), newIfcElectricChargeMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcElectricChargeMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricChargeMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcElectricChargeMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricChargeMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcElectricConductanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricConductanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricConductanceMeasurevalue(Double newIfcElectricConductanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricConductanceMeasurevalue(), newIfcElectricConductanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcElectricConductanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricConductanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcElectricConductanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricConductanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcElectricResistanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricResistanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricResistanceMeasurevalue(Double newIfcElectricResistanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricResistanceMeasurevalue(), newIfcElectricResistanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcElectricResistanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricResistanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcElectricResistanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricResistanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcIlluminanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIlluminanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIlluminanceMeasurevalue(Double newIfcIlluminanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIlluminanceMeasurevalue(), newIfcIlluminanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcIlluminanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIlluminanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcIlluminanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIlluminanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcInductanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcInductanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcInductanceMeasurevalue(Double newIfcInductanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcInductanceMeasurevalue(), newIfcInductanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcInductanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcInductanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcInductanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcInductanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcForceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcForceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcForceMeasurevalue(Double newIfcForceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcForceMeasurevalue(), newIfcForceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcForceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcForceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcForceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcForceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLuminousFluxMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLuminousFluxMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLuminousFluxMeasurevalue(Double newIfcLuminousFluxMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLuminousFluxMeasurevalue(), newIfcLuminousFluxMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLuminousFluxMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLuminousFluxMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLuminousFluxMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLuminousFluxMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMagneticFluxMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMagneticFluxMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMagneticFluxMeasurevalue(Double newIfcMagneticFluxMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMagneticFluxMeasurevalue(), newIfcMagneticFluxMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMagneticFluxMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMagneticFluxMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMagneticFluxMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMagneticFluxMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMagneticFluxDensityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMagneticFluxDensityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMagneticFluxDensityMeasurevalue(Double newIfcMagneticFluxDensityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMagneticFluxDensityMeasurevalue(), newIfcMagneticFluxDensityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMagneticFluxDensityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMagneticFluxDensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMagneticFluxDensityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMagneticFluxDensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMonetaryMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMonetaryMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMonetaryMeasurevalue(Double newIfcMonetaryMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMonetaryMeasurevalue(), newIfcMonetaryMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMonetaryMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMonetaryMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMonetaryMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMonetaryMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSpecificHeatCapacityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSpecificHeatCapacityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSpecificHeatCapacityMeasurevalue(Double newIfcSpecificHeatCapacityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSpecificHeatCapacityMeasurevalue(), newIfcSpecificHeatCapacityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSpecificHeatCapacityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSpecificHeatCapacityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSpecificHeatCapacityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcSpecificHeatCapacityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcIsothermalMoistureCapacityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIsothermalMoistureCapacityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIsothermalMoistureCapacityMeasurevalue(Double newIfcIsothermalMoistureCapacityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIsothermalMoistureCapacityMeasurevalue(), newIfcIsothermalMoistureCapacityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcIsothermalMoistureCapacityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIsothermalMoistureCapacityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcIsothermalMoistureCapacityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIsothermalMoistureCapacityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMoistureDiffusivityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMoistureDiffusivityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMoistureDiffusivityMeasurevalue(Double newIfcMoistureDiffusivityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMoistureDiffusivityMeasurevalue(), newIfcMoistureDiffusivityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMoistureDiffusivityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMoistureDiffusivityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMoistureDiffusivityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMoistureDiffusivityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcVaporPermeabilityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcVaporPermeabilityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVaporPermeabilityMeasurevalue(Double newIfcVaporPermeabilityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcVaporPermeabilityMeasurevalue(), newIfcVaporPermeabilityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcVaporPermeabilityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcVaporPermeabilityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcVaporPermeabilityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcVaporPermeabilityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMolecularWeightMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMolecularWeightMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMolecularWeightMeasurevalue(Double newIfcMolecularWeightMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMolecularWeightMeasurevalue(), newIfcMolecularWeightMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMolecularWeightMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMolecularWeightMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMolecularWeightMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMolecularWeightMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcThermalConductivityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalConductivityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalConductivityMeasurevalue(Double newIfcThermalConductivityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalConductivityMeasurevalue(), newIfcThermalConductivityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcThermalConductivityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalConductivityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcThermalConductivityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalConductivityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcAngularVelocityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcAngularVelocityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAngularVelocityMeasurevalue(Double newIfcAngularVelocityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcAngularVelocityMeasurevalue(), newIfcAngularVelocityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcAngularVelocityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcAngularVelocityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcAngularVelocityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcAngularVelocityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcDynamicViscosityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcDynamicViscosityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDynamicViscosityMeasurevalue(Double newIfcDynamicViscosityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcDynamicViscosityMeasurevalue(), newIfcDynamicViscosityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcDynamicViscosityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcDynamicViscosityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcDynamicViscosityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcDynamicViscosityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcElectricVoltageMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricVoltageMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricVoltageMeasurevalue(Double newIfcElectricVoltageMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricVoltageMeasurevalue(), newIfcElectricVoltageMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcElectricVoltageMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricVoltageMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcElectricVoltageMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcElectricVoltageMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcEnergyMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcEnergyMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcEnergyMeasurevalue(Double newIfcEnergyMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcEnergyMeasurevalue(), newIfcEnergyMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcEnergyMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcEnergyMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcEnergyMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcEnergyMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcFrequencyMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcFrequencyMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcFrequencyMeasurevalue(Double newIfcFrequencyMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcFrequencyMeasurevalue(), newIfcFrequencyMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcFrequencyMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcFrequencyMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcFrequencyMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcFrequencyMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcHeatFluxDensityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcHeatFluxDensityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcHeatFluxDensityMeasurevalue(Double newIfcHeatFluxDensityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcHeatFluxDensityMeasurevalue(), newIfcHeatFluxDensityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcHeatFluxDensityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcHeatFluxDensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcHeatFluxDensityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcHeatFluxDensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIfcIntegerCountRateMeasurevalue() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIntegerCountRateMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIntegerCountRateMeasurevalue(Integer newIfcIntegerCountRateMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIntegerCountRateMeasurevalue(), newIfcIntegerCountRateMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcIntegerCountRateMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIntegerCountRateMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcIntegerCountRateMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcIntegerCountRateMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcKinematicViscosityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcKinematicViscosityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcKinematicViscosityMeasurevalue(Double newIfcKinematicViscosityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcKinematicViscosityMeasurevalue(), newIfcKinematicViscosityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcKinematicViscosityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcKinematicViscosityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcKinematicViscosityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcKinematicViscosityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLinearVelocityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearVelocityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLinearVelocityMeasurevalue(Double newIfcLinearVelocityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearVelocityMeasurevalue(), newIfcLinearVelocityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLinearVelocityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearVelocityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLinearVelocityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcLinearVelocityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMassDensityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMassDensityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMassDensityMeasurevalue(Double newIfcMassDensityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMassDensityMeasurevalue(), newIfcMassDensityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMassDensityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMassDensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMassDensityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMassDensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMassFlowRateMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMassFlowRateMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMassFlowRateMeasurevalue(Double newIfcMassFlowRateMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMassFlowRateMeasurevalue(), newIfcMassFlowRateMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMassFlowRateMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMassFlowRateMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMassFlowRateMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcMassFlowRateMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPowerMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPowerMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPowerMeasurevalue(Double newIfcPowerMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPowerMeasurevalue(), newIfcPowerMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPowerMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPowerMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPowerMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPowerMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPressureMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPressureMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPressureMeasurevalue(Double newIfcPressureMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPressureMeasurevalue(), newIfcPressureMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPressureMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPressureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPressureMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcPressureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcThermalAdmittanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalAdmittanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalAdmittanceMeasurevalue(Double newIfcThermalAdmittanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalAdmittanceMeasurevalue(), newIfcThermalAdmittanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcThermalAdmittanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalAdmittanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcThermalAdmittanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalAdmittanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcThermalResistanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalResistanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalResistanceMeasurevalue(Double newIfcThermalResistanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalResistanceMeasurevalue(), newIfcThermalResistanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcThermalResistanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalResistanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcThermalResistanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalResistanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcThermalTransmittanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalTransmittanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalTransmittanceMeasurevalue(Double newIfcThermalTransmittanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalTransmittanceMeasurevalue(), newIfcThermalTransmittanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcThermalTransmittanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalTransmittanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcThermalTransmittanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcThermalTransmittanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIfcTimeStampvalue() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcTimeStampvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTimeStampvalue(Integer newIfcTimeStampvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcTimeStampvalue(), newIfcTimeStampvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcTimeStampvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcTimeStampvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcTimeStampvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcTimeStampvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcVolumetricFlowRateMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcVolumetricFlowRateMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVolumetricFlowRateMeasurevalue(Double newIfcVolumetricFlowRateMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcVolumetricFlowRateMeasurevalue(), newIfcVolumetricFlowRateMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcVolumetricFlowRateMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcVolumetricFlowRateMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcVolumetricFlowRateMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedMeasureValue_IfcVolumetricFlowRateMeasurevalue());
	}

} //IfcDerivedMeasureValueImpl
