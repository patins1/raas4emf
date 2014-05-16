/**
 */
package psets.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import psets.IProperty;
import psets.IPropertySet;
import psets.PsetsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>IProperty Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link psets.impl.IPropertySetImpl#getProperties <em>Properties</em>}</li>
 * <li>{@link psets.impl.IPropertySetImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class IPropertySetImpl extends CDOObjectImpl implements IPropertySet {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IPropertySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsetsPackage.Literals.IPROPERTY_SET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IProperty> getProperties() {
		return (EList<IProperty>) eGet(PsetsPackage.Literals.IPROPERTY_SET__PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return (String) eGet(PsetsPackage.Literals.IPROPERTY_SET__NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		eSet(PsetsPackage.Literals.IPROPERTY_SET__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IProperty createProperty(String propName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getApplicableClasses() {
		return new BasicEList<String>();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDefinition() {
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PsetsPackage.IPROPERTY_SET___CREATE_PROPERTY__STRING:
			return createProperty((String) arguments.get(0));
		case PsetsPackage.IPROPERTY_SET___GET_APPLICABLE_CLASSES:
			return getApplicableClasses();
		case PsetsPackage.IPROPERTY_SET___GET_DEFINITION:
			return getDefinition();
		}
		return super.eInvoke(operationID, arguments);
	}

} // IPropertySetImpl
