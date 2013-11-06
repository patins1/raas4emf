/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package express2ecore.impl;

import express2ecore.Express2ecorePackage;
import express2ecore.SelectMember2Feature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.ifc4emf.metamodel.express.core.NamedType;
import org.ifc4emf.metamodel.express.core.SelectType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Member2 Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link express2ecore.impl.SelectMember2FeatureImpl#getSelectType <em>Select Type</em>}</li>
 *   <li>{@link express2ecore.impl.SelectMember2FeatureImpl#getMemberType <em>Member Type</em>}</li>
 *   <li>{@link express2ecore.impl.SelectMember2FeatureImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectMember2FeatureImpl extends EObjectImpl implements SelectMember2Feature {
	/**
	 * The cached value of the '{@link #getSelectType() <em>Select Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectType()
	 * @generated
	 * @ordered
	 */
	protected SelectType selectType;

	/**
	 * The cached value of the '{@link #getMemberType() <em>Member Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberType()
	 * @generated
	 * @ordered
	 */
	protected NamedType memberType;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectMember2FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Express2ecorePackage.Literals.SELECT_MEMBER2_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectType getSelectType() {
		if (selectType != null && selectType.eIsProxy()) {
			InternalEObject oldSelectType = (InternalEObject)selectType;
			selectType = (SelectType)eResolveProxy(oldSelectType);
			if (selectType != oldSelectType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Express2ecorePackage.SELECT_MEMBER2_FEATURE__SELECT_TYPE, oldSelectType, selectType));
			}
		}
		return selectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectType basicGetSelectType() {
		return selectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectType(SelectType newSelectType) {
		SelectType oldSelectType = selectType;
		selectType = newSelectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Express2ecorePackage.SELECT_MEMBER2_FEATURE__SELECT_TYPE, oldSelectType, selectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedType getMemberType() {
		if (memberType != null && memberType.eIsProxy()) {
			InternalEObject oldMemberType = (InternalEObject)memberType;
			memberType = (NamedType)eResolveProxy(oldMemberType);
			if (memberType != oldMemberType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Express2ecorePackage.SELECT_MEMBER2_FEATURE__MEMBER_TYPE, oldMemberType, memberType));
			}
		}
		return memberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedType basicGetMemberType() {
		return memberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberType(NamedType newMemberType) {
		NamedType oldMemberType = memberType;
		memberType = newMemberType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Express2ecorePackage.SELECT_MEMBER2_FEATURE__MEMBER_TYPE, oldMemberType, memberType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (EStructuralFeature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Express2ecorePackage.SELECT_MEMBER2_FEATURE__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Express2ecorePackage.SELECT_MEMBER2_FEATURE__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE__SELECT_TYPE:
				if (resolve) return getSelectType();
				return basicGetSelectType();
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE__MEMBER_TYPE:
				if (resolve) return getMemberType();
				return basicGetMemberType();
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
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
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE__SELECT_TYPE:
				setSelectType((SelectType)newValue);
				return;
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE__MEMBER_TYPE:
				setMemberType((NamedType)newValue);
				return;
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE__FEATURE:
				setFeature((EStructuralFeature)newValue);
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
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE__SELECT_TYPE:
				setSelectType((SelectType)null);
				return;
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE__MEMBER_TYPE:
				setMemberType((NamedType)null);
				return;
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE__FEATURE:
				setFeature((EStructuralFeature)null);
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
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE__SELECT_TYPE:
				return selectType != null;
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE__MEMBER_TYPE:
				return memberType != null;
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE__FEATURE:
				return feature != null;
		}
		return super.eIsSet(featureID);
	}

} //SelectMember2FeatureImpl
