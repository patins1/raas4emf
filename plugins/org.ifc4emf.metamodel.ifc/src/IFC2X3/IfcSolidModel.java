/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSolidModelImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Solid Model</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcSolidModel()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSolidModelImplAdapter.class)
public interface IfcSolidModel extends IfcBooleanOperand, IfcGeometricRepresentationItem {
} // IfcSolidModel
