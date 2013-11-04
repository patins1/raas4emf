/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.impl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassD;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassDRefAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Under Class E1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.DerivedUnderClassE1Impl#getSingleRefClassD <em>Single Ref Class D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlSeeAlso({ MergingE1AndE2Impl.class })
@XmlRootElement(name = "DerivedUnderClassE1Element")
@XmlType(name = "DerivedUnderClassE1")
public class DerivedUnderClassE1Impl extends UnderClassEImpl implements DerivedUnderClassE1 {
	/**
	 * The cached value of the '{@link #getSingleRefClassD() <em>Single Ref Class D</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleRefClassD()
	 * @generated
	 * @ordered
	 */
	protected TopClassD singleRefClassD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedUnderClassE1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RstPackage.Literals.DERIVED_UNDER_CLASS_E1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(TopClassDRefAdapter.class)
	@XmlElement(required = true)
	public TopClassD getSingleRefClassD() {
		if (singleRefClassD != null && singleRefClassD.eIsProxy()) {
			InternalEObject oldSingleRefClassD = (InternalEObject)singleRefClassD;
			singleRefClassD = (TopClassD)eResolveProxy(oldSingleRefClassD);
			if (singleRefClassD != oldSingleRefClassD) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RstPackage.DERIVED_UNDER_CLASS_E1__SINGLE_REF_CLASS_D, oldSingleRefClassD, singleRefClassD));
			}
		}
		return singleRefClassD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopClassD basicGetSingleRefClassD() {
		return singleRefClassD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleRefClassD(TopClassD newSingleRefClassD) {
		TopClassD oldSingleRefClassD = singleRefClassD;
		singleRefClassD = newSingleRefClassD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.DERIVED_UNDER_CLASS_E1__SINGLE_REF_CLASS_D, oldSingleRefClassD, singleRefClassD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RstPackage.DERIVED_UNDER_CLASS_E1__SINGLE_REF_CLASS_D:
				if (resolve) return getSingleRefClassD();
				return basicGetSingleRefClassD();
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
			case RstPackage.DERIVED_UNDER_CLASS_E1__SINGLE_REF_CLASS_D:
				setSingleRefClassD((TopClassD)newValue);
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
			case RstPackage.DERIVED_UNDER_CLASS_E1__SINGLE_REF_CLASS_D:
				setSingleRefClassD((TopClassD)null);
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
			case RstPackage.DERIVED_UNDER_CLASS_E1__SINGLE_REF_CLASS_D:
				return singleRefClassD != null;
		}
		return super.eIsSet(featureID);
	}

} //DerivedUnderClassE1Impl
