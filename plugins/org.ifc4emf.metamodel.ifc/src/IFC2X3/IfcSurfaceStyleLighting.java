/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSurfaceStyleLightingImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style Lighting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSurfaceStyleLighting#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceStyleLighting#getDiffuseReflectionColour <em>Diffuse Reflection Colour</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceStyleLighting#getTransmissionColour <em>Transmission Colour</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceStyleLighting#getReflectanceColour <em>Reflectance Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleLighting()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSurfaceStyleLightingImplAdapter.class)
public interface IfcSurfaceStyleLighting extends IfcSurfaceStyleElementSelect {
	/**
	 * Returns the value of the '<em><b>Reflectance Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflectance Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflectance Colour</em>' reference.
	 * @see #setReflectanceColour(IfcColourRgb)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleLighting_ReflectanceColour()
	 * @model required="true"
	 * @generated
	 */
	IfcColourRgb getReflectanceColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleLighting#getReflectanceColour <em>Reflectance Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflectance Colour</em>' reference.
	 * @see #getReflectanceColour()
	 * @generated
	 */
	void setReflectanceColour(IfcColourRgb value);

	/**
	 * Returns the value of the '<em><b>Diffuse Transmission Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Transmission Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Transmission Colour</em>' reference.
	 * @see #setDiffuseTransmissionColour(IfcColourRgb)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleLighting_DiffuseTransmissionColour()
	 * @model required="true"
	 * @generated
	 */
	IfcColourRgb getDiffuseTransmissionColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleLighting#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Transmission Colour</em>' reference.
	 * @see #getDiffuseTransmissionColour()
	 * @generated
	 */
	void setDiffuseTransmissionColour(IfcColourRgb value);

	/**
	 * Returns the value of the '<em><b>Transmission Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Colour</em>' reference.
	 * @see #setTransmissionColour(IfcColourRgb)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleLighting_TransmissionColour()
	 * @model required="true"
	 * @generated
	 */
	IfcColourRgb getTransmissionColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleLighting#getTransmissionColour <em>Transmission Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Colour</em>' reference.
	 * @see #getTransmissionColour()
	 * @generated
	 */
	void setTransmissionColour(IfcColourRgb value);

	/**
	 * Returns the value of the '<em><b>Diffuse Reflection Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Reflection Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Reflection Colour</em>' reference.
	 * @see #setDiffuseReflectionColour(IfcColourRgb)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleLighting_DiffuseReflectionColour()
	 * @model required="true"
	 * @generated
	 */
	IfcColourRgb getDiffuseReflectionColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleLighting#getDiffuseReflectionColour <em>Diffuse Reflection Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Reflection Colour</em>' reference.
	 * @see #getDiffuseReflectionColour()
	 * @generated
	 */
	void setDiffuseReflectionColour(IfcColourRgb value);

} // IfcSurfaceStyleLighting
