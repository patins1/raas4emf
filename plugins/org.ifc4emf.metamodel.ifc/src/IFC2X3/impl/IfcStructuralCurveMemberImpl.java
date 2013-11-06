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
import IFC2X3.IfcStructuralCurveMember;
import IFC2X3.IfcStructuralCurveTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Curve Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralCurveMemberImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralCurveMember")
@XmlSeeAlso({ IfcStructuralCurveMemberVaryingImpl.class })
@XmlRootElement(name = "IfcStructuralCurveMemberElement")
public class IfcStructuralCurveMemberImpl extends IfcStructuralMemberImpl implements IfcStructuralCurveMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralCurveMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralCurveMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralCurveTypeEnum getPredefinedType() {
		return (IfcStructuralCurveTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralCurveMember_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcStructuralCurveTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralCurveMember_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralCurveMember_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralCurveMember_PredefinedType());
	}

} //IfcStructuralCurveMemberImpl
