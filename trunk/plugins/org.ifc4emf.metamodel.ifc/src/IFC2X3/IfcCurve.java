/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCurveImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcCurve()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCurveImplAdapter.class)
public interface IfcCurve extends IfcGeometricSetSelect, IfcGeometricRepresentationItem {
} // IfcCurve
