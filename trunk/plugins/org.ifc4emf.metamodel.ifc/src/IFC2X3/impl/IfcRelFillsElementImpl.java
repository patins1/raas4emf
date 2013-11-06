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
import IFC2X3.IfcOpeningElement;
import IFC2X3.IfcRelFillsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Fills Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelFillsElementImpl#getRelatingOpeningElement <em>Relating Opening Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelFillsElementImpl#getRelatedBuildingElement <em>Related Building Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelFillsElement")
@XmlRootElement(name = "IfcRelFillsElementElement")
public class IfcRelFillsElementImpl extends IfcRelConnectsImpl implements IfcRelFillsElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelFillsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelFillsElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOpeningElement getRelatingOpeningElement() {
		return (IfcOpeningElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelFillsElement_RelatingOpeningElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingOpeningElement(IfcOpeningElement newRelatingOpeningElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelFillsElement_RelatingOpeningElement(), newRelatingOpeningElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatedBuildingElement() {
		return (IfcElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelFillsElement_RelatedBuildingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedBuildingElement(IfcElement newRelatedBuildingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelFillsElement_RelatedBuildingElement(), newRelatedBuildingElement);
	}

} //IfcRelFillsElementImpl
