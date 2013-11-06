/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcActorSelect;
import IFC2X3.IfcCostSchedule;
import IFC2X3.IfcCostScheduleTypeEnum;
import IFC2X3.IfcDateTimeSelect;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cost Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCostScheduleImpl#getSubmittedBy <em>Submitted By</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCostScheduleImpl#getPreparedBy <em>Prepared By</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCostScheduleImpl#getSubmittedOn <em>Submitted On</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCostScheduleImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCostScheduleImpl#getTargetUsers <em>Target Users</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCostScheduleImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCostScheduleImpl#getID <em>ID</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCostScheduleImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCostSchedule")
@XmlRootElement(name = "IfcCostScheduleElement")
public class IfcCostScheduleImpl extends IfcControlImpl implements IfcCostSchedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCostScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCostSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getUpdateDate() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_UpdateDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateDate(IfcDateTimeSelect newUpdateDate) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_UpdateDate(), newUpdateDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getSubmittedOn() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_SubmittedOn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmittedOn(IfcDateTimeSelect newSubmittedOn) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_SubmittedOn(), newSubmittedOn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcActorSelect> getTargetUsers() {
		return (EList<IfcActorSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_TargetUsers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getPreparedBy() {
		return (IfcActorSelect)eGet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_PreparedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreparedBy(IfcActorSelect newPreparedBy) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_PreparedBy(), newPreparedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getSubmittedBy() {
		return (IfcActorSelect)eGet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_SubmittedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmittedBy(IfcActorSelect newSubmittedBy) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_SubmittedBy(), newSubmittedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostScheduleTypeEnum getPredefinedType() {
		return (IfcCostScheduleTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcCostScheduleTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCostSchedule_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_ID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_ID(), newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetID() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCostSchedule_ID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetID() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_ID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_Status(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_Status(), newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCostSchedule_Status());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCostSchedule_Status());
	}

} //IfcCostScheduleImpl
