/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcActorSelect;
import IFC2X3.IfcCalendarDate;
import IFC2X3.IfcDateAndTime;
import IFC2X3.IfcDocumentConfidentialityEnum;
import IFC2X3.IfcDocumentElectronicFormat;
import IFC2X3.IfcDocumentInformation;
import IFC2X3.IfcDocumentInformationRelationship;
import IFC2X3.IfcDocumentReference;
import IFC2X3.IfcDocumentStatusEnum;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Document Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getDocumentReferences <em>Document References</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getDocumentOwner <em>Document Owner</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getEditors <em>Editors</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getLastRevisionTime <em>Last Revision Time</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getElectronicFormat <em>Electronic Format</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getIsPointedTo <em>Is Pointed To</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationImpl#getIsPointer <em>Is Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDocumentInformation")
@XmlRootElement(name = "IfcDocumentInformationElement")
public class IfcDocumentInformationImpl extends IfcDocumentSelectImpl implements IfcDocumentInformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDocumentInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDocumentInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcDocumentInformationRelationship> getIsPointedTo() {
		return (EList<IfcDocumentInformationRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_IsPointedTo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentInformationRelationship getIsPointer() {
		return (IfcDocumentInformationRelationship)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_IsPointer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPointer(IfcDocumentInformationRelationship newIsPointer) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_IsPointer(), newIsPointer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getValidFrom() {
		return (IfcCalendarDate)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_ValidFrom(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFrom(IfcCalendarDate newValidFrom) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_ValidFrom(), newValidFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentElectronicFormat getElectronicFormat() {
		return (IfcDocumentElectronicFormat)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_ElectronicFormat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectronicFormat(IfcDocumentElectronicFormat newElectronicFormat) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_ElectronicFormat(), newElectronicFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcDocumentReference> getDocumentReferences() {
		return (EList<IfcDocumentReference>)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_DocumentReferences(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcActorSelect> getEditors() {
		return (EList<IfcActorSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Editors(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getValidUntil() {
		return (IfcCalendarDate)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_ValidUntil(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidUntil(IfcCalendarDate newValidUntil) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_ValidUntil(), newValidUntil);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime getCreationTime() {
		return (IfcDateAndTime)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_CreationTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(IfcDateAndTime newCreationTime) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_CreationTime(), newCreationTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getDocumentOwner() {
		return (IfcActorSelect)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_DocumentOwner(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentOwner(IfcActorSelect newDocumentOwner) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_DocumentOwner(), newDocumentOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime getLastRevisionTime() {
		return (IfcDateAndTime)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_LastRevisionTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRevisionTime(IfcDateAndTime newLastRevisionTime) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_LastRevisionTime(), newLastRevisionTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentStatusEnum getStatus() {
		return (IfcDocumentStatusEnum)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Status(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(IfcDocumentStatusEnum newStatus) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Status(), newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Status());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Status());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentConfidentialityEnum getConfidentiality() {
		return (IfcDocumentConfidentialityEnum)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Confidentiality(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(IfcDocumentConfidentialityEnum newConfidentiality) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Confidentiality(), newConfidentiality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfidentiality() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Confidentiality());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfidentiality() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Confidentiality());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevision() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Revision(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(String newRevision) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Revision(), newRevision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevision() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Revision());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevision() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Revision());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Scope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Scope(), newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScope() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Scope());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScope() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Scope());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntendedUse() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_IntendedUse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntendedUse(String newIntendedUse) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_IntendedUse(), newIntendedUse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntendedUse() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_IntendedUse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntendedUse() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_IntendedUse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Purpose(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Purpose(), newPurpose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPurpose() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Purpose());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPurpose() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Purpose());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentId() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_DocumentId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentId(String newDocumentId) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_DocumentId(), newDocumentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDocumentId() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_DocumentId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDocumentId() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformation_DocumentId());
	}

} //IfcDocumentInformationImpl
