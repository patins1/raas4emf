/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcRepresentationMap;
import IFC2X3.IfcTypeProduct;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Type Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTypeProductImpl#getRepresentationMaps <em>Representation Maps</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTypeProductImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTypeProduct")
@XmlSeeAlso({ IfcCurtainWallTypeImpl.class, IfcRailingTypeImpl.class, IfcPumpTypeImpl.class, IfcCondenserTypeImpl.class, IfcBeamTypeImpl.class, IfcFurnishingElementTypeImpl.class, IfcDuctSilencerTypeImpl.class, IfcFlowInstrumentTypeImpl.class, IfcSanitaryTerminalTypeImpl.class,
		IfcColumnTypeImpl.class, IfcOutletTypeImpl.class, IfcWindowStyleImpl.class, IfcDistributionChamberElementTypeImpl.class, IfcEnergyConversionDeviceTypeImpl.class, IfcLampTypeImpl.class, IfcFanTypeImpl.class, IfcElectricMotorTypeImpl.class,
		IfcElementComponentTypeImpl.class, IfcRampFlightTypeImpl.class, IfcPlateTypeImpl.class, IfcFlowFittingTypeImpl.class, IfcHeatExchangerTypeImpl.class, IfcFurnitureTypeImpl.class, IfcFlowSegmentTypeImpl.class, IfcCompressorTypeImpl.class, IfcAirTerminalTypeImpl.class,
		IfcDistributionControlElementTypeImpl.class, IfcWasteTerminalTypeImpl.class, IfcTankTypeImpl.class, IfcTransformerTypeImpl.class, IfcElectricApplianceTypeImpl.class, IfcAlarmTypeImpl.class, IfcActuatorTypeImpl.class, IfcControllerTypeImpl.class,
		IfcCoveringTypeImpl.class, IfcMechanicalFastenerTypeImpl.class, IfcFastenerTypeImpl.class, IfcCoilTypeImpl.class, IfcTubeBundleTypeImpl.class, IfcDiscreteAccessoryTypeImpl.class, IfcHumidifierTypeImpl.class, IfcFlowControllerTypeImpl.class, IfcGasTerminalTypeImpl.class,
		IfcFlowTreatmentDeviceTypeImpl.class, IfcPipeFittingTypeImpl.class, IfcFlowMovingDeviceTypeImpl.class, IfcDamperTypeImpl.class, IfcFilterTypeImpl.class, IfcUnitaryEquipmentTypeImpl.class, IfcCableSegmentTypeImpl.class, IfcSystemFurnitureElementTypeImpl.class,
		IfcCableCarrierSegmentTypeImpl.class, IfcSensorTypeImpl.class, IfcFlowTerminalTypeImpl.class, IfcBuildingElementTypeImpl.class, IfcFlowStorageDeviceTypeImpl.class, IfcEvaporativeCoolerTypeImpl.class, IfcElectricHeaterTypeImpl.class, IfcDuctFittingTypeImpl.class,
		IfcSlabTypeImpl.class, IfcElectricTimeControlTypeImpl.class, IfcTransportElementTypeImpl.class, IfcFlowMeterTypeImpl.class, IfcCooledBeamTypeImpl.class, IfcChillerTypeImpl.class, IfcVibrationIsolatorTypeImpl.class, IfcPipeSegmentTypeImpl.class,
		IfcAirTerminalBoxTypeImpl.class, IfcSwitchingDeviceTypeImpl.class, IfcElectricGeneratorTypeImpl.class, IfcBoilerTypeImpl.class, IfcSpaceTypeImpl.class, IfcEvaporatorTypeImpl.class, IfcSpaceHeaterTypeImpl.class, IfcDistributionElementTypeImpl.class,
		IfcElementTypeImpl.class, IfcMotorConnectionTypeImpl.class, IfcProtectiveDeviceTypeImpl.class, IfcElectricFlowStorageDeviceTypeImpl.class, IfcDistributionFlowElementTypeImpl.class, IfcMemberTypeImpl.class, IfcJunctionBoxTypeImpl.class, IfcLightFixtureTypeImpl.class,
		IfcCoolingTowerTypeImpl.class, IfcWallTypeImpl.class, IfcSpatialStructureElementTypeImpl.class, IfcDuctSegmentTypeImpl.class, IfcBuildingElementProxyTypeImpl.class, IfcAirToAirHeatRecoveryTypeImpl.class, IfcDoorStyleImpl.class, IfcCableCarrierFittingTypeImpl.class,
		IfcStackTerminalTypeImpl.class, IfcStairFlightTypeImpl.class, IfcFireSuppressionTerminalTypeImpl.class, IfcValveTypeImpl.class })
@XmlRootElement(name = "IfcTypeProductElement")
public class IfcTypeProductImpl extends IfcTypeObjectImpl implements IfcTypeProduct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTypeProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTypeProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRepresentationMap> getRepresentationMaps() {
		return (EList<IfcRepresentationMap>)eGet(IFC2X3Package.eINSTANCE.getIfcTypeProduct_RepresentationMaps(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTypeProduct_Tag(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTypeProduct_Tag(), newTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTag() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTypeProduct_Tag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTag() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTypeProduct_Tag());
	}

} //IfcTypeProductImpl
