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
import IFC2X3.IfcStructuralLoadPlanarForce;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Planar Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceX <em>Planar Force X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceY <em>Planar Force Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceZ <em>Planar Force Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralLoadPlanarForce")
@XmlRootElement(name = "IfcStructuralLoadPlanarForceElement")
public class IfcStructuralLoadPlanarForceImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadPlanarForce {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadPlanarForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPlanarForceZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceZ(Double newPlanarForceZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceZ(), newPlanarForceZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanarForceZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanarForceZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPlanarForceY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceY(Double newPlanarForceY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceY(), newPlanarForceY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanarForceY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanarForceY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPlanarForceX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceX(Double newPlanarForceX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceX(), newPlanarForceX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanarForceX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanarForceX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceX());
	}

} //IfcStructuralLoadPlanarForceImpl
