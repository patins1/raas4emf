/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcActor;
import IFC2X3.IfcActorRole;
import IFC2X3.IfcRelAssignsToActor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelAssignsToActorImpl#getRelatingActor <em>Relating Actor</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelAssignsToActorImpl#getActingRole <em>Acting Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelAssignsToActor")
@XmlSeeAlso({ IfcRelOccupiesSpacesImpl.class })
@XmlRootElement(name = "IfcRelAssignsToActorElement")
public class IfcRelAssignsToActorImpl extends IfcRelAssignsImpl implements IfcRelAssignsToActor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsToActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelAssignsToActor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActor getRelatingActor() {
		return (IfcActor)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssignsToActor_RelatingActor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingActor(IfcActor newRelatingActor) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssignsToActor_RelatingActor(), newRelatingActor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorRole getActingRole() {
		return (IfcActorRole)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssignsToActor_ActingRole(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActingRole(IfcActorRole newActingRole) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssignsToActor_ActingRole(), newActingRole);
	}

} //IfcRelAssignsToActorImpl
