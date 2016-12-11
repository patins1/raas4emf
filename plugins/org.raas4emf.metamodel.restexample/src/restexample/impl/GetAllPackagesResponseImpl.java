/**
 */
package restexample.impl;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import restexample.GetAllPackagesResponse;
import restexample.RestexamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get All Packages Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restexample.impl.GetAllPackagesResponseImpl#getPackageURIs <em>Package UR Is</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "GetAllPackagesResponse")
@XmlRootElement(name = "GetAllPackagesResponseElement")
public class GetAllPackagesResponseImpl extends MinimalEObjectImpl.Container implements GetAllPackagesResponse {
	/**
	 * The cached value of the '{@link #getPackageURIs() <em>Package UR Is</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageURIs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> packageURIs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetAllPackagesResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestexamplePackage.Literals.GET_ALL_PACKAGES_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public EList<String> getPackageURIs() {
		if (packageURIs == null) {
			packageURIs = new EDataTypeUniqueEList<String>(String.class, this, RestexamplePackage.GET_ALL_PACKAGES_RESPONSE__PACKAGE_UR_IS);
		}
		return packageURIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestexamplePackage.GET_ALL_PACKAGES_RESPONSE__PACKAGE_UR_IS:
				return getPackageURIs();
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
			case RestexamplePackage.GET_ALL_PACKAGES_RESPONSE__PACKAGE_UR_IS:
				getPackageURIs().clear();
				getPackageURIs().addAll((Collection<? extends String>)newValue);
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
			case RestexamplePackage.GET_ALL_PACKAGES_RESPONSE__PACKAGE_UR_IS:
				getPackageURIs().clear();
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
			case RestexamplePackage.GET_ALL_PACKAGES_RESPONSE__PACKAGE_UR_IS:
				return packageURIs != null && !packageURIs.isEmpty();
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
		result.append(" (packageURIs: ");
		result.append(packageURIs);
		result.append(')');
		return result.toString();
	}

} //GetAllPackagesResponseImpl
