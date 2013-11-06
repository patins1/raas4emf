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
import IFC2X3.IfcApplication;
import IFC2X3.IfcOrganization;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcApplicationImpl#getApplicationDeveloper <em>Application Developer</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApplicationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApplicationImpl#getApplicationFullName <em>Application Full Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcApplicationImpl#getApplicationIdentifier <em>Application Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcApplication")
@XmlRootElement(name = "IfcApplicationElement")
public class IfcApplicationImpl extends CDOObjectImpl implements IfcApplication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcApplication();
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
	public IfcOrganization getApplicationDeveloper() {
		return (IfcOrganization)eGet(IFC2X3Package.eINSTANCE.getIfcApplication_ApplicationDeveloper(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationDeveloper(IfcOrganization newApplicationDeveloper) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApplication_ApplicationDeveloper(), newApplicationDeveloper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationIdentifier() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcApplication_ApplicationIdentifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationIdentifier(String newApplicationIdentifier) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApplication_ApplicationIdentifier(), newApplicationIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicationIdentifier() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcApplication_ApplicationIdentifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicationIdentifier() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcApplication_ApplicationIdentifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationFullName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcApplication_ApplicationFullName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationFullName(String newApplicationFullName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApplication_ApplicationFullName(), newApplicationFullName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicationFullName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcApplication_ApplicationFullName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicationFullName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcApplication_ApplicationFullName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcApplication_Version(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(IFC2X3Package.eINSTANCE.getIfcApplication_Version(), newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcApplication_Version());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcApplication_Version());
	}

} //IfcApplicationImpl
