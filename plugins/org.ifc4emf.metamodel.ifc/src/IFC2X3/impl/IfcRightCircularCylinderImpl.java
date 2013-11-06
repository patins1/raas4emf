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
import IFC2X3.IfcRightCircularCylinder;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Right Circular Cylinder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRightCircularCylinderImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRightCircularCylinderImpl#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRightCircularCylinder")
@XmlRootElement(name = "IfcRightCircularCylinderElement")
public class IfcRightCircularCylinderImpl extends IfcCsgPrimitive3DImpl implements IfcRightCircularCylinder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRightCircularCylinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRightCircularCylinder();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRightCircularCylinder_Radius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(Double newRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRightCircularCylinder_Radius(), newRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRightCircularCylinder_Radius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRightCircularCylinder_Radius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRightCircularCylinder_Height(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Double newHeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRightCircularCylinder_Height(), newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRightCircularCylinder_Height());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRightCircularCylinder_Height());
	}

} //IfcRightCircularCylinderImpl
