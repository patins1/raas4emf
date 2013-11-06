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
import IFC2X3.IfcDistributionFlowElementType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Distribution Flow Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDistributionFlowElementType")
@XmlSeeAlso({ IfcPumpTypeImpl.class, IfcCondenserTypeImpl.class, IfcDuctSilencerTypeImpl.class, IfcSanitaryTerminalTypeImpl.class, IfcOutletTypeImpl.class, IfcDistributionChamberElementTypeImpl.class, IfcEnergyConversionDeviceTypeImpl.class, IfcLampTypeImpl.class,
		IfcFanTypeImpl.class, IfcElectricMotorTypeImpl.class, IfcFlowFittingTypeImpl.class, IfcHeatExchangerTypeImpl.class, IfcFlowSegmentTypeImpl.class, IfcCompressorTypeImpl.class, IfcAirTerminalTypeImpl.class, IfcTankTypeImpl.class, IfcWasteTerminalTypeImpl.class,
		IfcTransformerTypeImpl.class, IfcElectricApplianceTypeImpl.class, IfcCoilTypeImpl.class, IfcTubeBundleTypeImpl.class, IfcHumidifierTypeImpl.class, IfcFlowControllerTypeImpl.class, IfcGasTerminalTypeImpl.class, IfcFlowTreatmentDeviceTypeImpl.class,
		IfcPipeFittingTypeImpl.class, IfcFlowMovingDeviceTypeImpl.class, IfcDamperTypeImpl.class, IfcFilterTypeImpl.class, IfcUnitaryEquipmentTypeImpl.class, IfcCableSegmentTypeImpl.class, IfcCableCarrierSegmentTypeImpl.class, IfcFlowTerminalTypeImpl.class,
		IfcFlowStorageDeviceTypeImpl.class, IfcEvaporativeCoolerTypeImpl.class, IfcElectricHeaterTypeImpl.class, IfcDuctFittingTypeImpl.class, IfcElectricTimeControlTypeImpl.class, IfcCooledBeamTypeImpl.class, IfcFlowMeterTypeImpl.class, IfcChillerTypeImpl.class,
		IfcAirTerminalBoxTypeImpl.class, IfcPipeSegmentTypeImpl.class, IfcSwitchingDeviceTypeImpl.class, IfcElectricGeneratorTypeImpl.class, IfcBoilerTypeImpl.class, IfcEvaporatorTypeImpl.class, IfcSpaceHeaterTypeImpl.class, IfcMotorConnectionTypeImpl.class,
		IfcProtectiveDeviceTypeImpl.class, IfcElectricFlowStorageDeviceTypeImpl.class, IfcJunctionBoxTypeImpl.class, IfcLightFixtureTypeImpl.class, IfcCoolingTowerTypeImpl.class, IfcDuctSegmentTypeImpl.class, IfcAirToAirHeatRecoveryTypeImpl.class,
		IfcCableCarrierFittingTypeImpl.class, IfcStackTerminalTypeImpl.class, IfcFireSuppressionTerminalTypeImpl.class, IfcValveTypeImpl.class })
@XmlRootElement(name = "IfcDistributionFlowElementTypeElement")
public class IfcDistributionFlowElementTypeImpl extends IfcDistributionElementTypeImpl implements IfcDistributionFlowElementType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDistributionFlowElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDistributionFlowElementType();
	}

} //IfcDistributionFlowElementTypeImpl
