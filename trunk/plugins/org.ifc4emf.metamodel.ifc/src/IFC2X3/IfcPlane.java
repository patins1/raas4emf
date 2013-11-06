/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPlaneImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcPlane()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPlaneImplAdapter.class)
public interface IfcPlane extends IfcElementarySurface {
} // IfcPlane
