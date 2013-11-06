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
import IFC2X3.IfcAxis1Placement;
import IFC2X3.IfcRevolvedAreaSolid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Revolved Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRevolvedAreaSolidImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRevolvedAreaSolidImpl#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRevolvedAreaSolid")
@XmlRootElement(name = "IfcRevolvedAreaSolidElement")
public class IfcRevolvedAreaSolidImpl extends IfcSweptAreaSolidImpl implements IfcRevolvedAreaSolid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRevolvedAreaSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRevolvedAreaSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis1Placement getAxis() {
		return (IfcAxis1Placement)eGet(IFC2X3Package.eINSTANCE.getIfcRevolvedAreaSolid_Axis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(IfcAxis1Placement newAxis) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRevolvedAreaSolid_Axis(), newAxis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAngle() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRevolvedAreaSolid_Angle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(Double newAngle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRevolvedAreaSolid_Angle(), newAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAngle() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRevolvedAreaSolid_Angle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAngle() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRevolvedAreaSolid_Angle());
	}

} //IfcRevolvedAreaSolidImpl
