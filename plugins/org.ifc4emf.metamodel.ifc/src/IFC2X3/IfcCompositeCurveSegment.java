/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcCompositeCurveSegmentImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Composite Curve Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCompositeCurveSegment#getTransition <em>Transition</em>}</li>
 *   <li>{@link IFC2X3.IfcCompositeCurveSegment#getSameSense <em>Same Sense</em>}</li>
 *   <li>{@link IFC2X3.IfcCompositeCurveSegment#getParentCurve <em>Parent Curve</em>}</li>
 *   <li>{@link IFC2X3.IfcCompositeCurveSegment#getUsingCurves <em>Using Curves</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCompositeCurveSegment()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCompositeCurveSegmentImplAdapter.class)
public interface IfcCompositeCurveSegment extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Using Curves</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcCompositeCurve}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcCompositeCurve#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Curves</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Curves</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcCompositeCurveSegment_UsingCurves()
	 * @see IFC2X3.IfcCompositeCurve#getSegments
	 * @model opposite="Segments" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcCompositeCurve> getUsingCurves();

	/**
	 * Returns the value of the '<em><b>Parent Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Curve</em>' reference.
	 * @see #setParentCurve(IfcCurve)
	 * @see IFC2X3.IFC2X3Package#getIfcCompositeCurveSegment_ParentCurve()
	 * @model required="true"
	 * @generated
	 */
	IfcCurve getParentCurve();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCompositeCurveSegment#getParentCurve <em>Parent Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Curve</em>' reference.
	 * @see #getParentCurve()
	 * @generated
	 */
	void setParentCurve(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Same Sense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Sense</em>' attribute.
	 * @see #isSetSameSense()
	 * @see #unsetSameSense()
	 * @see #setSameSense(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcCompositeCurveSegment_SameSense()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getSameSense();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCompositeCurveSegment#getSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Sense</em>' attribute.
	 * @see #isSetSameSense()
	 * @see #unsetSameSense()
	 * @see #getSameSense()
	 * @generated
	 */
	void setSameSense(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCompositeCurveSegment#getSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSameSense()
	 * @see #getSameSense()
	 * @see #setSameSense(Boolean)
	 * @generated
	 */
	void unsetSameSense();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCompositeCurveSegment#getSameSense <em>Same Sense</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Same Sense</em>' attribute is set.
	 * @see #unsetSameSense()
	 * @see #getSameSense()
	 * @see #setSameSense(Boolean)
	 * @generated
	 */
	boolean isSetSameSense();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcTransitionCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' attribute.
	 * @see IFC2X3.IfcTransitionCode
	 * @see #isSetTransition()
	 * @see #unsetTransition()
	 * @see #setTransition(IfcTransitionCode)
	 * @see IFC2X3.IFC2X3Package#getIfcCompositeCurveSegment_Transition()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcTransitionCode getTransition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCompositeCurveSegment#getTransition <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' attribute.
	 * @see IFC2X3.IfcTransitionCode
	 * @see #isSetTransition()
	 * @see #unsetTransition()
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(IfcTransitionCode value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCompositeCurveSegment#getTransition <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransition()
	 * @see #getTransition()
	 * @see #setTransition(IfcTransitionCode)
	 * @generated
	 */
	void unsetTransition();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCompositeCurveSegment#getTransition <em>Transition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transition</em>' attribute is set.
	 * @see #unsetTransition()
	 * @see #getTransition()
	 * @see #setTransition(IfcTransitionCode)
	 * @generated
	 */
	boolean isSetTransition();

} // IfcCompositeCurveSegment
