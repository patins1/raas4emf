/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package express2ecore.util;

import express2ecore.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see express2ecore.Express2ecorePackage
 * @generated
 */
public class Express2ecoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Express2ecorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Express2ecoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Express2ecorePackage.eINSTANCE;
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
	protected Express2ecoreSwitch<Adapter> modelSwitch =
		new Express2ecoreSwitch<Adapter>() {
			@Override
			public Adapter caseTypeMap(TypeMap object) {
				return createTypeMapAdapter();
			}
			@Override
			public Adapter caseEntity2Class(Entity2Class object) {
				return createEntity2ClassAdapter();
			}
			@Override
			public Adapter caseSchema2Package(Schema2Package object) {
				return createSchema2PackageAdapter();
			}
			@Override
			public Adapter caseAttribute2Feature(Attribute2Feature object) {
				return createAttribute2FeatureAdapter();
			}
			@Override
			public Adapter caseAttribute2Reference(Attribute2Reference object) {
				return createAttribute2ReferenceAdapter();
			}
			@Override
			public Adapter caseAttribute2Attribute(Attribute2Attribute object) {
				return createAttribute2AttributeAdapter();
			}
			@Override
			public Adapter caseEntitySelect(EntitySelect object) {
				return createEntitySelectAdapter();
			}
			@Override
			public Adapter caseNonEntitySelect(NonEntitySelect object) {
				return createNonEntitySelectAdapter();
			}
			@Override
			public Adapter caseSelectMember2Feature(SelectMember2Feature object) {
				return createSelectMember2FeatureAdapter();
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
	 * Creates a new adapter for an object of class '{@link express2ecore.TypeMap <em>Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see express2ecore.TypeMap
	 * @generated
	 */
	public Adapter createTypeMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link express2ecore.Entity2Class <em>Entity2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see express2ecore.Entity2Class
	 * @generated
	 */
	public Adapter createEntity2ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link express2ecore.Schema2Package <em>Schema2 Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see express2ecore.Schema2Package
	 * @generated
	 */
	public Adapter createSchema2PackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link express2ecore.Attribute2Feature <em>Attribute2 Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see express2ecore.Attribute2Feature
	 * @generated
	 */
	public Adapter createAttribute2FeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link express2ecore.Attribute2Reference <em>Attribute2 Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see express2ecore.Attribute2Reference
	 * @generated
	 */
	public Adapter createAttribute2ReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link express2ecore.Attribute2Attribute <em>Attribute2 Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see express2ecore.Attribute2Attribute
	 * @generated
	 */
	public Adapter createAttribute2AttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link express2ecore.EntitySelect <em>Entity Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see express2ecore.EntitySelect
	 * @generated
	 */
	public Adapter createEntitySelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link express2ecore.NonEntitySelect <em>Non Entity Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see express2ecore.NonEntitySelect
	 * @generated
	 */
	public Adapter createNonEntitySelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link express2ecore.SelectMember2Feature <em>Select Member2 Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see express2ecore.SelectMember2Feature
	 * @generated
	 */
	public Adapter createSelectMember2FeatureAdapter() {
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

} //Express2ecoreAdapterFactory
