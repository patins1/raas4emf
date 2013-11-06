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
import IFC2X3.IfcTask;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTaskImpl#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTaskImpl#getWorkMethod <em>Work Method</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTaskImpl#getIsMilestone <em>Is Milestone</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTaskImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTask")
@XmlSeeAlso({ IfcMoveImpl.class, IfcOrderActionImpl.class })
@XmlRootElement(name = "IfcTaskElement")
public class IfcTaskImpl extends IfcProcessImpl implements IfcTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPriority() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcTask_Priority(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Integer newPriority) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTask_Priority(), newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriority() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTask_Priority());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriority() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTask_Priority());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMilestone() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcTask_IsMilestone(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMilestone(Boolean newIsMilestone) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTask_IsMilestone(), newIsMilestone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsMilestone() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTask_IsMilestone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsMilestone() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTask_IsMilestone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkMethod() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTask_WorkMethod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkMethod(String newWorkMethod) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTask_WorkMethod(), newWorkMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkMethod() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTask_WorkMethod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkMethod() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTask_WorkMethod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTask_Status(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTask_Status(), newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTask_Status());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTask_Status());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskId() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTask_TaskId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskId(String newTaskId) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTask_TaskId(), newTaskId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTaskId() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTask_TaskId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTaskId() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTask_TaskId());
	}

} //IfcTaskImpl
