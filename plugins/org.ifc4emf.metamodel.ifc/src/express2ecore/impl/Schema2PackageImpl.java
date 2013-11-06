/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package express2ecore.impl;

import express2ecore.Express2ecorePackage;
import express2ecore.Schema2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.ifc4emf.metamodel.express.core.Schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema2 Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link express2ecore.impl.Schema2PackageImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link express2ecore.impl.Schema2PackageImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Schema2PackageImpl extends EObjectImpl implements Schema2Package {
	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected Schema schema;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schema2PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Express2ecorePackage.Literals.SCHEMA2_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		if (schema != null && schema.eIsProxy()) {
			InternalEObject oldSchema = (InternalEObject)schema;
			schema = (Schema)eResolveProxy(oldSchema);
			if (schema != oldSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Express2ecorePackage.SCHEMA2_PACKAGE__SCHEMA, oldSchema, schema));
			}
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		Schema oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Express2ecorePackage.SCHEMA2_PACKAGE__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (EPackage)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Express2ecorePackage.SCHEMA2_PACKAGE__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(EPackage newPackage) {
		EPackage oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Express2ecorePackage.SCHEMA2_PACKAGE__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Express2ecorePackage.SCHEMA2_PACKAGE__SCHEMA:
				if (resolve) return getSchema();
				return basicGetSchema();
			case Express2ecorePackage.SCHEMA2_PACKAGE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
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
			case Express2ecorePackage.SCHEMA2_PACKAGE__SCHEMA:
				setSchema((Schema)newValue);
				return;
			case Express2ecorePackage.SCHEMA2_PACKAGE__PACKAGE:
				setPackage((EPackage)newValue);
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
			case Express2ecorePackage.SCHEMA2_PACKAGE__SCHEMA:
				setSchema((Schema)null);
				return;
			case Express2ecorePackage.SCHEMA2_PACKAGE__PACKAGE:
				setPackage((EPackage)null);
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
			case Express2ecorePackage.SCHEMA2_PACKAGE__SCHEMA:
				return schema != null;
			case Express2ecorePackage.SCHEMA2_PACKAGE__PACKAGE:
				return package_ != null;
		}
		return super.eIsSet(featureID);
	}

} //Schema2PackageImpl
