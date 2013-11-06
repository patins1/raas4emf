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

import IFC2X3.jaxb.IfcMetricValueSelectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Metric Value Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMetricValueSelect#getIfcDateTimeSelectvalue <em>Ifc Date Time Selectvalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMetricValueSelect#getIfcTextvalue <em>Ifc Textvalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMetricValueSelect#getIfcCostValuevalue <em>Ifc Cost Valuevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMetricValueSelect#getIfcTimeSeriesvalue <em>Ifc Time Seriesvalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMetricValueSelect#getIfcTablevalue <em>Ifc Tablevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcMetricValueSelect#getIfcMeasureWithUnitvalue <em>Ifc Measure With Unitvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMetricValueSelect()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcMetricValueSelectImplAdapter.class)
public interface IfcMetricValueSelect extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Ifc Date Time Selectvalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Date Time Selectvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Date Time Selectvalue</em>' reference.
	 * @see #setIfcDateTimeSelectvalue(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcMetricValueSelect_IfcDateTimeSelectvalue()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getIfcDateTimeSelectvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMetricValueSelect#getIfcDateTimeSelectvalue <em>Ifc Date Time Selectvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Date Time Selectvalue</em>' reference.
	 * @see #getIfcDateTimeSelectvalue()
	 * @generated
	 */
	void setIfcDateTimeSelectvalue(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Ifc Textvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Textvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Textvalue</em>' attribute.
	 * @see #isSetIfcTextvalue()
	 * @see #unsetIfcTextvalue()
	 * @see #setIfcTextvalue(String)
	 * @see IFC2X3.IFC2X3Package#getIfcMetricValueSelect_IfcTextvalue()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getIfcTextvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMetricValueSelect#getIfcTextvalue <em>Ifc Textvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Textvalue</em>' attribute.
	 * @see #isSetIfcTextvalue()
	 * @see #unsetIfcTextvalue()
	 * @see #getIfcTextvalue()
	 * @generated
	 */
	void setIfcTextvalue(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMetricValueSelect#getIfcTextvalue <em>Ifc Textvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcTextvalue()
	 * @see #getIfcTextvalue()
	 * @see #setIfcTextvalue(String)
	 * @generated
	 */
	void unsetIfcTextvalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMetricValueSelect#getIfcTextvalue <em>Ifc Textvalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Textvalue</em>' attribute is set.
	 * @see #unsetIfcTextvalue()
	 * @see #getIfcTextvalue()
	 * @see #setIfcTextvalue(String)
	 * @generated
	 */
	boolean isSetIfcTextvalue();

	/**
	 * Returns the value of the '<em><b>Ifc Time Seriesvalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Time Seriesvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Time Seriesvalue</em>' reference.
	 * @see #setIfcTimeSeriesvalue(IfcTimeSeries)
	 * @see IFC2X3.IFC2X3Package#getIfcMetricValueSelect_IfcTimeSeriesvalue()
	 * @model
	 * @generated
	 */
	IfcTimeSeries getIfcTimeSeriesvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMetricValueSelect#getIfcTimeSeriesvalue <em>Ifc Time Seriesvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Time Seriesvalue</em>' reference.
	 * @see #getIfcTimeSeriesvalue()
	 * @generated
	 */
	void setIfcTimeSeriesvalue(IfcTimeSeries value);

	/**
	 * Returns the value of the '<em><b>Ifc Tablevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Tablevalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Tablevalue</em>' reference.
	 * @see #setIfcTablevalue(IfcTable)
	 * @see IFC2X3.IFC2X3Package#getIfcMetricValueSelect_IfcTablevalue()
	 * @model
	 * @generated
	 */
	IfcTable getIfcTablevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMetricValueSelect#getIfcTablevalue <em>Ifc Tablevalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Tablevalue</em>' reference.
	 * @see #getIfcTablevalue()
	 * @generated
	 */
	void setIfcTablevalue(IfcTable value);

	/**
	 * Returns the value of the '<em><b>Ifc Cost Valuevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Cost Valuevalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Cost Valuevalue</em>' reference.
	 * @see #setIfcCostValuevalue(IfcCostValue)
	 * @see IFC2X3.IFC2X3Package#getIfcMetricValueSelect_IfcCostValuevalue()
	 * @model
	 * @generated
	 */
	IfcCostValue getIfcCostValuevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMetricValueSelect#getIfcCostValuevalue <em>Ifc Cost Valuevalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Cost Valuevalue</em>' reference.
	 * @see #getIfcCostValuevalue()
	 * @generated
	 */
	void setIfcCostValuevalue(IfcCostValue value);

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
	 * @see IFC2X3.IFC2X3Package#getIfcMetricValueSelect_IfcMeasureWithUnitvalue()
	 * @model
	 * @generated
	 */
	IfcMeasureWithUnit getIfcMeasureWithUnitvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMetricValueSelect#getIfcMeasureWithUnitvalue <em>Ifc Measure With Unitvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Measure With Unitvalue</em>' reference.
	 * @see #getIfcMeasureWithUnitvalue()
	 * @generated
	 */
	void setIfcMeasureWithUnitvalue(IfcMeasureWithUnit value);

} // IfcMetricValueSelect
