/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcLightDistributionData;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Distribution Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcLightDistributionDataImpl#getMainPlaneAngle <em>Main Plane Angle</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightDistributionDataImpl#getSecondaryPlaneAngle <em>Secondary Plane Angle</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightDistributionDataImpl#getLuminousIntensity <em>Luminous Intensity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcLightDistributionData")
@XmlRootElement(name = "IfcLightDistributionDataElement")
public class IfcLightDistributionDataImpl extends CDOObjectImpl implements IfcLightDistributionData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightDistributionDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcLightDistributionData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Double> getLuminousIntensity() {
		return (EList<Double>)eGet(IFC2X3Package.eINSTANCE.getIfcLightDistributionData_LuminousIntensity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Double> getSecondaryPlaneAngle() {
		return (EList<Double>)eGet(IFC2X3Package.eINSTANCE.getIfcLightDistributionData_SecondaryPlaneAngle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMainPlaneAngle() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLightDistributionData_MainPlaneAngle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainPlaneAngle(Double newMainPlaneAngle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightDistributionData_MainPlaneAngle(), newMainPlaneAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMainPlaneAngle() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightDistributionData_MainPlaneAngle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMainPlaneAngle() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightDistributionData_MainPlaneAngle());
	}

} //IfcLightDistributionDataImpl
