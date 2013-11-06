/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcPropertySetImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPropertySet#getHasProperties <em>Has Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPropertySet()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPropertySetImplAdapter.class)
public interface IfcPropertySet extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Has Properties</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Properties</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPropertySet_HasProperties()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcProperty> getHasProperties();

} // IfcPropertySet
