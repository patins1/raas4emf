/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBlobTextureImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Blob Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcBlobTexture#getRasterFormat <em>Raster Format</em>}</li>
 *   <li>{@link IFC2X3.IfcBlobTexture#getRasterCode <em>Raster Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcBlobTexture()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBlobTextureImplAdapter.class)
public interface IfcBlobTexture extends IfcSurfaceTexture {
	/**
	 * Returns the value of the '<em><b>Raster Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raster Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raster Code</em>' attribute.
	 * @see #isSetRasterCode()
	 * @see #unsetRasterCode()
	 * @see #setRasterCode(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcBlobTexture_RasterCode()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getRasterCode();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBlobTexture#getRasterCode <em>Raster Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raster Code</em>' attribute.
	 * @see #isSetRasterCode()
	 * @see #unsetRasterCode()
	 * @see #getRasterCode()
	 * @generated
	 */
	void setRasterCode(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBlobTexture#getRasterCode <em>Raster Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRasterCode()
	 * @see #getRasterCode()
	 * @see #setRasterCode(Boolean)
	 * @generated
	 */
	void unsetRasterCode();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBlobTexture#getRasterCode <em>Raster Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Raster Code</em>' attribute is set.
	 * @see #unsetRasterCode()
	 * @see #getRasterCode()
	 * @see #setRasterCode(Boolean)
	 * @generated
	 */
	boolean isSetRasterCode();

	/**
	 * Returns the value of the '<em><b>Raster Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raster Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raster Format</em>' attribute.
	 * @see #isSetRasterFormat()
	 * @see #unsetRasterFormat()
	 * @see #setRasterFormat(String)
	 * @see IFC2X3.IFC2X3Package#getIfcBlobTexture_RasterFormat()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getRasterFormat();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBlobTexture#getRasterFormat <em>Raster Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raster Format</em>' attribute.
	 * @see #isSetRasterFormat()
	 * @see #unsetRasterFormat()
	 * @see #getRasterFormat()
	 * @generated
	 */
	void setRasterFormat(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBlobTexture#getRasterFormat <em>Raster Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRasterFormat()
	 * @see #getRasterFormat()
	 * @see #setRasterFormat(String)
	 * @generated
	 */
	void unsetRasterFormat();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBlobTexture#getRasterFormat <em>Raster Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Raster Format</em>' attribute is set.
	 * @see #unsetRasterFormat()
	 * @see #getRasterFormat()
	 * @see #setRasterFormat(String)
	 * @generated
	 */
	boolean isSetRasterFormat();

} // IfcBlobTexture
