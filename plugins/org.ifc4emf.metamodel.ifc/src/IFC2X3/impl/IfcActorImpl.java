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
import IFC2X3.IfcActorSelect;
import IFC2X3.IfcRelAssignsToActor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcActorImpl#getTheActor <em>The Actor</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcActorImpl#getIsActingUpon <em>Is Acting Upon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcActor")
@XmlSeeAlso({ IfcOccupantImpl.class })
@XmlRootElement(name = "IfcActorElement")
public class IfcActorImpl extends IfcObjectImpl implements IfcActor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcActor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssignsToActor> getIsActingUpon() {
		return (EList<IfcRelAssignsToActor>)eGet(IFC2X3Package.eINSTANCE.getIfcActor_IsActingUpon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getTheActor() {
		return (IfcActorSelect)eGet(IFC2X3Package.eINSTANCE.getIfcActor_TheActor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheActor(IfcActorSelect newTheActor) {
		eSet(IFC2X3Package.eINSTANCE.getIfcActor_TheActor(), newTheActor);
	}

} //IfcActorImpl
