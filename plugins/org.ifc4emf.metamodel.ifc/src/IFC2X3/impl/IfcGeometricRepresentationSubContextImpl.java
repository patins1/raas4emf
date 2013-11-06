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
import IFC2X3.IfcGeometricProjectionEnum;
import IFC2X3.IfcGeometricRepresentationContext;
import IFC2X3.IfcGeometricRepresentationSubContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Geometric Representation Sub Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcGeometricRepresentationSubContextImpl#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeometricRepresentationSubContextImpl#getTargetScale <em>Target Scale</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeometricRepresentationSubContextImpl#getTargetView <em>Target View</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeometricRepresentationSubContextImpl#getUserDefinedTargetView <em>User Defined Target View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcGeometricRepresentationSubContext")
@XmlRootElement(name = "IfcGeometricRepresentationSubContextElement")
public class IfcGeometricRepresentationSubContextImpl extends IfcGeometricRepresentationContextImpl implements IfcGeometricRepresentationSubContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeometricRepresentationSubContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationContext getParentContext() {
		return (IfcGeometricRepresentationContext)eGet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_ParentContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentContext(IfcGeometricRepresentationContext newParentContext) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_ParentContext(), newParentContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedTargetView() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_UserDefinedTargetView(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedTargetView(String newUserDefinedTargetView) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_UserDefinedTargetView(), newUserDefinedTargetView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedTargetView() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_UserDefinedTargetView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedTargetView() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_UserDefinedTargetView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricProjectionEnum getTargetView() {
		return (IfcGeometricProjectionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetView(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetView(IfcGeometricProjectionEnum newTargetView) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetView(), newTargetView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetView() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetView() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTargetScale() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetScale(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetScale(Double newTargetScale) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetScale(), newTargetScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetScale() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetScale());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetScale() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetScale());
	}

} //IfcGeometricRepresentationSubContextImpl
