/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcGridPlacementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Grid Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcGridPlacement#getPlacementLocation <em>Placement Location</em>}</li>
 *   <li>{@link IFC2X3.IfcGridPlacement#getPlacementRefDirection <em>Placement Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcGridPlacement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcGridPlacementImplAdapter.class)
public interface IfcGridPlacement extends IfcObjectPlacement {
	/**
	 * Returns the value of the '<em><b>Placement Ref Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement Ref Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Ref Direction</em>' reference.
	 * @see #setPlacementRefDirection(IfcVirtualGridIntersection)
	 * @see IFC2X3.IFC2X3Package#getIfcGridPlacement_PlacementRefDirection()
	 * @model
	 * @generated
	 */
	IfcVirtualGridIntersection getPlacementRefDirection();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGridPlacement#getPlacementRefDirection <em>Placement Ref Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Ref Direction</em>' reference.
	 * @see #getPlacementRefDirection()
	 * @generated
	 */
	void setPlacementRefDirection(IfcVirtualGridIntersection value);

	/**
	 * Returns the value of the '<em><b>Placement Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Location</em>' reference.
	 * @see #setPlacementLocation(IfcVirtualGridIntersection)
	 * @see IFC2X3.IFC2X3Package#getIfcGridPlacement_PlacementLocation()
	 * @model required="true"
	 * @generated
	 */
	IfcVirtualGridIntersection getPlacementLocation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGridPlacement#getPlacementLocation <em>Placement Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Location</em>' reference.
	 * @see #getPlacementLocation()
	 * @generated
	 */
	void setPlacementLocation(IfcVirtualGridIntersection value);

} // IfcGridPlacement
