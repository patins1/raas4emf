/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcMechanicalFastenerImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Mechanical Fastener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMechanicalFastener#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link IFC2X3.IfcMechanicalFastener#getNominalLength <em>Nominal Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMechanicalFastener()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMechanicalFastenerImplAdapter.class)
public interface IfcMechanicalFastener extends IfcFastener {
	/**
	 * Returns the value of the '<em><b>Nominal Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Length</em>' attribute.
	 * @see #isSetNominalLength()
	 * @see #unsetNominalLength()
	 * @see #setNominalLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalFastener_NominalLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getNominalLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalFastener#getNominalLength <em>Nominal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Length</em>' attribute.
	 * @see #isSetNominalLength()
	 * @see #unsetNominalLength()
	 * @see #getNominalLength()
	 * @generated
	 */
	void setNominalLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalFastener#getNominalLength <em>Nominal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalLength()
	 * @see #getNominalLength()
	 * @see #setNominalLength(Double)
	 * @generated
	 */
	void unsetNominalLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalFastener#getNominalLength <em>Nominal Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Length</em>' attribute is set.
	 * @see #unsetNominalLength()
	 * @see #getNominalLength()
	 * @see #setNominalLength(Double)
	 * @generated
	 */
	boolean isSetNominalLength();

	/**
	 * Returns the value of the '<em><b>Nominal Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Diameter</em>' attribute.
	 * @see #isSetNominalDiameter()
	 * @see #unsetNominalDiameter()
	 * @see #setNominalDiameter(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMechanicalFastener_NominalDiameter()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getNominalDiameter();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMechanicalFastener#getNominalDiameter <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Diameter</em>' attribute.
	 * @see #isSetNominalDiameter()
	 * @see #unsetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @generated
	 */
	void setNominalDiameter(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMechanicalFastener#getNominalDiameter <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @see #setNominalDiameter(Double)
	 * @generated
	 */
	void unsetNominalDiameter();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMechanicalFastener#getNominalDiameter <em>Nominal Diameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Diameter</em>' attribute is set.
	 * @see #unsetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @see #setNominalDiameter(Double)
	 * @generated
	 */
	boolean isSetNominalDiameter();

} // IfcMechanicalFastener
