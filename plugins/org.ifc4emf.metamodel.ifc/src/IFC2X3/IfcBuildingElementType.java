/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBuildingElementTypeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Building Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcBuildingElementType()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBuildingElementTypeImplAdapter.class)
public interface IfcBuildingElementType extends IfcElementType {
} // IfcBuildingElementType
