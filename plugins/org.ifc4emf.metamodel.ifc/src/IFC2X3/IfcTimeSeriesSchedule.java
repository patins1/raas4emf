/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcTimeSeriesScheduleImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Time Series Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTimeSeriesSchedule#getApplicableDates <em>Applicable Dates</em>}</li>
 *   <li>{@link IFC2X3.IfcTimeSeriesSchedule#getTimeSeriesScheduleType <em>Time Series Schedule Type</em>}</li>
 *   <li>{@link IFC2X3.IfcTimeSeriesSchedule#getTimeSeries <em>Time Series</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTimeSeriesSchedule()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTimeSeriesScheduleImplAdapter.class)
public interface IfcTimeSeriesSchedule extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Applicable Dates</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcDateTimeSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Dates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Dates</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeriesSchedule_ApplicableDates()
	 * @model
	 * @generated
	 */
	EList<IfcDateTimeSelect> getApplicableDates();

	/**
	 * Returns the value of the '<em><b>Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series</em>' reference.
	 * @see #setTimeSeries(IfcTimeSeries)
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeriesSchedule_TimeSeries()
	 * @model required="true"
	 * @generated
	 */
	IfcTimeSeries getTimeSeries();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTimeSeriesSchedule#getTimeSeries <em>Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Series</em>' reference.
	 * @see #getTimeSeries()
	 * @generated
	 */
	void setTimeSeries(IfcTimeSeries value);

	/**
	 * Returns the value of the '<em><b>Time Series Schedule Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcTimeSeriesScheduleTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series Schedule Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series Schedule Type</em>' attribute.
	 * @see IFC2X3.IfcTimeSeriesScheduleTypeEnum
	 * @see #isSetTimeSeriesScheduleType()
	 * @see #unsetTimeSeriesScheduleType()
	 * @see #setTimeSeriesScheduleType(IfcTimeSeriesScheduleTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeriesSchedule_TimeSeriesScheduleType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcTimeSeriesScheduleTypeEnum getTimeSeriesScheduleType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTimeSeriesSchedule#getTimeSeriesScheduleType <em>Time Series Schedule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Series Schedule Type</em>' attribute.
	 * @see IFC2X3.IfcTimeSeriesScheduleTypeEnum
	 * @see #isSetTimeSeriesScheduleType()
	 * @see #unsetTimeSeriesScheduleType()
	 * @see #getTimeSeriesScheduleType()
	 * @generated
	 */
	void setTimeSeriesScheduleType(IfcTimeSeriesScheduleTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTimeSeriesSchedule#getTimeSeriesScheduleType <em>Time Series Schedule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeSeriesScheduleType()
	 * @see #getTimeSeriesScheduleType()
	 * @see #setTimeSeriesScheduleType(IfcTimeSeriesScheduleTypeEnum)
	 * @generated
	 */
	void unsetTimeSeriesScheduleType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTimeSeriesSchedule#getTimeSeriesScheduleType <em>Time Series Schedule Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Series Schedule Type</em>' attribute is set.
	 * @see #unsetTimeSeriesScheduleType()
	 * @see #getTimeSeriesScheduleType()
	 * @see #setTimeSeriesScheduleType(IfcTimeSeriesScheduleTypeEnum)
	 * @generated
	 */
	boolean isSetTimeSeriesScheduleType();

} // IfcTimeSeriesSchedule
