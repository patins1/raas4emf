/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBeamImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Beam</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcBeam()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBeamImplAdapter.class)
public interface IfcBeam extends IfcBuildingElement {
} // IfcBeam
