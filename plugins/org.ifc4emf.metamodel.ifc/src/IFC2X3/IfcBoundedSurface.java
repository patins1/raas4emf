/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBoundedSurfaceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Bounded Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcBoundedSurface()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBoundedSurfaceImplAdapter.class)
public interface IfcBoundedSurface extends IfcSurface {
} // IfcBoundedSurface
