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
import IFC2X3.IfcBoundingBox;
import IFC2X3.IfcCartesianPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Bounding Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcBoundingBoxImpl#getCorner <em>Corner</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundingBoxImpl#getXDim <em>XDim</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundingBoxImpl#getYDim <em>YDim</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBoundingBoxImpl#getZDim <em>ZDim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBoundingBox")
@XmlRootElement(name = "IfcBoundingBoxElement")
public class IfcBoundingBoxImpl extends IfcGeometricRepresentationItemImpl implements IfcBoundingBox {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundingBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBoundingBox();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getCorner() {
		return (IfcCartesianPoint)eGet(IFC2X3Package.eINSTANCE.getIfcBoundingBox_Corner(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorner(IfcCartesianPoint newCorner) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundingBox_Corner(), newCorner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getZDim() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundingBox_ZDim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZDim(Double newZDim) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundingBox_ZDim(), newZDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZDim() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundingBox_ZDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZDim() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundingBox_ZDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getYDim() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundingBox_YDim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDim(Double newYDim) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundingBox_YDim(), newYDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetYDim() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundingBox_YDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetYDim() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundingBox_YDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getXDim() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBoundingBox_XDim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDim(Double newXDim) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoundingBox_XDim(), newXDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetXDim() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBoundingBox_XDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetXDim() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBoundingBox_XDim());
	}

} //IfcBoundingBoxImpl
