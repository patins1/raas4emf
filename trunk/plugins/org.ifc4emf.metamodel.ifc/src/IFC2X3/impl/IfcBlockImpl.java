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
import IFC2X3.IfcBlock;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcBlockImpl#getXLength <em>XLength</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBlockImpl#getYLength <em>YLength</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBlockImpl#getZLength <em>ZLength</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBlock")
@XmlRootElement(name = "IfcBlockElement")
public class IfcBlockImpl extends IfcCsgPrimitive3DImpl implements IfcBlock {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBlock();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getZLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBlock_ZLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZLength(Double newZLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBlock_ZLength(), newZLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBlock_ZLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBlock_ZLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getYLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBlock_YLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYLength(Double newYLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBlock_YLength(), newYLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetYLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBlock_YLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetYLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBlock_YLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getXLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcBlock_XLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXLength(Double newXLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBlock_XLength(), newXLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetXLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBlock_XLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetXLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBlock_XLength());
	}

} //IfcBlockImpl
