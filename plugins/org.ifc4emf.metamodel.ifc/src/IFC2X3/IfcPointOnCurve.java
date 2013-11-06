/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPointOnCurveImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Point On Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPointOnCurve#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link IFC2X3.IfcPointOnCurve#getPointParameter <em>Point Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPointOnCurve()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPointOnCurveImplAdapter.class)
public interface IfcPointOnCurve extends IfcPoint {
	/**
	 * Returns the value of the '<em><b>Basis Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Curve</em>' reference.
	 * @see #setBasisCurve(IfcCurve)
	 * @see IFC2X3.IFC2X3Package#getIfcPointOnCurve_BasisCurve()
	 * @model required="true"
	 * @generated
	 */
	IfcCurve getBasisCurve();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPointOnCurve#getBasisCurve <em>Basis Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Curve</em>' reference.
	 * @see #getBasisCurve()
	 * @generated
	 */
	void setBasisCurve(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Point Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Parameter</em>' attribute.
	 * @see #isSetPointParameter()
	 * @see #unsetPointParameter()
	 * @see #setPointParameter(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcPointOnCurve_PointParameter()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getPointParameter();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPointOnCurve#getPointParameter <em>Point Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Parameter</em>' attribute.
	 * @see #isSetPointParameter()
	 * @see #unsetPointParameter()
	 * @see #getPointParameter()
	 * @generated
	 */
	void setPointParameter(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPointOnCurve#getPointParameter <em>Point Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPointParameter()
	 * @see #getPointParameter()
	 * @see #setPointParameter(Double)
	 * @generated
	 */
	void unsetPointParameter();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPointOnCurve#getPointParameter <em>Point Parameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Point Parameter</em>' attribute is set.
	 * @see #unsetPointParameter()
	 * @see #getPointParameter()
	 * @see #setPointParameter(Double)
	 * @generated
	 */
	boolean isSetPointParameter();

} // IfcPointOnCurve
