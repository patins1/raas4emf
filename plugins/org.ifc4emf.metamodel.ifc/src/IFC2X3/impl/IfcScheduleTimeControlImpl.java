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
import IFC2X3.IfcDateTimeSelect;
import IFC2X3.IfcRelAssignsTasks;
import IFC2X3.IfcScheduleTimeControl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Schedule Time Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getActualStart <em>Actual Start</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getEarlyStart <em>Early Start</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getLateStart <em>Late Start</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getScheduleStart <em>Schedule Start</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getActualFinish <em>Actual Finish</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getEarlyFinish <em>Early Finish</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getLateFinish <em>Late Finish</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getScheduleFinish <em>Schedule Finish</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getScheduleDuration <em>Schedule Duration</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getActualDuration <em>Actual Duration</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getRemainingTime <em>Remaining Time</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getFreeFloat <em>Free Float</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getTotalFloat <em>Total Float</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getIsCritical <em>Is Critical</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getStatusTime <em>Status Time</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getStartFloat <em>Start Float</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getFinishFloat <em>Finish Float</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcScheduleTimeControlImpl#getScheduleTimeControlAssigned <em>Schedule Time Control Assigned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcScheduleTimeControl")
@XmlRootElement(name = "IfcScheduleTimeControlElement")
public class IfcScheduleTimeControlImpl extends IfcControlImpl implements IfcScheduleTimeControl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcScheduleTimeControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsTasks getScheduleTimeControlAssigned() {
		return (IfcRelAssignsTasks)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleTimeControlAssigned(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleTimeControlAssigned(IfcRelAssignsTasks newScheduleTimeControlAssigned) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleTimeControlAssigned(), newScheduleTimeControlAssigned);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getEarlyFinish() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_EarlyFinish(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarlyFinish(IfcDateTimeSelect newEarlyFinish) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_EarlyFinish(), newEarlyFinish);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getStatusTime() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_StatusTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusTime(IfcDateTimeSelect newStatusTime) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_StatusTime(), newStatusTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getScheduleFinish() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleFinish(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleFinish(IfcDateTimeSelect newScheduleFinish) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleFinish(), newScheduleFinish);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getScheduleStart() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleStart(IfcDateTimeSelect newScheduleStart) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleStart(), newScheduleStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getActualStart() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ActualStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualStart(IfcDateTimeSelect newActualStart) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ActualStart(), newActualStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getLateStart() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_LateStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLateStart(IfcDateTimeSelect newLateStart) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_LateStart(), newLateStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getActualFinish() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ActualFinish(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualFinish(IfcDateTimeSelect newActualFinish) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ActualFinish(), newActualFinish);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getLateFinish() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_LateFinish(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLateFinish(IfcDateTimeSelect newLateFinish) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_LateFinish(), newLateFinish);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getEarlyStart() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_EarlyStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarlyStart(IfcDateTimeSelect newEarlyStart) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_EarlyStart(), newEarlyStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCompletion() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_Completion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletion(Double newCompletion) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_Completion(), newCompletion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompletion() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_Completion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompletion() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_Completion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFinishFloat() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_FinishFloat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishFloat(Double newFinishFloat) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_FinishFloat(), newFinishFloat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFinishFloat() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_FinishFloat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFinishFloat() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_FinishFloat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getStartFloat() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_StartFloat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartFloat(Double newStartFloat) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_StartFloat(), newStartFloat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartFloat() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_StartFloat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartFloat() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_StartFloat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCritical() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_IsCritical(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCritical(Boolean newIsCritical) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_IsCritical(), newIsCritical);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsCritical() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_IsCritical());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsCritical() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_IsCritical());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTotalFloat() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_TotalFloat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalFloat(Double newTotalFloat) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_TotalFloat(), newTotalFloat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalFloat() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_TotalFloat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalFloat() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_TotalFloat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFreeFloat() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_FreeFloat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeFloat(Double newFreeFloat) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_FreeFloat(), newFreeFloat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFreeFloat() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_FreeFloat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFreeFloat() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_FreeFloat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRemainingTime() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_RemainingTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingTime(Double newRemainingTime) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_RemainingTime(), newRemainingTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRemainingTime() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_RemainingTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRemainingTime() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_RemainingTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getActualDuration() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ActualDuration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualDuration(Double newActualDuration) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ActualDuration(), newActualDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActualDuration() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ActualDuration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActualDuration() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ActualDuration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScheduleDuration() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleDuration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleDuration(Double newScheduleDuration) {
		eSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleDuration(), newScheduleDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScheduleDuration() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleDuration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScheduleDuration() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleDuration());
	}

} //IfcScheduleTimeControlImpl
