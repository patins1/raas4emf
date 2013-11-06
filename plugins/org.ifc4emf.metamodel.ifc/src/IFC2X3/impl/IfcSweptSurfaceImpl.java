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
import IFC2X3.IfcSweptSurface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Swept Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSweptSurfaceImpl#getSweptCurve <em>Swept Curve</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSweptSurfaceImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSweptSurface")
@XmlSeeAlso({ IfcSurfaceOfRevolutionImpl.class, IfcSurfaceOfLinearExtrusionImpl.class })
@XmlRootElement(name = "IfcSweptSurfaceElement")
public class IfcSweptSurfaceImpl extends IfcSurfaceImpl implements IfcSweptSurface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSweptSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSweptSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getSweptCurve() {
		return (IfcProfileDef)eGet(IFC2X3Package.eINSTANCE.getIfcSweptSurface_SweptCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSweptCurve(IfcProfileDef newSweptCurve) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSweptSurface_SweptCurve(), newSweptCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getPosition() {
		return (IfcAxis2Placement3D)eGet(IFC2X3Package.eINSTANCE.getIfcSweptSurface_Position(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IfcAxis2Placement3D newPosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSweptSurface_Position(), newPosition);
	}

} //IfcSweptSurfaceImpl
