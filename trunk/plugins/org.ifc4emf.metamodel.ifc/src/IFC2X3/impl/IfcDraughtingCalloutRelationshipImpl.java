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
import IFC2X3.IfcDraughtingCallout;
import IFC2X3.IfcDraughtingCalloutRelationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Draughting Callout Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDraughtingCalloutRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDraughtingCalloutRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDraughtingCalloutRelationshipImpl#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDraughtingCalloutRelationshipImpl#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDraughtingCalloutRelationship")
@XmlSeeAlso({ IfcDimensionPairImpl.class, IfcDimensionCalloutRelationshipImpl.class })
@XmlRootElement(name = "IfcDraughtingCalloutRelationshipElement")
public class IfcDraughtingCalloutRelationshipImpl extends CDOObjectImpl implements IfcDraughtingCalloutRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDraughtingCalloutRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship();
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
	public IfcDraughtingCallout getRelatedDraughtingCallout() {
		return (IfcDraughtingCallout)eGet(IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship_RelatedDraughtingCallout(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedDraughtingCallout(IfcDraughtingCallout newRelatedDraughtingCallout) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship_RelatedDraughtingCallout(), newRelatedDraughtingCallout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDraughtingCallout getRelatingDraughtingCallout() {
		return (IfcDraughtingCallout)eGet(IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship_RelatingDraughtingCallout(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingDraughtingCallout(IfcDraughtingCallout newRelatingDraughtingCallout) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship_RelatingDraughtingCallout(), newRelatingDraughtingCallout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutRelationship_Name());
	}

} //IfcDraughtingCalloutRelationshipImpl
