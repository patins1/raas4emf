/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBoundaryFaceConditionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Boundary Face Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}</li>
 *   <li>{@link IFC2X3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}</li>
 *   <li>{@link IFC2X3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcBoundaryFaceCondition()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBoundaryFaceConditionImplAdapter.class)
public interface IfcBoundaryFaceCondition extends IfcBoundaryCondition {
	/**
	 * Returns the value of the '<em><b>Linear Stiffness By Area Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness By Area Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness By Area Z</em>' attribute.
	 * @see #isSetLinearStiffnessByAreaZ()
	 * @see #unsetLinearStiffnessByAreaZ()
	 * @see #setLinearStiffnessByAreaZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearStiffnessByAreaZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness By Area Z</em>' attribute.
	 * @see #isSetLinearStiffnessByAreaZ()
	 * @see #unsetLinearStiffnessByAreaZ()
	 * @see #getLinearStiffnessByAreaZ()
	 * @generated
	 */
	void setLinearStiffnessByAreaZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessByAreaZ()
	 * @see #getLinearStiffnessByAreaZ()
	 * @see #setLinearStiffnessByAreaZ(Double)
	 * @generated
	 */
	void unsetLinearStiffnessByAreaZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness By Area Z</em>' attribute is set.
	 * @see #unsetLinearStiffnessByAreaZ()
	 * @see #getLinearStiffnessByAreaZ()
	 * @see #setLinearStiffnessByAreaZ(Double)
	 * @generated
	 */
	boolean isSetLinearStiffnessByAreaZ();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness By Area Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness By Area Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness By Area Y</em>' attribute.
	 * @see #isSetLinearStiffnessByAreaY()
	 * @see #unsetLinearStiffnessByAreaY()
	 * @see #setLinearStiffnessByAreaY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryFaceCondition_LinearStiffnessByAreaY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearStiffnessByAreaY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness By Area Y</em>' attribute.
	 * @see #isSetLinearStiffnessByAreaY()
	 * @see #unsetLinearStiffnessByAreaY()
	 * @see #getLinearStiffnessByAreaY()
	 * @generated
	 */
	void setLinearStiffnessByAreaY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessByAreaY()
	 * @see #getLinearStiffnessByAreaY()
	 * @see #setLinearStiffnessByAreaY(Double)
	 * @generated
	 */
	void unsetLinearStiffnessByAreaY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness By Area Y</em>' attribute is set.
	 * @see #unsetLinearStiffnessByAreaY()
	 * @see #getLinearStiffnessByAreaY()
	 * @see #setLinearStiffnessByAreaY(Double)
	 * @generated
	 */
	boolean isSetLinearStiffnessByAreaY();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness By Area X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness By Area X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness By Area X</em>' attribute.
	 * @see #isSetLinearStiffnessByAreaX()
	 * @see #unsetLinearStiffnessByAreaX()
	 * @see #setLinearStiffnessByAreaX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBoundaryFaceCondition_LinearStiffnessByAreaX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearStiffnessByAreaX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness By Area X</em>' attribute.
	 * @see #isSetLinearStiffnessByAreaX()
	 * @see #unsetLinearStiffnessByAreaX()
	 * @see #getLinearStiffnessByAreaX()
	 * @generated
	 */
	void setLinearStiffnessByAreaX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessByAreaX()
	 * @see #getLinearStiffnessByAreaX()
	 * @see #setLinearStiffnessByAreaX(Double)
	 * @generated
	 */
	void unsetLinearStiffnessByAreaX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness By Area X</em>' attribute is set.
	 * @see #unsetLinearStiffnessByAreaX()
	 * @see #getLinearStiffnessByAreaX()
	 * @see #setLinearStiffnessByAreaX(Double)
	 * @generated
	 */
	boolean isSetLinearStiffnessByAreaX();

} // IfcBoundaryFaceCondition
