/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBuildingElementComponentImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Building Element Component</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcBuildingElementComponent()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBuildingElementComponentImplAdapter.class)
public interface IfcBuildingElementComponent extends IfcBuildingElement {
} // IfcBuildingElementComponent