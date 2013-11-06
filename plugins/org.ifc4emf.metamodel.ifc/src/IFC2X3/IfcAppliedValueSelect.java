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

import IFC2X3.jaxb.IfcAppliedValueSelectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Applied Value Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcAppliedValueSelect#getIfcMonetaryMeasurevalue <em>Ifc Monetary Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValueSelect#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcAppliedValueSelect#getIfcMeasureWithUnitvalue <em>Ifc Measure With Unitvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcAppliedValueSelect()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcAppliedValueSelectImplAdapter.class)
public interface IfcAppliedValueSelect extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Ifc Monetary Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Monetary Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Monetary Measurevalue</em>' attribute.
	 * @see #isSetIfcMonetaryMeasurevalue()
	 * @see #unsetIfcMonetaryMeasurevalue()
	 * @see #setIfcMonetaryMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValueSelect_IfcMonetaryMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcMonetaryMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValueSelect#getIfcMonetaryMeasurevalue <em>Ifc Monetary Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Monetary Measurevalue</em>' attribute.
	 * @see #isSetIfcMonetaryMeasurevalue()
	 * @see #unsetIfcMonetaryMeasurevalue()
	 * @see #getIfcMonetaryMeasurevalue()
	 * @generated
	 */
	void setIfcMonetaryMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAppliedValueSelect#getIfcMonetaryMeasurevalue <em>Ifc Monetary Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcMonetaryMeasurevalue()
	 * @see #getIfcMonetaryMeasurevalue()
	 * @see #setIfcMonetaryMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcMonetaryMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAppliedValueSelect#getIfcMonetaryMeasurevalue <em>Ifc Monetary Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Monetary Measurevalue</em>' attribute is set.
	 * @see #unsetIfcMonetaryMeasurevalue()
	 * @see #getIfcMonetaryMeasurevalue()
	 * @see #setIfcMonetaryMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcMonetaryMeasurevalue();

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
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValueSelect_IfcRatioMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcRatioMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValueSelect#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcAppliedValueSelect#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcRatioMeasurevalue()
	 * @see #getIfcRatioMeasurevalue()
	 * @see #setIfcRatioMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcRatioMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAppliedValueSelect#getIfcRatioMeasurevalue <em>Ifc Ratio Measurevalue</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Ifc Measure With Unitvalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Measure With Unitvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Measure With Unitvalue</em>' reference.
	 * @see #setIfcMeasureWithUnitvalue(IfcMeasureWithUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcAppliedValueSelect_IfcMeasureWithUnitvalue()
	 * @model
	 * @generated
	 */
	IfcMeasureWithUnit getIfcMeasureWithUnitvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAppliedValueSelect#getIfcMeasureWithUnitvalue <em>Ifc Measure With Unitvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Measure With Unitvalue</em>' reference.
	 * @see #getIfcMeasureWithUnitvalue()
	 * @generated
	 */
	void setIfcMeasureWithUnitvalue(IfcMeasureWithUnit value);

} // IfcAppliedValueSelect
