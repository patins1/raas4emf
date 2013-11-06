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
import IFC2X3.IfcDimensionalExponents;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Dimensional Exponents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDimensionalExponentsImpl#getLengthExponent <em>Length Exponent</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDimensionalExponentsImpl#getMassExponent <em>Mass Exponent</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDimensionalExponentsImpl#getTimeExponent <em>Time Exponent</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDimensionalExponentsImpl#getElectricCurrentExponent <em>Electric Current Exponent</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDimensionalExponentsImpl#getThermodynamicTemperatureExponent <em>Thermodynamic Temperature Exponent</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDimensionalExponentsImpl#getAmountOfSubstanceExponent <em>Amount Of Substance Exponent</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDimensionalExponentsImpl#getLuminousIntensityExponent <em>Luminous Intensity Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDimensionalExponents")
@XmlRootElement(name = "IfcDimensionalExponentsElement")
public class IfcDimensionalExponentsImpl extends CDOObjectImpl implements IfcDimensionalExponents {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDimensionalExponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDimensionalExponents();
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
	public Integer getLuminousIntensityExponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_LuminousIntensityExponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuminousIntensityExponent(Integer newLuminousIntensityExponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_LuminousIntensityExponent(), newLuminousIntensityExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLuminousIntensityExponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_LuminousIntensityExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLuminousIntensityExponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_LuminousIntensityExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAmountOfSubstanceExponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_AmountOfSubstanceExponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountOfSubstanceExponent(Integer newAmountOfSubstanceExponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_AmountOfSubstanceExponent(), newAmountOfSubstanceExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAmountOfSubstanceExponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_AmountOfSubstanceExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAmountOfSubstanceExponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_AmountOfSubstanceExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getThermodynamicTemperatureExponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_ThermodynamicTemperatureExponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermodynamicTemperatureExponent(Integer newThermodynamicTemperatureExponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_ThermodynamicTemperatureExponent(), newThermodynamicTemperatureExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermodynamicTemperatureExponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_ThermodynamicTemperatureExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermodynamicTemperatureExponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_ThermodynamicTemperatureExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getElectricCurrentExponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_ElectricCurrentExponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectricCurrentExponent(Integer newElectricCurrentExponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_ElectricCurrentExponent(), newElectricCurrentExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElectricCurrentExponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_ElectricCurrentExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElectricCurrentExponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_ElectricCurrentExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTimeExponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_TimeExponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeExponent(Integer newTimeExponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_TimeExponent(), newTimeExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeExponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_TimeExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeExponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_TimeExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMassExponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_MassExponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassExponent(Integer newMassExponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_MassExponent(), newMassExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMassExponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_MassExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMassExponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_MassExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLengthExponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_LengthExponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthExponent(Integer newLengthExponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_LengthExponent(), newLengthExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLengthExponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_LengthExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLengthExponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDimensionalExponents_LengthExponent());
	}

} //IfcDimensionalExponentsImpl
