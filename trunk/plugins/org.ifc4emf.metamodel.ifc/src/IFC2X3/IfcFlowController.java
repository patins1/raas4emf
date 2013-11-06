/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcFlowControllerImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Flow Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcFlowController()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFlowControllerImplAdapter.class)
public interface IfcFlowController extends IfcDistributionFlowElement {
} // IfcFlowController
