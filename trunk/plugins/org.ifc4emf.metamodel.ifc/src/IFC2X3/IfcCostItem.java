/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCostItemImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cost Item</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcCostItem()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCostItemImplAdapter.class)
public interface IfcCostItem extends IfcControl {
} // IfcCostItem
