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
import IFC2X3.IfcDistributionControlElement;
import IFC2X3.IfcRelFlowControlElements;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Distribution Control Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDistributionControlElementImpl#getControlElementId <em>Control Element Id</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDistributionControlElementImpl#getAssignedToFlowElement <em>Assigned To Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDistributionControlElement")
@XmlRootElement(name = "IfcDistributionControlElementElement")
public class IfcDistributionControlElementImpl extends IfcDistributionElementImpl implements IfcDistributionControlElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDistributionControlElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDistributionControlElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelFlowControlElements getAssignedToFlowElement() {
		return (IfcRelFlowControlElements)eGet(IFC2X3Package.eINSTANCE.getIfcDistributionControlElement_AssignedToFlowElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedToFlowElement(IfcRelFlowControlElements newAssignedToFlowElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDistributionControlElement_AssignedToFlowElement(), newAssignedToFlowElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlElementId() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDistributionControlElement_ControlElementId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlElementId(String newControlElementId) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDistributionControlElement_ControlElementId(), newControlElementId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetControlElementId() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDistributionControlElement_ControlElementId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetControlElementId() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDistributionControlElement_ControlElementId());
	}

} //IfcDistributionControlElementImpl
