/**
 */
package restexample.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import restexample.GetAllClassesRequest;
import restexample.RestexamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get All Classes Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restexample.impl.GetAllClassesRequestImpl#getPackageURI <em>Package URI</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "GetAllClassesRequest")
@XmlRootElement(name = "GetAllClassesRequestElement")
public class GetAllClassesRequestImpl extends MinimalEObjectImpl.Container implements GetAllClassesRequest {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetAllClassesRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestexamplePackage.Literals.GET_ALL_CLASSES_REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestexamplePackage.GET_ALL_CLASSES_REQUEST__PACKAGE_URI, oldPackageURI, packageURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestexamplePackage.GET_ALL_CLASSES_REQUEST__PACKAGE_URI:
				return getPackageURI();
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
			case RestexamplePackage.GET_ALL_CLASSES_REQUEST__PACKAGE_URI:
				setPackageURI((String)newValue);
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
			case RestexamplePackage.GET_ALL_CLASSES_REQUEST__PACKAGE_URI:
				setPackageURI(PACKAGE_URI_EDEFAULT);
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
			case RestexamplePackage.GET_ALL_CLASSES_REQUEST__PACKAGE_URI:
				return PACKAGE_URI_EDEFAULT == null ? packageURI != null : !PACKAGE_URI_EDEFAULT.equals(packageURI);
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
		result.append(" (packageURI: ");
		result.append(packageURI);
		result.append(')');
		return result.toString();
	}

} //GetAllClassesRequestImpl
