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
import IFC2X3.IfcPointOnSurface;
import IFC2X3.IfcSurface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Point On Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPointOnSurfaceImpl#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPointOnSurfaceImpl#getPointParameterU <em>Point Parameter U</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPointOnSurfaceImpl#getPointParameterV <em>Point Parameter V</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPointOnSurface")
@XmlRootElement(name = "IfcPointOnSurfaceElement")
public class IfcPointOnSurfaceImpl extends IfcPointImpl implements IfcPointOnSurface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPointOnSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPointOnSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface getBasisSurface() {
		return (IfcSurface)eGet(IFC2X3Package.eINSTANCE.getIfcPointOnSurface_BasisSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisSurface(IfcSurface newBasisSurface) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPointOnSurface_BasisSurface(), newBasisSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPointParameterV() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcPointOnSurface_PointParameterV(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointParameterV(Double newPointParameterV) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPointOnSurface_PointParameterV(), newPointParameterV);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPointParameterV() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPointOnSurface_PointParameterV());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPointParameterV() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPointOnSurface_PointParameterV());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPointParameterU() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcPointOnSurface_PointParameterU(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointParameterU(Double newPointParameterU) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPointOnSurface_PointParameterU(), newPointParameterU);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPointParameterU() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPointOnSurface_PointParameterU());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPointParameterU() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPointOnSurface_PointParameterU());
	}

} //IfcPointOnSurfaceImpl
