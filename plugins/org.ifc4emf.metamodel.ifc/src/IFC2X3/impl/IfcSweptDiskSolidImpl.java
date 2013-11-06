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
import IFC2X3.IfcSweptDiskSolid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Swept Disk Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSweptDiskSolidImpl#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSweptDiskSolidImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSweptDiskSolidImpl#getInnerRadius <em>Inner Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSweptDiskSolidImpl#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSweptDiskSolidImpl#getEndParam <em>End Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSweptDiskSolid")
@XmlRootElement(name = "IfcSweptDiskSolidElement")
public class IfcSweptDiskSolidImpl extends IfcSolidModelImpl implements IfcSweptDiskSolid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSweptDiskSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getDirectrix() {
		return (IfcCurve)eGet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_Directrix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectrix(IfcCurve newDirectrix) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_Directrix(), newDirectrix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEndParam() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_EndParam(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndParam(Double newEndParam) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_EndParam(), newEndParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndParam() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_EndParam());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndParam() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_EndParam());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getStartParam() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_StartParam(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartParam(Double newStartParam) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_StartParam(), newStartParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartParam() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_StartParam());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartParam() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_StartParam());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getInnerRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_InnerRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerRadius(Double newInnerRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_InnerRadius(), newInnerRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInnerRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_InnerRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInnerRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_InnerRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_Radius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(Double newRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_Radius(), newRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_Radius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSweptDiskSolid_Radius());
	}

} //IfcSweptDiskSolidImpl
