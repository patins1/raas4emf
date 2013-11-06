/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcDocumentInformation;
import IFC2X3.IfcDocumentInformationRelationship;

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
 * An implementation of the model object '<em><b>Ifc Document Information Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationRelationshipImpl#getRelatingDocument <em>Relating Document</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationRelationshipImpl#getRelatedDocuments <em>Related Documents</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentInformationRelationshipImpl#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDocumentInformationRelationship")
@XmlRootElement(name = "IfcDocumentInformationRelationshipElement")
public class IfcDocumentInformationRelationshipImpl extends CDOObjectImpl implements IfcDocumentInformationRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDocumentInformationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDocumentInformationRelationship();
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
	public IfcDocumentInformation getRelatingDocument() {
		return (IfcDocumentInformation)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformationRelationship_RelatingDocument(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingDocument(IfcDocumentInformation newRelatingDocument) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformationRelationship_RelatingDocument(), newRelatingDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcDocumentInformation> getRelatedDocuments() {
		return (EList<IfcDocumentInformation>)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformationRelationship_RelatedDocuments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationshipType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentInformationRelationship_RelationshipType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipType(String newRelationshipType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformationRelationship_RelationshipType(), newRelationshipType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelationshipType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentInformationRelationship_RelationshipType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationshipType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentInformationRelationship_RelationshipType());
	}

} //IfcDocumentInformationRelationshipImpl
