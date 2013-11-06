/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBoundedCurveImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Bounded Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcBoundedCurve()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBoundedCurveImplAdapter.class)
public interface IfcBoundedCurve extends IfcCurveOrEdgeCurve, IfcCurve {
} // IfcBoundedCurve
