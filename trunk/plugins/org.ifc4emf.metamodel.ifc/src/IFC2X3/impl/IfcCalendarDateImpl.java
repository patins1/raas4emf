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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Calendar Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCalendarDateImpl#getDayComponent <em>Day Component</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCalendarDateImpl#getMonthComponent <em>Month Component</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCalendarDateImpl#getYearComponent <em>Year Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCalendarDate")
@XmlRootElement(name = "IfcCalendarDateElement")
public class IfcCalendarDateImpl extends IfcDateTimeSelectImpl implements IfcCalendarDate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCalendarDateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCalendarDate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYearComponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcCalendarDate_YearComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearComponent(Integer newYearComponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCalendarDate_YearComponent(), newYearComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetYearComponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCalendarDate_YearComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetYearComponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCalendarDate_YearComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMonthComponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcCalendarDate_MonthComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonthComponent(Integer newMonthComponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCalendarDate_MonthComponent(), newMonthComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMonthComponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCalendarDate_MonthComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMonthComponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCalendarDate_MonthComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDayComponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcCalendarDate_DayComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayComponent(Integer newDayComponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCalendarDate_DayComponent(), newDayComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDayComponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCalendarDate_DayComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDayComponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCalendarDate_DayComponent());
	}

} //IfcCalendarDateImpl
