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
import IFC2X3.IfcActorSelect;
import IFC2X3.IfcSubContractResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Sub Contract Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSubContractResourceImpl#getSubContractor <em>Sub Contractor</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSubContractResourceImpl#getJobDescription <em>Job Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSubContractResource")
@XmlRootElement(name = "IfcSubContractResourceElement")
public class IfcSubContractResourceImpl extends IfcConstructionResourceImpl implements IfcSubContractResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSubContractResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSubContractResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getSubContractor() {
		return (IfcActorSelect)eGet(IFC2X3Package.eINSTANCE.getIfcSubContractResource_SubContractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubContractor(IfcActorSelect newSubContractor) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSubContractResource_SubContractor(), newSubContractor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcSubContractResource_JobDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobDescription(String newJobDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSubContractResource_JobDescription(), newJobDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetJobDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSubContractResource_JobDescription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetJobDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSubContractResource_JobDescription());
	}

} //IfcSubContractResourceImpl
