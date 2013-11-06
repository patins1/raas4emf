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
import IFC2X3.IfcDistributionPort;
import IFC2X3.IfcFlowDirectionEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Distribution Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDistributionPortImpl#getFlowDirection <em>Flow Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDistributionPort")
@XmlRootElement(name = "IfcDistributionPortElement")
public class IfcDistributionPortImpl extends IfcPortImpl implements IfcDistributionPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDistributionPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDistributionPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowDirectionEnum getFlowDirection() {
		return (IfcFlowDirectionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcDistributionPort_FlowDirection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowDirection(IfcFlowDirectionEnum newFlowDirection) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDistributionPort_FlowDirection(), newFlowDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowDirection() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDistributionPort_FlowDirection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowDirection() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDistributionPort_FlowDirection());
	}

} //IfcDistributionPortImpl
