/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.impl;

import au.com.smartservicescrc.raas_small_test.FourthLevelClassK;
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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Third Level Class J</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ThirdLevelClassJImpl#getRaasRef <em>Raas Ref</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ThirdLevelClassJImpl#getMulti2lowerAttrInt <em>Multi2lower Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ThirdLevelClassJImpl#getSingleAttrInt <em>Single Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ThirdLevelClassJImpl#getOptionalAttrInt <em>Optional Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ThirdLevelClassJImpl#getOptionalContainClassK <em>Optional Contain Class K</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlRootElement(name = "ThirdLevelClassJElement")
@XmlType(name = "ThirdLevelClassJ")
public class ThirdLevelClassJImpl extends EObjectImpl implements ThirdLevelClassJ {
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
	 * The cached value of the '{@link #getMulti2lowerAttrInt() <em>Multi2lower Attr Int</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulti2lowerAttrInt()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> multi2lowerAttrInt;

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
	 * The default value of the '{@link #getOptionalAttrInt() <em>Optional Attr Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalAttrInt()
	 * @generated
	 * @ordered
	 */
	protected static final int OPTIONAL_ATTR_INT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOptionalAttrInt() <em>Optional Attr Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalAttrInt()
	 * @generated
	 * @ordered
	 */
	protected int optionalAttrInt = OPTIONAL_ATTR_INT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptionalContainClassK() <em>Optional Contain Class K</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalContainClassK()
	 * @generated
	 * @ordered
	 */
	protected FourthLevelClassK optionalContainClassK;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThirdLevelClassJImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RstPackage.Literals.THIRD_LEVEL_CLASS_J;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.THIRD_LEVEL_CLASS_J__RAAS_REF, oldRaasRef, raasRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public EList<Integer> getMulti2lowerAttrInt() {
		if (multi2lowerAttrInt == null) {
			multi2lowerAttrInt = new EDataTypeUniqueEList<Integer>(Integer.class, this, RstPackage.THIRD_LEVEL_CLASS_J__MULTI2LOWER_ATTR_INT);
		}
		return multi2lowerAttrInt;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.THIRD_LEVEL_CLASS_J__SINGLE_ATTR_INT, oldSingleAttrInt, singleAttrInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOptionalAttrInt() {
		return optionalAttrInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalAttrInt(int newOptionalAttrInt) {
		int oldOptionalAttrInt = optionalAttrInt;
		optionalAttrInt = newOptionalAttrInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_ATTR_INT, oldOptionalAttrInt, optionalAttrInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FourthLevelClassK getOptionalContainClassK() {
		return optionalContainClassK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionalContainClassK(FourthLevelClassK newOptionalContainClassK, NotificationChain msgs) {
		FourthLevelClassK oldOptionalContainClassK = optionalContainClassK;
		optionalContainClassK = newOptionalContainClassK;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_CONTAIN_CLASS_K, oldOptionalContainClassK, newOptionalContainClassK);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalContainClassK(FourthLevelClassK newOptionalContainClassK) {
		if (newOptionalContainClassK != optionalContainClassK) {
			NotificationChain msgs = null;
			if (optionalContainClassK != null)
				msgs = ((InternalEObject)optionalContainClassK).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_CONTAIN_CLASS_K, null, msgs);
			if (newOptionalContainClassK != null)
				msgs = ((InternalEObject)newOptionalContainClassK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_CONTAIN_CLASS_K, null, msgs);
			msgs = basicSetOptionalContainClassK(newOptionalContainClassK, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_CONTAIN_CLASS_K, newOptionalContainClassK, newOptionalContainClassK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_CONTAIN_CLASS_K:
				return basicSetOptionalContainClassK(null, msgs);
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
			case RstPackage.THIRD_LEVEL_CLASS_J__RAAS_REF:
				return getRaasRef();
			case RstPackage.THIRD_LEVEL_CLASS_J__MULTI2LOWER_ATTR_INT:
				return getMulti2lowerAttrInt();
			case RstPackage.THIRD_LEVEL_CLASS_J__SINGLE_ATTR_INT:
				return getSingleAttrInt();
			case RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_ATTR_INT:
				return getOptionalAttrInt();
			case RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_CONTAIN_CLASS_K:
				return getOptionalContainClassK();
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
			case RstPackage.THIRD_LEVEL_CLASS_J__RAAS_REF:
				setRaasRef((String)newValue);
				return;
			case RstPackage.THIRD_LEVEL_CLASS_J__MULTI2LOWER_ATTR_INT:
				getMulti2lowerAttrInt().clear();
				getMulti2lowerAttrInt().addAll((Collection<? extends Integer>)newValue);
				return;
			case RstPackage.THIRD_LEVEL_CLASS_J__SINGLE_ATTR_INT:
				setSingleAttrInt((Integer)newValue);
				return;
			case RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_ATTR_INT:
				setOptionalAttrInt((Integer)newValue);
				return;
			case RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_CONTAIN_CLASS_K:
				setOptionalContainClassK((FourthLevelClassK)newValue);
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
			case RstPackage.THIRD_LEVEL_CLASS_J__RAAS_REF:
				setRaasRef(RAAS_REF_EDEFAULT);
				return;
			case RstPackage.THIRD_LEVEL_CLASS_J__MULTI2LOWER_ATTR_INT:
				getMulti2lowerAttrInt().clear();
				return;
			case RstPackage.THIRD_LEVEL_CLASS_J__SINGLE_ATTR_INT:
				setSingleAttrInt(SINGLE_ATTR_INT_EDEFAULT);
				return;
			case RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_ATTR_INT:
				setOptionalAttrInt(OPTIONAL_ATTR_INT_EDEFAULT);
				return;
			case RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_CONTAIN_CLASS_K:
				setOptionalContainClassK((FourthLevelClassK)null);
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
			case RstPackage.THIRD_LEVEL_CLASS_J__RAAS_REF:
				return RAAS_REF_EDEFAULT == null ? raasRef != null : !RAAS_REF_EDEFAULT.equals(raasRef);
			case RstPackage.THIRD_LEVEL_CLASS_J__MULTI2LOWER_ATTR_INT:
				return multi2lowerAttrInt != null && !multi2lowerAttrInt.isEmpty();
			case RstPackage.THIRD_LEVEL_CLASS_J__SINGLE_ATTR_INT:
				return singleAttrInt != SINGLE_ATTR_INT_EDEFAULT;
			case RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_ATTR_INT:
				return optionalAttrInt != OPTIONAL_ATTR_INT_EDEFAULT;
			case RstPackage.THIRD_LEVEL_CLASS_J__OPTIONAL_CONTAIN_CLASS_K:
				return optionalContainClassK != null;
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
		result.append(", multi2lowerAttrInt: ");
		result.append(multi2lowerAttrInt);
		result.append(", singleAttrInt: ");
		result.append(singleAttrInt);
		result.append(", optionalAttrInt: ");
		result.append(optionalAttrInt);
		result.append(')');
		return result.toString();
	}

} //ThirdLevelClassJImpl
