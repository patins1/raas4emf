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
import IFC2X3.IfcProcedure;
import IFC2X3.IfcProcedureTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcProcedureImpl#getProcedureID <em>Procedure ID</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProcedureImpl#getProcedureType <em>Procedure Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProcedureImpl#getUserDefinedProcedureType <em>User Defined Procedure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcProcedure")
@XmlRootElement(name = "IfcProcedureElement")
public class IfcProcedureImpl extends IfcProcessImpl implements IfcProcedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedProcedureType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcProcedure_UserDefinedProcedureType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedProcedureType(String newUserDefinedProcedureType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProcedure_UserDefinedProcedureType(), newUserDefinedProcedureType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedProcedureType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProcedure_UserDefinedProcedureType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedProcedureType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProcedure_UserDefinedProcedureType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcedureTypeEnum getProcedureType() {
		return (IfcProcedureTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcProcedure_ProcedureType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureType(IfcProcedureTypeEnum newProcedureType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProcedure_ProcedureType(), newProcedureType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcedureType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProcedure_ProcedureType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcedureType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProcedure_ProcedureType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcedureID() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcProcedure_ProcedureID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureID(String newProcedureID) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProcedure_ProcedureID(), newProcedureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcedureID() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProcedure_ProcedureID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcedureID() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProcedure_ProcedureID());
	}

} //IfcProcedureImpl
