/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPreDefinedSymbolImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Pre Defined Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcPreDefinedSymbol()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPreDefinedSymbolImplAdapter.class)
public interface IfcPreDefinedSymbol extends IfcDefinedSymbolSelect, IfcPreDefinedItem {
} // IfcPreDefinedSymbol
