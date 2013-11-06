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

import IFC2X3.jaxb.IfcProfilePropertiesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcProfileProperties#getProfileName <em>Profile Name</em>}</li>
 *   <li>{@link IFC2X3.IfcProfileProperties#getProfileDefinition <em>Profile Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcProfileProperties()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcProfilePropertiesImplAdapter.class)
public interface IfcProfileProperties extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Profile Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Definition</em>' reference.
	 * @see #setProfileDefinition(IfcProfileDef)
	 * @see IFC2X3.IFC2X3Package#getIfcProfileProperties_ProfileDefinition()
	 * @model
	 * @generated
	 */
	IfcProfileDef getProfileDefinition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProfileProperties#getProfileDefinition <em>Profile Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Definition</em>' reference.
	 * @see #getProfileDefinition()
	 * @generated
	 */
	void setProfileDefinition(IfcProfileDef value);

	/**
	 * Returns the value of the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Name</em>' attribute.
	 * @see #isSetProfileName()
	 * @see #unsetProfileName()
	 * @see #setProfileName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcProfileProperties_ProfileName()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getProfileName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProfileProperties#getProfileName <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Name</em>' attribute.
	 * @see #isSetProfileName()
	 * @see #unsetProfileName()
	 * @see #getProfileName()
	 * @generated
	 */
	void setProfileName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProfileProperties#getProfileName <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfileName()
	 * @see #getProfileName()
	 * @see #setProfileName(String)
	 * @generated
	 */
	void unsetProfileName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProfileProperties#getProfileName <em>Profile Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile Name</em>' attribute is set.
	 * @see #unsetProfileName()
	 * @see #getProfileName()
	 * @see #setProfileName(String)
	 * @generated
	 */
	boolean isSetProfileName();

} // IfcProfileProperties
