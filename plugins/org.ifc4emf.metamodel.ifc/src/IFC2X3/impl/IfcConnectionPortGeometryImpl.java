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
import IFC2X3.IfcAxis2Placement;
import IFC2X3.IfcConnectionPortGeometry;
import IFC2X3.IfcProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Port Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConnectionPortGeometryImpl#getLocationAtRelatingElement <em>Location At Relating Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConnectionPortGeometryImpl#getLocationAtRelatedElement <em>Location At Related Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConnectionPortGeometryImpl#getProfileOfPort <em>Profile Of Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConnectionPortGeometry")
@XmlRootElement(name = "IfcConnectionPortGeometryElement")
public class IfcConnectionPortGeometryImpl extends IfcConnectionGeometryImpl implements IfcConnectionPortGeometry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionPortGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConnectionPortGeometry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getLocationAtRelatingElement() {
		return (IfcAxis2Placement)eGet(IFC2X3Package.eINSTANCE.getIfcConnectionPortGeometry_LocationAtRelatingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationAtRelatingElement(IfcAxis2Placement newLocationAtRelatingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConnectionPortGeometry_LocationAtRelatingElement(), newLocationAtRelatingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getProfileOfPort() {
		return (IfcProfileDef)eGet(IFC2X3Package.eINSTANCE.getIfcConnectionPortGeometry_ProfileOfPort(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileOfPort(IfcProfileDef newProfileOfPort) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConnectionPortGeometry_ProfileOfPort(), newProfileOfPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getLocationAtRelatedElement() {
		return (IfcAxis2Placement)eGet(IFC2X3Package.eINSTANCE.getIfcConnectionPortGeometry_LocationAtRelatedElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationAtRelatedElement(IfcAxis2Placement newLocationAtRelatedElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConnectionPortGeometry_LocationAtRelatedElement(), newLocationAtRelatedElement);
	}

} //IfcConnectionPortGeometryImpl
