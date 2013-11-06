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
import IFC2X3.IfcActorRole;
import IFC2X3.IfcActorSelect;
import IFC2X3.IfcApproval;
import IFC2X3.IfcApprovalActorRelationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Approval Actor Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcApprovalActorRelationshipImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApprovalActorRelationshipImpl#getApproval <em>Approval</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApprovalActorRelationshipImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcApprovalActorRelationship")
@XmlRootElement(name = "IfcApprovalActorRelationshipElement")
public class IfcApprovalActorRelationshipImpl extends CDOObjectImpl implements IfcApprovalActorRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcApprovalActorRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcApprovalActorRelationship();
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
	public IfcActorRole getRole() {
		return (IfcActorRole)eGet(IFC2X3Package.eINSTANCE.getIfcApprovalActorRelationship_Role(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(IfcActorRole newRole) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApprovalActorRelationship_Role(), newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApproval getApproval() {
		return (IfcApproval)eGet(IFC2X3Package.eINSTANCE.getIfcApprovalActorRelationship_Approval(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproval(IfcApproval newApproval) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApprovalActorRelationship_Approval(), newApproval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getActor() {
		return (IfcActorSelect)eGet(IFC2X3Package.eINSTANCE.getIfcApprovalActorRelationship_Actor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(IfcActorSelect newActor) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApprovalActorRelationship_Actor(), newActor);
	}

} //IfcApprovalActorRelationshipImpl
