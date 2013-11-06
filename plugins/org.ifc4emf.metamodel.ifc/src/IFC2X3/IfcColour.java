/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcColourImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Colour</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcColour()
 * @model abstract="true"
 * @generated
 */
@XmlJavaTypeAdapter(IfcColourImplAdapter.class)
public interface IfcColour extends IfcFillStyleSelect, IfcSymbolStyleSelect {
} // IfcColour
