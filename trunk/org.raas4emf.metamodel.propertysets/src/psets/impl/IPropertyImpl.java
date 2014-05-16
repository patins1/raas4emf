/**
 */
package psets.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import psets.IDefaultValue;
import psets.IMinMaxValue;
import psets.IProperty;
import psets.IPropertySet;
import psets.IPropertyValue;
import psets.PsetsFactory;
import psets.PsetsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>IProperty</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link psets.impl.IPropertyImpl#getPropertyValues <em>Property Values</em>}</li>
 * <li>{@link psets.impl.IPropertyImpl#getLodVisibility <em>Lod Visibility</em>}</li>
 * <li>{@link psets.impl.IPropertyImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class IPropertyImpl extends CDOObjectImpl implements IProperty {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsetsPackage.Literals.IPROPERTY;
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
	public EList<IPropertyValue> getPropertyValues() {
		return (EList<IPropertyValue>) eGet(PsetsPackage.Literals.IPROPERTY__PROPERTY_VALUES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getLodVisibility() {
		return (Integer) eGet(PsetsPackage.Literals.IPROPERTY__LOD_VISIBILITY, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLodVisibility(int newLodVisibility) {
		eSet(PsetsPackage.Literals.IPROPERTY__LOD_VISIBILITY, newLodVisibility);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return (String) eGet(PsetsPackage.Literals.IPROPERTY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		eSet(PsetsPackage.Literals.IPROPERTY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFullName() {
		IPropertySet pset = (IPropertySet) eContainer();
		return pset.getName() + "." + this.getName();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void cleanUp() {
		// do nothing
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSimpleType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getEnumerationLiterals() {
		return new BasicEList<String>();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValue(String value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTypeInfo() {
		return null;
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
	public void removePropertyValue(int index) {
		getPropertyValues().remove(index);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IDefaultValue addDefaultValue(int index) {
		IDefaultValue defaultValue = PsetsFactory.eINSTANCE.createIDefaultValue();
		defaultValue.setValue("");
		getPropertyValues().add(index, defaultValue);
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IMinMaxValue addMinMaxValue(int index) {
		IMinMaxValue minMaxValue = PsetsFactory.eINSTANCE.createIMinMaxValue();
		minMaxValue.setMinValue("0.0");
		minMaxValue.setMaxValue("0.0");
		getPropertyValues().add(index, minMaxValue);
		return minMaxValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PsetsPackage.IPROPERTY___GET_FULL_NAME:
			return getFullName();
		case PsetsPackage.IPROPERTY___CLEAN_UP:
			cleanUp();
			return null;
		case PsetsPackage.IPROPERTY___GET_SIMPLE_TYPE:
			return getSimpleType();
		case PsetsPackage.IPROPERTY___GET_ENUMERATION_LITERALS:
			return getEnumerationLiterals();
		case PsetsPackage.IPROPERTY___SET_VALUE__STRING:
			setValue((String) arguments.get(0));
			return null;
		case PsetsPackage.IPROPERTY___GET_TYPE_INFO:
			return getTypeInfo();
		case PsetsPackage.IPROPERTY___GET_DEFINITION:
			return getDefinition();
		case PsetsPackage.IPROPERTY___REMOVE_PROPERTY_VALUE__INT:
			removePropertyValue((Integer) arguments.get(0));
			return null;
		case PsetsPackage.IPROPERTY___ADD_DEFAULT_VALUE__INT:
			return addDefaultValue((Integer) arguments.get(0));
		case PsetsPackage.IPROPERTY___ADD_MIN_MAX_VALUE__INT:
			return addMinMaxValue((Integer) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // IPropertyImpl
