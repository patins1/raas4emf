/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcExternallyDefinedSurfaceStyleImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Externally Defined Surface Style</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcExternallyDefinedSurfaceStyle()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcExternallyDefinedSurfaceStyleImplAdapter.class)
public interface IfcExternallyDefinedSurfaceStyle extends IfcSurfaceStyleElementSelect, IfcExternalReference {
} // IfcExternallyDefinedSurfaceStyle
