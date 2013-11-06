/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcColumnImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Column</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcColumn()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcColumnImplAdapter.class)
public interface IfcColumn extends IfcBuildingElement {
} // IfcColumn
