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
import IFC2X3.IfcRelationship;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelationship")
@XmlSeeAlso({ IfcRelConnectsPortsImpl.class, IfcRelConnectsElementsImpl.class, IfcRelNestsImpl.class, IfcRelCoversBldgElementsImpl.class, IfcRelAssociatesAppliedValueImpl.class, IfcRelAssignsToProcessImpl.class, IfcRelCoversSpacesImpl.class, IfcRelDefinesByTypeImpl.class,
		IfcRelAssociatesImpl.class, IfcRelAssociatesDocumentImpl.class, IfcRelAssignsToActorImpl.class, IfcRelAssociatesLibraryImpl.class, IfcRelSequenceImpl.class, IfcRelFillsElementImpl.class, IfcRelProjectsElementImpl.class, IfcRelSpaceBoundaryImpl.class,
		IfcRelAssignsToProjectOrderImpl.class, IfcRelConnectsStructuralMemberImpl.class, IfcRelSchedulesCostItemsImpl.class, IfcRelAssociatesClassificationImpl.class, IfcRelAssociatesProfilePropertiesImpl.class, IfcRelAssignsTasksImpl.class,
		IfcRelReferencedInSpatialStructureImpl.class, IfcRelOccupiesSpacesImpl.class, IfcRelConnectsWithEccentricityImpl.class, IfcRelAssociatesApprovalImpl.class, IfcRelConnectsStructuralElementImpl.class, IfcRelOverridesPropertiesImpl.class, IfcRelDefinesImpl.class,
		IfcRelConnectsPathElementsImpl.class, IfcRelContainedInSpatialStructureImpl.class, IfcRelAssociatesMaterialImpl.class, IfcRelAssignsToControlImpl.class, IfcRelAssignsToResourceImpl.class, IfcRelAssignsToProductImpl.class, IfcRelDefinesByPropertiesImpl.class,
		IfcRelDecomposesImpl.class, IfcRelInteractionRequirementsImpl.class, IfcRelConnectsPortToElementImpl.class, IfcRelConnectsWithRealizingElementsImpl.class, IfcRelAssignsToGroupImpl.class, IfcRelConnectsImpl.class, IfcRelVoidsElementImpl.class,
		IfcRelConnectsStructuralActivityImpl.class, IfcRelAggregatesImpl.class, IfcRelServicesBuildingsImpl.class, IfcRelAssignsImpl.class, IfcRelFlowControlElementsImpl.class, IfcRelAssociatesConstraintImpl.class })
@XmlRootElement(name = "IfcRelationshipElement")
public class IfcRelationshipImpl extends IfcRootImpl implements IfcRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelationship();
	}

} //IfcRelationshipImpl
