/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcMechanicalConcreteMaterialPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Mechanical Concrete Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMechanicalConcreteMaterialProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMechanicalConcreteMaterialPropertiesImplAdapter.class)
public interface IfcMechanicalConcreteMaterialProperties extends IfcMechanicalMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Water Impermeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Impermeability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Impermeability</em>' attribute.
	 * @see #isSetWaterImpermeability()
	 * @see #unsetWaterImpermeability()
	 * @see #setWaterImpermeability(String)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalConcreteMaterialProperties_WaterImpermeability()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getWaterImpermeability();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Impermeability</em>' attribute.
	 * @see #isSetWaterImpermeability()
	 * @see #unsetWaterImpermeability()
	 * @see #getWaterImpermeability()
	 * @generated
	 */
	void setWaterImpermeability(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWaterImpermeability()
	 * @see #getWaterImpermeability()
	 * @see #setWaterImpermeability(String)
	 * @generated
	 */
	void unsetWaterImpermeability();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Water Impermeability</em>' attribute is set.
	 * @see #unsetWaterImpermeability()
	 * @see #getWaterImpermeability()
	 * @see #setWaterImpermeability(String)
	 * @generated
	 */
	boolean isSetWaterImpermeability();

	/**
	 * Returns the value of the '<em><b>Protective Pore Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protective Pore Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protective Pore Ratio</em>' attribute.
	 * @see #isSetProtectivePoreRatio()
	 * @see #unsetProtectivePoreRatio()
	 * @see #setProtectivePoreRatio(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getProtectivePoreRatio();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protective Pore Ratio</em>' attribute.
	 * @see #isSetProtectivePoreRatio()
	 * @see #unsetProtectivePoreRatio()
	 * @see #getProtectivePoreRatio()
	 * @generated
	 */
	void setProtectivePoreRatio(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtectivePoreRatio()
	 * @see #getProtectivePoreRatio()
	 * @see #setProtectivePoreRatio(Double)
	 * @generated
	 */
	void unsetProtectivePoreRatio();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protective Pore Ratio</em>' attribute is set.
	 * @see #unsetProtectivePoreRatio()
	 * @see #getProtectivePoreRatio()
	 * @see #setProtectivePoreRatio(Double)
	 * @generated
	 */
	boolean isSetProtectivePoreRatio();

	/**
	 * Returns the value of the '<em><b>Workability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workability</em>' attribute.
	 * @see #isSetWorkability()
	 * @see #unsetWorkability()
	 * @see #setWorkability(String)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalConcreteMaterialProperties_Workability()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getWorkability();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workability</em>' attribute.
	 * @see #isSetWorkability()
	 * @see #unsetWorkability()
	 * @see #getWorkability()
	 * @generated
	 */
	void setWorkability(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkability()
	 * @see #getWorkability()
	 * @see #setWorkability(String)
	 * @generated
	 */
	void unsetWorkability();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Workability</em>' attribute is set.
	 * @see #unsetWorkability()
	 * @see #getWorkability()
	 * @see #setWorkability(String)
	 * @generated
	 */
	boolean isSetWorkability();

	/**
	 * Returns the value of the '<em><b>Admixtures Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admixtures Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admixtures Description</em>' attribute.
	 * @see #isSetAdmixturesDescription()
	 * @see #unsetAdmixturesDescription()
	 * @see #setAdmixturesDescription(String)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getAdmixturesDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admixtures Description</em>' attribute.
	 * @see #isSetAdmixturesDescription()
	 * @see #unsetAdmixturesDescription()
	 * @see #getAdmixturesDescription()
	 * @generated
	 */
	void setAdmixturesDescription(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdmixturesDescription()
	 * @see #getAdmixturesDescription()
	 * @see #setAdmixturesDescription(String)
	 * @generated
	 */
	void unsetAdmixturesDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Admixtures Description</em>' attribute is set.
	 * @see #unsetAdmixturesDescription()
	 * @see #getAdmixturesDescription()
	 * @see #setAdmixturesDescription(String)
	 * @generated
	 */
	boolean isSetAdmixturesDescription();

	/**
	 * Returns the value of the '<em><b>Max Aggregate Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Aggregate Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Aggregate Size</em>' attribute.
	 * @see #isSetMaxAggregateSize()
	 * @see #unsetMaxAggregateSize()
	 * @see #setMaxAggregateSize(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMaxAggregateSize();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Aggregate Size</em>' attribute.
	 * @see #isSetMaxAggregateSize()
	 * @see #unsetMaxAggregateSize()
	 * @see #getMaxAggregateSize()
	 * @generated
	 */
	void setMaxAggregateSize(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxAggregateSize()
	 * @see #getMaxAggregateSize()
	 * @see #setMaxAggregateSize(Double)
	 * @generated
	 */
	void unsetMaxAggregateSize();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Aggregate Size</em>' attribute is set.
	 * @see #unsetMaxAggregateSize()
	 * @see #getMaxAggregateSize()
	 * @see #setMaxAggregateSize(Double)
	 * @generated
	 */
	boolean isSetMaxAggregateSize();

	/**
	 * Returns the value of the '<em><b>Compressive Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compressive Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compressive Strength</em>' attribute.
	 * @see #isSetCompressiveStrength()
	 * @see #unsetCompressiveStrength()
	 * @see #setCompressiveStrength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalConcreteMaterialProperties_CompressiveStrength()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCompressiveStrength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compressive Strength</em>' attribute.
	 * @see #isSetCompressiveStrength()
	 * @see #unsetCompressiveStrength()
	 * @see #getCompressiveStrength()
	 * @generated
	 */
	void setCompressiveStrength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressiveStrength()
	 * @see #getCompressiveStrength()
	 * @see #setCompressiveStrength(Double)
	 * @generated
	 */
	void unsetCompressiveStrength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compressive Strength</em>' attribute is set.
	 * @see #unsetCompressiveStrength()
	 * @see #getCompressiveStrength()
	 * @see #setCompressiveStrength(Double)
	 * @generated
	 */
	boolean isSetCompressiveStrength();

} // IfcMechanicalConcreteMaterialProperties
