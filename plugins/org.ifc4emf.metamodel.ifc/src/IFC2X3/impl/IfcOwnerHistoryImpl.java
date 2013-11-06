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
import IFC2X3.IfcApplication;
import IFC2X3.IfcChangeActionEnum;
import IFC2X3.IfcOwnerHistory;
import IFC2X3.IfcPersonAndOrganization;
import IFC2X3.IfcStateEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Owner History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcOwnerHistoryImpl#getOwningUser <em>Owning User</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOwnerHistoryImpl#getOwningApplication <em>Owning Application</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOwnerHistoryImpl#getState <em>State</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOwnerHistoryImpl#getChangeAction <em>Change Action</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOwnerHistoryImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOwnerHistoryImpl#getLastModifyingUser <em>Last Modifying User</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOwnerHistoryImpl#getLastModifyingApplication <em>Last Modifying Application</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOwnerHistoryImpl#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcOwnerHistory")
@XmlRootElement(name = "IfcOwnerHistoryElement")
public class IfcOwnerHistoryImpl extends CDOObjectImpl implements IfcOwnerHistory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOwnerHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcOwnerHistory();
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
	public IfcPersonAndOrganization getLastModifyingUser() {
		return (IfcPersonAndOrganization)eGet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_LastModifyingUser(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifyingUser(IfcPersonAndOrganization newLastModifyingUser) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_LastModifyingUser(), newLastModifyingUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPersonAndOrganization getOwningUser() {
		return (IfcPersonAndOrganization)eGet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_OwningUser(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningUser(IfcPersonAndOrganization newOwningUser) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_OwningUser(), newOwningUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApplication getLastModifyingApplication() {
		return (IfcApplication)eGet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_LastModifyingApplication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifyingApplication(IfcApplication newLastModifyingApplication) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_LastModifyingApplication(), newLastModifyingApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApplication getOwningApplication() {
		return (IfcApplication)eGet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_OwningApplication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningApplication(IfcApplication newOwningApplication) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_OwningApplication(), newOwningApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCreationDate() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_CreationDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Integer newCreationDate) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_CreationDate(), newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreationDate() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_CreationDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreationDate() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_CreationDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLastModifiedDate() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_LastModifiedDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifiedDate(Integer newLastModifiedDate) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_LastModifiedDate(), newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastModifiedDate() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_LastModifiedDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastModifiedDate() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_LastModifiedDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcChangeActionEnum getChangeAction() {
		return (IfcChangeActionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_ChangeAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeAction(IfcChangeActionEnum newChangeAction) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_ChangeAction(), newChangeAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChangeAction() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_ChangeAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChangeAction() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_ChangeAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStateEnum getState() {
		return (IfcStateEnum)eGet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_State(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(IfcStateEnum newState) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_State(), newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetState() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_State());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetState() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOwnerHistory_State());
	}

} //IfcOwnerHistoryImpl
