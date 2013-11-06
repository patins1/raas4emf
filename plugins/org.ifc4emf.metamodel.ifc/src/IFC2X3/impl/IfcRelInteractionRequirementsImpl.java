/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcRelInteractionRequirements;
import IFC2X3.IfcSpaceProgram;
import IFC2X3.IfcSpatialStructureElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Interaction Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelInteractionRequirementsImpl#getDailyInteraction <em>Daily Interaction</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelInteractionRequirementsImpl#getImportanceRating <em>Importance Rating</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelInteractionRequirementsImpl#getLocationOfInteraction <em>Location Of Interaction</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelInteractionRequirementsImpl#getRelatedSpaceProgram <em>Related Space Program</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelInteractionRequirementsImpl#getRelatingSpaceProgram <em>Relating Space Program</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelInteractionRequirements")
@XmlRootElement(name = "IfcRelInteractionRequirementsElement")
public class IfcRelInteractionRequirementsImpl extends IfcRelConnectsImpl implements IfcRelInteractionRequirements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelInteractionRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getLocationOfInteraction() {
		return (IfcSpatialStructureElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_LocationOfInteraction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationOfInteraction(IfcSpatialStructureElement newLocationOfInteraction) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_LocationOfInteraction(), newLocationOfInteraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceProgram getRelatingSpaceProgram() {
		return (IfcSpaceProgram)eGet(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_RelatingSpaceProgram(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingSpaceProgram(IfcSpaceProgram newRelatingSpaceProgram) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_RelatingSpaceProgram(), newRelatingSpaceProgram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceProgram getRelatedSpaceProgram() {
		return (IfcSpaceProgram)eGet(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_RelatedSpaceProgram(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedSpaceProgram(IfcSpaceProgram newRelatedSpaceProgram) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_RelatedSpaceProgram(), newRelatedSpaceProgram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getImportanceRating() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_ImportanceRating(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportanceRating(Double newImportanceRating) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_ImportanceRating(), newImportanceRating);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImportanceRating() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_ImportanceRating());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportanceRating() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_ImportanceRating());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDailyInteraction() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_DailyInteraction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyInteraction(Double newDailyInteraction) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_DailyInteraction(), newDailyInteraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDailyInteraction() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_DailyInteraction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDailyInteraction() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelInteractionRequirements_DailyInteraction());
	}

} //IfcRelInteractionRequirementsImpl
