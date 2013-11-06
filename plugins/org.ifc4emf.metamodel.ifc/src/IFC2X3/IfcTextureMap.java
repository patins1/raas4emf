/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcTextureMapImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Texture Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTextureMap#getTextureMaps <em>Texture Maps</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTextureMap()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTextureMapImplAdapter.class)
public interface IfcTextureMap extends IfcTextureCoordinate {
	/**
	 * Returns the value of the '<em><b>Texture Maps</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcVertexBasedTextureMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Maps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Maps</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcTextureMap_TextureMaps()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcVertexBasedTextureMap> getTextureMaps();

} // IfcTextureMap
