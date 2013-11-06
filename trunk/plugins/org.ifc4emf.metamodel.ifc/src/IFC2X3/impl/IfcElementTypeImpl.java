/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcElementType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcElementTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcElementType")
@XmlSeeAlso({ IfcCurtainWallTypeImpl.class, IfcRailingTypeImpl.class, IfcPumpTypeImpl.class, IfcCondenserTypeImpl.class, IfcBeamTypeImpl.class, IfcFurnishingElementTypeImpl.class, IfcDuctSilencerTypeImpl.class, IfcFlowInstrumentTypeImpl.class, IfcSanitaryTerminalTypeImpl.class,
		IfcColumnTypeImpl.class, IfcOutletTypeImpl.class, IfcDistributionChamberElementTypeImpl.class, IfcEnergyConversionDeviceTypeImpl.class, IfcLampTypeImpl.class, IfcFanTypeImpl.class, IfcElectricMotorTypeImpl.class, IfcElementComponentTypeImpl.class,
		IfcRampFlightTypeImpl.class, IfcPlateTypeImpl.class, IfcFlowFittingTypeImpl.class, IfcHeatExchangerTypeImpl.class, IfcFurnitureTypeImpl.class, IfcFlowSegmentTypeImpl.class, IfcCompressorTypeImpl.class, IfcAirTerminalTypeImpl.class,
		IfcDistributionControlElementTypeImpl.class, IfcWasteTerminalTypeImpl.class, IfcTankTypeImpl.class, IfcTransformerTypeImpl.class, IfcElectricApplianceTypeImpl.class, IfcAlarmTypeImpl.class, IfcActuatorTypeImpl.class, IfcControllerTypeImpl.class,
		IfcCoveringTypeImpl.class, IfcMechanicalFastenerTypeImpl.class, IfcFastenerTypeImpl.class, IfcCoilTypeImpl.class, IfcTubeBundleTypeImpl.class, IfcDiscreteAccessoryTypeImpl.class, IfcHumidifierTypeImpl.class, IfcFlowControllerTypeImpl.class, IfcGasTerminalTypeImpl.class,
		IfcFlowTreatmentDeviceTypeImpl.class, IfcPipeFittingTypeImpl.class, IfcFlowMovingDeviceTypeImpl.class, IfcDamperTypeImpl.class, IfcFilterTypeImpl.class, IfcUnitaryEquipmentTypeImpl.class, IfcCableSegmentTypeImpl.class, IfcSystemFurnitureElementTypeImpl.class,
		IfcCableCarrierSegmentTypeImpl.class, IfcSensorTypeImpl.class, IfcFlowTerminalTypeImpl.class, IfcBuildingElementTypeImpl.class, IfcFlowStorageDeviceTypeImpl.class, IfcEvaporativeCoolerTypeImpl.class, IfcElectricHeaterTypeImpl.class, IfcDuctFittingTypeImpl.class,
		IfcSlabTypeImpl.class, IfcElectricTimeControlTypeImpl.class, IfcTransportElementTypeImpl.class, IfcFlowMeterTypeImpl.class, IfcCooledBeamTypeImpl.class, IfcChillerTypeImpl.class, IfcVibrationIsolatorTypeImpl.class, IfcPipeSegmentTypeImpl.class,
		IfcAirTerminalBoxTypeImpl.class, IfcSwitchingDeviceTypeImpl.class, IfcElectricGeneratorTypeImpl.class, IfcBoilerTypeImpl.class, IfcSpaceTypeImpl.class, IfcEvaporatorTypeImpl.class, IfcSpaceHeaterTypeImpl.class, IfcDistributionElementTypeImpl.class,
		IfcMotorConnectionTypeImpl.class, IfcProtectiveDeviceTypeImpl.class, IfcElectricFlowStorageDeviceTypeImpl.class, IfcDistributionFlowElementTypeImpl.class, IfcMemberTypeImpl.class, IfcJunctionBoxTypeImpl.class, IfcLightFixtureTypeImpl.class, IfcCoolingTowerTypeImpl.class,
		IfcWallTypeImpl.class, IfcSpatialStructureElementTypeImpl.class, IfcDuctSegmentTypeImpl.class, IfcBuildingElementProxyTypeImpl.class, IfcAirToAirHeatRecoveryTypeImpl.class, IfcCableCarrierFittingTypeImpl.class, IfcStackTerminalTypeImpl.class,
		IfcStairFlightTypeImpl.class, IfcFireSuppressionTerminalTypeImpl.class, IfcValveTypeImpl.class })
@XmlRootElement(name = "IfcElementTypeElement")
public class IfcElementTypeImpl extends IfcTypeProductImpl implements IfcElementType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcElementType_ElementType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(String newElementType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElementType_ElementType(), newElementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElementType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElementType_ElementType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElementType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElementType_ElementType());
	}

} //IfcElementTypeImpl
