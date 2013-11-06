/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcCalendarDate;
import IFC2X3.IfcDateAndTime;
import IFC2X3.IfcLocalTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Date And Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDateAndTimeImpl#getDateComponent <em>Date Component</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDateAndTimeImpl#getTimeComponent <em>Time Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDateAndTime")
@XmlRootElement(name = "IfcDateAndTimeElement")
public class IfcDateAndTimeImpl extends IfcDateTimeSelectImpl implements IfcDateAndTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDateAndTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDateAndTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLocalTime getTimeComponent() {
		return (IfcLocalTime)eGet(IFC2X3Package.eINSTANCE.getIfcDateAndTime_TimeComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeComponent(IfcLocalTime newTimeComponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDateAndTime_TimeComponent(), newTimeComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getDateComponent() {
		return (IfcCalendarDate)eGet(IFC2X3Package.eINSTANCE.getIfcDateAndTime_DateComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateComponent(IfcCalendarDate newDateComponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDateAndTime_DateComponent(), newDateComponent);
	}

} //IfcDateAndTimeImpl
