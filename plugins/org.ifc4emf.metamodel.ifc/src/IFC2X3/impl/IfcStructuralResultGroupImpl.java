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
import IFC2X3.IfcAnalysisTheoryTypeEnum;
import IFC2X3.IfcStructuralAnalysisModel;
import IFC2X3.IfcStructuralLoadGroup;
import IFC2X3.IfcStructuralResultGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Result Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralResultGroupImpl#getTheoryType <em>Theory Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralResultGroupImpl#getResultForLoadGroup <em>Result For Load Group</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralResultGroupImpl#getIsLinear <em>Is Linear</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralResultGroupImpl#getResultGroupFor <em>Result Group For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralResultGroup")
@XmlRootElement(name = "IfcStructuralResultGroupElement")
public class IfcStructuralResultGroupImpl extends IfcGroupImpl implements IfcStructuralResultGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralResultGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralAnalysisModel getResultGroupFor() {
		return (IfcStructuralAnalysisModel)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup_ResultGroupFor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultGroupFor(IfcStructuralAnalysisModel newResultGroupFor) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup_ResultGroupFor(), newResultGroupFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadGroup getResultForLoadGroup() {
		return (IfcStructuralLoadGroup)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup_ResultForLoadGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultForLoadGroup(IfcStructuralLoadGroup newResultForLoadGroup) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup_ResultForLoadGroup(), newResultForLoadGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLinear() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup_IsLinear(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLinear(Boolean newIsLinear) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup_IsLinear(), newIsLinear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsLinear() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup_IsLinear());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsLinear() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup_IsLinear());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnalysisTheoryTypeEnum getTheoryType() {
		return (IfcAnalysisTheoryTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup_TheoryType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheoryType(IfcAnalysisTheoryTypeEnum newTheoryType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup_TheoryType(), newTheoryType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTheoryType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup_TheoryType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTheoryType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralResultGroup_TheoryType());
	}

} //IfcStructuralResultGroupImpl
