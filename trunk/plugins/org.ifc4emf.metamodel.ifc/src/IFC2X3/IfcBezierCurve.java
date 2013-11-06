/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBezierCurveImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Bezier Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcBezierCurve()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBezierCurveImplAdapter.class)
public interface IfcBezierCurve extends IfcBSplineCurve {
} // IfcBezierCurve
