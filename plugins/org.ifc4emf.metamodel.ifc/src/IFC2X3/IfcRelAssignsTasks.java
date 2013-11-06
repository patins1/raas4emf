/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssignsTasksImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns Tasks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssignsTasks#getTimeForTask <em>Time For Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsTasks()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssignsTasksImplAdapter.class)
public interface IfcRelAssignsTasks extends IfcRelAssignsToControl {
	/**
	 * Returns the value of the '<em><b>Time For Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcScheduleTimeControl#getScheduleTimeControlAssigned <em>Schedule Time Control Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time For Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time For Task</em>' reference.
	 * @see #setTimeForTask(IfcScheduleTimeControl)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsTasks_TimeForTask()
	 * @see IFC2X3.IfcScheduleTimeControl#getScheduleTimeControlAssigned
	 * @model opposite="ScheduleTimeControlAssigned"
	 * @generated
	 */
	IfcScheduleTimeControl getTimeForTask();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssignsTasks#getTimeForTask <em>Time For Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time For Task</em>' reference.
	 * @see #getTimeForTask()
	 * @generated
	 */
	void setTimeForTask(IfcScheduleTimeControl value);

} // IfcRelAssignsTasks
