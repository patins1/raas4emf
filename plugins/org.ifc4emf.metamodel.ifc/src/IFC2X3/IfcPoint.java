/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPointImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Point</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcPoint()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPointImplAdapter.class)
public interface IfcPoint extends IfcGeometricSetSelect, IfcPointOrVertexPoint, IfcGeometricRepresentationItem {
} // IfcPoint
