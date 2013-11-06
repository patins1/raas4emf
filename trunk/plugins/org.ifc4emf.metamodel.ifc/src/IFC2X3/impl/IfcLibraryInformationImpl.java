/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcCalendarDate;
import IFC2X3.IfcLibraryInformation;
import IFC2X3.IfcLibraryReference;
import IFC2X3.IfcOrganization;

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
 * An implementation of the model object '<em><b>Ifc Library Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcLibraryInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLibraryInformationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLibraryInformationImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLibraryInformationImpl#getVersionDate <em>Version Date</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLibraryInformationImpl#getLibraryReference <em>Library Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcLibraryInformation")
@XmlRootElement(name = "IfcLibraryInformationElement")
public class IfcLibraryInformationImpl extends IfcLibrarySelectImpl implements IfcLibraryInformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLibraryInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcLibraryInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcLibraryReference> getLibraryReference() {
		return (EList<IfcLibraryReference>)eGet(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_LibraryReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization getPublisher() {
		return (IfcOrganization)eGet(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_Publisher(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(IfcOrganization newPublisher) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_Publisher(), newPublisher);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getVersionDate() {
		return (IfcCalendarDate)eGet(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_VersionDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionDate(IfcCalendarDate newVersionDate) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_VersionDate(), newVersionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_Version(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_Version(), newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_Version());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_Version());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLibraryInformation_Name());
	}

} //IfcLibraryInformationImpl
