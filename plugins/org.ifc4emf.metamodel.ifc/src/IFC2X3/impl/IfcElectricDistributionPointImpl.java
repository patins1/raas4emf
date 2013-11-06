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
import IFC2X3.IfcElectricDistributionPoint;
import IFC2X3.IfcElectricDistributionPointFunctionEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Electric Distribution Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcElectricDistributionPointImpl#getDistributionPointFunction <em>Distribution Point Function</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcElectricDistributionPointImpl#getUserDefinedFunction <em>User Defined Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcElectricDistributionPoint")
@XmlRootElement(name = "IfcElectricDistributionPointElement")
public class IfcElectricDistributionPointImpl extends IfcFlowControllerImpl implements IfcElectricDistributionPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElectricDistributionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcElectricDistributionPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedFunction() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcElectricDistributionPoint_UserDefinedFunction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedFunction(String newUserDefinedFunction) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricDistributionPoint_UserDefinedFunction(), newUserDefinedFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedFunction() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricDistributionPoint_UserDefinedFunction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedFunction() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricDistributionPoint_UserDefinedFunction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricDistributionPointFunctionEnum getDistributionPointFunction() {
		return (IfcElectricDistributionPointFunctionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcElectricDistributionPoint_DistributionPointFunction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum newDistributionPointFunction) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElectricDistributionPoint_DistributionPointFunction(), newDistributionPointFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistributionPointFunction() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElectricDistributionPoint_DistributionPointFunction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistributionPointFunction() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElectricDistributionPoint_DistributionPointFunction());
	}

} //IfcElectricDistributionPointImpl
