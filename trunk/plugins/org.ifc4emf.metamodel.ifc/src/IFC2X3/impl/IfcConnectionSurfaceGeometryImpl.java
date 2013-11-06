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
import IFC2X3.IfcConnectionSurfaceGeometry;
import IFC2X3.IfcSurfaceOrFaceSurface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Surface Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConnectionSurfaceGeometryImpl#getSurfaceOnRelatingElement <em>Surface On Relating Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConnectionSurfaceGeometryImpl#getSurfaceOnRelatedElement <em>Surface On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConnectionSurfaceGeometry")
@XmlRootElement(name = "IfcConnectionSurfaceGeometryElement")
public class IfcConnectionSurfaceGeometryImpl extends IfcConnectionGeometryImpl implements IfcConnectionSurfaceGeometry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionSurfaceGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConnectionSurfaceGeometry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceOrFaceSurface getSurfaceOnRelatingElement() {
		return (IfcSurfaceOrFaceSurface)eGet(IFC2X3Package.eINSTANCE.getIfcConnectionSurfaceGeometry_SurfaceOnRelatingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceOnRelatingElement(IfcSurfaceOrFaceSurface newSurfaceOnRelatingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConnectionSurfaceGeometry_SurfaceOnRelatingElement(), newSurfaceOnRelatingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceOrFaceSurface getSurfaceOnRelatedElement() {
		return (IfcSurfaceOrFaceSurface)eGet(IFC2X3Package.eINSTANCE.getIfcConnectionSurfaceGeometry_SurfaceOnRelatedElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceOnRelatedElement(IfcSurfaceOrFaceSurface newSurfaceOnRelatedElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConnectionSurfaceGeometry_SurfaceOnRelatedElement(), newSurfaceOnRelatedElement);
	}

} //IfcConnectionSurfaceGeometryImpl
