/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcMechanicalMaterialPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Mechanical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMechanicalMaterialProperties#getDynamicViscosity <em>Dynamic Viscosity</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalMaterialProperties#getYoungModulus <em>Young Modulus</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalMaterialProperties#getShearModulus <em>Shear Modulus</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalMaterialProperties#getPoissonRatio <em>Poisson Ratio</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalMaterialProperties#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMechanicalMaterialProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMechanicalMaterialPropertiesImplAdapter.class)
public interface IfcMechanicalMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Thermal Expansion Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Expansion Coefficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Expansion Coefficient</em>' attribute.
	 * @see #isSetThermalExpansionCoefficient()
	 * @see #unsetThermalExpansionCoefficient()
	 * @see #setThermalExpansionCoefficient(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalMaterialProperties_ThermalExpansionCoefficient()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getThermalExpansionCoefficient();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Expansion Coefficient</em>' attribute.
	 * @see #isSetThermalExpansionCoefficient()
	 * @see #unsetThermalExpansionCoefficient()
	 * @see #getThermalExpansionCoefficient()
	 * @generated
	 */
	void setThermalExpansionCoefficient(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalExpansionCoefficient()
	 * @see #getThermalExpansionCoefficient()
	 * @see #setThermalExpansionCoefficient(Double)
	 * @generated
	 */
	void unsetThermalExpansionCoefficient();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Expansion Coefficient</em>' attribute is set.
	 * @see #unsetThermalExpansionCoefficient()
	 * @see #getThermalExpansionCoefficient()
	 * @see #setThermalExpansionCoefficient(Double)
	 * @generated
	 */
	boolean isSetThermalExpansionCoefficient();

	/**
	 * Returns the value of the '<em><b>Poisson Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poisson Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poisson Ratio</em>' attribute.
	 * @see #isSetPoissonRatio()
	 * @see #unsetPoissonRatio()
	 * @see #setPoissonRatio(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalMaterialProperties_PoissonRatio()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPoissonRatio();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getPoissonRatio <em>Poisson Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poisson Ratio</em>' attribute.
	 * @see #isSetPoissonRatio()
	 * @see #unsetPoissonRatio()
	 * @see #getPoissonRatio()
	 * @generated
	 */
	void setPoissonRatio(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getPoissonRatio <em>Poisson Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPoissonRatio()
	 * @see #getPoissonRatio()
	 * @see #setPoissonRatio(Double)
	 * @generated
	 */
	void unsetPoissonRatio();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getPoissonRatio <em>Poisson Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Poisson Ratio</em>' attribute is set.
	 * @see #unsetPoissonRatio()
	 * @see #getPoissonRatio()
	 * @see #setPoissonRatio(Double)
	 * @generated
	 */
	boolean isSetPoissonRatio();

	/**
	 * Returns the value of the '<em><b>Shear Modulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Modulus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Modulus</em>' attribute.
	 * @see #isSetShearModulus()
	 * @see #unsetShearModulus()
	 * @see #setShearModulus(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalMaterialProperties_ShearModulus()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getShearModulus();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getShearModulus <em>Shear Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Modulus</em>' attribute.
	 * @see #isSetShearModulus()
	 * @see #unsetShearModulus()
	 * @see #getShearModulus()
	 * @generated
	 */
	void setShearModulus(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getShearModulus <em>Shear Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearModulus()
	 * @see #getShearModulus()
	 * @see #setShearModulus(Double)
	 * @generated
	 */
	void unsetShearModulus();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getShearModulus <em>Shear Modulus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Modulus</em>' attribute is set.
	 * @see #unsetShearModulus()
	 * @see #getShearModulus()
	 * @see #setShearModulus(Double)
	 * @generated
	 */
	boolean isSetShearModulus();

	/**
	 * Returns the value of the '<em><b>Young Modulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Young Modulus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Young Modulus</em>' attribute.
	 * @see #isSetYoungModulus()
	 * @see #unsetYoungModulus()
	 * @see #setYoungModulus(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalMaterialProperties_YoungModulus()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getYoungModulus();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getYoungModulus <em>Young Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Young Modulus</em>' attribute.
	 * @see #isSetYoungModulus()
	 * @see #unsetYoungModulus()
	 * @see #getYoungModulus()
	 * @generated
	 */
	void setYoungModulus(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getYoungModulus <em>Young Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYoungModulus()
	 * @see #getYoungModulus()
	 * @see #setYoungModulus(Double)
	 * @generated
	 */
	void unsetYoungModulus();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getYoungModulus <em>Young Modulus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Young Modulus</em>' attribute is set.
	 * @see #unsetYoungModulus()
	 * @see #getYoungModulus()
	 * @see #setYoungModulus(Double)
	 * @generated
	 */
	boolean isSetYoungModulus();

	/**
	 * Returns the value of the '<em><b>Dynamic Viscosity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Viscosity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Viscosity</em>' attribute.
	 * @see #isSetDynamicViscosity()
	 * @see #unsetDynamicViscosity()
	 * @see #setDynamicViscosity(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalMaterialProperties_DynamicViscosity()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getDynamicViscosity();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getDynamicViscosity <em>Dynamic Viscosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Viscosity</em>' attribute.
	 * @see #isSetDynamicViscosity()
	 * @see #unsetDynamicViscosity()
	 * @see #getDynamicViscosity()
	 * @generated
	 */
	void setDynamicViscosity(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getDynamicViscosity <em>Dynamic Viscosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDynamicViscosity()
	 * @see #getDynamicViscosity()
	 * @see #setDynamicViscosity(Double)
	 * @generated
	 */
	void unsetDynamicViscosity();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalMaterialProperties#getDynamicViscosity <em>Dynamic Viscosity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dynamic Viscosity</em>' attribute is set.
	 * @see #unsetDynamicViscosity()
	 * @see #getDynamicViscosity()
	 * @see #setDynamicViscosity(Double)
	 * @generated
	 */
	boolean isSetDynamicViscosity();

} // IfcMechanicalMaterialProperties
