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
import IFC2X3.IfcActionSourceTypeEnum;
import IFC2X3.IfcActionTypeEnum;
import IFC2X3.IfcLoadGroupTypeEnum;
import IFC2X3.IfcStructuralAnalysisModel;
import IFC2X3.IfcStructuralLoadGroup;
import IFC2X3.IfcStructuralResultGroup;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadGroupImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadGroupImpl#getActionType <em>Action Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadGroupImpl#getActionSource <em>Action Source</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadGroupImpl#getCoefficient <em>Coefficient</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadGroupImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadGroupImpl#getSourceOfResultGroup <em>Source Of Result Group</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadGroupImpl#getLoadGroupFor <em>Load Group For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralLoadGroup")
@XmlRootElement(name = "IfcStructuralLoadGroupElement")
public class IfcStructuralLoadGroupImpl extends IfcGroupImpl implements IfcStructuralLoadGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralResultGroup getSourceOfResultGroup() {
		return (IfcStructuralResultGroup)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_SourceOfResultGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceOfResultGroup(IfcStructuralResultGroup newSourceOfResultGroup) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_SourceOfResultGroup(), newSourceOfResultGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcStructuralAnalysisModel> getLoadGroupFor() {
		return (EList<IfcStructuralAnalysisModel>)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_LoadGroupFor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_Purpose(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_Purpose(), newPurpose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPurpose() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_Purpose());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPurpose() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_Purpose());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCoefficient() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_Coefficient(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoefficient(Double newCoefficient) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_Coefficient(), newCoefficient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoefficient() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_Coefficient());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoefficient() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_Coefficient());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionSourceTypeEnum getActionSource() {
		return (IfcActionSourceTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_ActionSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionSource(IfcActionSourceTypeEnum newActionSource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_ActionSource(), newActionSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActionSource() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_ActionSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionSource() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_ActionSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionTypeEnum getActionType() {
		return (IfcActionTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_ActionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionType(IfcActionTypeEnum newActionType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_ActionType(), newActionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActionType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_ActionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_ActionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLoadGroupTypeEnum getPredefinedType() {
		return (IfcLoadGroupTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcLoadGroupTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadGroup_PredefinedType());
	}

} //IfcStructuralLoadGroupImpl
