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

import IFC2X3.jaxb.IfcVirtualGridIntersectionImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Virtual Grid Intersection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcVirtualGridIntersection#getIntersectingAxes <em>Intersecting Axes</em>}</li>
 *   <li>{@link IFC2X3.IfcVirtualGridIntersection#getOffsetDistances <em>Offset Distances</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcVirtualGridIntersection()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcVirtualGridIntersectionImplAdapter.class)
public interface IfcVirtualGridIntersection extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Intersecting Axes</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcGridAxis}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcGridAxis#getHasIntersections <em>Has Intersections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intersecting Axes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intersecting Axes</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcVirtualGridIntersection_IntersectingAxes()
	 * @see IFC2X3.IfcGridAxis#getHasIntersections
	 * @model opposite="HasIntersections" lower="2" upper="2"
	 * @generated
	 */
	EList<IfcGridAxis> getIntersectingAxes();

	/**
	 * Returns the value of the '<em><b>Offset Distances</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Distances</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Distances</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcVirtualGridIntersection_OffsetDistances()
	 * @model unique="false" dataType="IFC2X3.REAL" lower="2" upper="3"
	 * @generated
	 */
	EList<Double> getOffsetDistances();

} // IfcVirtualGridIntersection
