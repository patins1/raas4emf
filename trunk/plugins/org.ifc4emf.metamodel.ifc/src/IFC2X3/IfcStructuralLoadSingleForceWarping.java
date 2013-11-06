/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralLoadSingleForceWarpingImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Load Single Force Warping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleForceWarping#getWarpingMoment <em>Warping Moment</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleForceWarping()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralLoadSingleForceWarpingImplAdapter.class)
public interface IfcStructuralLoadSingleForceWarping extends IfcStructuralLoadSingleForce {
	/**
	 * Returns the value of the '<em><b>Warping Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warping Moment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warping Moment</em>' attribute.
	 * @see #isSetWarpingMoment()
	 * @see #unsetWarpingMoment()
	 * @see #setWarpingMoment(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleForceWarping_WarpingMoment()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getWarpingMoment();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForceWarping#getWarpingMoment <em>Warping Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warping Moment</em>' attribute.
	 * @see #isSetWarpingMoment()
	 * @see #unsetWarpingMoment()
	 * @see #getWarpingMoment()
	 * @generated
	 */
	void setWarpingMoment(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForceWarping#getWarpingMoment <em>Warping Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWarpingMoment()
	 * @see #getWarpingMoment()
	 * @see #setWarpingMoment(Double)
	 * @generated
	 */
	void unsetWarpingMoment();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleForceWarping#getWarpingMoment <em>Warping Moment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Warping Moment</em>' attribute is set.
	 * @see #unsetWarpingMoment()
	 * @see #getWarpingMoment()
	 * @see #setWarpingMoment(Double)
	 * @generated
	 */
	boolean isSetWarpingMoment();

} // IfcStructuralLoadSingleForceWarping
