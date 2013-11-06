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
import IFC2X3.IfcOwnerHistory;
import IFC2X3.IfcRelAssociates;
import IFC2X3.IfcRoot;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRootImpl#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRootImpl#getOwnerHistory <em>Owner History</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRootImpl#getHasAssociations <em>Has Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRoot")
@XmlSeeAlso({ IfcWorkScheduleImpl.class, IfcWindowPanelPropertiesImpl.class, IfcEnergyPropertiesImpl.class, IfcProjectImpl.class, IfcTypeProductImpl.class, IfcBeamTypeImpl.class, IfcDuctSilencerTypeImpl.class, IfcStructuralActivityImpl.class, IfcElementComponentImpl.class,
		IfcElementAssemblyImpl.class, IfcRelCoversSpacesImpl.class, IfcDistributionChamberElementTypeImpl.class, IfcSpaceThermalLoadPropertiesImpl.class, IfcLampTypeImpl.class, IfcEnergyConversionDeviceImpl.class, IfcRelAssociatesDocumentImpl.class,
		IfcStructuralPointConnectionImpl.class, IfcPropertySetImpl.class, IfcOrderActionImpl.class, IfcStructuralReactionImpl.class, IfcRelAssociatesLibraryImpl.class, IfcGroupImpl.class, IfcFlowSegmentTypeImpl.class, IfcRelSequenceImpl.class, IfcInventoryImpl.class,
		IfcRelProjectsElementImpl.class, IfcFlowTreatmentDeviceImpl.class, IfcStructuralPlanarActionVaryingImpl.class, IfcEdgeFeatureImpl.class, IfcEquipmentStandardImpl.class, IfcConstructionResourceImpl.class, IfcActorImpl.class, IfcCostScheduleImpl.class,
		IfcRelConnectsStructuralMemberImpl.class, IfcRelAssociatesClassificationImpl.class, IfcFastenerTypeImpl.class, IfcTubeBundleTypeImpl.class, IfcDoorLiningPropertiesImpl.class, IfcDistributionChamberElementImpl.class, IfcDiscreteAccessoryTypeImpl.class,
		IfcServiceLifeImpl.class, IfcConstructionProductResourceImpl.class, IfcSlabImpl.class, IfcFeatureElementImpl.class, IfcTendonAnchorImpl.class, IfcFilterTypeImpl.class, IfcProjectionElementImpl.class, IfcFlowTerminalTypeImpl.class,
		IfcStructuralCurveMemberVaryingImpl.class, IfcFlowStorageDeviceTypeImpl.class, IfcOccupantImpl.class, IfcRelDefinesImpl.class, IfcRelContainedInSpatialStructureImpl.class, IfcDoorPanelPropertiesImpl.class, IfcSystemImpl.class, IfcBuildingElementPartImpl.class,
		IfcFluidFlowPropertiesImpl.class, IfcWindowImpl.class, IfcRelAssignsToProductImpl.class, IfcRelDecomposesImpl.class, IfcAirTerminalBoxTypeImpl.class, IfcDistributionPortImpl.class, IfcElectricGeneratorTypeImpl.class, IfcBoilerTypeImpl.class, IfcCrewResourceImpl.class,
		IfcProcessImpl.class, IfcEquipmentElementImpl.class, IfcZoneImpl.class, IfcMotorConnectionTypeImpl.class, IfcProtectiveDeviceTypeImpl.class, IfcRelAssignsToGroupImpl.class, IfcRelConnectsStructuralActivityImpl.class, IfcSpatialStructureElementTypeImpl.class,
		IfcRelAggregatesImpl.class, IfcDuctSegmentTypeImpl.class, IfcBuildingElementProxyTypeImpl.class, IfcAirToAirHeatRecoveryTypeImpl.class, IfcCableCarrierFittingTypeImpl.class, IfcConditionImpl.class, IfcRampImpl.class, IfcCurtainWallTypeImpl.class, IfcRoofImpl.class,
		IfcPumpTypeImpl.class, IfcFlowSegmentImpl.class, IfcCondenserTypeImpl.class, IfcRelCoversBldgElementsImpl.class, IfcColumnImpl.class, IfcFurnishingElementTypeImpl.class, IfcSanitaryTerminalTypeImpl.class, IfcWallImpl.class, IfcColumnTypeImpl.class,
		IfcRelDefinesByTypeImpl.class, IfcResourceImpl.class, IfcProcedureImpl.class, IfcFanTypeImpl.class, IfcElementComponentTypeImpl.class, IfcRampFlightTypeImpl.class, IfcSpaceImpl.class, IfcAssetImpl.class, IfcPlateTypeImpl.class, IfcSubContractResourceImpl.class,
		IfcActionRequestImpl.class, IfcAirTerminalTypeImpl.class, IfcCompressorTypeImpl.class, IfcStairImpl.class, IfcTransformerTypeImpl.class, IfcStructuralActionImpl.class, IfcAlarmTypeImpl.class, IfcActuatorTypeImpl.class, IfcControllerTypeImpl.class, IfcSiteImpl.class,
		IfcAnnotationImpl.class, IfcOpeningElementImpl.class, IfcPipeFittingTypeImpl.class, IfcDistributionFlowElementImpl.class, IfcTypeObjectImpl.class, IfcBuildingElementProxyImpl.class, IfcReinforcingBarImpl.class, IfcDamperTypeImpl.class,
		IfcStructuralPointReactionImpl.class, IfcUnitaryEquipmentTypeImpl.class, IfcSystemFurnitureElementTypeImpl.class, IfcStructuralPointActionImpl.class, IfcPermeableCoveringPropertiesImpl.class, IfcSoundPropertiesImpl.class, IfcRelOverridesPropertiesImpl.class,
		IfcConstructionEquipmentResourceImpl.class, IfcDuctFittingTypeImpl.class, IfcProjectOrderRecordImpl.class, IfcFlowMeterTypeImpl.class, IfcChillerTypeImpl.class, IfcFootingImpl.class, IfcRailingImpl.class, IfcElementQuantityImpl.class,
		IfcElectricDistributionPointImpl.class, IfcDistributionElementTypeImpl.class, IfcElectricFlowStorageDeviceTypeImpl.class, IfcPerformanceHistoryImpl.class, IfcStructuralLinearActionImpl.class, IfcCoolingTowerTypeImpl.class, IfcReinforcementDefinitionPropertiesImpl.class,
		IfcStackTerminalTypeImpl.class, IfcTimeSeriesScheduleImpl.class, IfcStairFlightTypeImpl.class, IfcRelAssignsImpl.class, IfcMoveImpl.class, IfcRailingTypeImpl.class, IfcProxyImpl.class, IfcRelConnectsElementsImpl.class, IfcFlowInstrumentTypeImpl.class,
		IfcRelAssociatesAppliedValueImpl.class, IfcFlowMovingDeviceImpl.class, IfcObjectDefinitionImpl.class, IfcWallStandardCaseImpl.class, IfcEnergyConversionDeviceTypeImpl.class, IfcWorkControlImpl.class, IfcElectricMotorTypeImpl.class, IfcPlateImpl.class,
		IfcRelAssignsToActorImpl.class, IfcConditionCriterionImpl.class, IfcFlowFittingTypeImpl.class, IfcMechanicalFastenerImpl.class, IfcFlowControllerImpl.class, IfcHeatExchangerTypeImpl.class, IfcDistributionControlElementTypeImpl.class, IfcSpaceProgramImpl.class,
		IfcRelSpaceBoundaryImpl.class, IfcRelationshipImpl.class, IfcControlImpl.class, IfcSoundValueImpl.class, IfcStructuralResultGroupImpl.class, IfcTendonImpl.class, IfcRelSchedulesCostItemsImpl.class, IfcCoveringTypeImpl.class, IfcFurnitureStandardImpl.class,
		IfcRelAssociatesProfilePropertiesImpl.class, IfcHumidifierTypeImpl.class, IfcGasTerminalTypeImpl.class, IfcGridImpl.class, IfcRelReferencedInSpatialStructureImpl.class, IfcCoveringImpl.class, IfcChamferEdgeFeatureImpl.class, IfcFlowMovingDeviceTypeImpl.class,
		IfcFlowFittingImpl.class, IfcCableSegmentTypeImpl.class, IfcPileImpl.class, IfcRelAssociatesApprovalImpl.class, IfcBuildingElementTypeImpl.class, IfcEvaporativeCoolerTypeImpl.class, IfcElectricHeaterTypeImpl.class, IfcElectricTimeControlTypeImpl.class,
		IfcFeatureElementSubtractionImpl.class, IfcReinforcingElementImpl.class, IfcRelAssociatesMaterialImpl.class, IfcWorkPlanImpl.class, IfcElementImpl.class, IfcBuildingImpl.class, IfcRelDefinesByPropertiesImpl.class, IfcPipeSegmentTypeImpl.class, IfcTaskImpl.class,
		IfcStructuralConnectionImpl.class, IfcDistributionControlElementImpl.class, IfcSwitchingDeviceTypeImpl.class, IfcStructuralCurveMemberImpl.class, IfcStairFlightImpl.class, IfcRelInteractionRequirementsImpl.class, IfcFastenerImpl.class, IfcMemberTypeImpl.class,
		IfcJunctionBoxTypeImpl.class, IfcLightFixtureTypeImpl.class, IfcElectricalCircuitImpl.class, IfcFurnishingElementImpl.class, IfcRelVoidsElementImpl.class, IfcRelServicesBuildingsImpl.class, IfcDoorStyleImpl.class, IfcDistributionElementImpl.class, IfcValveTypeImpl.class,
		IfcRelAssociatesConstraintImpl.class, IfcStructuralPlanarActionImpl.class, IfcCostItemImpl.class, IfcRelConnectsPortsImpl.class, IfcElectricalBasePropertiesImpl.class, IfcRelNestsImpl.class, IfcFlowTerminalImpl.class, IfcConstructionMaterialResourceImpl.class,
		IfcRelAssignsToProcessImpl.class, IfcStructuralSurfaceMemberVaryingImpl.class, IfcOutletTypeImpl.class, IfcWindowStyleImpl.class, IfcBeamImpl.class, IfcWindowLiningPropertiesImpl.class, IfcRelAssociatesImpl.class, IfcDiscreteAccessoryImpl.class,
		IfcReinforcingMeshImpl.class, IfcPermitImpl.class, IfcBuildingStoreyImpl.class, IfcFurnitureTypeImpl.class, IfcTankTypeImpl.class, IfcWasteTerminalTypeImpl.class, IfcStructuralAnalysisModelImpl.class, IfcRelFillsElementImpl.class, IfcElectricApplianceTypeImpl.class,
		IfcServiceLifeFactorImpl.class, IfcRelAssignsToProjectOrderImpl.class, IfcObjectImpl.class, IfcStructuralItemImpl.class, IfcFeatureElementAdditionImpl.class, IfcStructuralCurveConnectionImpl.class, IfcSpatialStructureElementImpl.class,
		IfcMechanicalFastenerTypeImpl.class, IfcCoilTypeImpl.class, IfcRelAssignsTasksImpl.class, IfcRampFlightImpl.class, IfcMemberImpl.class, IfcFlowControllerTypeImpl.class, IfcFlowTreatmentDeviceTypeImpl.class, IfcRelOccupiesSpacesImpl.class,
		IfcRelConnectsWithEccentricityImpl.class, IfcVirtualElementImpl.class, IfcLaborResourceImpl.class, IfcCableCarrierSegmentTypeImpl.class, IfcSensorTypeImpl.class, IfcPropertyDefinitionImpl.class, IfcRelConnectsStructuralElementImpl.class, IfcCurtainWallImpl.class,
		IfcSlabTypeImpl.class, IfcRelConnectsPathElementsImpl.class, IfcStructuralSurfaceMemberImpl.class, IfcBuildingElementComponentImpl.class, IfcTransportElementImpl.class, IfcRelAssignsToControlImpl.class, IfcTransportElementTypeImpl.class, IfcCooledBeamTypeImpl.class,
		IfcRelAssignsToResourceImpl.class, IfcVibrationIsolatorTypeImpl.class, IfcPropertySetDefinitionImpl.class, IfcStructuralLoadGroupImpl.class, IfcFlowStorageDeviceImpl.class, IfcPortImpl.class, IfcSpaceTypeImpl.class, IfcEvaporatorTypeImpl.class,
		IfcRelConnectsPortToElementImpl.class, IfcRelConnectsWithRealizingElementsImpl.class, IfcSpaceHeaterTypeImpl.class, IfcScheduleTimeControlImpl.class, IfcElementTypeImpl.class, IfcBuildingElementImpl.class, IfcProjectOrderImpl.class,
		IfcDistributionFlowElementTypeImpl.class, IfcRelConnectsImpl.class, IfcStructuralMemberImpl.class, IfcRoundedEdgeFeatureImpl.class, IfcWallTypeImpl.class, IfcStructuralSurfaceConnectionImpl.class, IfcProductImpl.class, IfcElectricalElementImpl.class,
		IfcStructuralLinearActionVaryingImpl.class, IfcDoorImpl.class, IfcRelFlowControlElementsImpl.class, IfcFireSuppressionTerminalTypeImpl.class })
@XmlRootElement(name = "IfcRootElement")
public class IfcRootImpl extends CDOObjectImpl implements IfcRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRoot();
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
	public IfcOwnerHistory getOwnerHistory() {
		return (IfcOwnerHistory)eGet(IFC2X3Package.eINSTANCE.getIfcRoot_OwnerHistory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerHistory(IfcOwnerHistory newOwnerHistory) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRoot_OwnerHistory(), newOwnerHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcRoot_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRoot_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRoot_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRoot_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssociates> getHasAssociations() {
		return (EList<IfcRelAssociates>)eGet(IFC2X3Package.eINSTANCE.getIfcRoot_HasAssociations(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcRoot_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRoot_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRoot_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRoot_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalId() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcRoot_GlobalId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalId(String newGlobalId) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRoot_GlobalId(), newGlobalId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGlobalId() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRoot_GlobalId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGlobalId() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRoot_GlobalId());
	}

} //IfcRootImpl
