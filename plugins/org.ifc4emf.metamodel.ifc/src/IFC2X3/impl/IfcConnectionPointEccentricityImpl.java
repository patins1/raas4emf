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
import IFC2X3.IfcConnectionPointEccentricity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Point Eccentricity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConnectionPointEccentricityImpl#getEccentricityInX <em>Eccentricity In X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConnectionPointEccentricityImpl#getEccentricityInY <em>Eccentricity In Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConnectionPointEccentricityImpl#getEccentricityInZ <em>Eccentricity In Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConnectionPointEccentricity")
@XmlRootElement(name = "IfcConnectionPointEccentricityElement")
public class IfcConnectionPointEccentricityImpl extends IfcConnectionPointGeometryImpl implements IfcConnectionPointEccentricity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionPointEccentricityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEccentricityInZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInZ(Double newEccentricityInZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInZ(), newEccentricityInZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEccentricityInY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInY(Double newEccentricityInY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInY(), newEccentricityInY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEccentricityInX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInX(Double newEccentricityInX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInX(), newEccentricityInX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInX());
	}

} //IfcConnectionPointEccentricityImpl
