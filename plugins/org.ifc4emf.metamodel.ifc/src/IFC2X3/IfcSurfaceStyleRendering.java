/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSurfaceStyleRenderingImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style Rendering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSurfaceStyleRendering#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceStyleRendering#getDiffuseColour <em>Diffuse Colour</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceStyleRendering#getTransmissionColour <em>Transmission Colour</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceStyleRendering#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceStyleRendering#getReflectionColour <em>Reflection Colour</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceStyleRendering#getSpecularColour <em>Specular Colour</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceStyleRendering#getSpecularHighlight <em>Specular Highlight</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceStyleRendering#getReflectanceMethod <em>Reflectance Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleRendering()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSurfaceStyleRenderingImplAdapter.class)
public interface IfcSurfaceStyleRendering extends IfcSurfaceStyleShading {
	/**
	 * Returns the value of the '<em><b>Diffuse Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Colour</em>' containment reference.
	 * @see #setDiffuseColour(IfcColourOrFactor)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleRendering_DiffuseColour()
	 * @model containment="true"
	 * @generated
	 */
	IfcColourOrFactor getDiffuseColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleRendering#getDiffuseColour <em>Diffuse Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Colour</em>' containment reference.
	 * @see #getDiffuseColour()
	 * @generated
	 */
	void setDiffuseColour(IfcColourOrFactor value);

	/**
	 * Returns the value of the '<em><b>Transmission Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Colour</em>' containment reference.
	 * @see #setTransmissionColour(IfcColourOrFactor)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleRendering_TransmissionColour()
	 * @model containment="true"
	 * @generated
	 */
	IfcColourOrFactor getTransmissionColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleRendering#getTransmissionColour <em>Transmission Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Colour</em>' containment reference.
	 * @see #getTransmissionColour()
	 * @generated
	 */
	void setTransmissionColour(IfcColourOrFactor value);

	/**
	 * Returns the value of the '<em><b>Diffuse Transmission Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Transmission Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Transmission Colour</em>' containment reference.
	 * @see #setDiffuseTransmissionColour(IfcColourOrFactor)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleRendering_DiffuseTransmissionColour()
	 * @model containment="true"
	 * @generated
	 */
	IfcColourOrFactor getDiffuseTransmissionColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleRendering#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Transmission Colour</em>' containment reference.
	 * @see #getDiffuseTransmissionColour()
	 * @generated
	 */
	void setDiffuseTransmissionColour(IfcColourOrFactor value);

	/**
	 * Returns the value of the '<em><b>Reflection Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflection Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflection Colour</em>' containment reference.
	 * @see #setReflectionColour(IfcColourOrFactor)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleRendering_ReflectionColour()
	 * @model containment="true"
	 * @generated
	 */
	IfcColourOrFactor getReflectionColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleRendering#getReflectionColour <em>Reflection Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflection Colour</em>' containment reference.
	 * @see #getReflectionColour()
	 * @generated
	 */
	void setReflectionColour(IfcColourOrFactor value);

	/**
	 * Returns the value of the '<em><b>Specular Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specular Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specular Colour</em>' containment reference.
	 * @see #setSpecularColour(IfcColourOrFactor)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleRendering_SpecularColour()
	 * @model containment="true"
	 * @generated
	 */
	IfcColourOrFactor getSpecularColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleRendering#getSpecularColour <em>Specular Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular Colour</em>' containment reference.
	 * @see #getSpecularColour()
	 * @generated
	 */
	void setSpecularColour(IfcColourOrFactor value);

	/**
	 * Returns the value of the '<em><b>Specular Highlight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specular Highlight</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specular Highlight</em>' containment reference.
	 * @see #setSpecularHighlight(IfcSpecularHighlightSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleRendering_SpecularHighlight()
	 * @model containment="true"
	 * @generated
	 */
	IfcSpecularHighlightSelect getSpecularHighlight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleRendering#getSpecularHighlight <em>Specular Highlight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular Highlight</em>' containment reference.
	 * @see #getSpecularHighlight()
	 * @generated
	 */
	void setSpecularHighlight(IfcSpecularHighlightSelect value);

	/**
	 * Returns the value of the '<em><b>Reflectance Method</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcReflectanceMethodEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflectance Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflectance Method</em>' attribute.
	 * @see IFC2X3.IfcReflectanceMethodEnum
	 * @see #isSetReflectanceMethod()
	 * @see #unsetReflectanceMethod()
	 * @see #setReflectanceMethod(IfcReflectanceMethodEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleRendering_ReflectanceMethod()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcReflectanceMethodEnum getReflectanceMethod();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleRendering#getReflectanceMethod <em>Reflectance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflectance Method</em>' attribute.
	 * @see IFC2X3.IfcReflectanceMethodEnum
	 * @see #isSetReflectanceMethod()
	 * @see #unsetReflectanceMethod()
	 * @see #getReflectanceMethod()
	 * @generated
	 */
	void setReflectanceMethod(IfcReflectanceMethodEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSurfaceStyleRendering#getReflectanceMethod <em>Reflectance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReflectanceMethod()
	 * @see #getReflectanceMethod()
	 * @see #setReflectanceMethod(IfcReflectanceMethodEnum)
	 * @generated
	 */
	void unsetReflectanceMethod();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSurfaceStyleRendering#getReflectanceMethod <em>Reflectance Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reflectance Method</em>' attribute is set.
	 * @see #unsetReflectanceMethod()
	 * @see #getReflectanceMethod()
	 * @see #setReflectanceMethod(IfcReflectanceMethodEnum)
	 * @generated
	 */
	boolean isSetReflectanceMethod();

	/**
	 * Returns the value of the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparency</em>' attribute.
	 * @see #isSetTransparency()
	 * @see #unsetTransparency()
	 * @see #setTransparency(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleRendering_Transparency()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTransparency();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleRendering#getTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparency</em>' attribute.
	 * @see #isSetTransparency()
	 * @see #unsetTransparency()
	 * @see #getTransparency()
	 * @generated
	 */
	void setTransparency(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSurfaceStyleRendering#getTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransparency()
	 * @see #getTransparency()
	 * @see #setTransparency(Double)
	 * @generated
	 */
	void unsetTransparency();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSurfaceStyleRendering#getTransparency <em>Transparency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transparency</em>' attribute is set.
	 * @see #unsetTransparency()
	 * @see #getTransparency()
	 * @see #setTransparency(Double)
	 * @generated
	 */
	boolean isSetTransparency();

} // IfcSurfaceStyleRendering
