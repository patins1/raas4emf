/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcCartesianPointImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cartesian Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCartesianPoint#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCartesianPoint()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCartesianPointImplAdapter.class)
public interface IfcCartesianPoint extends IfcPoint {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcCartesianPoint_Coordinates()
	 * @model unique="false" dataType="IFC2X3.REAL" required="true" upper="3"
	 * @generated
	 */
	EList<Double> getCoordinates();

} // IfcCartesianPoint
