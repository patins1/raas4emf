/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcWaterPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Water Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcWaterProperties#getIsPotable <em>Is Potable</em>}</li>
 *   <li>{@link IFC2X3.IfcWaterProperties#getHardness <em>Hardness</em>}</li>
 *   <li>{@link IFC2X3.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}</li>
 *   <li>{@link IFC2X3.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}</li>
 *   <li>{@link IFC2X3.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}</li>
 *   <li>{@link IFC2X3.IfcWaterProperties#getPHLevel <em>PH Level</em>}</li>
 *   <li>{@link IFC2X3.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcWaterProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcWaterPropertiesImplAdapter.class)
public interface IfcWaterProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Dissolved Solids Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissolved Solids Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissolved Solids Content</em>' attribute.
	 * @see #isSetDissolvedSolidsContent()
	 * @see #unsetDissolvedSolidsContent()
	 * @see #setDissolvedSolidsContent(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWaterProperties_DissolvedSolidsContent()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getDissolvedSolidsContent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissolved Solids Content</em>' attribute.
	 * @see #isSetDissolvedSolidsContent()
	 * @see #unsetDissolvedSolidsContent()
	 * @see #getDissolvedSolidsContent()
	 * @generated
	 */
	void setDissolvedSolidsContent(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDissolvedSolidsContent()
	 * @see #getDissolvedSolidsContent()
	 * @see #setDissolvedSolidsContent(Double)
	 * @generated
	 */
	void unsetDissolvedSolidsContent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dissolved Solids Content</em>' attribute is set.
	 * @see #unsetDissolvedSolidsContent()
	 * @see #getDissolvedSolidsContent()
	 * @see #setDissolvedSolidsContent(Double)
	 * @generated
	 */
	boolean isSetDissolvedSolidsContent();

	/**
	 * Returns the value of the '<em><b>PH Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PH Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PH Level</em>' attribute.
	 * @see #isSetPHLevel()
	 * @see #unsetPHLevel()
	 * @see #setPHLevel(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWaterProperties_PHLevel()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPHLevel();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWaterProperties#getPHLevel <em>PH Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PH Level</em>' attribute.
	 * @see #isSetPHLevel()
	 * @see #unsetPHLevel()
	 * @see #getPHLevel()
	 * @generated
	 */
	void setPHLevel(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWaterProperties#getPHLevel <em>PH Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPHLevel()
	 * @see #getPHLevel()
	 * @see #setPHLevel(Double)
	 * @generated
	 */
	void unsetPHLevel();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWaterProperties#getPHLevel <em>PH Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PH Level</em>' attribute is set.
	 * @see #unsetPHLevel()
	 * @see #getPHLevel()
	 * @see #setPHLevel(Double)
	 * @generated
	 */
	boolean isSetPHLevel();

	/**
	 * Returns the value of the '<em><b>Impurities Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impurities Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impurities Content</em>' attribute.
	 * @see #isSetImpuritiesContent()
	 * @see #unsetImpuritiesContent()
	 * @see #setImpuritiesContent(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWaterProperties_ImpuritiesContent()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getImpuritiesContent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impurities Content</em>' attribute.
	 * @see #isSetImpuritiesContent()
	 * @see #unsetImpuritiesContent()
	 * @see #getImpuritiesContent()
	 * @generated
	 */
	void setImpuritiesContent(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImpuritiesContent()
	 * @see #getImpuritiesContent()
	 * @see #setImpuritiesContent(Double)
	 * @generated
	 */
	void unsetImpuritiesContent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impurities Content</em>' attribute is set.
	 * @see #unsetImpuritiesContent()
	 * @see #getImpuritiesContent()
	 * @see #setImpuritiesContent(Double)
	 * @generated
	 */
	boolean isSetImpuritiesContent();

	/**
	 * Returns the value of the '<em><b>Acidity Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acidity Concentration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acidity Concentration</em>' attribute.
	 * @see #isSetAcidityConcentration()
	 * @see #unsetAcidityConcentration()
	 * @see #setAcidityConcentration(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWaterProperties_AcidityConcentration()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getAcidityConcentration();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acidity Concentration</em>' attribute.
	 * @see #isSetAcidityConcentration()
	 * @see #unsetAcidityConcentration()
	 * @see #getAcidityConcentration()
	 * @generated
	 */
	void setAcidityConcentration(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcidityConcentration()
	 * @see #getAcidityConcentration()
	 * @see #setAcidityConcentration(Double)
	 * @generated
	 */
	void unsetAcidityConcentration();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Acidity Concentration</em>' attribute is set.
	 * @see #unsetAcidityConcentration()
	 * @see #getAcidityConcentration()
	 * @see #setAcidityConcentration(Double)
	 * @generated
	 */
	boolean isSetAcidityConcentration();

	/**
	 * Returns the value of the '<em><b>Alkalinity Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alkalinity Concentration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alkalinity Concentration</em>' attribute.
	 * @see #isSetAlkalinityConcentration()
	 * @see #unsetAlkalinityConcentration()
	 * @see #setAlkalinityConcentration(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWaterProperties_AlkalinityConcentration()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getAlkalinityConcentration();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alkalinity Concentration</em>' attribute.
	 * @see #isSetAlkalinityConcentration()
	 * @see #unsetAlkalinityConcentration()
	 * @see #getAlkalinityConcentration()
	 * @generated
	 */
	void setAlkalinityConcentration(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlkalinityConcentration()
	 * @see #getAlkalinityConcentration()
	 * @see #setAlkalinityConcentration(Double)
	 * @generated
	 */
	void unsetAlkalinityConcentration();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alkalinity Concentration</em>' attribute is set.
	 * @see #unsetAlkalinityConcentration()
	 * @see #getAlkalinityConcentration()
	 * @see #setAlkalinityConcentration(Double)
	 * @generated
	 */
	boolean isSetAlkalinityConcentration();

	/**
	 * Returns the value of the '<em><b>Hardness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardness</em>' attribute.
	 * @see #isSetHardness()
	 * @see #unsetHardness()
	 * @see #setHardness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWaterProperties_Hardness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getHardness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWaterProperties#getHardness <em>Hardness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardness</em>' attribute.
	 * @see #isSetHardness()
	 * @see #unsetHardness()
	 * @see #getHardness()
	 * @generated
	 */
	void setHardness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWaterProperties#getHardness <em>Hardness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHardness()
	 * @see #getHardness()
	 * @see #setHardness(Double)
	 * @generated
	 */
	void unsetHardness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWaterProperties#getHardness <em>Hardness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hardness</em>' attribute is set.
	 * @see #unsetHardness()
	 * @see #getHardness()
	 * @see #setHardness(Double)
	 * @generated
	 */
	boolean isSetHardness();

	/**
	 * Returns the value of the '<em><b>Is Potable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Potable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Potable</em>' attribute.
	 * @see #isSetIsPotable()
	 * @see #unsetIsPotable()
	 * @see #setIsPotable(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcWaterProperties_IsPotable()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN"
	 * @generated
	 */
	Boolean getIsPotable();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWaterProperties#getIsPotable <em>Is Potable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Potable</em>' attribute.
	 * @see #isSetIsPotable()
	 * @see #unsetIsPotable()
	 * @see #getIsPotable()
	 * @generated
	 */
	void setIsPotable(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWaterProperties#getIsPotable <em>Is Potable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPotable()
	 * @see #getIsPotable()
	 * @see #setIsPotable(Boolean)
	 * @generated
	 */
	void unsetIsPotable();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWaterProperties#getIsPotable <em>Is Potable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Potable</em>' attribute is set.
	 * @see #unsetIsPotable()
	 * @see #getIsPotable()
	 * @see #setIsPotable(Boolean)
	 * @generated
	 */
	boolean isSetIsPotable();

} // IfcWaterProperties
