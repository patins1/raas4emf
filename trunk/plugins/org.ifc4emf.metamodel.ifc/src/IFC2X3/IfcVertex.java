/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcVertexImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcVertex()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcVertexImplAdapter.class)
public interface IfcVertex extends IfcTopologicalRepresentationItem {
} // IfcVertex
