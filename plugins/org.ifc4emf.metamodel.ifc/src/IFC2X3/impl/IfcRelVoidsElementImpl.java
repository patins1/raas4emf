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
import IFC2X3.IfcFeatureElementSubtraction;
import IFC2X3.IfcRelVoidsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Voids Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelVoidsElementImpl#getRelatingBuildingElement <em>Relating Building Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelVoidsElementImpl#getRelatedOpeningElement <em>Related Opening Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelVoidsElement")
@XmlRootElement(name = "IfcRelVoidsElementElement")
public class IfcRelVoidsElementImpl extends IfcRelConnectsImpl implements IfcRelVoidsElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelVoidsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelVoidsElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatingBuildingElement() {
		return (IfcElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelVoidsElement_RelatingBuildingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingBuildingElement(IfcElement newRelatingBuildingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelVoidsElement_RelatingBuildingElement(), newRelatingBuildingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFeatureElementSubtraction getRelatedOpeningElement() {
		return (IfcFeatureElementSubtraction)eGet(IFC2X3Package.eINSTANCE.getIfcRelVoidsElement_RelatedOpeningElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedOpeningElement(IfcFeatureElementSubtraction newRelatedOpeningElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelVoidsElement_RelatedOpeningElement(), newRelatedOpeningElement);
	}

} //IfcRelVoidsElementImpl
