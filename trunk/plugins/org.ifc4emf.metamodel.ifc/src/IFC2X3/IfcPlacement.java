/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPlacementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPlacement#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPlacement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPlacementImplAdapter.class)
public interface IfcPlacement extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(IfcCartesianPoint)
	 * @see IFC2X3.IFC2X3Package#getIfcPlacement_Location()
	 * @model required="true"
	 * @generated
	 */
	IfcCartesianPoint getLocation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPlacement#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(IfcCartesianPoint value);

} // IfcPlacement
