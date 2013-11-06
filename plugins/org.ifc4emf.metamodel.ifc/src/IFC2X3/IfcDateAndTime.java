/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDateAndTimeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Date And Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDateAndTime#getDateComponent <em>Date Component</em>}</li>
 *   <li>{@link IFC2X3.IfcDateAndTime#getTimeComponent <em>Time Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDateAndTime()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDateAndTimeImplAdapter.class)
public interface IfcDateAndTime extends IfcDateTimeSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Time Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Component</em>' reference.
	 * @see #setTimeComponent(IfcLocalTime)
	 * @see IFC2X3.IFC2X3Package#getIfcDateAndTime_TimeComponent()
	 * @model required="true"
	 * @generated
	 */
	IfcLocalTime getTimeComponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDateAndTime#getTimeComponent <em>Time Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Component</em>' reference.
	 * @see #getTimeComponent()
	 * @generated
	 */
	void setTimeComponent(IfcLocalTime value);

	/**
	 * Returns the value of the '<em><b>Date Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Component</em>' reference.
	 * @see #setDateComponent(IfcCalendarDate)
	 * @see IFC2X3.IFC2X3Package#getIfcDateAndTime_DateComponent()
	 * @model required="true"
	 * @generated
	 */
	IfcCalendarDate getDateComponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDateAndTime#getDateComponent <em>Date Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Component</em>' reference.
	 * @see #getDateComponent()
	 * @generated
	 */
	void setDateComponent(IfcCalendarDate value);

} // IfcDateAndTime
