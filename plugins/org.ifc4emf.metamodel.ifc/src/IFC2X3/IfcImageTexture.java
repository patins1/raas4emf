/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcImageTextureImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Image Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcImageTexture#getUrlReference <em>Url Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcImageTexture()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcImageTextureImplAdapter.class)
public interface IfcImageTexture extends IfcSurfaceTexture {
	/**
	 * Returns the value of the '<em><b>Url Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Reference</em>' attribute.
	 * @see #isSetUrlReference()
	 * @see #unsetUrlReference()
	 * @see #setUrlReference(String)
	 * @see IFC2X3.IFC2X3Package#getIfcImageTexture_UrlReference()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getUrlReference();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcImageTexture#getUrlReference <em>Url Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Reference</em>' attribute.
	 * @see #isSetUrlReference()
	 * @see #unsetUrlReference()
	 * @see #getUrlReference()
	 * @generated
	 */
	void setUrlReference(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcImageTexture#getUrlReference <em>Url Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUrlReference()
	 * @see #getUrlReference()
	 * @see #setUrlReference(String)
	 * @generated
	 */
	void unsetUrlReference();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcImageTexture#getUrlReference <em>Url Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Url Reference</em>' attribute is set.
	 * @see #unsetUrlReference()
	 * @see #getUrlReference()
	 * @see #setUrlReference(String)
	 * @generated
	 */
	boolean isSetUrlReference();

} // IfcImageTexture
