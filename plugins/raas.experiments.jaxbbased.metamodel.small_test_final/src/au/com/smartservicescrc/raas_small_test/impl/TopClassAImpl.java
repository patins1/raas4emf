/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.impl;

import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.TopClassA;
import au.com.smartservicescrc.raas_small_test.UnderClassE;
import au.com.smartservicescrc.raas_small_test.UnderClassF;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Class A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.TopClassAImpl#getRaasRef <em>Raas Ref</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.TopClassAImpl#getMultiContainClassE <em>Multi Contain Class E</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.impl.TopClassAImpl#getSingleContainClassF <em>Single Contain Class F</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlRootElement(name = "TopClassAElement")
@XmlType(name = "TopClassA")
public class TopClassAImpl extends EObjectImpl implements TopClassA {
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
	 * The cached value of the '{@link #getMultiContainClassE() <em>Multi Contain Class E</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiContainClassE()
	 * @generated
	 * @ordered
	 */
	protected EList<UnderClassE> multiContainClassE;

	/**
	 * The cached value of the '{@link #getSingleContainClassF() <em>Single Contain Class F</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleContainClassF()
	 * @generated
	 * @ordered
	 */
	protected UnderClassF singleContainClassF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopClassAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RstPackage.Literals.TOP_CLASS_A;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.TOP_CLASS_A__RAAS_REF, oldRaasRef, raasRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public EList<UnderClassE> getMultiContainClassE() {
		if (multiContainClassE == null) {
			multiContainClassE = new EObjectContainmentEList<UnderClassE>(UnderClassE.class, this, RstPackage.TOP_CLASS_A__MULTI_CONTAIN_CLASS_E);
		}
		return multiContainClassE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public UnderClassF getSingleContainClassF() {
		return singleContainClassF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleContainClassF(UnderClassF newSingleContainClassF, NotificationChain msgs) {
		UnderClassF oldSingleContainClassF = singleContainClassF;
		singleContainClassF = newSingleContainClassF;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RstPackage.TOP_CLASS_A__SINGLE_CONTAIN_CLASS_F, oldSingleContainClassF, newSingleContainClassF);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleContainClassF(UnderClassF newSingleContainClassF) {
		if (newSingleContainClassF != singleContainClassF) {
			NotificationChain msgs = null;
			if (singleContainClassF != null)
				msgs = ((InternalEObject)singleContainClassF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RstPackage.TOP_CLASS_A__SINGLE_CONTAIN_CLASS_F, null, msgs);
			if (newSingleContainClassF != null)
				msgs = ((InternalEObject)newSingleContainClassF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RstPackage.TOP_CLASS_A__SINGLE_CONTAIN_CLASS_F, null, msgs);
			msgs = basicSetSingleContainClassF(newSingleContainClassF, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RstPackage.TOP_CLASS_A__SINGLE_CONTAIN_CLASS_F, newSingleContainClassF, newSingleContainClassF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RstPackage.TOP_CLASS_A__MULTI_CONTAIN_CLASS_E:
				return ((InternalEList<?>)getMultiContainClassE()).basicRemove(otherEnd, msgs);
			case RstPackage.TOP_CLASS_A__SINGLE_CONTAIN_CLASS_F:
				return basicSetSingleContainClassF(null, msgs);
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
			case RstPackage.TOP_CLASS_A__RAAS_REF:
				return getRaasRef();
			case RstPackage.TOP_CLASS_A__MULTI_CONTAIN_CLASS_E:
				return getMultiContainClassE();
			case RstPackage.TOP_CLASS_A__SINGLE_CONTAIN_CLASS_F:
				return getSingleContainClassF();
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
			case RstPackage.TOP_CLASS_A__RAAS_REF:
				setRaasRef((String)newValue);
				return;
			case RstPackage.TOP_CLASS_A__MULTI_CONTAIN_CLASS_E:
				getMultiContainClassE().clear();
				getMultiContainClassE().addAll((Collection<? extends UnderClassE>)newValue);
				return;
			case RstPackage.TOP_CLASS_A__SINGLE_CONTAIN_CLASS_F:
				setSingleContainClassF((UnderClassF)newValue);
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
			case RstPackage.TOP_CLASS_A__RAAS_REF:
				setRaasRef(RAAS_REF_EDEFAULT);
				return;
			case RstPackage.TOP_CLASS_A__MULTI_CONTAIN_CLASS_E:
				getMultiContainClassE().clear();
				return;
			case RstPackage.TOP_CLASS_A__SINGLE_CONTAIN_CLASS_F:
				setSingleContainClassF((UnderClassF)null);
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
			case RstPackage.TOP_CLASS_A__RAAS_REF:
				return RAAS_REF_EDEFAULT == null ? raasRef != null : !RAAS_REF_EDEFAULT.equals(raasRef);
			case RstPackage.TOP_CLASS_A__MULTI_CONTAIN_CLASS_E:
				return multiContainClassE != null && !multiContainClassE.isEmpty();
			case RstPackage.TOP_CLASS_A__SINGLE_CONTAIN_CLASS_F:
				return singleContainClassF != null;
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

} //TopClassAImpl
