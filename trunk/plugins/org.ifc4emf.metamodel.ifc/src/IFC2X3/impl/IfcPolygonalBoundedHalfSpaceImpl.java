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
import IFC2X3.IfcAxis2Placement3D;
import IFC2X3.IfcBoundedCurve;
import IFC2X3.IfcPolygonalBoundedHalfSpace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Polygonal Bounded Half Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPolygonalBoundedHalfSpaceImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPolygonalBoundedHalfSpaceImpl#getPolygonalBoundary <em>Polygonal Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPolygonalBoundedHalfSpace")
@XmlRootElement(name = "IfcPolygonalBoundedHalfSpaceElement")
public class IfcPolygonalBoundedHalfSpaceImpl extends IfcHalfSpaceSolidImpl implements IfcPolygonalBoundedHalfSpace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPolygonalBoundedHalfSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPolygonalBoundedHalfSpace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getPosition() {
		return (IfcAxis2Placement3D)eGet(IFC2X3Package.eINSTANCE.getIfcPolygonalBoundedHalfSpace_Position(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IfcAxis2Placement3D newPosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPolygonalBoundedHalfSpace_Position(), newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundedCurve getPolygonalBoundary() {
		return (IfcBoundedCurve)eGet(IFC2X3Package.eINSTANCE.getIfcPolygonalBoundedHalfSpace_PolygonalBoundary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygonalBoundary(IfcBoundedCurve newPolygonalBoundary) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPolygonalBoundedHalfSpace_PolygonalBoundary(), newPolygonalBoundary);
	}

} //IfcPolygonalBoundedHalfSpaceImpl
