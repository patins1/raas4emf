/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcBuilding;
import IFC2X3.IfcPostalAddress;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Building</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcBuildingImpl#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBuildingImpl#getElevationOfTerrain <em>Elevation Of Terrain</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBuildingImpl#getBuildingAddress <em>Building Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBuilding")
@XmlRootElement(name = "IfcBuildingElement")
public class IfcBuildingImpl extends IfcSpatialStructureElementImpl implements IfcBuilding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBuildingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBuilding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPostalAddress getBuildingAddress() {
		return (IfcPostalAddress)eGet(IFC2X3Package.eINSTANCE.getIfcBuilding_BuildingAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingAddress(IfcPostalAddress newBuildingAddress) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBuilding_BuildingAddress(), newBuildingAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getElevationOfTerrain() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBuilding_ElevationOfTerrain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationOfTerrain(Double newElevationOfTerrain) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBuilding_ElevationOfTerrain(), newElevationOfTerrain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElevationOfTerrain() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBuilding_ElevationOfTerrain());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElevationOfTerrain() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBuilding_ElevationOfTerrain());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getElevationOfRefHeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBuilding_ElevationOfRefHeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationOfRefHeight(Double newElevationOfRefHeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBuilding_ElevationOfRefHeight(), newElevationOfRefHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElevationOfRefHeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBuilding_ElevationOfRefHeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElevationOfRefHeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBuilding_ElevationOfRefHeight());
	}

} //IfcBuildingImpl
