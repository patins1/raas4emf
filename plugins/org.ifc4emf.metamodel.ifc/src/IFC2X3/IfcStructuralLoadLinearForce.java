/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralLoadLinearForceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Load Linear Force</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearForceX <em>Linear Force X</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearForceY <em>Linear Force Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearForceZ <em>Linear Force Z</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearMomentX <em>Linear Moment X</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearMomentY <em>Linear Moment Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearMomentZ <em>Linear Moment Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadLinearForce()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralLoadLinearForceImplAdapter.class)
public interface IfcStructuralLoadLinearForce extends IfcStructuralLoadStatic {
	/**
	 * Returns the value of the '<em><b>Linear Moment Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Moment Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Moment Z</em>' attribute.
	 * @see #isSetLinearMomentZ()
	 * @see #unsetLinearMomentZ()
	 * @see #setLinearMomentZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadLinearForce_LinearMomentZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearMomentZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearMomentZ <em>Linear Moment Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Moment Z</em>' attribute.
	 * @see #isSetLinearMomentZ()
	 * @see #unsetLinearMomentZ()
	 * @see #getLinearMomentZ()
	 * @generated
	 */
	void setLinearMomentZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearMomentZ <em>Linear Moment Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearMomentZ()
	 * @see #getLinearMomentZ()
	 * @see #setLinearMomentZ(Double)
	 * @generated
	 */
	void unsetLinearMomentZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearMomentZ <em>Linear Moment Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Moment Z</em>' attribute is set.
	 * @see #unsetLinearMomentZ()
	 * @see #getLinearMomentZ()
	 * @see #setLinearMomentZ(Double)
	 * @generated
	 */
	boolean isSetLinearMomentZ();

	/**
	 * Returns the value of the '<em><b>Linear Moment Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Moment Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Moment Y</em>' attribute.
	 * @see #isSetLinearMomentY()
	 * @see #unsetLinearMomentY()
	 * @see #setLinearMomentY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadLinearForce_LinearMomentY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearMomentY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearMomentY <em>Linear Moment Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Moment Y</em>' attribute.
	 * @see #isSetLinearMomentY()
	 * @see #unsetLinearMomentY()
	 * @see #getLinearMomentY()
	 * @generated
	 */
	void setLinearMomentY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearMomentY <em>Linear Moment Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearMomentY()
	 * @see #getLinearMomentY()
	 * @see #setLinearMomentY(Double)
	 * @generated
	 */
	void unsetLinearMomentY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearMomentY <em>Linear Moment Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Moment Y</em>' attribute is set.
	 * @see #unsetLinearMomentY()
	 * @see #getLinearMomentY()
	 * @see #setLinearMomentY(Double)
	 * @generated
	 */
	boolean isSetLinearMomentY();

	/**
	 * Returns the value of the '<em><b>Linear Moment X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Moment X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Moment X</em>' attribute.
	 * @see #isSetLinearMomentX()
	 * @see #unsetLinearMomentX()
	 * @see #setLinearMomentX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadLinearForce_LinearMomentX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearMomentX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearMomentX <em>Linear Moment X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Moment X</em>' attribute.
	 * @see #isSetLinearMomentX()
	 * @see #unsetLinearMomentX()
	 * @see #getLinearMomentX()
	 * @generated
	 */
	void setLinearMomentX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearMomentX <em>Linear Moment X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearMomentX()
	 * @see #getLinearMomentX()
	 * @see #setLinearMomentX(Double)
	 * @generated
	 */
	void unsetLinearMomentX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearMomentX <em>Linear Moment X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Moment X</em>' attribute is set.
	 * @see #unsetLinearMomentX()
	 * @see #getLinearMomentX()
	 * @see #setLinearMomentX(Double)
	 * @generated
	 */
	boolean isSetLinearMomentX();

	/**
	 * Returns the value of the '<em><b>Linear Force Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Force Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Force Z</em>' attribute.
	 * @see #isSetLinearForceZ()
	 * @see #unsetLinearForceZ()
	 * @see #setLinearForceZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadLinearForce_LinearForceZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearForceZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearForceZ <em>Linear Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Force Z</em>' attribute.
	 * @see #isSetLinearForceZ()
	 * @see #unsetLinearForceZ()
	 * @see #getLinearForceZ()
	 * @generated
	 */
	void setLinearForceZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearForceZ <em>Linear Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearForceZ()
	 * @see #getLinearForceZ()
	 * @see #setLinearForceZ(Double)
	 * @generated
	 */
	void unsetLinearForceZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearForceZ <em>Linear Force Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Force Z</em>' attribute is set.
	 * @see #unsetLinearForceZ()
	 * @see #getLinearForceZ()
	 * @see #setLinearForceZ(Double)
	 * @generated
	 */
	boolean isSetLinearForceZ();

	/**
	 * Returns the value of the '<em><b>Linear Force Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Force Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Force Y</em>' attribute.
	 * @see #isSetLinearForceY()
	 * @see #unsetLinearForceY()
	 * @see #setLinearForceY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadLinearForce_LinearForceY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearForceY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearForceY <em>Linear Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Force Y</em>' attribute.
	 * @see #isSetLinearForceY()
	 * @see #unsetLinearForceY()
	 * @see #getLinearForceY()
	 * @generated
	 */
	void setLinearForceY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearForceY <em>Linear Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearForceY()
	 * @see #getLinearForceY()
	 * @see #setLinearForceY(Double)
	 * @generated
	 */
	void unsetLinearForceY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearForceY <em>Linear Force Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Force Y</em>' attribute is set.
	 * @see #unsetLinearForceY()
	 * @see #getLinearForceY()
	 * @see #setLinearForceY(Double)
	 * @generated
	 */
	boolean isSetLinearForceY();

	/**
	 * Returns the value of the '<em><b>Linear Force X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Force X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Force X</em>' attribute.
	 * @see #isSetLinearForceX()
	 * @see #unsetLinearForceX()
	 * @see #setLinearForceX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadLinearForce_LinearForceX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLinearForceX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearForceX <em>Linear Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Force X</em>' attribute.
	 * @see #isSetLinearForceX()
	 * @see #unsetLinearForceX()
	 * @see #getLinearForceX()
	 * @generated
	 */
	void setLinearForceX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearForceX <em>Linear Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearForceX()
	 * @see #getLinearForceX()
	 * @see #setLinearForceX(Double)
	 * @generated
	 */
	void unsetLinearForceX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadLinearForce#getLinearForceX <em>Linear Force X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Force X</em>' attribute is set.
	 * @see #unsetLinearForceX()
	 * @see #getLinearForceX()
	 * @see #setLinearForceX(Double)
	 * @generated
	 */
	boolean isSetLinearForceX();

} // IfcStructuralLoadLinearForce
