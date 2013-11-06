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
import IFC2X3.IfcConnectionPointGeometry;
import IFC2X3.IfcPointOrVertexPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Point Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConnectionPointGeometryImpl#getPointOnRelatingElement <em>Point On Relating Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConnectionPointGeometryImpl#getPointOnRelatedElement <em>Point On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConnectionPointGeometry")
@XmlSeeAlso({ IfcConnectionPointEccentricityImpl.class })
@XmlRootElement(name = "IfcConnectionPointGeometryElement")
public class IfcConnectionPointGeometryImpl extends IfcConnectionGeometryImpl implements IfcConnectionPointGeometry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionPointGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConnectionPointGeometry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPointOrVertexPoint getPointOnRelatingElement() {
		return (IfcPointOrVertexPoint)eGet(IFC2X3Package.eINSTANCE.getIfcConnectionPointGeometry_PointOnRelatingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOnRelatingElement(IfcPointOrVertexPoint newPointOnRelatingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConnectionPointGeometry_PointOnRelatingElement(), newPointOnRelatingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPointOrVertexPoint getPointOnRelatedElement() {
		return (IfcPointOrVertexPoint)eGet(IFC2X3Package.eINSTANCE.getIfcConnectionPointGeometry_PointOnRelatedElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOnRelatedElement(IfcPointOrVertexPoint newPointOnRelatedElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConnectionPointGeometry_PointOnRelatedElement(), newPointOnRelatedElement);
	}

} //IfcConnectionPointGeometryImpl
