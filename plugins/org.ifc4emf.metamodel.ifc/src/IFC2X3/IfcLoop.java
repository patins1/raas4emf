/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcLoopImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcLoop()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcLoopImplAdapter.class)
public interface IfcLoop extends IfcTopologicalRepresentationItem {
} // IfcLoop
