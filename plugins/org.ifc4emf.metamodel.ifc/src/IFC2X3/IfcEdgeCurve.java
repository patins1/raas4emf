/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcEdgeCurveImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Edge Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcEdgeCurve#getEdgeGeometry <em>Edge Geometry</em>}</li>
 *   <li>{@link IFC2X3.IfcEdgeCurve#getSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcEdgeCurve()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcEdgeCurveImplAdapter.class)
public interface IfcEdgeCurve extends IfcCurveOrEdgeCurve, IfcEdge {
	/**
	 * Returns the value of the '<em><b>Edge Geometry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Geometry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Geometry</em>' reference.
	 * @see #setEdgeGeometry(IfcCurve)
	 * @see IFC2X3.IFC2X3Package#getIfcEdgeCurve_EdgeGeometry()
	 * @model required="true"
	 * @generated
	 */
	IfcCurve getEdgeGeometry();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcEdgeCurve#getEdgeGeometry <em>Edge Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Geometry</em>' reference.
	 * @see #getEdgeGeometry()
	 * @generated
	 */
	void setEdgeGeometry(IfcCurve value);

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
	 * @see IFC2X3.IFC2X3Package#getIfcEdgeCurve_SameSense()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getSameSense();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcEdgeCurve#getSameSense <em>Same Sense</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcEdgeCurve#getSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSameSense()
	 * @see #getSameSense()
	 * @see #setSameSense(Boolean)
	 * @generated
	 */
	void unsetSameSense();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcEdgeCurve#getSameSense <em>Same Sense</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Same Sense</em>' attribute is set.
	 * @see #unsetSameSense()
	 * @see #getSameSense()
	 * @see #setSameSense(Boolean)
	 * @generated
	 */
	boolean isSetSameSense();

} // IfcEdgeCurve
