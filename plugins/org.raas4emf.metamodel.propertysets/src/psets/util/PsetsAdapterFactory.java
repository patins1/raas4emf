/**
 */
package psets.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import psets.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see psets.PsetsPackage
 * @generated
 */
public class PsetsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PsetsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsetsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PsetsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PsetsSwitch<Adapter> modelSwitch =
		new PsetsSwitch<Adapter>() {
			@Override
			public Adapter caseIArtifact(IArtifact object) {
				return createIArtifactAdapter();
			}
			@Override
			public Adapter caseIPropertySet(IPropertySet object) {
				return createIPropertySetAdapter();
			}
			@Override
			public Adapter caseIProperty(IProperty object) {
				return createIPropertyAdapter();
			}
			@Override
			public Adapter caseIPropertyValue(IPropertyValue object) {
				return createIPropertyValueAdapter();
			}
			@Override
			public Adapter caseIDefaultValue(IDefaultValue object) {
				return createIDefaultValueAdapter();
			}
			@Override
			public Adapter caseIMinMaxValue(IMinMaxValue object) {
				return createIMinMaxValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link psets.IArtifact <em>IArtifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psets.IArtifact
	 * @generated
	 */
	public Adapter createIArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psets.IPropertySet <em>IProperty Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psets.IPropertySet
	 * @generated
	 */
	public Adapter createIPropertySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psets.IProperty <em>IProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psets.IProperty
	 * @generated
	 */
	public Adapter createIPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psets.IPropertyValue <em>IProperty Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psets.IPropertyValue
	 * @generated
	 */
	public Adapter createIPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psets.IDefaultValue <em>IDefault Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psets.IDefaultValue
	 * @generated
	 */
	public Adapter createIDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psets.IMinMaxValue <em>IMin Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psets.IMinMaxValue
	 * @generated
	 */
	public Adapter createIMinMaxValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PsetsAdapterFactory
