/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.impl;

import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2;
import au.com.smartservicescrc.raas_small_test.MergingE1AndE2;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merging E1 And E2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.MergingE1AndE2Impl#getMultiContainClassJ <em>Multi Contain Class J</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.MergingE1AndE2Impl#getOptionalAttrString <em>Optional Attr String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlRootElement(name = "MergingE1AndE2Element")
@XmlType(name = "MergingE1AndE2")
public class MergingE1AndE2Impl extends DerivedUnderClassE1Impl implements MergingE1AndE2 {
	/**
	 * The cached value of the '{@link #getMultiContainClassJ() <em>Multi Contain Class J</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiContainClassJ()
	 * @generated
	 * @ordered
	 */
	protected EList<ThirdLevelClassJ> multiContainClassJ;

	/**
	 * The default value of the '{@link #getOptionalAttrString() <em>Optional Attr String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalAttrString()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONAL_ATTR_STRING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOptionalAttrString() <em>Optional Attr String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalAttrString()
	 * @generated
	 * @ordered
	 */
	protected String optionalAttrString = OPTIONAL_ATTR_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergingE1AndE2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RstPackage.Literals.MERGING_E1_AND_E2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public EList<ThirdLevelClassJ> getMultiContainClassJ() {
		if (multiContainClassJ == null) {
			multiContainClassJ = new EObjectContainmentEList<ThirdLevelClassJ>(ThirdLevelClassJ.class, this, RstPackage.MERGING_E1_AND_E2__MULTI_CONTAIN_CLASS_J);
		}
		return multiContainClassJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionalAttrString() {
		return optionalAttrString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalAttrString(String newOptionalAttrString) {
		String oldOptionalAttrString = optionalAttrString;
		optionalAttrString = newOptionalAttrString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.MERGING_E1_AND_E2__OPTIONAL_ATTR_STRING, oldOptionalAttrString, optionalAttrString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RstPackage.MERGING_E1_AND_E2__MULTI_CONTAIN_CLASS_J:
				return ((InternalEList<?>)getMultiContainClassJ()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RstPackage.MERGING_E1_AND_E2__MULTI_CONTAIN_CLASS_J:
				return getMultiContainClassJ();
			case RstPackage.MERGING_E1_AND_E2__OPTIONAL_ATTR_STRING:
				return getOptionalAttrString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RstPackage.MERGING_E1_AND_E2__MULTI_CONTAIN_CLASS_J:
				getMultiContainClassJ().clear();
				getMultiContainClassJ().addAll((Collection<? extends ThirdLevelClassJ>)newValue);
				return;
			case RstPackage.MERGING_E1_AND_E2__OPTIONAL_ATTR_STRING:
				setOptionalAttrString((String)newValue);
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
			case RstPackage.MERGING_E1_AND_E2__MULTI_CONTAIN_CLASS_J:
				getMultiContainClassJ().clear();
				return;
			case RstPackage.MERGING_E1_AND_E2__OPTIONAL_ATTR_STRING:
				setOptionalAttrString(OPTIONAL_ATTR_STRING_EDEFAULT);
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
			case RstPackage.MERGING_E1_AND_E2__MULTI_CONTAIN_CLASS_J:
				return multiContainClassJ != null && !multiContainClassJ.isEmpty();
			case RstPackage.MERGING_E1_AND_E2__OPTIONAL_ATTR_STRING:
				return OPTIONAL_ATTR_STRING_EDEFAULT == null ? optionalAttrString != null : !OPTIONAL_ATTR_STRING_EDEFAULT.equals(optionalAttrString);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DerivedUnderClassE2.class) {
			switch (derivedFeatureID) {
				case RstPackage.MERGING_E1_AND_E2__MULTI_CONTAIN_CLASS_J: return RstPackage.DERIVED_UNDER_CLASS_E2__MULTI_CONTAIN_CLASS_J;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DerivedUnderClassE2.class) {
			switch (baseFeatureID) {
				case RstPackage.DERIVED_UNDER_CLASS_E2__MULTI_CONTAIN_CLASS_J: return RstPackage.MERGING_E1_AND_E2__MULTI_CONTAIN_CLASS_J;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (optionalAttrString: ");
		result.append(optionalAttrString);
		result.append(')');
		return result.toString();
	}

} //MergingE1AndE2Impl
