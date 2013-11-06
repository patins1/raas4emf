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
import IFC2X3.IfcAxis2Placement3D;
import IFC2X3.IfcBoundaryCondition;
import IFC2X3.IfcRelConnectsStructuralMember;
import IFC2X3.IfcStructuralConnection;
import IFC2X3.IfcStructuralConnectionCondition;
import IFC2X3.IfcStructuralMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Structural Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsStructuralMemberImpl#getRelatingStructuralMember <em>Relating Structural Member</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsStructuralMemberImpl#getRelatedStructuralConnection <em>Related Structural Connection</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsStructuralMemberImpl#getAppliedCondition <em>Applied Condition</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsStructuralMemberImpl#getAdditionalConditions <em>Additional Conditions</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsStructuralMemberImpl#getSupportedLength <em>Supported Length</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsStructuralMemberImpl#getConditionCoordinateSystem <em>Condition Coordinate System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelConnectsStructuralMember")
@XmlSeeAlso({ IfcRelConnectsWithEccentricityImpl.class })
@XmlRootElement(name = "IfcRelConnectsStructuralMemberElement")
public class IfcRelConnectsStructuralMemberImpl extends IfcRelConnectsImpl implements IfcRelConnectsStructuralMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsStructuralMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralConnectionCondition getAdditionalConditions() {
		return (IfcStructuralConnectionCondition)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_AdditionalConditions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalConditions(IfcStructuralConnectionCondition newAdditionalConditions) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_AdditionalConditions(), newAdditionalConditions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getConditionCoordinateSystem() {
		return (IfcAxis2Placement3D)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_ConditionCoordinateSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionCoordinateSystem(IfcAxis2Placement3D newConditionCoordinateSystem) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_ConditionCoordinateSystem(), newConditionCoordinateSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralConnection getRelatedStructuralConnection() {
		return (IfcStructuralConnection)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_RelatedStructuralConnection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedStructuralConnection(IfcStructuralConnection newRelatedStructuralConnection) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_RelatedStructuralConnection(), newRelatedStructuralConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryCondition getAppliedCondition() {
		return (IfcBoundaryCondition)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_AppliedCondition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedCondition(IfcBoundaryCondition newAppliedCondition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_AppliedCondition(), newAppliedCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralMember getRelatingStructuralMember() {
		return (IfcStructuralMember)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_RelatingStructuralMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingStructuralMember(IfcStructuralMember newRelatingStructuralMember) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_RelatingStructuralMember(), newRelatingStructuralMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSupportedLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_SupportedLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedLength(Double newSupportedLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_SupportedLength(), newSupportedLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSupportedLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_SupportedLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSupportedLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralMember_SupportedLength());
	}

} //IfcRelConnectsStructuralMemberImpl
