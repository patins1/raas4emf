/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcVertexBasedTextureMapImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Vertex Based Texture Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcVertexBasedTextureMap#getTextureVertices <em>Texture Vertices</em>}</li>
 *   <li>{@link IFC2X3.IfcVertexBasedTextureMap#getTexturePoints <em>Texture Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcVertexBasedTextureMap()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcVertexBasedTextureMapImplAdapter.class)
public interface IfcVertexBasedTextureMap extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Texture Vertices</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcTextureVertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Vertices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Vertices</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcVertexBasedTextureMap_TextureVertices()
	 * @model lower="3"
	 * @generated
	 */
	EList<IfcTextureVertex> getTextureVertices();

	/**
	 * Returns the value of the '<em><b>Texture Points</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcCartesianPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Points</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcVertexBasedTextureMap_TexturePoints()
	 * @model lower="3"
	 * @generated
	 */
	EList<IfcCartesianPoint> getTexturePoints();

} // IfcVertexBasedTextureMap
