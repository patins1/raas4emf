/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcCurveStyleFontPatternImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve Style Font Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCurveStyleFontPattern#getVisibleSegmentLength <em>Visible Segment Length</em>}</li>
 *   <li>{@link IFC2X3.IfcCurveStyleFontPattern#getInvisibleSegmentLength <em>Invisible Segment Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCurveStyleFontPattern()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcCurveStyleFontPatternImplAdapter.class)
public interface IfcCurveStyleFontPattern extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Invisible Segment Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invisible Segment Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invisible Segment Length</em>' attribute.
	 * @see #isSetInvisibleSegmentLength()
	 * @see #unsetInvisibleSegmentLength()
	 * @see #setInvisibleSegmentLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCurveStyleFontPattern_InvisibleSegmentLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getInvisibleSegmentLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurveStyleFontPattern#getInvisibleSegmentLength <em>Invisible Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invisible Segment Length</em>' attribute.
	 * @see #isSetInvisibleSegmentLength()
	 * @see #unsetInvisibleSegmentLength()
	 * @see #getInvisibleSegmentLength()
	 * @generated
	 */
	void setInvisibleSegmentLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCurveStyleFontPattern#getInvisibleSegmentLength <em>Invisible Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInvisibleSegmentLength()
	 * @see #getInvisibleSegmentLength()
	 * @see #setInvisibleSegmentLength(Double)
	 * @generated
	 */
	void unsetInvisibleSegmentLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCurveStyleFontPattern#getInvisibleSegmentLength <em>Invisible Segment Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Invisible Segment Length</em>' attribute is set.
	 * @see #unsetInvisibleSegmentLength()
	 * @see #getInvisibleSegmentLength()
	 * @see #setInvisibleSegmentLength(Double)
	 * @generated
	 */
	boolean isSetInvisibleSegmentLength();

	/**
	 * Returns the value of the '<em><b>Visible Segment Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Segment Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Segment Length</em>' attribute.
	 * @see #isSetVisibleSegmentLength()
	 * @see #unsetVisibleSegmentLength()
	 * @see #setVisibleSegmentLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCurveStyleFontPattern_VisibleSegmentLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getVisibleSegmentLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurveStyleFontPattern#getVisibleSegmentLength <em>Visible Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Segment Length</em>' attribute.
	 * @see #isSetVisibleSegmentLength()
	 * @see #unsetVisibleSegmentLength()
	 * @see #getVisibleSegmentLength()
	 * @generated
	 */
	void setVisibleSegmentLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCurveStyleFontPattern#getVisibleSegmentLength <em>Visible Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibleSegmentLength()
	 * @see #getVisibleSegmentLength()
	 * @see #setVisibleSegmentLength(Double)
	 * @generated
	 */
	void unsetVisibleSegmentLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCurveStyleFontPattern#getVisibleSegmentLength <em>Visible Segment Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible Segment Length</em>' attribute is set.
	 * @see #unsetVisibleSegmentLength()
	 * @see #getVisibleSegmentLength()
	 * @see #setVisibleSegmentLength(Double)
	 * @generated
	 */
	boolean isSetVisibleSegmentLength();

} // IfcCurveStyleFontPattern
