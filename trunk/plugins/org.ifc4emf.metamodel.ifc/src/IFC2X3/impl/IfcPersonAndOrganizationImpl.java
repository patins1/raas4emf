/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcActorRole;
import IFC2X3.IfcOrganization;
import IFC2X3.IfcPerson;
import IFC2X3.IfcPersonAndOrganization;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Person And Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPersonAndOrganizationImpl#getThePerson <em>The Person</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPersonAndOrganizationImpl#getTheOrganization <em>The Organization</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPersonAndOrganizationImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPersonAndOrganization")
@XmlRootElement(name = "IfcPersonAndOrganizationElement")
public class IfcPersonAndOrganizationImpl extends IfcActorSelectImpl implements IfcPersonAndOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPersonAndOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPersonAndOrganization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPerson getThePerson() {
		return (IfcPerson)eGet(IFC2X3Package.eINSTANCE.getIfcPersonAndOrganization_ThePerson(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThePerson(IfcPerson newThePerson) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPersonAndOrganization_ThePerson(), newThePerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization getTheOrganization() {
		return (IfcOrganization)eGet(IFC2X3Package.eINSTANCE.getIfcPersonAndOrganization_TheOrganization(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheOrganization(IfcOrganization newTheOrganization) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPersonAndOrganization_TheOrganization(), newTheOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcActorRole> getRoles() {
		return (EList<IfcActorRole>)eGet(IFC2X3Package.eINSTANCE.getIfcPersonAndOrganization_Roles(), true);
	}

} //IfcPersonAndOrganizationImpl
