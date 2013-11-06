/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcVertexPointImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Vertex Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcVertexPoint#getVertexGeometry <em>Vertex Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcVertexPoint()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcVertexPointImplAdapter.class)
public interface IfcVertexPoint extends IfcPointOrVertexPoint, IfcVertex {
	/**
	 * Returns the value of the '<em><b>Vertex Geometry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex Geometry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex Geometry</em>' reference.
	 * @see #setVertexGeometry(IfcPoint)
	 * @see IFC2X3.IFC2X3Package#getIfcVertexPoint_VertexGeometry()
	 * @model required="true"
	 * @generated
	 */
	IfcPoint getVertexGeometry();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcVertexPoint#getVertexGeometry <em>Vertex Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertex Geometry</em>' reference.
	 * @see #getVertexGeometry()
	 * @generated
	 */
	void setVertexGeometry(IfcPoint value);

} // IfcVertexPoint
