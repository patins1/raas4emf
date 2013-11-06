/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRegularTimeSeriesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Regular Time Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRegularTimeSeries#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link IFC2X3.IfcRegularTimeSeries#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRegularTimeSeries()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRegularTimeSeriesImplAdapter.class)
public interface IfcRegularTimeSeries extends IfcTimeSeries {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcTimeSeriesValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRegularTimeSeries_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<IfcTimeSeriesValue> getValues();

	/**
	 * Returns the value of the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Step</em>' attribute.
	 * @see #isSetTimeStep()
	 * @see #unsetTimeStep()
	 * @see #setTimeStep(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRegularTimeSeries_TimeStep()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getTimeStep();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRegularTimeSeries#getTimeStep <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Step</em>' attribute.
	 * @see #isSetTimeStep()
	 * @see #unsetTimeStep()
	 * @see #getTimeStep()
	 * @generated
	 */
	void setTimeStep(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRegularTimeSeries#getTimeStep <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeStep()
	 * @see #getTimeStep()
	 * @see #setTimeStep(Double)
	 * @generated
	 */
	void unsetTimeStep();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRegularTimeSeries#getTimeStep <em>Time Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Step</em>' attribute is set.
	 * @see #unsetTimeStep()
	 * @see #getTimeStep()
	 * @see #setTimeStep(Double)
	 * @generated
	 */
	boolean isSetTimeStep();

} // IfcRegularTimeSeries
