/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcConnectionSurfaceGeometryImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connection Surface Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcConnectionSurfaceGeometry#getSurfaceOnRelatingElement <em>Surface On Relating Element</em>}</li>
 *   <li>{@link IFC2X3.IfcConnectionSurfaceGeometry#getSurfaceOnRelatedElement <em>Surface On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcConnectionSurfaceGeometry()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcConnectionSurfaceGeometryImplAdapter.class)
public interface IfcConnectionSurfaceGeometry extends IfcConnectionGeometry {
	/**
	 * Returns the value of the '<em><b>Surface On Relating Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface On Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface On Relating Element</em>' reference.
	 * @see #setSurfaceOnRelatingElement(IfcSurfaceOrFaceSurface)
	 * @see IFC2X3.IFC2X3Package#getIfcConnectionSurfaceGeometry_SurfaceOnRelatingElement()
	 * @model required="true"
	 * @generated
	 */
	IfcSurfaceOrFaceSurface getSurfaceOnRelatingElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConnectionSurfaceGeometry#getSurfaceOnRelatingElement <em>Surface On Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface On Relating Element</em>' reference.
	 * @see #getSurfaceOnRelatingElement()
	 * @generated
	 */
	void setSurfaceOnRelatingElement(IfcSurfaceOrFaceSurface value);

	/**
	 * Returns the value of the '<em><b>Surface On Related Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface On Related Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface On Related Element</em>' reference.
	 * @see #setSurfaceOnRelatedElement(IfcSurfaceOrFaceSurface)
	 * @see IFC2X3.IFC2X3Package#getIfcConnectionSurfaceGeometry_SurfaceOnRelatedElement()
	 * @model
	 * @generated
	 */
	IfcSurfaceOrFaceSurface getSurfaceOnRelatedElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConnectionSurfaceGeometry#getSurfaceOnRelatedElement <em>Surface On Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface On Related Element</em>' reference.
	 * @see #getSurfaceOnRelatedElement()
	 * @generated
	 */
	void setSurfaceOnRelatedElement(IfcSurfaceOrFaceSurface value);

} // IfcConnectionSurfaceGeometry
