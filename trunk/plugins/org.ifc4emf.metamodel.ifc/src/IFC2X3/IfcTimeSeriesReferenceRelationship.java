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

import IFC2X3.jaxb.IfcTimeSeriesReferenceRelationshipImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Time Series Reference Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTimeSeriesReferenceRelationship#getReferencedTimeSeries <em>Referenced Time Series</em>}</li>
 *   <li>{@link IFC2X3.IfcTimeSeriesReferenceRelationship#getTimeSeriesReferences <em>Time Series References</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTimeSeriesReferenceRelationship()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcTimeSeriesReferenceRelationshipImplAdapter.class)
public interface IfcTimeSeriesReferenceRelationship extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Referenced Time Series</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcTimeSeries#getDocumentedBy <em>Documented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Time Series</em>' reference.
	 * @see #setReferencedTimeSeries(IfcTimeSeries)
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeriesReferenceRelationship_ReferencedTimeSeries()
	 * @see IFC2X3.IfcTimeSeries#getDocumentedBy
	 * @model opposite="DocumentedBy" required="true"
	 * @generated
	 */
	IfcTimeSeries getReferencedTimeSeries();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTimeSeriesReferenceRelationship#getReferencedTimeSeries <em>Referenced Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Time Series</em>' reference.
	 * @see #getReferencedTimeSeries()
	 * @generated
	 */
	void setReferencedTimeSeries(IfcTimeSeries value);

	/**
	 * Returns the value of the '<em><b>Time Series References</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcDocumentSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series References</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeriesReferenceRelationship_TimeSeriesReferences()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcDocumentSelect> getTimeSeriesReferences();

} // IfcTimeSeriesReferenceRelationship
