/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcApproval;
import IFC2X3.IfcApprovalPropertyRelationship;
import IFC2X3.IfcProperty;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Approval Property Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcApprovalPropertyRelationshipImpl#getApprovedProperties <em>Approved Properties</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApprovalPropertyRelationshipImpl#getApproval <em>Approval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcApprovalPropertyRelationship")
@XmlRootElement(name = "IfcApprovalPropertyRelationshipElement")
public class IfcApprovalPropertyRelationshipImpl extends CDOObjectImpl implements IfcApprovalPropertyRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcApprovalPropertyRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcApprovalPropertyRelationship();
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
	public EList<IfcProperty> getApprovedProperties() {
		return (EList<IfcProperty>)eGet(IFC2X3Package.eINSTANCE.getIfcApprovalPropertyRelationship_ApprovedProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApproval getApproval() {
		return (IfcApproval)eGet(IFC2X3Package.eINSTANCE.getIfcApprovalPropertyRelationship_Approval(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproval(IfcApproval newApproval) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApprovalPropertyRelationship_Approval(), newApproval);
	}

} //IfcApprovalPropertyRelationshipImpl
