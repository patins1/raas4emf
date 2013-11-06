/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRelOverridesPropertiesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Overrides Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelOverridesProperties#getOverridingProperties <em>Overriding Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelOverridesProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelOverridesPropertiesImplAdapter.class)
public interface IfcRelOverridesProperties extends IfcRelDefinesByProperties {
	/**
	 * Returns the value of the '<em><b>Overriding Properties</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overriding Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overriding Properties</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRelOverridesProperties_OverridingProperties()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcProperty> getOverridingProperties();

} // IfcRelOverridesProperties
