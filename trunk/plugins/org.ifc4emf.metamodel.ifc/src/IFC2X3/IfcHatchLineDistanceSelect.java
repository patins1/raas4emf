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

import IFC2X3.jaxb.IfcHatchLineDistanceSelectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Hatch Line Distance Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcHatchLineDistanceSelect#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcHatchLineDistanceSelect#getIfcOneDirectionRepeatFactorvalue <em>Ifc One Direction Repeat Factorvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcHatchLineDistanceSelect()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcHatchLineDistanceSelectImplAdapter.class)
public interface IfcHatchLineDistanceSelect extends CDOObject {
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
	 * @see IFC2X3.IFC2X3Package#getIfcHatchLineDistanceSelect_IfcPositiveLengthMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcPositiveLengthMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcHatchLineDistanceSelect#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcHatchLineDistanceSelect#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcPositiveLengthMeasurevalue()
	 * @see #getIfcPositiveLengthMeasurevalue()
	 * @see #setIfcPositiveLengthMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcPositiveLengthMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcHatchLineDistanceSelect#getIfcPositiveLengthMeasurevalue <em>Ifc Positive Length Measurevalue</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Ifc One Direction Repeat Factorvalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc One Direction Repeat Factorvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc One Direction Repeat Factorvalue</em>' reference.
	 * @see #setIfcOneDirectionRepeatFactorvalue(IfcOneDirectionRepeatFactor)
	 * @see IFC2X3.IFC2X3Package#getIfcHatchLineDistanceSelect_IfcOneDirectionRepeatFactorvalue()
	 * @model
	 * @generated
	 */
	IfcOneDirectionRepeatFactor getIfcOneDirectionRepeatFactorvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcHatchLineDistanceSelect#getIfcOneDirectionRepeatFactorvalue <em>Ifc One Direction Repeat Factorvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc One Direction Repeat Factorvalue</em>' reference.
	 * @see #getIfcOneDirectionRepeatFactorvalue()
	 * @generated
	 */
	void setIfcOneDirectionRepeatFactorvalue(IfcOneDirectionRepeatFactor value);

} // IfcHatchLineDistanceSelect
