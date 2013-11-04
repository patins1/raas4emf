/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.impl;

import au.com.smartservicescrc.raas_small_test.FourthLevelClassK;
import au.com.smartservicescrc.raas_small_test.RstPackage;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fourth Level Class K</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.FourthLevelClassKImpl#getRaasRef <em>Raas Ref</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.FourthLevelClassKImpl#getMulti2lowerAttrInt <em>Multi2lower Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.FourthLevelClassKImpl#getSingleAttrInt <em>Single Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.FourthLevelClassKImpl#getOptionalAttrInt <em>Optional Attr Int</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlRootElement(name = "FourthLevelClassKElement")
@XmlType(name = "FourthLevelClassK")
public class FourthLevelClassKImpl extends EObjectImpl implements FourthLevelClassK {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FourthLevelClassKImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RstPackage.Literals.FOURTH_LEVEL_CLASS_K;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.FOURTH_LEVEL_CLASS_K__RAAS_REF, oldRaasRef, raasRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public EList<Integer> getMulti2lowerAttrInt() {
		if (multi2lowerAttrInt == null) {
			multi2lowerAttrInt = new EDataTypeUniqueEList<Integer>(Integer.class, this, RstPackage.FOURTH_LEVEL_CLASS_K__MULTI2LOWER_ATTR_INT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.FOURTH_LEVEL_CLASS_K__SINGLE_ATTR_INT, oldSingleAttrInt, singleAttrInt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.FOURTH_LEVEL_CLASS_K__OPTIONAL_ATTR_INT, oldOptionalAttrInt, optionalAttrInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RstPackage.FOURTH_LEVEL_CLASS_K__RAAS_REF:
				return getRaasRef();
			case RstPackage.FOURTH_LEVEL_CLASS_K__MULTI2LOWER_ATTR_INT:
				return getMulti2lowerAttrInt();
			case RstPackage.FOURTH_LEVEL_CLASS_K__SINGLE_ATTR_INT:
				return getSingleAttrInt();
			case RstPackage.FOURTH_LEVEL_CLASS_K__OPTIONAL_ATTR_INT:
				return getOptionalAttrInt();
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
			case RstPackage.FOURTH_LEVEL_CLASS_K__RAAS_REF:
				setRaasRef((String)newValue);
				return;
			case RstPackage.FOURTH_LEVEL_CLASS_K__MULTI2LOWER_ATTR_INT:
				getMulti2lowerAttrInt().clear();
				getMulti2lowerAttrInt().addAll((Collection<? extends Integer>)newValue);
				return;
			case RstPackage.FOURTH_LEVEL_CLASS_K__SINGLE_ATTR_INT:
				setSingleAttrInt((Integer)newValue);
				return;
			case RstPackage.FOURTH_LEVEL_CLASS_K__OPTIONAL_ATTR_INT:
				setOptionalAttrInt((Integer)newValue);
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
			case RstPackage.FOURTH_LEVEL_CLASS_K__RAAS_REF:
				setRaasRef(RAAS_REF_EDEFAULT);
				return;
			case RstPackage.FOURTH_LEVEL_CLASS_K__MULTI2LOWER_ATTR_INT:
				getMulti2lowerAttrInt().clear();
				return;
			case RstPackage.FOURTH_LEVEL_CLASS_K__SINGLE_ATTR_INT:
				setSingleAttrInt(SINGLE_ATTR_INT_EDEFAULT);
				return;
			case RstPackage.FOURTH_LEVEL_CLASS_K__OPTIONAL_ATTR_INT:
				setOptionalAttrInt(OPTIONAL_ATTR_INT_EDEFAULT);
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
			case RstPackage.FOURTH_LEVEL_CLASS_K__RAAS_REF:
				return RAAS_REF_EDEFAULT == null ? raasRef != null : !RAAS_REF_EDEFAULT.equals(raasRef);
			case RstPackage.FOURTH_LEVEL_CLASS_K__MULTI2LOWER_ATTR_INT:
				return multi2lowerAttrInt != null && !multi2lowerAttrInt.isEmpty();
			case RstPackage.FOURTH_LEVEL_CLASS_K__SINGLE_ATTR_INT:
				return singleAttrInt != SINGLE_ATTR_INT_EDEFAULT;
			case RstPackage.FOURTH_LEVEL_CLASS_K__OPTIONAL_ATTR_INT:
				return optionalAttrInt != OPTIONAL_ATTR_INT_EDEFAULT;
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

} //FourthLevelClassKImpl
