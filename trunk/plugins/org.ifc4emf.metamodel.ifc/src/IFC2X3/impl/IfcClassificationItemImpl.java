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
import IFC2X3.IfcClassification;
import IFC2X3.IfcClassificationItem;
import IFC2X3.IfcClassificationItemRelationship;
import IFC2X3.IfcClassificationNotationFacet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcClassificationItemImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcClassificationItemImpl#getItemOf <em>Item Of</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcClassificationItemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcClassificationItemImpl#getIsClassifiedItemIn <em>Is Classified Item In</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcClassificationItemImpl#getIsClassifyingItemIn <em>Is Classifying Item In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcClassificationItem")
@XmlRootElement(name = "IfcClassificationItemElement")
public class IfcClassificationItemImpl extends CDOObjectImpl implements IfcClassificationItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcClassificationItem();
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
	public IfcClassificationItemRelationship getIsClassifiedItemIn() {
		return (IfcClassificationItemRelationship)eGet(IFC2X3Package.eINSTANCE.getIfcClassificationItem_IsClassifiedItemIn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsClassifiedItemIn(IfcClassificationItemRelationship newIsClassifiedItemIn) {
		eSet(IFC2X3Package.eINSTANCE.getIfcClassificationItem_IsClassifiedItemIn(), newIsClassifiedItemIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationItemRelationship getIsClassifyingItemIn() {
		return (IfcClassificationItemRelationship)eGet(IFC2X3Package.eINSTANCE.getIfcClassificationItem_IsClassifyingItemIn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsClassifyingItemIn(IfcClassificationItemRelationship newIsClassifyingItemIn) {
		eSet(IFC2X3Package.eINSTANCE.getIfcClassificationItem_IsClassifyingItemIn(), newIsClassifyingItemIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassification getItemOf() {
		return (IfcClassification)eGet(IFC2X3Package.eINSTANCE.getIfcClassificationItem_ItemOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemOf(IfcClassification newItemOf) {
		eSet(IFC2X3Package.eINSTANCE.getIfcClassificationItem_ItemOf(), newItemOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationNotationFacet getNotation() {
		return (IfcClassificationNotationFacet)eGet(IFC2X3Package.eINSTANCE.getIfcClassificationItem_Notation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotation(IfcClassificationNotationFacet newNotation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcClassificationItem_Notation(), newNotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcClassificationItem_Title(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcClassificationItem_Title(), newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTitle() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcClassificationItem_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTitle() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcClassificationItem_Title());
	}

} //IfcClassificationItemImpl
