/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcPixelTextureImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Pixel Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPixelTexture#getWidth <em>Width</em>}</li>
 *   <li>{@link IFC2X3.IfcPixelTexture#getHeight <em>Height</em>}</li>
 *   <li>{@link IFC2X3.IfcPixelTexture#getColourComponents <em>Colour Components</em>}</li>
 *   <li>{@link IFC2X3.IfcPixelTexture#getPixel <em>Pixel</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPixelTexture()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPixelTextureImplAdapter.class)
public interface IfcPixelTexture extends IfcSurfaceTexture {
	/**
	 * Returns the value of the '<em><b>Pixel</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Byte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pixel</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pixel</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcPixelTexture_Pixel()
	 * @model unique="false" dataType="IFC2X3.BINARY" required="true"
	 * @generated
	 */
	EList<Byte> getPixel();

	/**
	 * Returns the value of the '<em><b>Colour Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour Components</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour Components</em>' attribute.
	 * @see #isSetColourComponents()
	 * @see #unsetColourComponents()
	 * @see #setColourComponents(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcPixelTexture_ColourComponents()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getColourComponents();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPixelTexture#getColourComponents <em>Colour Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Components</em>' attribute.
	 * @see #isSetColourComponents()
	 * @see #unsetColourComponents()
	 * @see #getColourComponents()
	 * @generated
	 */
	void setColourComponents(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPixelTexture#getColourComponents <em>Colour Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColourComponents()
	 * @see #getColourComponents()
	 * @see #setColourComponents(Integer)
	 * @generated
	 */
	void unsetColourComponents();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPixelTexture#getColourComponents <em>Colour Components</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Colour Components</em>' attribute is set.
	 * @see #unsetColourComponents()
	 * @see #getColourComponents()
	 * @see #setColourComponents(Integer)
	 * @generated
	 */
	boolean isSetColourComponents();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #setHeight(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcPixelTexture_Height()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getHeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPixelTexture#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPixelTexture#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeight()
	 * @see #getHeight()
	 * @see #setHeight(Integer)
	 * @generated
	 */
	void unsetHeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPixelTexture#getHeight <em>Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Height</em>' attribute is set.
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @see #setHeight(Integer)
	 * @generated
	 */
	boolean isSetHeight();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #setWidth(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcPixelTexture_Width()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPixelTexture#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPixelTexture#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(Integer)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPixelTexture#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(Integer)
	 * @generated
	 */
	boolean isSetWidth();

} // IfcPixelTexture
