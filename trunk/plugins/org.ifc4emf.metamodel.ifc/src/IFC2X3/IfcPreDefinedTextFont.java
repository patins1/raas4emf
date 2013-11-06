/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPreDefinedTextFontImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Pre Defined Text Font</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcPreDefinedTextFont()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPreDefinedTextFontImplAdapter.class)
public interface IfcPreDefinedTextFont extends IfcTextFontSelect, IfcPreDefinedItem {
} // IfcPreDefinedTextFont
