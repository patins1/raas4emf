/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcIrregularTimeSeriesValueImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Irregular Time Series Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcIrregularTimeSeriesValue#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link IFC2X3.IfcIrregularTimeSeriesValue#getListValues <em>List Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcIrregularTimeSeriesValue()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcIrregularTimeSeriesValueImplAdapter.class)
public interface IfcIrregularTimeSeriesValue extends CDOObject {
	/**
	 * Returns the value of the '<em><b>List Values</b></em>' containment reference list.
	 * The list contents are of type {@link IFC2X3.IfcValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Values</em>' containment reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcIrregularTimeSeriesValue_ListValues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IfcValue> getListValues();

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' reference.
	 * @see #setTimeStamp(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcIrregularTimeSeriesValue_TimeStamp()
	 * @model required="true"
	 * @generated
	 */
	IfcDateTimeSelect getTimeStamp();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcIrregularTimeSeriesValue#getTimeStamp <em>Time Stamp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IfcDateTimeSelect value);

} // IfcIrregularTimeSeriesValue
