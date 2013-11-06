/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBuildingImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcBuilding#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}</li>
 *   <li>{@link IFC2X3.IfcBuilding#getElevationOfTerrain <em>Elevation Of Terrain</em>}</li>
 *   <li>{@link IFC2X3.IfcBuilding#getBuildingAddress <em>Building Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcBuilding()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBuildingImplAdapter.class)
public interface IfcBuilding extends IfcSpatialStructureElement {
	/**
	 * Returns the value of the '<em><b>Building Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Address</em>' reference.
	 * @see #setBuildingAddress(IfcPostalAddress)
	 * @see IFC2X3.IFC2X3Package#getIfcBuilding_BuildingAddress()
	 * @model
	 * @generated
	 */
	IfcPostalAddress getBuildingAddress();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBuilding#getBuildingAddress <em>Building Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Address</em>' reference.
	 * @see #getBuildingAddress()
	 * @generated
	 */
	void setBuildingAddress(IfcPostalAddress value);

	/**
	 * Returns the value of the '<em><b>Elevation Of Terrain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation Of Terrain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation Of Terrain</em>' attribute.
	 * @see #isSetElevationOfTerrain()
	 * @see #unsetElevationOfTerrain()
	 * @see #setElevationOfTerrain(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBuilding_ElevationOfTerrain()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getElevationOfTerrain();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBuilding#getElevationOfTerrain <em>Elevation Of Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Of Terrain</em>' attribute.
	 * @see #isSetElevationOfTerrain()
	 * @see #unsetElevationOfTerrain()
	 * @see #getElevationOfTerrain()
	 * @generated
	 */
	void setElevationOfTerrain(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBuilding#getElevationOfTerrain <em>Elevation Of Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElevationOfTerrain()
	 * @see #getElevationOfTerrain()
	 * @see #setElevationOfTerrain(Double)
	 * @generated
	 */
	void unsetElevationOfTerrain();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBuilding#getElevationOfTerrain <em>Elevation Of Terrain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elevation Of Terrain</em>' attribute is set.
	 * @see #unsetElevationOfTerrain()
	 * @see #getElevationOfTerrain()
	 * @see #setElevationOfTerrain(Double)
	 * @generated
	 */
	boolean isSetElevationOfTerrain();

	/**
	 * Returns the value of the '<em><b>Elevation Of Ref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation Of Ref Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation Of Ref Height</em>' attribute.
	 * @see #isSetElevationOfRefHeight()
	 * @see #unsetElevationOfRefHeight()
	 * @see #setElevationOfRefHeight(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBuilding_ElevationOfRefHeight()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getElevationOfRefHeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBuilding#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Of Ref Height</em>' attribute.
	 * @see #isSetElevationOfRefHeight()
	 * @see #unsetElevationOfRefHeight()
	 * @see #getElevationOfRefHeight()
	 * @generated
	 */
	void setElevationOfRefHeight(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBuilding#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElevationOfRefHeight()
	 * @see #getElevationOfRefHeight()
	 * @see #setElevationOfRefHeight(Double)
	 * @generated
	 */
	void unsetElevationOfRefHeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBuilding#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elevation Of Ref Height</em>' attribute is set.
	 * @see #unsetElevationOfRefHeight()
	 * @see #getElevationOfRefHeight()
	 * @see #setElevationOfRefHeight(Double)
	 * @generated
	 */
	boolean isSetElevationOfRefHeight();

} // IfcBuilding
