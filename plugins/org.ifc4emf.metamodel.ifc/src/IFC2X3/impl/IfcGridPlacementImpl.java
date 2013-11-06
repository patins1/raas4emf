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
import IFC2X3.IfcGridPlacement;
import IFC2X3.IfcVirtualGridIntersection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Grid Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcGridPlacementImpl#getPlacementLocation <em>Placement Location</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGridPlacementImpl#getPlacementRefDirection <em>Placement Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcGridPlacement")
@XmlRootElement(name = "IfcGridPlacementElement")
public class IfcGridPlacementImpl extends IfcObjectPlacementImpl implements IfcGridPlacement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGridPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcGridPlacement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVirtualGridIntersection getPlacementRefDirection() {
		return (IfcVirtualGridIntersection)eGet(IFC2X3Package.eINSTANCE.getIfcGridPlacement_PlacementRefDirection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementRefDirection(IfcVirtualGridIntersection newPlacementRefDirection) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGridPlacement_PlacementRefDirection(), newPlacementRefDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVirtualGridIntersection getPlacementLocation() {
		return (IfcVirtualGridIntersection)eGet(IFC2X3Package.eINSTANCE.getIfcGridPlacement_PlacementLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementLocation(IfcVirtualGridIntersection newPlacementLocation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGridPlacement_PlacementLocation(), newPlacementLocation);
	}

} //IfcGridPlacementImpl
