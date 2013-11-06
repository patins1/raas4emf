/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcGeneralMaterialPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc General Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link IFC2X3.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}</li>
 *   <li>{@link IFC2X3.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcGeneralMaterialProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcGeneralMaterialPropertiesImplAdapter.class)
public interface IfcGeneralMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Mass Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass Density</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Density</em>' attribute.
	 * @see #isSetMassDensity()
	 * @see #unsetMassDensity()
	 * @see #setMassDensity(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcGeneralMaterialProperties_MassDensity()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMassDensity();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Density</em>' attribute.
	 * @see #isSetMassDensity()
	 * @see #unsetMassDensity()
	 * @see #getMassDensity()
	 * @generated
	 */
	void setMassDensity(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMassDensity()
	 * @see #getMassDensity()
	 * @see #setMassDensity(Double)
	 * @generated
	 */
	void unsetMassDensity();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mass Density</em>' attribute is set.
	 * @see #unsetMassDensity()
	 * @see #getMassDensity()
	 * @see #setMassDensity(Double)
	 * @generated
	 */
	boolean isSetMassDensity();

	/**
	 * Returns the value of the '<em><b>Porosity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porosity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porosity</em>' attribute.
	 * @see #isSetPorosity()
	 * @see #unsetPorosity()
	 * @see #setPorosity(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcGeneralMaterialProperties_Porosity()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPorosity();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porosity</em>' attribute.
	 * @see #isSetPorosity()
	 * @see #unsetPorosity()
	 * @see #getPorosity()
	 * @generated
	 */
	void setPorosity(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPorosity()
	 * @see #getPorosity()
	 * @see #setPorosity(Double)
	 * @generated
	 */
	void unsetPorosity();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Porosity</em>' attribute is set.
	 * @see #unsetPorosity()
	 * @see #getPorosity()
	 * @see #setPorosity(Double)
	 * @generated
	 */
	boolean isSetPorosity();

	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molecular Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' attribute.
	 * @see #isSetMolecularWeight()
	 * @see #unsetMolecularWeight()
	 * @see #setMolecularWeight(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcGeneralMaterialProperties_MolecularWeight()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMolecularWeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Weight</em>' attribute.
	 * @see #isSetMolecularWeight()
	 * @see #unsetMolecularWeight()
	 * @see #getMolecularWeight()
	 * @generated
	 */
	void setMolecularWeight(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMolecularWeight()
	 * @see #getMolecularWeight()
	 * @see #setMolecularWeight(Double)
	 * @generated
	 */
	void unsetMolecularWeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Molecular Weight</em>' attribute is set.
	 * @see #unsetMolecularWeight()
	 * @see #getMolecularWeight()
	 * @see #setMolecularWeight(Double)
	 * @generated
	 */
	boolean isSetMolecularWeight();

} // IfcGeneralMaterialProperties
