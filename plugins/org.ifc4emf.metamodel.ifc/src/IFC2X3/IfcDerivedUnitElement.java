/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcDerivedUnitElementImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Derived Unit Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDerivedUnitElement#getUnit <em>Unit</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedUnitElement#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDerivedUnitElement()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcDerivedUnitElementImplAdapter.class)
public interface IfcDerivedUnitElement extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(IfcNamedUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedUnitElement_Unit()
	 * @model required="true"
	 * @generated
	 */
	IfcNamedUnit getUnit();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedUnitElement#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(IfcNamedUnit value);

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #isSetExponent()
	 * @see #unsetExponent()
	 * @see #setExponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedUnitElement_Exponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getExponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedUnitElement#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #isSetExponent()
	 * @see #unsetExponent()
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedUnitElement#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExponent()
	 * @see #getExponent()
	 * @see #setExponent(Integer)
	 * @generated
	 */
	void unsetExponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedUnitElement#getExponent <em>Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exponent</em>' attribute is set.
	 * @see #unsetExponent()
	 * @see #getExponent()
	 * @see #setExponent(Integer)
	 * @generated
	 */
	boolean isSetExponent();

} // IfcDerivedUnitElement
