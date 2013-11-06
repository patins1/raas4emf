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
import IFC2X3.IfcSlippageConnectionCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Slippage Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSlippageConnectionConditionImpl#getSlippageX <em>Slippage X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSlippageConnectionConditionImpl#getSlippageY <em>Slippage Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSlippageConnectionConditionImpl#getSlippageZ <em>Slippage Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSlippageConnectionCondition")
@XmlRootElement(name = "IfcSlippageConnectionConditionElement")
public class IfcSlippageConnectionConditionImpl extends IfcStructuralConnectionConditionImpl implements IfcSlippageConnectionCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSlippageConnectionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSlippageZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageZ(Double newSlippageZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageZ(), newSlippageZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSlippageY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageY(Double newSlippageY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageY(), newSlippageY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSlippageX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageX(Double newSlippageX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageX(), newSlippageX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageX());
	}

} //IfcSlippageConnectionConditionImpl
