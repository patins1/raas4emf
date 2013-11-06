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
import IFC2X3.IfcCenterLineProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Center Line Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCenterLineProfileDefImpl#getThickness <em>Thickness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCenterLineProfileDef")
@XmlRootElement(name = "IfcCenterLineProfileDefElement")
public class IfcCenterLineProfileDefImpl extends IfcArbitraryOpenProfileDefImpl implements IfcCenterLineProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCenterLineProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCenterLineProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCenterLineProfileDef_Thickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThickness(Double newThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCenterLineProfileDef_Thickness(), newThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCenterLineProfileDef_Thickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCenterLineProfileDef_Thickness());
	}

} //IfcCenterLineProfileDefImpl
