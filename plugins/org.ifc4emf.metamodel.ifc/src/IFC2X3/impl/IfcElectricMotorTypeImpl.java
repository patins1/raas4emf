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
import IFC2X3.IfcElectricMotorType;
import IFC2X3.IfcElectricMotorTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Electric Motor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcElectricMotorTypeImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcElectricMotorType")
@XmlRootElement(name = "IfcElectricMotorTypeElement")
public class IfcElectricMotorTypeImpl extends IfcEnergyConversionDeviceTypeImpl implements IfcElectricMotorType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElectricMotorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcElectricMotorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricMotorTypeEnum getPredefinedType() {
		return (IfcElectricMotorTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcElectricMotorType_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcElectricMotorTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricMotorType_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricMotorType_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricMotorType_PredefinedType());
	}

} //IfcElectricMotorTypeImpl
