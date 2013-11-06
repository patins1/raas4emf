/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcEnergyPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Energy Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcEnergyProperties#getEnergySequence <em>Energy Sequence</em>}</li>
 *   <li>{@link IFC2X3.IfcEnergyProperties#getUserDefinedEnergySequence <em>User Defined Energy Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcEnergyProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcEnergyPropertiesImplAdapter.class)
public interface IfcEnergyProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>User Defined Energy Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Energy Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Energy Sequence</em>' attribute.
	 * @see #isSetUserDefinedEnergySequence()
	 * @see #unsetUserDefinedEnergySequence()
	 * @see #setUserDefinedEnergySequence(String)
	 * @see IFC2X3.IFC2X3Package#getIfcEnergyProperties_UserDefinedEnergySequence()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedEnergySequence();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcEnergyProperties#getUserDefinedEnergySequence <em>User Defined Energy Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Energy Sequence</em>' attribute.
	 * @see #isSetUserDefinedEnergySequence()
	 * @see #unsetUserDefinedEnergySequence()
	 * @see #getUserDefinedEnergySequence()
	 * @generated
	 */
	void setUserDefinedEnergySequence(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcEnergyProperties#getUserDefinedEnergySequence <em>User Defined Energy Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedEnergySequence()
	 * @see #getUserDefinedEnergySequence()
	 * @see #setUserDefinedEnergySequence(String)
	 * @generated
	 */
	void unsetUserDefinedEnergySequence();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcEnergyProperties#getUserDefinedEnergySequence <em>User Defined Energy Sequence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Energy Sequence</em>' attribute is set.
	 * @see #unsetUserDefinedEnergySequence()
	 * @see #getUserDefinedEnergySequence()
	 * @see #setUserDefinedEnergySequence(String)
	 * @generated
	 */
	boolean isSetUserDefinedEnergySequence();

	/**
	 * Returns the value of the '<em><b>Energy Sequence</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcEnergySequenceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Sequence</em>' attribute.
	 * @see IFC2X3.IfcEnergySequenceEnum
	 * @see #isSetEnergySequence()
	 * @see #unsetEnergySequence()
	 * @see #setEnergySequence(IfcEnergySequenceEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcEnergyProperties_EnergySequence()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcEnergySequenceEnum getEnergySequence();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcEnergyProperties#getEnergySequence <em>Energy Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Sequence</em>' attribute.
	 * @see IFC2X3.IfcEnergySequenceEnum
	 * @see #isSetEnergySequence()
	 * @see #unsetEnergySequence()
	 * @see #getEnergySequence()
	 * @generated
	 */
	void setEnergySequence(IfcEnergySequenceEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcEnergyProperties#getEnergySequence <em>Energy Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergySequence()
	 * @see #getEnergySequence()
	 * @see #setEnergySequence(IfcEnergySequenceEnum)
	 * @generated
	 */
	void unsetEnergySequence();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcEnergyProperties#getEnergySequence <em>Energy Sequence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energy Sequence</em>' attribute is set.
	 * @see #unsetEnergySequence()
	 * @see #getEnergySequence()
	 * @see #setEnergySequence(IfcEnergySequenceEnum)
	 * @generated
	 */
	boolean isSetEnergySequence();

} // IfcEnergyProperties
