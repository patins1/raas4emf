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
import IFC2X3.IfcRelConnectsStructuralElement;
import IFC2X3.IfcRelConnectsStructuralMember;
import IFC2X3.IfcStructuralMember;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralMemberImpl#getReferencesElement <em>References Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralMemberImpl#getConnectedBy <em>Connected By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralMember")
@XmlSeeAlso({ IfcStructuralSurfaceMemberVaryingImpl.class, IfcStructuralCurveMemberImpl.class, IfcStructuralSurfaceMemberImpl.class, IfcStructuralCurveMemberVaryingImpl.class })
@XmlRootElement(name = "IfcStructuralMemberElement")
public class IfcStructuralMemberImpl extends IfcStructuralItemImpl implements IfcStructuralMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelConnectsStructuralElement> getReferencesElement() {
		return (EList<IfcRelConnectsStructuralElement>)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralMember_ReferencesElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelConnectsStructuralMember> getConnectedBy() {
		return (EList<IfcRelConnectsStructuralMember>)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralMember_ConnectedBy(), true);
	}

} //IfcStructuralMemberImpl
