/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBoundaryEdgeConditionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Boundary Edge Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}</li>
 *   <li>{@link IFC2X3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}</li>
 *   <li>{@link IFC2X3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}</li>
 *   <li>{@link IFC2X3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}</li>
 *   <li>{@link IFC2X3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}</li>
 *   <li>{@link IFC2X3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcBoundaryEdgeCondition()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBoundaryEdgeConditionImplAdapter.class)
public interface IfcBoundaryEdgeCondition extends IfcBoundaryCondition {
	/**
	 * Returns the value of the '<em><b>Rotational Stiffness By Length Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Stiffness By Length Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Stiffness By Length Z</em>' attribute.
	 * @see #isSetRotationalStiffnessByLengthZ()
	 * @see #unsetRotationalStiffnessByLengthZ()
	 * @see #setRotationalStiffnessByLengthZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRotationalStiffnessByLengthZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Stiffness By Length Z</em>' attribute.
	 * @see #isSetRotationalStiffnessByLengthZ()
	 * @see #unsetRotationalStiffnessByLengthZ()
	 * @see #getRotationalStiffnessByLengthZ()
	 * @generated
	 */
	void setRotationalStiffnessByLengthZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalStiffnessByLengthZ()
	 * @see #getRotationalStiffnessByLengthZ()
	 * @see #setRotationalStiffnessByLengthZ(Double)
	 * @generated
	 */
	void unsetRotationalStiffnessByLengthZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Stiffness By Length Z</em>' attribute is set.
	 * @see #unsetRotationalStiffnessByLengthZ()
	 * @see #getRotationalStiffnessByLengthZ()
	 * @see #setRotationalStiffnessByLengthZ(Double)
	 * @generated
	 */
	boolean isSetRotationalStiffnessByLengthZ();

	/**
	 * Returns the value of the '<em><b>Rotational Stiffness By Length Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Stiffness By Length Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Stiffness By Length Y</em>' attribute.
	 * @see #isSetRotationalStiffnessByLengthY()
	 * @see #unsetRotationalStiffnessByLengthY()
	 * @see #setRotationalStiffnessByLengthY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRotationalStiffnessByLengthY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Stiffness By Length Y</em>' attribute.
	 * @see #isSetRotationalStiffnessByLengthY()
	 * @see #unsetRotationalStiffnessByLengthY()
	 * @see #getRotationalStiffnessByLengthY()
	 * @generated
	 */
	void setRotationalStiffnessByLengthY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalStiffnessByLengthY()
	 * @see #getRotationalStiffnessByLengthY()
	 * @see #setRotationalStiffnessByLengthY(Double)
	 * @generated
	 */
	void unsetRotationalStiffnessByLengthY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Stiffness By Length Y</em>' attribute is set.
	 * @see #unsetRotationalStiffnessByLengthY()
	 * @see #getRotationalStiffnessByLengthY()
	 * @see #setRotationalStiffnessByLengthY(Double)
	 * @generated
	 */
	boolean isSetRotationalStiffnessByLengthY();

	/**
	 * Returns the value of the '<em><b>Rotational Stiffness By Length X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Stiffness By Length X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Stiffness By Length X</em>' attribute.
	 * @see #isSetRotationalStiffnessByLengthX()
	 * @see #unsetRotationalStiffnessByLengthX()
	 * @see #setRotationalStiffnessByLengthX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRotationalStiffnessByLengthX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Stiffness By Length X</em>' attribute.
	 * @see #isSetRotationalStiffnessByLengthX()
	 * @see #unsetRotationalStiffnessByLengthX()
	 * @see #getRotationalStiffnessByLengthX()
	 * @generated
	 */
	void setRotationalStiffnessByLengthX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalStiffnessByLengthX()
	 * @see #getRotationalStiffnessByLengthX()
	 * @see #setRotationalStiffnessByLengthX(Double)
	 * @generated
	 */
	void unsetRotationalStiffnessByLengthX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Stiffness By Length X</em>' attribute is set.
	 * @see #unsetRotationalStiffnessByLengthX()
	 * @see #getRotationalStiffnessByLengthX()
	 * @see #setRotationalStiffnessByLengthX(Double)
	 * @generated
	 */
	boolean isSetRotationalStiffnessByLengthX();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness By Length Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness By Length Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness By Length Z</em>' attribute.
	 * @see #isSetLinearStiffnessByLengthZ()
	 * @see #unsetLinearStiffnessByLengthZ()
	 * @see #setLinearStiffnessByLengthZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearStiffnessByLengthZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness By Length Z</em>' attribute.
	 * @see #isSetLinearStiffnessByLengthZ()
	 * @see #unsetLinearStiffnessByLengthZ()
	 * @see #getLinearStiffnessByLengthZ()
	 * @generated
	 */
	void setLinearStiffnessByLengthZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessByLengthZ()
	 * @see #getLinearStiffnessByLengthZ()
	 * @see #setLinearStiffnessByLengthZ(Double)
	 * @generated
	 */
	void unsetLinearStiffnessByLengthZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness By Length Z</em>' attribute is set.
	 * @see #unsetLinearStiffnessByLengthZ()
	 * @see #getLinearStiffnessByLengthZ()
	 * @see #setLinearStiffnessByLengthZ(Double)
	 * @generated
	 */
	boolean isSetLinearStiffnessByLengthZ();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness By Length Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness By Length Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness By Length Y</em>' attribute.
	 * @see #isSetLinearStiffnessByLengthY()
	 * @see #unsetLinearStiffnessByLengthY()
	 * @see #setLinearStiffnessByLengthY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearStiffnessByLengthY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness By Length Y</em>' attribute.
	 * @see #isSetLinearStiffnessByLengthY()
	 * @see #unsetLinearStiffnessByLengthY()
	 * @see #getLinearStiffnessByLengthY()
	 * @generated
	 */
	void setLinearStiffnessByLengthY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessByLengthY()
	 * @see #getLinearStiffnessByLengthY()
	 * @see #setLinearStiffnessByLengthY(Double)
	 * @generated
	 */
	void unsetLinearStiffnessByLengthY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness By Length Y</em>' attribute is set.
	 * @see #unsetLinearStiffnessByLengthY()
	 * @see #getLinearStiffnessByLengthY()
	 * @see #setLinearStiffnessByLengthY(Double)
	 * @generated
	 */
	boolean isSetLinearStiffnessByLengthY();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness By Length X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness By Length X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness By Length X</em>' attribute.
	 * @see #isSetLinearStiffnessByLengthX()
	 * @see #unsetLinearStiffnessByLengthX()
	 * @see #setLinearStiffnessByLengthX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearStiffnessByLengthX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness By Length X</em>' attribute.
	 * @see #isSetLinearStiffnessByLengthX()
	 * @see #unsetLinearStiffnessByLengthX()
	 * @see #getLinearStiffnessByLengthX()
	 * @generated
	 */
	void setLinearStiffnessByLengthX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessByLengthX()
	 * @see #getLinearStiffnessByLengthX()
	 * @see #setLinearStiffnessByLengthX(Double)
	 * @generated
	 */
	void unsetLinearStiffnessByLengthX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness By Length X</em>' attribute is set.
	 * @see #unsetLinearStiffnessByLengthX()
	 * @see #getLinearStiffnessByLengthX()
	 * @see #setLinearStiffnessByLengthX(Double)
	 * @generated
	 */
	boolean isSetLinearStiffnessByLengthX();

} // IfcBoundaryEdgeCondition
