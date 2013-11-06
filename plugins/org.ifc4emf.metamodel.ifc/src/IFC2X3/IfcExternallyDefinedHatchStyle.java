/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcExternallyDefinedHatchStyleImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Externally Defined Hatch Style</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcExternallyDefinedHatchStyle()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcExternallyDefinedHatchStyleImplAdapter.class)
public interface IfcExternallyDefinedHatchStyle extends IfcFillStyleSelect, IfcExternalReference {
} // IfcExternallyDefinedHatchStyle
