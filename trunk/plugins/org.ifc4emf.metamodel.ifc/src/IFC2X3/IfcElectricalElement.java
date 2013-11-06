/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcElectricalElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Electrical Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcElectricalElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcElectricalElementImplAdapter.class)
public interface IfcElectricalElement extends IfcElement {
} // IfcElectricalElement
