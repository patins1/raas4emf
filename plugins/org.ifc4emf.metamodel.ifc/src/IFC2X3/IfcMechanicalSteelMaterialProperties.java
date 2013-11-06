/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcMechanicalSteelMaterialPropertiesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Mechanical Steel Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getYieldStress <em>Yield Stress</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getUltimateStress <em>Ultimate Stress</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getUltimateStrain <em>Ultimate Strain</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getHardeningModule <em>Hardening Module</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getProportionalStress <em>Proportional Stress</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getPlasticStrain <em>Plastic Strain</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getRelaxations <em>Relaxations</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMechanicalSteelMaterialProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMechanicalSteelMaterialPropertiesImplAdapter.class)
public interface IfcMechanicalSteelMaterialProperties extends IfcMechanicalMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Relaxations</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelaxation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaxations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaxations</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalSteelMaterialProperties_Relaxations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IfcRelaxation> getRelaxations();

	/**
	 * Returns the value of the '<em><b>Plastic Strain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plastic Strain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plastic Strain</em>' attribute.
	 * @see #isSetPlasticStrain()
	 * @see #unsetPlasticStrain()
	 * @see #setPlasticStrain(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalSteelMaterialProperties_PlasticStrain()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPlasticStrain();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getPlasticStrain <em>Plastic Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plastic Strain</em>' attribute.
	 * @see #isSetPlasticStrain()
	 * @see #unsetPlasticStrain()
	 * @see #getPlasticStrain()
	 * @generated
	 */
	void setPlasticStrain(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getPlasticStrain <em>Plastic Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlasticStrain()
	 * @see #getPlasticStrain()
	 * @see #setPlasticStrain(Double)
	 * @generated
	 */
	void unsetPlasticStrain();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getPlasticStrain <em>Plastic Strain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Plastic Strain</em>' attribute is set.
	 * @see #unsetPlasticStrain()
	 * @see #getPlasticStrain()
	 * @see #setPlasticStrain(Double)
	 * @generated
	 */
	boolean isSetPlasticStrain();

	/**
	 * Returns the value of the '<em><b>Proportional Stress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proportional Stress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proportional Stress</em>' attribute.
	 * @see #isSetProportionalStress()
	 * @see #unsetProportionalStress()
	 * @see #setProportionalStress(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalSteelMaterialProperties_ProportionalStress()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getProportionalStress();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getProportionalStress <em>Proportional Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proportional Stress</em>' attribute.
	 * @see #isSetProportionalStress()
	 * @see #unsetProportionalStress()
	 * @see #getProportionalStress()
	 * @generated
	 */
	void setProportionalStress(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getProportionalStress <em>Proportional Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProportionalStress()
	 * @see #getProportionalStress()
	 * @see #setProportionalStress(Double)
	 * @generated
	 */
	void unsetProportionalStress();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getProportionalStress <em>Proportional Stress</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Proportional Stress</em>' attribute is set.
	 * @see #unsetProportionalStress()
	 * @see #getProportionalStress()
	 * @see #setProportionalStress(Double)
	 * @generated
	 */
	boolean isSetProportionalStress();

	/**
	 * Returns the value of the '<em><b>Hardening Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardening Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardening Module</em>' attribute.
	 * @see #isSetHardeningModule()
	 * @see #unsetHardeningModule()
	 * @see #setHardeningModule(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalSteelMaterialProperties_HardeningModule()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getHardeningModule();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getHardeningModule <em>Hardening Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardening Module</em>' attribute.
	 * @see #isSetHardeningModule()
	 * @see #unsetHardeningModule()
	 * @see #getHardeningModule()
	 * @generated
	 */
	void setHardeningModule(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getHardeningModule <em>Hardening Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHardeningModule()
	 * @see #getHardeningModule()
	 * @see #setHardeningModule(Double)
	 * @generated
	 */
	void unsetHardeningModule();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getHardeningModule <em>Hardening Module</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hardening Module</em>' attribute is set.
	 * @see #unsetHardeningModule()
	 * @see #getHardeningModule()
	 * @see #setHardeningModule(Double)
	 * @generated
	 */
	boolean isSetHardeningModule();

	/**
	 * Returns the value of the '<em><b>Ultimate Strain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ultimate Strain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ultimate Strain</em>' attribute.
	 * @see #isSetUltimateStrain()
	 * @see #unsetUltimateStrain()
	 * @see #setUltimateStrain(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalSteelMaterialProperties_UltimateStrain()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getUltimateStrain();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getUltimateStrain <em>Ultimate Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultimate Strain</em>' attribute.
	 * @see #isSetUltimateStrain()
	 * @see #unsetUltimateStrain()
	 * @see #getUltimateStrain()
	 * @generated
	 */
	void setUltimateStrain(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getUltimateStrain <em>Ultimate Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUltimateStrain()
	 * @see #getUltimateStrain()
	 * @see #setUltimateStrain(Double)
	 * @generated
	 */
	void unsetUltimateStrain();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getUltimateStrain <em>Ultimate Strain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ultimate Strain</em>' attribute is set.
	 * @see #unsetUltimateStrain()
	 * @see #getUltimateStrain()
	 * @see #setUltimateStrain(Double)
	 * @generated
	 */
	boolean isSetUltimateStrain();

	/**
	 * Returns the value of the '<em><b>Ultimate Stress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ultimate Stress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ultimate Stress</em>' attribute.
	 * @see #isSetUltimateStress()
	 * @see #unsetUltimateStress()
	 * @see #setUltimateStress(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalSteelMaterialProperties_UltimateStress()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getUltimateStress();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getUltimateStress <em>Ultimate Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultimate Stress</em>' attribute.
	 * @see #isSetUltimateStress()
	 * @see #unsetUltimateStress()
	 * @see #getUltimateStress()
	 * @generated
	 */
	void setUltimateStress(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getUltimateStress <em>Ultimate Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUltimateStress()
	 * @see #getUltimateStress()
	 * @see #setUltimateStress(Double)
	 * @generated
	 */
	void unsetUltimateStress();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getUltimateStress <em>Ultimate Stress</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ultimate Stress</em>' attribute is set.
	 * @see #unsetUltimateStress()
	 * @see #getUltimateStress()
	 * @see #setUltimateStress(Double)
	 * @generated
	 */
	boolean isSetUltimateStress();

	/**
	 * Returns the value of the '<em><b>Yield Stress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yield Stress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yield Stress</em>' attribute.
	 * @see #isSetYieldStress()
	 * @see #unsetYieldStress()
	 * @see #setYieldStress(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalSteelMaterialProperties_YieldStress()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getYieldStress();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getYieldStress <em>Yield Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yield Stress</em>' attribute.
	 * @see #isSetYieldStress()
	 * @see #unsetYieldStress()
	 * @see #getYieldStress()
	 * @generated
	 */
	void setYieldStress(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getYieldStress <em>Yield Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYieldStress()
	 * @see #getYieldStress()
	 * @see #setYieldStress(Double)
	 * @generated
	 */
	void unsetYieldStress();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalSteelMaterialProperties#getYieldStress <em>Yield Stress</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Yield Stress</em>' attribute is set.
	 * @see #unsetYieldStress()
	 * @see #getYieldStress()
	 * @see #setYieldStress(Double)
	 * @generated
	 */
	boolean isSetYieldStress();

} // IfcMechanicalSteelMaterialProperties
