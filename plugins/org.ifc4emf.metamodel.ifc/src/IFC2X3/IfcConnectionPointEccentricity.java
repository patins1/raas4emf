/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcConnectionPointEccentricityImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connection Point Eccentricity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcConnectionPointEccentricity#getEccentricityInX <em>Eccentricity In X</em>}</li>
 *   <li>{@link IFC2X3.IfcConnectionPointEccentricity#getEccentricityInY <em>Eccentricity In Y</em>}</li>
 *   <li>{@link IFC2X3.IfcConnectionPointEccentricity#getEccentricityInZ <em>Eccentricity In Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcConnectionPointEccentricity()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcConnectionPointEccentricityImplAdapter.class)
public interface IfcConnectionPointEccentricity extends IfcConnectionPointGeometry {
	/**
	 * Returns the value of the '<em><b>Eccentricity In Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eccentricity In Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eccentricity In Z</em>' attribute.
	 * @see #isSetEccentricityInZ()
	 * @see #unsetEccentricityInZ()
	 * @see #setEccentricityInZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcConnectionPointEccentricity_EccentricityInZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getEccentricityInZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConnectionPointEccentricity#getEccentricityInZ <em>Eccentricity In Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eccentricity In Z</em>' attribute.
	 * @see #isSetEccentricityInZ()
	 * @see #unsetEccentricityInZ()
	 * @see #getEccentricityInZ()
	 * @generated
	 */
	void setEccentricityInZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcConnectionPointEccentricity#getEccentricityInZ <em>Eccentricity In Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEccentricityInZ()
	 * @see #getEccentricityInZ()
	 * @see #setEccentricityInZ(Double)
	 * @generated
	 */
	void unsetEccentricityInZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConnectionPointEccentricity#getEccentricityInZ <em>Eccentricity In Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eccentricity In Z</em>' attribute is set.
	 * @see #unsetEccentricityInZ()
	 * @see #getEccentricityInZ()
	 * @see #setEccentricityInZ(Double)
	 * @generated
	 */
	boolean isSetEccentricityInZ();

	/**
	 * Returns the value of the '<em><b>Eccentricity In Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eccentricity In Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eccentricity In Y</em>' attribute.
	 * @see #isSetEccentricityInY()
	 * @see #unsetEccentricityInY()
	 * @see #setEccentricityInY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcConnectionPointEccentricity_EccentricityInY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getEccentricityInY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConnectionPointEccentricity#getEccentricityInY <em>Eccentricity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eccentricity In Y</em>' attribute.
	 * @see #isSetEccentricityInY()
	 * @see #unsetEccentricityInY()
	 * @see #getEccentricityInY()
	 * @generated
	 */
	void setEccentricityInY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcConnectionPointEccentricity#getEccentricityInY <em>Eccentricity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEccentricityInY()
	 * @see #getEccentricityInY()
	 * @see #setEccentricityInY(Double)
	 * @generated
	 */
	void unsetEccentricityInY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConnectionPointEccentricity#getEccentricityInY <em>Eccentricity In Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eccentricity In Y</em>' attribute is set.
	 * @see #unsetEccentricityInY()
	 * @see #getEccentricityInY()
	 * @see #setEccentricityInY(Double)
	 * @generated
	 */
	boolean isSetEccentricityInY();

	/**
	 * Returns the value of the '<em><b>Eccentricity In X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eccentricity In X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eccentricity In X</em>' attribute.
	 * @see #isSetEccentricityInX()
	 * @see #unsetEccentricityInX()
	 * @see #setEccentricityInX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcConnectionPointEccentricity_EccentricityInX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getEccentricityInX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConnectionPointEccentricity#getEccentricityInX <em>Eccentricity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eccentricity In X</em>' attribute.
	 * @see #isSetEccentricityInX()
	 * @see #unsetEccentricityInX()
	 * @see #getEccentricityInX()
	 * @generated
	 */
	void setEccentricityInX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcConnectionPointEccentricity#getEccentricityInX <em>Eccentricity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEccentricityInX()
	 * @see #getEccentricityInX()
	 * @see #setEccentricityInX(Double)
	 * @generated
	 */
	void unsetEccentricityInX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConnectionPointEccentricity#getEccentricityInX <em>Eccentricity In X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eccentricity In X</em>' attribute is set.
	 * @see #unsetEccentricityInX()
	 * @see #getEccentricityInX()
	 * @see #setEccentricityInX(Double)
	 * @generated
	 */
	boolean isSetEccentricityInX();

} // IfcConnectionPointEccentricity
