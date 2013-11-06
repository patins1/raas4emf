/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcObjectPlacementImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Object Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcObjectPlacement#getPlacesObject <em>Places Object</em>}</li>
 *   <li>{@link IFC2X3.IfcObjectPlacement#getReferencedByPlacements <em>Referenced By Placements</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcObjectPlacement()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcObjectPlacementImplAdapter.class)
public interface IfcObjectPlacement extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Places Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcProduct#getObjectPlacement <em>Object Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places Object</em>' reference.
	 * @see #setPlacesObject(IfcProduct)
	 * @see IFC2X3.IFC2X3Package#getIfcObjectPlacement_PlacesObject()
	 * @see IFC2X3.IfcProduct#getObjectPlacement
	 * @model opposite="ObjectPlacement" required="true" ordered="false"
	 * @generated
	 */
	IfcProduct getPlacesObject();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcObjectPlacement#getPlacesObject <em>Places Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Places Object</em>' reference.
	 * @see #getPlacesObject()
	 * @generated
	 */
	void setPlacesObject(IfcProduct value);

	/**
	 * Returns the value of the '<em><b>Referenced By Placements</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcLocalPlacement}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcLocalPlacement#getPlacementRelTo <em>Placement Rel To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced By Placements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By Placements</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcObjectPlacement_ReferencedByPlacements()
	 * @see IFC2X3.IfcLocalPlacement#getPlacementRelTo
	 * @model opposite="PlacementRelTo" ordered="false"
	 * @generated
	 */
	EList<IfcLocalPlacement> getReferencedByPlacements();

} // IfcObjectPlacement
