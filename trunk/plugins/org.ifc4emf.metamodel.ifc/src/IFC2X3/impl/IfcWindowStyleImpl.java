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
import IFC2X3.IfcWindowStyle;
import IFC2X3.IfcWindowStyleConstructionEnum;
import IFC2X3.IfcWindowStyleOperationEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Window Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcWindowStyleImpl#getConstructionType <em>Construction Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowStyleImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowStyleImpl#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowStyleImpl#getSizeable <em>Sizeable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcWindowStyle")
@XmlRootElement(name = "IfcWindowStyleElement")
public class IfcWindowStyleImpl extends IfcTypeProductImpl implements IfcWindowStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcWindowStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcWindowStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSizeable() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcWindowStyle_Sizeable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeable(Boolean newSizeable) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowStyle_Sizeable(), newSizeable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSizeable() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowStyle_Sizeable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSizeable() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowStyle_Sizeable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getParameterTakesPrecedence() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcWindowStyle_ParameterTakesPrecedence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterTakesPrecedence(Boolean newParameterTakesPrecedence) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowStyle_ParameterTakesPrecedence(), newParameterTakesPrecedence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParameterTakesPrecedence() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowStyle_ParameterTakesPrecedence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameterTakesPrecedence() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowStyle_ParameterTakesPrecedence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowStyleOperationEnum getOperationType() {
		return (IfcWindowStyleOperationEnum)eGet(IFC2X3Package.eINSTANCE.getIfcWindowStyle_OperationType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcWindowStyleOperationEnum newOperationType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowStyle_OperationType(), newOperationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperationType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowStyle_OperationType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperationType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowStyle_OperationType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowStyleConstructionEnum getConstructionType() {
		return (IfcWindowStyleConstructionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcWindowStyle_ConstructionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructionType(IfcWindowStyleConstructionEnum newConstructionType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowStyle_ConstructionType(), newConstructionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstructionType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowStyle_ConstructionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstructionType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowStyle_ConstructionType());
	}

} //IfcWindowStyleImpl
