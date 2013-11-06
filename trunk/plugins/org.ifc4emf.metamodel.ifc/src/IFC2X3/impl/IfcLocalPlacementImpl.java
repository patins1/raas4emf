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
import IFC2X3.IfcAxis2Placement;
import IFC2X3.IfcLocalPlacement;
import IFC2X3.IfcObjectPlacement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Local Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcLocalPlacementImpl#getPlacementRelTo <em>Placement Rel To</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLocalPlacementImpl#getRelativePlacement <em>Relative Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcLocalPlacement")
@XmlRootElement(name = "IfcLocalPlacementElement")
public class IfcLocalPlacementImpl extends IfcObjectPlacementImpl implements IfcLocalPlacement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLocalPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcLocalPlacement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectPlacement getPlacementRelTo() {
		return (IfcObjectPlacement)eGet(IFC2X3Package.eINSTANCE.getIfcLocalPlacement_PlacementRelTo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementRelTo(IfcObjectPlacement newPlacementRelTo) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLocalPlacement_PlacementRelTo(), newPlacementRelTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getRelativePlacement() {
		return (IfcAxis2Placement)eGet(IFC2X3Package.eINSTANCE.getIfcLocalPlacement_RelativePlacement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePlacement(IfcAxis2Placement newRelativePlacement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLocalPlacement_RelativePlacement(), newRelativePlacement);
	}

} //IfcLocalPlacementImpl
