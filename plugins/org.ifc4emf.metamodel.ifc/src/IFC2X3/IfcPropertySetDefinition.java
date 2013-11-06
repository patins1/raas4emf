/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcPropertySetDefinitionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Set Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPropertySetDefinition#getPropertyDefinitionOf <em>Property Definition Of</em>}</li>
 *   <li>{@link IFC2X3.IfcPropertySetDefinition#getDefinesType <em>Defines Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPropertySetDefinition()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPropertySetDefinitionImplAdapter.class)
public interface IfcPropertySetDefinition extends IfcPropertyDefinition {
	/**
	 * Returns the value of the '<em><b>Property Definition Of</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelDefinesByProperties}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelDefinesByProperties#getRelatingPropertyDefinition <em>Relating Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Definition Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Definition Of</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPropertySetDefinition_PropertyDefinitionOf()
	 * @see IFC2X3.IfcRelDefinesByProperties#getRelatingPropertyDefinition
	 * @model opposite="RelatingPropertyDefinition" upper="123" ordered="false"
	 * @generated
	 */
	EList<IfcRelDefinesByProperties> getPropertyDefinitionOf();

	/**
	 * Returns the value of the '<em><b>Defines Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcTypeObject#getHasPropertySets <em>Has Property Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines Type</em>' reference.
	 * @see #setDefinesType(IfcTypeObject)
	 * @see IFC2X3.IFC2X3Package#getIfcPropertySetDefinition_DefinesType()
	 * @see IFC2X3.IfcTypeObject#getHasPropertySets
	 * @model opposite="HasPropertySets" ordered="false"
	 * @generated
	 */
	IfcTypeObject getDefinesType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPropertySetDefinition#getDefinesType <em>Defines Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defines Type</em>' reference.
	 * @see #getDefinesType()
	 * @generated
	 */
	void setDefinesType(IfcTypeObject value);

} // IfcPropertySetDefinition
