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
import IFC2X3.IfcElement;
import IFC2X3.IfcPort;
import IFC2X3.IfcRelConnectsPorts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Ports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsPortsImpl#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsPortsImpl#getRelatedPort <em>Related Port</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsPortsImpl#getRealizingElement <em>Realizing Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelConnectsPorts")
@XmlRootElement(name = "IfcRelConnectsPortsElement")
public class IfcRelConnectsPortsImpl extends IfcRelConnectsImpl implements IfcRelConnectsPorts {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsPortsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelConnectsPorts();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPort getRelatedPort() {
		return (IfcPort)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPorts_RelatedPort(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedPort(IfcPort newRelatedPort) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPorts_RelatedPort(), newRelatedPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPort getRelatingPort() {
		return (IfcPort)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPorts_RelatingPort(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingPort(IfcPort newRelatingPort) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPorts_RelatingPort(), newRelatingPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRealizingElement() {
		return (IfcElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPorts_RealizingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizingElement(IfcElement newRealizingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPorts_RealizingElement(), newRealizingElement);
	}

} //IfcRelConnectsPortsImpl
