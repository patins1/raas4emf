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

import IFC2X3.jaxb.IfcConditionCriterionSelectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Condition Criterion Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcConditionCriterionSelect#getIfcLabelvalue <em>Ifc Labelvalue</em>}</li>
 *   <li>{@link IFC2X3.IfcConditionCriterionSelect#getIfcMeasureWithUnitvalue <em>Ifc Measure With Unitvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcConditionCriterionSelect()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcConditionCriterionSelectImplAdapter.class)
public interface IfcConditionCriterionSelect extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Ifc Labelvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Labelvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Labelvalue</em>' attribute.
	 * @see #isSetIfcLabelvalue()
	 * @see #unsetIfcLabelvalue()
	 * @see #setIfcLabelvalue(String)
	 * @see IFC2X3.IFC2X3Package#getIfcConditionCriterionSelect_IfcLabelvalue()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getIfcLabelvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConditionCriterionSelect#getIfcLabelvalue <em>Ifc Labelvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Labelvalue</em>' attribute.
	 * @see #isSetIfcLabelvalue()
	 * @see #unsetIfcLabelvalue()
	 * @see #getIfcLabelvalue()
	 * @generated
	 */
	void setIfcLabelvalue(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcConditionCriterionSelect#getIfcLabelvalue <em>Ifc Labelvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcLabelvalue()
	 * @see #getIfcLabelvalue()
	 * @see #setIfcLabelvalue(String)
	 * @generated
	 */
	void unsetIfcLabelvalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConditionCriterionSelect#getIfcLabelvalue <em>Ifc Labelvalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Labelvalue</em>' attribute is set.
	 * @see #unsetIfcLabelvalue()
	 * @see #getIfcLabelvalue()
	 * @see #setIfcLabelvalue(String)
	 * @generated
	 */
	boolean isSetIfcLabelvalue();

	/**
	 * Returns the value of the '<em><b>Ifc Measure With Unitvalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Measure With Unitvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Measure With Unitvalue</em>' reference.
	 * @see #setIfcMeasureWithUnitvalue(IfcMeasureWithUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcConditionCriterionSelect_IfcMeasureWithUnitvalue()
	 * @model
	 * @generated
	 */
	IfcMeasureWithUnit getIfcMeasureWithUnitvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConditionCriterionSelect#getIfcMeasureWithUnitvalue <em>Ifc Measure With Unitvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Measure With Unitvalue</em>' reference.
	 * @see #getIfcMeasureWithUnitvalue()
	 * @generated
	 */
	void setIfcMeasureWithUnitvalue(IfcMeasureWithUnit value);

} // IfcConditionCriterionSelect
