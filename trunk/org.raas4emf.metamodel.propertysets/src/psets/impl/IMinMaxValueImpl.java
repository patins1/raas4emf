/**
 */
package psets.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.ifc4emf.metamodel.ifc.samples.IFCComparer;

import psets.IMinMaxValue;
import psets.PsetsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>IMin Max Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link psets.impl.IMinMaxValueImpl#getMinValue <em>Min Value</em>}</li>
 * <li>{@link psets.impl.IMinMaxValueImpl#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class IMinMaxValueImpl extends IPropertyValueImpl implements IMinMaxValue {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IMinMaxValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsetsPackage.Literals.IMIN_MAX_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getMinValue() {
		return (String) eGet(PsetsPackage.Literals.IMIN_MAX_VALUE__MIN_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMinValue(String newMinValue) {
		eSet(PsetsPackage.Literals.IMIN_MAX_VALUE__MIN_VALUE, newMinValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getMaxValue() {
		return (String) eGet(PsetsPackage.Literals.IMIN_MAX_VALUE__MAX_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMaxValue(String newMaxValue) {
		eSet(PsetsPackage.Literals.IMIN_MAX_VALUE__MAX_VALUE, newMaxValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Double getMinNumber() {
		String value = IFCComparer.normalizeIfcValue(getMinValue());
		if (IFCComparer.isIfcNumber(value)) {
			return IFCComparer.asIfcNumber(value);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Double getMaxNumber() {
		String value = IFCComparer.normalizeIfcValue(getMaxValue());
		if (IFCComparer.isIfcNumber(value)) {
			return IFCComparer.asIfcNumber(value);
		}
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
		case PsetsPackage.IMIN_MAX_VALUE___GET_MIN_NUMBER:
			return getMinNumber();
		case PsetsPackage.IMIN_MAX_VALUE___GET_MAX_NUMBER:
			return getMaxNumber();
		}
		return super.eInvoke(operationID, arguments);
	}

	public String getDisplayValue() {
		return IFCComparer.normalizeIfcValue(getMinValue()) + ".." + IFCComparer.normalizeIfcValue(getMaxValue());
	}

} // IMinMaxValueImpl
