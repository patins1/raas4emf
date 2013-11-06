/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcReinforcementDefinitionPropertiesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Reinforcement Definition Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcReinforcementDefinitionProperties#getDefinitionType <em>Definition Type</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcementDefinitionProperties#getReinforcementSectionDefinitions <em>Reinforcement Section Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcReinforcementDefinitionProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcReinforcementDefinitionPropertiesImplAdapter.class)
public interface IfcReinforcementDefinitionProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Reinforcement Section Definitions</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcSectionReinforcementProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reinforcement Section Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reinforcement Section Definitions</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcementDefinitionProperties_ReinforcementSectionDefinitions()
	 * @model required="true"
	 * @generated
	 */
	EList<IfcSectionReinforcementProperties> getReinforcementSectionDefinitions();

	/**
	 * Returns the value of the '<em><b>Definition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Type</em>' attribute.
	 * @see #isSetDefinitionType()
	 * @see #unsetDefinitionType()
	 * @see #setDefinitionType(String)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcementDefinitionProperties_DefinitionType()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDefinitionType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcementDefinitionProperties#getDefinitionType <em>Definition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Type</em>' attribute.
	 * @see #isSetDefinitionType()
	 * @see #unsetDefinitionType()
	 * @see #getDefinitionType()
	 * @generated
	 */
	void setDefinitionType(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcementDefinitionProperties#getDefinitionType <em>Definition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefinitionType()
	 * @see #getDefinitionType()
	 * @see #setDefinitionType(String)
	 * @generated
	 */
	void unsetDefinitionType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcementDefinitionProperties#getDefinitionType <em>Definition Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Definition Type</em>' attribute is set.
	 * @see #unsetDefinitionType()
	 * @see #getDefinitionType()
	 * @see #setDefinitionType(String)
	 * @generated
	 */
	boolean isSetDefinitionType();

} // IfcReinforcementDefinitionProperties
