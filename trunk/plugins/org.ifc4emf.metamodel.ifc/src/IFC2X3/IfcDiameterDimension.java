/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDiameterDimensionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Diameter Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcDiameterDimension()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDiameterDimensionImplAdapter.class)
public interface IfcDiameterDimension extends IfcDimensionCurveDirectedCallout {
} // IfcDiameterDimension
