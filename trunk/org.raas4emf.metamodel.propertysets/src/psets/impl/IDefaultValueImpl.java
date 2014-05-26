/**
 */
package psets.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.ifc4emf.metamodel.ifc.samples.IFCComparer;

import psets.IDefaultValue;
import psets.PsetsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>IDefault Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link psets.impl.IDefaultValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IDefaultValueImpl extends IPropertyValueImpl implements IDefaultValue {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IDefaultValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsetsPackage.Literals.IDEFAULT_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(PsetsPackage.Literals.IDEFAULT_VALUE__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(PsetsPackage.Literals.IDEFAULT_VALUE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Double getNumber() {
		String value = IFCComparer.normalizeIfcValue(getValue());
		if (IFCComparer.isIfcNumber(value)) {
			return IFCComparer.asIfcNumber(getValue());
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PsetsPackage.IDEFAULT_VALUE___GET_NUMBER:
				return getNumber();
		}
		return super.eInvoke(operationID, arguments);
	}

	public String getDisplayValue() {
		return IFCComparer.normalizeIfcValue(getValue());
	}

} // IDefaultValueImpl
