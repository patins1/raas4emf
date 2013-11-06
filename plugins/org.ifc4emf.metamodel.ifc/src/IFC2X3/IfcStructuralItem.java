/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralItemImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Item</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralItem()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralItemImplAdapter.class)
public interface IfcStructuralItem extends IfcStructuralActivityAssignmentSelect, IfcProduct {
} // IfcStructuralItem
