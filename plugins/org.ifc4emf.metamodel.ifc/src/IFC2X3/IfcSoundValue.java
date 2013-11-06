/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSoundValueImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Sound Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSoundValue#getSoundLevelTimeSeries <em>Sound Level Time Series</em>}</li>
 *   <li>{@link IFC2X3.IfcSoundValue#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link IFC2X3.IfcSoundValue#getSoundLevelSingleValue <em>Sound Level Single Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSoundValue()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSoundValueImplAdapter.class)
public interface IfcSoundValue extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Sound Level Single Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound Level Single Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound Level Single Value</em>' containment reference.
	 * @see #setSoundLevelSingleValue(IfcDerivedMeasureValue)
	 * @see IFC2X3.IFC2X3Package#getIfcSoundValue_SoundLevelSingleValue()
	 * @model containment="true"
	 * @generated
	 */
	IfcDerivedMeasureValue getSoundLevelSingleValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSoundValue#getSoundLevelSingleValue <em>Sound Level Single Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound Level Single Value</em>' containment reference.
	 * @see #getSoundLevelSingleValue()
	 * @generated
	 */
	void setSoundLevelSingleValue(IfcDerivedMeasureValue value);

	/**
	 * Returns the value of the '<em><b>Sound Level Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound Level Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound Level Time Series</em>' reference.
	 * @see #setSoundLevelTimeSeries(IfcTimeSeries)
	 * @see IFC2X3.IFC2X3Package#getIfcSoundValue_SoundLevelTimeSeries()
	 * @model
	 * @generated
	 */
	IfcTimeSeries getSoundLevelTimeSeries();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSoundValue#getSoundLevelTimeSeries <em>Sound Level Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound Level Time Series</em>' reference.
	 * @see #getSoundLevelTimeSeries()
	 * @generated
	 */
	void setSoundLevelTimeSeries(IfcTimeSeries value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #isSetFrequency()
	 * @see #unsetFrequency()
	 * @see #setFrequency(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSoundValue_Frequency()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getFrequency();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSoundValue#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #isSetFrequency()
	 * @see #unsetFrequency()
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSoundValue#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrequency()
	 * @see #getFrequency()
	 * @see #setFrequency(Double)
	 * @generated
	 */
	void unsetFrequency();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSoundValue#getFrequency <em>Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frequency</em>' attribute is set.
	 * @see #unsetFrequency()
	 * @see #getFrequency()
	 * @see #setFrequency(Double)
	 * @generated
	 */
	boolean isSetFrequency();

} // IfcSoundValue
