/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcOffsetCurve3DImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Offset Curve3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcOffsetCurve3D#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link IFC2X3.IfcOffsetCurve3D#getDistance <em>Distance</em>}</li>
 *   <li>{@link IFC2X3.IfcOffsetCurve3D#getSelfIntersect <em>Self Intersect</em>}</li>
 *   <li>{@link IFC2X3.IfcOffsetCurve3D#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcOffsetCurve3D()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcOffsetCurve3DImplAdapter.class)
public interface IfcOffsetCurve3D extends IfcCurve {
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
	 * @see IFC2X3.IFC2X3Package#getIfcOffsetCurve3D_BasisCurve()
	 * @model required="true"
	 * @generated
	 */
	IfcCurve getBasisCurve();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOffsetCurve3D#getBasisCurve <em>Basis Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Curve</em>' reference.
	 * @see #getBasisCurve()
	 * @generated
	 */
	void setBasisCurve(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Ref Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Direction</em>' reference.
	 * @see #setRefDirection(IfcDirection)
	 * @see IFC2X3.IFC2X3Package#getIfcOffsetCurve3D_RefDirection()
	 * @model required="true"
	 * @generated
	 */
	IfcDirection getRefDirection();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOffsetCurve3D#getRefDirection <em>Ref Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Direction</em>' reference.
	 * @see #getRefDirection()
	 * @generated
	 */
	void setRefDirection(IfcDirection value);

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
	 * @see IFC2X3.IFC2X3Package#getIfcOffsetCurve3D_SelfIntersect()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	Boolean getSelfIntersect();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOffsetCurve3D#getSelfIntersect <em>Self Intersect</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcOffsetCurve3D#getSelfIntersect <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelfIntersect()
	 * @see #getSelfIntersect()
	 * @see #setSelfIntersect(Boolean)
	 * @generated
	 */
	void unsetSelfIntersect();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOffsetCurve3D#getSelfIntersect <em>Self Intersect</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #isSetDistance()
	 * @see #unsetDistance()
	 * @see #setDistance(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcOffsetCurve3D_Distance()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getDistance();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOffsetCurve3D#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #isSetDistance()
	 * @see #unsetDistance()
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOffsetCurve3D#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistance()
	 * @see #getDistance()
	 * @see #setDistance(Double)
	 * @generated
	 */
	void unsetDistance();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOffsetCurve3D#getDistance <em>Distance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance</em>' attribute is set.
	 * @see #unsetDistance()
	 * @see #getDistance()
	 * @see #setDistance(Double)
	 * @generated
	 */
	boolean isSetDistance();

} // IfcOffsetCurve3D
