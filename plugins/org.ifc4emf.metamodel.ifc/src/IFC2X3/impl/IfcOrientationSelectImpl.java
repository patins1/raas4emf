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
import IFC2X3.IfcDirection;
import IFC2X3.IfcOrientationSelect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Orientation Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcOrientationSelectImpl#getIfcPlaneAngleMeasurevalue <em>Ifc Plane Angle Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOrientationSelectImpl#getIfcDirectionvalue <em>Ifc Directionvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcOrientationSelect")
@XmlRootElement(name = "IfcOrientationSelectElement")
public class IfcOrientationSelectImpl extends CDOObjectImpl implements IfcOrientationSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOrientationSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcOrientationSelect();
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
	public Double getIfcPlaneAngleMeasurevalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcOrientationSelect_IfcPlaneAngleMeasurevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPlaneAngleMeasurevalue(Double newIfcPlaneAngleMeasurevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOrientationSelect_IfcPlaneAngleMeasurevalue(), newIfcPlaneAngleMeasurevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcPlaneAngleMeasurevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOrientationSelect_IfcPlaneAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcPlaneAngleMeasurevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOrientationSelect_IfcPlaneAngleMeasurevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getIfcDirectionvalue() {
		return (IfcDirection)eGet(IFC2X3Package.eINSTANCE.getIfcOrientationSelect_IfcDirectionvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDirectionvalue(IfcDirection newIfcDirectionvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOrientationSelect_IfcDirectionvalue(), newIfcDirectionvalue);
	}

} //IfcOrientationSelectImpl
