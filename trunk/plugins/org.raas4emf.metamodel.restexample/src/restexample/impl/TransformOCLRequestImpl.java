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
import restexample.TransformOCLRequest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform OCL Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restexample.impl.TransformOCLRequestImpl#getOclText <em>Ocl Text</em>}</li>
 *   <li>{@link restexample.impl.TransformOCLRequestImpl#getPackageURI <em>Package URI</em>}</li>
 *   <li>{@link restexample.impl.TransformOCLRequestImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "TransformOCLRequest")
@XmlRootElement(name = "TransformOCLRequestElement")
public class TransformOCLRequestImpl extends MinimalEObjectImpl.Container implements TransformOCLRequest {
	/**
	 * The default value of the '{@link #getOclText() <em>Ocl Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclText()
	 * @generated
	 * @ordered
	 */
	protected static final String OCL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOclText() <em>Ocl Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclText()
	 * @generated
	 * @ordered
	 */
	protected String oclText = OCL_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageURI() <em>Package URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageURI()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageURI() <em>Package URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageURI()
	 * @generated
	 * @ordered
	 */
	protected String packageURI = PACKAGE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformOCLRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestexamplePackage.Literals.TRANSFORM_OCL_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOclText() {
		return oclText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOclText(String newOclText) {
		String oldOclText = oclText;
		oclText = newOclText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestexamplePackage.TRANSFORM_OCL_REQUEST__OCL_TEXT, oldOclText, oclText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageURI() {
		return packageURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageURI(String newPackageURI) {
		String oldPackageURI = packageURI;
		packageURI = newPackageURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestexamplePackage.TRANSFORM_OCL_REQUEST__PACKAGE_URI, oldPackageURI, packageURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestexamplePackage.TRANSFORM_OCL_REQUEST__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestexamplePackage.TRANSFORM_OCL_REQUEST__OCL_TEXT:
				return getOclText();
			case RestexamplePackage.TRANSFORM_OCL_REQUEST__PACKAGE_URI:
				return getPackageURI();
			case RestexamplePackage.TRANSFORM_OCL_REQUEST__CLASS_NAME:
				return getClassName();
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
			case RestexamplePackage.TRANSFORM_OCL_REQUEST__OCL_TEXT:
				setOclText((String)newValue);
				return;
			case RestexamplePackage.TRANSFORM_OCL_REQUEST__PACKAGE_URI:
				setPackageURI((String)newValue);
				return;
			case RestexamplePackage.TRANSFORM_OCL_REQUEST__CLASS_NAME:
				setClassName((String)newValue);
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
			case RestexamplePackage.TRANSFORM_OCL_REQUEST__OCL_TEXT:
				setOclText(OCL_TEXT_EDEFAULT);
				return;
			case RestexamplePackage.TRANSFORM_OCL_REQUEST__PACKAGE_URI:
				setPackageURI(PACKAGE_URI_EDEFAULT);
				return;
			case RestexamplePackage.TRANSFORM_OCL_REQUEST__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
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
			case RestexamplePackage.TRANSFORM_OCL_REQUEST__OCL_TEXT:
				return OCL_TEXT_EDEFAULT == null ? oclText != null : !OCL_TEXT_EDEFAULT.equals(oclText);
			case RestexamplePackage.TRANSFORM_OCL_REQUEST__PACKAGE_URI:
				return PACKAGE_URI_EDEFAULT == null ? packageURI != null : !PACKAGE_URI_EDEFAULT.equals(packageURI);
			case RestexamplePackage.TRANSFORM_OCL_REQUEST__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
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
		result.append(" (oclText: ");
		result.append(oclText);
		result.append(", packageURI: ");
		result.append(packageURI);
		result.append(", className: ");
		result.append(className);
		result.append(')');
		return result.toString();
	}

} //TransformOCLRequestImpl
