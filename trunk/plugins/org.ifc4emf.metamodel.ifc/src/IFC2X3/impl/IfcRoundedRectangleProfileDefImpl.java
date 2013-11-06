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
import IFC2X3.IfcRoundedRectangleProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rounded Rectangle Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRoundedRectangleProfileDefImpl#getRoundingRadius <em>Rounding Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRoundedRectangleProfileDef")
@XmlRootElement(name = "IfcRoundedRectangleProfileDefElement")
public class IfcRoundedRectangleProfileDefImpl extends IfcRectangleProfileDefImpl implements IfcRoundedRectangleProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRoundedRectangleProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRoundedRectangleProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRoundingRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRoundedRectangleProfileDef_RoundingRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundingRadius(Double newRoundingRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRoundedRectangleProfileDef_RoundingRadius(), newRoundingRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRoundingRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRoundedRectangleProfileDef_RoundingRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoundingRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRoundedRectangleProfileDef_RoundingRadius());
	}

} //IfcRoundedRectangleProfileDefImpl
