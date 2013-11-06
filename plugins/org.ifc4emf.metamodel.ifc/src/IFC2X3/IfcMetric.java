/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcMetricImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMetric#getBenchmark <em>Benchmark</em>}</li>
 *   <li>{@link IFC2X3.IfcMetric#getValueSource <em>Value Source</em>}</li>
 *   <li>{@link IFC2X3.IfcMetric#getDataValue <em>Data Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMetric()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMetricImplAdapter.class)
public interface IfcMetric extends IfcConstraint {
	/**
	 * Returns the value of the '<em><b>Data Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Value</em>' containment reference.
	 * @see #setDataValue(IfcMetricValueSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcMetric_DataValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IfcMetricValueSelect getDataValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMetric#getDataValue <em>Data Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Value</em>' containment reference.
	 * @see #getDataValue()
	 * @generated
	 */
	void setDataValue(IfcMetricValueSelect value);

	/**
	 * Returns the value of the '<em><b>Value Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Source</em>' attribute.
	 * @see #isSetValueSource()
	 * @see #unsetValueSource()
	 * @see #setValueSource(String)
	 * @see IFC2X3.IFC2X3Package#getIfcMetric_ValueSource()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getValueSource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMetric#getValueSource <em>Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Source</em>' attribute.
	 * @see #isSetValueSource()
	 * @see #unsetValueSource()
	 * @see #getValueSource()
	 * @generated
	 */
	void setValueSource(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMetric#getValueSource <em>Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueSource()
	 * @see #getValueSource()
	 * @see #setValueSource(String)
	 * @generated
	 */
	void unsetValueSource();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMetric#getValueSource <em>Value Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Source</em>' attribute is set.
	 * @see #unsetValueSource()
	 * @see #getValueSource()
	 * @see #setValueSource(String)
	 * @generated
	 */
	boolean isSetValueSource();

	/**
	 * Returns the value of the '<em><b>Benchmark</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcBenchmarkEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benchmark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benchmark</em>' attribute.
	 * @see IFC2X3.IfcBenchmarkEnum
	 * @see #isSetBenchmark()
	 * @see #unsetBenchmark()
	 * @see #setBenchmark(IfcBenchmarkEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcMetric_Benchmark()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcBenchmarkEnum getBenchmark();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMetric#getBenchmark <em>Benchmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benchmark</em>' attribute.
	 * @see IFC2X3.IfcBenchmarkEnum
	 * @see #isSetBenchmark()
	 * @see #unsetBenchmark()
	 * @see #getBenchmark()
	 * @generated
	 */
	void setBenchmark(IfcBenchmarkEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMetric#getBenchmark <em>Benchmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBenchmark()
	 * @see #getBenchmark()
	 * @see #setBenchmark(IfcBenchmarkEnum)
	 * @generated
	 */
	void unsetBenchmark();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMetric#getBenchmark <em>Benchmark</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Benchmark</em>' attribute is set.
	 * @see #unsetBenchmark()
	 * @see #getBenchmark()
	 * @see #setBenchmark(IfcBenchmarkEnum)
	 * @generated
	 */
	boolean isSetBenchmark();

} // IfcMetric
