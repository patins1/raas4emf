/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcPropertySetDefinition;
import IFC2X3.IfcRelDefinesByType;
import IFC2X3.IfcTypeObject;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTypeObjectImpl#getApplicableOccurrence <em>Applicable Occurrence</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTypeObjectImpl#getHasPropertySets <em>Has Property Sets</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTypeObjectImpl#getObjectTypeOf <em>Object Type Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTypeObject")
@XmlSeeAlso({ IfcCurtainWallTypeImpl.class, IfcRailingTypeImpl.class, IfcPumpTypeImpl.class, IfcCondenserTypeImpl.class, IfcTypeProductImpl.class, IfcBeamTypeImpl.class, IfcDuctSilencerTypeImpl.class, IfcFurnishingElementTypeImpl.class, IfcFlowInstrumentTypeImpl.class,
		IfcSanitaryTerminalTypeImpl.class, IfcColumnTypeImpl.class, IfcDistributionChamberElementTypeImpl.class, IfcWindowStyleImpl.class, IfcOutletTypeImpl.class, IfcEnergyConversionDeviceTypeImpl.class, IfcLampTypeImpl.class, IfcFanTypeImpl.class,
		IfcElectricMotorTypeImpl.class, IfcElementComponentTypeImpl.class, IfcRampFlightTypeImpl.class, IfcPlateTypeImpl.class, IfcFlowFittingTypeImpl.class, IfcHeatExchangerTypeImpl.class, IfcFurnitureTypeImpl.class, IfcFlowSegmentTypeImpl.class, IfcCompressorTypeImpl.class,
		IfcAirTerminalTypeImpl.class, IfcTankTypeImpl.class, IfcDistributionControlElementTypeImpl.class, IfcWasteTerminalTypeImpl.class, IfcTransformerTypeImpl.class, IfcElectricApplianceTypeImpl.class, IfcAlarmTypeImpl.class, IfcActuatorTypeImpl.class,
		IfcControllerTypeImpl.class, IfcCoveringTypeImpl.class, IfcMechanicalFastenerTypeImpl.class, IfcFastenerTypeImpl.class, IfcCoilTypeImpl.class, IfcTubeBundleTypeImpl.class, IfcDiscreteAccessoryTypeImpl.class, IfcHumidifierTypeImpl.class, IfcFlowControllerTypeImpl.class,
		IfcGasTerminalTypeImpl.class, IfcFlowTreatmentDeviceTypeImpl.class, IfcPipeFittingTypeImpl.class, IfcFlowMovingDeviceTypeImpl.class, IfcDamperTypeImpl.class, IfcFilterTypeImpl.class, IfcUnitaryEquipmentTypeImpl.class, IfcCableSegmentTypeImpl.class,
		IfcSystemFurnitureElementTypeImpl.class, IfcCableCarrierSegmentTypeImpl.class, IfcFlowTerminalTypeImpl.class, IfcBuildingElementTypeImpl.class, IfcSensorTypeImpl.class, IfcFlowStorageDeviceTypeImpl.class, IfcEvaporativeCoolerTypeImpl.class,
		IfcElectricHeaterTypeImpl.class, IfcDuctFittingTypeImpl.class, IfcSlabTypeImpl.class, IfcElectricTimeControlTypeImpl.class, IfcTransportElementTypeImpl.class, IfcCooledBeamTypeImpl.class, IfcFlowMeterTypeImpl.class, IfcChillerTypeImpl.class,
		IfcVibrationIsolatorTypeImpl.class, IfcAirTerminalBoxTypeImpl.class, IfcPipeSegmentTypeImpl.class, IfcSwitchingDeviceTypeImpl.class, IfcElectricGeneratorTypeImpl.class, IfcBoilerTypeImpl.class, IfcEvaporatorTypeImpl.class, IfcSpaceTypeImpl.class,
		IfcSpaceHeaterTypeImpl.class, IfcDistributionElementTypeImpl.class, IfcProtectiveDeviceTypeImpl.class, IfcMotorConnectionTypeImpl.class, IfcElementTypeImpl.class, IfcElectricFlowStorageDeviceTypeImpl.class, IfcMemberTypeImpl.class,
		IfcDistributionFlowElementTypeImpl.class, IfcJunctionBoxTypeImpl.class, IfcLightFixtureTypeImpl.class, IfcCoolingTowerTypeImpl.class, IfcWallTypeImpl.class, IfcSpatialStructureElementTypeImpl.class, IfcDuctSegmentTypeImpl.class, IfcBuildingElementProxyTypeImpl.class,
		IfcAirToAirHeatRecoveryTypeImpl.class, IfcStackTerminalTypeImpl.class, IfcCableCarrierFittingTypeImpl.class, IfcDoorStyleImpl.class, IfcStairFlightTypeImpl.class, IfcFireSuppressionTerminalTypeImpl.class, IfcValveTypeImpl.class })
@XmlRootElement(name = "IfcTypeObjectElement")
public class IfcTypeObjectImpl extends IfcObjectDefinitionImpl implements IfcTypeObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTypeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTypeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelDefinesByType getObjectTypeOf() {
		return (IfcRelDefinesByType)eGet(IFC2X3Package.eINSTANCE.getIfcTypeObject_ObjectTypeOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectTypeOf(IfcRelDefinesByType newObjectTypeOf) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTypeObject_ObjectTypeOf(), newObjectTypeOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPropertySetDefinition> getHasPropertySets() {
		return (EList<IfcPropertySetDefinition>)eGet(IFC2X3Package.eINSTANCE.getIfcTypeObject_HasPropertySets(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicableOccurrence() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTypeObject_ApplicableOccurrence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableOccurrence(String newApplicableOccurrence) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTypeObject_ApplicableOccurrence(), newApplicableOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicableOccurrence() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTypeObject_ApplicableOccurrence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicableOccurrence() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTypeObject_ApplicableOccurrence());
	}

} //IfcTypeObjectImpl
