/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcRelServicesBuildings;
import IFC2X3.IfcSystem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSystemImpl#getServicesBuildings <em>Services Buildings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSystem")
@XmlSeeAlso({ IfcElectricalCircuitImpl.class, IfcStructuralAnalysisModelImpl.class })
@XmlRootElement(name = "IfcSystemElement")
public class IfcSystemImpl extends IfcGroupImpl implements IfcSystem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelServicesBuildings getServicesBuildings() {
		return (IfcRelServicesBuildings)eGet(IFC2X3Package.eINSTANCE.getIfcSystem_ServicesBuildings(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicesBuildings(IfcRelServicesBuildings newServicesBuildings) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSystem_ServicesBuildings(), newServicesBuildings);
	}

} //IfcSystemImpl
