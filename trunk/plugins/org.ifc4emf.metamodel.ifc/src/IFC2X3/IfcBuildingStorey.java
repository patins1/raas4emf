/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBuildingStoreyImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Building Storey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcBuildingStorey#getElevation <em>Elevation</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcBuildingStorey()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBuildingStoreyImplAdapter.class)
public interface IfcBuildingStorey extends IfcSpatialStructureElement {
	/**
	 * Returns the value of the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation</em>' attribute.
	 * @see #isSetElevation()
	 * @see #unsetElevation()
	 * @see #setElevation(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBuildingStorey_Elevation()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getElevation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBuildingStorey#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' attribute.
	 * @see #isSetElevation()
	 * @see #unsetElevation()
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBuildingStorey#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElevation()
	 * @see #getElevation()
	 * @see #setElevation(Double)
	 * @generated
	 */
	void unsetElevation();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBuildingStorey#getElevation <em>Elevation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elevation</em>' attribute is set.
	 * @see #unsetElevation()
	 * @see #getElevation()
	 * @see #setElevation(Double)
	 * @generated
	 */
	boolean isSetElevation();

} // IfcBuildingStorey
