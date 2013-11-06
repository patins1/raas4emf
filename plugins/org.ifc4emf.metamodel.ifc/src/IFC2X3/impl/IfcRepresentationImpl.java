/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcProductRepresentation;
import IFC2X3.IfcRepresentation;
import IFC2X3.IfcRepresentationContext;
import IFC2X3.IfcRepresentationItem;
import IFC2X3.IfcRepresentationMap;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
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
 * An implementation of the model object '<em><b>Ifc Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRepresentationImpl#getContextOfItems <em>Context Of Items</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRepresentationImpl#getRepresentationIdentifier <em>Representation Identifier</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRepresentationImpl#getRepresentationType <em>Representation Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRepresentationImpl#getItems <em>Items</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRepresentationImpl#getRepresentationMap <em>Representation Map</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRepresentationImpl#getOfProductRepresentation <em>Of Product Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRepresentation")
@XmlSeeAlso({ IfcShapeModelImpl.class, IfcTopologyRepresentationImpl.class, IfcShapeRepresentationImpl.class, IfcStyleModelImpl.class, IfcStyledRepresentationImpl.class })
@XmlRootElement(name = "IfcRepresentationElement")
public class IfcRepresentationImpl extends IfcLayeredItemImpl implements IfcRepresentation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRepresentation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlTransient
	public IfcRepresentationMap getRepresentationMap() {
		return (IfcRepresentationMap)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentation_RepresentationMap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationMap(IfcRepresentationMap newRepresentationMap) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRepresentation_RepresentationMap(), newRepresentationMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductRepresentation getOfProductRepresentation() {
		return (IfcProductRepresentation)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentation_OfProductRepresentation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfProductRepresentation(IfcProductRepresentation newOfProductRepresentation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRepresentation_OfProductRepresentation(), newOfProductRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRepresentationItem> getItems() {
		return (EList<IfcRepresentationItem>)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentation_Items(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlTransient
	public IfcRepresentationContext getContextOfItems() {
		return (IfcRepresentationContext)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentation_ContextOfItems(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextOfItems(IfcRepresentationContext newContextOfItems) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRepresentation_ContextOfItems(), newContextOfItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentationType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentation_RepresentationType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationType(String newRepresentationType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRepresentation_RepresentationType(), newRepresentationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepresentationType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRepresentation_RepresentationType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepresentationType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRepresentation_RepresentationType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentationIdentifier() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentation_RepresentationIdentifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationIdentifier(String newRepresentationIdentifier) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRepresentation_RepresentationIdentifier(), newRepresentationIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepresentationIdentifier() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRepresentation_RepresentationIdentifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepresentationIdentifier() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRepresentation_RepresentationIdentifier());
	}

} //IfcRepresentationImpl
