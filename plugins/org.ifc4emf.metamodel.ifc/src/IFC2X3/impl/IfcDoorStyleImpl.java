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
import IFC2X3.IfcDoorStyle;
import IFC2X3.IfcDoorStyleConstructionEnum;
import IFC2X3.IfcDoorStyleOperationEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDoorStyleImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorStyleImpl#getConstructionType <em>Construction Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorStyleImpl#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDoorStyleImpl#getSizeable <em>Sizeable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDoorStyle")
@XmlRootElement(name = "IfcDoorStyleElement")
public class IfcDoorStyleImpl extends IfcTypeProductImpl implements IfcDoorStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDoorStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDoorStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSizeable() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcDoorStyle_Sizeable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeable(Boolean newSizeable) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorStyle_Sizeable(), newSizeable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSizeable() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorStyle_Sizeable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSizeable() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorStyle_Sizeable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getParameterTakesPrecedence() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcDoorStyle_ParameterTakesPrecedence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterTakesPrecedence(Boolean newParameterTakesPrecedence) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorStyle_ParameterTakesPrecedence(), newParameterTakesPrecedence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParameterTakesPrecedence() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorStyle_ParameterTakesPrecedence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameterTakesPrecedence() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorStyle_ParameterTakesPrecedence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleConstructionEnum getConstructionType() {
		return (IfcDoorStyleConstructionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcDoorStyle_ConstructionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructionType(IfcDoorStyleConstructionEnum newConstructionType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorStyle_ConstructionType(), newConstructionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstructionType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorStyle_ConstructionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstructionType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorStyle_ConstructionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleOperationEnum getOperationType() {
		return (IfcDoorStyleOperationEnum)eGet(IFC2X3Package.eINSTANCE.getIfcDoorStyle_OperationType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcDoorStyleOperationEnum newOperationType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDoorStyle_OperationType(), newOperationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperationType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDoorStyle_OperationType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperationType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDoorStyle_OperationType());
	}

} //IfcDoorStyleImpl
