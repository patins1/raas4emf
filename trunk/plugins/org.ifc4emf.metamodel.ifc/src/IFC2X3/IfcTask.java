/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTaskImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTask#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link IFC2X3.IfcTask#getStatus <em>Status</em>}</li>
 *   <li>{@link IFC2X3.IfcTask#getWorkMethod <em>Work Method</em>}</li>
 *   <li>{@link IFC2X3.IfcTask#getIsMilestone <em>Is Milestone</em>}</li>
 *   <li>{@link IFC2X3.IfcTask#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTask()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTaskImplAdapter.class)
public interface IfcTask extends IfcProcess {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcTask_Priority()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTask#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTask#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(Integer)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTask#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(Integer)
	 * @generated
	 */
	boolean isSetPriority();

	/**
	 * Returns the value of the '<em><b>Is Milestone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Milestone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Milestone</em>' attribute.
	 * @see #isSetIsMilestone()
	 * @see #unsetIsMilestone()
	 * @see #setIsMilestone(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcTask_IsMilestone()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getIsMilestone();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTask#getIsMilestone <em>Is Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Milestone</em>' attribute.
	 * @see #isSetIsMilestone()
	 * @see #unsetIsMilestone()
	 * @see #getIsMilestone()
	 * @generated
	 */
	void setIsMilestone(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTask#getIsMilestone <em>Is Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsMilestone()
	 * @see #getIsMilestone()
	 * @see #setIsMilestone(Boolean)
	 * @generated
	 */
	void unsetIsMilestone();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTask#getIsMilestone <em>Is Milestone</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Milestone</em>' attribute is set.
	 * @see #unsetIsMilestone()
	 * @see #getIsMilestone()
	 * @see #setIsMilestone(Boolean)
	 * @generated
	 */
	boolean isSetIsMilestone();

	/**
	 * Returns the value of the '<em><b>Work Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Method</em>' attribute.
	 * @see #isSetWorkMethod()
	 * @see #unsetWorkMethod()
	 * @see #setWorkMethod(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTask_WorkMethod()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getWorkMethod();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTask#getWorkMethod <em>Work Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Method</em>' attribute.
	 * @see #isSetWorkMethod()
	 * @see #unsetWorkMethod()
	 * @see #getWorkMethod()
	 * @generated
	 */
	void setWorkMethod(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTask#getWorkMethod <em>Work Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkMethod()
	 * @see #getWorkMethod()
	 * @see #setWorkMethod(String)
	 * @generated
	 */
	void unsetWorkMethod();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTask#getWorkMethod <em>Work Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Method</em>' attribute is set.
	 * @see #unsetWorkMethod()
	 * @see #getWorkMethod()
	 * @see #setWorkMethod(String)
	 * @generated
	 */
	boolean isSetWorkMethod();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTask_Status()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTask#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTask#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(String)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTask#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(String)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Id</em>' attribute.
	 * @see #isSetTaskId()
	 * @see #unsetTaskId()
	 * @see #setTaskId(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTask_TaskId()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getTaskId();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTask#getTaskId <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Id</em>' attribute.
	 * @see #isSetTaskId()
	 * @see #unsetTaskId()
	 * @see #getTaskId()
	 * @generated
	 */
	void setTaskId(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTask#getTaskId <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTaskId()
	 * @see #getTaskId()
	 * @see #setTaskId(String)
	 * @generated
	 */
	void unsetTaskId();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTask#getTaskId <em>Task Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Task Id</em>' attribute is set.
	 * @see #unsetTaskId()
	 * @see #getTaskId()
	 * @see #setTaskId(String)
	 * @generated
	 */
	boolean isSetTaskId();

} // IfcTask
