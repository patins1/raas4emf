/**
 */
package restexample.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import restexample.GetAllPackagesRequest;
import restexample.RestexamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get All Packages Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@XmlType(name = "GetAllPackagesRequest")
@XmlRootElement(name = "GetAllPackagesRequestElement")
public class GetAllPackagesRequestImpl extends MinimalEObjectImpl.Container implements GetAllPackagesRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetAllPackagesRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestexamplePackage.Literals.GET_ALL_PACKAGES_REQUEST;
	}

} //GetAllPackagesRequestImpl
