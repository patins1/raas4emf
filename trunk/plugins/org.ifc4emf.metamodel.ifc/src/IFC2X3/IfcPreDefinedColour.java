/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPreDefinedColourImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Pre Defined Colour</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcPreDefinedColour()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPreDefinedColourImplAdapter.class)
public interface IfcPreDefinedColour extends IfcColour, IfcPreDefinedItem {
} // IfcPreDefinedColour
