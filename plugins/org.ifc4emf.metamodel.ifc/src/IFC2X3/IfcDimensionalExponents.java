/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcDimensionalExponentsImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Dimensional Exponents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDimensionalExponents#getLengthExponent <em>Length Exponent</em>}</li>
 *   <li>{@link IFC2X3.IfcDimensionalExponents#getMassExponent <em>Mass Exponent</em>}</li>
 *   <li>{@link IFC2X3.IfcDimensionalExponents#getTimeExponent <em>Time Exponent</em>}</li>
 *   <li>{@link IFC2X3.IfcDimensionalExponents#getElectricCurrentExponent <em>Electric Current Exponent</em>}</li>
 *   <li>{@link IFC2X3.IfcDimensionalExponents#getThermodynamicTemperatureExponent <em>Thermodynamic Temperature Exponent</em>}</li>
 *   <li>{@link IFC2X3.IfcDimensionalExponents#getAmountOfSubstanceExponent <em>Amount Of Substance Exponent</em>}</li>
 *   <li>{@link IFC2X3.IfcDimensionalExponents#getLuminousIntensityExponent <em>Luminous Intensity Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDimensionalExponents()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcDimensionalExponentsImplAdapter.class)
public interface IfcDimensionalExponents extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Luminous Intensity Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminous Intensity Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminous Intensity Exponent</em>' attribute.
	 * @see #isSetLuminousIntensityExponent()
	 * @see #unsetLuminousIntensityExponent()
	 * @see #setLuminousIntensityExponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcDimensionalExponents_LuminousIntensityExponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getLuminousIntensityExponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDimensionalExponents#getLuminousIntensityExponent <em>Luminous Intensity Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminous Intensity Exponent</em>' attribute.
	 * @see #isSetLuminousIntensityExponent()
	 * @see #unsetLuminousIntensityExponent()
	 * @see #getLuminousIntensityExponent()
	 * @generated
	 */
	void setLuminousIntensityExponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDimensionalExponents#getLuminousIntensityExponent <em>Luminous Intensity Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLuminousIntensityExponent()
	 * @see #getLuminousIntensityExponent()
	 * @see #setLuminousIntensityExponent(Integer)
	 * @generated
	 */
	void unsetLuminousIntensityExponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDimensionalExponents#getLuminousIntensityExponent <em>Luminous Intensity Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Luminous Intensity Exponent</em>' attribute is set.
	 * @see #unsetLuminousIntensityExponent()
	 * @see #getLuminousIntensityExponent()
	 * @see #setLuminousIntensityExponent(Integer)
	 * @generated
	 */
	boolean isSetLuminousIntensityExponent();

	/**
	 * Returns the value of the '<em><b>Amount Of Substance Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Of Substance Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Substance Exponent</em>' attribute.
	 * @see #isSetAmountOfSubstanceExponent()
	 * @see #unsetAmountOfSubstanceExponent()
	 * @see #setAmountOfSubstanceExponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcDimensionalExponents_AmountOfSubstanceExponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getAmountOfSubstanceExponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDimensionalExponents#getAmountOfSubstanceExponent <em>Amount Of Substance Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Substance Exponent</em>' attribute.
	 * @see #isSetAmountOfSubstanceExponent()
	 * @see #unsetAmountOfSubstanceExponent()
	 * @see #getAmountOfSubstanceExponent()
	 * @generated
	 */
	void setAmountOfSubstanceExponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDimensionalExponents#getAmountOfSubstanceExponent <em>Amount Of Substance Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmountOfSubstanceExponent()
	 * @see #getAmountOfSubstanceExponent()
	 * @see #setAmountOfSubstanceExponent(Integer)
	 * @generated
	 */
	void unsetAmountOfSubstanceExponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDimensionalExponents#getAmountOfSubstanceExponent <em>Amount Of Substance Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Amount Of Substance Exponent</em>' attribute is set.
	 * @see #unsetAmountOfSubstanceExponent()
	 * @see #getAmountOfSubstanceExponent()
	 * @see #setAmountOfSubstanceExponent(Integer)
	 * @generated
	 */
	boolean isSetAmountOfSubstanceExponent();

	/**
	 * Returns the value of the '<em><b>Thermodynamic Temperature Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermodynamic Temperature Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermodynamic Temperature Exponent</em>' attribute.
	 * @see #isSetThermodynamicTemperatureExponent()
	 * @see #unsetThermodynamicTemperatureExponent()
	 * @see #setThermodynamicTemperatureExponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcDimensionalExponents_ThermodynamicTemperatureExponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getThermodynamicTemperatureExponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDimensionalExponents#getThermodynamicTemperatureExponent <em>Thermodynamic Temperature Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermodynamic Temperature Exponent</em>' attribute.
	 * @see #isSetThermodynamicTemperatureExponent()
	 * @see #unsetThermodynamicTemperatureExponent()
	 * @see #getThermodynamicTemperatureExponent()
	 * @generated
	 */
	void setThermodynamicTemperatureExponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDimensionalExponents#getThermodynamicTemperatureExponent <em>Thermodynamic Temperature Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermodynamicTemperatureExponent()
	 * @see #getThermodynamicTemperatureExponent()
	 * @see #setThermodynamicTemperatureExponent(Integer)
	 * @generated
	 */
	void unsetThermodynamicTemperatureExponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDimensionalExponents#getThermodynamicTemperatureExponent <em>Thermodynamic Temperature Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermodynamic Temperature Exponent</em>' attribute is set.
	 * @see #unsetThermodynamicTemperatureExponent()
	 * @see #getThermodynamicTemperatureExponent()
	 * @see #setThermodynamicTemperatureExponent(Integer)
	 * @generated
	 */
	boolean isSetThermodynamicTemperatureExponent();

	/**
	 * Returns the value of the '<em><b>Electric Current Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electric Current Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electric Current Exponent</em>' attribute.
	 * @see #isSetElectricCurrentExponent()
	 * @see #unsetElectricCurrentExponent()
	 * @see #setElectricCurrentExponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcDimensionalExponents_ElectricCurrentExponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getElectricCurrentExponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDimensionalExponents#getElectricCurrentExponent <em>Electric Current Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electric Current Exponent</em>' attribute.
	 * @see #isSetElectricCurrentExponent()
	 * @see #unsetElectricCurrentExponent()
	 * @see #getElectricCurrentExponent()
	 * @generated
	 */
	void setElectricCurrentExponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDimensionalExponents#getElectricCurrentExponent <em>Electric Current Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElectricCurrentExponent()
	 * @see #getElectricCurrentExponent()
	 * @see #setElectricCurrentExponent(Integer)
	 * @generated
	 */
	void unsetElectricCurrentExponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDimensionalExponents#getElectricCurrentExponent <em>Electric Current Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Electric Current Exponent</em>' attribute is set.
	 * @see #unsetElectricCurrentExponent()
	 * @see #getElectricCurrentExponent()
	 * @see #setElectricCurrentExponent(Integer)
	 * @generated
	 */
	boolean isSetElectricCurrentExponent();

	/**
	 * Returns the value of the '<em><b>Time Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Exponent</em>' attribute.
	 * @see #isSetTimeExponent()
	 * @see #unsetTimeExponent()
	 * @see #setTimeExponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcDimensionalExponents_TimeExponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getTimeExponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDimensionalExponents#getTimeExponent <em>Time Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Exponent</em>' attribute.
	 * @see #isSetTimeExponent()
	 * @see #unsetTimeExponent()
	 * @see #getTimeExponent()
	 * @generated
	 */
	void setTimeExponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDimensionalExponents#getTimeExponent <em>Time Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeExponent()
	 * @see #getTimeExponent()
	 * @see #setTimeExponent(Integer)
	 * @generated
	 */
	void unsetTimeExponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDimensionalExponents#getTimeExponent <em>Time Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Exponent</em>' attribute is set.
	 * @see #unsetTimeExponent()
	 * @see #getTimeExponent()
	 * @see #setTimeExponent(Integer)
	 * @generated
	 */
	boolean isSetTimeExponent();

	/**
	 * Returns the value of the '<em><b>Mass Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Exponent</em>' attribute.
	 * @see #isSetMassExponent()
	 * @see #unsetMassExponent()
	 * @see #setMassExponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcDimensionalExponents_MassExponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getMassExponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDimensionalExponents#getMassExponent <em>Mass Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Exponent</em>' attribute.
	 * @see #isSetMassExponent()
	 * @see #unsetMassExponent()
	 * @see #getMassExponent()
	 * @generated
	 */
	void setMassExponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDimensionalExponents#getMassExponent <em>Mass Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMassExponent()
	 * @see #getMassExponent()
	 * @see #setMassExponent(Integer)
	 * @generated
	 */
	void unsetMassExponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDimensionalExponents#getMassExponent <em>Mass Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mass Exponent</em>' attribute is set.
	 * @see #unsetMassExponent()
	 * @see #getMassExponent()
	 * @see #setMassExponent(Integer)
	 * @generated
	 */
	boolean isSetMassExponent();

	/**
	 * Returns the value of the '<em><b>Length Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Exponent</em>' attribute.
	 * @see #isSetLengthExponent()
	 * @see #unsetLengthExponent()
	 * @see #setLengthExponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcDimensionalExponents_LengthExponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getLengthExponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDimensionalExponents#getLengthExponent <em>Length Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Exponent</em>' attribute.
	 * @see #isSetLengthExponent()
	 * @see #unsetLengthExponent()
	 * @see #getLengthExponent()
	 * @generated
	 */
	void setLengthExponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDimensionalExponents#getLengthExponent <em>Length Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLengthExponent()
	 * @see #getLengthExponent()
	 * @see #setLengthExponent(Integer)
	 * @generated
	 */
	void unsetLengthExponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDimensionalExponents#getLengthExponent <em>Length Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length Exponent</em>' attribute is set.
	 * @see #unsetLengthExponent()
	 * @see #getLengthExponent()
	 * @see #setLengthExponent(Integer)
	 * @generated
	 */
	boolean isSetLengthExponent();

} // IfcDimensionalExponents
