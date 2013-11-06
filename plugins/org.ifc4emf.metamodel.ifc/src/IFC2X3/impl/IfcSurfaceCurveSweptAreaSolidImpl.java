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
import IFC2X3.IfcCurve;
import IFC2X3.IfcSurface;
import IFC2X3.IfcSurfaceCurveSweptAreaSolid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Curve Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSurfaceCurveSweptAreaSolidImpl#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceCurveSweptAreaSolidImpl#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceCurveSweptAreaSolidImpl#getEndParam <em>End Param</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceCurveSweptAreaSolidImpl#getReferenceSurface <em>Reference Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSurfaceCurveSweptAreaSolid")
@XmlRootElement(name = "IfcSurfaceCurveSweptAreaSolidElement")
public class IfcSurfaceCurveSweptAreaSolidImpl extends IfcSweptAreaSolidImpl implements IfcSurfaceCurveSweptAreaSolid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceCurveSweptAreaSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getDirectrix() {
		return (IfcCurve)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_Directrix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectrix(IfcCurve newDirectrix) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_Directrix(), newDirectrix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface getReferenceSurface() {
		return (IfcSurface)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_ReferenceSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSurface(IfcSurface newReferenceSurface) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_ReferenceSurface(), newReferenceSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEndParam() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_EndParam(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndParam(Double newEndParam) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_EndParam(), newEndParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndParam() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_EndParam());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndParam() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_EndParam());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getStartParam() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_StartParam(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartParam(Double newStartParam) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_StartParam(), newStartParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartParam() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_StartParam());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartParam() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_StartParam());
	}

} //IfcSurfaceCurveSweptAreaSolidImpl
