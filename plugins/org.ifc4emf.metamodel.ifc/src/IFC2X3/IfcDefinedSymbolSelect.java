/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcDefinedSymbolSelectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Defined Symbol Select</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcDefinedSymbolSelect()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcDefinedSymbolSelectImplAdapter.class)
public interface IfcDefinedSymbolSelect extends CDOObject {
} // IfcDefinedSymbolSelect
