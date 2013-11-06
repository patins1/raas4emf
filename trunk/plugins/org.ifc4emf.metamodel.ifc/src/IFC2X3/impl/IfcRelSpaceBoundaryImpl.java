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
import IFC2X3.IfcConnectionGeometry;
import IFC2X3.IfcElement;
import IFC2X3.IfcInternalOrExternalEnum;
import IFC2X3.IfcPhysicalOrVirtualEnum;
import IFC2X3.IfcRelSpaceBoundary;
import IFC2X3.IfcSpace;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Space Boundary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelSpaceBoundaryImpl#getRelatingSpace <em>Relating Space</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelSpaceBoundaryImpl#getRelatedBuildingElement <em>Related Building Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelSpaceBoundaryImpl#getConnectionGeometry <em>Connection Geometry</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelSpaceBoundaryImpl#getPhysicalOrVirtualBoundary <em>Physical Or Virtual Boundary</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelSpaceBoundaryImpl#getInternalOrExternalBoundary <em>Internal Or External Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelSpaceBoundary")
@XmlRootElement(name = "IfcRelSpaceBoundaryElement")
public class IfcRelSpaceBoundaryImpl extends IfcRelConnectsImpl implements IfcRelSpaceBoundary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelSpaceBoundaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpace getRelatingSpace() {
		return (IfcSpace)eGet(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_RelatingSpace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingSpace(IfcSpace newRelatingSpace) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_RelatingSpace(), newRelatingSpace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatedBuildingElement() {
		return (IfcElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_RelatedBuildingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedBuildingElement(IfcElement newRelatedBuildingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_RelatedBuildingElement(), newRelatedBuildingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionGeometry getConnectionGeometry() {
		return (IfcConnectionGeometry)eGet(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_ConnectionGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionGeometry(IfcConnectionGeometry newConnectionGeometry) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_ConnectionGeometry(), newConnectionGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInternalOrExternalEnum getInternalOrExternalBoundary() {
		return (IfcInternalOrExternalEnum)eGet(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_InternalOrExternalBoundary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalOrExternalBoundary(IfcInternalOrExternalEnum newInternalOrExternalBoundary) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_InternalOrExternalBoundary(), newInternalOrExternalBoundary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInternalOrExternalBoundary() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_InternalOrExternalBoundary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInternalOrExternalBoundary() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_InternalOrExternalBoundary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPhysicalOrVirtualEnum getPhysicalOrVirtualBoundary() {
		return (IfcPhysicalOrVirtualEnum)eGet(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_PhysicalOrVirtualBoundary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalOrVirtualBoundary(IfcPhysicalOrVirtualEnum newPhysicalOrVirtualBoundary) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_PhysicalOrVirtualBoundary(), newPhysicalOrVirtualBoundary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhysicalOrVirtualBoundary() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_PhysicalOrVirtualBoundary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhysicalOrVirtualBoundary() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelSpaceBoundary_PhysicalOrVirtualBoundary());
	}

} //IfcRelSpaceBoundaryImpl
