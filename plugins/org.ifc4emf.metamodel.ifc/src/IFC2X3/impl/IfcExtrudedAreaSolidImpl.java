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
import IFC2X3.IfcExtrudedAreaSolid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Extruded Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcExtrudedAreaSolidImpl#getExtrudedDirection <em>Extruded Direction</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcExtrudedAreaSolidImpl#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcExtrudedAreaSolid")
@XmlRootElement(name = "IfcExtrudedAreaSolidElement")
public class IfcExtrudedAreaSolidImpl extends IfcSweptAreaSolidImpl implements IfcExtrudedAreaSolid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcExtrudedAreaSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcExtrudedAreaSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getExtrudedDirection() {
		return (IfcDirection)eGet(IFC2X3Package.eINSTANCE.getIfcExtrudedAreaSolid_ExtrudedDirection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrudedDirection(IfcDirection newExtrudedDirection) {
		eSet(IFC2X3Package.eINSTANCE.getIfcExtrudedAreaSolid_ExtrudedDirection(), newExtrudedDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcExtrudedAreaSolid_Depth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(Double newDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcExtrudedAreaSolid_Depth(), newDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcExtrudedAreaSolid_Depth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcExtrudedAreaSolid_Depth());
	}

} //IfcExtrudedAreaSolidImpl
