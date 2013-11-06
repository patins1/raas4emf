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
import IFC2X3.IfcBuildingStorey;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Building Storey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcBuildingStoreyImpl#getElevation <em>Elevation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBuildingStorey")
@XmlRootElement(name = "IfcBuildingStoreyElement")
public class IfcBuildingStoreyImpl extends IfcSpatialStructureElementImpl implements IfcBuildingStorey {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBuildingStoreyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBuildingStorey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getElevation() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBuildingStorey_Elevation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevation(Double newElevation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBuildingStorey_Elevation(), newElevation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElevation() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBuildingStorey_Elevation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElevation() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBuildingStorey_Elevation());
	}

} //IfcBuildingStoreyImpl
