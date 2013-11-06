/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcScheduleTimeControlImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Schedule Time Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getActualStart <em>Actual Start</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getEarlyStart <em>Early Start</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getLateStart <em>Late Start</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getScheduleStart <em>Schedule Start</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getActualFinish <em>Actual Finish</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getEarlyFinish <em>Early Finish</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getLateFinish <em>Late Finish</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getScheduleFinish <em>Schedule Finish</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getScheduleDuration <em>Schedule Duration</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getActualDuration <em>Actual Duration</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getRemainingTime <em>Remaining Time</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getFreeFloat <em>Free Float</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getTotalFloat <em>Total Float</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getIsCritical <em>Is Critical</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getStatusTime <em>Status Time</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getStartFloat <em>Start Float</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getFinishFloat <em>Finish Float</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link IFC2X3.IfcScheduleTimeControl#getScheduleTimeControlAssigned <em>Schedule Time Control Assigned</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcScheduleTimeControlImplAdapter.class)
public interface IfcScheduleTimeControl extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Schedule Time Control Assigned</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelAssignsTasks#getTimeForTask <em>Time For Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Time Control Assigned</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Time Control Assigned</em>' reference.
	 * @see #setScheduleTimeControlAssigned(IfcRelAssignsTasks)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_ScheduleTimeControlAssigned()
	 * @see IFC2X3.IfcRelAssignsTasks#getTimeForTask
	 * @model opposite="TimeForTask" required="true"
	 * @generated
	 */
	IfcRelAssignsTasks getScheduleTimeControlAssigned();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getScheduleTimeControlAssigned <em>Schedule Time Control Assigned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Time Control Assigned</em>' reference.
	 * @see #getScheduleTimeControlAssigned()
	 * @generated
	 */
	void setScheduleTimeControlAssigned(IfcRelAssignsTasks value);

	/**
	 * Returns the value of the '<em><b>Early Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Early Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Early Finish</em>' reference.
	 * @see #setEarlyFinish(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_EarlyFinish()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getEarlyFinish();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getEarlyFinish <em>Early Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Early Finish</em>' reference.
	 * @see #getEarlyFinish()
	 * @generated
	 */
	void setEarlyFinish(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Status Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Time</em>' reference.
	 * @see #setStatusTime(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_StatusTime()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getStatusTime();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getStatusTime <em>Status Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Time</em>' reference.
	 * @see #getStatusTime()
	 * @generated
	 */
	void setStatusTime(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Schedule Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Finish</em>' reference.
	 * @see #setScheduleFinish(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_ScheduleFinish()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getScheduleFinish();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getScheduleFinish <em>Schedule Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Finish</em>' reference.
	 * @see #getScheduleFinish()
	 * @generated
	 */
	void setScheduleFinish(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Schedule Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Start</em>' reference.
	 * @see #setScheduleStart(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_ScheduleStart()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getScheduleStart();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getScheduleStart <em>Schedule Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Start</em>' reference.
	 * @see #getScheduleStart()
	 * @generated
	 */
	void setScheduleStart(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Actual Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Start</em>' reference.
	 * @see #setActualStart(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_ActualStart()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getActualStart();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getActualStart <em>Actual Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Start</em>' reference.
	 * @see #getActualStart()
	 * @generated
	 */
	void setActualStart(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Late Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Late Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Late Start</em>' reference.
	 * @see #setLateStart(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_LateStart()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getLateStart();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getLateStart <em>Late Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Late Start</em>' reference.
	 * @see #getLateStart()
	 * @generated
	 */
	void setLateStart(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Actual Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Finish</em>' reference.
	 * @see #setActualFinish(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_ActualFinish()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getActualFinish();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getActualFinish <em>Actual Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Finish</em>' reference.
	 * @see #getActualFinish()
	 * @generated
	 */
	void setActualFinish(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Late Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Late Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Late Finish</em>' reference.
	 * @see #setLateFinish(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_LateFinish()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getLateFinish();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getLateFinish <em>Late Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Late Finish</em>' reference.
	 * @see #getLateFinish()
	 * @generated
	 */
	void setLateFinish(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Early Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Early Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Early Start</em>' reference.
	 * @see #setEarlyStart(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_EarlyStart()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getEarlyStart();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getEarlyStart <em>Early Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Early Start</em>' reference.
	 * @see #getEarlyStart()
	 * @generated
	 */
	void setEarlyStart(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion</em>' attribute.
	 * @see #isSetCompletion()
	 * @see #unsetCompletion()
	 * @see #setCompletion(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_Completion()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCompletion();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getCompletion <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion</em>' attribute.
	 * @see #isSetCompletion()
	 * @see #unsetCompletion()
	 * @see #getCompletion()
	 * @generated
	 */
	void setCompletion(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getCompletion <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompletion()
	 * @see #getCompletion()
	 * @see #setCompletion(Double)
	 * @generated
	 */
	void unsetCompletion();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcScheduleTimeControl#getCompletion <em>Completion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Completion</em>' attribute is set.
	 * @see #unsetCompletion()
	 * @see #getCompletion()
	 * @see #setCompletion(Double)
	 * @generated
	 */
	boolean isSetCompletion();

	/**
	 * Returns the value of the '<em><b>Finish Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Float</em>' attribute.
	 * @see #isSetFinishFloat()
	 * @see #unsetFinishFloat()
	 * @see #setFinishFloat(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_FinishFloat()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFinishFloat();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getFinishFloat <em>Finish Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Float</em>' attribute.
	 * @see #isSetFinishFloat()
	 * @see #unsetFinishFloat()
	 * @see #getFinishFloat()
	 * @generated
	 */
	void setFinishFloat(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getFinishFloat <em>Finish Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinishFloat()
	 * @see #getFinishFloat()
	 * @see #setFinishFloat(Double)
	 * @generated
	 */
	void unsetFinishFloat();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcScheduleTimeControl#getFinishFloat <em>Finish Float</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Finish Float</em>' attribute is set.
	 * @see #unsetFinishFloat()
	 * @see #getFinishFloat()
	 * @see #setFinishFloat(Double)
	 * @generated
	 */
	boolean isSetFinishFloat();

	/**
	 * Returns the value of the '<em><b>Start Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Float</em>' attribute.
	 * @see #isSetStartFloat()
	 * @see #unsetStartFloat()
	 * @see #setStartFloat(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_StartFloat()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getStartFloat();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getStartFloat <em>Start Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Float</em>' attribute.
	 * @see #isSetStartFloat()
	 * @see #unsetStartFloat()
	 * @see #getStartFloat()
	 * @generated
	 */
	void setStartFloat(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getStartFloat <em>Start Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartFloat()
	 * @see #getStartFloat()
	 * @see #setStartFloat(Double)
	 * @generated
	 */
	void unsetStartFloat();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcScheduleTimeControl#getStartFloat <em>Start Float</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Float</em>' attribute is set.
	 * @see #unsetStartFloat()
	 * @see #getStartFloat()
	 * @see #setStartFloat(Double)
	 * @generated
	 */
	boolean isSetStartFloat();

	/**
	 * Returns the value of the '<em><b>Is Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Critical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Critical</em>' attribute.
	 * @see #isSetIsCritical()
	 * @see #unsetIsCritical()
	 * @see #setIsCritical(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_IsCritical()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN"
	 * @generated
	 */
	Boolean getIsCritical();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getIsCritical <em>Is Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Critical</em>' attribute.
	 * @see #isSetIsCritical()
	 * @see #unsetIsCritical()
	 * @see #getIsCritical()
	 * @generated
	 */
	void setIsCritical(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getIsCritical <em>Is Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCritical()
	 * @see #getIsCritical()
	 * @see #setIsCritical(Boolean)
	 * @generated
	 */
	void unsetIsCritical();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcScheduleTimeControl#getIsCritical <em>Is Critical</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Critical</em>' attribute is set.
	 * @see #unsetIsCritical()
	 * @see #getIsCritical()
	 * @see #setIsCritical(Boolean)
	 * @generated
	 */
	boolean isSetIsCritical();

	/**
	 * Returns the value of the '<em><b>Total Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Float</em>' attribute.
	 * @see #isSetTotalFloat()
	 * @see #unsetTotalFloat()
	 * @see #setTotalFloat(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_TotalFloat()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTotalFloat();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getTotalFloat <em>Total Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Float</em>' attribute.
	 * @see #isSetTotalFloat()
	 * @see #unsetTotalFloat()
	 * @see #getTotalFloat()
	 * @generated
	 */
	void setTotalFloat(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getTotalFloat <em>Total Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalFloat()
	 * @see #getTotalFloat()
	 * @see #setTotalFloat(Double)
	 * @generated
	 */
	void unsetTotalFloat();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcScheduleTimeControl#getTotalFloat <em>Total Float</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Float</em>' attribute is set.
	 * @see #unsetTotalFloat()
	 * @see #getTotalFloat()
	 * @see #setTotalFloat(Double)
	 * @generated
	 */
	boolean isSetTotalFloat();

	/**
	 * Returns the value of the '<em><b>Free Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Float</em>' attribute.
	 * @see #isSetFreeFloat()
	 * @see #unsetFreeFloat()
	 * @see #setFreeFloat(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_FreeFloat()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFreeFloat();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getFreeFloat <em>Free Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Float</em>' attribute.
	 * @see #isSetFreeFloat()
	 * @see #unsetFreeFloat()
	 * @see #getFreeFloat()
	 * @generated
	 */
	void setFreeFloat(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getFreeFloat <em>Free Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFreeFloat()
	 * @see #getFreeFloat()
	 * @see #setFreeFloat(Double)
	 * @generated
	 */
	void unsetFreeFloat();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcScheduleTimeControl#getFreeFloat <em>Free Float</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Free Float</em>' attribute is set.
	 * @see #unsetFreeFloat()
	 * @see #getFreeFloat()
	 * @see #setFreeFloat(Double)
	 * @generated
	 */
	boolean isSetFreeFloat();

	/**
	 * Returns the value of the '<em><b>Remaining Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Time</em>' attribute.
	 * @see #isSetRemainingTime()
	 * @see #unsetRemainingTime()
	 * @see #setRemainingTime(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_RemainingTime()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRemainingTime();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getRemainingTime <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Time</em>' attribute.
	 * @see #isSetRemainingTime()
	 * @see #unsetRemainingTime()
	 * @see #getRemainingTime()
	 * @generated
	 */
	void setRemainingTime(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getRemainingTime <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemainingTime()
	 * @see #getRemainingTime()
	 * @see #setRemainingTime(Double)
	 * @generated
	 */
	void unsetRemainingTime();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcScheduleTimeControl#getRemainingTime <em>Remaining Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remaining Time</em>' attribute is set.
	 * @see #unsetRemainingTime()
	 * @see #getRemainingTime()
	 * @see #setRemainingTime(Double)
	 * @generated
	 */
	boolean isSetRemainingTime();

	/**
	 * Returns the value of the '<em><b>Actual Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Duration</em>' attribute.
	 * @see #isSetActualDuration()
	 * @see #unsetActualDuration()
	 * @see #setActualDuration(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_ActualDuration()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getActualDuration();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getActualDuration <em>Actual Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Duration</em>' attribute.
	 * @see #isSetActualDuration()
	 * @see #unsetActualDuration()
	 * @see #getActualDuration()
	 * @generated
	 */
	void setActualDuration(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getActualDuration <em>Actual Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActualDuration()
	 * @see #getActualDuration()
	 * @see #setActualDuration(Double)
	 * @generated
	 */
	void unsetActualDuration();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcScheduleTimeControl#getActualDuration <em>Actual Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actual Duration</em>' attribute is set.
	 * @see #unsetActualDuration()
	 * @see #getActualDuration()
	 * @see #setActualDuration(Double)
	 * @generated
	 */
	boolean isSetActualDuration();

	/**
	 * Returns the value of the '<em><b>Schedule Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Duration</em>' attribute.
	 * @see #isSetScheduleDuration()
	 * @see #unsetScheduleDuration()
	 * @see #setScheduleDuration(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcScheduleTimeControl_ScheduleDuration()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getScheduleDuration();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getScheduleDuration <em>Schedule Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Duration</em>' attribute.
	 * @see #isSetScheduleDuration()
	 * @see #unsetScheduleDuration()
	 * @see #getScheduleDuration()
	 * @generated
	 */
	void setScheduleDuration(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcScheduleTimeControl#getScheduleDuration <em>Schedule Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScheduleDuration()
	 * @see #getScheduleDuration()
	 * @see #setScheduleDuration(Double)
	 * @generated
	 */
	void unsetScheduleDuration();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcScheduleTimeControl#getScheduleDuration <em>Schedule Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schedule Duration</em>' attribute is set.
	 * @see #unsetScheduleDuration()
	 * @see #getScheduleDuration()
	 * @see #setScheduleDuration(Double)
	 * @generated
	 */
	boolean isSetScheduleDuration();

} // IfcScheduleTimeControl
