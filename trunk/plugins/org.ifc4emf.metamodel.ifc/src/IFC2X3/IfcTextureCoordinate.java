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

import IFC2X3.jaxb.IfcTextureCoordinateImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Texture Coordinate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTextureCoordinate#getAnnotatedSurface <em>Annotated Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTextureCoordinate()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcTextureCoordinateImplAdapter.class)
public interface IfcTextureCoordinate extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Annotated Surface</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcAnnotationSurface#getTextureCoordinates <em>Texture Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Surface</em>' reference.
	 * @see #setAnnotatedSurface(IfcAnnotationSurface)
	 * @see IFC2X3.IFC2X3Package#getIfcTextureCoordinate_AnnotatedSurface()
	 * @see IFC2X3.IfcAnnotationSurface#getTextureCoordinates
	 * @model opposite="TextureCoordinates" required="true" ordered="false"
	 * @generated
	 */
	IfcAnnotationSurface getAnnotatedSurface();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextureCoordinate#getAnnotatedSurface <em>Annotated Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Surface</em>' reference.
	 * @see #getAnnotatedSurface()
	 * @generated
	 */
	void setAnnotatedSurface(IfcAnnotationSurface value);

} // IfcTextureCoordinate
