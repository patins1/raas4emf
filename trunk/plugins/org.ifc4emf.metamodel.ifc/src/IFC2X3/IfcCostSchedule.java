/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcCostScheduleImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cost Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCostSchedule#getSubmittedBy <em>Submitted By</em>}</li>
 *   <li>{@link IFC2X3.IfcCostSchedule#getPreparedBy <em>Prepared By</em>}</li>
 *   <li>{@link IFC2X3.IfcCostSchedule#getSubmittedOn <em>Submitted On</em>}</li>
 *   <li>{@link IFC2X3.IfcCostSchedule#getStatus <em>Status</em>}</li>
 *   <li>{@link IFC2X3.IfcCostSchedule#getTargetUsers <em>Target Users</em>}</li>
 *   <li>{@link IFC2X3.IfcCostSchedule#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link IFC2X3.IfcCostSchedule#getID <em>ID</em>}</li>
 *   <li>{@link IFC2X3.IfcCostSchedule#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCostSchedule()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCostScheduleImplAdapter.class)
public interface IfcCostSchedule extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Update Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Date</em>' reference.
	 * @see #setUpdateDate(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcCostSchedule_UpdateDate()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getUpdateDate();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCostSchedule#getUpdateDate <em>Update Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Date</em>' reference.
	 * @see #getUpdateDate()
	 * @generated
	 */
	void setUpdateDate(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Submitted On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submitted On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitted On</em>' reference.
	 * @see #setSubmittedOn(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcCostSchedule_SubmittedOn()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getSubmittedOn();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCostSchedule#getSubmittedOn <em>Submitted On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitted On</em>' reference.
	 * @see #getSubmittedOn()
	 * @generated
	 */
	void setSubmittedOn(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Target Users</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcActorSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Users</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcCostSchedule_TargetUsers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IfcActorSelect> getTargetUsers();

	/**
	 * Returns the value of the '<em><b>Prepared By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prepared By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prepared By</em>' reference.
	 * @see #setPreparedBy(IfcActorSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcCostSchedule_PreparedBy()
	 * @model
	 * @generated
	 */
	IfcActorSelect getPreparedBy();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCostSchedule#getPreparedBy <em>Prepared By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prepared By</em>' reference.
	 * @see #getPreparedBy()
	 * @generated
	 */
	void setPreparedBy(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>Submitted By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submitted By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitted By</em>' reference.
	 * @see #setSubmittedBy(IfcActorSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcCostSchedule_SubmittedBy()
	 * @model
	 * @generated
	 */
	IfcActorSelect getSubmittedBy();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCostSchedule#getSubmittedBy <em>Submitted By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitted By</em>' reference.
	 * @see #getSubmittedBy()
	 * @generated
	 */
	void setSubmittedBy(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcCostScheduleTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcCostScheduleTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcCostScheduleTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcCostSchedule_PredefinedType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcCostScheduleTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCostSchedule#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcCostScheduleTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcCostScheduleTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCostSchedule#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcCostScheduleTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCostSchedule#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcCostScheduleTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #setID(String)
	 * @see IFC2X3.IFC2X3Package#getIfcCostSchedule_ID()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCostSchedule#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCostSchedule#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCostSchedule#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	boolean isSetID();

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
	 * @see IFC2X3.IFC2X3Package#getIfcCostSchedule_Status()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCostSchedule#getStatus <em>Status</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcCostSchedule#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(String)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCostSchedule#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(String)
	 * @generated
	 */
	boolean isSetStatus();

} // IfcCostSchedule
