/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcAxis2Placement;
import IFC2X3.IfcMappedItem;
import IFC2X3.IfcRepresentation;
import IFC2X3.IfcRepresentationMap;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
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
 * An implementation of the model object '<em><b>Ifc Representation Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRepresentationMapImpl#getMappingOrigin <em>Mapping Origin</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRepresentationMapImpl#getMappedRepresentation <em>Mapped Representation</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRepresentationMapImpl#getMapUsage <em>Map Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRepresentationMap")
@XmlRootElement(name = "IfcRepresentationMapElement")
public class IfcRepresentationMapImpl extends CDOObjectImpl implements IfcRepresentationMap {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRepresentationMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRepresentationMap();
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
	@SuppressWarnings("unchecked")
	public EList<IfcMappedItem> getMapUsage() {
		return (EList<IfcMappedItem>)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentationMap_MapUsage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getMappingOrigin() {
		return (IfcAxis2Placement)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentationMap_MappingOrigin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingOrigin(IfcAxis2Placement newMappingOrigin) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRepresentationMap_MappingOrigin(), newMappingOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentation getMappedRepresentation() {
		return (IfcRepresentation)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentationMap_MappedRepresentation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedRepresentation(IfcRepresentation newMappedRepresentation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRepresentationMap_MappedRepresentation(), newMappedRepresentation);
	}

} //IfcRepresentationMapImpl
