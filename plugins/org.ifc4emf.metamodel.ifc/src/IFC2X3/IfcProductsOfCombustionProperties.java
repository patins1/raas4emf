/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcProductsOfCombustionPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Products Of Combustion Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcProductsOfCombustionProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link IFC2X3.IfcProductsOfCombustionProperties#getN20Content <em>N20 Content</em>}</li>
 *   <li>{@link IFC2X3.IfcProductsOfCombustionProperties#getCOContent <em>CO Content</em>}</li>
 *   <li>{@link IFC2X3.IfcProductsOfCombustionProperties#getCO2Content <em>CO2 Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcProductsOfCombustionProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcProductsOfCombustionPropertiesImplAdapter.class)
public interface IfcProductsOfCombustionProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>CO2 Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CO2 Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CO2 Content</em>' attribute.
	 * @see #isSetCO2Content()
	 * @see #unsetCO2Content()
	 * @see #setCO2Content(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcProductsOfCombustionProperties_CO2Content()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCO2Content();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProductsOfCombustionProperties#getCO2Content <em>CO2 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO2 Content</em>' attribute.
	 * @see #isSetCO2Content()
	 * @see #unsetCO2Content()
	 * @see #getCO2Content()
	 * @generated
	 */
	void setCO2Content(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProductsOfCombustionProperties#getCO2Content <em>CO2 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCO2Content()
	 * @see #getCO2Content()
	 * @see #setCO2Content(Double)
	 * @generated
	 */
	void unsetCO2Content();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProductsOfCombustionProperties#getCO2Content <em>CO2 Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>CO2 Content</em>' attribute is set.
	 * @see #unsetCO2Content()
	 * @see #getCO2Content()
	 * @see #setCO2Content(Double)
	 * @generated
	 */
	boolean isSetCO2Content();

	/**
	 * Returns the value of the '<em><b>CO Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CO Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CO Content</em>' attribute.
	 * @see #isSetCOContent()
	 * @see #unsetCOContent()
	 * @see #setCOContent(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcProductsOfCombustionProperties_COContent()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCOContent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProductsOfCombustionProperties#getCOContent <em>CO Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO Content</em>' attribute.
	 * @see #isSetCOContent()
	 * @see #unsetCOContent()
	 * @see #getCOContent()
	 * @generated
	 */
	void setCOContent(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProductsOfCombustionProperties#getCOContent <em>CO Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCOContent()
	 * @see #getCOContent()
	 * @see #setCOContent(Double)
	 * @generated
	 */
	void unsetCOContent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProductsOfCombustionProperties#getCOContent <em>CO Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>CO Content</em>' attribute is set.
	 * @see #unsetCOContent()
	 * @see #getCOContent()
	 * @see #setCOContent(Double)
	 * @generated
	 */
	boolean isSetCOContent();

	/**
	 * Returns the value of the '<em><b>N20 Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>N20 Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>N20 Content</em>' attribute.
	 * @see #isSetN20Content()
	 * @see #unsetN20Content()
	 * @see #setN20Content(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcProductsOfCombustionProperties_N20Content()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getN20Content();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProductsOfCombustionProperties#getN20Content <em>N20 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N20 Content</em>' attribute.
	 * @see #isSetN20Content()
	 * @see #unsetN20Content()
	 * @see #getN20Content()
	 * @generated
	 */
	void setN20Content(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProductsOfCombustionProperties#getN20Content <em>N20 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetN20Content()
	 * @see #getN20Content()
	 * @see #setN20Content(Double)
	 * @generated
	 */
	void unsetN20Content();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProductsOfCombustionProperties#getN20Content <em>N20 Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>N20 Content</em>' attribute is set.
	 * @see #unsetN20Content()
	 * @see #getN20Content()
	 * @see #setN20Content(Double)
	 * @generated
	 */
	boolean isSetN20Content();

	/**
	 * Returns the value of the '<em><b>Specific Heat Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Heat Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Heat Capacity</em>' attribute.
	 * @see #isSetSpecificHeatCapacity()
	 * @see #unsetSpecificHeatCapacity()
	 * @see #setSpecificHeatCapacity(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcProductsOfCombustionProperties_SpecificHeatCapacity()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getSpecificHeatCapacity();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProductsOfCombustionProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Heat Capacity</em>' attribute.
	 * @see #isSetSpecificHeatCapacity()
	 * @see #unsetSpecificHeatCapacity()
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 */
	void setSpecificHeatCapacity(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProductsOfCombustionProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecificHeatCapacity()
	 * @see #getSpecificHeatCapacity()
	 * @see #setSpecificHeatCapacity(Double)
	 * @generated
	 */
	void unsetSpecificHeatCapacity();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProductsOfCombustionProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specific Heat Capacity</em>' attribute is set.
	 * @see #unsetSpecificHeatCapacity()
	 * @see #getSpecificHeatCapacity()
	 * @see #setSpecificHeatCapacity(Double)
	 * @generated
	 */
	boolean isSetSpecificHeatCapacity();

} // IfcProductsOfCombustionProperties
