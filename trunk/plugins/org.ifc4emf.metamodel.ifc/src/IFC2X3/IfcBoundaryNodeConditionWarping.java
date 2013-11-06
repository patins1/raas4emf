/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBoundaryNodeConditionWarpingImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Boundary Node Condition Warping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcBoundaryNodeConditionWarping#getWarpingStiffness <em>Warping Stiffness</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcBoundaryNodeConditionWarping()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBoundaryNodeConditionWarpingImplAdapter.class)
public interface IfcBoundaryNodeConditionWarping extends IfcBoundaryNodeCondition {
	/**
	 * Returns the value of the '<em><b>Warping Stiffness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warping Stiffness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warping Stiffness</em>' attribute.
	 * @see #isSetWarpingStiffness()
	 * @see #unsetWarpingStiffness()
	 * @see #setWarpingStiffness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryNodeConditionWarping_WarpingStiffness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getWarpingStiffness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryNodeConditionWarping#getWarpingStiffness <em>Warping Stiffness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warping Stiffness</em>' attribute.
	 * @see #isSetWarpingStiffness()
	 * @see #unsetWarpingStiffness()
	 * @see #getWarpingStiffness()
	 * @generated
	 */
	void setWarpingStiffness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryNodeConditionWarping#getWarpingStiffness <em>Warping Stiffness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWarpingStiffness()
	 * @see #getWarpingStiffness()
	 * @see #setWarpingStiffness(Double)
	 * @generated
	 */
	void unsetWarpingStiffness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryNodeConditionWarping#getWarpingStiffness <em>Warping Stiffness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Warping Stiffness</em>' attribute is set.
	 * @see #unsetWarpingStiffness()
	 * @see #getWarpingStiffness()
	 * @see #setWarpingStiffness(Double)
	 * @generated
	 */
	boolean isSetWarpingStiffness();

} // IfcBoundaryNodeConditionWarping
