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
import IFC2X3.IfcObjectDefinition;
import IFC2X3.IfcRelAssigns;
import IFC2X3.IfcRelDecomposes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Object Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcObjectDefinitionImpl#getHasAssignments <em>Has Assignments</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcObjectDefinitionImpl#getIsDecomposedBy <em>Is Decomposed By</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcObjectDefinitionImpl#getDecomposes <em>Decomposes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcObjectDefinition")
@XmlSeeAlso({ IfcWorkScheduleImpl.class, IfcProjectImpl.class, IfcTypeProductImpl.class, IfcBeamTypeImpl.class, IfcDuctSilencerTypeImpl.class, IfcStructuralActivityImpl.class, IfcElementComponentImpl.class, IfcElementAssemblyImpl.class,
		IfcDistributionChamberElementTypeImpl.class, IfcLampTypeImpl.class, IfcEnergyConversionDeviceImpl.class, IfcStructuralPointConnectionImpl.class, IfcOrderActionImpl.class, IfcStructuralReactionImpl.class, IfcGroupImpl.class, IfcFlowSegmentTypeImpl.class,
		IfcInventoryImpl.class, IfcFlowTreatmentDeviceImpl.class, IfcEquipmentStandardImpl.class, IfcStructuralPlanarActionVaryingImpl.class, IfcEdgeFeatureImpl.class, IfcConstructionResourceImpl.class, IfcActorImpl.class, IfcCostScheduleImpl.class, IfcFastenerTypeImpl.class,
		IfcTubeBundleTypeImpl.class, IfcDistributionChamberElementImpl.class, IfcDiscreteAccessoryTypeImpl.class, IfcServiceLifeImpl.class, IfcConstructionProductResourceImpl.class, IfcFeatureElementImpl.class, IfcSlabImpl.class, IfcTendonAnchorImpl.class,
		IfcFilterTypeImpl.class, IfcProjectionElementImpl.class, IfcFlowTerminalTypeImpl.class, IfcStructuralCurveMemberVaryingImpl.class, IfcFlowStorageDeviceTypeImpl.class, IfcOccupantImpl.class, IfcSystemImpl.class, IfcBuildingElementPartImpl.class, IfcWindowImpl.class,
		IfcAirTerminalBoxTypeImpl.class, IfcDistributionPortImpl.class, IfcElectricGeneratorTypeImpl.class, IfcBoilerTypeImpl.class, IfcCrewResourceImpl.class, IfcProcessImpl.class, IfcEquipmentElementImpl.class, IfcZoneImpl.class, IfcMotorConnectionTypeImpl.class,
		IfcProtectiveDeviceTypeImpl.class, IfcSpatialStructureElementTypeImpl.class, IfcDuctSegmentTypeImpl.class, IfcBuildingElementProxyTypeImpl.class, IfcAirToAirHeatRecoveryTypeImpl.class, IfcCableCarrierFittingTypeImpl.class, IfcConditionImpl.class, IfcRampImpl.class,
		IfcCurtainWallTypeImpl.class, IfcRoofImpl.class, IfcPumpTypeImpl.class, IfcFlowSegmentImpl.class, IfcCondenserTypeImpl.class, IfcColumnImpl.class, IfcFurnishingElementTypeImpl.class, IfcSanitaryTerminalTypeImpl.class, IfcWallImpl.class, IfcColumnTypeImpl.class,
		IfcResourceImpl.class, IfcProcedureImpl.class, IfcFanTypeImpl.class, IfcElementComponentTypeImpl.class, IfcSpaceImpl.class, IfcRampFlightTypeImpl.class, IfcAssetImpl.class, IfcPlateTypeImpl.class, IfcSubContractResourceImpl.class, IfcActionRequestImpl.class,
		IfcAirTerminalTypeImpl.class, IfcCompressorTypeImpl.class, IfcStairImpl.class, IfcTransformerTypeImpl.class, IfcStructuralActionImpl.class, IfcAlarmTypeImpl.class, IfcActuatorTypeImpl.class, IfcControllerTypeImpl.class, IfcSiteImpl.class, IfcAnnotationImpl.class,
		IfcOpeningElementImpl.class, IfcPipeFittingTypeImpl.class, IfcDistributionFlowElementImpl.class, IfcTypeObjectImpl.class, IfcBuildingElementProxyImpl.class, IfcDamperTypeImpl.class, IfcReinforcingBarImpl.class, IfcStructuralPointReactionImpl.class,
		IfcUnitaryEquipmentTypeImpl.class, IfcSystemFurnitureElementTypeImpl.class, IfcStructuralPointActionImpl.class, IfcConstructionEquipmentResourceImpl.class, IfcDuctFittingTypeImpl.class, IfcProjectOrderRecordImpl.class, IfcFlowMeterTypeImpl.class,
		IfcChillerTypeImpl.class, IfcFootingImpl.class, IfcRailingImpl.class, IfcElectricDistributionPointImpl.class, IfcDistributionElementTypeImpl.class, IfcElectricFlowStorageDeviceTypeImpl.class, IfcPerformanceHistoryImpl.class, IfcStructuralLinearActionImpl.class,
		IfcCoolingTowerTypeImpl.class, IfcStackTerminalTypeImpl.class, IfcTimeSeriesScheduleImpl.class, IfcStairFlightTypeImpl.class, IfcMoveImpl.class, IfcRailingTypeImpl.class, IfcProxyImpl.class, IfcFlowInstrumentTypeImpl.class, IfcFlowMovingDeviceImpl.class,
		IfcEnergyConversionDeviceTypeImpl.class, IfcWorkControlImpl.class, IfcWallStandardCaseImpl.class, IfcElectricMotorTypeImpl.class, IfcPlateImpl.class, IfcConditionCriterionImpl.class, IfcFlowFittingTypeImpl.class, IfcMechanicalFastenerImpl.class,
		IfcFlowControllerImpl.class, IfcHeatExchangerTypeImpl.class, IfcSpaceProgramImpl.class, IfcDistributionControlElementTypeImpl.class, IfcControlImpl.class, IfcStructuralResultGroupImpl.class, IfcTendonImpl.class, IfcCoveringTypeImpl.class, IfcFurnitureStandardImpl.class,
		IfcHumidifierTypeImpl.class, IfcGasTerminalTypeImpl.class, IfcGridImpl.class, IfcChamferEdgeFeatureImpl.class, IfcCoveringImpl.class, IfcFlowMovingDeviceTypeImpl.class, IfcFlowFittingImpl.class, IfcCableSegmentTypeImpl.class, IfcPileImpl.class,
		IfcBuildingElementTypeImpl.class, IfcEvaporativeCoolerTypeImpl.class, IfcElectricHeaterTypeImpl.class, IfcElectricTimeControlTypeImpl.class, IfcFeatureElementSubtractionImpl.class, IfcReinforcingElementImpl.class, IfcWorkPlanImpl.class, IfcBuildingImpl.class,
		IfcElementImpl.class, IfcTaskImpl.class, IfcPipeSegmentTypeImpl.class, IfcStructuralConnectionImpl.class, IfcDistributionControlElementImpl.class, IfcSwitchingDeviceTypeImpl.class, IfcStructuralCurveMemberImpl.class, IfcStairFlightImpl.class, IfcFastenerImpl.class,
		IfcMemberTypeImpl.class, IfcJunctionBoxTypeImpl.class, IfcLightFixtureTypeImpl.class, IfcFurnishingElementImpl.class, IfcElectricalCircuitImpl.class, IfcDoorStyleImpl.class, IfcDistributionElementImpl.class, IfcValveTypeImpl.class, IfcCostItemImpl.class,
		IfcStructuralPlanarActionImpl.class, IfcFlowTerminalImpl.class, IfcConstructionMaterialResourceImpl.class, IfcStructuralSurfaceMemberVaryingImpl.class, IfcBeamImpl.class, IfcOutletTypeImpl.class, IfcWindowStyleImpl.class, IfcDiscreteAccessoryImpl.class,
		IfcReinforcingMeshImpl.class, IfcPermitImpl.class, IfcBuildingStoreyImpl.class, IfcFurnitureTypeImpl.class, IfcTankTypeImpl.class, IfcWasteTerminalTypeImpl.class, IfcStructuralAnalysisModelImpl.class, IfcElectricApplianceTypeImpl.class, IfcObjectImpl.class,
		IfcStructuralItemImpl.class, IfcStructuralCurveConnectionImpl.class, IfcFeatureElementAdditionImpl.class, IfcSpatialStructureElementImpl.class, IfcMechanicalFastenerTypeImpl.class, IfcCoilTypeImpl.class, IfcMemberImpl.class, IfcRampFlightImpl.class,
		IfcFlowControllerTypeImpl.class, IfcFlowTreatmentDeviceTypeImpl.class, IfcVirtualElementImpl.class, IfcLaborResourceImpl.class, IfcCableCarrierSegmentTypeImpl.class, IfcSensorTypeImpl.class, IfcCurtainWallImpl.class, IfcSlabTypeImpl.class,
		IfcStructuralSurfaceMemberImpl.class, IfcBuildingElementComponentImpl.class, IfcTransportElementTypeImpl.class, IfcTransportElementImpl.class, IfcCooledBeamTypeImpl.class, IfcVibrationIsolatorTypeImpl.class, IfcStructuralLoadGroupImpl.class,
		IfcFlowStorageDeviceImpl.class, IfcPortImpl.class, IfcEvaporatorTypeImpl.class, IfcSpaceTypeImpl.class, IfcSpaceHeaterTypeImpl.class, IfcScheduleTimeControlImpl.class, IfcElementTypeImpl.class, IfcBuildingElementImpl.class, IfcProjectOrderImpl.class,
		IfcDistributionFlowElementTypeImpl.class, IfcStructuralMemberImpl.class, IfcRoundedEdgeFeatureImpl.class, IfcWallTypeImpl.class, IfcStructuralSurfaceConnectionImpl.class, IfcProductImpl.class, IfcElectricalElementImpl.class, IfcDoorImpl.class,
		IfcStructuralLinearActionVaryingImpl.class, IfcFireSuppressionTerminalTypeImpl.class })
@XmlRootElement(name = "IfcObjectDefinitionElement")
public class IfcObjectDefinitionImpl extends IfcRootImpl implements IfcObjectDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcObjectDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcObjectDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssigns> getHasAssignments() {
		return (EList<IfcRelAssigns>)eGet(IFC2X3Package.eINSTANCE.getIfcObjectDefinition_HasAssignments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelDecomposes> getIsDecomposedBy() {
		return (EList<IfcRelDecomposes>)eGet(IFC2X3Package.eINSTANCE.getIfcObjectDefinition_IsDecomposedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelDecomposes getDecomposes() {
		return (IfcRelDecomposes)eGet(IFC2X3Package.eINSTANCE.getIfcObjectDefinition_Decomposes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposes(IfcRelDecomposes newDecomposes) {
		eSet(IFC2X3Package.eINSTANCE.getIfcObjectDefinition_Decomposes(), newDecomposes);
	}

} //IfcObjectDefinitionImpl
