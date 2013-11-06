/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcMechanicalSteelMaterialProperties;
import IFC2X3.IfcRelaxation;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Steel Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMechanicalSteelMaterialPropertiesImpl#getYieldStress <em>Yield Stress</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalSteelMaterialPropertiesImpl#getUltimateStress <em>Ultimate Stress</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalSteelMaterialPropertiesImpl#getUltimateStrain <em>Ultimate Strain</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalSteelMaterialPropertiesImpl#getHardeningModule <em>Hardening Module</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalSteelMaterialPropertiesImpl#getProportionalStress <em>Proportional Stress</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalSteelMaterialPropertiesImpl#getPlasticStrain <em>Plastic Strain</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalSteelMaterialPropertiesImpl#getRelaxations <em>Relaxations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMechanicalSteelMaterialProperties")
@XmlRootElement(name = "IfcMechanicalSteelMaterialPropertiesElement")
public class IfcMechanicalSteelMaterialPropertiesImpl extends IfcMechanicalMaterialPropertiesImpl implements IfcMechanicalSteelMaterialProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalSteelMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelaxation> getRelaxations() {
		return (EList<IfcRelaxation>)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_Relaxations(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPlasticStrain() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_PlasticStrain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlasticStrain(Double newPlasticStrain) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_PlasticStrain(), newPlasticStrain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlasticStrain() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_PlasticStrain());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlasticStrain() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_PlasticStrain());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getProportionalStress() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_ProportionalStress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProportionalStress(Double newProportionalStress) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_ProportionalStress(), newProportionalStress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProportionalStress() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_ProportionalStress());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProportionalStress() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_ProportionalStress());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHardeningModule() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_HardeningModule(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardeningModule(Double newHardeningModule) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_HardeningModule(), newHardeningModule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHardeningModule() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_HardeningModule());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHardeningModule() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_HardeningModule());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUltimateStrain() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_UltimateStrain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUltimateStrain(Double newUltimateStrain) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_UltimateStrain(), newUltimateStrain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUltimateStrain() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_UltimateStrain());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUltimateStrain() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_UltimateStrain());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUltimateStress() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_UltimateStress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUltimateStress(Double newUltimateStress) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_UltimateStress(), newUltimateStress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUltimateStress() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_UltimateStress());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUltimateStress() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_UltimateStress());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getYieldStress() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_YieldStress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYieldStress(Double newYieldStress) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_YieldStress(), newYieldStress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetYieldStress() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_YieldStress());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetYieldStress() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_YieldStress());
	}

} //IfcMechanicalSteelMaterialPropertiesImpl
