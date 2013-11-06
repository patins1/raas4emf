/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcLightSourcePositionalImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Source Positional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLightSourcePositional#getPosition <em>Position</em>}</li>
 *   <li>{@link IFC2X3.IfcLightSourcePositional#getRadius <em>Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcLightSourcePositional#getConstantAttenuation <em>Constant Attenuation</em>}</li>
 *   <li>{@link IFC2X3.IfcLightSourcePositional#getDistanceAttenuation <em>Distance Attenuation</em>}</li>
 *   <li>{@link IFC2X3.IfcLightSourcePositional#getQuadricAttenuation <em>Quadric Attenuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLightSourcePositional()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcLightSourcePositionalImplAdapter.class)
public interface IfcLightSourcePositional extends IfcLightSource {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(IfcCartesianPoint)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourcePositional_Position()
	 * @model required="true"
	 * @generated
	 */
	IfcCartesianPoint getPosition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourcePositional#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IfcCartesianPoint value);

	/**
	 * Returns the value of the '<em><b>Quadric Attenuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quadric Attenuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quadric Attenuation</em>' attribute.
	 * @see #isSetQuadricAttenuation()
	 * @see #unsetQuadricAttenuation()
	 * @see #setQuadricAttenuation(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourcePositional_QuadricAttenuation()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getQuadricAttenuation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourcePositional#getQuadricAttenuation <em>Quadric Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quadric Attenuation</em>' attribute.
	 * @see #isSetQuadricAttenuation()
	 * @see #unsetQuadricAttenuation()
	 * @see #getQuadricAttenuation()
	 * @generated
	 */
	void setQuadricAttenuation(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLightSourcePositional#getQuadricAttenuation <em>Quadric Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuadricAttenuation()
	 * @see #getQuadricAttenuation()
	 * @see #setQuadricAttenuation(Double)
	 * @generated
	 */
	void unsetQuadricAttenuation();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLightSourcePositional#getQuadricAttenuation <em>Quadric Attenuation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quadric Attenuation</em>' attribute is set.
	 * @see #unsetQuadricAttenuation()
	 * @see #getQuadricAttenuation()
	 * @see #setQuadricAttenuation(Double)
	 * @generated
	 */
	boolean isSetQuadricAttenuation();

	/**
	 * Returns the value of the '<em><b>Distance Attenuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Attenuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Attenuation</em>' attribute.
	 * @see #isSetDistanceAttenuation()
	 * @see #unsetDistanceAttenuation()
	 * @see #setDistanceAttenuation(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourcePositional_DistanceAttenuation()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getDistanceAttenuation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourcePositional#getDistanceAttenuation <em>Distance Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Attenuation</em>' attribute.
	 * @see #isSetDistanceAttenuation()
	 * @see #unsetDistanceAttenuation()
	 * @see #getDistanceAttenuation()
	 * @generated
	 */
	void setDistanceAttenuation(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLightSourcePositional#getDistanceAttenuation <em>Distance Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistanceAttenuation()
	 * @see #getDistanceAttenuation()
	 * @see #setDistanceAttenuation(Double)
	 * @generated
	 */
	void unsetDistanceAttenuation();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLightSourcePositional#getDistanceAttenuation <em>Distance Attenuation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance Attenuation</em>' attribute is set.
	 * @see #unsetDistanceAttenuation()
	 * @see #getDistanceAttenuation()
	 * @see #setDistanceAttenuation(Double)
	 * @generated
	 */
	boolean isSetDistanceAttenuation();

	/**
	 * Returns the value of the '<em><b>Constant Attenuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Attenuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Attenuation</em>' attribute.
	 * @see #isSetConstantAttenuation()
	 * @see #unsetConstantAttenuation()
	 * @see #setConstantAttenuation(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourcePositional_ConstantAttenuation()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getConstantAttenuation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourcePositional#getConstantAttenuation <em>Constant Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Attenuation</em>' attribute.
	 * @see #isSetConstantAttenuation()
	 * @see #unsetConstantAttenuation()
	 * @see #getConstantAttenuation()
	 * @generated
	 */
	void setConstantAttenuation(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLightSourcePositional#getConstantAttenuation <em>Constant Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstantAttenuation()
	 * @see #getConstantAttenuation()
	 * @see #setConstantAttenuation(Double)
	 * @generated
	 */
	void unsetConstantAttenuation();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLightSourcePositional#getConstantAttenuation <em>Constant Attenuation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constant Attenuation</em>' attribute is set.
	 * @see #unsetConstantAttenuation()
	 * @see #getConstantAttenuation()
	 * @see #setConstantAttenuation(Double)
	 * @generated
	 */
	boolean isSetConstantAttenuation();

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #setRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourcePositional_Radius()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourcePositional#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLightSourcePositional#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadius()
	 * @see #getRadius()
	 * @see #setRadius(Double)
	 * @generated
	 */
	void unsetRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLightSourcePositional#getRadius <em>Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radius</em>' attribute is set.
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @see #setRadius(Double)
	 * @generated
	 */
	boolean isSetRadius();

} // IfcLightSourcePositional
