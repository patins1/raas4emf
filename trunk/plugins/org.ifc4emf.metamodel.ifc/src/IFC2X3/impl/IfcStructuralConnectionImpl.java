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
import IFC2X3.IfcBoundaryCondition;
import IFC2X3.IfcRelConnectsStructuralMember;
import IFC2X3.IfcStructuralConnection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralConnectionImpl#getAppliedCondition <em>Applied Condition</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralConnectionImpl#getConnectsStructuralMembers <em>Connects Structural Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralConnection")
@XmlSeeAlso({ IfcStructuralSurfaceConnectionImpl.class, IfcStructuralPointConnectionImpl.class, IfcStructuralCurveConnectionImpl.class })
@XmlRootElement(name = "IfcStructuralConnectionElement")
public class IfcStructuralConnectionImpl extends IfcStructuralItemImpl implements IfcStructuralConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelConnectsStructuralMember> getConnectsStructuralMembers() {
		return (EList<IfcRelConnectsStructuralMember>)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralConnection_ConnectsStructuralMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryCondition getAppliedCondition() {
		return (IfcBoundaryCondition)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralConnection_AppliedCondition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedCondition(IfcBoundaryCondition newAppliedCondition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralConnection_AppliedCondition(), newAppliedCondition);
	}

} //IfcStructuralConnectionImpl
