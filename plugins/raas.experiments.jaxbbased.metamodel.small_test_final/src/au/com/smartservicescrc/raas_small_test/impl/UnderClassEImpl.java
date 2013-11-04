/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.UnderClassE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Under Class E</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.UnderClassEImpl#getRaasRef <em>Raas Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlRootElement(name = "UnderClassEElement")
@XmlType(name = "UnderClassE")
@XmlSeeAlso({ DerivedUnderClassE1Impl.class, MergingE1AndE2Impl.class,
		DerivedUnderClassE2Impl.class, TopClassMImpl.class })
public class UnderClassEImpl extends EObjectImpl implements UnderClassE {
	/**
	 * The default value of the '{@link #getRaasRef() <em>Raas Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaasRef()
	 * @generated
	 * @ordered
	 */
	protected static final String RAAS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRaasRef() <em>Raas Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaasRef()
	 * @generated
	 * @ordered
	 */
	protected String raasRef = RAAS_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnderClassEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RstPackage.Literals.UNDER_CLASS_E;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRaasRef() {
		return raasRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaasRef(String newRaasRef) {
		String oldRaasRef = raasRef;
		raasRef = newRaasRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.UNDER_CLASS_E__RAAS_REF, oldRaasRef, raasRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RstPackage.UNDER_CLASS_E__RAAS_REF:
				return getRaasRef();
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
			case RstPackage.UNDER_CLASS_E__RAAS_REF:
				setRaasRef((String)newValue);
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
			case RstPackage.UNDER_CLASS_E__RAAS_REF:
				setRaasRef(RAAS_REF_EDEFAULT);
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
			case RstPackage.UNDER_CLASS_E__RAAS_REF:
				return RAAS_REF_EDEFAULT == null ? raasRef != null : !RAAS_REF_EDEFAULT.equals(raasRef);
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
		result.append(" (raasRef: ");
		result.append(raasRef);
		result.append(')');
		return result.toString();
	}

} //UnderClassEImpl
