/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcSurfaceStyleWithTexturesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style With Textures</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSurfaceStyleWithTextures#getTextures <em>Textures</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleWithTextures()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSurfaceStyleWithTexturesImplAdapter.class)
public interface IfcSurfaceStyleWithTextures extends IfcSurfaceStyleElementSelect {
	/**
	 * Returns the value of the '<em><b>Textures</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcSurfaceTexture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textures</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleWithTextures_Textures()
	 * @model required="true"
	 * @generated
	 */
	EList<IfcSurfaceTexture> getTextures();

} // IfcSurfaceStyleWithTextures
