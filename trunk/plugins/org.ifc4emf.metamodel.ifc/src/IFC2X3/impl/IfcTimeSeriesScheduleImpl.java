/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcDateTimeSelect;
import IFC2X3.IfcTimeSeries;
import IFC2X3.IfcTimeSeriesSchedule;
import IFC2X3.IfcTimeSeriesScheduleTypeEnum;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Time Series Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesScheduleImpl#getApplicableDates <em>Applicable Dates</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesScheduleImpl#getTimeSeriesScheduleType <em>Time Series Schedule Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesScheduleImpl#getTimeSeries <em>Time Series</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTimeSeriesSchedule")
@XmlRootElement(name = "IfcTimeSeriesScheduleElement")
public class IfcTimeSeriesScheduleImpl extends IfcControlImpl implements IfcTimeSeriesSchedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTimeSeriesScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTimeSeriesSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcDateTimeSelect> getApplicableDates() {
		return (EList<IfcDateTimeSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeriesSchedule_ApplicableDates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getTimeSeries() {
		return (IfcTimeSeries)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeriesSchedule_TimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeries(IfcTimeSeries newTimeSeries) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTimeSeriesSchedule_TimeSeries(), newTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesScheduleTypeEnum getTimeSeriesScheduleType() {
		return (IfcTimeSeriesScheduleTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeriesSchedule_TimeSeriesScheduleType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeriesScheduleType(IfcTimeSeriesScheduleTypeEnum newTimeSeriesScheduleType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTimeSeriesSchedule_TimeSeriesScheduleType(), newTimeSeriesScheduleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeSeriesScheduleType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTimeSeriesSchedule_TimeSeriesScheduleType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeSeriesScheduleType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTimeSeriesSchedule_TimeSeriesScheduleType());
	}

} //IfcTimeSeriesScheduleImpl
