/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.impl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassM;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Class M</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.TopClassMImpl#getSingleAttrInt <em>Single Attr Int</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlRootElement(name = "TopClassMElement")
@XmlType(name = "TopClassM")
public class TopClassMImpl extends UnderClassEImpl implements TopClassM {
	/**
	 * The default value of the '{@link #getSingleAttrInt() <em>Single Attr Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleAttrInt()
	 * @generated
	 * @ordered
	 */
	protected static final int SINGLE_ATTR_INT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSingleAttrInt() <em>Single Attr Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleAttrInt()
	 * @generated
	 * @ordered
	 */
	protected int singleAttrInt = SINGLE_ATTR_INT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopClassMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RstPackage.Literals.TOP_CLASS_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public int getSingleAttrInt() {
		return singleAttrInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleAttrInt(int newSingleAttrInt) {
		int oldSingleAttrInt = singleAttrInt;
		singleAttrInt = newSingleAttrInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.TOP_CLASS_M__SINGLE_ATTR_INT, oldSingleAttrInt, singleAttrInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RstPackage.TOP_CLASS_M__SINGLE_ATTR_INT:
				return getSingleAttrInt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RstPackage.TOP_CLASS_M__SINGLE_ATTR_INT:
				setSingleAttrInt((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RstPackage.TOP_CLASS_M__SINGLE_ATTR_INT:
				setSingleAttrInt(SINGLE_ATTR_INT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RstPackage.TOP_CLASS_M__SINGLE_ATTR_INT:
				return singleAttrInt != SINGLE_ATTR_INT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (singleAttrInt: ");
		result.append(singleAttrInt);
		result.append(')');
		return result.toString();
	}

} //TopClassMImpl
