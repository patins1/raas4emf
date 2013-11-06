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
import IFC2X3.IfcOpticalMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Optical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcOpticalMaterialPropertiesImpl#getVisibleTransmittance <em>Visible Transmittance</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOpticalMaterialPropertiesImpl#getSolarTransmittance <em>Solar Transmittance</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceFront <em>Solar Reflectance Front</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceBack <em>Solar Reflectance Back</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcOpticalMaterialProperties")
@XmlRootElement(name = "IfcOpticalMaterialPropertiesElement")
public class IfcOpticalMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcOpticalMaterialProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOpticalMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSolarReflectanceBack() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBack(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarReflectanceBack(Double newSolarReflectanceBack) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBack(), newSolarReflectanceBack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarReflectanceBack() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBack());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarReflectanceBack() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBack());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSolarReflectanceFront() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFront(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarReflectanceFront(Double newSolarReflectanceFront) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFront(), newSolarReflectanceFront);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarReflectanceFront() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFront());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarReflectanceFront() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFront());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVisibleReflectanceFront() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFront(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleReflectanceFront(Double newVisibleReflectanceFront) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFront(), newVisibleReflectanceFront);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleReflectanceFront() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFront());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleReflectanceFront() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFront());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVisibleReflectanceBack() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBack(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleReflectanceBack(Double newVisibleReflectanceBack) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBack(), newVisibleReflectanceBack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleReflectanceBack() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBack());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleReflectanceBack() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBack());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThermalIrEmissivityFront() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFront(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrEmissivityFront(Double newThermalIrEmissivityFront) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFront(), newThermalIrEmissivityFront);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrEmissivityFront() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFront());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrEmissivityFront() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFront());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThermalIrEmissivityBack() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBack(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrEmissivityBack(Double newThermalIrEmissivityBack) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBack(), newThermalIrEmissivityBack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrEmissivityBack() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBack());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrEmissivityBack() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBack());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThermalIrTransmittance() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrTransmittance(Double newThermalIrTransmittance) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittance(), newThermalIrTransmittance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrTransmittance() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrTransmittance() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSolarTransmittance() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarTransmittance(Double newSolarTransmittance) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittance(), newSolarTransmittance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarTransmittance() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarTransmittance() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVisibleTransmittance() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleTransmittance(Double newVisibleTransmittance) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittance(), newVisibleTransmittance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleTransmittance() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleTransmittance() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittance());
	}

} //IfcOpticalMaterialPropertiesImpl
