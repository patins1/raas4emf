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
import IFC2X3.IfcApproval;
import IFC2X3.IfcApprovalActorRelationship;
import IFC2X3.IfcApprovalRelationship;
import IFC2X3.IfcDateTimeSelect;

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
 * An implementation of the model object '<em><b>Ifc Approval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcApprovalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApprovalImpl#getApprovalDateTime <em>Approval Date Time</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApprovalImpl#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApprovalImpl#getApprovalLevel <em>Approval Level</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApprovalImpl#getApprovalQualifier <em>Approval Qualifier</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApprovalImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApprovalImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApprovalImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApprovalImpl#getIsRelatedWith <em>Is Related With</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApprovalImpl#getRelates <em>Relates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcApproval")
@XmlRootElement(name = "IfcApprovalElement")
public class IfcApprovalImpl extends CDOObjectImpl implements IfcApproval {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcApprovalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcApproval();
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
	public EList<IfcApprovalActorRelationship> getActors() {
		return (EList<IfcApprovalActorRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcApproval_Actors(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcApprovalRelationship> getIsRelatedWith() {
		return (EList<IfcApprovalRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcApproval_IsRelatedWith(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcApprovalRelationship> getRelates() {
		return (EList<IfcApprovalRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcApproval_Relates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getApprovalDateTime() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalDateTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalDateTime(IfcDateTimeSelect newApprovalDateTime) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalDateTime(), newApprovalDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcApproval_Identifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApproval_Identifier(), newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIdentifier() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcApproval_Identifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIdentifier() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcApproval_Identifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcApproval_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApproval_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcApproval_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcApproval_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalQualifier() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalQualifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalQualifier(String newApprovalQualifier) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalQualifier(), newApprovalQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprovalQualifier() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalQualifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprovalQualifier() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalQualifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalLevel() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalLevel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalLevel(String newApprovalLevel) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalLevel(), newApprovalLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprovalLevel() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalLevel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprovalLevel() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalLevel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalStatus() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalStatus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalStatus(String newApprovalStatus) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalStatus(), newApprovalStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprovalStatus() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalStatus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprovalStatus() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcApproval_ApprovalStatus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcApproval_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApproval_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcApproval_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcApproval_Description());
	}

} //IfcApprovalImpl
