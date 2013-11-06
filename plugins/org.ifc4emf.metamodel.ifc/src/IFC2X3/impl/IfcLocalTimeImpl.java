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
import IFC2X3.IfcCoordinatedUniversalTimeOffset;
import IFC2X3.IfcLocalTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Local Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcLocalTimeImpl#getHourComponent <em>Hour Component</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLocalTimeImpl#getMinuteComponent <em>Minute Component</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLocalTimeImpl#getSecondComponent <em>Second Component</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLocalTimeImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLocalTimeImpl#getDaylightSavingOffset <em>Daylight Saving Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcLocalTime")
@XmlRootElement(name = "IfcLocalTimeElement")
public class IfcLocalTimeImpl extends IfcDateTimeSelectImpl implements IfcLocalTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLocalTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcLocalTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoordinatedUniversalTimeOffset getZone() {
		return (IfcCoordinatedUniversalTimeOffset)eGet(IFC2X3Package.eINSTANCE.getIfcLocalTime_Zone(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(IfcCoordinatedUniversalTimeOffset newZone) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLocalTime_Zone(), newZone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDaylightSavingOffset() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcLocalTime_DaylightSavingOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaylightSavingOffset(Integer newDaylightSavingOffset) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLocalTime_DaylightSavingOffset(), newDaylightSavingOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDaylightSavingOffset() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLocalTime_DaylightSavingOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDaylightSavingOffset() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLocalTime_DaylightSavingOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSecondComponent() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLocalTime_SecondComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondComponent(Double newSecondComponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLocalTime_SecondComponent(), newSecondComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecondComponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLocalTime_SecondComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecondComponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLocalTime_SecondComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinuteComponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcLocalTime_MinuteComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinuteComponent(Integer newMinuteComponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLocalTime_MinuteComponent(), newMinuteComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinuteComponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLocalTime_MinuteComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinuteComponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLocalTime_MinuteComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHourComponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcLocalTime_HourComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHourComponent(Integer newHourComponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLocalTime_HourComponent(), newHourComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHourComponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLocalTime_HourComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHourComponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLocalTime_HourComponent());
	}

} //IfcLocalTimeImpl
