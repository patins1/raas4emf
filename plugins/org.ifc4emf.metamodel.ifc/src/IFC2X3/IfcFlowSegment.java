/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcFlowSegmentImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Flow Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcFlowSegment()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFlowSegmentImplAdapter.class)
public interface IfcFlowSegment extends IfcDistributionFlowElement {
} // IfcFlowSegment
