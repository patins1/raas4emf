/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcLocalPlacement;
import IFC2X3.IfcObjectPlacement;
import IFC2X3.IfcProduct;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Object Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcObjectPlacementImpl#getPlacesObject <em>Places Object</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcObjectPlacementImpl#getReferencedByPlacements <em>Referenced By Placements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcObjectPlacement")
@XmlSeeAlso({ IfcLocalPlacementImpl.class, IfcGridPlacementImpl.class })
@XmlRootElement(name = "IfcObjectPlacementElement")
public class IfcObjectPlacementImpl extends CDOObjectImpl implements IfcObjectPlacement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcObjectPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcObjectPlacement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProduct getPlacesObject() {
		return (IfcProduct)eGet(IFC2X3Package.eINSTANCE.getIfcObjectPlacement_PlacesObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacesObject(IfcProduct newPlacesObject) {
		eSet(IFC2X3Package.eINSTANCE.getIfcObjectPlacement_PlacesObject(), newPlacesObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcLocalPlacement> getReferencedByPlacements() {
		return (EList<IfcLocalPlacement>)eGet(IFC2X3Package.eINSTANCE.getIfcObjectPlacement_ReferencedByPlacements(), true);
	}

} //IfcObjectPlacementImpl
