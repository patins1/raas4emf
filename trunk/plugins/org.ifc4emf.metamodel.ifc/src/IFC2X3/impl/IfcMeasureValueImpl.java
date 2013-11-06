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
import IFC2X3.IfcMeasureValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Measure Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcLuminousIntensityMeasurevalue <em>Ifc Luminous Intensity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcAmountOfSubstanceMeasurevalue <em>Ifc Amount Of Substance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcAreaMeasurevalue <em>Ifc Area Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcContextDependentMeasurevalue <em>Ifc Context Dependent Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcCountMeasurevalue <em>Ifc Count Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcDescriptiveMeasurevalue <em>Ifc Descriptive Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcElectricCurrentMeasurevalue <em>Ifc Electric Current Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcLengthMeasurevalue <em>Ifc Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcMassMeasurevalue <em>Ifc Mass Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcNumericMeasurevalue <em>Ifc Numeric Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcParameterValuevalue <em>Ifc Parameter Valuevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcPlaneAngleMeasurevalue <em>Ifc Plane Angle Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcPositivePlaneAngleMeasurevalue <em>Ifc Positive Plane Angle Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcPositiveRatioMeasurevalue <em>Ifc Positive Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcSolidAngleMeasurevalue <em>Ifc Solid Angle Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcThermodynamicTemperatureMeasurevalue <em>Ifc Thermodynamic Temperature Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcTimeMeasurevalue <em>Ifc Time Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMeasureValueImpl#getIfcVolumeMeasurevalue <em>Ifc Volume Measurevalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMeasureValue")
@XmlRootElement(name = "IfcMeasureValueElement")
public class IfcMeasureValueImpl extends CDOObjectImpl implements IfcMeasureValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMeasureValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMeasureValue();
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
	public Double getIfcNormalisedRatioMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcNormalisedRatioMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcNormalisedRatioMeasurevalue(Double newIfcNormalisedRatioMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcNormalisedRatioMeasurevalue(), newIfcNormalisedRatioMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcNormalisedRatioMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcNormalisedRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcNormalisedRatioMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcNormalisedRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLuminousIntensityMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcLuminousIntensityMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLuminousIntensityMeasurevalue(Double newIfcLuminousIntensityMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcLuminousIntensityMeasurevalue(), newIfcLuminousIntensityMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLuminousIntensityMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcLuminousIntensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLuminousIntensityMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcLuminousIntensityMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcAmountOfSubstanceMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcAmountOfSubstanceMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAmountOfSubstanceMeasurevalue(Double newIfcAmountOfSubstanceMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcAmountOfSubstanceMeasurevalue(), newIfcAmountOfSubstanceMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcAmountOfSubstanceMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcAmountOfSubstanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcAmountOfSubstanceMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcAmountOfSubstanceMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcAreaMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcAreaMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAreaMeasurevalue(Double newIfcAreaMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcAreaMeasurevalue(), newIfcAreaMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcAreaMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcAreaMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcAreaMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcAreaMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcContextDependentMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcContextDependentMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcContextDependentMeasurevalue(Double newIfcContextDependentMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcContextDependentMeasurevalue(), newIfcContextDependentMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcContextDependentMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcContextDependentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcContextDependentMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcContextDependentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcCountMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcCountMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCountMeasurevalue(Double newIfcCountMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcCountMeasurevalue(), newIfcCountMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcCountMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcCountMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcCountMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcCountMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfcDescriptiveMeasurevalue() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcDescriptiveMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDescriptiveMeasurevalue(String newIfcDescriptiveMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcDescriptiveMeasurevalue(), newIfcDescriptiveMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcDescriptiveMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcDescriptiveMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcDescriptiveMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcDescriptiveMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcElectricCurrentMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcElectricCurrentMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricCurrentMeasurevalue(Double newIfcElectricCurrentMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcElectricCurrentMeasurevalue(), newIfcElectricCurrentMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcElectricCurrentMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcElectricCurrentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcElectricCurrentMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcElectricCurrentMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcLengthMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcLengthMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLengthMeasurevalue(Double newIfcLengthMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcLengthMeasurevalue(), newIfcLengthMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLengthMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLengthMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPositiveLengthMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPositiveLengthMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPositiveLengthMeasurevalue(Double newIfcPositiveLengthMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPositiveLengthMeasurevalue(), newIfcPositiveLengthMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPositiveLengthMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPositiveLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPositiveLengthMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPositiveLengthMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcMassMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcMassMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMassMeasurevalue(Double newIfcMassMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcMassMeasurevalue(), newIfcMassMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcMassMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcMassMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcMassMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcMassMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcNumericMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcNumericMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcNumericMeasurevalue(Double newIfcNumericMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcNumericMeasurevalue(), newIfcNumericMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcNumericMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcNumericMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcNumericMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcNumericMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcParameterValuevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcParameterValuevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcParameterValuevalue(Double newIfcParameterValuevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcParameterValuevalue(), newIfcParameterValuevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcParameterValuevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcParameterValuevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcParameterValuevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcParameterValuevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPlaneAngleMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPlaneAngleMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPlaneAngleMeasurevalue(Double newIfcPlaneAngleMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPlaneAngleMeasurevalue(), newIfcPlaneAngleMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPlaneAngleMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPlaneAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPlaneAngleMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPlaneAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPositivePlaneAngleMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPositivePlaneAngleMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPositivePlaneAngleMeasurevalue(Double newIfcPositivePlaneAngleMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPositivePlaneAngleMeasurevalue(), newIfcPositivePlaneAngleMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPositivePlaneAngleMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPositivePlaneAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPositivePlaneAngleMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPositivePlaneAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRatioMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcRatioMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRatioMeasurevalue(Double newIfcRatioMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcRatioMeasurevalue(), newIfcRatioMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRatioMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRatioMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcPositiveRatioMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPositiveRatioMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPositiveRatioMeasurevalue(Double newIfcPositiveRatioMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPositiveRatioMeasurevalue(), newIfcPositiveRatioMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPositiveRatioMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPositiveRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPositiveRatioMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcPositiveRatioMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSolidAngleMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcSolidAngleMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSolidAngleMeasurevalue(Double newIfcSolidAngleMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcSolidAngleMeasurevalue(), newIfcSolidAngleMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSolidAngleMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcSolidAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSolidAngleMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcSolidAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcThermodynamicTemperatureMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcThermodynamicTemperatureMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermodynamicTemperatureMeasurevalue(Double newIfcThermodynamicTemperatureMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcThermodynamicTemperatureMeasurevalue(), newIfcThermodynamicTemperatureMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcThermodynamicTemperatureMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcThermodynamicTemperatureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcThermodynamicTemperatureMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcThermodynamicTemperatureMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcTimeMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcTimeMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTimeMeasurevalue(Double newIfcTimeMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcTimeMeasurevalue(), newIfcTimeMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcTimeMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcTimeMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcTimeMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcTimeMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcVolumeMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcVolumeMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVolumeMeasurevalue(Double newIfcVolumeMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcVolumeMeasurevalue(), newIfcVolumeMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcVolumeMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcVolumeMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcVolumeMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMeasureValue_IfcVolumeMeasurevalue());
	}

} //IfcMeasureValueImpl
