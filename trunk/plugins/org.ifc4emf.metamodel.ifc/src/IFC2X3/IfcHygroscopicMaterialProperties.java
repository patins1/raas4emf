/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcHygroscopicMaterialPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Hygroscopic Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}</li>
 *   <li>{@link IFC2X3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}</li>
 *   <li>{@link IFC2X3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}</li>
 *   <li>{@link IFC2X3.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}</li>
 *   <li>{@link IFC2X3.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcHygroscopicMaterialProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcHygroscopicMaterialPropertiesImplAdapter.class)
public interface IfcHygroscopicMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Moisture Diffusivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moisture Diffusivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moisture Diffusivity</em>' attribute.
	 * @see #isSetMoistureDiffusivity()
	 * @see #unsetMoistureDiffusivity()
	 * @see #setMoistureDiffusivity(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcHygroscopicMaterialProperties_MoistureDiffusivity()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMoistureDiffusivity();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moisture Diffusivity</em>' attribute.
	 * @see #isSetMoistureDiffusivity()
	 * @see #unsetMoistureDiffusivity()
	 * @see #getMoistureDiffusivity()
	 * @generated
	 */
	void setMoistureDiffusivity(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoistureDiffusivity()
	 * @see #getMoistureDiffusivity()
	 * @see #setMoistureDiffusivity(Double)
	 * @generated
	 */
	void unsetMoistureDiffusivity();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moisture Diffusivity</em>' attribute is set.
	 * @see #unsetMoistureDiffusivity()
	 * @see #getMoistureDiffusivity()
	 * @see #setMoistureDiffusivity(Double)
	 * @generated
	 */
	boolean isSetMoistureDiffusivity();

	/**
	 * Returns the value of the '<em><b>Vapor Permeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vapor Permeability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vapor Permeability</em>' attribute.
	 * @see #isSetVaporPermeability()
	 * @see #unsetVaporPermeability()
	 * @see #setVaporPermeability(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcHygroscopicMaterialProperties_VaporPermeability()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getVaporPermeability();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vapor Permeability</em>' attribute.
	 * @see #isSetVaporPermeability()
	 * @see #unsetVaporPermeability()
	 * @see #getVaporPermeability()
	 * @generated
	 */
	void setVaporPermeability(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVaporPermeability()
	 * @see #getVaporPermeability()
	 * @see #setVaporPermeability(Double)
	 * @generated
	 */
	void unsetVaporPermeability();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vapor Permeability</em>' attribute is set.
	 * @see #unsetVaporPermeability()
	 * @see #getVaporPermeability()
	 * @see #setVaporPermeability(Double)
	 * @generated
	 */
	boolean isSetVaporPermeability();

	/**
	 * Returns the value of the '<em><b>Isothermal Moisture Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isothermal Moisture Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isothermal Moisture Capacity</em>' attribute.
	 * @see #isSetIsothermalMoistureCapacity()
	 * @see #unsetIsothermalMoistureCapacity()
	 * @see #setIsothermalMoistureCapacity(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIsothermalMoistureCapacity();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isothermal Moisture Capacity</em>' attribute.
	 * @see #isSetIsothermalMoistureCapacity()
	 * @see #unsetIsothermalMoistureCapacity()
	 * @see #getIsothermalMoistureCapacity()
	 * @generated
	 */
	void setIsothermalMoistureCapacity(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsothermalMoistureCapacity()
	 * @see #getIsothermalMoistureCapacity()
	 * @see #setIsothermalMoistureCapacity(Double)
	 * @generated
	 */
	void unsetIsothermalMoistureCapacity();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Isothermal Moisture Capacity</em>' attribute is set.
	 * @see #unsetIsothermalMoistureCapacity()
	 * @see #getIsothermalMoistureCapacity()
	 * @see #setIsothermalMoistureCapacity(Double)
	 * @generated
	 */
	boolean isSetIsothermalMoistureCapacity();

	/**
	 * Returns the value of the '<em><b>Lower Vapor Resistance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Vapor Resistance Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Vapor Resistance Factor</em>' attribute.
	 * @see #isSetLowerVaporResistanceFactor()
	 * @see #unsetLowerVaporResistanceFactor()
	 * @see #setLowerVaporResistanceFactor(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLowerVaporResistanceFactor();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Vapor Resistance Factor</em>' attribute.
	 * @see #isSetLowerVaporResistanceFactor()
	 * @see #unsetLowerVaporResistanceFactor()
	 * @see #getLowerVaporResistanceFactor()
	 * @generated
	 */
	void setLowerVaporResistanceFactor(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowerVaporResistanceFactor()
	 * @see #getLowerVaporResistanceFactor()
	 * @see #setLowerVaporResistanceFactor(Double)
	 * @generated
	 */
	void unsetLowerVaporResistanceFactor();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lower Vapor Resistance Factor</em>' attribute is set.
	 * @see #unsetLowerVaporResistanceFactor()
	 * @see #getLowerVaporResistanceFactor()
	 * @see #setLowerVaporResistanceFactor(Double)
	 * @generated
	 */
	boolean isSetLowerVaporResistanceFactor();

	/**
	 * Returns the value of the '<em><b>Upper Vapor Resistance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Vapor Resistance Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Vapor Resistance Factor</em>' attribute.
	 * @see #isSetUpperVaporResistanceFactor()
	 * @see #unsetUpperVaporResistanceFactor()
	 * @see #setUpperVaporResistanceFactor(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getUpperVaporResistanceFactor();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Vapor Resistance Factor</em>' attribute.
	 * @see #isSetUpperVaporResistanceFactor()
	 * @see #unsetUpperVaporResistanceFactor()
	 * @see #getUpperVaporResistanceFactor()
	 * @generated
	 */
	void setUpperVaporResistanceFactor(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpperVaporResistanceFactor()
	 * @see #getUpperVaporResistanceFactor()
	 * @see #setUpperVaporResistanceFactor(Double)
	 * @generated
	 */
	void unsetUpperVaporResistanceFactor();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Upper Vapor Resistance Factor</em>' attribute is set.
	 * @see #unsetUpperVaporResistanceFactor()
	 * @see #getUpperVaporResistanceFactor()
	 * @see #setUpperVaporResistanceFactor(Double)
	 * @generated
	 */
	boolean isSetUpperVaporResistanceFactor();

} // IfcHygroscopicMaterialProperties
