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
import IFC2X3.IfcQuantityVolume;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Quantity Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcQuantityVolumeImpl#getVolumeValue <em>Volume Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcQuantityVolume")
@XmlRootElement(name = "IfcQuantityVolumeElement")
public class IfcQuantityVolumeImpl extends IfcPhysicalSimpleQuantityImpl implements IfcQuantityVolume {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcQuantityVolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcQuantityVolume();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVolumeValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcQuantityVolume_VolumeValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeValue(Double newVolumeValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcQuantityVolume_VolumeValue(), newVolumeValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolumeValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcQuantityVolume_VolumeValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolumeValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcQuantityVolume_VolumeValue());
	}

} //IfcQuantityVolumeImpl
