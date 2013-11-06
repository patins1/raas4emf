/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcConnectionPointGeometryImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connection Point Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcConnectionPointGeometry#getPointOnRelatingElement <em>Point On Relating Element</em>}</li>
 *   <li>{@link IFC2X3.IfcConnectionPointGeometry#getPointOnRelatedElement <em>Point On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcConnectionPointGeometry()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcConnectionPointGeometryImplAdapter.class)
public interface IfcConnectionPointGeometry extends IfcConnectionGeometry {
	/**
	 * Returns the value of the '<em><b>Point On Relating Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point On Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point On Relating Element</em>' reference.
	 * @see #setPointOnRelatingElement(IfcPointOrVertexPoint)
	 * @see IFC2X3.IFC2X3Package#getIfcConnectionPointGeometry_PointOnRelatingElement()
	 * @model required="true"
	 * @generated
	 */
	IfcPointOrVertexPoint getPointOnRelatingElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConnectionPointGeometry#getPointOnRelatingElement <em>Point On Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point On Relating Element</em>' reference.
	 * @see #getPointOnRelatingElement()
	 * @generated
	 */
	void setPointOnRelatingElement(IfcPointOrVertexPoint value);

	/**
	 * Returns the value of the '<em><b>Point On Related Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point On Related Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point On Related Element</em>' reference.
	 * @see #setPointOnRelatedElement(IfcPointOrVertexPoint)
	 * @see IFC2X3.IFC2X3Package#getIfcConnectionPointGeometry_PointOnRelatedElement()
	 * @model
	 * @generated
	 */
	IfcPointOrVertexPoint getPointOnRelatedElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConnectionPointGeometry#getPointOnRelatedElement <em>Point On Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point On Related Element</em>' reference.
	 * @see #getPointOnRelatedElement()
	 * @generated
	 */
	void setPointOnRelatedElement(IfcPointOrVertexPoint value);

} // IfcConnectionPointGeometry
