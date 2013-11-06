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
import IFC2X3.IfcStructuralLoadTemperature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Temperature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadTemperatureImpl#getDeltaT_Constant <em>Delta TConstant</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadTemperatureImpl#getDeltaT_Y <em>Delta TY</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadTemperatureImpl#getDeltaT_Z <em>Delta TZ</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralLoadTemperature")
@XmlRootElement(name = "IfcStructuralLoadTemperatureElement")
public class IfcStructuralLoadTemperatureImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadTemperature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadTemperatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDeltaT_Z() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Z(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaT_Z(Double newDeltaT_Z) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Z(), newDeltaT_Z);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeltaT_Z() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Z());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeltaT_Z() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Z());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDeltaT_Y() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Y(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaT_Y(Double newDeltaT_Y) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Y(), newDeltaT_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeltaT_Y() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Y());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeltaT_Y() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Y());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDeltaT_Constant() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Constant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaT_Constant(Double newDeltaT_Constant) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Constant(), newDeltaT_Constant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeltaT_Constant() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Constant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeltaT_Constant() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Constant());
	}

} //IfcStructuralLoadTemperatureImpl
