/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssociatesProfilePropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssociatesProfileProperties#getRelatingProfileProperties <em>Relating Profile Properties</em>}</li>
 *   <li>{@link IFC2X3.IfcRelAssociatesProfileProperties#getProfileSectionLocation <em>Profile Section Location</em>}</li>
 *   <li>{@link IFC2X3.IfcRelAssociatesProfileProperties#getProfileOrientation <em>Profile Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesProfileProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssociatesProfilePropertiesImplAdapter.class)
public interface IfcRelAssociatesProfileProperties extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Profile Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Orientation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Orientation</em>' containment reference.
	 * @see #setProfileOrientation(IfcOrientationSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesProfileProperties_ProfileOrientation()
	 * @model containment="true"
	 * @generated
	 */
	IfcOrientationSelect getProfileOrientation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssociatesProfileProperties#getProfileOrientation <em>Profile Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Orientation</em>' containment reference.
	 * @see #getProfileOrientation()
	 * @generated
	 */
	void setProfileOrientation(IfcOrientationSelect value);

	/**
	 * Returns the value of the '<em><b>Profile Section Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Section Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Section Location</em>' reference.
	 * @see #setProfileSectionLocation(IfcShapeAspect)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesProfileProperties_ProfileSectionLocation()
	 * @model
	 * @generated
	 */
	IfcShapeAspect getProfileSectionLocation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssociatesProfileProperties#getProfileSectionLocation <em>Profile Section Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Section Location</em>' reference.
	 * @see #getProfileSectionLocation()
	 * @generated
	 */
	void setProfileSectionLocation(IfcShapeAspect value);

	/**
	 * Returns the value of the '<em><b>Relating Profile Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Profile Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Profile Properties</em>' reference.
	 * @see #setRelatingProfileProperties(IfcProfileProperties)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesProfileProperties_RelatingProfileProperties()
	 * @model required="true"
	 * @generated
	 */
	IfcProfileProperties getRelatingProfileProperties();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssociatesProfileProperties#getRelatingProfileProperties <em>Relating Profile Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Profile Properties</em>' reference.
	 * @see #getRelatingProfileProperties()
	 * @generated
	 */
	void setRelatingProfileProperties(IfcProfileProperties value);

} // IfcRelAssociatesProfileProperties
