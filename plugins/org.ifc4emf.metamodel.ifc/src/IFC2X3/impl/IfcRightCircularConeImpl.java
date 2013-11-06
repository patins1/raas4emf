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
import IFC2X3.IfcRightCircularCone;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Right Circular Cone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRightCircularConeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRightCircularConeImpl#getBottomRadius <em>Bottom Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRightCircularCone")
@XmlRootElement(name = "IfcRightCircularConeElement")
public class IfcRightCircularConeImpl extends IfcCsgPrimitive3DImpl implements IfcRightCircularCone {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRightCircularConeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRightCircularCone();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBottomRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRightCircularCone_BottomRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomRadius(Double newBottomRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRightCircularCone_BottomRadius(), newBottomRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBottomRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRightCircularCone_BottomRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBottomRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRightCircularCone_BottomRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRightCircularCone_Height(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Double newHeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRightCircularCone_Height(), newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRightCircularCone_Height());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRightCircularCone_Height());
	}

} //IfcRightCircularConeImpl
