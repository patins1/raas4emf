/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcObject;
import IFC2X3.IfcRelDefines;

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
 * An implementation of the model object '<em><b>Ifc Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcObjectImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcObjectImpl#getIsDefinedBy <em>Is Defined By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcObject")
@XmlSeeAlso({ IfcMoveImpl.class, IfcWorkScheduleImpl.class, IfcProxyImpl.class, IfcProjectImpl.class, IfcStructuralActivityImpl.class, IfcElementComponentImpl.class, IfcElementAssemblyImpl.class, IfcFlowMovingDeviceImpl.class, IfcWorkControlImpl.class,
		IfcWallStandardCaseImpl.class, IfcEnergyConversionDeviceImpl.class, IfcStructuralPointConnectionImpl.class, IfcPlateImpl.class, IfcStructuralReactionImpl.class, IfcOrderActionImpl.class, IfcConditionCriterionImpl.class, IfcMechanicalFastenerImpl.class,
		IfcGroupImpl.class, IfcFlowControllerImpl.class, IfcSpaceProgramImpl.class, IfcInventoryImpl.class, IfcFlowTreatmentDeviceImpl.class, IfcEdgeFeatureImpl.class, IfcControlImpl.class, IfcStructuralPlanarActionVaryingImpl.class, IfcEquipmentStandardImpl.class,
		IfcConstructionResourceImpl.class, IfcStructuralResultGroupImpl.class, IfcActorImpl.class, IfcCostScheduleImpl.class, IfcTendonImpl.class, IfcFurnitureStandardImpl.class, IfcDistributionChamberElementImpl.class, IfcServiceLifeImpl.class, IfcGridImpl.class,
		IfcConstructionProductResourceImpl.class, IfcChamferEdgeFeatureImpl.class, IfcFeatureElementImpl.class, IfcCoveringImpl.class, IfcSlabImpl.class, IfcFlowFittingImpl.class, IfcTendonAnchorImpl.class, IfcProjectionElementImpl.class, IfcPileImpl.class,
		IfcStructuralCurveMemberVaryingImpl.class, IfcOccupantImpl.class, IfcFeatureElementSubtractionImpl.class, IfcReinforcingElementImpl.class, IfcSystemImpl.class, IfcBuildingElementPartImpl.class, IfcWorkPlanImpl.class, IfcElementImpl.class, IfcBuildingImpl.class,
		IfcWindowImpl.class, IfcTaskImpl.class, IfcDistributionPortImpl.class, IfcStructuralConnectionImpl.class, IfcDistributionControlElementImpl.class, IfcStructuralCurveMemberImpl.class, IfcStairFlightImpl.class, IfcCrewResourceImpl.class, IfcProcessImpl.class,
		IfcEquipmentElementImpl.class, IfcZoneImpl.class, IfcFastenerImpl.class, IfcElectricalCircuitImpl.class, IfcFurnishingElementImpl.class, IfcDistributionElementImpl.class, IfcConditionImpl.class, IfcRampImpl.class, IfcCostItemImpl.class,
		IfcStructuralPlanarActionImpl.class, IfcRoofImpl.class, IfcFlowSegmentImpl.class, IfcColumnImpl.class, IfcFlowTerminalImpl.class, IfcConstructionMaterialResourceImpl.class, IfcWallImpl.class, IfcStructuralSurfaceMemberVaryingImpl.class, IfcBeamImpl.class,
		IfcResourceImpl.class, IfcProcedureImpl.class, IfcDiscreteAccessoryImpl.class, IfcSpaceImpl.class, IfcAssetImpl.class, IfcReinforcingMeshImpl.class, IfcPermitImpl.class, IfcBuildingStoreyImpl.class, IfcSubContractResourceImpl.class, IfcActionRequestImpl.class,
		IfcStructuralAnalysisModelImpl.class, IfcStairImpl.class, IfcStructuralActionImpl.class, IfcStructuralItemImpl.class, IfcStructuralCurveConnectionImpl.class, IfcFeatureElementAdditionImpl.class, IfcSiteImpl.class, IfcSpatialStructureElementImpl.class,
		IfcAnnotationImpl.class, IfcRampFlightImpl.class, IfcMemberImpl.class, IfcOpeningElementImpl.class, IfcDistributionFlowElementImpl.class, IfcVirtualElementImpl.class, IfcBuildingElementProxyImpl.class, IfcReinforcingBarImpl.class, IfcLaborResourceImpl.class,
		IfcStructuralPointReactionImpl.class, IfcStructuralPointActionImpl.class, IfcCurtainWallImpl.class, IfcConstructionEquipmentResourceImpl.class, IfcStructuralSurfaceMemberImpl.class, IfcBuildingElementComponentImpl.class, IfcProjectOrderRecordImpl.class,
		IfcTransportElementImpl.class, IfcStructuralLoadGroupImpl.class, IfcFlowStorageDeviceImpl.class, IfcFootingImpl.class, IfcRailingImpl.class, IfcPortImpl.class, IfcElectricDistributionPointImpl.class, IfcScheduleTimeControlImpl.class, IfcBuildingElementImpl.class,
		IfcProjectOrderImpl.class, IfcPerformanceHistoryImpl.class, IfcStructuralMemberImpl.class, IfcStructuralLinearActionImpl.class, IfcRoundedEdgeFeatureImpl.class, IfcStructuralSurfaceConnectionImpl.class, IfcProductImpl.class, IfcTimeSeriesScheduleImpl.class,
		IfcElectricalElementImpl.class, IfcDoorImpl.class, IfcStructuralLinearActionVaryingImpl.class })
@XmlRootElement(name = "IfcObjectElement")
public class IfcObjectImpl extends IfcObjectDefinitionImpl implements IfcObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelDefines> getIsDefinedBy() {
		return (EList<IfcRelDefines>)eGet(IFC2X3Package.eINSTANCE.getIfcObject_IsDefinedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcObject_ObjectType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(String newObjectType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcObject_ObjectType(), newObjectType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjectType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcObject_ObjectType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjectType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcObject_ObjectType());
	}

} //IfcObjectImpl
