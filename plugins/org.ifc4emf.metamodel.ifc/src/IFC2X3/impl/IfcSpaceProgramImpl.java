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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Space Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSpaceProgramImpl#getSpaceProgramIdentifier <em>Space Program Identifier</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceProgramImpl#getMaxRequiredArea <em>Max Required Area</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceProgramImpl#getMinRequiredArea <em>Min Required Area</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceProgramImpl#getRequestedLocation <em>Requested Location</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceProgramImpl#getStandardRequiredArea <em>Standard Required Area</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceProgramImpl#getHasInteractionReqsFrom <em>Has Interaction Reqs From</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceProgramImpl#getHasInteractionReqsTo <em>Has Interaction Reqs To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSpaceProgram")
@XmlRootElement(name = "IfcSpaceProgramElement")
public class IfcSpaceProgramImpl extends IfcControlImpl implements IfcSpaceProgram {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpaceProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSpaceProgram();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelInteractionRequirements> getHasInteractionReqsFrom() {
		return (EList<IfcRelInteractionRequirements>)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_HasInteractionReqsFrom(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelInteractionRequirements> getHasInteractionReqsTo() {
		return (EList<IfcRelInteractionRequirements>)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_HasInteractionReqsTo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getRequestedLocation() {
		return (IfcSpatialStructureElement)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_RequestedLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedLocation(IfcSpatialStructureElement newRequestedLocation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_RequestedLocation(), newRequestedLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getStandardRequiredArea() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_StandardRequiredArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardRequiredArea(Double newStandardRequiredArea) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_StandardRequiredArea(), newStandardRequiredArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStandardRequiredArea() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_StandardRequiredArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStandardRequiredArea() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_StandardRequiredArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinRequiredArea() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_MinRequiredArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRequiredArea(Double newMinRequiredArea) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_MinRequiredArea(), newMinRequiredArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinRequiredArea() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_MinRequiredArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinRequiredArea() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_MinRequiredArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaxRequiredArea() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_MaxRequiredArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRequiredArea(Double newMaxRequiredArea) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_MaxRequiredArea(), newMaxRequiredArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxRequiredArea() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_MaxRequiredArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxRequiredArea() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_MaxRequiredArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpaceProgramIdentifier() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_SpaceProgramIdentifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceProgramIdentifier(String newSpaceProgramIdentifier) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_SpaceProgramIdentifier(), newSpaceProgramIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpaceProgramIdentifier() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_SpaceProgramIdentifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpaceProgramIdentifier() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpaceProgram_SpaceProgramIdentifier());
	}

} //IfcSpaceProgramImpl
