/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcConnectionCurveGeometryImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connection Curve Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcConnectionCurveGeometry#getCurveOnRelatingElement <em>Curve On Relating Element</em>}</li>
 *   <li>{@link IFC2X3.IfcConnectionCurveGeometry#getCurveOnRelatedElement <em>Curve On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcConnectionCurveGeometry()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcConnectionCurveGeometryImplAdapter.class)
public interface IfcConnectionCurveGeometry extends IfcConnectionGeometry {
	/**
	 * Returns the value of the '<em><b>Curve On Relating Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve On Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve On Relating Element</em>' reference.
	 * @see #setCurveOnRelatingElement(IfcCurveOrEdgeCurve)
	 * @see IFC2X3.IFC2X3Package#getIfcConnectionCurveGeometry_CurveOnRelatingElement()
	 * @model required="true"
	 * @generated
	 */
	IfcCurveOrEdgeCurve getCurveOnRelatingElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConnectionCurveGeometry#getCurveOnRelatingElement <em>Curve On Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve On Relating Element</em>' reference.
	 * @see #getCurveOnRelatingElement()
	 * @generated
	 */
	void setCurveOnRelatingElement(IfcCurveOrEdgeCurve value);

	/**
	 * Returns the value of the '<em><b>Curve On Related Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve On Related Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve On Related Element</em>' reference.
	 * @see #setCurveOnRelatedElement(IfcCurveOrEdgeCurve)
	 * @see IFC2X3.IFC2X3Package#getIfcConnectionCurveGeometry_CurveOnRelatedElement()
	 * @model
	 * @generated
	 */
	IfcCurveOrEdgeCurve getCurveOnRelatedElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConnectionCurveGeometry#getCurveOnRelatedElement <em>Curve On Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve On Related Element</em>' reference.
	 * @see #getCurveOnRelatedElement()
	 * @generated
	 */
	void setCurveOnRelatedElement(IfcCurveOrEdgeCurve value);

} // IfcConnectionCurveGeometry
