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
import IFC2X3.IfcSurfaceStyleRefraction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Refraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleRefractionImpl#getRefractionIndex <em>Refraction Index</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleRefractionImpl#getDispersionFactor <em>Dispersion Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSurfaceStyleRefraction")
@XmlRootElement(name = "IfcSurfaceStyleRefractionElement")
public class IfcSurfaceStyleRefractionImpl extends IfcSurfaceStyleElementSelectImpl implements IfcSurfaceStyleRefraction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleRefractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRefraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDispersionFactor() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRefraction_DispersionFactor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispersionFactor(Double newDispersionFactor) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRefraction_DispersionFactor(), newDispersionFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDispersionFactor() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRefraction_DispersionFactor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDispersionFactor() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRefraction_DispersionFactor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRefractionIndex() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRefraction_RefractionIndex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefractionIndex(Double newRefractionIndex) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRefraction_RefractionIndex(), newRefractionIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefractionIndex() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRefraction_RefractionIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefractionIndex() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRefraction_RefractionIndex());
	}

} //IfcSurfaceStyleRefractionImpl
