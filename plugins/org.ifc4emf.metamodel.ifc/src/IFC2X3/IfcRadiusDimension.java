/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRadiusDimensionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Radius Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcRadiusDimension()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRadiusDimensionImplAdapter.class)
public interface IfcRadiusDimension extends IfcDimensionCurveDirectedCallout {
} // IfcRadiusDimension
