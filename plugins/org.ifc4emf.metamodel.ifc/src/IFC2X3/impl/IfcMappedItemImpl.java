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
import IFC2X3.IfcCartesianTransformationOperator;
import IFC2X3.IfcMappedItem;
import IFC2X3.IfcRepresentationMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mapped Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMappedItemImpl#getMappingSource <em>Mapping Source</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMappedItemImpl#getMappingTarget <em>Mapping Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMappedItem")
@XmlRootElement(name = "IfcMappedItemElement")
public class IfcMappedItemImpl extends IfcRepresentationItemImpl implements IfcMappedItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMappedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMappedItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator getMappingTarget() {
		return (IfcCartesianTransformationOperator)eGet(IFC2X3Package.eINSTANCE.getIfcMappedItem_MappingTarget(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingTarget(IfcCartesianTransformationOperator newMappingTarget) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMappedItem_MappingTarget(), newMappingTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentationMap getMappingSource() {
		return (IfcRepresentationMap)eGet(IFC2X3Package.eINSTANCE.getIfcMappedItem_MappingSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingSource(IfcRepresentationMap newMappingSource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMappedItem_MappingSource(), newMappingSource);
	}

} //IfcMappedItemImpl
