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
import IFC2X3.IfcRelConnectsStructuralActivity;
import IFC2X3.IfcStructuralActivityAssignmentSelect;

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
 * An implementation of the model object '<em><b>Ifc Structural Activity Assignment Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralActivityAssignmentSelectImpl#getAssignedStructuralActivity <em>Assigned Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralActivityAssignmentSelect")
@XmlSeeAlso({ IfcRoofImpl.class, IfcFlowSegmentImpl.class, IfcColumnImpl.class, IfcFlowTerminalImpl.class, IfcElementComponentImpl.class, IfcElementAssemblyImpl.class, IfcStructuralSurfaceMemberVaryingImpl.class, IfcWallImpl.class, IfcFlowMovingDeviceImpl.class,
		IfcBeamImpl.class, IfcWallStandardCaseImpl.class, IfcEnergyConversionDeviceImpl.class, IfcDiscreteAccessoryImpl.class, IfcStructuralPointConnectionImpl.class, IfcReinforcingMeshImpl.class, IfcPlateImpl.class, IfcMechanicalFastenerImpl.class, IfcFlowControllerImpl.class,
		IfcFlowTreatmentDeviceImpl.class, IfcStairImpl.class, IfcEdgeFeatureImpl.class, IfcStructuralItemImpl.class, IfcTendonImpl.class, IfcFeatureElementAdditionImpl.class, IfcStructuralCurveConnectionImpl.class, IfcRampFlightImpl.class, IfcMemberImpl.class,
		IfcDistributionChamberElementImpl.class, IfcOpeningElementImpl.class, IfcDistributionFlowElementImpl.class, IfcSlabImpl.class, IfcCoveringImpl.class, IfcFeatureElementImpl.class, IfcChamferEdgeFeatureImpl.class, IfcVirtualElementImpl.class,
		IfcBuildingElementProxyImpl.class, IfcFlowFittingImpl.class, IfcTendonAnchorImpl.class, IfcReinforcingBarImpl.class, IfcPileImpl.class, IfcProjectionElementImpl.class, IfcStructuralCurveMemberVaryingImpl.class, IfcCurtainWallImpl.class,
		IfcStructuralSurfaceMemberImpl.class, IfcFeatureElementSubtractionImpl.class, IfcReinforcingElementImpl.class, IfcBuildingElementComponentImpl.class, IfcBuildingElementPartImpl.class, IfcTransportElementImpl.class, IfcElementImpl.class, IfcWindowImpl.class,
		IfcStructuralConnectionImpl.class, IfcDistributionControlElementImpl.class, IfcStructuralCurveMemberImpl.class, IfcFootingImpl.class, IfcFlowStorageDeviceImpl.class, IfcRailingImpl.class, IfcStairFlightImpl.class, IfcElectricDistributionPointImpl.class,
		IfcEquipmentElementImpl.class, IfcFastenerImpl.class, IfcBuildingElementImpl.class, IfcStructuralMemberImpl.class, IfcRoundedEdgeFeatureImpl.class, IfcFurnishingElementImpl.class, IfcStructuralSurfaceConnectionImpl.class, IfcDistributionElementImpl.class,
		IfcElectricalElementImpl.class, IfcDoorImpl.class, IfcRampImpl.class })
@XmlRootElement(name = "IfcStructuralActivityAssignmentSelectElement")
public abstract class IfcStructuralActivityAssignmentSelectImpl extends CDOObjectImpl implements IfcStructuralActivityAssignmentSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralActivityAssignmentSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralActivityAssignmentSelect();
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
	@SuppressWarnings("unchecked")
	public EList<IfcRelConnectsStructuralActivity> getAssignedStructuralActivity() {
		return (EList<IfcRelConnectsStructuralActivity>)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralActivityAssignmentSelect_AssignedStructuralActivity(), true);
	}

} //IfcStructuralActivityAssignmentSelectImpl
