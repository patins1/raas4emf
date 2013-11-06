/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcElementQuantityImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Element Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcElementQuantity#getMethodOfMeasurement <em>Method Of Measurement</em>}</li>
 *   <li>{@link IFC2X3.IfcElementQuantity#getQuantities <em>Quantities</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcElementQuantity()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcElementQuantityImplAdapter.class)
public interface IfcElementQuantity extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Quantities</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcPhysicalQuantity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantities</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcElementQuantity_Quantities()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcPhysicalQuantity> getQuantities();

	/**
	 * Returns the value of the '<em><b>Method Of Measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Of Measurement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Of Measurement</em>' attribute.
	 * @see #isSetMethodOfMeasurement()
	 * @see #unsetMethodOfMeasurement()
	 * @see #setMethodOfMeasurement(String)
	 * @see IFC2X3.IFC2X3Package#getIfcElementQuantity_MethodOfMeasurement()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getMethodOfMeasurement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElementQuantity#getMethodOfMeasurement <em>Method Of Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Of Measurement</em>' attribute.
	 * @see #isSetMethodOfMeasurement()
	 * @see #unsetMethodOfMeasurement()
	 * @see #getMethodOfMeasurement()
	 * @generated
	 */
	void setMethodOfMeasurement(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElementQuantity#getMethodOfMeasurement <em>Method Of Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethodOfMeasurement()
	 * @see #getMethodOfMeasurement()
	 * @see #setMethodOfMeasurement(String)
	 * @generated
	 */
	void unsetMethodOfMeasurement();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElementQuantity#getMethodOfMeasurement <em>Method Of Measurement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Method Of Measurement</em>' attribute is set.
	 * @see #unsetMethodOfMeasurement()
	 * @see #getMethodOfMeasurement()
	 * @see #setMethodOfMeasurement(String)
	 * @generated
	 */
	boolean isSetMethodOfMeasurement();

} // IfcElementQuantity
