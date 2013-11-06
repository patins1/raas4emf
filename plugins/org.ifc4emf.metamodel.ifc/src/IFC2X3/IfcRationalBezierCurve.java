/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRationalBezierCurveImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rational Bezier Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRationalBezierCurve#getWeightsData <em>Weights Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRationalBezierCurve()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRationalBezierCurveImplAdapter.class)
public interface IfcRationalBezierCurve extends IfcBezierCurve {
	/**
	 * Returns the value of the '<em><b>Weights Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weights Data</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weights Data</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcRationalBezierCurve_WeightsData()
	 * @model unique="false" dataType="IFC2X3.REAL" lower="2"
	 * @generated
	 */
	EList<Double> getWeightsData();

} // IfcRationalBezierCurve
