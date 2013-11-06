/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPreDefinedCurveFontImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Pre Defined Curve Font</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcPreDefinedCurveFont()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPreDefinedCurveFontImplAdapter.class)
public interface IfcPreDefinedCurveFont extends IfcCurveStyleFontSelect, IfcPreDefinedItem {
} // IfcPreDefinedCurveFont
