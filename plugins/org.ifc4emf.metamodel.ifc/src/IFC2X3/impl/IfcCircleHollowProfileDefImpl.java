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
import IFC2X3.IfcCircleHollowProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Circle Hollow Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCircleHollowProfileDefImpl#getWallThickness <em>Wall Thickness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCircleHollowProfileDef")
@XmlRootElement(name = "IfcCircleHollowProfileDefElement")
public class IfcCircleHollowProfileDefImpl extends IfcCircleProfileDefImpl implements IfcCircleHollowProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCircleHollowProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCircleHollowProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWallThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCircleHollowProfileDef_WallThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallThickness(Double newWallThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCircleHollowProfileDef_WallThickness(), newWallThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWallThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCircleHollowProfileDef_WallThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWallThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCircleHollowProfileDef_WallThickness());
	}

} //IfcCircleHollowProfileDefImpl
