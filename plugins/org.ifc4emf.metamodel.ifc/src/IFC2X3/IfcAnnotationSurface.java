/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcAnnotationSurfaceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Annotation Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcAnnotationSurface#getItem <em>Item</em>}</li>
 *   <li>{@link IFC2X3.IfcAnnotationSurface#getTextureCoordinates <em>Texture Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcAnnotationSurface()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAnnotationSurfaceImplAdapter.class)
public interface IfcAnnotationSurface extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(IfcGeometricRepresentationItem)
	 * @see IFC2X3.IFC2X3Package#getIfcAnnotationSurface_Item()
	 * @model required="true"
	 * @generated
	 */
	IfcGeometricRepresentationItem getItem();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAnnotationSurface#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(IfcGeometricRepresentationItem value);

	/**
	 * Returns the value of the '<em><b>Texture Coordinates</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcTextureCoordinate#getAnnotatedSurface <em>Annotated Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Coordinates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Coordinates</em>' reference.
	 * @see #setTextureCoordinates(IfcTextureCoordinate)
	 * @see IFC2X3.IFC2X3Package#getIfcAnnotationSurface_TextureCoordinates()
	 * @see IFC2X3.IfcTextureCoordinate#getAnnotatedSurface
	 * @model opposite="AnnotatedSurface"
	 * @generated
	 */
	IfcTextureCoordinate getTextureCoordinates();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAnnotationSurface#getTextureCoordinates <em>Texture Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Coordinates</em>' reference.
	 * @see #getTextureCoordinates()
	 * @generated
	 */
	void setTextureCoordinates(IfcTextureCoordinate value);

} // IfcAnnotationSurface
