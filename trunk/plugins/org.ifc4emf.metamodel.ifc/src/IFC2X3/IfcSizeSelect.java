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

import IFC2X3.jaxb.IfcSizeSelectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Size Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSizeSelect#getIfcPositiveRatioMeasurevalue <em>Ifc Positive Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcSizeSelect#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcSizeSelect#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcSizeSelect#getIfcDescriptiveMeasurevalue <em>Ifc Descriptive Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcSizeSelect#getIfcLengthMeasurevalue <em>Ifc Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcSizeSelect#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSizeSelect()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcSizeSelectImplAdapter.class)
public interface IfcSizeSelect extends CDOObject {
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
	 * @see IFC2X3.IFC2X3Package#getIfcSizeSelect_IfcPositiveRatioMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcPositiveRatioMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSizeSelect#getIfcPositiveRatioMeasurevalue <em>Ifc Positive Ratio Measurevalue</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcSizeSelect#getIfcPositiveRatioMeasurevalue <em>Ifc Positive Ratio Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcPositiveRatioMeasurevalue()
	 * @see #getIfcPositiveRatioMeasurevalue()
	 * @see #setIfcPositiveRatioMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcPositiveRatioMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSizeSelect#getIfcPositiveRatioMeasurevalue <em>Ifc Positive Ratio Measurevalue</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcSizeSelect_IfcNormalisedRatioMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcNormalisedRatioMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSizeSelect#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcSizeSelect#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcNormalisedRatioMeasurevalue()
	 * @see #getIfcNormalisedRatioMeasurevalue()
	 * @see #setIfcNormalisedRatioMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcNormalisedRatioMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSizeSelect#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcSizeSelect_IfcPositiveLengthMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcPositiveLengthMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSizeSelect#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcSizeSelect#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcPositiveLengthMeasurevalue()
	 * @see #getIfcPositiveLengthMeasurevalue()
	 * @see #setIfcPositiveLengthMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcPositiveLengthMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSizeSelect#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcSizeSelect_IfcDescriptiveMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getIfcDescriptiveMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSizeSelect#getIfcDescriptiveMeasurevalue <em>Ifc Descriptive Measurevalue</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcSizeSelect#getIfcDescriptiveMeasurevalue <em>Ifc Descriptive Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcDescriptiveMeasurevalue()
	 * @see #getIfcDescriptiveMeasurevalue()
	 * @see #setIfcDescriptiveMeasurevalue(String)
	 * @generated
	 */
	void unsetIfcDescriptiveMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSizeSelect#getIfcDescriptiveMeasurevalue <em>Ifc Descriptive Measurevalue</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcSizeSelect_IfcLengthMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcLengthMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSizeSelect#getIfcLengthMeasurevalue <em>Ifc Length Measurevalue</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcSizeSelect#getIfcLengthMeasurevalue <em>Ifc Length Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcLengthMeasurevalue()
	 * @see #getIfcLengthMeasurevalue()
	 * @see #setIfcLengthMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcLengthMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSizeSelect#getIfcLengthMeasurevalue <em>Ifc Length Measurevalue</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcSizeSelect_IfcRatioMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcRatioMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSizeSelect#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcSizeSelect#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcRatioMeasurevalue()
	 * @see #getIfcRatioMeasurevalue()
	 * @see #setIfcRatioMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcRatioMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSizeSelect#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Ratio Measurevalue</em>' attribute is set.
	 * @see #unsetIfcRatioMeasurevalue()
	 * @see #getIfcRatioMeasurevalue()
	 * @see #setIfcRatioMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcRatioMeasurevalue();

} // IfcSizeSelect
