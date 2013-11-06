/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralLoadPlanarForceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Load Planar Force</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralLoadPlanarForce#getPlanarForceX <em>Planar Force X</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadPlanarForce#getPlanarForceY <em>Planar Force Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadPlanarForce#getPlanarForceZ <em>Planar Force Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadPlanarForce()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralLoadPlanarForceImplAdapter.class)
public interface IfcStructuralLoadPlanarForce extends IfcStructuralLoadStatic {
	/**
	 * Returns the value of the '<em><b>Planar Force Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planar Force Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planar Force Z</em>' attribute.
	 * @see #isSetPlanarForceZ()
	 * @see #unsetPlanarForceZ()
	 * @see #setPlanarForceZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadPlanarForce_PlanarForceZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPlanarForceZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadPlanarForce#getPlanarForceZ <em>Planar Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planar Force Z</em>' attribute.
	 * @see #isSetPlanarForceZ()
	 * @see #unsetPlanarForceZ()
	 * @see #getPlanarForceZ()
	 * @generated
	 */
	void setPlanarForceZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadPlanarForce#getPlanarForceZ <em>Planar Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlanarForceZ()
	 * @see #getPlanarForceZ()
	 * @see #setPlanarForceZ(Double)
	 * @generated
	 */
	void unsetPlanarForceZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadPlanarForce#getPlanarForceZ <em>Planar Force Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Planar Force Z</em>' attribute is set.
	 * @see #unsetPlanarForceZ()
	 * @see #getPlanarForceZ()
	 * @see #setPlanarForceZ(Double)
	 * @generated
	 */
	boolean isSetPlanarForceZ();

	/**
	 * Returns the value of the '<em><b>Planar Force Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planar Force Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planar Force Y</em>' attribute.
	 * @see #isSetPlanarForceY()
	 * @see #unsetPlanarForceY()
	 * @see #setPlanarForceY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadPlanarForce_PlanarForceY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPlanarForceY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadPlanarForce#getPlanarForceY <em>Planar Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planar Force Y</em>' attribute.
	 * @see #isSetPlanarForceY()
	 * @see #unsetPlanarForceY()
	 * @see #getPlanarForceY()
	 * @generated
	 */
	void setPlanarForceY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadPlanarForce#getPlanarForceY <em>Planar Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlanarForceY()
	 * @see #getPlanarForceY()
	 * @see #setPlanarForceY(Double)
	 * @generated
	 */
	void unsetPlanarForceY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadPlanarForce#getPlanarForceY <em>Planar Force Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Planar Force Y</em>' attribute is set.
	 * @see #unsetPlanarForceY()
	 * @see #getPlanarForceY()
	 * @see #setPlanarForceY(Double)
	 * @generated
	 */
	boolean isSetPlanarForceY();

	/**
	 * Returns the value of the '<em><b>Planar Force X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planar Force X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planar Force X</em>' attribute.
	 * @see #isSetPlanarForceX()
	 * @see #unsetPlanarForceX()
	 * @see #setPlanarForceX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadPlanarForce_PlanarForceX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPlanarForceX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadPlanarForce#getPlanarForceX <em>Planar Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planar Force X</em>' attribute.
	 * @see #isSetPlanarForceX()
	 * @see #unsetPlanarForceX()
	 * @see #getPlanarForceX()
	 * @generated
	 */
	void setPlanarForceX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadPlanarForce#getPlanarForceX <em>Planar Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlanarForceX()
	 * @see #getPlanarForceX()
	 * @see #setPlanarForceX(Double)
	 * @generated
	 */
	void unsetPlanarForceX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadPlanarForce#getPlanarForceX <em>Planar Force X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Planar Force X</em>' attribute is set.
	 * @see #unsetPlanarForceX()
	 * @see #getPlanarForceX()
	 * @see #setPlanarForceX(Double)
	 * @generated
	 */
	boolean isSetPlanarForceX();

} // IfcStructuralLoadPlanarForce
