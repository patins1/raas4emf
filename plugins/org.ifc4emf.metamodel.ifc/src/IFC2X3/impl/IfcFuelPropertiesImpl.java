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
import IFC2X3.IfcFuelProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fuel Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcFuelPropertiesImpl#getCombustionTemperature <em>Combustion Temperature</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFuelPropertiesImpl#getCarbonContent <em>Carbon Content</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFuelPropertiesImpl#getLowerHeatingValue <em>Lower Heating Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFuelPropertiesImpl#getHigherHeatingValue <em>Higher Heating Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFuelProperties")
@XmlRootElement(name = "IfcFuelPropertiesElement")
public class IfcFuelPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcFuelProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFuelPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFuelProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHigherHeatingValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFuelProperties_HigherHeatingValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigherHeatingValue(Double newHigherHeatingValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFuelProperties_HigherHeatingValue(), newHigherHeatingValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHigherHeatingValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFuelProperties_HigherHeatingValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHigherHeatingValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFuelProperties_HigherHeatingValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLowerHeatingValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFuelProperties_LowerHeatingValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerHeatingValue(Double newLowerHeatingValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFuelProperties_LowerHeatingValue(), newLowerHeatingValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowerHeatingValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFuelProperties_LowerHeatingValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowerHeatingValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFuelProperties_LowerHeatingValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCarbonContent() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFuelProperties_CarbonContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarbonContent(Double newCarbonContent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFuelProperties_CarbonContent(), newCarbonContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCarbonContent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFuelProperties_CarbonContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCarbonContent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFuelProperties_CarbonContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCombustionTemperature() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFuelProperties_CombustionTemperature(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombustionTemperature(Double newCombustionTemperature) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFuelProperties_CombustionTemperature(), newCombustionTemperature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCombustionTemperature() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFuelProperties_CombustionTemperature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCombustionTemperature() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFuelProperties_CombustionTemperature());
	}

} //IfcFuelPropertiesImpl
