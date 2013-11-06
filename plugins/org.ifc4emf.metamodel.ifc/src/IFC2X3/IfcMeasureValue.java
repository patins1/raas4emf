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

import IFC2X3.jaxb.IfcMeasureValueImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Measure Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcLuminousIntensityMeasurevalue <em>Ifc Luminous Intensity Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcAmountOfSubstanceMeasurevalue <em>Ifc Amount Of Substance Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcAreaMeasurevalue <em>Ifc Area Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcContextDependentMeasurevalue <em>Ifc Context Dependent Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcCountMeasurevalue <em>Ifc Count Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcDescriptiveMeasurevalue <em>Ifc Descriptive Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcElectricCurrentMeasurevalue <em>Ifc Electric Current Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcLengthMeasurevalue <em>Ifc Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcMassMeasurevalue <em>Ifc Mass Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcNumericMeasurevalue <em>Ifc Numeric Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcParameterValuevalue <em>Ifc Parameter Valuevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcPlaneAngleMeasurevalue <em>Ifc Plane Angle Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcPositivePlaneAngleMeasurevalue <em>Ifc Positive Plane Angle Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcPositiveRatioMeasurevalue <em>Ifc Positive Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcSolidAngleMeasurevalue <em>Ifc Solid Angle Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcThermodynamicTemperatureMeasurevalue <em>Ifc Thermodynamic Temperature Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcTimeMeasurevalue <em>Ifc Time Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMeasureValue#getIfcVolumeMeasurevalue <em>Ifc Volume Measurevalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcMeasureValueImplAdapter.class)
public interface IfcMeasureValue extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Ifc Normalised Ratio Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Normalised Ratio Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Normalised Ratio Measurevalue</em>' attribute.
	 * @see #isSetIfcNormalisedRatioMeasurevalue()
	 * @see #unsetIfcNormalisedRatioMeasurevalue()
	 * @see #setIfcNormalisedRatioMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcNormalisedRatioMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcNormalisedRatioMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Normalised Ratio Measurevalue</em>' attribute.
	 * @see #isSetIfcNormalisedRatioMeasurevalue()
	 * @see #unsetIfcNormalisedRatioMeasurevalue()
	 * @see #getIfcNormalisedRatioMeasurevalue()
	 * @generated
	 */
	void setIfcNormalisedRatioMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcNormalisedRatioMeasurevalue()
	 * @see #getIfcNormalisedRatioMeasurevalue()
	 * @see #setIfcNormalisedRatioMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcNormalisedRatioMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Normalised Ratio Measurevalue</em>' attribute is set.
	 * @see #unsetIfcNormalisedRatioMeasurevalue()
	 * @see #getIfcNormalisedRatioMeasurevalue()
	 * @see #setIfcNormalisedRatioMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcNormalisedRatioMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Luminous Intensity Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Luminous Intensity Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Luminous Intensity Measurevalue</em>' attribute.
	 * @see #isSetIfcLuminousIntensityMeasurevalue()
	 * @see #unsetIfcLuminousIntensityMeasurevalue()
	 * @see #setIfcLuminousIntensityMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcLuminousIntensityMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcLuminousIntensityMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcLuminousIntensityMeasurevalue <em>Ifc Luminous Intensity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Luminous Intensity Measurevalue</em>' attribute.
	 * @see #isSetIfcLuminousIntensityMeasurevalue()
	 * @see #unsetIfcLuminousIntensityMeasurevalue()
	 * @see #getIfcLuminousIntensityMeasurevalue()
	 * @generated
	 */
	void setIfcLuminousIntensityMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcLuminousIntensityMeasurevalue <em>Ifc Luminous Intensity Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcLuminousIntensityMeasurevalue()
	 * @see #getIfcLuminousIntensityMeasurevalue()
	 * @see #setIfcLuminousIntensityMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcLuminousIntensityMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcLuminousIntensityMeasurevalue <em>Ifc Luminous Intensity Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Luminous Intensity Measurevalue</em>' attribute is set.
	 * @see #unsetIfcLuminousIntensityMeasurevalue()
	 * @see #getIfcLuminousIntensityMeasurevalue()
	 * @see #setIfcLuminousIntensityMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcLuminousIntensityMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Amount Of Substance Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Amount Of Substance Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Amount Of Substance Measurevalue</em>' attribute.
	 * @see #isSetIfcAmountOfSubstanceMeasurevalue()
	 * @see #unsetIfcAmountOfSubstanceMeasurevalue()
	 * @see #setIfcAmountOfSubstanceMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcAmountOfSubstanceMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcAmountOfSubstanceMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcAmountOfSubstanceMeasurevalue <em>Ifc Amount Of Substance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Amount Of Substance Measurevalue</em>' attribute.
	 * @see #isSetIfcAmountOfSubstanceMeasurevalue()
	 * @see #unsetIfcAmountOfSubstanceMeasurevalue()
	 * @see #getIfcAmountOfSubstanceMeasurevalue()
	 * @generated
	 */
	void setIfcAmountOfSubstanceMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcAmountOfSubstanceMeasurevalue <em>Ifc Amount Of Substance Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcAmountOfSubstanceMeasurevalue()
	 * @see #getIfcAmountOfSubstanceMeasurevalue()
	 * @see #setIfcAmountOfSubstanceMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcAmountOfSubstanceMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcAmountOfSubstanceMeasurevalue <em>Ifc Amount Of Substance Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Amount Of Substance Measurevalue</em>' attribute is set.
	 * @see #unsetIfcAmountOfSubstanceMeasurevalue()
	 * @see #getIfcAmountOfSubstanceMeasurevalue()
	 * @see #setIfcAmountOfSubstanceMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcAmountOfSubstanceMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Area Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Area Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Area Measurevalue</em>' attribute.
	 * @see #isSetIfcAreaMeasurevalue()
	 * @see #unsetIfcAreaMeasurevalue()
	 * @see #setIfcAreaMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcAreaMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcAreaMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcAreaMeasurevalue <em>Ifc Area Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Area Measurevalue</em>' attribute.
	 * @see #isSetIfcAreaMeasurevalue()
	 * @see #unsetIfcAreaMeasurevalue()
	 * @see #getIfcAreaMeasurevalue()
	 * @generated
	 */
	void setIfcAreaMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcAreaMeasurevalue <em>Ifc Area Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcAreaMeasurevalue()
	 * @see #getIfcAreaMeasurevalue()
	 * @see #setIfcAreaMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcAreaMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcAreaMeasurevalue <em>Ifc Area Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Area Measurevalue</em>' attribute is set.
	 * @see #unsetIfcAreaMeasurevalue()
	 * @see #getIfcAreaMeasurevalue()
	 * @see #setIfcAreaMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcAreaMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Context Dependent Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Context Dependent Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Context Dependent Measurevalue</em>' attribute.
	 * @see #isSetIfcContextDependentMeasurevalue()
	 * @see #unsetIfcContextDependentMeasurevalue()
	 * @see #setIfcContextDependentMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcContextDependentMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcContextDependentMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcContextDependentMeasurevalue <em>Ifc Context Dependent Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Context Dependent Measurevalue</em>' attribute.
	 * @see #isSetIfcContextDependentMeasurevalue()
	 * @see #unsetIfcContextDependentMeasurevalue()
	 * @see #getIfcContextDependentMeasurevalue()
	 * @generated
	 */
	void setIfcContextDependentMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcContextDependentMeasurevalue <em>Ifc Context Dependent Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcContextDependentMeasurevalue()
	 * @see #getIfcContextDependentMeasurevalue()
	 * @see #setIfcContextDependentMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcContextDependentMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcContextDependentMeasurevalue <em>Ifc Context Dependent Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Context Dependent Measurevalue</em>' attribute is set.
	 * @see #unsetIfcContextDependentMeasurevalue()
	 * @see #getIfcContextDependentMeasurevalue()
	 * @see #setIfcContextDependentMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcContextDependentMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Count Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Count Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Count Measurevalue</em>' attribute.
	 * @see #isSetIfcCountMeasurevalue()
	 * @see #unsetIfcCountMeasurevalue()
	 * @see #setIfcCountMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcCountMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.NUMBER"
	 * @generated
	 */
	Double getIfcCountMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcCountMeasurevalue <em>Ifc Count Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Count Measurevalue</em>' attribute.
	 * @see #isSetIfcCountMeasurevalue()
	 * @see #unsetIfcCountMeasurevalue()
	 * @see #getIfcCountMeasurevalue()
	 * @generated
	 */
	void setIfcCountMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcCountMeasurevalue <em>Ifc Count Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcCountMeasurevalue()
	 * @see #getIfcCountMeasurevalue()
	 * @see #setIfcCountMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcCountMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcCountMeasurevalue <em>Ifc Count Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Count Measurevalue</em>' attribute is set.
	 * @see #unsetIfcCountMeasurevalue()
	 * @see #getIfcCountMeasurevalue()
	 * @see #setIfcCountMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcCountMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Descriptive Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Descriptive Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Descriptive Measurevalue</em>' attribute.
	 * @see #isSetIfcDescriptiveMeasurevalue()
	 * @see #unsetIfcDescriptiveMeasurevalue()
	 * @see #setIfcDescriptiveMeasurevalue(String)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcDescriptiveMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getIfcDescriptiveMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcDescriptiveMeasurevalue <em>Ifc Descriptive Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Descriptive Measurevalue</em>' attribute.
	 * @see #isSetIfcDescriptiveMeasurevalue()
	 * @see #unsetIfcDescriptiveMeasurevalue()
	 * @see #getIfcDescriptiveMeasurevalue()
	 * @generated
	 */
	void setIfcDescriptiveMeasurevalue(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcDescriptiveMeasurevalue <em>Ifc Descriptive Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcDescriptiveMeasurevalue()
	 * @see #getIfcDescriptiveMeasurevalue()
	 * @see #setIfcDescriptiveMeasurevalue(String)
	 * @generated
	 */
	void unsetIfcDescriptiveMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcDescriptiveMeasurevalue <em>Ifc Descriptive Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Descriptive Measurevalue</em>' attribute is set.
	 * @see #unsetIfcDescriptiveMeasurevalue()
	 * @see #getIfcDescriptiveMeasurevalue()
	 * @see #setIfcDescriptiveMeasurevalue(String)
	 * @generated
	 */
	boolean isSetIfcDescriptiveMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Electric Current Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Electric Current Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Electric Current Measurevalue</em>' attribute.
	 * @see #isSetIfcElectricCurrentMeasurevalue()
	 * @see #unsetIfcElectricCurrentMeasurevalue()
	 * @see #setIfcElectricCurrentMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcElectricCurrentMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcElectricCurrentMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcElectricCurrentMeasurevalue <em>Ifc Electric Current Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Electric Current Measurevalue</em>' attribute.
	 * @see #isSetIfcElectricCurrentMeasurevalue()
	 * @see #unsetIfcElectricCurrentMeasurevalue()
	 * @see #getIfcElectricCurrentMeasurevalue()
	 * @generated
	 */
	void setIfcElectricCurrentMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcElectricCurrentMeasurevalue <em>Ifc Electric Current Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcElectricCurrentMeasurevalue()
	 * @see #getIfcElectricCurrentMeasurevalue()
	 * @see #setIfcElectricCurrentMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcElectricCurrentMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcElectricCurrentMeasurevalue <em>Ifc Electric Current Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Electric Current Measurevalue</em>' attribute is set.
	 * @see #unsetIfcElectricCurrentMeasurevalue()
	 * @see #getIfcElectricCurrentMeasurevalue()
	 * @see #setIfcElectricCurrentMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcElectricCurrentMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Length Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Length Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Length Measurevalue</em>' attribute.
	 * @see #isSetIfcLengthMeasurevalue()
	 * @see #unsetIfcLengthMeasurevalue()
	 * @see #setIfcLengthMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcLengthMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcLengthMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcLengthMeasurevalue <em>Ifc Length Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Length Measurevalue</em>' attribute.
	 * @see #isSetIfcLengthMeasurevalue()
	 * @see #unsetIfcLengthMeasurevalue()
	 * @see #getIfcLengthMeasurevalue()
	 * @generated
	 */
	void setIfcLengthMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcLengthMeasurevalue <em>Ifc Length Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcLengthMeasurevalue()
	 * @see #getIfcLengthMeasurevalue()
	 * @see #setIfcLengthMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcLengthMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcLengthMeasurevalue <em>Ifc Length Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Length Measurevalue</em>' attribute is set.
	 * @see #unsetIfcLengthMeasurevalue()
	 * @see #getIfcLengthMeasurevalue()
	 * @see #setIfcLengthMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcLengthMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Positive Length Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Positive Length Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Positive Length Measurevalue</em>' attribute.
	 * @see #isSetIfcPositiveLengthMeasurevalue()
	 * @see #unsetIfcPositiveLengthMeasurevalue()
	 * @see #setIfcPositiveLengthMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcPositiveLengthMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcPositiveLengthMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Positive Length Measurevalue</em>' attribute.
	 * @see #isSetIfcPositiveLengthMeasurevalue()
	 * @see #unsetIfcPositiveLengthMeasurevalue()
	 * @see #getIfcPositiveLengthMeasurevalue()
	 * @generated
	 */
	void setIfcPositiveLengthMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcPositiveLengthMeasurevalue()
	 * @see #getIfcPositiveLengthMeasurevalue()
	 * @see #setIfcPositiveLengthMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcPositiveLengthMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Positive Length Measurevalue</em>' attribute is set.
	 * @see #unsetIfcPositiveLengthMeasurevalue()
	 * @see #getIfcPositiveLengthMeasurevalue()
	 * @see #setIfcPositiveLengthMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcPositiveLengthMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Mass Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Mass Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Mass Measurevalue</em>' attribute.
	 * @see #isSetIfcMassMeasurevalue()
	 * @see #unsetIfcMassMeasurevalue()
	 * @see #setIfcMassMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcMassMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcMassMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcMassMeasurevalue <em>Ifc Mass Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Mass Measurevalue</em>' attribute.
	 * @see #isSetIfcMassMeasurevalue()
	 * @see #unsetIfcMassMeasurevalue()
	 * @see #getIfcMassMeasurevalue()
	 * @generated
	 */
	void setIfcMassMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcMassMeasurevalue <em>Ifc Mass Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcMassMeasurevalue()
	 * @see #getIfcMassMeasurevalue()
	 * @see #setIfcMassMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcMassMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcMassMeasurevalue <em>Ifc Mass Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Mass Measurevalue</em>' attribute is set.
	 * @see #unsetIfcMassMeasurevalue()
	 * @see #getIfcMassMeasurevalue()
	 * @see #setIfcMassMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcMassMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Numeric Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Numeric Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Numeric Measurevalue</em>' attribute.
	 * @see #isSetIfcNumericMeasurevalue()
	 * @see #unsetIfcNumericMeasurevalue()
	 * @see #setIfcNumericMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcNumericMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.NUMBER"
	 * @generated
	 */
	Double getIfcNumericMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcNumericMeasurevalue <em>Ifc Numeric Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Numeric Measurevalue</em>' attribute.
	 * @see #isSetIfcNumericMeasurevalue()
	 * @see #unsetIfcNumericMeasurevalue()
	 * @see #getIfcNumericMeasurevalue()
	 * @generated
	 */
	void setIfcNumericMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcNumericMeasurevalue <em>Ifc Numeric Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcNumericMeasurevalue()
	 * @see #getIfcNumericMeasurevalue()
	 * @see #setIfcNumericMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcNumericMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcNumericMeasurevalue <em>Ifc Numeric Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Numeric Measurevalue</em>' attribute is set.
	 * @see #unsetIfcNumericMeasurevalue()
	 * @see #getIfcNumericMeasurevalue()
	 * @see #setIfcNumericMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcNumericMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Parameter Valuevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Parameter Valuevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Parameter Valuevalue</em>' attribute.
	 * @see #isSetIfcParameterValuevalue()
	 * @see #unsetIfcParameterValuevalue()
	 * @see #setIfcParameterValuevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcParameterValuevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcParameterValuevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcParameterValuevalue <em>Ifc Parameter Valuevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Parameter Valuevalue</em>' attribute.
	 * @see #isSetIfcParameterValuevalue()
	 * @see #unsetIfcParameterValuevalue()
	 * @see #getIfcParameterValuevalue()
	 * @generated
	 */
	void setIfcParameterValuevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcParameterValuevalue <em>Ifc Parameter Valuevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcParameterValuevalue()
	 * @see #getIfcParameterValuevalue()
	 * @see #setIfcParameterValuevalue(Double)
	 * @generated
	 */
	void unsetIfcParameterValuevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcParameterValuevalue <em>Ifc Parameter Valuevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Parameter Valuevalue</em>' attribute is set.
	 * @see #unsetIfcParameterValuevalue()
	 * @see #getIfcParameterValuevalue()
	 * @see #setIfcParameterValuevalue(Double)
	 * @generated
	 */
	boolean isSetIfcParameterValuevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Plane Angle Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Plane Angle Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Plane Angle Measurevalue</em>' attribute.
	 * @see #isSetIfcPlaneAngleMeasurevalue()
	 * @see #unsetIfcPlaneAngleMeasurevalue()
	 * @see #setIfcPlaneAngleMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcPlaneAngleMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcPlaneAngleMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcPlaneAngleMeasurevalue <em>Ifc Plane Angle Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Plane Angle Measurevalue</em>' attribute.
	 * @see #isSetIfcPlaneAngleMeasurevalue()
	 * @see #unsetIfcPlaneAngleMeasurevalue()
	 * @see #getIfcPlaneAngleMeasurevalue()
	 * @generated
	 */
	void setIfcPlaneAngleMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcPlaneAngleMeasurevalue <em>Ifc Plane Angle Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcPlaneAngleMeasurevalue()
	 * @see #getIfcPlaneAngleMeasurevalue()
	 * @see #setIfcPlaneAngleMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcPlaneAngleMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcPlaneAngleMeasurevalue <em>Ifc Plane Angle Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Plane Angle Measurevalue</em>' attribute is set.
	 * @see #unsetIfcPlaneAngleMeasurevalue()
	 * @see #getIfcPlaneAngleMeasurevalue()
	 * @see #setIfcPlaneAngleMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcPlaneAngleMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Positive Plane Angle Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Positive Plane Angle Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Positive Plane Angle Measurevalue</em>' attribute.
	 * @see #isSetIfcPositivePlaneAngleMeasurevalue()
	 * @see #unsetIfcPositivePlaneAngleMeasurevalue()
	 * @see #setIfcPositivePlaneAngleMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcPositivePlaneAngleMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcPositivePlaneAngleMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcPositivePlaneAngleMeasurevalue <em>Ifc Positive Plane Angle Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Positive Plane Angle Measurevalue</em>' attribute.
	 * @see #isSetIfcPositivePlaneAngleMeasurevalue()
	 * @see #unsetIfcPositivePlaneAngleMeasurevalue()
	 * @see #getIfcPositivePlaneAngleMeasurevalue()
	 * @generated
	 */
	void setIfcPositivePlaneAngleMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcPositivePlaneAngleMeasurevalue <em>Ifc Positive Plane Angle Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcPositivePlaneAngleMeasurevalue()
	 * @see #getIfcPositivePlaneAngleMeasurevalue()
	 * @see #setIfcPositivePlaneAngleMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcPositivePlaneAngleMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcPositivePlaneAngleMeasurevalue <em>Ifc Positive Plane Angle Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Positive Plane Angle Measurevalue</em>' attribute is set.
	 * @see #unsetIfcPositivePlaneAngleMeasurevalue()
	 * @see #getIfcPositivePlaneAngleMeasurevalue()
	 * @see #setIfcPositivePlaneAngleMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcPositivePlaneAngleMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Ratio Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Ratio Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Ratio Measurevalue</em>' attribute.
	 * @see #isSetIfcRatioMeasurevalue()
	 * @see #unsetIfcRatioMeasurevalue()
	 * @see #setIfcRatioMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcRatioMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcRatioMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Ratio Measurevalue</em>' attribute.
	 * @see #isSetIfcRatioMeasurevalue()
	 * @see #unsetIfcRatioMeasurevalue()
	 * @see #getIfcRatioMeasurevalue()
	 * @generated
	 */
	void setIfcRatioMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcRatioMeasurevalue()
	 * @see #getIfcRatioMeasurevalue()
	 * @see #setIfcRatioMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcRatioMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Ratio Measurevalue</em>' attribute is set.
	 * @see #unsetIfcRatioMeasurevalue()
	 * @see #getIfcRatioMeasurevalue()
	 * @see #setIfcRatioMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcRatioMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Positive Ratio Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Positive Ratio Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Positive Ratio Measurevalue</em>' attribute.
	 * @see #isSetIfcPositiveRatioMeasurevalue()
	 * @see #unsetIfcPositiveRatioMeasurevalue()
	 * @see #setIfcPositiveRatioMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcPositiveRatioMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcPositiveRatioMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcPositiveRatioMeasurevalue <em>Ifc Positive Ratio Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Positive Ratio Measurevalue</em>' attribute.
	 * @see #isSetIfcPositiveRatioMeasurevalue()
	 * @see #unsetIfcPositiveRatioMeasurevalue()
	 * @see #getIfcPositiveRatioMeasurevalue()
	 * @generated
	 */
	void setIfcPositiveRatioMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcPositiveRatioMeasurevalue <em>Ifc Positive Ratio Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcPositiveRatioMeasurevalue()
	 * @see #getIfcPositiveRatioMeasurevalue()
	 * @see #setIfcPositiveRatioMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcPositiveRatioMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcPositiveRatioMeasurevalue <em>Ifc Positive Ratio Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Positive Ratio Measurevalue</em>' attribute is set.
	 * @see #unsetIfcPositiveRatioMeasurevalue()
	 * @see #getIfcPositiveRatioMeasurevalue()
	 * @see #setIfcPositiveRatioMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcPositiveRatioMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Solid Angle Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Solid Angle Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Solid Angle Measurevalue</em>' attribute.
	 * @see #isSetIfcSolidAngleMeasurevalue()
	 * @see #unsetIfcSolidAngleMeasurevalue()
	 * @see #setIfcSolidAngleMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcSolidAngleMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcSolidAngleMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcSolidAngleMeasurevalue <em>Ifc Solid Angle Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Solid Angle Measurevalue</em>' attribute.
	 * @see #isSetIfcSolidAngleMeasurevalue()
	 * @see #unsetIfcSolidAngleMeasurevalue()
	 * @see #getIfcSolidAngleMeasurevalue()
	 * @generated
	 */
	void setIfcSolidAngleMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcSolidAngleMeasurevalue <em>Ifc Solid Angle Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcSolidAngleMeasurevalue()
	 * @see #getIfcSolidAngleMeasurevalue()
	 * @see #setIfcSolidAngleMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcSolidAngleMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcSolidAngleMeasurevalue <em>Ifc Solid Angle Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Solid Angle Measurevalue</em>' attribute is set.
	 * @see #unsetIfcSolidAngleMeasurevalue()
	 * @see #getIfcSolidAngleMeasurevalue()
	 * @see #setIfcSolidAngleMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcSolidAngleMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Thermodynamic Temperature Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Thermodynamic Temperature Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Thermodynamic Temperature Measurevalue</em>' attribute.
	 * @see #isSetIfcThermodynamicTemperatureMeasurevalue()
	 * @see #unsetIfcThermodynamicTemperatureMeasurevalue()
	 * @see #setIfcThermodynamicTemperatureMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcThermodynamicTemperatureMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcThermodynamicTemperatureMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcThermodynamicTemperatureMeasurevalue <em>Ifc Thermodynamic Temperature Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Thermodynamic Temperature Measurevalue</em>' attribute.
	 * @see #isSetIfcThermodynamicTemperatureMeasurevalue()
	 * @see #unsetIfcThermodynamicTemperatureMeasurevalue()
	 * @see #getIfcThermodynamicTemperatureMeasurevalue()
	 * @generated
	 */
	void setIfcThermodynamicTemperatureMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcThermodynamicTemperatureMeasurevalue <em>Ifc Thermodynamic Temperature Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcThermodynamicTemperatureMeasurevalue()
	 * @see #getIfcThermodynamicTemperatureMeasurevalue()
	 * @see #setIfcThermodynamicTemperatureMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcThermodynamicTemperatureMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcThermodynamicTemperatureMeasurevalue <em>Ifc Thermodynamic Temperature Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Thermodynamic Temperature Measurevalue</em>' attribute is set.
	 * @see #unsetIfcThermodynamicTemperatureMeasurevalue()
	 * @see #getIfcThermodynamicTemperatureMeasurevalue()
	 * @see #setIfcThermodynamicTemperatureMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcThermodynamicTemperatureMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Time Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Time Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Time Measurevalue</em>' attribute.
	 * @see #isSetIfcTimeMeasurevalue()
	 * @see #unsetIfcTimeMeasurevalue()
	 * @see #setIfcTimeMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcTimeMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcTimeMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcTimeMeasurevalue <em>Ifc Time Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Time Measurevalue</em>' attribute.
	 * @see #isSetIfcTimeMeasurevalue()
	 * @see #unsetIfcTimeMeasurevalue()
	 * @see #getIfcTimeMeasurevalue()
	 * @generated
	 */
	void setIfcTimeMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcTimeMeasurevalue <em>Ifc Time Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcTimeMeasurevalue()
	 * @see #getIfcTimeMeasurevalue()
	 * @see #setIfcTimeMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcTimeMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcTimeMeasurevalue <em>Ifc Time Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Time Measurevalue</em>' attribute is set.
	 * @see #unsetIfcTimeMeasurevalue()
	 * @see #getIfcTimeMeasurevalue()
	 * @see #setIfcTimeMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcTimeMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Volume Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Volume Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Volume Measurevalue</em>' attribute.
	 * @see #isSetIfcVolumeMeasurevalue()
	 * @see #unsetIfcVolumeMeasurevalue()
	 * @see #setIfcVolumeMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMeasureValue_IfcVolumeMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcVolumeMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcVolumeMeasurevalue <em>Ifc Volume Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Volume Measurevalue</em>' attribute.
	 * @see #isSetIfcVolumeMeasurevalue()
	 * @see #unsetIfcVolumeMeasurevalue()
	 * @see #getIfcVolumeMeasurevalue()
	 * @generated
	 */
	void setIfcVolumeMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMeasureValue#getIfcVolumeMeasurevalue <em>Ifc Volume Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcVolumeMeasurevalue()
	 * @see #getIfcVolumeMeasurevalue()
	 * @see #setIfcVolumeMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcVolumeMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMeasureValue#getIfcVolumeMeasurevalue <em>Ifc Volume Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Volume Measurevalue</em>' attribute is set.
	 * @see #unsetIfcVolumeMeasurevalue()
	 * @see #getIfcVolumeMeasurevalue()
	 * @see #setIfcVolumeMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcVolumeMeasurevalue();

} // IfcMeasureValue
