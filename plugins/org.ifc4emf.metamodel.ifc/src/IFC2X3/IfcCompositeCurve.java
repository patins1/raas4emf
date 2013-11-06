/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcCompositeCurveImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Composite Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCompositeCurve#getSegments <em>Segments</em>}</li>
 *   <li>{@link IFC2X3.IfcCompositeCurve#getSelfIntersect <em>Self Intersect</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCompositeCurve()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCompositeCurveImplAdapter.class)
public interface IfcCompositeCurve extends IfcBoundedCurve {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcCompositeCurveSegment}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcCompositeCurveSegment#getUsingCurves <em>Using Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcCompositeCurve_Segments()
	 * @see IFC2X3.IfcCompositeCurveSegment#getUsingCurves
	 * @model opposite="UsingCurves" required="true"
	 * @generated
	 */
	EList<IfcCompositeCurveSegment> getSegments();

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
	 * @see IFC2X3.IFC2X3Package#getIfcCompositeCurve_SelfIntersect()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	Boolean getSelfIntersect();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCompositeCurve#getSelfIntersect <em>Self Intersect</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcCompositeCurve#getSelfIntersect <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelfIntersect()
	 * @see #getSelfIntersect()
	 * @see #setSelfIntersect(Boolean)
	 * @generated
	 */
	void unsetSelfIntersect();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCompositeCurve#getSelfIntersect <em>Self Intersect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Self Intersect</em>' attribute is set.
	 * @see #unsetSelfIntersect()
	 * @see #getSelfIntersect()
	 * @see #setSelfIntersect(Boolean)
	 * @generated
	 */
	boolean isSetSelfIntersect();

} // IfcCompositeCurve
