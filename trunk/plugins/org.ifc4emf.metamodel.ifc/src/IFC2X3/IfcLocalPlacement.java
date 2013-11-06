/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcLocalPlacementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Local Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLocalPlacement#getPlacementRelTo <em>Placement Rel To</em>}</li>
 *   <li>{@link IFC2X3.IfcLocalPlacement#getRelativePlacement <em>Relative Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLocalPlacement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcLocalPlacementImplAdapter.class)
public interface IfcLocalPlacement extends IfcObjectPlacement {
	/**
	 * Returns the value of the '<em><b>Placement Rel To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcObjectPlacement#getReferencedByPlacements <em>Referenced By Placements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement Rel To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Rel To</em>' reference.
	 * @see #setPlacementRelTo(IfcObjectPlacement)
	 * @see IFC2X3.IFC2X3Package#getIfcLocalPlacement_PlacementRelTo()
	 * @see IFC2X3.IfcObjectPlacement#getReferencedByPlacements
	 * @model opposite="ReferencedByPlacements"
	 * @generated
	 */
	IfcObjectPlacement getPlacementRelTo();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLocalPlacement#getPlacementRelTo <em>Placement Rel To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Rel To</em>' reference.
	 * @see #getPlacementRelTo()
	 * @generated
	 */
	void setPlacementRelTo(IfcObjectPlacement value);

	/**
	 * Returns the value of the '<em><b>Relative Placement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Placement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Placement</em>' reference.
	 * @see #setRelativePlacement(IfcAxis2Placement)
	 * @see IFC2X3.IFC2X3Package#getIfcLocalPlacement_RelativePlacement()
	 * @model required="true"
	 * @generated
	 */
	IfcAxis2Placement getRelativePlacement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLocalPlacement#getRelativePlacement <em>Relative Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Placement</em>' reference.
	 * @see #getRelativePlacement()
	 * @generated
	 */
	void setRelativePlacement(IfcAxis2Placement value);

} // IfcLocalPlacement
