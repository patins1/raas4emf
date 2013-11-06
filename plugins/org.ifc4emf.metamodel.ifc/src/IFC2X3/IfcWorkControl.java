/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcWorkControlImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Work Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcWorkControl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link IFC2X3.IfcWorkControl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link IFC2X3.IfcWorkControl#getCreators <em>Creators</em>}</li>
 *   <li>{@link IFC2X3.IfcWorkControl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link IFC2X3.IfcWorkControl#getDuration <em>Duration</em>}</li>
 *   <li>{@link IFC2X3.IfcWorkControl#getTotalFloat <em>Total Float</em>}</li>
 *   <li>{@link IFC2X3.IfcWorkControl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link IFC2X3.IfcWorkControl#getFinishTime <em>Finish Time</em>}</li>
 *   <li>{@link IFC2X3.IfcWorkControl#getWorkControlType <em>Work Control Type</em>}</li>
 *   <li>{@link IFC2X3.IfcWorkControl#getUserDefinedControlType <em>User Defined Control Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcWorkControl()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcWorkControlImplAdapter.class)
public interface IfcWorkControl extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Finish Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Time</em>' reference.
	 * @see #setFinishTime(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcWorkControl_FinishTime()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getFinishTime();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWorkControl#getFinishTime <em>Finish Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Time</em>' reference.
	 * @see #getFinishTime()
	 * @generated
	 */
	void setFinishTime(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' reference.
	 * @see #setStartTime(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcWorkControl_StartTime()
	 * @model required="true"
	 * @generated
	 */
	IfcDateTimeSelect getStartTime();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWorkControl#getStartTime <em>Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' reference.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Creators</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcPerson}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creators</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcWorkControl_Creators()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IfcPerson> getCreators();

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' reference.
	 * @see #setCreationDate(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcWorkControl_CreationDate()
	 * @model required="true"
	 * @generated
	 */
	IfcDateTimeSelect getCreationDate();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWorkControl#getCreationDate <em>Creation Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' reference.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>User Defined Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Control Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Control Type</em>' attribute.
	 * @see #isSetUserDefinedControlType()
	 * @see #unsetUserDefinedControlType()
	 * @see #setUserDefinedControlType(String)
	 * @see IFC2X3.IFC2X3Package#getIfcWorkControl_UserDefinedControlType()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedControlType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWorkControl#getUserDefinedControlType <em>User Defined Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Control Type</em>' attribute.
	 * @see #isSetUserDefinedControlType()
	 * @see #unsetUserDefinedControlType()
	 * @see #getUserDefinedControlType()
	 * @generated
	 */
	void setUserDefinedControlType(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWorkControl#getUserDefinedControlType <em>User Defined Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedControlType()
	 * @see #getUserDefinedControlType()
	 * @see #setUserDefinedControlType(String)
	 * @generated
	 */
	void unsetUserDefinedControlType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWorkControl#getUserDefinedControlType <em>User Defined Control Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Control Type</em>' attribute is set.
	 * @see #unsetUserDefinedControlType()
	 * @see #getUserDefinedControlType()
	 * @see #setUserDefinedControlType(String)
	 * @generated
	 */
	boolean isSetUserDefinedControlType();

	/**
	 * Returns the value of the '<em><b>Work Control Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcWorkControlTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Control Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Control Type</em>' attribute.
	 * @see IFC2X3.IfcWorkControlTypeEnum
	 * @see #isSetWorkControlType()
	 * @see #unsetWorkControlType()
	 * @see #setWorkControlType(IfcWorkControlTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcWorkControl_WorkControlType()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcWorkControlTypeEnum getWorkControlType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWorkControl#getWorkControlType <em>Work Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Control Type</em>' attribute.
	 * @see IFC2X3.IfcWorkControlTypeEnum
	 * @see #isSetWorkControlType()
	 * @see #unsetWorkControlType()
	 * @see #getWorkControlType()
	 * @generated
	 */
	void setWorkControlType(IfcWorkControlTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWorkControl#getWorkControlType <em>Work Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkControlType()
	 * @see #getWorkControlType()
	 * @see #setWorkControlType(IfcWorkControlTypeEnum)
	 * @generated
	 */
	void unsetWorkControlType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWorkControl#getWorkControlType <em>Work Control Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Control Type</em>' attribute is set.
	 * @see #unsetWorkControlType()
	 * @see #getWorkControlType()
	 * @see #setWorkControlType(IfcWorkControlTypeEnum)
	 * @generated
	 */
	boolean isSetWorkControlType();

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
	 * @see IFC2X3.IFC2X3Package#getIfcWorkControl_TotalFloat()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTotalFloat();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWorkControl#getTotalFloat <em>Total Float</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcWorkControl#getTotalFloat <em>Total Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalFloat()
	 * @see #getTotalFloat()
	 * @see #setTotalFloat(Double)
	 * @generated
	 */
	void unsetTotalFloat();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWorkControl#getTotalFloat <em>Total Float</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #setDuration(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWorkControl_Duration()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getDuration();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWorkControl#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWorkControl#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDuration()
	 * @see #getDuration()
	 * @see #setDuration(Double)
	 * @generated
	 */
	void unsetDuration();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWorkControl#getDuration <em>Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duration</em>' attribute is set.
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @see #setDuration(Double)
	 * @generated
	 */
	boolean isSetDuration();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #setPurpose(String)
	 * @see IFC2X3.IFC2X3Package#getIfcWorkControl_Purpose()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWorkControl#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWorkControl#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(String)
	 * @generated
	 */
	void unsetPurpose();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWorkControl#getPurpose <em>Purpose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Purpose</em>' attribute is set.
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(String)
	 * @generated
	 */
	boolean isSetPurpose();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #isSetIdentifier()
	 * @see #unsetIdentifier()
	 * @see #setIdentifier(String)
	 * @see IFC2X3.IFC2X3Package#getIfcWorkControl_Identifier()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWorkControl#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #isSetIdentifier()
	 * @see #unsetIdentifier()
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWorkControl#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdentifier()
	 * @see #getIdentifier()
	 * @see #setIdentifier(String)
	 * @generated
	 */
	void unsetIdentifier();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWorkControl#getIdentifier <em>Identifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Identifier</em>' attribute is set.
	 * @see #unsetIdentifier()
	 * @see #getIdentifier()
	 * @see #setIdentifier(String)
	 * @generated
	 */
	boolean isSetIdentifier();

} // IfcWorkControl
