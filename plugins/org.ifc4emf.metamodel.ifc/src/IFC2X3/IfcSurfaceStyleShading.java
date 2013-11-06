/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSurfaceStyleShadingImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style Shading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSurfaceStyleShading#getSurfaceColour <em>Surface Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleShading()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSurfaceStyleShadingImplAdapter.class)
public interface IfcSurfaceStyleShading extends IfcSurfaceStyleElementSelect {
	/**
	 * Returns the value of the '<em><b>Surface Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Colour</em>' reference.
	 * @see #setSurfaceColour(IfcColourRgb)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleShading_SurfaceColour()
	 * @model required="true"
	 * @generated
	 */
	IfcColourRgb getSurfaceColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleShading#getSurfaceColour <em>Surface Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Colour</em>' reference.
	 * @see #getSurfaceColour()
	 * @generated
	 */
	void setSurfaceColour(IfcColourRgb value);

} // IfcSurfaceStyleShading
