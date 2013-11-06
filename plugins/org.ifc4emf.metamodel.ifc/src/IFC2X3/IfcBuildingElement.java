/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBuildingElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Building Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcBuildingElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBuildingElementImplAdapter.class)
public interface IfcBuildingElement extends IfcElement {
} // IfcBuildingElement
