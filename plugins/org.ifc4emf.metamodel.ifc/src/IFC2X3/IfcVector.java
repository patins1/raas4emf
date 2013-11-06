/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcVectorImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcVector#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link IFC2X3.IfcVector#getMagnitude <em>Magnitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcVector()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcVectorImplAdapter.class)
public interface IfcVector extends IfcVectorOrDirection, IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' reference.
	 * @see #setOrientation(IfcDirection)
	 * @see IFC2X3.IFC2X3Package#getIfcVector_Orientation()
	 * @model required="true"
	 * @generated
	 */
	IfcDirection getOrientation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcVector#getOrientation <em>Orientation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(IfcDirection value);

	/**
	 * Returns the value of the '<em><b>Magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magnitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Magnitude</em>' attribute.
	 * @see #isSetMagnitude()
	 * @see #unsetMagnitude()
	 * @see #setMagnitude(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcVector_Magnitude()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getMagnitude();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcVector#getMagnitude <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magnitude</em>' attribute.
	 * @see #isSetMagnitude()
	 * @see #unsetMagnitude()
	 * @see #getMagnitude()
	 * @generated
	 */
	void setMagnitude(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcVector#getMagnitude <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMagnitude()
	 * @see #getMagnitude()
	 * @see #setMagnitude(Double)
	 * @generated
	 */
	void unsetMagnitude();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcVector#getMagnitude <em>Magnitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Magnitude</em>' attribute is set.
	 * @see #unsetMagnitude()
	 * @see #getMagnitude()
	 * @see #setMagnitude(Double)
	 * @generated
	 */
	boolean isSetMagnitude();

} // IfcVector
