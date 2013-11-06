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
import IFC2X3.IfcProcess;
import IFC2X3.IfcRelAssignsToProcess;
import IFC2X3.IfcRelSequence;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcProcessImpl#getOperatesOn <em>Operates On</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProcessImpl#getIsSuccessorFrom <em>Is Successor From</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProcessImpl#getIsPredecessorTo <em>Is Predecessor To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcProcess")
@XmlSeeAlso({ IfcMoveImpl.class, IfcProcedureImpl.class, IfcOrderActionImpl.class, IfcTaskImpl.class })
@XmlRootElement(name = "IfcProcessElement")
public class IfcProcessImpl extends IfcObjectImpl implements IfcProcess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssignsToProcess> getOperatesOn() {
		return (EList<IfcRelAssignsToProcess>)eGet(IFC2X3Package.eINSTANCE.getIfcProcess_OperatesOn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelSequence> getIsSuccessorFrom() {
		return (EList<IfcRelSequence>)eGet(IFC2X3Package.eINSTANCE.getIfcProcess_IsSuccessorFrom(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelSequence> getIsPredecessorTo() {
		return (EList<IfcRelSequence>)eGet(IFC2X3Package.eINSTANCE.getIfcProcess_IsPredecessorTo(), true);
	}

} //IfcProcessImpl
