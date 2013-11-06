/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcObjectDefinition;
import IFC2X3.IfcObjectTypeEnum;
import IFC2X3.IfcRelAssigns;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * An implementation of the model object '<em><b>Ifc Rel Assigns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelAssignsImpl#getRelatedObjects <em>Related Objects</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelAssignsImpl#getRelatedObjectsType <em>Related Objects Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelAssigns")
@XmlSeeAlso({ IfcRelOccupiesSpacesImpl.class, IfcRelSchedulesCostItemsImpl.class, IfcRelAssignsTasksImpl.class, IfcRelAssignsToControlImpl.class, IfcRelAssignsToProjectOrderImpl.class, IfcRelAssignsToResourceImpl.class, IfcRelAssignsToProductImpl.class,
		IfcRelAssignsToGroupImpl.class, IfcRelAssignsToProcessImpl.class, IfcRelAssignsToActorImpl.class })
@XmlRootElement(name = "IfcRelAssignsElement")
public class IfcRelAssignsImpl extends IfcRelationshipImpl implements IfcRelAssigns {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelAssigns();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcObjectDefinition> getRelatedObjects() {
		return (EList<IfcObjectDefinition>)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssigns_RelatedObjects(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectTypeEnum getRelatedObjectsType() {
		return (IfcObjectTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssigns_RelatedObjectsType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedObjectsType(IfcObjectTypeEnum newRelatedObjectsType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssigns_RelatedObjectsType(), newRelatedObjectsType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelatedObjectsType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelAssigns_RelatedObjectsType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedObjectsType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelAssigns_RelatedObjectsType());
	}

} //IfcRelAssignsImpl
