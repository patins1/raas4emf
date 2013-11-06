/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPointOnSurfaceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Point On Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPointOnSurface#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link IFC2X3.IfcPointOnSurface#getPointParameterU <em>Point Parameter U</em>}</li>
 *   <li>{@link IFC2X3.IfcPointOnSurface#getPointParameterV <em>Point Parameter V</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPointOnSurface()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPointOnSurfaceImplAdapter.class)
public interface IfcPointOnSurface extends IfcPoint {
	/**
	 * Returns the value of the '<em><b>Basis Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Surface</em>' reference.
	 * @see #setBasisSurface(IfcSurface)
	 * @see IFC2X3.IFC2X3Package#getIfcPointOnSurface_BasisSurface()
	 * @model required="true"
	 * @generated
	 */
	IfcSurface getBasisSurface();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPointOnSurface#getBasisSurface <em>Basis Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Surface</em>' reference.
	 * @see #getBasisSurface()
	 * @generated
	 */
	void setBasisSurface(IfcSurface value);

	/**
	 * Returns the value of the '<em><b>Point Parameter V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Parameter V</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Parameter V</em>' attribute.
	 * @see #isSetPointParameterV()
	 * @see #unsetPointParameterV()
	 * @see #setPointParameterV(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcPointOnSurface_PointParameterV()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getPointParameterV();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPointOnSurface#getPointParameterV <em>Point Parameter V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Parameter V</em>' attribute.
	 * @see #isSetPointParameterV()
	 * @see #unsetPointParameterV()
	 * @see #getPointParameterV()
	 * @generated
	 */
	void setPointParameterV(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPointOnSurface#getPointParameterV <em>Point Parameter V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPointParameterV()
	 * @see #getPointParameterV()
	 * @see #setPointParameterV(Double)
	 * @generated
	 */
	void unsetPointParameterV();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPointOnSurface#getPointParameterV <em>Point Parameter V</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Point Parameter V</em>' attribute is set.
	 * @see #unsetPointParameterV()
	 * @see #getPointParameterV()
	 * @see #setPointParameterV(Double)
	 * @generated
	 */
	boolean isSetPointParameterV();

	/**
	 * Returns the value of the '<em><b>Point Parameter U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Parameter U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Parameter U</em>' attribute.
	 * @see #isSetPointParameterU()
	 * @see #unsetPointParameterU()
	 * @see #setPointParameterU(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcPointOnSurface_PointParameterU()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getPointParameterU();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPointOnSurface#getPointParameterU <em>Point Parameter U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Parameter U</em>' attribute.
	 * @see #isSetPointParameterU()
	 * @see #unsetPointParameterU()
	 * @see #getPointParameterU()
	 * @generated
	 */
	void setPointParameterU(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPointOnSurface#getPointParameterU <em>Point Parameter U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPointParameterU()
	 * @see #getPointParameterU()
	 * @see #setPointParameterU(Double)
	 * @generated
	 */
	void unsetPointParameterU();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPointOnSurface#getPointParameterU <em>Point Parameter U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Point Parameter U</em>' attribute is set.
	 * @see #unsetPointParameterU()
	 * @see #getPointParameterU()
	 * @see #setPointParameterU(Double)
	 * @generated
	 */
	boolean isSetPointParameterU();

} // IfcPointOnSurface
