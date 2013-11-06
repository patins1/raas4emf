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
import IFC2X3.IfcElectricApplianceType;
import IFC2X3.IfcElectricApplianceTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Electric Appliance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcElectricApplianceTypeImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcElectricApplianceType")
@XmlRootElement(name = "IfcElectricApplianceTypeElement")
public class IfcElectricApplianceTypeImpl extends IfcFlowTerminalTypeImpl implements IfcElectricApplianceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElectricApplianceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcElectricApplianceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricApplianceTypeEnum getPredefinedType() {
		return (IfcElectricApplianceTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcElectricApplianceType_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcElectricApplianceTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricApplianceType_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricApplianceType_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricApplianceType_PredefinedType());
	}

} //IfcElectricApplianceTypeImpl
