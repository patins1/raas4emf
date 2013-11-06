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
import IFC2X3.IfcObjectPlacement;
import IFC2X3.IfcProduct;
import IFC2X3.IfcProductRepresentation;
import IFC2X3.IfcRelAssignsToProduct;
import IFC2X3.IfcRelContainedInSpatialStructure;
import IFC2X3.IfcRelReferencedInSpatialStructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcProductImpl#getObjectPlacement <em>Object Placement</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProductImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProductImpl#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProductImpl#getReferencedInStructures <em>Referenced In Structures</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProductImpl#getContainedInStructure <em>Contained In Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcProduct")
@XmlSeeAlso({ IfcRoofImpl.class, IfcProxyImpl.class, IfcFlowSegmentImpl.class, IfcColumnImpl.class, IfcFlowTerminalImpl.class, IfcStructuralActivityImpl.class, IfcElementComponentImpl.class, IfcWallImpl.class, IfcElementAssemblyImpl.class,
		IfcStructuralSurfaceMemberVaryingImpl.class, IfcFlowMovingDeviceImpl.class, IfcBeamImpl.class, IfcWallStandardCaseImpl.class, IfcEnergyConversionDeviceImpl.class, IfcDiscreteAccessoryImpl.class, IfcSpaceImpl.class, IfcStructuralPointConnectionImpl.class,
		IfcReinforcingMeshImpl.class, IfcPlateImpl.class, IfcStructuralReactionImpl.class, IfcBuildingStoreyImpl.class, IfcMechanicalFastenerImpl.class, IfcFlowControllerImpl.class, IfcFlowTreatmentDeviceImpl.class, IfcStairImpl.class, IfcStructuralPlanarActionVaryingImpl.class,
		IfcEdgeFeatureImpl.class, IfcStructuralActionImpl.class, IfcStructuralItemImpl.class, IfcTendonImpl.class, IfcFeatureElementAdditionImpl.class, IfcStructuralCurveConnectionImpl.class, IfcSiteImpl.class, IfcSpatialStructureElementImpl.class, IfcAnnotationImpl.class,
		IfcRampFlightImpl.class, IfcDistributionChamberElementImpl.class, IfcMemberImpl.class, IfcOpeningElementImpl.class, IfcDistributionFlowElementImpl.class, IfcGridImpl.class, IfcSlabImpl.class, IfcCoveringImpl.class, IfcFeatureElementImpl.class,
		IfcChamferEdgeFeatureImpl.class, IfcVirtualElementImpl.class, IfcBuildingElementProxyImpl.class, IfcFlowFittingImpl.class, IfcTendonAnchorImpl.class, IfcReinforcingBarImpl.class, IfcStructuralPointReactionImpl.class, IfcPileImpl.class, IfcProjectionElementImpl.class,
		IfcStructuralPointActionImpl.class, IfcStructuralCurveMemberVaryingImpl.class, IfcCurtainWallImpl.class, IfcStructuralSurfaceMemberImpl.class, IfcFeatureElementSubtractionImpl.class, IfcReinforcingElementImpl.class, IfcBuildingElementComponentImpl.class,
		IfcBuildingElementPartImpl.class, IfcTransportElementImpl.class, IfcBuildingImpl.class, IfcElementImpl.class, IfcWindowImpl.class, IfcDistributionPortImpl.class, IfcStructuralConnectionImpl.class, IfcDistributionControlElementImpl.class,
		IfcStructuralCurveMemberImpl.class, IfcFlowStorageDeviceImpl.class, IfcFootingImpl.class, IfcRailingImpl.class, IfcStairFlightImpl.class, IfcPortImpl.class, IfcElectricDistributionPointImpl.class, IfcEquipmentElementImpl.class, IfcFastenerImpl.class,
		IfcBuildingElementImpl.class, IfcStructuralMemberImpl.class, IfcStructuralLinearActionImpl.class, IfcRoundedEdgeFeatureImpl.class, IfcFurnishingElementImpl.class, IfcStructuralSurfaceConnectionImpl.class, IfcDistributionElementImpl.class, IfcElectricalElementImpl.class,
		IfcDoorImpl.class, IfcStructuralLinearActionVaryingImpl.class, IfcRampImpl.class, IfcStructuralPlanarActionImpl.class })
@XmlRootElement(name = "IfcProductElement")
public class IfcProductImpl extends IfcObjectImpl implements IfcProduct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssignsToProduct> getReferencedBy() {
		return (EList<IfcRelAssignsToProduct>)eGet(IFC2X3Package.eINSTANCE.getIfcProduct_ReferencedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelReferencedInSpatialStructure> getReferencedInStructures() {
		return (EList<IfcRelReferencedInSpatialStructure>)eGet(IFC2X3Package.eINSTANCE.getIfcProduct_ReferencedInStructures(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelContainedInSpatialStructure getContainedInStructure() {
		return (IfcRelContainedInSpatialStructure)eGet(IFC2X3Package.eINSTANCE.getIfcProduct_ContainedInStructure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedInStructure(IfcRelContainedInSpatialStructure newContainedInStructure) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProduct_ContainedInStructure(), newContainedInStructure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductRepresentation getRepresentation() {
		return (IfcProductRepresentation)eGet(IFC2X3Package.eINSTANCE.getIfcProduct_Representation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(IfcProductRepresentation newRepresentation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProduct_Representation(), newRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectPlacement getObjectPlacement() {
		return (IfcObjectPlacement)eGet(IFC2X3Package.eINSTANCE.getIfcProduct_ObjectPlacement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectPlacement(IfcObjectPlacement newObjectPlacement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProduct_ObjectPlacement(), newObjectPlacement);
	}

} //IfcProductImpl
