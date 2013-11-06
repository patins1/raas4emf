/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcMechanicalMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMechanicalMaterialPropertiesImpl#getDynamicViscosity <em>Dynamic Viscosity</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalMaterialPropertiesImpl#getYoungModulus <em>Young Modulus</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalMaterialPropertiesImpl#getShearModulus <em>Shear Modulus</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalMaterialPropertiesImpl#getPoissonRatio <em>Poisson Ratio</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalMaterialPropertiesImpl#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMechanicalMaterialProperties")
@XmlSeeAlso({ IfcMechanicalSteelMaterialPropertiesImpl.class, IfcMechanicalConcreteMaterialPropertiesImpl.class })
@XmlRootElement(name = "IfcMechanicalMaterialPropertiesElement")
public class IfcMechanicalMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcMechanicalMaterialProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThermalExpansionCoefficient() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_ThermalExpansionCoefficient(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalExpansionCoefficient(Double newThermalExpansionCoefficient) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_ThermalExpansionCoefficient(), newThermalExpansionCoefficient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalExpansionCoefficient() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_ThermalExpansionCoefficient());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalExpansionCoefficient() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_ThermalExpansionCoefficient());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPoissonRatio() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_PoissonRatio(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoissonRatio(Double newPoissonRatio) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_PoissonRatio(), newPoissonRatio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPoissonRatio() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_PoissonRatio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPoissonRatio() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_PoissonRatio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearModulus() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_ShearModulus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearModulus(Double newShearModulus) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_ShearModulus(), newShearModulus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearModulus() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_ShearModulus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearModulus() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_ShearModulus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getYoungModulus() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_YoungModulus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYoungModulus(Double newYoungModulus) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_YoungModulus(), newYoungModulus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetYoungModulus() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_YoungModulus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetYoungModulus() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_YoungModulus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDynamicViscosity() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_DynamicViscosity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicViscosity(Double newDynamicViscosity) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_DynamicViscosity(), newDynamicViscosity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDynamicViscosity() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_DynamicViscosity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDynamicViscosity() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalMaterialProperties_DynamicViscosity());
	}

} //IfcMechanicalMaterialPropertiesImpl
