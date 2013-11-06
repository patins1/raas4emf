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
import IFC2X3.IfcRelConnectsPortToElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Port To Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsPortToElementImpl#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsPortToElementImpl#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelConnectsPortToElement")
@XmlRootElement(name = "IfcRelConnectsPortToElementElement")
public class IfcRelConnectsPortToElementImpl extends IfcRelConnectsImpl implements IfcRelConnectsPortToElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsPortToElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelConnectsPortToElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPort getRelatingPort() {
		return (IfcPort)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPortToElement_RelatingPort(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingPort(IfcPort newRelatingPort) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPortToElement_RelatingPort(), newRelatingPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatedElement() {
		return (IfcElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPortToElement_RelatedElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedElement(IfcElement newRelatedElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPortToElement_RelatedElement(), newRelatedElement);
	}

} //IfcRelConnectsPortToElementImpl
