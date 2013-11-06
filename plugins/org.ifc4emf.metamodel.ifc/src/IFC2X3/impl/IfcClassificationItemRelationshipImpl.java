/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcClassificationItem;
import IFC2X3.IfcClassificationItemRelationship;

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
 * An implementation of the model object '<em><b>Ifc Classification Item Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcClassificationItemRelationshipImpl#getRelatingItem <em>Relating Item</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcClassificationItemRelationshipImpl#getRelatedItems <em>Related Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcClassificationItemRelationship")
@XmlRootElement(name = "IfcClassificationItemRelationshipElement")
public class IfcClassificationItemRelationshipImpl extends CDOObjectImpl implements IfcClassificationItemRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationItemRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcClassificationItemRelationship();
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
	@SuppressWarnings("unchecked")
	public EList<IfcClassificationItem> getRelatedItems() {
		return (EList<IfcClassificationItem>)eGet(IFC2X3Package.eINSTANCE.getIfcClassificationItemRelationship_RelatedItems(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationItem getRelatingItem() {
		return (IfcClassificationItem)eGet(IFC2X3Package.eINSTANCE.getIfcClassificationItemRelationship_RelatingItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingItem(IfcClassificationItem newRelatingItem) {
		eSet(IFC2X3Package.eINSTANCE.getIfcClassificationItemRelationship_RelatingItem(), newRelatingItem);
	}

} //IfcClassificationItemRelationshipImpl
