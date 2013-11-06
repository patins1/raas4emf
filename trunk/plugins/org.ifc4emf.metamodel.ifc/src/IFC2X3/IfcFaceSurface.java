/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcFaceSurfaceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Face Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFaceSurface#getFaceSurface <em>Face Surface</em>}</li>
 *   <li>{@link IFC2X3.IfcFaceSurface#getSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFaceSurface()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFaceSurfaceImplAdapter.class)
public interface IfcFaceSurface extends IfcSurfaceOrFaceSurface, IfcFace {
	/**
	 * Returns the value of the '<em><b>Face Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face Surface</em>' reference.
	 * @see #setFaceSurface(IfcSurface)
	 * @see IFC2X3.IFC2X3Package#getIfcFaceSurface_FaceSurface()
	 * @model required="true"
	 * @generated
	 */
	IfcSurface getFaceSurface();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFaceSurface#getFaceSurface <em>Face Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Face Surface</em>' reference.
	 * @see #getFaceSurface()
	 * @generated
	 */
	void setFaceSurface(IfcSurface value);

	/**
	 * Returns the value of the '<em><b>Same Sense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Sense</em>' attribute.
	 * @see #isSetSameSense()
	 * @see #unsetSameSense()
	 * @see #setSameSense(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcFaceSurface_SameSense()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getSameSense();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFaceSurface#getSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Sense</em>' attribute.
	 * @see #isSetSameSense()
	 * @see #unsetSameSense()
	 * @see #getSameSense()
	 * @generated
	 */
	void setSameSense(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFaceSurface#getSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSameSense()
	 * @see #getSameSense()
	 * @see #setSameSense(Boolean)
	 * @generated
	 */
	void unsetSameSense();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFaceSurface#getSameSense <em>Same Sense</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Same Sense</em>' attribute is set.
	 * @see #unsetSameSense()
	 * @see #getSameSense()
	 * @see #setSameSense(Boolean)
	 * @generated
	 */
	boolean isSetSameSense();

} // IfcFaceSurface
