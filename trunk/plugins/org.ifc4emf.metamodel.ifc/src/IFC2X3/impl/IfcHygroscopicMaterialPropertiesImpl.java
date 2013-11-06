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
import IFC2X3.IfcHygroscopicMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Hygroscopic Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcHygroscopicMaterialPropertiesImpl#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcHygroscopicMaterialPropertiesImpl#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcHygroscopicMaterialPropertiesImpl#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcHygroscopicMaterialPropertiesImpl#getVaporPermeability <em>Vapor Permeability</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcHygroscopicMaterialPropertiesImpl#getMoistureDiffusivity <em>Moisture Diffusivity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcHygroscopicMaterialProperties")
@XmlRootElement(name = "IfcHygroscopicMaterialPropertiesElement")
public class IfcHygroscopicMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcHygroscopicMaterialProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcHygroscopicMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMoistureDiffusivity() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoistureDiffusivity(Double newMoistureDiffusivity) {
		eSet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity(), newMoistureDiffusivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoistureDiffusivity() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoistureDiffusivity() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVaporPermeability() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaporPermeability(Double newVaporPermeability) {
		eSet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability(), newVaporPermeability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVaporPermeability() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVaporPermeability() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIsothermalMoistureCapacity() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsothermalMoistureCapacity(Double newIsothermalMoistureCapacity) {
		eSet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity(), newIsothermalMoistureCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsothermalMoistureCapacity() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsothermalMoistureCapacity() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLowerVaporResistanceFactor() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerVaporResistanceFactor(Double newLowerVaporResistanceFactor) {
		eSet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor(), newLowerVaporResistanceFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowerVaporResistanceFactor() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowerVaporResistanceFactor() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUpperVaporResistanceFactor() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperVaporResistanceFactor(Double newUpperVaporResistanceFactor) {
		eSet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor(), newUpperVaporResistanceFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpperVaporResistanceFactor() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpperVaporResistanceFactor() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor());
	}

} //IfcHygroscopicMaterialPropertiesImpl
