/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcAxis2Placement3D;
import IFC2X3.IfcProfileDef;
import IFC2X3.IfcSweptAreaSolid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSweptAreaSolidImpl#getSweptArea <em>Swept Area</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSweptAreaSolidImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSweptAreaSolid")
@XmlSeeAlso({ IfcRevolvedAreaSolidImpl.class, IfcSurfaceCurveSweptAreaSolidImpl.class, IfcExtrudedAreaSolidImpl.class })
@XmlRootElement(name = "IfcSweptAreaSolidElement")
public class IfcSweptAreaSolidImpl extends IfcSolidModelImpl implements IfcSweptAreaSolid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSweptAreaSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSweptAreaSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getPosition() {
		return (IfcAxis2Placement3D)eGet(IFC2X3Package.eINSTANCE.getIfcSweptAreaSolid_Position(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IfcAxis2Placement3D newPosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSweptAreaSolid_Position(), newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getSweptArea() {
		return (IfcProfileDef)eGet(IFC2X3Package.eINSTANCE.getIfcSweptAreaSolid_SweptArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSweptArea(IfcProfileDef newSweptArea) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSweptAreaSolid_SweptArea(), newSweptArea);
	}

} //IfcSweptAreaSolidImpl
