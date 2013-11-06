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
import IFC2X3.IfcRelAssignsToResource;
import IFC2X3.IfcResource;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcResourceImpl#getResourceOf <em>Resource Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcResource")
@XmlSeeAlso({ IfcSubContractResourceImpl.class, IfcConstructionEquipmentResourceImpl.class, IfcLaborResourceImpl.class, IfcCrewResourceImpl.class, IfcConstructionResourceImpl.class, IfcConstructionMaterialResourceImpl.class, IfcConstructionProductResourceImpl.class })
@XmlRootElement(name = "IfcResourceElement")
public class IfcResourceImpl extends IfcObjectImpl implements IfcResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssignsToResource> getResourceOf() {
		return (EList<IfcRelAssignsToResource>)eGet(IFC2X3Package.eINSTANCE.getIfcResource_ResourceOf(), true);
	}

} //IfcResourceImpl
