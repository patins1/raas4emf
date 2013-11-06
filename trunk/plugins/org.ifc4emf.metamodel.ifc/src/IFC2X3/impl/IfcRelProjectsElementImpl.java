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
import IFC2X3.IfcFeatureElementAddition;
import IFC2X3.IfcRelProjectsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Projects Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelProjectsElementImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelProjectsElementImpl#getRelatedFeatureElement <em>Related Feature Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelProjectsElement")
@XmlRootElement(name = "IfcRelProjectsElementElement")
public class IfcRelProjectsElementImpl extends IfcRelConnectsImpl implements IfcRelProjectsElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelProjectsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelProjectsElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFeatureElementAddition getRelatedFeatureElement() {
		return (IfcFeatureElementAddition)eGet(IFC2X3Package.eINSTANCE.getIfcRelProjectsElement_RelatedFeatureElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedFeatureElement(IfcFeatureElementAddition newRelatedFeatureElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelProjectsElement_RelatedFeatureElement(), newRelatedFeatureElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatingElement() {
		return (IfcElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelProjectsElement_RelatingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingElement(IfcElement newRelatingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelProjectsElement_RelatingElement(), newRelatingElement);
	}

} //IfcRelProjectsElementImpl
