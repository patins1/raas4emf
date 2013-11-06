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
import IFC2X3.IfcElectricCurrentEnum;
import IFC2X3.IfcElectricalBaseProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Electrical Base Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcElectricalBasePropertiesImpl#getElectricCurrentType <em>Electric Current Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcElectricalBasePropertiesImpl#getInputVoltage <em>Input Voltage</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcElectricalBasePropertiesImpl#getInputFrequency <em>Input Frequency</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcElectricalBasePropertiesImpl#getFullLoadCurrent <em>Full Load Current</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcElectricalBasePropertiesImpl#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcElectricalBasePropertiesImpl#getMaximumPowerInput <em>Maximum Power Input</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcElectricalBasePropertiesImpl#getRatedPowerInput <em>Rated Power Input</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcElectricalBasePropertiesImpl#getInputPhase <em>Input Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcElectricalBaseProperties")
@XmlRootElement(name = "IfcElectricalBasePropertiesElement")
public class IfcElectricalBasePropertiesImpl extends IfcEnergyPropertiesImpl implements IfcElectricalBaseProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElectricalBasePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInputPhase() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_InputPhase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPhase(Integer newInputPhase) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_InputPhase(), newInputPhase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInputPhase() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_InputPhase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputPhase() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_InputPhase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRatedPowerInput() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_RatedPowerInput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedPowerInput(Double newRatedPowerInput) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_RatedPowerInput(), newRatedPowerInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRatedPowerInput() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_RatedPowerInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRatedPowerInput() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_RatedPowerInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaximumPowerInput() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_MaximumPowerInput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumPowerInput(Double newMaximumPowerInput) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_MaximumPowerInput(), newMaximumPowerInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumPowerInput() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_MaximumPowerInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumPowerInput() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_MaximumPowerInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimumCircuitCurrent() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_MinimumCircuitCurrent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumCircuitCurrent(Double newMinimumCircuitCurrent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_MinimumCircuitCurrent(), newMinimumCircuitCurrent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumCircuitCurrent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_MinimumCircuitCurrent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumCircuitCurrent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_MinimumCircuitCurrent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFullLoadCurrent() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_FullLoadCurrent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullLoadCurrent(Double newFullLoadCurrent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_FullLoadCurrent(), newFullLoadCurrent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFullLoadCurrent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_FullLoadCurrent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFullLoadCurrent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_FullLoadCurrent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getInputFrequency() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_InputFrequency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFrequency(Double newInputFrequency) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_InputFrequency(), newInputFrequency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInputFrequency() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_InputFrequency());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputFrequency() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_InputFrequency());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getInputVoltage() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_InputVoltage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputVoltage(Double newInputVoltage) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_InputVoltage(), newInputVoltage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInputVoltage() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_InputVoltage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputVoltage() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_InputVoltage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricCurrentEnum getElectricCurrentType() {
		return (IfcElectricCurrentEnum)eGet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_ElectricCurrentType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectricCurrentType(IfcElectricCurrentEnum newElectricCurrentType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_ElectricCurrentType(), newElectricCurrentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElectricCurrentType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_ElectricCurrentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElectricCurrentType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricalBaseProperties_ElectricCurrentType());
	}

} //IfcElectricalBasePropertiesImpl
