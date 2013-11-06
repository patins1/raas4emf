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
import IFC2X3.IfcThermalMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Thermal Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcThermalMaterialPropertiesImpl#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcThermalMaterialPropertiesImpl#getBoilingPoint <em>Boiling Point</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcThermalMaterialPropertiesImpl#getFreezingPoint <em>Freezing Point</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcThermalMaterialPropertiesImpl#getThermalConductivity <em>Thermal Conductivity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcThermalMaterialProperties")
@XmlRootElement(name = "IfcThermalMaterialPropertiesElement")
public class IfcThermalMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcThermalMaterialProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcThermalMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThermalConductivity() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalConductivity(Double newThermalConductivity) {
		eSet(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity(), newThermalConductivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalConductivity() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalConductivity() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFreezingPoint() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreezingPoint(Double newFreezingPoint) {
		eSet(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint(), newFreezingPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFreezingPoint() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFreezingPoint() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBoilingPoint() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoilingPoint(Double newBoilingPoint) {
		eSet(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint(), newBoilingPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoilingPoint() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoilingPoint() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSpecificHeatCapacity() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificHeatCapacity(Double newSpecificHeatCapacity) {
		eSet(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity(), newSpecificHeatCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecificHeatCapacity() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecificHeatCapacity() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity());
	}

} //IfcThermalMaterialPropertiesImpl
