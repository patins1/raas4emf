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
import IFC2X3.IfcConnectionCurveGeometry;
import IFC2X3.IfcCurveOrEdgeCurve;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Curve Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConnectionCurveGeometryImpl#getCurveOnRelatingElement <em>Curve On Relating Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConnectionCurveGeometryImpl#getCurveOnRelatedElement <em>Curve On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConnectionCurveGeometry")
@XmlRootElement(name = "IfcConnectionCurveGeometryElement")
public class IfcConnectionCurveGeometryImpl extends IfcConnectionGeometryImpl implements IfcConnectionCurveGeometry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionCurveGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConnectionCurveGeometry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveOrEdgeCurve getCurveOnRelatingElement() {
		return (IfcCurveOrEdgeCurve)eGet(IFC2X3Package.eINSTANCE.getIfcConnectionCurveGeometry_CurveOnRelatingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveOnRelatingElement(IfcCurveOrEdgeCurve newCurveOnRelatingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConnectionCurveGeometry_CurveOnRelatingElement(), newCurveOnRelatingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveOrEdgeCurve getCurveOnRelatedElement() {
		return (IfcCurveOrEdgeCurve)eGet(IFC2X3Package.eINSTANCE.getIfcConnectionCurveGeometry_CurveOnRelatedElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveOnRelatedElement(IfcCurveOrEdgeCurve newCurveOnRelatedElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConnectionCurveGeometry_CurveOnRelatedElement(), newCurveOnRelatedElement);
	}

} //IfcConnectionCurveGeometryImpl
