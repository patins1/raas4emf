/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralLoadSingleForceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Load Single Force</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleForce#getForceX <em>Force X</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleForce#getForceY <em>Force Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleForce#getForceZ <em>Force Z</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleForce#getMomentX <em>Moment X</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleForce#getMomentY <em>Moment Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleForce#getMomentZ <em>Moment Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleForce()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralLoadSingleForceImplAdapter.class)
public interface IfcStructuralLoadSingleForce extends IfcStructuralLoadStatic {
	/**
	 * Returns the value of the '<em><b>Moment Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Z</em>' attribute.
	 * @see #isSetMomentZ()
	 * @see #unsetMomentZ()
	 * @see #setMomentZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleForce_MomentZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMomentZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getMomentZ <em>Moment Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Z</em>' attribute.
	 * @see #isSetMomentZ()
	 * @see #unsetMomentZ()
	 * @see #getMomentZ()
	 * @generated
	 */
	void setMomentZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getMomentZ <em>Moment Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentZ()
	 * @see #getMomentZ()
	 * @see #setMomentZ(Double)
	 * @generated
	 */
	void unsetMomentZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getMomentZ <em>Moment Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Z</em>' attribute is set.
	 * @see #unsetMomentZ()
	 * @see #getMomentZ()
	 * @see #setMomentZ(Double)
	 * @generated
	 */
	boolean isSetMomentZ();

	/**
	 * Returns the value of the '<em><b>Moment Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Y</em>' attribute.
	 * @see #isSetMomentY()
	 * @see #unsetMomentY()
	 * @see #setMomentY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleForce_MomentY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMomentY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getMomentY <em>Moment Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Y</em>' attribute.
	 * @see #isSetMomentY()
	 * @see #unsetMomentY()
	 * @see #getMomentY()
	 * @generated
	 */
	void setMomentY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getMomentY <em>Moment Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentY()
	 * @see #getMomentY()
	 * @see #setMomentY(Double)
	 * @generated
	 */
	void unsetMomentY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getMomentY <em>Moment Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Y</em>' attribute is set.
	 * @see #unsetMomentY()
	 * @see #getMomentY()
	 * @see #setMomentY(Double)
	 * @generated
	 */
	boolean isSetMomentY();

	/**
	 * Returns the value of the '<em><b>Moment X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment X</em>' attribute.
	 * @see #isSetMomentX()
	 * @see #unsetMomentX()
	 * @see #setMomentX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleForce_MomentX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMomentX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getMomentX <em>Moment X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment X</em>' attribute.
	 * @see #isSetMomentX()
	 * @see #unsetMomentX()
	 * @see #getMomentX()
	 * @generated
	 */
	void setMomentX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getMomentX <em>Moment X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentX()
	 * @see #getMomentX()
	 * @see #setMomentX(Double)
	 * @generated
	 */
	void unsetMomentX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getMomentX <em>Moment X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment X</em>' attribute is set.
	 * @see #unsetMomentX()
	 * @see #getMomentX()
	 * @see #setMomentX(Double)
	 * @generated
	 */
	boolean isSetMomentX();

	/**
	 * Returns the value of the '<em><b>Force Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Z</em>' attribute.
	 * @see #isSetForceZ()
	 * @see #unsetForceZ()
	 * @see #setForceZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleForce_ForceZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getForceZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getForceZ <em>Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Z</em>' attribute.
	 * @see #isSetForceZ()
	 * @see #unsetForceZ()
	 * @see #getForceZ()
	 * @generated
	 */
	void setForceZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getForceZ <em>Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForceZ()
	 * @see #getForceZ()
	 * @see #setForceZ(Double)
	 * @generated
	 */
	void unsetForceZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getForceZ <em>Force Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Force Z</em>' attribute is set.
	 * @see #unsetForceZ()
	 * @see #getForceZ()
	 * @see #setForceZ(Double)
	 * @generated
	 */
	boolean isSetForceZ();

	/**
	 * Returns the value of the '<em><b>Force Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Y</em>' attribute.
	 * @see #isSetForceY()
	 * @see #unsetForceY()
	 * @see #setForceY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleForce_ForceY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getForceY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getForceY <em>Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Y</em>' attribute.
	 * @see #isSetForceY()
	 * @see #unsetForceY()
	 * @see #getForceY()
	 * @generated
	 */
	void setForceY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getForceY <em>Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForceY()
	 * @see #getForceY()
	 * @see #setForceY(Double)
	 * @generated
	 */
	void unsetForceY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getForceY <em>Force Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Force Y</em>' attribute is set.
	 * @see #unsetForceY()
	 * @see #getForceY()
	 * @see #setForceY(Double)
	 * @generated
	 */
	boolean isSetForceY();

	/**
	 * Returns the value of the '<em><b>Force X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force X</em>' attribute.
	 * @see #isSetForceX()
	 * @see #unsetForceX()
	 * @see #setForceX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleForce_ForceX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getForceX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getForceX <em>Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force X</em>' attribute.
	 * @see #isSetForceX()
	 * @see #unsetForceX()
	 * @see #getForceX()
	 * @generated
	 */
	void setForceX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getForceX <em>Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForceX()
	 * @see #getForceX()
	 * @see #setForceX(Double)
	 * @generated
	 */
	void unsetForceX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleForce#getForceX <em>Force X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Force X</em>' attribute is set.
	 * @see #unsetForceX()
	 * @see #getForceX()
	 * @see #setForceX(Double)
	 * @generated
	 */
	boolean isSetForceX();

} // IfcStructuralLoadSingleForce
