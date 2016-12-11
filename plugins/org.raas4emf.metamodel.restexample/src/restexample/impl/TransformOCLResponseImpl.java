/**
 */
package restexample.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import restexample.RestexamplePackage;
import restexample.TransformOCLResponse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform OCL Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restexample.impl.TransformOCLResponseImpl#getJavaText <em>Java Text</em>}</li>
 *   <li>{@link restexample.impl.TransformOCLResponseImpl#getXpathText <em>Xpath Text</em>}</li>
 *   <li>{@link restexample.impl.TransformOCLResponseImpl#getCsharpText <em>Csharp Text</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "TransformOCLResponse")
@XmlRootElement(name = "TransformOCLResponseElement")
public class TransformOCLResponseImpl extends MinimalEObjectImpl.Container implements TransformOCLResponse {
	/**
	 * The default value of the '{@link #getJavaText() <em>Java Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaText()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaText() <em>Java Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaText()
	 * @generated
	 * @ordered
	 */
	protected String javaText = JAVA_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXpathText() <em>Xpath Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpathText()
	 * @generated
	 * @ordered
	 */
	protected static final String XPATH_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXpathText() <em>Xpath Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpathText()
	 * @generated
	 * @ordered
	 */
	protected String xpathText = XPATH_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsharpText() <em>Csharp Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsharpText()
	 * @generated
	 * @ordered
	 */
	protected static final String CSHARP_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsharpText() <em>Csharp Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsharpText()
	 * @generated
	 * @ordered
	 */
	protected String csharpText = CSHARP_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformOCLResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestexamplePackage.Literals.TRANSFORM_OCL_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaText() {
		return javaText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaText(String newJavaText) {
		String oldJavaText = javaText;
		javaText = newJavaText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestexamplePackage.TRANSFORM_OCL_RESPONSE__JAVA_TEXT, oldJavaText, javaText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXpathText() {
		return xpathText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpathText(String newXpathText) {
		String oldXpathText = xpathText;
		xpathText = newXpathText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestexamplePackage.TRANSFORM_OCL_RESPONSE__XPATH_TEXT, oldXpathText, xpathText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsharpText() {
		return csharpText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsharpText(String newCsharpText) {
		String oldCsharpText = csharpText;
		csharpText = newCsharpText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestexamplePackage.TRANSFORM_OCL_RESPONSE__CSHARP_TEXT, oldCsharpText, csharpText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE__JAVA_TEXT:
				return getJavaText();
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE__XPATH_TEXT:
				return getXpathText();
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE__CSHARP_TEXT:
				return getCsharpText();
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
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE__JAVA_TEXT:
				setJavaText((String)newValue);
				return;
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE__XPATH_TEXT:
				setXpathText((String)newValue);
				return;
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE__CSHARP_TEXT:
				setCsharpText((String)newValue);
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
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE__JAVA_TEXT:
				setJavaText(JAVA_TEXT_EDEFAULT);
				return;
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE__XPATH_TEXT:
				setXpathText(XPATH_TEXT_EDEFAULT);
				return;
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE__CSHARP_TEXT:
				setCsharpText(CSHARP_TEXT_EDEFAULT);
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
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE__JAVA_TEXT:
				return JAVA_TEXT_EDEFAULT == null ? javaText != null : !JAVA_TEXT_EDEFAULT.equals(javaText);
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE__XPATH_TEXT:
				return XPATH_TEXT_EDEFAULT == null ? xpathText != null : !XPATH_TEXT_EDEFAULT.equals(xpathText);
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE__CSHARP_TEXT:
				return CSHARP_TEXT_EDEFAULT == null ? csharpText != null : !CSHARP_TEXT_EDEFAULT.equals(csharpText);
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
		result.append(" (javaText: ");
		result.append(javaText);
		result.append(", xpathText: ");
		result.append(xpathText);
		result.append(", csharpText: ");
		result.append(csharpText);
		result.append(')');
		return result.toString();
	}

} //TransformOCLResponseImpl
