/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcExternallyDefinedSymbolImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Externally Defined Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcExternallyDefinedSymbol()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcExternallyDefinedSymbolImplAdapter.class)
public interface IfcExternallyDefinedSymbol extends IfcDefinedSymbolSelect, IfcExternalReference {
} // IfcExternallyDefinedSymbol
