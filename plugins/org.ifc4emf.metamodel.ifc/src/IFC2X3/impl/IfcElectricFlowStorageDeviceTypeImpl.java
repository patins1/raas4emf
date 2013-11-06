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
import IFC2X3.IfcElectricFlowStorageDeviceType;
import IFC2X3.IfcElectricFlowStorageDeviceTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Electric Flow Storage Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcElectricFlowStorageDeviceTypeImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcElectricFlowStorageDeviceType")
@XmlRootElement(name = "IfcElectricFlowStorageDeviceTypeElement")
public class IfcElectricFlowStorageDeviceTypeImpl extends IfcFlowStorageDeviceTypeImpl implements IfcElectricFlowStorageDeviceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElectricFlowStorageDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcElectricFlowStorageDeviceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricFlowStorageDeviceTypeEnum getPredefinedType() {
		return (IfcElectricFlowStorageDeviceTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcElectricFlowStorageDeviceType_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcElectricFlowStorageDeviceTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricFlowStorageDeviceType_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricFlowStorageDeviceType_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricFlowStorageDeviceType_PredefinedType());
	}

} //IfcElectricFlowStorageDeviceTypeImpl
