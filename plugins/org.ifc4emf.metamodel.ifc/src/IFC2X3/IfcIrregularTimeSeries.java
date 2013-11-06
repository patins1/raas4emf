/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcIrregularTimeSeriesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Irregular Time Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcIrregularTimeSeries#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcIrregularTimeSeries()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcIrregularTimeSeriesImplAdapter.class)
public interface IfcIrregularTimeSeries extends IfcTimeSeries {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcIrregularTimeSeriesValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcIrregularTimeSeries_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<IfcIrregularTimeSeriesValue> getValues();

} // IfcIrregularTimeSeries
