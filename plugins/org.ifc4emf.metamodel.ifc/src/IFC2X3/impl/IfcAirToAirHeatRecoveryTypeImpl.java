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
import IFC2X3.IfcAirToAirHeatRecoveryType;
import IFC2X3.IfcAirToAirHeatRecoveryTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Air To Air Heat Recovery Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcAirToAirHeatRecoveryTypeImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcAirToAirHeatRecoveryType")
@XmlRootElement(name = "IfcAirToAirHeatRecoveryTypeElement")
public class IfcAirToAirHeatRecoveryTypeImpl extends IfcEnergyConversionDeviceTypeImpl implements IfcAirToAirHeatRecoveryType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAirToAirHeatRecoveryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAirToAirHeatRecoveryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirToAirHeatRecoveryTypeEnum getPredefinedType() {
		return (IfcAirToAirHeatRecoveryTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcAirToAirHeatRecoveryType_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcAirToAirHeatRecoveryTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAirToAirHeatRecoveryType_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAirToAirHeatRecoveryType_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAirToAirHeatRecoveryType_PredefinedType());
	}

} //IfcAirToAirHeatRecoveryTypeImpl
