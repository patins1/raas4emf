/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcServiceLifeFactorImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Service Life Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcServiceLifeFactor#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.IfcServiceLifeFactor#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link IFC2X3.IfcServiceLifeFactor#getMostUsedValue <em>Most Used Value</em>}</li>
 *   <li>{@link IFC2X3.IfcServiceLifeFactor#getLowerValue <em>Lower Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcServiceLifeFactor()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcServiceLifeFactorImplAdapter.class)
public interface IfcServiceLifeFactor extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference.
	 * @see #setUpperValue(IfcMeasureValue)
	 * @see IFC2X3.IFC2X3Package#getIfcServiceLifeFactor_UpperValue()
	 * @model containment="true"
	 * @generated
	 */
	IfcMeasureValue getUpperValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcServiceLifeFactor#getUpperValue <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Value</em>' containment reference.
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(IfcMeasureValue value);

	/**
	 * Returns the value of the '<em><b>Most Used Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Most Used Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Most Used Value</em>' containment reference.
	 * @see #setMostUsedValue(IfcMeasureValue)
	 * @see IFC2X3.IFC2X3Package#getIfcServiceLifeFactor_MostUsedValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IfcMeasureValue getMostUsedValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcServiceLifeFactor#getMostUsedValue <em>Most Used Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Most Used Value</em>' containment reference.
	 * @see #getMostUsedValue()
	 * @generated
	 */
	void setMostUsedValue(IfcMeasureValue value);

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference.
	 * @see #setLowerValue(IfcMeasureValue)
	 * @see IFC2X3.IFC2X3Package#getIfcServiceLifeFactor_LowerValue()
	 * @model containment="true"
	 * @generated
	 */
	IfcMeasureValue getLowerValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcServiceLifeFactor#getLowerValue <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' containment reference.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(IfcMeasureValue value);

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcServiceLifeFactorTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcServiceLifeFactorTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcServiceLifeFactorTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcServiceLifeFactor_PredefinedType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcServiceLifeFactorTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcServiceLifeFactor#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcServiceLifeFactorTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcServiceLifeFactorTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcServiceLifeFactor#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcServiceLifeFactorTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcServiceLifeFactor#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcServiceLifeFactorTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

} // IfcServiceLifeFactor
