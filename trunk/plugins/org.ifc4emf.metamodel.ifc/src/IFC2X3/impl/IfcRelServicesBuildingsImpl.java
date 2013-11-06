/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcRelServicesBuildings;
import IFC2X3.IfcSpatialStructureElement;
import IFC2X3.IfcSystem;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Services Buildings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelServicesBuildingsImpl#getRelatingSystem <em>Relating System</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelServicesBuildingsImpl#getRelatedBuildings <em>Related Buildings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelServicesBuildings")
@XmlRootElement(name = "IfcRelServicesBuildingsElement")
public class IfcRelServicesBuildingsImpl extends IfcRelConnectsImpl implements IfcRelServicesBuildings {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelServicesBuildingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelServicesBuildings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSystem getRelatingSystem() {
		return (IfcSystem)eGet(IFC2X3Package.eINSTANCE.getIfcRelServicesBuildings_RelatingSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingSystem(IfcSystem newRelatingSystem) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelServicesBuildings_RelatingSystem(), newRelatingSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcSpatialStructureElement> getRelatedBuildings() {
		return (EList<IfcSpatialStructureElement>)eGet(IFC2X3Package.eINSTANCE.getIfcRelServicesBuildings_RelatedBuildings(), true);
	}

} //IfcRelServicesBuildingsImpl
