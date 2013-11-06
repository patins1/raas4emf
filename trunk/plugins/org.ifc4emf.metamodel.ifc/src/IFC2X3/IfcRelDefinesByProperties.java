/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelDefinesByPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Defines By Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelDefinesByProperties#getRelatingPropertyDefinition <em>Relating Property Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelDefinesByProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelDefinesByPropertiesImplAdapter.class)
public interface IfcRelDefinesByProperties extends IfcRelDefines {
	/**
	 * Returns the value of the '<em><b>Relating Property Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPropertySetDefinition#getPropertyDefinitionOf <em>Property Definition Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Property Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Property Definition</em>' reference.
	 * @see #setRelatingPropertyDefinition(IfcPropertySetDefinition)
	 * @see IFC2X3.IFC2X3Package#getIfcRelDefinesByProperties_RelatingPropertyDefinition()
	 * @see IFC2X3.IfcPropertySetDefinition#getPropertyDefinitionOf
	 * @model opposite="PropertyDefinitionOf" required="true"
	 * @generated
	 */
	IfcPropertySetDefinition getRelatingPropertyDefinition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelDefinesByProperties#getRelatingPropertyDefinition <em>Relating Property Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Property Definition</em>' reference.
	 * @see #getRelatingPropertyDefinition()
	 * @generated
	 */
	void setRelatingPropertyDefinition(IfcPropertySetDefinition value);

} // IfcRelDefinesByProperties
