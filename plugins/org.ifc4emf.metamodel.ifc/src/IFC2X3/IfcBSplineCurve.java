/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcBSplineCurveImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc BSpline Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcBSplineCurve#getDegree <em>Degree</em>}</li>
 *   <li>{@link IFC2X3.IfcBSplineCurve#getControlPointsList <em>Control Points List</em>}</li>
 *   <li>{@link IFC2X3.IfcBSplineCurve#getCurveForm <em>Curve Form</em>}</li>
 *   <li>{@link IFC2X3.IfcBSplineCurve#getClosedCurve <em>Closed Curve</em>}</li>
 *   <li>{@link IFC2X3.IfcBSplineCurve#getSelfIntersect <em>Self Intersect</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcBSplineCurve()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBSplineCurveImplAdapter.class)
public interface IfcBSplineCurve extends IfcBoundedCurve {
	/**
	 * Returns the value of the '<em><b>Control Points List</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcCartesianPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Points List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Points List</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcBSplineCurve_ControlPointsList()
	 * @model lower="2"
	 * @generated
	 */
	EList<IfcCartesianPoint> getControlPointsList();

	/**
	 * Returns the value of the '<em><b>Self Intersect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Intersect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Intersect</em>' attribute.
	 * @see #isSetSelfIntersect()
	 * @see #unsetSelfIntersect()
	 * @see #setSelfIntersect(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcBSplineCurve_SelfIntersect()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	Boolean getSelfIntersect();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBSplineCurve#getSelfIntersect <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Intersect</em>' attribute.
	 * @see #isSetSelfIntersect()
	 * @see #unsetSelfIntersect()
	 * @see #getSelfIntersect()
	 * @generated
	 */
	void setSelfIntersect(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBSplineCurve#getSelfIntersect <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelfIntersect()
	 * @see #getSelfIntersect()
	 * @see #setSelfIntersect(Boolean)
	 * @generated
	 */
	void unsetSelfIntersect();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBSplineCurve#getSelfIntersect <em>Self Intersect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Self Intersect</em>' attribute is set.
	 * @see #unsetSelfIntersect()
	 * @see #getSelfIntersect()
	 * @see #setSelfIntersect(Boolean)
	 * @generated
	 */
	boolean isSetSelfIntersect();

	/**
	 * Returns the value of the '<em><b>Closed Curve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed Curve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Curve</em>' attribute.
	 * @see #isSetClosedCurve()
	 * @see #unsetClosedCurve()
	 * @see #setClosedCurve(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcBSplineCurve_ClosedCurve()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	Boolean getClosedCurve();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBSplineCurve#getClosedCurve <em>Closed Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed Curve</em>' attribute.
	 * @see #isSetClosedCurve()
	 * @see #unsetClosedCurve()
	 * @see #getClosedCurve()
	 * @generated
	 */
	void setClosedCurve(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBSplineCurve#getClosedCurve <em>Closed Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClosedCurve()
	 * @see #getClosedCurve()
	 * @see #setClosedCurve(Boolean)
	 * @generated
	 */
	void unsetClosedCurve();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBSplineCurve#getClosedCurve <em>Closed Curve</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Closed Curve</em>' attribute is set.
	 * @see #unsetClosedCurve()
	 * @see #getClosedCurve()
	 * @see #setClosedCurve(Boolean)
	 * @generated
	 */
	boolean isSetClosedCurve();

	/**
	 * Returns the value of the '<em><b>Curve Form</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcBSplineCurveForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Form</em>' attribute.
	 * @see IFC2X3.IfcBSplineCurveForm
	 * @see #isSetCurveForm()
	 * @see #unsetCurveForm()
	 * @see #setCurveForm(IfcBSplineCurveForm)
	 * @see IFC2X3.IFC2X3Package#getIfcBSplineCurve_CurveForm()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcBSplineCurveForm getCurveForm();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBSplineCurve#getCurveForm <em>Curve Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Form</em>' attribute.
	 * @see IFC2X3.IfcBSplineCurveForm
	 * @see #isSetCurveForm()
	 * @see #unsetCurveForm()
	 * @see #getCurveForm()
	 * @generated
	 */
	void setCurveForm(IfcBSplineCurveForm value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBSplineCurve#getCurveForm <em>Curve Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurveForm()
	 * @see #getCurveForm()
	 * @see #setCurveForm(IfcBSplineCurveForm)
	 * @generated
	 */
	void unsetCurveForm();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBSplineCurve#getCurveForm <em>Curve Form</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Curve Form</em>' attribute is set.
	 * @see #unsetCurveForm()
	 * @see #getCurveForm()
	 * @see #setCurveForm(IfcBSplineCurveForm)
	 * @generated
	 */
	boolean isSetCurveForm();

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see #isSetDegree()
	 * @see #unsetDegree()
	 * @see #setDegree(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcBSplineCurve_Degree()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getDegree();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBSplineCurve#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see #isSetDegree()
	 * @see #unsetDegree()
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBSplineCurve#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDegree()
	 * @see #getDegree()
	 * @see #setDegree(Integer)
	 * @generated
	 */
	void unsetDegree();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBSplineCurve#getDegree <em>Degree</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Degree</em>' attribute is set.
	 * @see #unsetDegree()
	 * @see #getDegree()
	 * @see #setDegree(Integer)
	 * @generated
	 */
	boolean isSetDegree();

} // IfcBSplineCurve
