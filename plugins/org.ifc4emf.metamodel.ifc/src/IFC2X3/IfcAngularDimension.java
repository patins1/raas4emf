/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcAngularDimensionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Angular Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcAngularDimension()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAngularDimensionImplAdapter.class)
public interface IfcAngularDimension extends IfcDimensionCurveDirectedCallout {
} // IfcAngularDimension
