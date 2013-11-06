/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBoundaryNodeConditionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Boundary Node Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcBoundaryNodeCondition#getLinearStiffnessX <em>Linear Stiffness X</em>}</li>
 *   <li>{@link IFC2X3.IfcBoundaryNodeCondition#getLinearStiffnessY <em>Linear Stiffness Y</em>}</li>
 *   <li>{@link IFC2X3.IfcBoundaryNodeCondition#getLinearStiffnessZ <em>Linear Stiffness Z</em>}</li>
 *   <li>{@link IFC2X3.IfcBoundaryNodeCondition#getRotationalStiffnessX <em>Rotational Stiffness X</em>}</li>
 *   <li>{@link IFC2X3.IfcBoundaryNodeCondition#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}</li>
 *   <li>{@link IFC2X3.IfcBoundaryNodeCondition#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcBoundaryNodeCondition()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBoundaryNodeConditionImplAdapter.class)
public interface IfcBoundaryNodeCondition extends IfcBoundaryCondition {
	/**
	 * Returns the value of the '<em><b>Rotational Stiffness Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Stiffness Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Stiffness Z</em>' attribute.
	 * @see #isSetRotationalStiffnessZ()
	 * @see #unsetRotationalStiffnessZ()
	 * @see #setRotationalStiffnessZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryNodeCondition_RotationalStiffnessZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRotationalStiffnessZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Stiffness Z</em>' attribute.
	 * @see #isSetRotationalStiffnessZ()
	 * @see #unsetRotationalStiffnessZ()
	 * @see #getRotationalStiffnessZ()
	 * @generated
	 */
	void setRotationalStiffnessZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalStiffnessZ()
	 * @see #getRotationalStiffnessZ()
	 * @see #setRotationalStiffnessZ(Double)
	 * @generated
	 */
	void unsetRotationalStiffnessZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Stiffness Z</em>' attribute is set.
	 * @see #unsetRotationalStiffnessZ()
	 * @see #getRotationalStiffnessZ()
	 * @see #setRotationalStiffnessZ(Double)
	 * @generated
	 */
	boolean isSetRotationalStiffnessZ();

	/**
	 * Returns the value of the '<em><b>Rotational Stiffness Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Stiffness Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Stiffness Y</em>' attribute.
	 * @see #isSetRotationalStiffnessY()
	 * @see #unsetRotationalStiffnessY()
	 * @see #setRotationalStiffnessY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryNodeCondition_RotationalStiffnessY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRotationalStiffnessY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Stiffness Y</em>' attribute.
	 * @see #isSetRotationalStiffnessY()
	 * @see #unsetRotationalStiffnessY()
	 * @see #getRotationalStiffnessY()
	 * @generated
	 */
	void setRotationalStiffnessY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalStiffnessY()
	 * @see #getRotationalStiffnessY()
	 * @see #setRotationalStiffnessY(Double)
	 * @generated
	 */
	void unsetRotationalStiffnessY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Stiffness Y</em>' attribute is set.
	 * @see #unsetRotationalStiffnessY()
	 * @see #getRotationalStiffnessY()
	 * @see #setRotationalStiffnessY(Double)
	 * @generated
	 */
	boolean isSetRotationalStiffnessY();

	/**
	 * Returns the value of the '<em><b>Rotational Stiffness X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Stiffness X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Stiffness X</em>' attribute.
	 * @see #isSetRotationalStiffnessX()
	 * @see #unsetRotationalStiffnessX()
	 * @see #setRotationalStiffnessX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryNodeCondition_RotationalStiffnessX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRotationalStiffnessX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getRotationalStiffnessX <em>Rotational Stiffness X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Stiffness X</em>' attribute.
	 * @see #isSetRotationalStiffnessX()
	 * @see #unsetRotationalStiffnessX()
	 * @see #getRotationalStiffnessX()
	 * @generated
	 */
	void setRotationalStiffnessX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getRotationalStiffnessX <em>Rotational Stiffness X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalStiffnessX()
	 * @see #getRotationalStiffnessX()
	 * @see #setRotationalStiffnessX(Double)
	 * @generated
	 */
	void unsetRotationalStiffnessX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getRotationalStiffnessX <em>Rotational Stiffness X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Stiffness X</em>' attribute is set.
	 * @see #unsetRotationalStiffnessX()
	 * @see #getRotationalStiffnessX()
	 * @see #setRotationalStiffnessX(Double)
	 * @generated
	 */
	boolean isSetRotationalStiffnessX();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness Z</em>' attribute.
	 * @see #isSetLinearStiffnessZ()
	 * @see #unsetLinearStiffnessZ()
	 * @see #setLinearStiffnessZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryNodeCondition_LinearStiffnessZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearStiffnessZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getLinearStiffnessZ <em>Linear Stiffness Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness Z</em>' attribute.
	 * @see #isSetLinearStiffnessZ()
	 * @see #unsetLinearStiffnessZ()
	 * @see #getLinearStiffnessZ()
	 * @generated
	 */
	void setLinearStiffnessZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getLinearStiffnessZ <em>Linear Stiffness Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessZ()
	 * @see #getLinearStiffnessZ()
	 * @see #setLinearStiffnessZ(Double)
	 * @generated
	 */
	void unsetLinearStiffnessZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getLinearStiffnessZ <em>Linear Stiffness Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness Z</em>' attribute is set.
	 * @see #unsetLinearStiffnessZ()
	 * @see #getLinearStiffnessZ()
	 * @see #setLinearStiffnessZ(Double)
	 * @generated
	 */
	boolean isSetLinearStiffnessZ();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness Y</em>' attribute.
	 * @see #isSetLinearStiffnessY()
	 * @see #unsetLinearStiffnessY()
	 * @see #setLinearStiffnessY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryNodeCondition_LinearStiffnessY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearStiffnessY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getLinearStiffnessY <em>Linear Stiffness Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness Y</em>' attribute.
	 * @see #isSetLinearStiffnessY()
	 * @see #unsetLinearStiffnessY()
	 * @see #getLinearStiffnessY()
	 * @generated
	 */
	void setLinearStiffnessY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getLinearStiffnessY <em>Linear Stiffness Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessY()
	 * @see #getLinearStiffnessY()
	 * @see #setLinearStiffnessY(Double)
	 * @generated
	 */
	void unsetLinearStiffnessY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getLinearStiffnessY <em>Linear Stiffness Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness Y</em>' attribute is set.
	 * @see #unsetLinearStiffnessY()
	 * @see #getLinearStiffnessY()
	 * @see #setLinearStiffnessY(Double)
	 * @generated
	 */
	boolean isSetLinearStiffnessY();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness X</em>' attribute.
	 * @see #isSetLinearStiffnessX()
	 * @see #unsetLinearStiffnessX()
	 * @see #setLinearStiffnessX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryNodeCondition_LinearStiffnessX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearStiffnessX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getLinearStiffnessX <em>Linear Stiffness X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness X</em>' attribute.
	 * @see #isSetLinearStiffnessX()
	 * @see #unsetLinearStiffnessX()
	 * @see #getLinearStiffnessX()
	 * @generated
	 */
	void setLinearStiffnessX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getLinearStiffnessX <em>Linear Stiffness X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessX()
	 * @see #getLinearStiffnessX()
	 * @see #setLinearStiffnessX(Double)
	 * @generated
	 */
	void unsetLinearStiffnessX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryNodeCondition#getLinearStiffnessX <em>Linear Stiffness X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness X</em>' attribute is set.
	 * @see #unsetLinearStiffnessX()
	 * @see #getLinearStiffnessX()
	 * @see #setLinearStiffnessX(Double)
	 * @generated
	 */
	boolean isSetLinearStiffnessX();

} // IfcBoundaryNodeCondition
