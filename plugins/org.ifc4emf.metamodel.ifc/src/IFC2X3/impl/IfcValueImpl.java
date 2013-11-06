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
import IFC2X3.IfcMeasureValue;
import IFC2X3.IfcSimpleValue;
import IFC2X3.IfcValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcVolumetricFlowRateMeasurevalue <em>Ifc Volumetric Flow Rate Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcTimeStampvalue <em>Ifc Time Stampvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcThermalTransmittanceMeasurevalue <em>Ifc Thermal Transmittance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcThermalResistanceMeasurevalue <em>Ifc Thermal Resistance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcThermalAdmittanceMeasurevalue <em>Ifc Thermal Admittance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcPressureMeasurevalue <em>Ifc Pressure Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcPowerMeasurevalue <em>Ifc Power Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcMassFlowRateMeasurevalue <em>Ifc Mass Flow Rate Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcMassDensityMeasurevalue <em>Ifc Mass Density Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcLinearVelocityMeasurevalue <em>Ifc Linear Velocity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcKinematicViscosityMeasurevalue <em>Ifc Kinematic Viscosity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcIntegerCountRateMeasurevalue <em>Ifc Integer Count Rate Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcHeatFluxDensityMeasurevalue <em>Ifc Heat Flux Density Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcFrequencyMeasurevalue <em>Ifc Frequency Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcEnergyMeasurevalue <em>Ifc Energy Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcElectricVoltageMeasurevalue <em>Ifc Electric Voltage Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcDynamicViscosityMeasurevalue <em>Ifc Dynamic Viscosity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcAngularVelocityMeasurevalue <em>Ifc Angular Velocity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcThermalConductivityMeasurevalue <em>Ifc Thermal Conductivity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcMolecularWeightMeasurevalue <em>Ifc Molecular Weight Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcVaporPermeabilityMeasurevalue <em>Ifc Vapor Permeability Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcMoistureDiffusivityMeasurevalue <em>Ifc Moisture Diffusivity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcIsothermalMoistureCapacityMeasurevalue <em>Ifc Isothermal Moisture Capacity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcSpecificHeatCapacityMeasurevalue <em>Ifc Specific Heat Capacity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcMonetaryMeasurevalue <em>Ifc Monetary Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcMagneticFluxDensityMeasurevalue <em>Ifc Magnetic Flux Density Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcMagneticFluxMeasurevalue <em>Ifc Magnetic Flux Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcLuminousFluxMeasurevalue <em>Ifc Luminous Flux Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcForceMeasurevalue <em>Ifc Force Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcInductanceMeasurevalue <em>Ifc Inductance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcIlluminanceMeasurevalue <em>Ifc Illuminance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcElectricResistanceMeasurevalue <em>Ifc Electric Resistance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcElectricConductanceMeasurevalue <em>Ifc Electric Conductance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcElectricChargeMeasurevalue <em>Ifc Electric Charge Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcDoseEquivalentMeasurevalue <em>Ifc Dose Equivalent Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcElectricCapacitanceMeasurevalue <em>Ifc Electric Capacitance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcAbsorbedDoseMeasurevalue <em>Ifc Absorbed Dose Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcRadioActivityMeasurevalue <em>Ifc Radio Activity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcRotationalFrequencyMeasurevalue <em>Ifc Rotational Frequency Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcTorqueMeasurevalue <em>Ifc Torque Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcAccelerationMeasurevalue <em>Ifc Acceleration Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcLinearForceMeasurevalue <em>Ifc Linear Force Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcLinearStiffnessMeasurevalue <em>Ifc Linear Stiffness Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcModulusOfSubgradeReactionMeasurevalue <em>Ifc Modulus Of Subgrade Reaction Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcModulusOfElasticityMeasurevalue <em>Ifc Modulus Of Elasticity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcMomentOfInertiaMeasurevalue <em>Ifc Moment Of Inertia Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcPlanarForceMeasurevalue <em>Ifc Planar Force Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcRotationalStiffnessMeasurevalue <em>Ifc Rotational Stiffness Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcShearModulusMeasurevalue <em>Ifc Shear Modulus Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcLinearMomentMeasurevalue <em>Ifc Linear Moment Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcLuminousIntensityDistributionMeasurevalue <em>Ifc Luminous Intensity Distribution Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcCurvatureMeasurevalue <em>Ifc Curvature Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcMassPerLengthMeasurevalue <em>Ifc Mass Per Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcModulusOfLinearSubgradeReactionMeasurevalue <em>Ifc Modulus Of Linear Subgrade Reaction Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcModulusOfRotationalSubgradeReactionMeasurevalue <em>Ifc Modulus Of Rotational Subgrade Reaction Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcRotationalMassMeasurevalue <em>Ifc Rotational Mass Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcSectionalAreaIntegralMeasurevalue <em>Ifc Sectional Area Integral Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcSectionModulusMeasurevalue <em>Ifc Section Modulus Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcTemperatureGradientMeasurevalue <em>Ifc Temperature Gradient Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcThermalExpansionCoefficientMeasurevalue <em>Ifc Thermal Expansion Coefficient Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcWarpingConstantMeasurevalue <em>Ifc Warping Constant Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcWarpingMomentMeasurevalue <em>Ifc Warping Moment Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcSoundPowerMeasurevalue <em>Ifc Sound Power Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcSoundPressureMeasurevalue <em>Ifc Sound Pressure Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcHeatingValueMeasurevalue <em>Ifc Heating Value Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcPHMeasurevalue <em>Ifc PH Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcIonConcentrationMeasurevalue <em>Ifc Ion Concentration Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcIntegervalue <em>Ifc Integervalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcRealvalue <em>Ifc Realvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcBooleanvalue <em>Ifc Booleanvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcIdentifiervalue <em>Ifc Identifiervalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcTextvalue <em>Ifc Textvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcLabelvalue <em>Ifc Labelvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcLogicalvalue <em>Ifc Logicalvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcVolumeMeasurevalue <em>Ifc Volume Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcTimeMeasurevalue <em>Ifc Time Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcThermodynamicTemperatureMeasurevalue <em>Ifc Thermodynamic Temperature Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcSolidAngleMeasurevalue <em>Ifc Solid Angle Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcPositiveRatioMeasurevalue <em>Ifc Positive Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcPositivePlaneAngleMeasurevalue <em>Ifc Positive Plane Angle Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcPlaneAngleMeasurevalue <em>Ifc Plane Angle Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcParameterValuevalue <em>Ifc Parameter Valuevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcNumericMeasurevalue <em>Ifc Numeric Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcMassMeasurevalue <em>Ifc Mass Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcLengthMeasurevalue <em>Ifc Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcElectricCurrentMeasurevalue <em>Ifc Electric Current Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcDescriptiveMeasurevalue <em>Ifc Descriptive Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcCountMeasurevalue <em>Ifc Count Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcContextDependentMeasurevalue <em>Ifc Context Dependent Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcAreaMeasurevalue <em>Ifc Area Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcAmountOfSubstanceMeasurevalue <em>Ifc Amount Of Substance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcLuminousIntensityMeasurevalue <em>Ifc Luminous Intensity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcValueImpl#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcValue")
@XmlRootElement(name = "IfcValueElement")
public class IfcValueImpl extends CDOObjectImpl implements IfcValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcValue();
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
	public Double getIfcAbsorbedDoseMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAbsorbedDoseMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAbsorbedDoseMeasurevalue(Double newIfcAbsorbedDoseMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAbsorbedDoseMeasurevalue(), newIfcAbsorbedDoseMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcAbsorbedDoseMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcAbsorbedDoseMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcAbsorbedDoseMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAbsorbedDoseMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcAccelerationMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAccelerationMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAccelerationMeasurevalue(Double newIfcAccelerationMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAccelerationMeasurevalue(), newIfcAccelerationMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcAccelerationMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcAccelerationMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcAccelerationMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAccelerationMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcAmountOfSubstanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAmountOfSubstanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAmountOfSubstanceMeasurevalue(Double newIfcAmountOfSubstanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAmountOfSubstanceMeasurevalue(), newIfcAmountOfSubstanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcAmountOfSubstanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcAmountOfSubstanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcAmountOfSubstanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAmountOfSubstanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcAngularVelocityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAngularVelocityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAngularVelocityMeasurevalue(Double newIfcAngularVelocityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAngularVelocityMeasurevalue(), newIfcAngularVelocityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcAngularVelocityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcAngularVelocityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcAngularVelocityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAngularVelocityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcAreaMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAreaMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAreaMeasurevalue(Double newIfcAreaMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAreaMeasurevalue(), newIfcAreaMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcAreaMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcAreaMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcAreaMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcAreaMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIfcBooleanvalue() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcBooleanvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcBooleanvalue(Boolean newIfcBooleanvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcBooleanvalue(), newIfcBooleanvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcBooleanvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcBooleanvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcBooleanvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcBooleanvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcContextDependentMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcContextDependentMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcContextDependentMeasurevalue(Double newIfcContextDependentMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcContextDependentMeasurevalue(), newIfcContextDependentMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcContextDependentMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcContextDependentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcContextDependentMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcContextDependentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcCountMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcCountMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCountMeasurevalue(Double newIfcCountMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcCountMeasurevalue(), newIfcCountMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcCountMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcCountMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcCountMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcCountMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcCurvatureMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcCurvatureMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCurvatureMeasurevalue(Double newIfcCurvatureMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcCurvatureMeasurevalue(), newIfcCurvatureMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcCurvatureMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcCurvatureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcCurvatureMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcCurvatureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfcDescriptiveMeasurevalue() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcDescriptiveMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDescriptiveMeasurevalue(String newIfcDescriptiveMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcDescriptiveMeasurevalue(), newIfcDescriptiveMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcDescriptiveMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcDescriptiveMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcDescriptiveMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcDescriptiveMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcDoseEquivalentMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcDoseEquivalentMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDoseEquivalentMeasurevalue(Double newIfcDoseEquivalentMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcDoseEquivalentMeasurevalue(), newIfcDoseEquivalentMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcDoseEquivalentMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcDoseEquivalentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcDoseEquivalentMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcDoseEquivalentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcDynamicViscosityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcDynamicViscosityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDynamicViscosityMeasurevalue(Double newIfcDynamicViscosityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcDynamicViscosityMeasurevalue(), newIfcDynamicViscosityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcDynamicViscosityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcDynamicViscosityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcDynamicViscosityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcDynamicViscosityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcElectricCapacitanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricCapacitanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricCapacitanceMeasurevalue(Double newIfcElectricCapacitanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricCapacitanceMeasurevalue(), newIfcElectricCapacitanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcElectricCapacitanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricCapacitanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcElectricCapacitanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricCapacitanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcElectricChargeMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricChargeMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricChargeMeasurevalue(Double newIfcElectricChargeMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricChargeMeasurevalue(), newIfcElectricChargeMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcElectricChargeMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricChargeMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcElectricChargeMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricChargeMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcElectricConductanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricConductanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricConductanceMeasurevalue(Double newIfcElectricConductanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricConductanceMeasurevalue(), newIfcElectricConductanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcElectricConductanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricConductanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcElectricConductanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricConductanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcElectricCurrentMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricCurrentMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricCurrentMeasurevalue(Double newIfcElectricCurrentMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricCurrentMeasurevalue(), newIfcElectricCurrentMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcElectricCurrentMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricCurrentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcElectricCurrentMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricCurrentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcElectricResistanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricResistanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricResistanceMeasurevalue(Double newIfcElectricResistanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricResistanceMeasurevalue(), newIfcElectricResistanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcElectricResistanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricResistanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcElectricResistanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricResistanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcElectricVoltageMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricVoltageMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricVoltageMeasurevalue(Double newIfcElectricVoltageMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricVoltageMeasurevalue(), newIfcElectricVoltageMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcElectricVoltageMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricVoltageMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcElectricVoltageMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcElectricVoltageMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcEnergyMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcEnergyMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcEnergyMeasurevalue(Double newIfcEnergyMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcEnergyMeasurevalue(), newIfcEnergyMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcEnergyMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcEnergyMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcEnergyMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcEnergyMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcForceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcForceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcForceMeasurevalue(Double newIfcForceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcForceMeasurevalue(), newIfcForceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcForceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcForceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcForceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcForceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcFrequencyMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcFrequencyMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcFrequencyMeasurevalue(Double newIfcFrequencyMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcFrequencyMeasurevalue(), newIfcFrequencyMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcFrequencyMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcFrequencyMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcFrequencyMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcFrequencyMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcHeatFluxDensityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcHeatFluxDensityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcHeatFluxDensityMeasurevalue(Double newIfcHeatFluxDensityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcHeatFluxDensityMeasurevalue(), newIfcHeatFluxDensityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcHeatFluxDensityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcHeatFluxDensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcHeatFluxDensityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcHeatFluxDensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcHeatingValueMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcHeatingValueMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcHeatingValueMeasurevalue(Double newIfcHeatingValueMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcHeatingValueMeasurevalue(), newIfcHeatingValueMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcHeatingValueMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcHeatingValueMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcHeatingValueMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcHeatingValueMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfcIdentifiervalue() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIdentifiervalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIdentifiervalue(String newIfcIdentifiervalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIdentifiervalue(), newIfcIdentifiervalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcIdentifiervalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcIdentifiervalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcIdentifiervalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIdentifiervalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcIlluminanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIlluminanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIlluminanceMeasurevalue(Double newIfcIlluminanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIlluminanceMeasurevalue(), newIfcIlluminanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcIlluminanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcIlluminanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcIlluminanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIlluminanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcInductanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcInductanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcInductanceMeasurevalue(Double newIfcInductanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcInductanceMeasurevalue(), newIfcInductanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcInductanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcInductanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcInductanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcInductanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIfcIntegervalue() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIntegervalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIntegervalue(Integer newIfcIntegervalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIntegervalue(), newIfcIntegervalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcIntegervalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcIntegervalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcIntegervalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIntegervalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIfcIntegerCountRateMeasurevalue() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIntegerCountRateMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIntegerCountRateMeasurevalue(Integer newIfcIntegerCountRateMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIntegerCountRateMeasurevalue(), newIfcIntegerCountRateMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcIntegerCountRateMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcIntegerCountRateMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcIntegerCountRateMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIntegerCountRateMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcIonConcentrationMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIonConcentrationMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIonConcentrationMeasurevalue(Double newIfcIonConcentrationMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIonConcentrationMeasurevalue(), newIfcIonConcentrationMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcIonConcentrationMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcIonConcentrationMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcIonConcentrationMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIonConcentrationMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcIsothermalMoistureCapacityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIsothermalMoistureCapacityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIsothermalMoistureCapacityMeasurevalue(Double newIfcIsothermalMoistureCapacityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIsothermalMoistureCapacityMeasurevalue(), newIfcIsothermalMoistureCapacityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcIsothermalMoistureCapacityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcIsothermalMoistureCapacityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcIsothermalMoistureCapacityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcIsothermalMoistureCapacityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcKinematicViscosityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcKinematicViscosityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcKinematicViscosityMeasurevalue(Double newIfcKinematicViscosityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcKinematicViscosityMeasurevalue(), newIfcKinematicViscosityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcKinematicViscosityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcKinematicViscosityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcKinematicViscosityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcKinematicViscosityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfcLabelvalue() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLabelvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLabelvalue(String newIfcLabelvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLabelvalue(), newIfcLabelvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLabelvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcLabelvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLabelvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLabelvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPositiveLengthMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPositiveLengthMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPositiveLengthMeasurevalue(Double newIfcPositiveLengthMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPositiveLengthMeasurevalue(), newIfcPositiveLengthMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPositiveLengthMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcPositiveLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPositiveLengthMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPositiveLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLengthMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLengthMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLengthMeasurevalue(Double newIfcLengthMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLengthMeasurevalue(), newIfcLengthMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLengthMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLengthMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLinearForceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearForceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLinearForceMeasurevalue(Double newIfcLinearForceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearForceMeasurevalue(), newIfcLinearForceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLinearForceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearForceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLinearForceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearForceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLinearMomentMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearMomentMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLinearMomentMeasurevalue(Double newIfcLinearMomentMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearMomentMeasurevalue(), newIfcLinearMomentMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLinearMomentMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearMomentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLinearMomentMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearMomentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLinearStiffnessMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearStiffnessMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLinearStiffnessMeasurevalue(Double newIfcLinearStiffnessMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearStiffnessMeasurevalue(), newIfcLinearStiffnessMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLinearStiffnessMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearStiffnessMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLinearStiffnessMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearStiffnessMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLinearVelocityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearVelocityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLinearVelocityMeasurevalue(Double newIfcLinearVelocityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearVelocityMeasurevalue(), newIfcLinearVelocityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLinearVelocityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearVelocityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLinearVelocityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLinearVelocityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIfcLogicalvalue() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLogicalvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLogicalvalue(Boolean newIfcLogicalvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLogicalvalue(), newIfcLogicalvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLogicalvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcLogicalvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLogicalvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLogicalvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLuminousFluxMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLuminousFluxMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLuminousFluxMeasurevalue(Double newIfcLuminousFluxMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLuminousFluxMeasurevalue(), newIfcLuminousFluxMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLuminousFluxMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcLuminousFluxMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLuminousFluxMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLuminousFluxMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLuminousIntensityDistributionMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLuminousIntensityDistributionMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLuminousIntensityDistributionMeasurevalue(Double newIfcLuminousIntensityDistributionMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLuminousIntensityDistributionMeasurevalue(), newIfcLuminousIntensityDistributionMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLuminousIntensityDistributionMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcLuminousIntensityDistributionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLuminousIntensityDistributionMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLuminousIntensityDistributionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLuminousIntensityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLuminousIntensityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLuminousIntensityMeasurevalue(Double newIfcLuminousIntensityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLuminousIntensityMeasurevalue(), newIfcLuminousIntensityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLuminousIntensityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcLuminousIntensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLuminousIntensityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcLuminousIntensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMagneticFluxDensityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMagneticFluxDensityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMagneticFluxDensityMeasurevalue(Double newIfcMagneticFluxDensityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMagneticFluxDensityMeasurevalue(), newIfcMagneticFluxDensityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMagneticFluxDensityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcMagneticFluxDensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMagneticFluxDensityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMagneticFluxDensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMagneticFluxMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMagneticFluxMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMagneticFluxMeasurevalue(Double newIfcMagneticFluxMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMagneticFluxMeasurevalue(), newIfcMagneticFluxMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMagneticFluxMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcMagneticFluxMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMagneticFluxMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMagneticFluxMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMassDensityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassDensityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMassDensityMeasurevalue(Double newIfcMassDensityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassDensityMeasurevalue(), newIfcMassDensityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMassDensityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassDensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMassDensityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassDensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMassFlowRateMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassFlowRateMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMassFlowRateMeasurevalue(Double newIfcMassFlowRateMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassFlowRateMeasurevalue(), newIfcMassFlowRateMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMassFlowRateMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassFlowRateMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMassFlowRateMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassFlowRateMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMassMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMassMeasurevalue(Double newIfcMassMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassMeasurevalue(), newIfcMassMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMassMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMassMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMassPerLengthMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassPerLengthMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMassPerLengthMeasurevalue(Double newIfcMassPerLengthMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassPerLengthMeasurevalue(), newIfcMassPerLengthMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMassPerLengthMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassPerLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMassPerLengthMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMassPerLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcModulusOfElasticityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfElasticityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcModulusOfElasticityMeasurevalue(Double newIfcModulusOfElasticityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfElasticityMeasurevalue(), newIfcModulusOfElasticityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcModulusOfElasticityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfElasticityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcModulusOfElasticityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfElasticityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcModulusOfLinearSubgradeReactionMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfLinearSubgradeReactionMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcModulusOfLinearSubgradeReactionMeasurevalue(Double newIfcModulusOfLinearSubgradeReactionMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfLinearSubgradeReactionMeasurevalue(), newIfcModulusOfLinearSubgradeReactionMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcModulusOfLinearSubgradeReactionMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfLinearSubgradeReactionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcModulusOfLinearSubgradeReactionMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfLinearSubgradeReactionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcModulusOfRotationalSubgradeReactionMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfRotationalSubgradeReactionMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcModulusOfRotationalSubgradeReactionMeasurevalue(Double newIfcModulusOfRotationalSubgradeReactionMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfRotationalSubgradeReactionMeasurevalue(), newIfcModulusOfRotationalSubgradeReactionMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcModulusOfRotationalSubgradeReactionMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfRotationalSubgradeReactionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcModulusOfRotationalSubgradeReactionMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfRotationalSubgradeReactionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcModulusOfSubgradeReactionMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfSubgradeReactionMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcModulusOfSubgradeReactionMeasurevalue(Double newIfcModulusOfSubgradeReactionMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfSubgradeReactionMeasurevalue(), newIfcModulusOfSubgradeReactionMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcModulusOfSubgradeReactionMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfSubgradeReactionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcModulusOfSubgradeReactionMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcModulusOfSubgradeReactionMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMoistureDiffusivityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMoistureDiffusivityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMoistureDiffusivityMeasurevalue(Double newIfcMoistureDiffusivityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMoistureDiffusivityMeasurevalue(), newIfcMoistureDiffusivityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMoistureDiffusivityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcMoistureDiffusivityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMoistureDiffusivityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMoistureDiffusivityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMolecularWeightMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMolecularWeightMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMolecularWeightMeasurevalue(Double newIfcMolecularWeightMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMolecularWeightMeasurevalue(), newIfcMolecularWeightMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMolecularWeightMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcMolecularWeightMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMolecularWeightMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMolecularWeightMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMomentOfInertiaMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMomentOfInertiaMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMomentOfInertiaMeasurevalue(Double newIfcMomentOfInertiaMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMomentOfInertiaMeasurevalue(), newIfcMomentOfInertiaMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMomentOfInertiaMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcMomentOfInertiaMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMomentOfInertiaMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMomentOfInertiaMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMonetaryMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMonetaryMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMonetaryMeasurevalue(Double newIfcMonetaryMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMonetaryMeasurevalue(), newIfcMonetaryMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMonetaryMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcMonetaryMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMonetaryMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcMonetaryMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcNormalisedRatioMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcNormalisedRatioMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcNormalisedRatioMeasurevalue(Double newIfcNormalisedRatioMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcNormalisedRatioMeasurevalue(), newIfcNormalisedRatioMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcNormalisedRatioMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcNormalisedRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcNormalisedRatioMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcNormalisedRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcNumericMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcNumericMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcNumericMeasurevalue(Double newIfcNumericMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcNumericMeasurevalue(), newIfcNumericMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcNumericMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcNumericMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcNumericMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcNumericMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPHMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPHMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPHMeasurevalue(Double newIfcPHMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPHMeasurevalue(), newIfcPHMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPHMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcPHMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPHMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPHMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcParameterValuevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcParameterValuevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcParameterValuevalue(Double newIfcParameterValuevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcParameterValuevalue(), newIfcParameterValuevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcParameterValuevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcParameterValuevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcParameterValuevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcParameterValuevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPlanarForceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPlanarForceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPlanarForceMeasurevalue(Double newIfcPlanarForceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPlanarForceMeasurevalue(), newIfcPlanarForceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPlanarForceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcPlanarForceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPlanarForceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPlanarForceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPositivePlaneAngleMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPositivePlaneAngleMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPositivePlaneAngleMeasurevalue(Double newIfcPositivePlaneAngleMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPositivePlaneAngleMeasurevalue(), newIfcPositivePlaneAngleMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPositivePlaneAngleMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcPositivePlaneAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPositivePlaneAngleMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPositivePlaneAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPlaneAngleMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPlaneAngleMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPlaneAngleMeasurevalue(Double newIfcPlaneAngleMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPlaneAngleMeasurevalue(), newIfcPlaneAngleMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPlaneAngleMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcPlaneAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPlaneAngleMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPlaneAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPositiveRatioMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPositiveRatioMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPositiveRatioMeasurevalue(Double newIfcPositiveRatioMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPositiveRatioMeasurevalue(), newIfcPositiveRatioMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPositiveRatioMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcPositiveRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPositiveRatioMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPositiveRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPowerMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPowerMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPowerMeasurevalue(Double newIfcPowerMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPowerMeasurevalue(), newIfcPowerMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPowerMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcPowerMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPowerMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPowerMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPressureMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPressureMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPressureMeasurevalue(Double newIfcPressureMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPressureMeasurevalue(), newIfcPressureMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPressureMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcPressureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPressureMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcPressureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRadioActivityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRadioActivityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRadioActivityMeasurevalue(Double newIfcRadioActivityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRadioActivityMeasurevalue(), newIfcRadioActivityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRadioActivityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcRadioActivityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRadioActivityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRadioActivityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRatioMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRatioMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRatioMeasurevalue(Double newIfcRatioMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRatioMeasurevalue(), newIfcRatioMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRatioMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRatioMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRealvalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRealvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRealvalue(Double newIfcRealvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRealvalue(), newIfcRealvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRealvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcRealvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRealvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRealvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRotationalFrequencyMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRotationalFrequencyMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRotationalFrequencyMeasurevalue(Double newIfcRotationalFrequencyMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRotationalFrequencyMeasurevalue(), newIfcRotationalFrequencyMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRotationalFrequencyMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcRotationalFrequencyMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRotationalFrequencyMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRotationalFrequencyMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRotationalMassMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRotationalMassMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRotationalMassMeasurevalue(Double newIfcRotationalMassMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRotationalMassMeasurevalue(), newIfcRotationalMassMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRotationalMassMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcRotationalMassMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRotationalMassMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRotationalMassMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRotationalStiffnessMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRotationalStiffnessMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRotationalStiffnessMeasurevalue(Double newIfcRotationalStiffnessMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRotationalStiffnessMeasurevalue(), newIfcRotationalStiffnessMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRotationalStiffnessMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcRotationalStiffnessMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRotationalStiffnessMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcRotationalStiffnessMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSectionModulusMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSectionModulusMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSectionModulusMeasurevalue(Double newIfcSectionModulusMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSectionModulusMeasurevalue(), newIfcSectionModulusMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSectionModulusMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcSectionModulusMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSectionModulusMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSectionModulusMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSectionalAreaIntegralMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSectionalAreaIntegralMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSectionalAreaIntegralMeasurevalue(Double newIfcSectionalAreaIntegralMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSectionalAreaIntegralMeasurevalue(), newIfcSectionalAreaIntegralMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSectionalAreaIntegralMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcSectionalAreaIntegralMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSectionalAreaIntegralMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSectionalAreaIntegralMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcShearModulusMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcShearModulusMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcShearModulusMeasurevalue(Double newIfcShearModulusMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcShearModulusMeasurevalue(), newIfcShearModulusMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcShearModulusMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcShearModulusMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcShearModulusMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcShearModulusMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSolidAngleMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSolidAngleMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSolidAngleMeasurevalue(Double newIfcSolidAngleMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSolidAngleMeasurevalue(), newIfcSolidAngleMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSolidAngleMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcSolidAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSolidAngleMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSolidAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSoundPowerMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSoundPowerMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSoundPowerMeasurevalue(Double newIfcSoundPowerMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSoundPowerMeasurevalue(), newIfcSoundPowerMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSoundPowerMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcSoundPowerMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSoundPowerMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSoundPowerMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSoundPressureMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSoundPressureMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSoundPressureMeasurevalue(Double newIfcSoundPressureMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSoundPressureMeasurevalue(), newIfcSoundPressureMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSoundPressureMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcSoundPressureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSoundPressureMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSoundPressureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSpecificHeatCapacityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSpecificHeatCapacityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSpecificHeatCapacityMeasurevalue(Double newIfcSpecificHeatCapacityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSpecificHeatCapacityMeasurevalue(), newIfcSpecificHeatCapacityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSpecificHeatCapacityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcSpecificHeatCapacityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSpecificHeatCapacityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcSpecificHeatCapacityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcTemperatureGradientMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTemperatureGradientMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTemperatureGradientMeasurevalue(Double newIfcTemperatureGradientMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTemperatureGradientMeasurevalue(), newIfcTemperatureGradientMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcTemperatureGradientMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcTemperatureGradientMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcTemperatureGradientMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTemperatureGradientMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfcTextvalue() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTextvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTextvalue(String newIfcTextvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTextvalue(), newIfcTextvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcTextvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcTextvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcTextvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTextvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcThermalAdmittanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalAdmittanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalAdmittanceMeasurevalue(Double newIfcThermalAdmittanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalAdmittanceMeasurevalue(), newIfcThermalAdmittanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcThermalAdmittanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalAdmittanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcThermalAdmittanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalAdmittanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcThermalConductivityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalConductivityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalConductivityMeasurevalue(Double newIfcThermalConductivityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalConductivityMeasurevalue(), newIfcThermalConductivityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcThermalConductivityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalConductivityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcThermalConductivityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalConductivityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcThermalExpansionCoefficientMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalExpansionCoefficientMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalExpansionCoefficientMeasurevalue(Double newIfcThermalExpansionCoefficientMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalExpansionCoefficientMeasurevalue(), newIfcThermalExpansionCoefficientMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcThermalExpansionCoefficientMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalExpansionCoefficientMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcThermalExpansionCoefficientMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalExpansionCoefficientMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcThermalResistanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalResistanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalResistanceMeasurevalue(Double newIfcThermalResistanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalResistanceMeasurevalue(), newIfcThermalResistanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcThermalResistanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalResistanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcThermalResistanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalResistanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcThermalTransmittanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalTransmittanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalTransmittanceMeasurevalue(Double newIfcThermalTransmittanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalTransmittanceMeasurevalue(), newIfcThermalTransmittanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcThermalTransmittanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalTransmittanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcThermalTransmittanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermalTransmittanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcThermodynamicTemperatureMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermodynamicTemperatureMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermodynamicTemperatureMeasurevalue(Double newIfcThermodynamicTemperatureMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermodynamicTemperatureMeasurevalue(), newIfcThermodynamicTemperatureMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcThermodynamicTemperatureMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermodynamicTemperatureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcThermodynamicTemperatureMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcThermodynamicTemperatureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcTimeMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTimeMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTimeMeasurevalue(Double newIfcTimeMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTimeMeasurevalue(), newIfcTimeMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcTimeMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcTimeMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcTimeMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTimeMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIfcTimeStampvalue() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTimeStampvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTimeStampvalue(Integer newIfcTimeStampvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTimeStampvalue(), newIfcTimeStampvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcTimeStampvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcTimeStampvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcTimeStampvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTimeStampvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcTorqueMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTorqueMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTorqueMeasurevalue(Double newIfcTorqueMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTorqueMeasurevalue(), newIfcTorqueMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcTorqueMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcTorqueMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcTorqueMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcTorqueMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcVaporPermeabilityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcVaporPermeabilityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVaporPermeabilityMeasurevalue(Double newIfcVaporPermeabilityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcVaporPermeabilityMeasurevalue(), newIfcVaporPermeabilityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcVaporPermeabilityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcVaporPermeabilityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcVaporPermeabilityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcVaporPermeabilityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcVolumeMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcVolumeMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVolumeMeasurevalue(Double newIfcVolumeMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcVolumeMeasurevalue(), newIfcVolumeMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcVolumeMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcVolumeMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcVolumeMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcVolumeMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcVolumetricFlowRateMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcVolumetricFlowRateMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVolumetricFlowRateMeasurevalue(Double newIfcVolumetricFlowRateMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcVolumetricFlowRateMeasurevalue(), newIfcVolumetricFlowRateMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcVolumetricFlowRateMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcVolumetricFlowRateMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcVolumetricFlowRateMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcVolumetricFlowRateMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcWarpingConstantMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcWarpingConstantMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcWarpingConstantMeasurevalue(Double newIfcWarpingConstantMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcWarpingConstantMeasurevalue(), newIfcWarpingConstantMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcWarpingConstantMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcWarpingConstantMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcWarpingConstantMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcWarpingConstantMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcWarpingMomentMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcValue_IfcWarpingMomentMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcWarpingMomentMeasurevalue(Double newIfcWarpingMomentMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcWarpingMomentMeasurevalue(), newIfcWarpingMomentMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcWarpingMomentMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcValue_IfcWarpingMomentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcWarpingMomentMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcValue_IfcWarpingMomentMeasurevalue());
	}

} //IfcValueImpl
