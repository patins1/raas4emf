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

import restexample.GetAllClassesResponse;
import restexample.RestexamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get All Classes Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restexample.impl.GetAllClassesResponseImpl#getClassNames <em>Class Names</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "GetAllClassesResponse")
@XmlRootElement(name = "GetAllClassesResponseElement")
public class GetAllClassesResponseImpl extends MinimalEObjectImpl.Container implements GetAllClassesResponse {
	/**
	 * The cached value of the '{@link #getClassNames() <em>Class Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetAllClassesResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestexamplePackage.Literals.GET_ALL_CLASSES_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public EList<String> getClassNames() {
		if (classNames == null) {
			classNames = new EDataTypeUniqueEList<String>(String.class, this, RestexamplePackage.GET_ALL_CLASSES_RESPONSE__CLASS_NAMES);
		}
		return classNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestexamplePackage.GET_ALL_CLASSES_RESPONSE__CLASS_NAMES:
				return getClassNames();
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
			case RestexamplePackage.GET_ALL_CLASSES_RESPONSE__CLASS_NAMES:
				getClassNames().clear();
				getClassNames().addAll((Collection<? extends String>)newValue);
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
			case RestexamplePackage.GET_ALL_CLASSES_RESPONSE__CLASS_NAMES:
				getClassNames().clear();
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
			case RestexamplePackage.GET_ALL_CLASSES_RESPONSE__CLASS_NAMES:
				return classNames != null && !classNames.isEmpty();
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
		result.append(" (classNames: ");
		result.append(classNames);
		result.append(')');
		return result.toString();
	}

} //GetAllClassesResponseImpl
