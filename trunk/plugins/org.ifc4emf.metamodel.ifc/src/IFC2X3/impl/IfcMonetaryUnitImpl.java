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
import IFC2X3.IfcCurrencyEnum;
import IFC2X3.IfcMonetaryUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Monetary Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMonetaryUnitImpl#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMonetaryUnit")
@XmlRootElement(name = "IfcMonetaryUnitElement")
public class IfcMonetaryUnitImpl extends IfcUnitImpl implements IfcMonetaryUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMonetaryUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMonetaryUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurrencyEnum getCurrency() {
		return (IfcCurrencyEnum)eGet(IFC2X3Package.eINSTANCE.getIfcMonetaryUnit_Currency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(IfcCurrencyEnum newCurrency) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMonetaryUnit_Currency(), newCurrency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrency() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMonetaryUnit_Currency());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrency() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMonetaryUnit_Currency());
	}

} //IfcMonetaryUnitImpl
