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
import IFC2X3.IfcStairFlight;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Stair Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStairFlightImpl#getNumberOfRiser <em>Number Of Riser</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStairFlightImpl#getNumberOfTreads <em>Number Of Treads</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStairFlightImpl#getRiserHeight <em>Riser Height</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStairFlightImpl#getTreadLength <em>Tread Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStairFlight")
@XmlRootElement(name = "IfcStairFlightElement")
public class IfcStairFlightImpl extends IfcBuildingElementImpl implements IfcStairFlight {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStairFlightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStairFlight();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTreadLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStairFlight_TreadLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreadLength(Double newTreadLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStairFlight_TreadLength(), newTreadLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTreadLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStairFlight_TreadLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTreadLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStairFlight_TreadLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRiserHeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStairFlight_RiserHeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiserHeight(Double newRiserHeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStairFlight_RiserHeight(), newRiserHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRiserHeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStairFlight_RiserHeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRiserHeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStairFlight_RiserHeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfTreads() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcStairFlight_NumberOfTreads(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfTreads(Integer newNumberOfTreads) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStairFlight_NumberOfTreads(), newNumberOfTreads);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberOfTreads() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStairFlight_NumberOfTreads());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberOfTreads() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStairFlight_NumberOfTreads());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfRiser() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcStairFlight_NumberOfRiser(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRiser(Integer newNumberOfRiser) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStairFlight_NumberOfRiser(), newNumberOfRiser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberOfRiser() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStairFlight_NumberOfRiser());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberOfRiser() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStairFlight_NumberOfRiser());
	}

} //IfcStairFlightImpl
