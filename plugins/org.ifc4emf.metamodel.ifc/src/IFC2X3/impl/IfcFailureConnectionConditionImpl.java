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
import IFC2X3.IfcFailureConnectionCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Failure Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcFailureConnectionConditionImpl#getTensionFailureX <em>Tension Failure X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFailureConnectionConditionImpl#getTensionFailureY <em>Tension Failure Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFailureConnectionConditionImpl#getTensionFailureZ <em>Tension Failure Z</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFailureConnectionConditionImpl#getCompressionFailureX <em>Compression Failure X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFailureConnectionConditionImpl#getCompressionFailureY <em>Compression Failure Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFailureConnectionConditionImpl#getCompressionFailureZ <em>Compression Failure Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFailureConnectionCondition")
@XmlRootElement(name = "IfcFailureConnectionConditionElement")
public class IfcFailureConnectionConditionImpl extends IfcStructuralConnectionConditionImpl implements IfcFailureConnectionCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFailureConnectionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCompressionFailureZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureZ(Double newCompressionFailureZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureZ(), newCompressionFailureZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressionFailureZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressionFailureZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCompressionFailureY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureY(Double newCompressionFailureY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureY(), newCompressionFailureY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressionFailureY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressionFailureY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCompressionFailureX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureX(Double newCompressionFailureX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureX(), newCompressionFailureX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressionFailureX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressionFailureX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTensionFailureZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureZ(Double newTensionFailureZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureZ(), newTensionFailureZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionFailureZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionFailureZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTensionFailureY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureY(Double newTensionFailureY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureY(), newTensionFailureY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionFailureY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionFailureY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTensionFailureX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureX(Double newTensionFailureX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureX(), newTensionFailureX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionFailureX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionFailureX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureX());
	}

} //IfcFailureConnectionConditionImpl
