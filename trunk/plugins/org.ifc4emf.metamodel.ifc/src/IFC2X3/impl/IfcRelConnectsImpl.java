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
import IFC2X3.IfcRelConnects;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelConnects")
@XmlSeeAlso({ IfcRelReferencedInSpatialStructureImpl.class, IfcRelConnectsPortsImpl.class, IfcRelConnectsWithEccentricityImpl.class, IfcRelSequenceImpl.class, IfcRelFillsElementImpl.class, IfcRelInteractionRequirementsImpl.class, IfcRelProjectsElementImpl.class,
		IfcRelConnectsElementsImpl.class, IfcRelSpaceBoundaryImpl.class, IfcRelConnectsPortToElementImpl.class, IfcRelCoversBldgElementsImpl.class, IfcRelConnectsWithRealizingElementsImpl.class, IfcRelConnectsStructuralElementImpl.class, IfcRelConnectsStructuralMemberImpl.class,
		IfcRelCoversSpacesImpl.class, IfcRelConnectsStructuralActivityImpl.class, IfcRelConnectsPathElementsImpl.class, IfcRelVoidsElementImpl.class, IfcRelContainedInSpatialStructureImpl.class, IfcRelServicesBuildingsImpl.class, IfcRelFlowControlElementsImpl.class })
@XmlRootElement(name = "IfcRelConnectsElement")
public class IfcRelConnectsImpl extends IfcRelationshipImpl implements IfcRelConnects {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelConnects();
	}

} //IfcRelConnectsImpl
