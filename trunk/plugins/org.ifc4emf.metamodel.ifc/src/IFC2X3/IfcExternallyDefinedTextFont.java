/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcExternallyDefinedTextFontImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Externally Defined Text Font</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcExternallyDefinedTextFont()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcExternallyDefinedTextFontImplAdapter.class)
public interface IfcExternallyDefinedTextFont extends IfcTextFontSelect, IfcExternalReference {
} // IfcExternallyDefinedTextFont
