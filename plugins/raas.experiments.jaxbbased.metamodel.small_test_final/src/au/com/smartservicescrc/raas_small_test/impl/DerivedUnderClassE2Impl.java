/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.impl;

import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Under Class E2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.DerivedUnderClassE2Impl#getMultiContainClassJ <em>Multi Contain Class J</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlSeeAlso({ MergingE1AndE2Impl.class })
@XmlRootElement(name = "DerivedUnderClassE2Element")
@XmlType(name = "DerivedUnderClassE2")
public class DerivedUnderClassE2Impl extends UnderClassEImpl implements DerivedUnderClassE2 {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedUnderClassE2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RstPackage.Literals.DERIVED_UNDER_CLASS_E2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public EList<ThirdLevelClassJ> getMultiContainClassJ() {
		if (multiContainClassJ == null) {
			multiContainClassJ = new EObjectContainmentEList<ThirdLevelClassJ>(ThirdLevelClassJ.class, this, RstPackage.DERIVED_UNDER_CLASS_E2__MULTI_CONTAIN_CLASS_J);
		}
		return multiContainClassJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RstPackage.DERIVED_UNDER_CLASS_E2__MULTI_CONTAIN_CLASS_J:
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
			case RstPackage.DERIVED_UNDER_CLASS_E2__MULTI_CONTAIN_CLASS_J:
				return getMultiContainClassJ();
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
			case RstPackage.DERIVED_UNDER_CLASS_E2__MULTI_CONTAIN_CLASS_J:
				getMultiContainClassJ().clear();
				getMultiContainClassJ().addAll((Collection<? extends ThirdLevelClassJ>)newValue);
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
			case RstPackage.DERIVED_UNDER_CLASS_E2__MULTI_CONTAIN_CLASS_J:
				getMultiContainClassJ().clear();
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
			case RstPackage.DERIVED_UNDER_CLASS_E2__MULTI_CONTAIN_CLASS_J:
				return multiContainClassJ != null && !multiContainClassJ.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DerivedUnderClassE2Impl
