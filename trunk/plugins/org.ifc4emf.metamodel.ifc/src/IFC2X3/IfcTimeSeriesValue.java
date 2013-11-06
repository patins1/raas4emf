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

import IFC2X3.jaxb.IfcTimeSeriesValueImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Time Series Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTimeSeriesValue#getListValues <em>List Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTimeSeriesValue()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcTimeSeriesValueImplAdapter.class)
public interface IfcTimeSeriesValue extends CDOObject {
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
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeriesValue_ListValues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IfcValue> getListValues();

} // IfcTimeSeriesValue
