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
import IFC2X3.IfcRelConnectsStructuralElement;
import IFC2X3.IfcStructuralMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Structural Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsStructuralElementImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsStructuralElementImpl#getRelatedStructuralMember <em>Related Structural Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelConnectsStructuralElement")
@XmlRootElement(name = "IfcRelConnectsStructuralElementElement")
public class IfcRelConnectsStructuralElementImpl extends IfcRelConnectsImpl implements IfcRelConnectsStructuralElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsStructuralElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralMember getRelatedStructuralMember() {
		return (IfcStructuralMember)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralElement_RelatedStructuralMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedStructuralMember(IfcStructuralMember newRelatedStructuralMember) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralElement_RelatedStructuralMember(), newRelatedStructuralMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatingElement() {
		return (IfcElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralElement_RelatingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingElement(IfcElement newRelatingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralElement_RelatingElement(), newRelatingElement);
	}

} //IfcRelConnectsStructuralElementImpl
