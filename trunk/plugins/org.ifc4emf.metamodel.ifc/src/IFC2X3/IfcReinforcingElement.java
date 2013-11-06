/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcReinforcingElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Reinforcing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcReinforcingElement#getSteelGrade <em>Steel Grade</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcReinforcingElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcReinforcingElementImplAdapter.class)
public interface IfcReinforcingElement extends IfcBuildingElementComponent {
	/**
	 * Returns the value of the '<em><b>Steel Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steel Grade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steel Grade</em>' attribute.
	 * @see #isSetSteelGrade()
	 * @see #unsetSteelGrade()
	 * @see #setSteelGrade(String)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingElement_SteelGrade()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getSteelGrade();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingElement#getSteelGrade <em>Steel Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steel Grade</em>' attribute.
	 * @see #isSetSteelGrade()
	 * @see #unsetSteelGrade()
	 * @see #getSteelGrade()
	 * @generated
	 */
	void setSteelGrade(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingElement#getSteelGrade <em>Steel Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteelGrade()
	 * @see #getSteelGrade()
	 * @see #setSteelGrade(String)
	 * @generated
	 */
	void unsetSteelGrade();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingElement#getSteelGrade <em>Steel Grade</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Steel Grade</em>' attribute is set.
	 * @see #unsetSteelGrade()
	 * @see #getSteelGrade()
	 * @see #setSteelGrade(String)
	 * @generated
	 */
	boolean isSetSteelGrade();

} // IfcReinforcingElement
