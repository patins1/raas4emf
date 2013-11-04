/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.impl;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import au.com.smartservicescrc.raas_small_test.ReposRoot;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassA;
import au.com.smartservicescrc.raas_small_test.TopClassB;
import au.com.smartservicescrc.raas_small_test.TopClassC;
import au.com.smartservicescrc.raas_small_test.TopClassD;
import au.com.smartservicescrc.raas_small_test.TopClassM;
import au.com.smartservicescrc.raas_small_test.jaxb.ReposRootRef;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassDRefAdapter;
import au.com.smartservicescrc.raas_small_test.jaxb.TopClassMRefAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repos Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ReposRootImpl#getRaasRef <em>Raas Ref</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ReposRootImpl#getSingleAttrString <em>Single Attr String</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ReposRootImpl#getMultiContainClassA <em>Multi Contain Class A</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ReposRootImpl#getOptionalContainClassB <em>Optional Contain Class B</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ReposRootImpl#getSingleContainClassC <em>Single Contain Class C</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ReposRootImpl#getMultiRefClassD <em>Multi Ref Class D</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ReposRootImpl#getMultiAttrString <em>Multi Attr String</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.ReposRootImpl#getSingleNonContainClassM <em>Single Non Contain Class M</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

@XmlRootElement(name = "ReposRootElement")
@XmlType(name = "ReposRoot")
public class ReposRootImpl extends EObjectImpl implements ReposRoot {
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
	 * The default value of the '{@link #getSingleAttrString() <em>Single Attr String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleAttrString()
	 * @generated
	 * @ordered
	 */
	protected static final String SINGLE_ATTR_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingleAttrString() <em>Single Attr String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleAttrString()
	 * @generated
	 * @ordered
	 */
	protected String singleAttrString = SINGLE_ATTR_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMultiContainClassA() <em>Multi Contain Class A</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiContainClassA()
	 * @generated
	 * @ordered
	 */
	protected EList<TopClassA> multiContainClassA;

	/**
	 * The cached value of the '{@link #getOptionalContainClassB() <em>Optional Contain Class B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalContainClassB()
	 * @generated
	 * @ordered
	 */
	protected TopClassB optionalContainClassB;

	/**
	 * The cached value of the '{@link #getSingleContainClassC() <em>Single Contain Class C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleContainClassC()
	 * @generated
	 * @ordered
	 */
	protected TopClassC singleContainClassC;

	/**
	 * The cached value of the '{@link #getMultiRefClassD() <em>Multi Ref Class D</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiRefClassD()
	 * @generated
	 * @ordered
	 */
	protected EList<TopClassD> multiRefClassD;

	/**
	 * The cached value of the '{@link #getMultiAttrString() <em>Multi Attr String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiAttrString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> multiAttrString;

	/**
	 * The cached value of the '{@link #getSingleNonContainClassM() <em>Single Non Contain Class M</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleNonContainClassM()
	 * @generated
	 * @ordered
	 */
	protected TopClassM singleNonContainClassM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReposRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RstPackage.Literals.REPOS_ROOT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.REPOS_ROOT__RAAS_REF, oldRaasRef, raasRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public String getSingleAttrString() {
		return singleAttrString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleAttrString(String newSingleAttrString) {
		String oldSingleAttrString = singleAttrString;
		singleAttrString = newSingleAttrString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.REPOS_ROOT__SINGLE_ATTR_STRING, oldSingleAttrString, singleAttrString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public EList<TopClassA> getMultiContainClassA() {
		if (multiContainClassA == null) {
			multiContainClassA = new EObjectContainmentEList<TopClassA>(TopClassA.class, this, RstPackage.REPOS_ROOT__MULTI_CONTAIN_CLASS_A);
		}
		return multiContainClassA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopClassB getOptionalContainClassB() {
		return optionalContainClassB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionalContainClassB(TopClassB newOptionalContainClassB, NotificationChain msgs) {
		TopClassB oldOptionalContainClassB = optionalContainClassB;
		optionalContainClassB = newOptionalContainClassB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RstPackage.REPOS_ROOT__OPTIONAL_CONTAIN_CLASS_B, oldOptionalContainClassB, newOptionalContainClassB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalContainClassB(TopClassB newOptionalContainClassB) {
		if (newOptionalContainClassB != optionalContainClassB) {
			NotificationChain msgs = null;
			if (optionalContainClassB != null)
				msgs = ((InternalEObject)optionalContainClassB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RstPackage.REPOS_ROOT__OPTIONAL_CONTAIN_CLASS_B, null, msgs);
			if (newOptionalContainClassB != null)
				msgs = ((InternalEObject)newOptionalContainClassB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RstPackage.REPOS_ROOT__OPTIONAL_CONTAIN_CLASS_B, null, msgs);
			msgs = basicSetOptionalContainClassB(newOptionalContainClassB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.REPOS_ROOT__OPTIONAL_CONTAIN_CLASS_B, newOptionalContainClassB, newOptionalContainClassB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public TopClassC getSingleContainClassC() {
		return singleContainClassC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleContainClassC(TopClassC newSingleContainClassC, NotificationChain msgs) {
		TopClassC oldSingleContainClassC = singleContainClassC;
		singleContainClassC = newSingleContainClassC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RstPackage.REPOS_ROOT__SINGLE_CONTAIN_CLASS_C, oldSingleContainClassC, newSingleContainClassC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleContainClassC(TopClassC newSingleContainClassC) {
		if (newSingleContainClassC != singleContainClassC) {
			NotificationChain msgs = null;
			if (singleContainClassC != null)
				msgs = ((InternalEObject)singleContainClassC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RstPackage.REPOS_ROOT__SINGLE_CONTAIN_CLASS_C, null, msgs);
			if (newSingleContainClassC != null)
				msgs = ((InternalEObject)newSingleContainClassC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RstPackage.REPOS_ROOT__SINGLE_CONTAIN_CLASS_C, null, msgs);
			msgs = basicSetSingleContainClassC(newSingleContainClassC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.REPOS_ROOT__SINGLE_CONTAIN_CLASS_C, newSingleContainClassC, newSingleContainClassC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(TopClassDRefAdapter.class)
	@XmlElement
	public EList<TopClassD> getMultiRefClassD() {
		if (multiRefClassD == null) {
			multiRefClassD = new EObjectResolvingEList<TopClassD>(TopClassD.class, this, RstPackage.REPOS_ROOT__MULTI_REF_CLASS_D);
		}
		return multiRefClassD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public EList<String> getMultiAttrString() {
		if (multiAttrString == null) {
			multiAttrString = new EDataTypeUniqueEList<String>(String.class, this, RstPackage.REPOS_ROOT__MULTI_ATTR_STRING);
		}
		return multiAttrString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(TopClassMRefAdapter.class)
	@XmlElement(required = true)
	public TopClassM getSingleNonContainClassM() {
		if (singleNonContainClassM != null && singleNonContainClassM.eIsProxy()) {
			InternalEObject oldSingleNonContainClassM = (InternalEObject)singleNonContainClassM;
			singleNonContainClassM = (TopClassM)eResolveProxy(oldSingleNonContainClassM);
			if (singleNonContainClassM != oldSingleNonContainClassM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RstPackage.REPOS_ROOT__SINGLE_NON_CONTAIN_CLASS_M, oldSingleNonContainClassM, singleNonContainClassM));
			}
		}
		return singleNonContainClassM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopClassM basicGetSingleNonContainClassM() {
		return singleNonContainClassM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleNonContainClassM(TopClassM newSingleNonContainClassM) {
		TopClassM oldSingleNonContainClassM = singleNonContainClassM;
		singleNonContainClassM = newSingleNonContainClassM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.REPOS_ROOT__SINGLE_NON_CONTAIN_CLASS_M, oldSingleNonContainClassM, singleNonContainClassM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RstPackage.REPOS_ROOT__MULTI_CONTAIN_CLASS_A:
				return ((InternalEList<?>)getMultiContainClassA()).basicRemove(otherEnd, msgs);
			case RstPackage.REPOS_ROOT__OPTIONAL_CONTAIN_CLASS_B:
				return basicSetOptionalContainClassB(null, msgs);
			case RstPackage.REPOS_ROOT__SINGLE_CONTAIN_CLASS_C:
				return basicSetSingleContainClassC(null, msgs);
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
			case RstPackage.REPOS_ROOT__RAAS_REF:
				return getRaasRef();
			case RstPackage.REPOS_ROOT__SINGLE_ATTR_STRING:
				return getSingleAttrString();
			case RstPackage.REPOS_ROOT__MULTI_CONTAIN_CLASS_A:
				return getMultiContainClassA();
			case RstPackage.REPOS_ROOT__OPTIONAL_CONTAIN_CLASS_B:
				return getOptionalContainClassB();
			case RstPackage.REPOS_ROOT__SINGLE_CONTAIN_CLASS_C:
				return getSingleContainClassC();
			case RstPackage.REPOS_ROOT__MULTI_REF_CLASS_D:
				return getMultiRefClassD();
			case RstPackage.REPOS_ROOT__MULTI_ATTR_STRING:
				return getMultiAttrString();
			case RstPackage.REPOS_ROOT__SINGLE_NON_CONTAIN_CLASS_M:
				if (resolve) return getSingleNonContainClassM();
				return basicGetSingleNonContainClassM();
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
			case RstPackage.REPOS_ROOT__RAAS_REF:
				setRaasRef((String)newValue);
				return;
			case RstPackage.REPOS_ROOT__SINGLE_ATTR_STRING:
				setSingleAttrString((String)newValue);
				return;
			case RstPackage.REPOS_ROOT__MULTI_CONTAIN_CLASS_A:
				getMultiContainClassA().clear();
				getMultiContainClassA().addAll((Collection<? extends TopClassA>)newValue);
				return;
			case RstPackage.REPOS_ROOT__OPTIONAL_CONTAIN_CLASS_B:
				setOptionalContainClassB((TopClassB)newValue);
				return;
			case RstPackage.REPOS_ROOT__SINGLE_CONTAIN_CLASS_C:
				setSingleContainClassC((TopClassC)newValue);
				return;
			case RstPackage.REPOS_ROOT__MULTI_REF_CLASS_D:
				getMultiRefClassD().clear();
				getMultiRefClassD().addAll((Collection<? extends TopClassD>)newValue);
				return;
			case RstPackage.REPOS_ROOT__MULTI_ATTR_STRING:
				getMultiAttrString().clear();
				getMultiAttrString().addAll((Collection<? extends String>)newValue);
				return;
			case RstPackage.REPOS_ROOT__SINGLE_NON_CONTAIN_CLASS_M:
				setSingleNonContainClassM((TopClassM)newValue);
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
			case RstPackage.REPOS_ROOT__RAAS_REF:
				setRaasRef(RAAS_REF_EDEFAULT);
				return;
			case RstPackage.REPOS_ROOT__SINGLE_ATTR_STRING:
				setSingleAttrString(SINGLE_ATTR_STRING_EDEFAULT);
				return;
			case RstPackage.REPOS_ROOT__MULTI_CONTAIN_CLASS_A:
				getMultiContainClassA().clear();
				return;
			case RstPackage.REPOS_ROOT__OPTIONAL_CONTAIN_CLASS_B:
				setOptionalContainClassB((TopClassB)null);
				return;
			case RstPackage.REPOS_ROOT__SINGLE_CONTAIN_CLASS_C:
				setSingleContainClassC((TopClassC)null);
				return;
			case RstPackage.REPOS_ROOT__MULTI_REF_CLASS_D:
				getMultiRefClassD().clear();
				return;
			case RstPackage.REPOS_ROOT__MULTI_ATTR_STRING:
				getMultiAttrString().clear();
				return;
			case RstPackage.REPOS_ROOT__SINGLE_NON_CONTAIN_CLASS_M:
				setSingleNonContainClassM((TopClassM)null);
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
			case RstPackage.REPOS_ROOT__RAAS_REF:
				return RAAS_REF_EDEFAULT == null ? raasRef != null : !RAAS_REF_EDEFAULT.equals(raasRef);
			case RstPackage.REPOS_ROOT__SINGLE_ATTR_STRING:
				return SINGLE_ATTR_STRING_EDEFAULT == null ? singleAttrString != null : !SINGLE_ATTR_STRING_EDEFAULT.equals(singleAttrString);
			case RstPackage.REPOS_ROOT__MULTI_CONTAIN_CLASS_A:
				return multiContainClassA != null && !multiContainClassA.isEmpty();
			case RstPackage.REPOS_ROOT__OPTIONAL_CONTAIN_CLASS_B:
				return optionalContainClassB != null;
			case RstPackage.REPOS_ROOT__SINGLE_CONTAIN_CLASS_C:
				return singleContainClassC != null;
			case RstPackage.REPOS_ROOT__MULTI_REF_CLASS_D:
				return multiRefClassD != null && !multiRefClassD.isEmpty();
			case RstPackage.REPOS_ROOT__MULTI_ATTR_STRING:
				return multiAttrString != null && !multiAttrString.isEmpty();
			case RstPackage.REPOS_ROOT__SINGLE_NON_CONTAIN_CLASS_M:
				return singleNonContainClassM != null;
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
		result.append(", singleAttrString: ");
		result.append(singleAttrString);
		result.append(", multiAttrString: ");
		result.append(multiAttrString);
		result.append(')');
		return result.toString();
	}

	public static ReposRootRef valueOf(String s) {
		ReposRootRef res = new ReposRootRef();
		res.setID(s);
		return res;
	}

} //ReposRootImpl
