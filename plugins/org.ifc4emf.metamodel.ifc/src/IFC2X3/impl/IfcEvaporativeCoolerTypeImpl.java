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
import IFC2X3.IfcEvaporativeCoolerType;
import IFC2X3.IfcEvaporativeCoolerTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Evaporative Cooler Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcEvaporativeCoolerTypeImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcEvaporativeCoolerType")
@XmlRootElement(name = "IfcEvaporativeCoolerTypeElement")
public class IfcEvaporativeCoolerTypeImpl extends IfcEnergyConversionDeviceTypeImpl implements IfcEvaporativeCoolerType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEvaporativeCoolerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcEvaporativeCoolerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEvaporativeCoolerTypeEnum getPredefinedType() {
		return (IfcEvaporativeCoolerTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcEvaporativeCoolerType_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcEvaporativeCoolerTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEvaporativeCoolerType_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcEvaporativeCoolerType_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcEvaporativeCoolerType_PredefinedType());
	}

} //IfcEvaporativeCoolerTypeImpl
