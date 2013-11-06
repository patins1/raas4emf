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
import IFC2X3.IfcRectangularPyramid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangular Pyramid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRectangularPyramidImpl#getXLength <em>XLength</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRectangularPyramidImpl#getYLength <em>YLength</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRectangularPyramidImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRectangularPyramid")
@XmlRootElement(name = "IfcRectangularPyramidElement")
public class IfcRectangularPyramidImpl extends IfcCsgPrimitive3DImpl implements IfcRectangularPyramid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRectangularPyramidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRectangularPyramid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRectangularPyramid_Height(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Double newHeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangularPyramid_Height(), newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangularPyramid_Height());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangularPyramid_Height());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getYLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRectangularPyramid_YLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYLength(Double newYLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangularPyramid_YLength(), newYLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetYLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangularPyramid_YLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetYLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangularPyramid_YLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getXLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRectangularPyramid_XLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXLength(Double newXLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangularPyramid_XLength(), newXLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetXLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangularPyramid_XLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetXLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangularPyramid_XLength());
	}

} //IfcRectangularPyramidImpl
