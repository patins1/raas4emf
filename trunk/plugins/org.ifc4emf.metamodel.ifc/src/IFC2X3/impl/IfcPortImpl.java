/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcPort;
import IFC2X3.IfcRelConnectsPortToElement;
import IFC2X3.IfcRelConnectsPorts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPortImpl#getContainedIn <em>Contained In</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPortImpl#getConnectedFrom <em>Connected From</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPortImpl#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPort")
@XmlSeeAlso({ IfcDistributionPortImpl.class })
@XmlRootElement(name = "IfcPortElement")
public class IfcPortImpl extends IfcProductImpl implements IfcPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsPortToElement getContainedIn() {
		return (IfcRelConnectsPortToElement)eGet(IFC2X3Package.eINSTANCE.getIfcPort_ContainedIn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedIn(IfcRelConnectsPortToElement newContainedIn) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPort_ContainedIn(), newContainedIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsPorts getConnectedFrom() {
		return (IfcRelConnectsPorts)eGet(IFC2X3Package.eINSTANCE.getIfcPort_ConnectedFrom(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedFrom(IfcRelConnectsPorts newConnectedFrom) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPort_ConnectedFrom(), newConnectedFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsPorts getConnectedTo() {
		return (IfcRelConnectsPorts)eGet(IFC2X3Package.eINSTANCE.getIfcPort_ConnectedTo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedTo(IfcRelConnectsPorts newConnectedTo) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPort_ConnectedTo(), newConnectedTo);
	}

} //IfcPortImpl
