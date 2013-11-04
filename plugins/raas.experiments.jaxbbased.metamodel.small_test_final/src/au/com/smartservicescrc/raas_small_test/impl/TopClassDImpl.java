/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.impl;

import java.util.Collection;
import java.util.TimeZone;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.jaxb.TimeZoneAdapter;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassD;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Class D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.TopClassDImpl#getRaasRef <em>Raas Ref</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.TopClassDImpl#getMulti2lowerAttrInt <em>Multi2lower Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.TopClassDImpl#getSingleAttrInt <em>Single Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.TopClassDImpl#getOptionalAttrInt <em>Optional Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.TopClassDImpl#getOptionalTimeZone <em>Optional Time Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlRootElement(name = "TopClassDElement")
@XmlType(name = "TopClassD")
public class TopClassDImpl extends EObjectImpl implements TopClassD {
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
	 * The default value of the '{@link #getOptionalTimeZone() <em>Optional Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalTimeZone()
	 * @generated
	 * @ordered
	 */
	protected static final TimeZone OPTIONAL_TIME_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionalTimeZone() <em>Optional Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalTimeZone()
	 * @generated
	 * @ordered
	 */
	protected TimeZone optionalTimeZone = OPTIONAL_TIME_ZONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopClassDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RstPackage.Literals.TOP_CLASS_D;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.TOP_CLASS_D__RAAS_REF, oldRaasRef, raasRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public EList<Integer> getMulti2lowerAttrInt() {
		if (multi2lowerAttrInt == null) {
			multi2lowerAttrInt = new EDataTypeUniqueEList<Integer>(Integer.class, this, RstPackage.TOP_CLASS_D__MULTI2LOWER_ATTR_INT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.TOP_CLASS_D__SINGLE_ATTR_INT, oldSingleAttrInt, singleAttrInt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.TOP_CLASS_D__OPTIONAL_ATTR_INT, oldOptionalAttrInt, optionalAttrInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(TimeZoneAdapter.class)
	public TimeZone getOptionalTimeZone() {
		return optionalTimeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalTimeZone(TimeZone newOptionalTimeZone) {
		TimeZone oldOptionalTimeZone = optionalTimeZone;
		optionalTimeZone = newOptionalTimeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.TOP_CLASS_D__OPTIONAL_TIME_ZONE, oldOptionalTimeZone, optionalTimeZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RstPackage.TOP_CLASS_D__RAAS_REF:
				return getRaasRef();
			case RstPackage.TOP_CLASS_D__MULTI2LOWER_ATTR_INT:
				return getMulti2lowerAttrInt();
			case RstPackage.TOP_CLASS_D__SINGLE_ATTR_INT:
				return getSingleAttrInt();
			case RstPackage.TOP_CLASS_D__OPTIONAL_ATTR_INT:
				return getOptionalAttrInt();
			case RstPackage.TOP_CLASS_D__OPTIONAL_TIME_ZONE:
				return getOptionalTimeZone();
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
			case RstPackage.TOP_CLASS_D__RAAS_REF:
				setRaasRef((String)newValue);
				return;
			case RstPackage.TOP_CLASS_D__MULTI2LOWER_ATTR_INT:
				getMulti2lowerAttrInt().clear();
				getMulti2lowerAttrInt().addAll((Collection<? extends Integer>)newValue);
				return;
			case RstPackage.TOP_CLASS_D__SINGLE_ATTR_INT:
				setSingleAttrInt((Integer)newValue);
				return;
			case RstPackage.TOP_CLASS_D__OPTIONAL_ATTR_INT:
				setOptionalAttrInt((Integer)newValue);
				return;
			case RstPackage.TOP_CLASS_D__OPTIONAL_TIME_ZONE:
				setOptionalTimeZone((TimeZone)newValue);
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
			case RstPackage.TOP_CLASS_D__RAAS_REF:
				setRaasRef(RAAS_REF_EDEFAULT);
				return;
			case RstPackage.TOP_CLASS_D__MULTI2LOWER_ATTR_INT:
				getMulti2lowerAttrInt().clear();
				return;
			case RstPackage.TOP_CLASS_D__SINGLE_ATTR_INT:
				setSingleAttrInt(SINGLE_ATTR_INT_EDEFAULT);
				return;
			case RstPackage.TOP_CLASS_D__OPTIONAL_ATTR_INT:
				setOptionalAttrInt(OPTIONAL_ATTR_INT_EDEFAULT);
				return;
			case RstPackage.TOP_CLASS_D__OPTIONAL_TIME_ZONE:
				setOptionalTimeZone(OPTIONAL_TIME_ZONE_EDEFAULT);
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
			case RstPackage.TOP_CLASS_D__RAAS_REF:
				return RAAS_REF_EDEFAULT == null ? raasRef != null : !RAAS_REF_EDEFAULT.equals(raasRef);
			case RstPackage.TOP_CLASS_D__MULTI2LOWER_ATTR_INT:
				return multi2lowerAttrInt != null && !multi2lowerAttrInt.isEmpty();
			case RstPackage.TOP_CLASS_D__SINGLE_ATTR_INT:
				return singleAttrInt != SINGLE_ATTR_INT_EDEFAULT;
			case RstPackage.TOP_CLASS_D__OPTIONAL_ATTR_INT:
				return optionalAttrInt != OPTIONAL_ATTR_INT_EDEFAULT;
			case RstPackage.TOP_CLASS_D__OPTIONAL_TIME_ZONE:
				return OPTIONAL_TIME_ZONE_EDEFAULT == null ? optionalTimeZone != null : !OPTIONAL_TIME_ZONE_EDEFAULT.equals(optionalTimeZone);
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
		result.append(", optionalTimeZone: ");
		result.append(optionalTimeZone);
		result.append(')');
		return result.toString();
	}

} //TopClassDImpl
