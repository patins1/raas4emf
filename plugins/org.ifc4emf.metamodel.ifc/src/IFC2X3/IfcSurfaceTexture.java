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

import IFC2X3.jaxb.IfcSurfaceTextureImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSurfaceTexture#getRepeatS <em>Repeat S</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceTexture#getRepeatT <em>Repeat T</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceTexture#getTextureType <em>Texture Type</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceTexture#getTextureTransform <em>Texture Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSurfaceTexture()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcSurfaceTextureImplAdapter.class)
public interface IfcSurfaceTexture extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Texture Transform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Transform</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Transform</em>' reference.
	 * @see #setTextureTransform(IfcCartesianTransformationOperator2D)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceTexture_TextureTransform()
	 * @model
	 * @generated
	 */
	IfcCartesianTransformationOperator2D getTextureTransform();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceTexture#getTextureTransform <em>Texture Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Transform</em>' reference.
	 * @see #getTextureTransform()
	 * @generated
	 */
	void setTextureTransform(IfcCartesianTransformationOperator2D value);

	/**
	 * Returns the value of the '<em><b>Texture Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcSurfaceTextureEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Type</em>' attribute.
	 * @see IFC2X3.IfcSurfaceTextureEnum
	 * @see #isSetTextureType()
	 * @see #unsetTextureType()
	 * @see #setTextureType(IfcSurfaceTextureEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceTexture_TextureType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcSurfaceTextureEnum getTextureType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceTexture#getTextureType <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Type</em>' attribute.
	 * @see IFC2X3.IfcSurfaceTextureEnum
	 * @see #isSetTextureType()
	 * @see #unsetTextureType()
	 * @see #getTextureType()
	 * @generated
	 */
	void setTextureType(IfcSurfaceTextureEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSurfaceTexture#getTextureType <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextureType()
	 * @see #getTextureType()
	 * @see #setTextureType(IfcSurfaceTextureEnum)
	 * @generated
	 */
	void unsetTextureType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSurfaceTexture#getTextureType <em>Texture Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Texture Type</em>' attribute is set.
	 * @see #unsetTextureType()
	 * @see #getTextureType()
	 * @see #setTextureType(IfcSurfaceTextureEnum)
	 * @generated
	 */
	boolean isSetTextureType();

	/**
	 * Returns the value of the '<em><b>Repeat T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat T</em>' attribute.
	 * @see #isSetRepeatT()
	 * @see #unsetRepeatT()
	 * @see #setRepeatT(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceTexture_RepeatT()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getRepeatT();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceTexture#getRepeatT <em>Repeat T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat T</em>' attribute.
	 * @see #isSetRepeatT()
	 * @see #unsetRepeatT()
	 * @see #getRepeatT()
	 * @generated
	 */
	void setRepeatT(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSurfaceTexture#getRepeatT <em>Repeat T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepeatT()
	 * @see #getRepeatT()
	 * @see #setRepeatT(Boolean)
	 * @generated
	 */
	void unsetRepeatT();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSurfaceTexture#getRepeatT <em>Repeat T</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repeat T</em>' attribute is set.
	 * @see #unsetRepeatT()
	 * @see #getRepeatT()
	 * @see #setRepeatT(Boolean)
	 * @generated
	 */
	boolean isSetRepeatT();

	/**
	 * Returns the value of the '<em><b>Repeat S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat S</em>' attribute.
	 * @see #isSetRepeatS()
	 * @see #unsetRepeatS()
	 * @see #setRepeatS(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceTexture_RepeatS()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getRepeatS();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceTexture#getRepeatS <em>Repeat S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat S</em>' attribute.
	 * @see #isSetRepeatS()
	 * @see #unsetRepeatS()
	 * @see #getRepeatS()
	 * @generated
	 */
	void setRepeatS(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSurfaceTexture#getRepeatS <em>Repeat S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepeatS()
	 * @see #getRepeatS()
	 * @see #setRepeatS(Boolean)
	 * @generated
	 */
	void unsetRepeatS();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSurfaceTexture#getRepeatS <em>Repeat S</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repeat S</em>' attribute is set.
	 * @see #unsetRepeatS()
	 * @see #getRepeatS()
	 * @see #setRepeatS(Boolean)
	 * @generated
	 */
	boolean isSetRepeatS();

} // IfcSurfaceTexture
