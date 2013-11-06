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
import IFC2X3.IfcAheadOrBehind;
import IFC2X3.IfcCoordinatedUniversalTimeOffset;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Coordinated Universal Time Offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCoordinatedUniversalTimeOffsetImpl#getHourOffset <em>Hour Offset</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCoordinatedUniversalTimeOffsetImpl#getMinuteOffset <em>Minute Offset</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCoordinatedUniversalTimeOffsetImpl#getSense <em>Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCoordinatedUniversalTimeOffset")
@XmlRootElement(name = "IfcCoordinatedUniversalTimeOffsetElement")
public class IfcCoordinatedUniversalTimeOffsetImpl extends CDOObjectImpl implements IfcCoordinatedUniversalTimeOffset {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCoordinatedUniversalTimeOffsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAheadOrBehind getSense() {
		return (IfcAheadOrBehind)eGet(IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_Sense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSense(IfcAheadOrBehind newSense) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_Sense(), newSense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSense() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_Sense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSense() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_Sense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinuteOffset() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_MinuteOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinuteOffset(Integer newMinuteOffset) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_MinuteOffset(), newMinuteOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinuteOffset() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_MinuteOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinuteOffset() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_MinuteOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHourOffset() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_HourOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHourOffset(Integer newHourOffset) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_HourOffset(), newHourOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHourOffset() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_HourOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHourOffset() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_HourOffset());
	}

} //IfcCoordinatedUniversalTimeOffsetImpl
