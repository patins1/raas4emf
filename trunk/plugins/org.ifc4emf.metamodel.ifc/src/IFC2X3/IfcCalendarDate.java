/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCalendarDateImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Calendar Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCalendarDate#getDayComponent <em>Day Component</em>}</li>
 *   <li>{@link IFC2X3.IfcCalendarDate#getMonthComponent <em>Month Component</em>}</li>
 *   <li>{@link IFC2X3.IfcCalendarDate#getYearComponent <em>Year Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCalendarDate()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCalendarDateImplAdapter.class)
public interface IfcCalendarDate extends IfcDateTimeSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Year Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Component</em>' attribute.
	 * @see #isSetYearComponent()
	 * @see #unsetYearComponent()
	 * @see #setYearComponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcCalendarDate_YearComponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getYearComponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCalendarDate#getYearComponent <em>Year Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Component</em>' attribute.
	 * @see #isSetYearComponent()
	 * @see #unsetYearComponent()
	 * @see #getYearComponent()
	 * @generated
	 */
	void setYearComponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCalendarDate#getYearComponent <em>Year Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYearComponent()
	 * @see #getYearComponent()
	 * @see #setYearComponent(Integer)
	 * @generated
	 */
	void unsetYearComponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCalendarDate#getYearComponent <em>Year Component</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Year Component</em>' attribute is set.
	 * @see #unsetYearComponent()
	 * @see #getYearComponent()
	 * @see #setYearComponent(Integer)
	 * @generated
	 */
	boolean isSetYearComponent();

	/**
	 * Returns the value of the '<em><b>Month Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month Component</em>' attribute.
	 * @see #isSetMonthComponent()
	 * @see #unsetMonthComponent()
	 * @see #setMonthComponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcCalendarDate_MonthComponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getMonthComponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCalendarDate#getMonthComponent <em>Month Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month Component</em>' attribute.
	 * @see #isSetMonthComponent()
	 * @see #unsetMonthComponent()
	 * @see #getMonthComponent()
	 * @generated
	 */
	void setMonthComponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCalendarDate#getMonthComponent <em>Month Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonthComponent()
	 * @see #getMonthComponent()
	 * @see #setMonthComponent(Integer)
	 * @generated
	 */
	void unsetMonthComponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCalendarDate#getMonthComponent <em>Month Component</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Month Component</em>' attribute is set.
	 * @see #unsetMonthComponent()
	 * @see #getMonthComponent()
	 * @see #setMonthComponent(Integer)
	 * @generated
	 */
	boolean isSetMonthComponent();

	/**
	 * Returns the value of the '<em><b>Day Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Component</em>' attribute.
	 * @see #isSetDayComponent()
	 * @see #unsetDayComponent()
	 * @see #setDayComponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcCalendarDate_DayComponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getDayComponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCalendarDate#getDayComponent <em>Day Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Component</em>' attribute.
	 * @see #isSetDayComponent()
	 * @see #unsetDayComponent()
	 * @see #getDayComponent()
	 * @generated
	 */
	void setDayComponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCalendarDate#getDayComponent <em>Day Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDayComponent()
	 * @see #getDayComponent()
	 * @see #setDayComponent(Integer)
	 * @generated
	 */
	void unsetDayComponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCalendarDate#getDayComponent <em>Day Component</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Day Component</em>' attribute is set.
	 * @see #unsetDayComponent()
	 * @see #getDayComponent()
	 * @see #setDayComponent(Integer)
	 * @generated
	 */
	boolean isSetDayComponent();

} // IfcCalendarDate
